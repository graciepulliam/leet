import java.util.*;
public class GroupAnagrams {
    public static HashMap <Character,Integer> evaluateWord (String word){
        HashMap<Character,Integer> result = new HashMap<Character,Integer>();
        
        for(int i=0;i<word.length();i++){
            if(!result.containsKey(word.charAt(i))){
                result.put(word.charAt(i),1);
            }
            else{
                result.put(word.charAt(i),result.get(word.charAt(i))+ 1);
            }
        
            
        }

        return result;
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
       

        HashMap<Character,Integer> parsedWord = new HashMap<Character,Integer>();
        HashMap<HashMap<Character,Integer>,List<String>> finalList = new HashMap<HashMap<Character,Integer>,List<String>>();

        
        for(int i = 0; i < strs.length; i++){
            List<String> temp = new ArrayList<String>();
            parsedWord = evaluateWord(strs[i]);
            if(!finalList.containsKey(parsedWord)){
                temp.add(strs[i]);
                finalList.put(parsedWord, temp);
            }
            else{
                temp = finalList.get(parsedWord);
                temp.add(strs[i]);
                finalList.put(parsedWord, temp);
            }
            

        }
        Collection<List<String>> getValues = finalList.values();
        List<List<String>> listOfValues = new ArrayList<>(getValues);
       
   
        return listOfValues;
    }

    public static void main(String[] args){
        System.out.println(evaluateWord("eat"));
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
        
;
    }
}
