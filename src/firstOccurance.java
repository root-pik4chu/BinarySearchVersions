public class firstOccurance {
    public static void main(String[] args) {
        int [] arr = {1,2,5,5,5,5,5,6,7,8};

        int end = arr.length-1;
        int start = 0;
        int ele = 5;

        System.out.println(F_occ(arr,ele,start,end));
    }
    static int F_occ(int[] arr , int ele , int start , int end){
        int result = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == ele){
                result = mid;
                end = mid - 1;
            }
            else if (ele < arr[mid]) end = mid - 1 ;
            else start = mid + 1;
        }

        return result;
    }
}
