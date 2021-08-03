package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(r.readLine());
        int divider = Integer.parseInt(r.readLine());

        try {
            checkNumber(num, divider);
        }
        catch (DivideByZeroException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void checkNumber(int num, int divider) {
        if (divider == 0){
            throw new DivideByZeroException("divider equals zero");
        }
        else {
            System.out.println(num / divider);
        }
    }
}
