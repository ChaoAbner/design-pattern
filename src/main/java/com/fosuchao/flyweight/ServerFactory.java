package com.fosuchao.flyweight;

import java.util.HashMap;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/5 20:02
 */
public class ServerFactory {
    private static HashMap<String, Server> userServerMap = new HashMap<>();

    private ServerFactory(){}

    public static Server getInstance(String serverType, String useType) {
        String stringBuilder = serverType +
                "_" +
                useType;
        if (!userServerMap.containsKey(stringBuilder)) {

            userServerMap.put(stringBuilder, getServer(serverType, useType));
        }
        return userServerMap.get(stringBuilder);
    }

    private static Server getServer(String ServerType,String useType) {
        Server server = null;
        switch (ServerType) {
            case "cloud": server = new CloudServer(useType); break;
            case "visual": server = new VisualServer(useType); break;
            default: break;
        }
        return server;
    }
}
