package algorithm;

import java.util.ArrayList;
import java.util.List;

public class WifiConnect {

    public static List<Integer> getList(WifiChange wifiChange){

        return WifiChange.LIST;
    }

    public static abstract class WifiChange {
        public static final List<Integer> LIST = new ArrayList<>();

        static {
            System.out.println("list add");
            LIST.add(11);
            System.out.println("list end");
        }
    }
}
