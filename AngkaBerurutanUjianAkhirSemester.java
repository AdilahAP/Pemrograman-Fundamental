class AngkaBerurutanUjianAkhirSemester {
  public static void main(String[] args) {
    
    int[] data = {4,2,3,3,2,4,6,7,3,9};
    System.out.println(ujian(data));
    }
    public static int ujian(int[] data) {
      int count =1, max =1;
        for (int x = 1; x < data.length; x++) {
          if (data[x] > data[x - 1]) {
              count++;
          } else {
              count = 1;
          }
          if (count >= max) {
              max = count;
          }
        }
      return max;
  }
}