package BaiTap;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        int[] numbers={1,23,4,5,6,7,8,9,21,31};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị phần tử cần thêm:");
        int insertValue = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào chỉ số cần chèn:");
        int insertIndex;
        do {
            insertIndex = Integer.parseInt(scanner.nextLine());
            if (insertIndex >= 0) {
                break;
            } else {
                System.err.println("Chỉ số chèn phải lớn hơn 0, vui lòng nhập lại");
            }
        } while (true);
        int[] newNumbers;
        if (insertIndex < numbers.length) {
            newNumbers = new int[numbers.length + 1];
            for (int i = 0; i < newNumbers.length; i++) {
                if (i < insertIndex) {
                    newNumbers[i] = numbers[i];
                } else if (i == insertIndex) {
                    newNumbers[i] = insertValue;
                } else {
                    newNumbers[i] = numbers[i - 1];
                }
            }
        } else {
            newNumbers = new int[insertIndex + 1];
            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = numbers[i];
            }
            newNumbers[insertIndex] = insertValue;
        }
        System.out.println("Mảng sau khi thêm phần tử:");
        for (int element : newNumbers) {
            System.out.printf("%d\t",element);
        }
        System.out.println();
    }
}
