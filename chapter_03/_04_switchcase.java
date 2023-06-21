package chapter_03;

public class _04_switchcase {
    //switch case
    public static void main(String[] args) {
        //1등 전액 장학금
//        2등 : 반액 장학금
//        3등 반액 장학금
//        그외 :장학금대상 아님
//        int ranking = 2;//등수
//        if(ranking==1){
//            System.out.println("전액장학금");
//        }
//        else if(ranking==2){
//            System.out.println("반액 장학금");
//        }
//        else if(ranking==3){
//            System.out.println("반액 장학금");
//        }
//        else {
//            System.out.println("장학금 대상 아님");
//        }
//        System.out.println("조회 완료");
//    }
        //switch문 사용
        int ranking = 4;//등수
    switch(ranking){
        case 1:
            System.out.println("전액장학금");
            break;
        case 2:
            System.out.println("반액 장학금");
            break;
        case 3:
            System.out.println("반액 장학금");
            break;
        case 4:
            System.out.println("대상 아님");
            break;
    }
        System.out.println("조회 완료");
    }
}
