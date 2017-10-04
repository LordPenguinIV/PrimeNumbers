public class PrimeNumbers
{
  public static void main (String [] args)
  {
    int x = 1;
    int y = ((int)(x/2));
    int z = 1;
    while (1>0)
    {
    if (y<=1)
    {
      System.out.print("#" + z);
      z = z+1;
      System.out.println("   " + x);
      x = x+1;
      y = ((int)(x/2));
    }
    if (x%y==0)
    {
      x = x+1;
      y = ((int)(x/2));
    }
    if (x%y>0)
    {
      y = y-1;
    }
    }
  }
}