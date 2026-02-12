import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    
    ray = rayray;
  }

  public void rowAverages(){
    double avg=0;

    for (int row=0; row< ray[0].length; row++)
    {
      for(int col=0; col<ray.length; col++)
      {
        avg= avg + ray[row][col];
      }
      avg = avg/ray[0].length;
    
    System.out.println("Row " + row +":" + avg);
    }
    }
  

  public void columnAverages(){
    //Column major order
    //   Take each column and go through all of the rows
    //   Top down and Left to Right

    double avg=0;

    for (int col=0; col< ray[0].length; col++)
    {
      for(int row=0; row<ray.length; row++)
      {
        avg= avg + ray[row][col];
      }
      avg = avg/ray[0].length;
    
    System.out.println("Column " + col +":" + avg);
    }
  }

  public void arrayAverage(){

  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
