package com.yubin.callback;

import lombok.extern.slf4j.Slf4j;

/**
 * 执行操作
 */
@Slf4j
public final class SimpleTask extends Task {

    @Override
    public void execute() {
        LOGGER.info("执行一些重要的活动，然后调用回调方法。");
    }
}
