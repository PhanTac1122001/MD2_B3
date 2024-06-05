package BaiTap;

import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng và số cột của ma trận vuông: ");
        int n = Integer.parseInt(scanner.nextLine());


        int[][] matrix = new int[n][n];
        System.out.println("Nhập các giá trị của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }


        System.out.println("Ma trận vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.print("Nhập số cột cần tính tổng: ");
        int y = Integer.parseInt(scanner.nextLine());
        if (y < 0 || y >= n) {
            System.out.println("Số cột nhập không hợp lệ!");
            return;
        }


        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum1 += matrix[i][j];
                }
                if (j == n - 1 - i) {
                    sum2 += matrix[i][j];
                }
            }
        }

        int sumCol = 0;
        for (int i = 0; i < n; i++) {
            sumCol += matrix[i][y];
        }

        System.out.println("Tổng các phần tử trên đường chéo chính: " + sum1);
        System.out.println("Tổng các phần tử trên đường chéo phụ: " + sum2);
        System.out.println("Tổng các phần tử trên cột " + y + ": " + sumCol);
    }
}
