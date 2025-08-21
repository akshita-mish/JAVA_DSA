public class lower_upper_bound {
    public static int lower_bound(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;//for overflow condition
            if(arr[mid]>=target){
                return mid;
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }

        }
        return -1;
    }
    //for upper bound
    public static int upper_bound(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;//for overflow condition
            if(arr[mid]>target){
                return mid;
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        int [] arr={1,2,2,3};
        int res= lower_upper_bound.upper_bound(arr,2);
        System.out.println(res);
    }
}
