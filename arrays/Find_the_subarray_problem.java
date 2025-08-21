public class Find_the_subarray_problem {
     //brute force approach O(n^3)
    public static int longest_subarray(int [] arr,int t){
        //first loop
        int length=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k = i;k<=j;k++){
                    sum+=arr[k];

                }
                if(sum==t){
                    length=Math.max(length,j-i+1);
                }

            }
        }
        return length;

    }
    //O(n^2) solution
    public static int longest_subarray1(int [] arr,int t) {
        //first loop
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum==t){
                    length=Math.max(length,j-i+1);
                }
            }
        }
        return length;
    }


    public static void main(String[] args) {
        int[] arr={10,5,2,7,1,9};
        int res=Find_the_subarray_problem.longest_subarray(arr,15);
        System.out.println(res);

    }
}
