package com.java.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
        //num1,operator,num2
        //num1에 받은 수 실수로 double 할당 연산자도 num도 할당 연산자는 문자로 저장
        // +일때, -일때, *일때, / 일때 경우 나눠서 계산 후 반환
        //0이거나 무한대일때 예외처리
        while (true) {
            System.out.println("숫자를 입력하세요: ");
            String number1 = input.nextLine();
            try {
                double num1 = Double.parseDouble(number1);
            } catch (NumberFormatException nfe) {
                System.out.println("잘못된 입력입니다");
                break;
            }


            System.out.println("연산자를 입력하세요: ");
            String operator = input.nextLine();

            System.out.println("숫자를 입력하세요: ");
            String number2 = input.nextLine();
            try {
                double num2 = Double.parseDouble(number2);
            } catch (NumberFormatException nfe) {
                System.out.println("잘못된 입력입니다");
                break;

            }


            double result = 0;
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            boolean isTrue = true;
            switch (operator) {

                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/": {
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Invalid value 입니다.");
                    }
                    result = num1 / num2;
                    break;

                }
                default:
                    isTrue = false;

                    break;

            }
            if (input.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");

                break;

            }
            if (isTrue = true) {
                System.out.printf("결과는 %f 입니다.\n", result);
            }else {
                System.out.println("잘못된 연산자입니다");
            }
            System.out.println("-".repeat(30));
        }
    }
}