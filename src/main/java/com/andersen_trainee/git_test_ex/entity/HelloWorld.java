package com.andersen_trainee.git_test_ex.entity;

public class HelloWorld {
    private String word;

    public HelloWorld(){
        word = "Hello World !!!";
    }

    public void helloWorld(){
        System.out.println(word);
    }

    public String getWord(){
        return word;
    }
}
