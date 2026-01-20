public class RotateArrayInantiClockwiseDirection {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        int n = arr.length;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + d) % n];
            System.out.println(temp[i]);
        }


    }
}
