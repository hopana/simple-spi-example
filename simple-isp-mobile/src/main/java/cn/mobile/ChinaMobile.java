package cn.mobile;

import top.xiaorang.spi.InternetService;

/**
 * @author liulei
 */
public class ChinaMobile implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("connect internet by [China Mobile]");
    }
}
