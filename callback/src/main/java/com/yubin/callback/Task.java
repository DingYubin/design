package com.yubin.callback;

import java.util.Optional;

/**
 * 执行回调，模板方法类
 */
public abstract class Task {
    /**
     * 执行 callback
     */
    final void executeWith(Callback callback) {
        execute();

        Optional.ofNullable(callback).ifPresent(Callback::call);
    }

    public abstract void execute();
}
