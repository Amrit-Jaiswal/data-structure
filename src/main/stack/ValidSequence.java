package com.example.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidSequence {
    private static Map<Character,Character> map = new HashMap<>();
    private static Map<Character,Character> reverse = new HashMap<>();

    public static void main(String[] args) {
        String str = "[[{}]()]";
        map.put('[',']');
        map.put('{','}');
        map.put('(',')');
        reverse.put(']','[');
        reverse.put('}','{');
        reverse.put(')','(');
        System.out.println(checkSequence(str));
    }

    private static boolean checkSequence(String str){

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (map.containsKey(ch)){
                stack.push(ch);
            }else {
                Character pop = stack.pop();
                char rev = getRev(ch);
                if(pop != rev){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static char getRev(char ch){
        return reverse.get(ch);
    }
}
