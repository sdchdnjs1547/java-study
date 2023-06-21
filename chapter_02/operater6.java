package chap_02;

public class operater6 {
    //어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그래밍
    public static void main(String[] args) {
        int height1 = 115; // 첫 번째 어린이의 키
        int height2 = 121; // 두 번째 어린이의 키

        if (height1 >= 120) {
            System.out.println("첫 번째 어린이는 놀이기구에 탑승할 수 있습니다.");
        } else {
            System.out.println("첫 번째 어린이는 놀이기구에 탑승할 수 없습니다.");
        }

        if (height2 >= 120) {
            System.out.println("두 번째 어린이는 놀이기구에 탑승할 수 있습니다.");
        } else {
            System.out.println("두 번째 어린이는 놀이기구에 탑승할 수 없습니다.");
        }


    }
}
