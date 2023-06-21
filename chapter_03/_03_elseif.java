package chapter_03;

public class _03_elseif {
    //조건문 else if
    public static void main(String[] args) {
        //한라봉 에이드가 있으면 주문
        // 없으면 망고주스
        //또없다면 아이스아메리카노

        boolean halla = false;// 한라봉 에이드
        boolean mango = true;// 망고 주스

        if(halla){
            System.out.println("한라봉에이드 주문");
        }
        else if (mango){
            System.out.println("망고주스 주문");
        }
        else{
            System.out.println("아이스 아메리카노 주문");
        }
        System.out.println("커피 주문 완료");
    }

}
