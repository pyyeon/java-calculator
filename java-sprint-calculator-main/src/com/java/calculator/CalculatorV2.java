package com.java.calculator;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        String number1 = input.nextLine();

        System.out.println("연산자를 입력하세요: ");
        String operator = input.nextLine();

        System.out.println("숫자를 입력하세요: ");
        String number2 = input.nextLine();
        //.은 하나만 있거나 없거나 .개수가 1이하일 경우
    }

    public static boolean validate(String num1, String op, String num2) {

    }
    public static boolean isValidDigitString(String formula) {
      // formula = "1234" 순회해사 검증해야함
        String digit = "123456789.";
        int dotCount = 0;
        for(char c; formula.toCharArray()){
            if (digit.indexOf(c) == -1){
                return false;
            }
            if (c == '.'){
                dotCount++;
            }
        }
        return dotCount <= 1;

    }
    //validate 코드



    public boolean isValidOperator(String formula) {
        String operators = "+-*/";
        int operatorCount = 0;
        for (char c : formula.toCharArray()){
            if (operators.indexOf(c) != -1){
                operatorCount++;
            }
        }
    }
}
