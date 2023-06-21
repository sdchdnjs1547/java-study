package chapter_03;

public class _02_els {
    public static void main(String[] args) {


    int hour=15;
    if(hour<14){ //15시 이전이면
        System.out.println("아이스 아메리카노+1");

    }
    else{
        System.out.println("아이스 아메리카노 디카페인 +1");
    }
        System.out.println("커피 주문 완료");
    //오후 2시 이후이거나 모닝 커피를 마신경우?
        hour= 10;
        boolean morningcoffee = false;
        if (hour>= 14||morningcoffee == true){
            System.out.println("아이스 아메리카도 (디카페인)+1");}
        else{
            System.out.println("아이스 아메리카노");
        }
}
}