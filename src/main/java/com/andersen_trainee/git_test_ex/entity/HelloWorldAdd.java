package com.andersen_trainee.git_test_ex.entity;

public class HelloWorldAdd extends HelloWorld {

    public HelloWorldAdd() {
        super();
    }

    @Override
    public void helloWorld() {
        for (int i = 0; i < 3; i++) {
            System.out.println(getWord());
        }
    }
}
