import java.util.*;

public class isomorphicString {

    public static boolean isIsomorphic(String s, String t){
        HashMap<Integer,Integer> sHash = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> tHash = new HashMap<Integer,Integer>();
        int sLetterCount = 0;
        int tLetterCount = 0;

        HashMap<Character,Integer> sMap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> tMap = new HashMap<Character,Integer>();


        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!sMap.containsKey(c)){
                sMap.put(c,sLetterCount);
                sLetterCount++;
            }
            sHash.put(i, sMap.get(c));
            char c2 = t.charAt(i);
            if(!tMap.containsKey(c2)){
                tMap.put(c2,tLetterCount);
                tLetterCount++;
            }
            tHash.put(i, tMap.get(c2));
        }
        // for(int i = 0; i < t.length(); i++){
        //     char c = t.charAt(i);
        //     if(!tMap.containsKey(c)){
        //         tMap.put(c,tLetterCount);
        //         tLetterCount++;
        //     }
        //     tHash.put(i, tMap.get(c));
        // }
        if(sHash.equals(tHash)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){

        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("paper","title"));
        

    }

    
    /* 
     * 
     * egg
     * 
     * e 0
     * g 1,2
     * '011'
     * 
     * add
     * a 0
     * g 1,2
     * 
     * paper = '01023'
     * 
     * 
    */
}
