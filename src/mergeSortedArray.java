import java.util.*;
public class mergeSortedArray{

    public static int[] mergeAndSort(int[] nums1, int[] nums2, int length1, int length2){

        
        Deque<Integer> queue1 = new ArrayDeque<Integer>();
        Deque<Integer> queue2= new ArrayDeque<Integer>();
        int[] copyNums1 = new int[length1];
        for(int i=0; i<length1; i++){
            copyNums1[i] = nums1[i];
        }
        int count = 0;
        int totalLength = length1+length2;
        int tracker1 = 0;
        int tracker2 = 0;
        boolean isEmpty1 = false;
        boolean isEmpty2 = false;
    
        for(int i=0; i<length1; i++){
            queue1.add(nums1[i]);
        }
        for(int i=0; i<length2; i++){
            queue2.add(nums2[i]);
        }
        // while(count<=totalLength){

        //     if(queue1.isEmpty() && !(queue2.isEmpty())){
        //         nums1[count] = queue2.remove();
        //     }
        //     else if(queue2.isEmpty() && !(queue1.isEmpty())){
        //         nums1[count] = queue1.remove();
        //     }
        //     else if(queue1.peekFirst() <= queue2.peekFirst()){
        //         nums1[count] = queue1.remove();
        //     }
        //     else if(queue2.peekFirst() < queue1.peekFirst()){
        //         nums1[count] = queue2.remove();
        //     }
        //     count++;
        // }
        while(count<totalLength){
            int value1 = copyNums1[tracker1];
            int value2 = nums2[tracker2];
            // if(!queue1.isEmpty()) {
            //     value1 = queue1.peekFirst();
            //     }
            // else{
            //     value1 = -1;
            // }
            // if(!queue2.isEmpty()){
            //     value2 = queue2.peekFirst();
            // }
            // else{
            //     value2 = -1;
            // }
            if(value1<=value2){
                nums1[count] = value1;
                tracker1++;
                if(tracker1 >= length1){
                    isEmpty1 = true;
                }
            }
            else if(value2<value1){
                nums1[count] = value2;
                tracker2++;
                if(tracker2 >= length2){
                    isEmpty2 = true;
                }
            }
            count++;
        
        }






        return nums1;
    }
    public static void main(String[] args){

        int nums1[] = new int[]{1,2,3,0,0,0};
        int nums2[] = new int[]{2,5,6};
        int m = nums1.length;
        int n = nums2.length;
        mergeAndSort(nums1, nums2, m, n);
        Deque<Integer> queue1 = new ArrayDeque<Integer>();
        Deque<Integer> queue2= new ArrayDeque<Integer>();
    
        for(int i=0; i<m; i++){
            queue1.add(nums1[i]);
        }
        for(int i=0; i<n; i++){
            queue2.add(nums2[i]);
        }
        System.out.println(queue1.peekFirst());
        System.out.println(queue1.peekLast());
        System.out.println(queue1.remove());
        System.out.println(queue1.peekFirst());
        System.out.println(queue1.peekLast());

        for(int i = 0; i < m; i++){
            System.out.println(nums1[i]);
        }
        
        

    }
}