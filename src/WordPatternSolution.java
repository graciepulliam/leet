import java.util.*;
public class WordPatternSolution {

    public static boolean wordPattern(String pattern, String s) {

        HashMap<Character,Integer> charPattern = new HashMap<Character,Integer>();
        HashMap<String,Integer> stringPattern = new HashMap<String,Integer>();
        int charToInt = 0;
        int wordToInt = 0;
        String[] stringArray = s.split(" ");
        HashMap<Integer,Integer> charForm = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> stringForm = new HashMap<Integer,Integer>();

        
        if(stringArray.length != pattern.length()) {
            return false;

        }
        else{

            for(int i = 0; i < pattern.length(); i++) {
                if(!charPattern.containsKey(pattern.charAt(i))) {
                    charPattern.put(pattern.charAt(i), charToInt);
                    charToInt++;
                }
                if(!stringPattern.containsKey(stringArray[i])) {
                    stringPattern.put(stringArray[i],wordToInt);
                    wordToInt++;
                }
                charForm.put(i,charPattern.get(pattern.charAt(i)));
                stringForm.put(i, stringPattern.get(stringArray[i]));
            }

        }
        if(charForm.equals(stringForm)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("jquery", "jquery"));


    }
    
}
