package com.company.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Convert {
    public static String infixToPrefix(String str) {
        Stack<Character> operators = new Stack<>(); //Operators = */-^+ ...
        Stack<String> operands = new Stack<>();//Operands = 123456789...
        for (int i = 0; i < str.length(); i++) {


            if (str.charAt(i) == '(') {
                operators.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                while (!operators.empty() &&
                        operators.peek() != '(') {//stack peek stackdaki son elemana ulaşmak amacıyla kullanılır. Eğer son eleman ( değilse arada başka operator/ler vardır ona göre işlem yapılır

                    // operand 1
                    String op1 = operands.peek();
                    operands.pop();

                    // operand 2
                    String op2 = operands.peek();
                    operands.pop();

                    // operator
                    char op = operators.peek();
                    operators.pop();//(5+3) gibi işlemini +53 yapma işlemi burada yapıldı

                    String tmp = op + op2 + op1;
                    operands.push(tmp);
                }

                operators.pop();
            }

            else if (!isOperator(str.charAt(i))) {
                operands.push(str.charAt(i) + "");
            }

            else {
                while (!operators.empty() &&
                        priority(str.charAt(i)) <=
                                priority(operators.peek())) {

                    String op1 = operands.peek();
                    operands.pop();

                    String op2 = operands.peek();
                    operands.pop();

                    char op = operators.peek();
                    operators.pop();

                    String tmp = op + op2 + op1;
                    operands.push(tmp);// Eğer elimizdeki operantın önceliği stackdekinden düşükse stackdeki çıkarılır ifadeye eklenir elimizdeki de stack yapısına eklenir

                }

                operators.push(str.charAt(i));
            }
        }

        //Son olarak elimizde olanları Operator stackten Operand Stack  katıyoruz ve sonucunda bir ifade elde ediyoruz
        while (!operators.empty()) {
            String op1 = operands.peek();
            operands.pop();

            String op2 = operands.peek();
            operands.pop();

            char op = operators.peek();
            operators.pop();

            String tmp = op + op2 + op1;
            operands.push(tmp);
        }

        return operands.peek(); //Operand stackte biriken işlemler sonrası en sonda ifade elde ettik onu return ederek metodumuzu bitiriyoruz
    }


    public static boolean isOperator(char c){
        return (!(c >= 'a' && c <= 'z') &&
                !(c >= '0' && c <= '9') &&
                !(c >= 'A' && c <= 'Z'));

        // yukarıdaki aralıklar hariç diğer ifadeler operatorlere denk gelmektedir
        //Yukarıd bunun kontrolü yapıldı
    }


    public static int priority(char c){
        //Öncelik belirleme
        if (c == '-' || c == '+')//toplama çıkarma
            return 1;
        else if (c == '*' || c == '/')//çarpma bölme
            return 2;
        else if (c == '^')//Üs alma ifadesi
            return 3;
        return 0;
    }
}
