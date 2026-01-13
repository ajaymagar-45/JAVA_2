package JAVA_8;

import java.util.function.Predicate;

interface Inter_1{
    static void show(){
        System.out.println("This method is gonna call by only interface name only");

    }

}

public class StaticInsideinterface implements Inter_1 {
    public boolean test(int i){
        if (i%2==0){
            return true;
        }
        else {
            return false;
        }
        }

    public static void main(String[] args) {
        String s1[]={"Greenish","Venkatesh","Rajveer","Ajay","Ram"};
        Predicate<String> p=s2->s2.length()%2==0;
        for(String s2:s1){
            if(p.test(s2)){
                System.out.println(s2);
            }
        }









      Predicate <String> s=i->i.length()>5;
        System.out.println(s.test("Ajay"));
        System.out.println(s.test("Shreenivas"));



    }
}
