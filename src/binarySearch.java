public class binarySearch {
    public static void main(String[] args) {
        System.out.println("bs");

        int [] arr = {1,2,3,4,5,6,7,8};

        int end = arr.length-1;
        int start = 0;
        int ele = 8;

        System.out.println(bs(arr,ele,start,end));

    }
    //normal binary search
    static int bs(int[] arr , int ele , int start , int end){
        while (start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == ele) {

                return mid;
            }
            else if (ele < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
