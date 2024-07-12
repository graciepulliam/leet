import java.util.Arrays;

public class Leet27 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] != val){
                nums[count]=nums[i];
                count++;
            }
           
        }
        System.out.println(Arrays.toString(nums));;
        return count;
        
    }
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int val = 3;

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        //removeElement(nums,val);
        System.out.println(removeElement(nums,val));
        System.out.println(removeElement(nums2,val2));
       

    }
}
