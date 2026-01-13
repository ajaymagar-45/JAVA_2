package JAVA_8;
interface Itr{
    void m1(int a,int b);
}

public abstract class FunctionalInterface_2  {
    public static void main(String[] args) {
        Itr i=(a,b)-> System.out.println("use of lambda expression in functional Interface : "+(a*b));
        i.m1(10,20);
        i.m1(2763,829);

    }
}
