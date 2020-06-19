package patterns.creation.builder;

import patterns.creation.builder.constructor.ConstructorArg;

public class BuilderTest {
    /**
     * 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
     * @param args
     */
    public static void main(String[] args) {
//        Director director = new Director();
//        director.getAProduct().doSomething();

        ConstructorArg arg = ConstructorArg.newBuilder().isRef(false)
                .type(BuilderTest.class)
                .arg("builder模式")
                .build();

        System.out.println(arg.getArg());
    }
}
