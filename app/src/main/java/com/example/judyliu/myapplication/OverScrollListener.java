package com.example.judyliu.myapplication;

/**
 * Created by Judy.liu on 15/9/28.
 * 滑动过度的监听借口
 */

public interface OverScrollListener {

    /**
     * 滑动过度时调用的方法
     *
     * @param dy 每毫秒滑动的距离
     */
    //TODO public abstract void  void overScrollBy(int dy);  ???
    public abstract void overScrollBy(int dy);


}
