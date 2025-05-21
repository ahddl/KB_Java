package main.java.test0507.lambda;


@FunctionalInterface //함수형 인터페이스 설정
//추상 메서드를 하나만 가져야한다.
//표시 ( @, 엣 ) : Annotation(에노테이션, 애노테이션)
public interface Calculate {
    //일반적으로 interface에 선언된 함수는 다 public abstract
    void calculate(int a, int b);
    //void test(); 함수형 인터페이스는 추상 메서드 한개만!
}
