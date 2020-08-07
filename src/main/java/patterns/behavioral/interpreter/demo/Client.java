package patterns.behavioral.interpreter.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator cal = new Calculator(expStr);
        System.out.println("运算结果为："+expStr+"="+cal.run(var));
    }

    public static String getExpStr() {
        System.out.println("请输入表达式：");
        try {
            return (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "-1";
        }
    }

    public static HashMap<String, Integer> getValue(String expStr){
        HashMap<String,Integer> map = new HashMap<String, Integer> ();
        for (char ch : expStr.toCharArray()){
            if (ch !='+' && ch != '-'){
                if (!map.containsKey(String.valueOf(ch))){
                    try {
                        String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                        map.put(String.valueOf(ch), Integer.valueOf(in));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return map;
    }
}
