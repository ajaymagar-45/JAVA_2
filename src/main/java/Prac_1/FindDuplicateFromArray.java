package Prac_1;

public class FindDuplicateFromArray {
    public static void main(String[] args) {
        int arr[] = {10, 10, 20, 30, 30};
//        int newarr[]=new int[arr.length];

        for (int i = 1; i < arr.length; i++) {


            if (arr[i - 1] == arr[i]) {
                System.out.println(arr[i]);


            }
        }

    }}
