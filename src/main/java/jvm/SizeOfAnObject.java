package jvm;



public class SizeOfAnObject {
    private static ObjectSizeUtil ObjectSizeCalculator;

    public static void main(String[] args) {

        System.out.println(ObjectSizeCalculator.getObjectSize(new Object()));
        System.out.println(ObjectSizeCalculator.getObjectSize(new int[]{}));
        System.out.println(ObjectSizeCalculator.getObjectSize(new P()));
        System.out.println(ObjectSizeUtil.getDeepObjectSize(new int[]{}));
    }

    //一个Object 占多少个字节
    //-XX:+UserCompressedClassPointers -XX:+UserCompressedOops
    //Oop = ordinary object pointers
    private static class P {
        // java -XX:+PrintCommandLineFlags -version
        //8 _markword
        //4 _class_pointer
        //0 _instance_data
        //4 _paddinng


    }
}
