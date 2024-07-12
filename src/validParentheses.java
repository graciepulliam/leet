
import java.util.Stack;
import java.util.HashMap;
public class validParentheses{

    public static boolean validate(String text){

        String[] parsedString = text.split("");
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        var stack = new Stack<>(){};
        for(int i =0; i < parsedString.length; i++){
            map.put(i, parsedString[i]);    
            System.out.println(parsedString[i]);
            if(i==0 && (parsedString[i]=="}" || parsedString[i]=="]" || parsedString[i]==")")){
                return false;
            }
            else if (parsedString[i]=="{" || parsedString[i]=="[" || parsedString[i]=="("){
                stack.push(parsedString[i]);
            }
        }
        return true;
    }
    public static void main(String[] args){
    validate("hello world");
    }
}