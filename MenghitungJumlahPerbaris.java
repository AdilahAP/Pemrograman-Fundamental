import java.util.Scanner;

class MenghitungJumlahPerbaris {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    int matriks[][] = new int[5][5];
    for (int x = 0; x < 5; x++){
      for (int y = 0; y < 5; y++){
        matriks[x][y] = input.nextInt();
      }
    }  
    
    int a = 0;
    for (int x = 0; x < 5; x++){
      for (int y = 0; y < 5; y++){ 
        a += matriks[x][y];
      }
    
      System.out.println(a);
      a = 0;
    }
  }
}