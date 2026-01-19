import java.util.HashMap;

public class M {

    class InnerClass {
        void display() {
            System.out.println("Hello from Inner Class!");
        }
    }

    public static void main(String[] args) {
        M outer = new M();
        InnerClass inner = outer.new InnerClass();
        inner.display();
        HashMap h=new HashMap();
        h.put(101,"sjk");
        h.put(123,"76");
        h.put(111,"sjk");
        h.put(181,"sjk");
        h.put(161,"sjk");
        h.remove("sjk");
        System.out.println(h);



        System.out.println(h.remove("sjk"));
//        System.out.println(h.get(101));
//        System.out.println(h.keySet());
//        System.out.println(h.entrySet());
    }
}