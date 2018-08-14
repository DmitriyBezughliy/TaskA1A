package com.gmail.mitykruglov;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


class TaskA1 {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestClass t = new TestClass();
        Class<?> c = t.getClass();

        try{

            Method m = c.getMethod("printTestView", int.class, int.class);
            Test test = m.getAnnotation(Test.class);
            m.invoke(t, test.a(),test.b());

        }catch (NoSuchMethodException e){
            System.out.println(e);
        }
    }
}
