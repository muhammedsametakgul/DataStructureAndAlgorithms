package com.company;

import com.company.convert.Convert;

public class Main {

    public static void main(String[] args) {
    String ifade ="((A+B)*C-(D-E))^(F+G)";
        System.out.println(Convert.infixToPrefix(ifade));
    }
}
