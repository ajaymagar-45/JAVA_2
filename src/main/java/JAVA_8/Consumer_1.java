package JAVA_8;

import java.util.function.Consumer;

public class Consumer_1 {
    String name;
    Consumer_1(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Consumer <Consumer_1>c1= o-> System.out.println(o.name+" Ready to release");
        Consumer<Consumer_1>c2=o-> System.out.println(o.name +" Released");
        Consumer<Consumer_1> c3=o-> System.out.println(o.name+" Released but not give expected output ");
        Consumer<Consumer_1>cc=c1.andThen(c2).andThen(c3);
        Consumer_1 o=new Consumer_1("Kalki");
        cc.accept(o);

    }
}
