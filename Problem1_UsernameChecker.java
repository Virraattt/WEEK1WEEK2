import java.util.*;

public class Problem1_UsernameChecker {

    static HashMap<String, Integer> users = new HashMap<>();
    static HashMap<String, Integer> attempts = new HashMap<>();

    public static boolean checkAvailability(String username) {

        attempts.put(username, attempts.getOrDefault(username, 0) + 1);

        if(users.containsKey(username))
            return false;
        else
            return true;
    }

    public static List<String> suggestAlternatives(String username){

        List<String> suggestions = new ArrayList<>();

        suggestions.add(username + "1");
        suggestions.add(username + "2");
        suggestions.add(username.replace("_","."));

        return suggestions;
    }

    public static String getMostAttempted(){

        String result="";
        int max=0;

        for(String key : attempts.keySet()){

            if(attempts.get(key) > max){
                max = attempts.get(key);
                result = key;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        users.put("john_doe",1);
        users.put("admin",2);

        String username = "john_doe";

        if(checkAvailability(username))
            System.out.println("Username Available");
        else{
            System.out.println("Username Taken");
            System.out.println("Suggestions: "+suggestAlternatives(username));
        }

        System.out.println("Most attempted username: "+getMostAttempted());
    }
}