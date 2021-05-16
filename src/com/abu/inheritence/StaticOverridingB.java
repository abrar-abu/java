package com.abu.inheritence;

public class StaticOverridingB extends StaticOverridingA {

    public static void test() {
        System.out.println(StaticOverridingB.class);
    }

    public void testWhichFunctionIsCalled(){
        StaticOverridingB staticOverridingB = new StaticOverridingB();
        StaticOverridingB.test();
    }
}
