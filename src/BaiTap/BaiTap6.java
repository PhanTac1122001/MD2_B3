package BaiTap;

import java.util.Scanner;

public class BaiTap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dòng:");
        int row=Integer.parseInt(sc.nextLine());

        System.out.println("Nhập cột:");
        int col=Integer.parseInt(sc.nextLine());

        int[][] arr=new int[row][col];
        System.out.println("Nhập các giá trị cho mảng 2 chiều:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Nhập vị trí cột cần tính tổng (từ 1 đến " + col + "): ");
        int columnToSum = Integer.parseInt(sc.nextLine());

        if (columnToSum < 1 || columnToSum > col) {
            System.out.println("Vị trí cột không hợp lệ!");
            return;
        }

        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][columnToSum - 1];
        }


        System.out.println("Tổng các phần tử ở cột " + columnToSum + " là: " + sum);
    }


}
