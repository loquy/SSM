package com.utils;

import org.junit.Test;

import java.util.UUID;

@SuppressWarnings("all") // 抑制警告
public class IDutils {

    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
