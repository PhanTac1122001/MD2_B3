package BaiTap;

public class BaiTap9 {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 8, 15, 12};


        int max1 = Math.max(numbers[0], numbers[1]);
        int max2 = Math.min(numbers[0], numbers[1]);

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > max1) {
                max2 = max1;
                max1 = numbers[i];
            } else if (numbers[i] > max2 && numbers[i] != max1) {
                max2 = numbers[i];
            }
        }

        System.out.println("Số lớn đứng thứ 2 là: " + max2);
    }


}
