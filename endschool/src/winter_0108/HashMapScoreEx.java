package winter_0108;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	public static void main(String[] args) {
		var a = new HashMap <String, Integer>();
		
		a.put("김성동", 97);
		a.put("황기태", 88);
		a.put("김남윤", 98);
		a.put("이재문", 70);
		a.put("한원선", 99);
		
		System.out.println("HashMay의 요소 개수 :"+a.size());
		
		Set<String> keys = a.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = a.get(name);
			System.out.println(name+" : "+score);
		}
	}
}