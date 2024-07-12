import java.util.Arrays;
// import java.util.ArrayList;
import java.util.HashMap;
public class TwoSum{
public static int[] twoSumAgain(int[] nums, int target){

    HashMap <Integer,Integer> map= new HashMap <Integer,Integer>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            //for each int in array, create a key for the num and assign it to the value of its position
            //{2=0},{7=1},{11=2},{15=3}
            //{3=0} will be replaced with {3=1}
            if(map.containsKey(nums[i])){
                    continue;
                }
                else{
                    // System.out.println(nums[i] +" "+ i);
                    map.put(nums[i],i);
                }
        }
        for(int i = 0; i < nums.length; i++){
            //val = 2 on first iteration of [2,7,11,15]
            int val = nums[i];
            int complement = target - val;
            // System.out.println("complement: " +complement+ " value: "+ val);
            

                if(map.containsKey(complement)){
                    // System.out.println("complement is in hashmap");
                    //if the same number adds together to the target and two exist
                    if(val == complement && map.get(val)!=i){
                        // System.out.println(map.get(val) + " " + i);
                        result[0] = i;
                        result[1] = map.get(val);
                    }
                    else if(val != complement){
                        result[0] = map.get(val);
                        result[1] = map.get(complement);
                    }
                }
    }

    return result;

}

// public static int[] twoSum(int[] nums, int target) {
//         int count = 0;
//         for(count=0; count < nums.length; count++){
//             for(int i = 0; i < nums.length;i++){
//                 if(i == count){
//                     continue;
//                 }
//                 else{
//                     if(nums[count] +nums[i] == target){
//                         int[] solution = new int[]{count,i};
//                         return solution;
//                     }
//                 }
//             }
//         }
//         return nums;
//     }

// public static int[] twoSumHash(int[] nums, int target) {

//     int len = nums.length;
//     HashMap<Integer, Integer> hashNums = new HashMap<Integer, Integer>();
//     //for each value in the number array, put into hash map with its position as the key
//     for(int i=0; i<len; i++){
//         hashNums.put(nums[i],i);
//     }
//     for(int j=0; j<len; j++){
//         int value = nums[j];
//         int complement = target - value;
//         if(hashNums.containsKey(complement)){
//             if(hashNums.get(complement) == value){
//                 continue;
//             }
//              int[] result = new int[]{j,hashNums.get(complement)};
//              return result;
//         }
//     }
//     return nums;

// }






public static void main(String[] args){
        int target1 = 9;
        int target2 = 6;
        int target3 = 6;
        int target4 = 6;
        int[] nums1 = new int[]{2,7,11,15};
        int[] nums2 = new int[]{3,2,4};
        int[] nums3 = new int[]{3,3};
        int[] nums4 = new int[]{2,4,11,3};
        // System.out.println("Result of O(n^2) brute-force algorithm: " + Arrays.toString(twoSum(nums,target)));
        // System.out.println("Result of O(n) hash algorithm: " + Arrays.toString(twoSumHash(nums,target)));


        System.out.println(Arrays.toString(twoSumAgain(nums1,target1)));
        System.out.println(Arrays.toString(twoSumAgain(nums2,target2)));
        System.out.println(Arrays.toString(twoSumAgain(nums3,target3)));
        System.out.println(Arrays.toString(twoSumAgain(nums4,target4)));
        //0 1
        //88 ms to 4 ms runtime

    }
}