package com.company;

import java.util.Stack;

public class BracketController {

    //This code shows if we have closed all bracket() correctly and in correct number
    public static boolean kontrolEt(String karekter){
        Stack<Character> stack = new Stack<>();

        //tüm ifadeyi dolaşma
        for(int i=0;i<karekter.length();i++){
            char c =karekter.charAt(i);
            if(c == '('){
                stack.push(c);
            }else if(c==')'){
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }


    //This code shows that if we have closed all brackets in their same kind and enough amount of brackets
    public static boolean kontrolEt2(String ifade){
        Stack<Character> stack = new Stack<>();

        //tüm ifadeyi dolaşma
        for(int i=0; i<ifade.length();i++){
            char c=ifade.charAt(i);
            if(c== '(' || c=='[' || c== '{'){
                stack.push(c);
            }else if(c== ')' || c== '}' || c== ']'){
                if(stack.isEmpty()){
                    return false;
                }else{
                    //eğer stackten çekilen karekter ile ifadeden gelen karekter denk değilse false döndürür
                    char usttenGelen=stack.pop();
                    if((c==')' && usttenGelen !='(') || (c=='}' && usttenGelen!='{') || (c==']' && usttenGelen!='[')){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();

    }
}
