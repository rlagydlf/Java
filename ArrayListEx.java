package winter_0107;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var a = new ArrayList <String>();
		
		for(int i = 0; i<4; i++) {
			System.out.print("이름을 입력하세요>>");
			a.add(sc.nextLine());
		}

			int longest = 0;
		for(int i = 1; i<a.size(); i++) {
			if(a.get(longest).length()<a.get(i).length()) {
				longest = i;
			}
			
		}
		System.out.println(a);
		System.out.println(a.get(longest));
		sc.close();
	}
	
}