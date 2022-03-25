package com.yubin.callback;

import lombok.extern.slf4j.Slf4j;

/**
 * 对于函数被视为一等公民的函数式语言，回调模式更为原生。在 Java 8 之前，可以使用简单（类似命令）接口模拟回调
 */
@Slf4j
public class App {

    private App() {

    }

    /**
     * 程序入口
     */
    public static void main(final String[] args) {
        var task = new SimpleTask();
        task.executeWith(()-> LOGGER.info("我现在执行..."));
    }
}
