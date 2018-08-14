package com.gmail.mitykruglov;

public class TestClass {
    @Test(a = 5, b = 2)
    public void printTestView(int numOne, int numTwo){
        System.out.println(numOne);
        System.out.println(numTwo);
    }
}
