package BaiTap;

import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời nhập size:");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập giá trị các phần tử trong mảng [%d]:",i);
           arr[i] = Integer.parseInt(sc.nextLine());
        }
        int min= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min:"+min);
    }
}
