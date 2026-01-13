package Prac_1;

public class CopyConstructor {
    int id;
    String name;
    CopyConstructor(int id,String name){

        this.id=id;
        this.name=name;
    }
    CopyConstructor(CopyConstructor c){
        this.id=c.id;
        this.name=c.name;

    }
    CopyConstructor(int a ,int b){
        System.out.println(a +b);
    }

    @Override
    public String toString() {
        return id + " " + name  ;
    }

    public static void main(String[] args) {
        CopyConstructor obj1=new CopyConstructor(10,"Ajay");
        System.out.println(obj1);
        CopyConstructor obj2=new CopyConstructor(obj1);
        System.out.println(obj2);

    }
}
