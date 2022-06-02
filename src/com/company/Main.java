package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FormulaException {
        System.out.println("Введите x:");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Введите y:");
        int y = new Scanner(System.in).nextInt();
        System.out.println("Введите z:");
        int z = new Scanner(System.in).nextInt();
        Formula formm = new Formula(x, y, z);
        formm.displayFormula(x, y, z);
    }
}
class Formula {
    float x;
    float y;
    float z;

    public Formula(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void displayFormula(int x, int y, int z) throws FormulaException {
        if (x<0|y<0|z<0) throw new FormulaException("Вы ввели число меньше 0",x);
        double l = Math.sqrt((Math.pow(x, 2) + (Math.pow(y, 2)) + (Math.pow(z, 2))));
        System.out.println(l);
    }
}
class FormulaException extends Exception {
    private float number1;
    public float getNumber1() {
        return number1;
    }
    public FormulaException(String message, float x) {
        super(message);
        number1 = x;
    }
}