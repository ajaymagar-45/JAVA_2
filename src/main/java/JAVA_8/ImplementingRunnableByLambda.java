package JAVA_8;

public class ImplementingRunnableByLambda {
    public static void main(String[] args) {

        Runnable r=()->{for(int i=0;i<5;i++) {
            System.out.println("Runnabale using lambda");
        }
        };
        Thread t=new Thread(r);
        t.start();
        for (int i=0;i<5;i++) System.out.println("Main thread where all execution starts");

    }
}
