package BaiTap;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        int[] numbers={1,3,5,7,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("Bạn muốn xóa phần tử:");
        int indexDelete;
        do{
            indexDelete=Integer.parseInt(sc.nextLine());
            if(indexDelete<0 || indexDelete>=numbers.length){
                System.err.println("Chỉ số phần tử cần xóa không tồn tại, vui lòng nhập lại");

            }else {
                break;
            }
        }while (true);
        int[] newNumbers=new int[numbers.length-1];
        for(int i=0;i<newNumbers.length;i++){
            if(numbers[i]<indexDelete){
                newNumbers[i]=numbers[i];
            }else {
                newNumbers[i]=numbers[i+1];
            }
        }
        System.out.println("Mảng sau khi xóa phần tử:");
        for(int element:newNumbers){
            System.out.printf("%d\t",element);
        }
    }
}
