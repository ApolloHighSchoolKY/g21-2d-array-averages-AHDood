public class Gee21{
  public static void main(String[] args){

    int[][] ray = new int[7][7];
    
    //Populate the array with sequential numbers
    /*
      1  2  3  4  5  6  7
      8  9  10 11 12 13 14
      15 16 17 18 19 20 21
      22 23 24 25...
      */
     int num=1;
for (int x=0;x<ray.length;x++)
{
for (int y=0;y<ray[x].length;y++)
{
  ray[x][y]=num;
  num++;
}
}
    ArrayAverages twoDee = new ArrayAverages(ray);

    System.out.println(twoDee);
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
