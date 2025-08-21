import java.util.HashMap;

public class Two_sum {
    //brute force approach O(n^2)
    public static int[] two_sum(int [] arr,int k){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return new int[] {i,j};
                }
            }
        }
        return  new int[] {};
    }
    //using hashmap
    public static int[] two_sum1(int [] arr,int target) {
    HashMap<Integer,Integer> map=new HashMap<>();
    int[] ans=new int[2];
    ans[0]=ans[1]=-1;
    for(int i=0;i<arr.length;i++){
        int needed_number=target-arr[i];
        if(map.containsKey(needed_number)){
            ans[0]=map.get(needed_number);
            ans[1]=i;
        }
        map.put(arr[i],i);
    }
    return ans;
    }



    public static void main(String[] args) {
        int [] arr={2,11,7,5};
        int [] res=Two_sum.two_sum1(arr,9);
        for(int i=0;i<res.length;i++){
            System.out.println(i);
        }

    }
}
