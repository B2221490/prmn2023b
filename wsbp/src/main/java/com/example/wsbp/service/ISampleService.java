package com.example.wsbp.service;

public interface ISampleService {

    /**
     * @return 現在の時:分:秒を文字列で返す
     */

    String makeCurrentHMS();

    /**
     * makeRandIntは、0から9までの整数で乱数を生成して返す
     *
     * @return 0から9までで生成される乱数
     */
    int makeRandInt();
}
