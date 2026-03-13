import java.util.*;

public class Problem6_RateLimiter {

    static HashMap<String,Integer> requests=new HashMap<>();
    static int LIMIT=5;

    public static void check(String client){

        int count=requests.getOrDefault(client,0);

        if(count>=LIMIT){
            System.out.println("Rate limit exceeded");
        }
        else{
            requests.put(client,count+1);
            System.out.println("Request allowed");
        }
    }

    public static void main(String[] args){

        for(int i=0;i<7;i++)
            check("client1");
    }
}