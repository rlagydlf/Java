package winter_0108;

import java.util.*;

public class HashMapStudentEx {
	public static void main(String[] args) {
		var map = new HashMap<String,Student1>();
		map.put("황기태", new Student1(1,"010-1111-1111"));
		map.put("이재문", new Student1(2,"010-2222-2222"));
		map.put("김남윤", new Student1(3,"010-3333-3333"));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 이름?");
			String name = sc.nextLine();
			if(name.equals("종료")) {
				System.out.println("종료합니다...");
				break;
			}
			Student1 student = map.get(name);
				if(student ==null)
					System.out.println(name+"은 없는 사람입니다.");
				else
					System.out.println("id:"+student.id+", 전화:"+student.tel);
			}
		sc.close();
	}
}
class Student1{
	int id;
	String tel;
	public Student1(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}
