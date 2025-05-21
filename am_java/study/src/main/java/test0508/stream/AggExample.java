package main.java.test0508.stream;

import java.util.Arrays;

public class AggExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        //스트림으로 만들어라 -> 중간처리(filter, map) -> 집계처리(sum, avg , ...)

        //1. 개수
        long count = Arrays.stream(arr)
                .filter(n-> n%2==0)
                .count();
        System.out.println("2의 배수의 개수: "+ count);
        //2. 합계
        long sum = Arrays.stream(arr)
                .filter(n-> n%2==0)
                .sum();
        System.out.println("2의 배수의 합계: "+ sum);
        //3. 평균
        //average()까지하면 리턴 타입이 OptionalDouble타입임
        //결과가 있으면 꺼내오고, 없으면 기본값을 설정 가능함
        double avg = Arrays.stream(arr)
                .filter(n->n%2==0)
                .average()
                .getAsDouble();
        /*
        Stream에서는 sum(), count()이외에는
        결과값이 없을 수도 있기 때문에
        있을 때는 꺼내오고, 없을 때는 기본값을 설정할 수 있는
        타입인 Optional~~~타입이 리턴됨.
        있는 경우 해당 결과값을 꺼내고 싶으면 한번 더
        메서드를 써서 결과값을 꺼내주어야함 --> .getAsDouble();
        */
        System.out.println("2의 배수의 평균: "+ avg);
        //4. 최대값
        //5. 최소값

    }
}
