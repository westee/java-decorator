package com.github.hcsp;

public class LogDecorator implements DataService {
    DataService delegate;

    public LogDecorator(DataService delegate) {
        this.delegate = delegate;
    }

    @Override
    public String a(int i) {
        System.out.println("a is invoke " + i);
        String value = delegate.a(i);
        System.out.println("a is finished " + value);
        return  value;
    }

    @Override
    public String b(int i) {
        System.out.println("b is invoke " + i);
        String value = delegate.b(i);
        System.out.println("b is finished " + value);
        return  value;
    }
}
