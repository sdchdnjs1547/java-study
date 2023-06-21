package chapter_03;

public class _08_nestedloop {

    public static void main(String[] args) {
        //이중 반복문

        // 별(*) 사각형 만들기
//        for (int i= 0; i<5;i++){
//            for (int j=0; j<5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 5; i++) {
            for(int j=0; j<i+1; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
