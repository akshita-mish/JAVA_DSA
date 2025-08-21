import java.util.Arrays;

public class largest_element {
    public static int largest(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
  //find 2nd largest element
    public static int second_largest(int[] arr){
        int max=arr[0];
        int second_max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if((arr[i]>second_max) && (arr[i]!=max)){
                if(max>second_max){
                    second_max=arr[i];
                }
            }
        }
        return second_max;


    }

    public static void main(String[] args) {
        int[] arr={1,7,28,19,2,5};
        int res=largest_element.second_largest(arr);
        System.out.println(res);
    }
}
