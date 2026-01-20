package JAVA_8;
interface  i{
    int a(int a,int b);
}

public class Inter_11 {
    public static void main(String[] args) {
        i k=(l,m)->l+m;
        System.out.println(k.a(3,4));
        i o=(aa,bb)->aa*bb*12;
        System.out.println(o.a(23,45));
    }
}
