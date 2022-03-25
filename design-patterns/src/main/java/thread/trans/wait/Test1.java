package thread.trans.wait;

public class Test1 {
    public static void main(String[] args) {
        try {
            String newString = new String("");
            newString.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
