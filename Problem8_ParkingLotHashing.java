import java.util.*;

public class Problem8_ParkingLotHashing {

    static HashMap<String,Integer> parking=new HashMap<>();
    static int spot=1;

    public static void park(String plate){

        parking.put(plate,spot);
        System.out.println("Vehicle "+plate+" parked at "+spot);
        spot++;
    }

    public static void main(String[] args){

        park("ABC123");
        park("XYZ999");
    }
}