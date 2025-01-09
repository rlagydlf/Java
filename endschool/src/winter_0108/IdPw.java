package winter_0108;

import java.util.HashMap;
import java.util.Scanner;

public class IdPw {
    public static void main(String[] args) {
       
    	var user = new HashMap<String, String>();
        user.put("abc", "1234");
        user.put("efg", "5678");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("로그인 하시겠습니까?(y or n): ");
            String choice = sc.nextLine();

            if (choice.equals("n")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice.equals("y")) {
                System.out.print("id: ");
                String id = sc.nextLine();

                

                System.out.print("pw: ");
                String pw = sc.nextLine();

                if (!user.containsKey(id)) {	
                    System.out.println("아이디가 존재하지 않습니다.");
                    continue;
                }
                
                if (user.get(id).equals(pw)) {
                    System.out.println("로그인 성공!");
                    break;
                } else {
                    System.out.println("비밀번호 불일치");
                }
            } else {
                System.out.println("잘못된 입력입니다. y 또는 n을 입력하세요.");
            }
        }

        sc.close();
    }
}

