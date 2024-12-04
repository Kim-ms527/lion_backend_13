package day03;

public class Gugudan2 {
    public static void main(String[] args) {
     a: for(int i = 1; i <= 9; i++){
          for(int j = 2; j <= 9; j++){
              if(j == 5) break a ;
              System.out.print(j + "*" + i +" = "+(j*i)+"  \t");
          }
          System.out.println();
      }
    }
}
