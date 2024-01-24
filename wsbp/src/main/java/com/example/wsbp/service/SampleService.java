package com.example.wsbp.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@Service
public class SampleService implements ISampleService {
    private final Random random;

    public SampleService() {
        // コンストラクタでRandomオブジェクトを初期化
        this.random = new Random();
    }
    @Override
    public String makeCurrentHMS() {
        var now = LocalDateTime.now();
        var str = now.getHour()
                + ":" + now.getMinute()
                + ":" + now.getSecond();
        return str;
    }
    @Override
    public int makeRandInt() {
        // 0から9までの整数で乱数を生成して返す
        return random.nextInt(10);
    }
}
