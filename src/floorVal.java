public class floorVal {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,5,7,8,9};
        System.out.println(floor(arr ,  6));
    }

    public static int floor(int [] arr , int ele){

        int start = 0;
        int end = arr.length -1;
        int res =0;

        while (start <= end) {
            int mid = (start + end)/2;

            if(arr[mid] < ele) {
                res = arr[mid];
                start = mid +1;

            }else if (arr[mid] > ele) end = mid -1;

        }return res;
    }
}
