package thread.trans.demo3_1;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    volatile private List list = new ArrayList();
    public void add(){
        list.add("yubin.ding");
    }
    public int size(){
        return list.size();
    }
}
