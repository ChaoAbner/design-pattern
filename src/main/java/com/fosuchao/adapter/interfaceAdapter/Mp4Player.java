package com.fosuchao.adapter.interfaceAdapter;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/2 19:01
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("播放mp4音频，文件为:" + filename);
    }
}
