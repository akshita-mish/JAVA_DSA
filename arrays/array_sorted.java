public class array_sorted {
    public static boolean sorted(int[] arr){
        if(arr.length==0||arr.length==1){
            return true;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={1};
        boolean result=array_sorted.sorted(arr);
        if(result){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
}
