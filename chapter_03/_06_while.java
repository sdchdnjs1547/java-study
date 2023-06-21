package chapter_03;

public class _06_while {
    //while문
    public static void main(String[] args) {
        int distance = 25; //전체 거리는 25m
        int move=0;//현재 이동거리
        while (move < distance){//현재 이동거리가 전체 거리보다 작다는 조건이 참인 경우 반복
            System.out.println("발차기를 계속한다");
            System.out.println("현재 이동거리 "+move+"m");
            move +=3;// 3미터 이동
        }
        System.out.println("도착");
    }
}
