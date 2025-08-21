public class Right_rotate {
    public static  void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int [] temp=new int[3];
        //inserting the element in temp array
        for(int i=n-k;i<n;i++){
            temp[i-(n-k)]=nums[i];
        }
        //shifting the element of nums
        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }

    }
    //more optimized way
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
    public static void right_rotate(int[] arr,int d){
        int n=arr.length;

        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-1);

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Right_rotate.right_rotate(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

