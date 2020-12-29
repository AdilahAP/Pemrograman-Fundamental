import java.util.Scanner;

class ArrayTerbalik2 {
  public static void main(String[] args) {
     
      Scanner input = new Scanner(System.in);
      int angka = input.nextInt();
      int jumlah[] = new int[angka];
      
      for (int x = 0; x < jumlah.length; x++) {
          jumlah[x] = input.nextInt();
      }
      for (int y = angka - 1; y >= 0; y--) {
          System.out.print(jumlah[y]);
      }
  }
}