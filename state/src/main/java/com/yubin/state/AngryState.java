package com.yubin.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 生气状态
 */
@Slf4j
public class AngryState implements State {

    private final Mammoth mammoth;

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void observe() {
        LOGGER.info("{} 愤怒!", mammoth);
    }

    @Override
    public void onEnterState() {
        LOGGER.info("{} 生气了!", mammoth);
    }
}
