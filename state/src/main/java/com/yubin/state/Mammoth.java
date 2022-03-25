package com.yubin.state;

/**
 * 猛犸象 定义其行为的内部状态
 */
public class Mammoth {

    private State state;

    public Mammoth() {
        state = new PeacefulState(this);
    }

    /**
     * 随着时间流逝
     */
    public void timePasses() {
        if (state.getClass().equals(PeacefulState.class)) {
            changeStateTo(new AngryState(this));
        } else {
            changeStateTo(new PeacefulState(this));
        }
    }

    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    @Override
    public String toString() {
        return "猛犸象";
    }

    public void observe() {
        this.state.observe();
    }
}
