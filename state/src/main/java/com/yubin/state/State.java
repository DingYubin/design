package com.yubin.state;

/**
 *  状态 接口
 */
public interface State {

    void onEnterState();

    void observe();
}
