import java.util.*;

public class Problem5_AnalyticsDashboard {

    static HashMap<String,Integer> pageViews=new HashMap<>();

    public static void processEvent(String page){

        pageViews.put(page,pageViews.getOrDefault(page,0)+1);
    }

    public static void main(String[] args){

        processEvent("/news");
        processEvent("/sports");
        processEvent("/news");

        System.out.println("Page views: "+pageViews);
    }
}