package chapter_03;

public class _05_formoon {
    //반복문 for
    //나이키 매장
    public static void main(String[] args) {
//        System.out.println("어서오세요 나이키 매장입니다");
//        //또다른 손님이 오면>
//        System.out.println("어서오세요 나이키 매장입니다");
//        System.out.println("어서오세요 나이키 매장입니다");
//        System.out.println("어서오세요 나이키 매장입니다");
//        System.out.println("어서오세요 나이키 매장입니다");
//        System.out.println("어서오세요 나이키 매장입니다");
//        //만약에 인사 법이 바뀌면?
//        System.out.println("환영합니다 나이키 매장입니다");
//        System.out.println("환영합니다 나이키 매장입니다");
//        System.out.println("환영합니다 나이키 매장입니다");
//        System.out.println("환영합니다 나이키 매장입니다");
//        //매장이름이 바뀌면>아디다스
//        System.out.println("환영합니다 아디다스 매장입니다");
//        System.out.println("환영합니다 아디다스 매장입니다");
//        System.out.println("환영합니다 아디다스 매장입니다");
//        System.out.println("환영합니다 아디다스 매장입니다");
        //반복문 사용
        for (int i = 0; i < 10; i++) {
            System.out.println("환영합니다 나이키 매장입니다");
        }
        //짝수만 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        //홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
        //거꾸로
        for (int i = 20; i>0; i--){
            System.out.print(i);
    }
        int sum = 0;
        for(int i=0; i<=10; i++){
            sum +=i;
            System.out.println(i+"까지 숫자의 합은"+sum+"입니다");
        }
        System.out.println("총합은"+sum+"입니다");
    }
}
