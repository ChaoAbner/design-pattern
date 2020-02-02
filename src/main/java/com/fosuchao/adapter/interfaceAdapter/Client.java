package com.fosuchao.adapter.interfaceAdapter;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/2 19:16
 */
public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "jay chou/daoxaing.mp3");
        audioPlayer.play("vlc", "jay chou/qinghuaci.vlc");
        audioPlayer.play("mp4", "jay chou/caihong.mp4");
        audioPlayer.play("avl", "jay chou/qilixiang.avl");
    }
}
