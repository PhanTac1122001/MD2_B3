package BaiTap;

import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



int[][] number = new int[3][3];

        int max = number[0][0];
        for(int i=0;i< number.length;i++){

            for(int j=0;j<number[i].length;j++){
                System.out.printf("numbers[%d][%d]=", i, j);
                number[i][j] = Integer.parseInt(sc.nextLine());
                if(number[i][j]>max){
                    max=number[i][j];
                }
            }
        }
        System.out.println("Max là "+max);
    }
}
