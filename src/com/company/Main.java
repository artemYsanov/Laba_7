package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = userInput ("x-");
        if (x < 0) {
            System.out.println ("x < 0");
        } else {
            int y = userInput ("y-");
            if (y < 0) {
                System.out.println ("y < 0");
            } else {
                int z = userInput ("z-");
                if (z < 0) {
                    System.out.println ("z < 0");
                } else
                {
                    Formula giu = new Formula (x, y, z);
                    giu.displayFormula ();
                }
            }
        }
    }
    static class Formula {
        float x;
        float y;
        float z;
        public Formula(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public void displayFormula() {
            double l = Math.sqrt ((Math.pow (x, 2) + (Math.pow (y, 2)) + (Math.pow (z, 2))));
            System.out.println (l);
        }
    }
    private static int userInput(String message) {
        Scanner sc = new Scanner (System.in);
        int i;
        while (true) {
            System.out.print (message);
            try {
                i = Integer.parseInt (sc.next ());
                break;
            } catch (NumberFormatException e) {
                System.out.println ("Неверный ввод!");
            }
        }
        return i;
    }
}