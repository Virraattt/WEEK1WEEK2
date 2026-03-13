import java.util.*;

public class Problem4_PlagiarismDetector {

    public static Set<String> getWords(String text){

        String[] words = text.split(" ");
        return new HashSet<>(Arrays.asList(words));
    }

    public static void main(String[] args){

        String doc1="java programming language is powerful";
        String doc2="java programming language is easy";

        Set<String> set1=getWords(doc1);
        Set<String> set2=getWords(doc2);

        set1.retainAll(set2);

        System.out.println("Matching words: "+set1);
    }
}