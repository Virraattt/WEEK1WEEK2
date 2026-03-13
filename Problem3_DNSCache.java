import java.util.*;

class DNSEntry{
    String ip;
    long expiry;

    DNSEntry(String ip,long ttl){
        this.ip = ip;
        this.expiry = System.currentTimeMillis()+ttl;
    }
}

public class Problem3_DNSCache {

    static HashMap<String,DNSEntry> cache = new HashMap<>();

    public static String resolve(String domain){

        DNSEntry entry = cache.get(domain);

        if(entry!=null && entry.expiry>System.currentTimeMillis()){
            return "Cache HIT: "+entry.ip;
        }

        String ip="172.217.14."+new Random().nextInt(255);

        cache.put(domain,new DNSEntry(ip,5000));

        return "Cache MISS. New IP "+ip;
    }

    public static void main(String[] args){

        System.out.println(resolve("google.com"));
        System.out.println(resolve("google.com"));
    }
}