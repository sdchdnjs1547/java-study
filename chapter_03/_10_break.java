package chapter_03;

public class _10_break {
    //break
    public static void main(String[] args) {
        //치킨집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
        //손님 50명 대기
        int max =20;
        for (int i = 1; i <=50 ; i++) {
            System.out.println(i+"번 손님 주문하신 치킨이 나왔습니다");
            if(i==max){
                System.out.println("금일 재료가 소진 되었습니다");
                break;
            }

        }
        System.out.println("영업 종료");
    }
}
