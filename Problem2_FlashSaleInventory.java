import java.util.*;

public class Problem2_FlashSaleInventory {

    static HashMap<String,Integer> inventory = new HashMap<>();
    static Queue<Integer> waitingList = new LinkedList<>();

    public static void checkStock(String product){
        System.out.println(product+" stock: "+inventory.get(product));
    }

    public static void purchaseItem(String product, int userId){

        int stock = inventory.get(product);

        if(stock>0){
            inventory.put(product,stock-1);
            System.out.println("User "+userId+" purchase successful. Remaining: "+(stock-1));
        }
        else{
            waitingList.add(userId);
            System.out.println("Stock finished. User "+userId+" added to waiting list position "+waitingList.size());
        }
    }

    public static void main(String[] args){

        inventory.put("IPHONE15",5);

        checkStock("IPHONE15");

        purchaseItem("IPHONE15",101);
        purchaseItem("IPHONE15",102);
        purchaseItem("IPHONE15",103);
        purchaseItem("IPHONE15",104);
        purchaseItem("IPHONE15",105);
        purchaseItem("IPHONE15",106);
    }
}