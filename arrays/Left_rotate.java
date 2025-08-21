public class Left_rotate {
    //code for left rotate
    public static void leftrotate(int[] arr){
        int temp=arr[0];
        for (int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    //rotate when d is given like d spaces
    public static void leftrotate1(int[] arr,int k){
        int n=arr.length;

         k =k%n;
         int [] temp=new int[k];
         for(int i=0;i<k;i++){
             temp[i]=arr[i];
         }
         for(int i=k;i<n;i++){
             arr[i-k]=arr[i];
         }
         for(int i=n-k;i<n;i++){
             arr[i]=temp[i-(n-k)];
         }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Left_rotate.leftrotate1(arr,3);
        System.out.println("after rotation ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
