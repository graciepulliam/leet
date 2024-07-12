public class practiceJava {
    public static int findTotal(int[] nums){
        int score = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 5){
                score +=5;
            }
            else if(nums[i] % 2 != 0){
                score +=3;
            }
            else{
                score +=1;
            }
        }

        return score;
    }
    public static void main(String[]args){
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {17,19,21};
        int[] nums3 = {5,5,5};

        System.out.println(findTotal(nums1));
        System.out.println(findTotal(nums2));
        System.out.println(findTotal(nums3));

    }

}
