package day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class IOExam06 {
    public static void main(String[] args) throws Exception{

        URL url =new URL("https://www.naver.com/");


        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
