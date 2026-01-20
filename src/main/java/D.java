public class D {
    int id;
    String name;
    double balance;

    public static void main(String[] args) {
        D o=new D();
        o.id=10;
        o.name="Raj";
        o.balance=67000;
        System.out.println(o.id + " " + o.balance +" " +o.name);
        String str=new String("AJay");
        System.out.println(str.hashCode());
        String str1="Ajay";
        System.out.println(str1.hashCode());
        String str2="Ajay";
        System.out.println(str2.hashCode());
        System.out.println(str1==str2);

        String str3=new String("Rahul");
        System.out.println(str3.hashCode());
        String Str4=new String("Rahul");
        System.out.println(Str4.hashCode());
        System.out.println(str3==Str4);


    }
}
