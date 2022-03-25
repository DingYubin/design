package com.yubin.state;

/**
 * 在状态模式中，容器对象具有定义当前行为的内部状态对象。可以更改状态对象以改变行为。
 * <p>对于对象来说，这是一种更简洁的方法，可以在运行时更改其行为，而无需求助于大型单一条件语句，从而提高了可维护性。
 * <p>在这个例子中，{@link Mammoth} 随着时间的推移会改变它的行为。
 */
public class App {

    /**
     * 程序入口
     */
    public static void main(String[] args) {

        var mammoth = new Mammoth();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
    }
}
