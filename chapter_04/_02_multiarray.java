package chapter_04;

public class _02_multiarray {
    public static void main(String[] args) {
        //다차원 배열
        //영화관 좌석
        //a1~a5
        //b1~b5
        //c1~c5
        String[] seata ={"a1","a2","a3","a4","a5"};
        String[] seatb ={"b1","b2","b3","b4","b5"};
        String[] seatc ={"c1","c2","c3","c4","c5"};
        //3x5 2차원 배열
        String[][] seats= new String[][]{
                {"a1","a2","a3","a4","a5"},
                {"b1","b2","b3","b4","b5"},
                {"c1","c2","c3","c4","c5"}
        };
        //첫줄에는 3칸(a3), 둘쨰줄은 2칸(b2), 세쨰줄은 1칸(c1)
        System.out.println(seats[0][4]);
        System.out.println(seats[1][1]);
        System.out.println(seats[2][0]);
    }
}
