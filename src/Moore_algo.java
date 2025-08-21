import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Moore_algo {
    //majority element in an array
    public static int majority_element(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        int max_occurance = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            //int check=arr[i];
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > (n / 2)) {
                return arr[i];
            }
        }
        return -1;

    }

    //using hashmAP
  public static int majority(int arr[]){
      HashMap<Integer, Integer> map = new HashMap<>();
      int n=arr.length;
      for(int i = 0; i<arr.length;i++)
      {
          int value=map.getOrDefault(arr[i],0);
          map.put(arr[i],value+1);

  }
      for(Map.Entry<Integer,Integer> it: map.entrySet()){
         if(it.getValue()>(n/2)){
             return it.getKey();
         }

      }
      return -1;
  }





    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        System.out.println(Moore_algo.majority(arr));

    }
}
