package Activity;

import java.util.ArrayList;

public class collect {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Aadi");
        myList.add("Kohli");
        myList.add("Iron Man");
        myList.add("Spider Man");
        myList.add("Black Adam");
        System.out.println(myList);
        for (String s : myList){
            System.out.println(s);
        }
        System.out.println(myList.get(3));
        System.out.println(myList.contains("Raju"));
        System.out.println(myList.size());
        myList.remove("Kohli");
        System.out.println(myList.size());
    }
}
