package com.abu.exception;

public class Exception1 {

    public void demonstrateException(){
        System.out.println("Just throw an error");
        throw new StackOverflowError("My tryout error");
    }

    public void callerToTheException(){
        try{
            demonstrateException();
        }catch (Throwable t){
            System.out.println(t);
        }
    }
}
