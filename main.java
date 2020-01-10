import java.util.*;
public class main{

public static void main(String args[]){

boolean doa = true;
int a;
double b;
int s;
Scanner scan =new Scanner(System.in);
vendingdata one = new vendingdata();
do{
System.out.println("\nEnter 0 to Exit"+"\nEnter z to Cancel your order"+"\nEnter product choice" + "\n1.Coke($0.99cents)"+ "\n2.Pepsi($1.19)"+ "\n3.Soda($1.69)" );
a = scan.nextInt();
  
   if (a<=0){
      doa = false;
   }
   else if (a>0 && a<4){
      System.out.println("Enter your cash?");
      b = scan.nextDouble(); 
      System.out.println("\nEnter 1 to get your item and change OR Enter any number to Cancel your order");
      s = scan.nextInt();
      if(s == 1){
         System.out.println(one.checkvalue(a,b));
      }
      else{
         System.out.println("Here's your Refund"+b+"\nThank you Come again!!");
      }
   }
   else{
      System.out.println("Enter valid Categories");
      continue;
   }
   
}while(doa == true);


}

}