package chapter_03;

public class _01_if {
    public static void main(String[] args) {
        int hour =10;
        if (hour<14)
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        System.out.println("커피 준비 완료");
        boolean morningcoffee =false;
        hour =10;
        if(hour <14 && !morningcoffee == false){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 준비 완료");
    }
}
