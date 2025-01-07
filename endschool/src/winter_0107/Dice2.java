package winter_0107;

import java.util.Random;
import java.util.Scanner;

public class Dice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.print("플레이어 1의 이름을 입력하세요: ");
        String Name1 = sc.nextLine();
        System.out.print("플레이어 2의 이름을 입력하세요: ");
        String Name2 = sc.nextLine();

        int p1 = 0;
        int p2 = 0;
        while (true) {

            int p1d1 = ran.nextInt(6) + 1;
            int p1d2 = ran.nextInt(6) + 1;
            int player1Total = p1d1 + p1d2;

            System.out.println(Name1 + "의 주사위: " + p1d1 + ", " + p1d2 + " (합계: " + player1Total + ")");

            int p2d1 = ran.nextInt(6) + 1;
            int p2d2 = ran.nextInt(6) + 1;
            int player2Total = p2d1 + p2d2;

            System.out.println(Name2 + "의 주사위: " + p2d1 + ", " + p2d2 + " (합계: " + player2Total + ")");

            if (player1Total > 10 && player2Total > 10) {
                System.out.println("무승부! 둘 다 10을 넘었습니다.");
            } else if (player1Total > 10) {
                System.out.println(Name1 + " 승리!");
                p1++;
            } else if (player2Total > 10) {
                System.out.println(Name2 + " 승리!");
                p2++;
            } else {
                System.out.println("무승부! 둘 다 10 이하입니다.");
            }

            System.out.print("게임을 계속하시겠습니까? (y/n): ");
            String Again = sc.nextLine();
            if (Again.equals("n")) {
            	
                break;
            }
        }

        System.out.println("게임을 종료합니다.");
        System.out.println(Name1+"의 승리는 "+p1+"번 입니다.");
        System.out.println(Name2+"의 승리는 "+p2+"번 입니다.");
        sc.close();
    }
}

