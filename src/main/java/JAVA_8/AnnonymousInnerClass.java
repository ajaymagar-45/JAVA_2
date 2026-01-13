package JAVA_8;

public class AnnonymousInnerClass  {



    public static void main(String[] args) {
        Runnable r=new Runnable()
                //This is Annonymous Inner class
        {
            @Override
            public void run() {
                for(int i=0;i<5;i++) {
                    System.out.println("child trhead");
                }

            }


        };

        Thread t = new Thread(r);

        t.start();
        for (int i=0;i<5;i++){
            System.out.println("Main thread");
        }



    }

}
