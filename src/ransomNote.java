import java.util.*;

public class ransomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        //create a dictionary that contains the char as the key and the number of times that char is used in the magazine as the value
        HashMap<Character,Integer> availableLetters = new HashMap<Character,Integer>();

        //iterate through the length of the magazine and store each letter in the dictionary
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);

            //if the character is not present in the dictionary then add it and set the count to one
            //if it is present then add it to the dictionary and increment the count by one
            if(!(availableLetters.containsKey(c))) {
                availableLetters.put(c,1);
            }
            else{
                availableLetters.put(c,availableLetters.get(c)+1);
            }
        }

        //iterate through each character of the ransom note
        for(int i = 0; i < ransomNote.length(); i++) {

            char c  =  ransomNote.charAt(i);
            

            //if the character is present in the dictionary AND it has a count greater than zero, then decrement its count
            //else the character is not present in the dictionary or there are no instances left to use so return false
            if(availableLetters.containsKey(c) && availableLetters.get(c) > 0){
                availableLetters.put(c,availableLetters.get(c)-1);
            }
            else{
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args){

        boolean check = canConstruct("a","b");
        System.out.println(check);

    }
}
