package chap_02;

public class operater4 {
    //논리 연산자
    public static void main(String[] args) {
        boolean 김치찌개 =true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개||계란말이||제육볶음);//3개중에 참이면 이 결과는 참이다
        System.out.println(김치찌개&&계란말이&&제육볶음);//3개 모두가 존재시 true


        System.out.println((5>3)&&(3>1));//두식 모두 true
        System.out.println((5>3)&&(3<1));//두식 모두 false
        System.out.println((5>3||(3<1)));// 두식중 하나만 참이면 true

        //논리 부정 연산자
        System.out.println(!true);// false
        System.out.println(!false);//false
        System.out.println(!(5 == 5));//false
        System.out.println(!(5<3));//true


    }
}
