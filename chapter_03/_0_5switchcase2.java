package chapter_03;

public class _0_5switchcase2 {
    //switchcase 2
    public static void main(String[] args) {
        //중고 상품의 등급에 따른 가격을 책정 (1급: 최상 4급: 최하)
        int grade = 2;//등급
        int price = 7000;
        switch (grade) {
            case 1: {
                price += 1000;
            }
            case 2: {
                price += 1000;
            }
            case 3: {
                price += 1000;
                break;
                    }
                }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
            }
        }