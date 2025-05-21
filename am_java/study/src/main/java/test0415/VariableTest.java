package main.java.test0415;  //;(세미콜론) 생략불가능, Package 맨위

//int x = 100; // 모든 변수는 class 안으로 들어가야함.
public class VariableTest {
    public static void main(String[] args) {
        // 이부품은 독립적으로 실행할 수 있는 부품이 됨.
        // 함수인데, 만약에 함수가 여러개인 경우 무조건 main()을 호출!
        // 타입 변수명; --> 변수가 생성됨. 선언!
        //자바는 변수에 들어갈 타입이 선언할 때 결정 (정적 타입핑)
        // 기본형 4가지 : 정수, 실수, 문자1, 논리
        // 정수 : byte(1), short(2), int(4), long(8)
        byte age = 127;  //변수는 소문자로 시작해주세요!
        short year = 2025;
        int hit = 210000000;
        long money = 2200000000000L; //l

//        int x; // 쓰레기 값
//        x = 100;
//        자바는 반드시 변수 만들 때 처음값을 넣어주는 습관을 가지세요!!

        //실수 : float(소수점 7, 4 바이트), double(15,8바이트)
        float w = 70.5F; //f
        double h = 170.0000000555;

        //문자1: char
        char gender = '여'; // ' 홑따옴표

        //논리형 : boolean
        boolean food = true; //false

        System.out.println("내 나이는 "+age+"살이야.");
        //+연산자가 하나라도 문자열이면 결과는 String(결합연산자)
        System.out.println("내 몸무게 " + w + "kg이야.");
        System.out.println("내 성별은 " + gender + "자야.");
        System.out.println("나는 오늘 아침을 먹었을까? " + food);

        String name = " 김국민"; // " 이중 따옴표
        String plan = """
                나는
                훌륭한
                자바 개발자가 되리라!!""";
        System.out.println("내 이름은" + name);
        System.out.println("내 계획은 " + plan); // 한줄 복사 (ctrl + D)
        System.out.printf("내 이름은 %s 이야!", name);
        System.out.printf("내 몸무게는 %.2f, 내 키는 %10.3f 이야!", w,h);
    }
}
