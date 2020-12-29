import java.util.*;

class HitungAngkaGanjilPart2 {
  public static void main(String[] args) {
    
   int baris, kolom, ganjil = 0;
      Scanner input = new Scanner(System.in);
      baris = input.nextInt();
      kolom = input.nextInt();
      int angka[][] = new int[baris][kolom];
      for (int a = 0; a < baris; a++) {
          for (int b = 0; b < kolom; b++) {
              angka[a][b] = input.nextInt();
          }
      }
        
      for(int x = 0; x < baris; x++) {
          ganjil = 0;
          for(int y = 0; y < kolom; y++) {
              if (angka[x][y] % 2 != 0) {
                ganjil++ ;
              }
          }
          System.out.print(ganjil);
      }
  }
}