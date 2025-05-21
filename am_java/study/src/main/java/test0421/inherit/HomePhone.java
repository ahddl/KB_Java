package main.java.test0421.inherit;

public class HomePhone extends Phone {

    //메서드 이름 쓰고 엔터 -> 오버라이드 자동 생성
    @Override //표시(annotation)가 붙음
    //Phone에 있는 bell() 동일한지 확인해줌
    public void bell() {
        System.out.println("따르릉 따르릉 울리다");
    }

    @Override
    public void hangUp() {
        System.out.println("철컥 전화기를 내리다.");
    }
}
