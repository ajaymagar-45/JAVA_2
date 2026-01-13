package JAVA_8;
@FunctionalInterface
interface Inter{
     void show();
     //after java8 we can create default and static method inside the interface
     default void tri(){
         System.out.println("Created a default method in the interface");
     }
     static void jhs(){}



}
@FunctionalInterface
interface KL extends Inter{
    void ag();

   default void show(){
        System.out.println("sjhk");

    }


}
public class FunctionalInter {
    public static void main(String[] args) {
        Inter no= ()-> System.out.println("hello");
        no.show();
        System.out.println("");
 }

}
