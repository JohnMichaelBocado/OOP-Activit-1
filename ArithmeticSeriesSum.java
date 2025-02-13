/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticseriessum;

import java.util.Scanner;

/**
 *
 * @author BOCADO_CpE121
 */

public class ArithmeticSeriesSum {

    private int upperLimit;

    public ArithmeticSeriesSum(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public int getSeriesSum() {
        return (upperLimit * (upperLimit + 1)) / 2;
    }

    public void displaySum() {
        System.out.printf("The sum of the arithmetic series from 1 to %d is: %d%n", upperLimit, getSeriesSum());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the upper limit of the series: ");
        int userInput = scanner.nextInt();
        scanner.close();

        ArithmeticSeriesSum seriesSum = new ArithmeticSeriesSum(userInput);
        seriesSum.displaySum();
    }
}