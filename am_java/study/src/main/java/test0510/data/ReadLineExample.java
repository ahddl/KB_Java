package main.java.test0510.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("c:/TEMP/Hello.java");
            BufferedReader bs = new BufferedReader(reader);
            //buffer(버퍼, 임시기억장치, 많은 양을 넣을 수 있음.
            while(true) {
                String string = bs.readLine();
                if(string == null) {break;}
                System.out.println(string);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("읽어올떄 에러 발생");
        }
    }
}
