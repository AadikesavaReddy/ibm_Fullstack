package Activity;

import java.net.StandardSocketOptions;
import java.util.HashMap;
import java.util.Map;

public class mapProgram {
    public static void main(String[] args) {
        Map<Integer, String> color = new HashMap<>();
            color.put(1, "Yellow");
            color.put(2, "Green");
            color.put(3, "Blue");
            color.put(4, "Black");
            color.put(5, "Gold");
            System.out.println(color);
            System.out.println(color.remove(4));
            if(color.containsValue("Green")){
                System.out.println("Exist");
            } else {
                System.out.println("Does not exist");
            }
            System.out.println(color.size());
    }
}
