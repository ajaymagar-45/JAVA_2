package JAVA_8;
class Abc{

   public void show1(){
        System.out.println("Show method of class Abc");
    }
}
interface Itr11{
    default void  show1(){
        System.out.println("Show method of interface itr");
    }
}

public class ClassInter extends Abc implements Itr11 {
    public static void main(String[] args) {
        ClassInter ci=new ClassInter();
        ci.show1();
    }
}
