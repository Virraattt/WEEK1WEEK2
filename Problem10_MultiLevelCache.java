import java.util.*;

public class Problem10_MultiLevelCache {

    static HashMap<String,String> L1=new HashMap<>();
    static HashMap<String,String> L2=new HashMap<>();

    public static String getVideo(String id){

        if(L1.containsKey(id))
            return "L1 HIT";

        if(L2.containsKey(id)){
            L1.put(id,L2.get(id));
            return "L2 HIT -> promoted to L1";
        }

        L2.put(id,"VideoData");
        return "Database HIT";
    }

    public static void main(String[] args){

        System.out.println(getVideo("video1"));
        System.out.println(getVideo("video1"));
    }
}