package main.java.test0416;

public class ArrayTest2 {
    public static void main(String[] args) {
        //2차원 배열 ><
        // 🔹1. 배열 만들때 값을 미리 알고 있는 경우
        int[][] seats = {
                {1, 2},
                //seats[0][0], seats[0][1]
                {3, 4, 5},
                //seats[1][0], seats[1][1], seats[1][2]
                {6, 7, 8, 9}
                //seats[2][0], seats[2][1], seats[2][2], seats[2][3]
        };
        System.out.println(seats.length); //행의 개수(3)
        System.out.println(seats[0].length); //1열의 개수(2)
        System.out.println(seats[0][0]); //1

        // 🔹2. 배열 만들때 값을 아직 모르고 있는 경우
        int[][] seats2 = new int[3][3]; //3 x 3
        int[][] seats3 = new int[3][]; //3 x ???
        seats3[0]=new int[] {1,2,3};
        seats3[1]=new int[] {1,2,3,4};
        seats3[2]=new int[] {1,2,3,4,5};
        System.out.println(seats3[2][4]); //5
    }
}
