package JAVA_8;

interface Itr1{
    default void m1(){
        System.out.println("m1 method of interface ");
    }
}
interface Itr2 {
    default void m1(){
        System.out.println("m2");
    }

}
public class Exam_1 implements Itr1 {


//    public void m1(){
//        Itr1.super.m1();
//        System.out.println("m1.class");
//    }


    public static void main(String[] args) {
        Exam_1 obj=new Exam_1();
        obj.m1();


    }


}
