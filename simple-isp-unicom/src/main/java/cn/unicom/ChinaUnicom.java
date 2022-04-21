package cn.unicom;

import top.xiaorang.spi.InternetService;

/**
 * @author liulei
 */
public class ChinaUnicom implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("connect internet by [China Unicom]");
    }
}
