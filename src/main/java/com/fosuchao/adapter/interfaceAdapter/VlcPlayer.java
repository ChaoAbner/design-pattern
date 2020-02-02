package com.fosuchao.adapter.interfaceAdapter;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/2 19:02
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("播放vlc音频，文件为：" + filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
