package winter_0108;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	static void printList(LinkedList<String>I) {
		Iterator<String> iterator = I.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext()) {
				separator = "->";
			}
			else
				separator = "\n";
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args) {
		var myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2,"아바타");
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "아바타")+1;
		System.out.println("아바타는 "+index+"번쨰 요소 입니다.");
	}
}
