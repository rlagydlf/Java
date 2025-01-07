package winter_0107;

import java.util.HashMap;
import java.util.Scanner;

public class HMDEx {
	public static void main(String[] args) {
		var dic = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		dic.put("one", "일");
		dic.put("two", "이");
		dic.put("three", "삼");
		
		String a = "";
		while(true) {
			System.out.println("궁금한 단어를 입력하세요. (종료를 입력해서 종료하세요.)");
			 a = sc.nextLine();
			 if(a.equals("종료")) {break;}
			 if(dic.get(a) == null)
			 System.out.println(a+"는 없는 단어 입니다.");
			 else
			 System.out.println(dic.get(a));
		}
		
		sc.close();
	}
}
