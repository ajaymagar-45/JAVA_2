import java.util.function.Function;

public class N {
    String ty(String v){
        System.out.println(v.length());
        return "";
    }
    static void a(){
        System.out.println("Method reference");
    }
    public static void main(String[] args) {
        N o = new N();
        o.ty("Ajay");
        //BY Lambda Expression
        Function<String, Integer> d = i -> i.length();
        System.out.println(d.apply("Ajay"));

        Runnable r=N::a;

        Thread t=new Thread(r);
        t.start();

    }





}
