package com.fosuchao.proxy.staticproxy;

/**
 * @Description: ��̬����
 * �ŵ㣺 �ٲ��޸�Ŀ������ǰ���£���ͨ����������Ŀ�����Ĺ��ܽ�����չ
 * ȱ�㣺 ��ΪĿ��ʹ������ʵ��ͬһ���ӿڣ�һ���ӿڷ������ӣ���Ŀ�����ʹ������Ҫά��
 * @Auther: Joker Ye
 * @Date: 2020/1/28 09:32
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Target();
        Proxy proxy = new Proxy(target);
        proxy.send();
    }
}
