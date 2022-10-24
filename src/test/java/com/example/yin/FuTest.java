package com.example.yin;

import java.util.ArrayList;
import java.util.HashMap;

public class FuTest {

    public static void main(String[] args) {

        new HashMap<>();
        new ArrayList<>();
        // 猜猜打印的内容
        Zi zi = new Zi();
    }

    static class Fu {
        int a = 10;

        public void printA() {
            System.out.println("Fu PrintA:" + a);
        }

        public Fu() {
            printA();
        }
    }

    static class Zi extends Fu {
        int a = 20;

        @Override
        public void printA() {
            System.out.println("Zi PrintA:" + a);
        }

        public Zi() {
            printA();
        }
    }
}