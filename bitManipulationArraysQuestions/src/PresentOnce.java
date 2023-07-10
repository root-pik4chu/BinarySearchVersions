public class PresentOnce {
    //Write a Java program to find a number that appears only once in a given array
    // of integers. All numbers occur twice.
    //Source Array : [10, 20, 10, 20, 30, 40, 40, 30, 50]
    // 50 appears only once
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 20, 30, 40, 40, 30, 50};

        int temp = 0;
        for(int x : arr){
            temp = temp ^ x;
        }
        System.out.println(temp);
    }
}
