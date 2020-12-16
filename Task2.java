public class Task2{
    public static void main(String []args)
  {
    int tempC=0,i;
    float tempF;
    System.out.println("Sr No\t\t Temperature(Celsius)\t\t Temperature(Fahrenheit)");
    for(i=0;i<=101;i++){
      tempF=(tempC* 9/5.0f)+ 32;
      System.out.printf("\n%6d\t\t %6d \t\t\t %8.2f", i,tempC,tempF);
      tempC+=10;
    }
  }
}