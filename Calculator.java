package winter_0106;

import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("첫번째 숫자를 입력해주세요 (종료하려면 'q' 입력): ");
                String input = sc.next();
                if (input.equals("q")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                int num1 = Integer.parseInt(input);

                System.out.print("연산자를 입력해주세요 (+, -, *, /): ");
                String a = sc.next();

                System.out.print("두번째 숫자를 입력해주세요: ");
                String input2 = sc.next();
                int num2 = Integer.parseInt(input2);

                switch (a) {
                    case "+":
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        break;
                    case "-":
                        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                        break;
                    case "*":
                        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("0으로 나눌 수 없습니다.");
                        } else {
                            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        }
                        break;
                    default:
                        System.out.println("올바른 연산자가 아닙니다.");
                        break;
                }
            } catch (NumberFormatException e) {//int 형식에 맞지 않으면 오류메세지
                System.out.println("올바른 숫자를 입력해주세요.");
                sc.next(); //버퍼 비우기
            }
        }
        sc.close();
    }
}
