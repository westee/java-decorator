package com.github.hcsp;

public class Main {
    static DataService dataService = new CacheDecorator(new LogDecorator(new DataServiceImpl()));

    public static void main(String[] args) {
        dataService.a(1);
        dataService.b(1);
        System.out.println(dataService.a(1));
        System.out.println(dataService.b(1));
    }
}
