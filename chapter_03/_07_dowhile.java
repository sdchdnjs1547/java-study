package chapter_03;

public class _07_dowhile {
    //do while
    public static void main(String[] args) {
        int distance = 25;// 전체 이동거리 25mm
        int move = 0;// 현재 이동거리 0m
        int height = 2;//키 2m
        while (move+height < distance){
            System.out.println("발차기를 계속한다");
            System.out.println("현재 이동거리는 "+move);
            move +=3;// 3m 이동
        }
        System.out.println("도착했습니다");
        System.out.println("---반복문끝----");
       //do while 문
        do{
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 :"+move);
            move +=3;
        }while (move + height<distance);
        System.out.println("도착했습니다");
    }


}


