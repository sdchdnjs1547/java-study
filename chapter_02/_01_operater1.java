package chap_02;

public class _01_operater1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산
        System.out.println(4+2);// 6
        System.out.println(4-2);//2
        System.out.println(4*4);//16
        System.out.println(16/4);//4
        System.out.println(16%3);

        //우선순위 연산
        System.out.println(2+2*4);

        //변수를 이용한 연산
        int a=20;
        int b=10;
        int c;
        c= a+b;

        System.out.println(c);
        c= a-b;
        System.out.println(c);

        c=a*b;
        System.out.println(c);

        c=a/b;
        System.out.println(c);

        //증감 연산
        int val;
        val = 10;
        System.out.println(val);
        val = val+1; // 10
        val++;
        ++val;
        --val;
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);
        System.out.println(val--);
        System.out.println(val);

        //은행 대기번호 표
        int waiting = 0;
        System.out.println("대기인원 : "+ waiting++);//대기 인원 :0
        System.out.println("대기인원 : "+ waiting++);//대기 인원 :1
        System.out.println("대기인원 : "+ waiting++);//대기 인원 :2
        System.out.println("총 대기인원 : "+ waiting);//대기 인원 :0


    }
}
