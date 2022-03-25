package com.yubin.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 平静状态
 */
@Slf4j
public class PeacefulState implements State{

    private final Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        LOGGER.info("{} 冷静下来", mammoth);
    }

    @Override
    public void observe() {
        LOGGER.info("{} 平静祥和", mammoth);
    }
}
