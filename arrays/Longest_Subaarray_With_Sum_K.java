public class Longest_Subaarray_With_Sum_K {
    public static int longestSubarray(int [] arr,int target){//brute force
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==target){
                    max=Math.max(max,i+j-1);
                }
            }
        }
        return max;
    }
    //using O(n^2)
    public static int longestSubarray1(int [] arr,int target){//brute force
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==target){
                    max=Math.max(max,i+j-1);
                }
            }
        }
        return max;
    }
    //using two pointer approach
    public static int longestSubarray2(int[] arr,int target){
        int i=0;
        int j=0;
        int max=0;
        int sum=0;
       while(i<arr.length && j<arr.length  ){
           sum+=arr[j];
           if(sum<target){
               j++;
           }
           else if(sum>target){
               i=j;
               sum=0;
           }else{
               max=Math.max(sum,i-j+1);
               i=j;
               sum=0;
           }

       }
       return max;
    }

    public static void main(String[] args) {
        int[] arr= {10, 5, 2, 7, 1, 9};
        int res=Longest_Subaarray_With_Sum_K.longestSubarray2(arr,15);
        System.out.println(res);
    }
}
