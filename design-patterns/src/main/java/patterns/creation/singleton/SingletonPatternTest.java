package patterns.creation.singleton;

import patterns.creation.singleton.demo.Singleton1;

public class SingletonPatternTest {

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.showMessage();
    }

}
