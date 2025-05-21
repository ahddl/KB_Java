package main.java.test0415;

public class CastingTest {
    public static void main(String[] args) {
        byte age = 127;
        int age2 = age; //4바이트 <--자동으로 형변환(자동형변화)--- 1 바이트

        byte age3 = (byte)age2; //1바이트 <--강제형 변환 -- 4바이트

        // 기본형끼리의 타입변환은 큰지 작은지만 판단하면 가능!!

        //기본형과 다른 형태로 변환시!
        //<input name="age" value="100"> --> String 으로 인식 !
        String data = "100"; //입력데이터는  String으로 인식함'
        int num = Integer.parseInt(data); //기본형 <-- 기본형X (String은 참조형)
//        부품을 이용해주어야함 (Integer.parse*Int())
        System.out.println("내년 나이는 " + (num+1)); //101

        String data2 = "11.11";
        double num2 = Double.parseDouble(data2);

        //숫자를 문자열로 바꾸고 싶은 경우 (=로 안됨)
        //문자열 변수에 들어있는 걸을 기본형 변수에 바로 넣을 수 없음
        //기본형 변수에 들어있는 것을 문자열변수에 넣을 수 없다
        //부품을 써야한다!
        
        String data3 = String.valueOf(num2);
    }
}
