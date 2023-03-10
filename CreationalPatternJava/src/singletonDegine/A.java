package singletonDegine;

public class A {

    private static A obj = new A();

    private A(){

    }

    public static A getA(){
        return obj;
    }


}
