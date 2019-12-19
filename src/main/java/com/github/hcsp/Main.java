package com.github.hcsp;

import java.lang.reflect.Proxy;

public class Main {
//    static DataService dataService = new CacheDecorator(new LogDecorator(new DataServiceImpl()));
    static DataServiceImpl dataService = new DataServiceImpl();

    public static void main(String[] args) {
//        dataService.a(1);
//        dataService.b(1);
//        System.out.println(dataService.a(1));
//        System.out.println(dataService.b(1));
        DataService service= (DataService) Proxy.newProxyInstance(dataService.getClass().getClassLoader(),
                new Class[]{DataService.class},
                new LogProxy(dataService));

        service.a(1);
    }
}
