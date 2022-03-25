package com.yubin.callback;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 添加一个字段作为计数器。每次调用回调方法时都会增加此字段。单元测试检查该字段是否正在递增。
 * 也可以在验证调用方法调用的地方使用模拟对象来完成
 */
class CallbackTest {
    private Integer callingCount = 0;

    @Test
    void test() {
        Callback callback = ()-> callingCount++;

        var task = new SimpleTask();

        assertEquals(Integer.valueOf(0), callingCount, "Initial calling count of 0");

        task.executeWith(callback);

        assertEquals(Integer.valueOf(1), callingCount, "Callback called once");

        task.executeWith(callback);

        assertEquals(Integer.valueOf(2), callingCount, "Callback called twice");

    }
}