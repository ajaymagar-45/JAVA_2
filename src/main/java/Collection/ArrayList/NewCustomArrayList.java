package Collection.ArrayList;

public class NewCustomArrayList {
    private int intialcapacity;
    private Object[] element;
     public NewCustomArrayList(){
         element=new Object[intialcapacity];
         intialcapacity=15;
     }
     public void add(){
         if(intialcapacity>15)
         intialcapacity++;
     }
}
