import java.util.*;
class A
{
  int a,b;
  void setter(int a1,int b1)
  {
    
    
    a=a1;
    b=b1;
  System.out.println("settre method");
  }
  void getter() 
  {
    try{
    Scanner sc=new Scanner(System.in);
    int c=sc.nextInt();
    
    System.out.println("getter ...."+ (a+b+c));
    }catch(Exception e)
      {
        System.out.println(e.getMessage());
      }
  }
}
//  public static void main(String args[])
 // {

