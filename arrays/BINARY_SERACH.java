public class BINARY_SERACH {
    //iterative approach
    public static int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;//for overflow condition
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }

        }
        return -1;

    }
    //recursive approach
    public static int search1(int arr[],int left,int right,int target) {
        int mid = left + (right - left) / 2;
        if (left > right) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return search1(arr, left, mid - 1, target);
        } else {
            return search1(arr, mid + 1, right, target);
        }
    }


    public static void main(String[] args) {
        int [] arr={-1,0,3,5,9,12};
        int res=BINARY_SERACH.search1(arr,0,arr.length-1,5);
     if(res==-1){
         System.out.println("element is not present ");
     }else{
         System.out.println("element present at "+res);
     }
    }
}
