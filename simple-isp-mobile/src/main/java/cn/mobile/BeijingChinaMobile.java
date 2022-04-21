package cn.mobile;

import top.xiaorang.spi.InternetService;

/**
 * @author liulei
 */
public class BeijingChinaMobile implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("connect internet by [Beijing China Mobile]");
    }
}
