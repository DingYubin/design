package sort;

import java.text.SimpleDateFormat;
import java.util.*;

public class ListSort {

    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<People>(5);

        peopleList.add(new People("小明", "2020-12-08"));
        peopleList.add(new People("小明", "2020-12-10"));
        peopleList.add(new People("小明", "2020-12-09"));

        sort(peopleList);
        for (People people : peopleList){
            System.out.println(people.toString());
        }
    }


    private static void sort(List<People> list) {
        {    //排序方法
            Collections.sort(list, new Comparator<People>() {
                @Override
                public int compare(People o1, People o2) {
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        // format.format(o1.getDate()) 表示 date转string类型 如果是string类型就不要转换了
                        Date dt1 = format.parse(o1.getDate());
                        Date dt2 = format.parse(o2.getDate());
                        // 这是由大向小排序   如果要由小向大转换比较符号就可以
                        if (dt1.getTime() < dt2.getTime()) {
                            return 1;
                        } else if (dt1.getTime() > dt2.getTime()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return 0;
                }

            });
        }

    }
}