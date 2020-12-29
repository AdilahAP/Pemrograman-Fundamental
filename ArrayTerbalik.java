import java.util.Scanner;

class ArrayTerbalik {
  public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
      int angka[] = new int[5];
      for (int a = 0; a < angka.length; a ++) {
          angka[a] = input.nextInt();
      }
      for (int a = 4; a >= 0; a--) {
          System.out.println(angka[a]);
      }
  }
}