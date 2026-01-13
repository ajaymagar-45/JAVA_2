package Collection.ArrayList;

public class ImplementationOfMyArrayList {
    public static void main(String[] args) {
        MyArrayList m=new MyArrayList();
        m.add(10);
        m.add(20);
        m.add("Ajay");


       for (int i=0;i<m.size();i++){
           System.out.println(m.get(i));
       }
        System.out.println(m.size());

    }


}
