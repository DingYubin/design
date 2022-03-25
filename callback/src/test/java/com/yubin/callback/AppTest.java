package com.yubin.callback;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 问题：向此测试用例添加至少一个断言。
 * 解决方法：插入断言检查App中main方法的执行是否抛出异常
 */
class AppTest {

    @Test
    void shouldExecuteApplicationWithoutException() {

        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}