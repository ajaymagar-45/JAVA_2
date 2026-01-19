package JAVA_8;

public class ConstructorReference {
    ConstructorReference(){
        System.out.println("Implementing Constructor reference");
    }
    public static void main(String[] args) {
        Runnable r=ConstructorReference::new;
        Thread t =new Thread(r);
        t.start();
        int arr[]={1,26,2768,26};
        int arr1[]=arr.clone();
       for(int i=0;i<arr1.length;i++){
           System.out.println(arr1[i]);
       }

    }
}
