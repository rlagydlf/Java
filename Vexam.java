package winter_0106;

import java.util.Vector;


public class Vexam {
    public static void main(String[] args) {


        Vector<Integer> v = new Vector<Integer>(7);

        v.add(5);
        v.add(4);
        v.add(-1);

        v.add(2,100);

        System.out.println("백터 내의 요소 객체 수 : "+v.size());
        System.out.println("백터의 현재 용량 : "+v.capacity());
        int sum = 0;
        for(int i = 0; i<v.size();i++){
            int n = v.get(i);
            System.out.println(n);
            
            sum+=n;
        }
        System.out.println("백터에 있는 정수의 합 : "+sum);
    }
}
