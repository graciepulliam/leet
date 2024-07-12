import java.util.*;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t){

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character,Integer>();

        if (s.length() != t.length()){
            return false;
        }

        /*  
         * map 1 for anagram
         * (a,3), (n,1), (g,1), (r,1), (m,1)
         * map 2 for nagaram
         * (n,1), (a,3), (g,1), (r,1), (m,1)
         */
        
            for(int i = 0; i < s.length(); i++){
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);

                if(!map1.containsKey(c1)){
                    map1.put(c1,1);
                }
                else{
                    map1.put(c1, map1.get(c1)+1);
                }
                if(!map2.containsKey(c2)){
                    map2.put(c2, 1);
           
                }
                else{
                    map2.put(c2, map2.get(c2)+1);
                }
            }
           

        if(map1.equals(map2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){



        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("aacc","ccac"));
        

    }
}
