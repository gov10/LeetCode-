import java.util.*;
public class TwoSumHash {

    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> num = new HashMap();

        int n = nums.length;

        for (int i=0;i<n;i++){
            int complement = target-nums[i];
            if(num.containsKey(complement)){
                return new int[] {num.get(complement),i};
            }
            num.put(nums[i],i);
        }
        return new int[]{};

    }

public static void main(String[] args){
    TwoSumHash k = new TwoSumHash();
    int[] arr = {3,3};
    int target = 6;
    int[] result = k.twoSum(arr,target);
    System.out.println(Arrays.toString(result));
}
    
}
