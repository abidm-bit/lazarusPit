package August7;

import java.util.HashMap;

public class WhereOnTheMap {

    void solveTwoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int num : nums) {
            if (map.containsKey(target - num)) {
                System.out.println(target - num);
            }
        }
    }

    public static void main (String[]args){

        int []arr = {1,4,5}; int target =9;
        WhereOnTheMap w = new WhereOnTheMap();
        w.solveTwoSum(arr,target);

        System.out.println();

        int []arr2 = {1,2,7,4,5}; int target2 =9;
        WhereOnTheMap w2 = new WhereOnTheMap();
        w2.solveTwoSum(arr2,target2);

    }





}
