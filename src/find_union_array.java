import java.util.HashSet;

public class find_union_array {
    public static int[] union(int[] arr1,int[] arr2){
     HashSet<Integer> set=new HashSet<>(); //set contains only unique values that why taking it
      for(int i=0;i<arr1.length;i++){
          set.add(arr1[i]);
      }
      for(int i=0;i<arr2.length;i++){
          set.add(arr2[i]);
      }
     int[] nums=new int[set.size()];
      int idx=0;
      for(int i:set){
          nums[idx]=i;
          idx++;
      }
      return nums;

    }
    public static void main(String[] args) {
        int [] arr1={1,2,3,3,4,5,6,6,7};
        int [] arr2={2,3,4,5,1,6};
        int [] ans=find_union_array.union(arr1,arr2);
        for(int i:ans){
            System.out.println(i);
        }


    }
}
