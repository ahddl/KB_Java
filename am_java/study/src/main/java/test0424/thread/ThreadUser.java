package main.java.test0424.thread;

public class ThreadUser {
    public static void main(String[] args) {
        //스레드 객체 생성
        Thread1 t1 = new Thread1();
        //왼쪽(부모)=오른쪽(자식) : 자동형변환, 업캐스팅
        Thread2 t2 = new Thread2();
        //익변 클래스(run()메서드를 재정의한 클래스) ->  이걸 많이 씀
        Thread t3 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i > 100; i++) {
                    System.out.println("신나유");
                }
            }
        };

        //cpu 스케줄러의 대기 줄 등록
        t1.start();
        t2.start();
        t3.start();
    }
}
