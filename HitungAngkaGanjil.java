import java.io.*;
import java.util.Scanner;

class HitungAngkaGanjil {
  public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      int angka = 0;
      int totalganjil = 0;
      try {
        while (true) {
          angka = input.nextInt();
          if (angka % 2 != 0) {
            totalganjil++;
          }
        }
      }
      catch (NumberFormatException ex) {
        System.out.print( totalganjil);
      }
      
      catch (Exception ex) {
        System.out.print( totalganjil);
      }
  }
}