package top.xiaorang;

import top.xiaorang.spi.InternetService;

import java.util.ServiceLoader;

/**
 * @author liulei
 */
public class Application {
    public static void main(String[] args) {
        ServiceLoader<InternetService> internetServices = ServiceLoader.load(InternetService.class);
        for (InternetService internetService : internetServices) {
            internetService.connectInternet();
        }
    }
}
