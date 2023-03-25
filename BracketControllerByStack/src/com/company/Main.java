package com.company;

public class Main {

    public static void main(String[] args) {
        String ifade = "2*[{(i + 5*(7 – j / (4 * k)))}] ";
        boolean sonuc = BracketController.kontrolEt(ifade);
        System.out.println("Denge Durumu " + sonuc);

        System.out.println("Denge Durumu :" + BracketController.kontrolEt2(ifade));
    }
}
