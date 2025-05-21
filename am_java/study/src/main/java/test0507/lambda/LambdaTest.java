package main.java.test0507.lambda;

public class LambdaTest {
    public static void main(String[] args) {
//        action(new Calculate() {
//            @Override
//            public void calculate(int a, int b) {
//
//            }
//        }); 이걸 더 간단히 하는거 람다식

        action((x, y) -> {
            int result = x + y;
            System.out.println("result :" + result);
        });
        action((x, y) -> {
            int result = x - y;
            System.out.println("result :" + result);
        });

    }

    public static void action(Calculate calculate) {
        int x = 10;
        int y = 4;

        calculate.calculate(x, y);
    }
}
