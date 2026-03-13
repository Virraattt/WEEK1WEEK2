import java.util.*;

public class Problem7_AutocompleteSystem {

    static HashMap<String,Integer> queries=new HashMap<>();

    public static void search(String q){

        for(String key:queries.keySet()){
            if(key.startsWith(q))
                System.out.println(key);
        }
    }

    public static void main(String[] args){

        queries.put("java tutorial",100);
        queries.put("javascript guide",80);
        queries.put("java download",60);

        search("jav");
    }
}