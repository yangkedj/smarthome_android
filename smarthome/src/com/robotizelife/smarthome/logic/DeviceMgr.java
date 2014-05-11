package com.robotizelife.smarthome.logic;

import java.util.Objects;

/**
 * Created by 俊 on 14-5-10.
 */
public class DeviceMgr {

    private static Object lock = new Object();
    private static DeviceMgr instance;

    public static DeviceMgr getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null)
                    instance = new DeviceMgr();
            }
        }
        return instance;
    }

    public boolean startDevice(String id) {
        return false;
    }
}
