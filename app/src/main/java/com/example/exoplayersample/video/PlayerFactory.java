package com.example.exoplayersample.video;

/**
 * Created by 龙泉 on 2016/12/26.
 */
public class PlayerFactory {

    public static PlayerManager newInstance() {
        return new DefaultPlayManager();
    }
}
