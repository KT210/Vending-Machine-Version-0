public class vendingdata {

protected int situ;
protected double value;
protected double retmoney;

public String checkvalue(int situ,double value){
   
   if(situ == 1){
     if(value < 0.99){
         return "Your money cant buy Coke";
         
     }
     else{
         retmoney = value-0.99;
         return "Your input money is "+value+"\nYour remaining balance is "+retmoney;
     }
   
   }
   else if(situ == 2){
      if(value < 1.19){
         return "Your money cant buy Pepsi";
         
     }
     else{
         retmoney = value-1.19;
         return "Your input money is "+value+"\nYour remaining balance is "+ retmoney;
     }
   

   }
   else{
     if(value < 1.69){
         return "Your money cant buy Soda";
         
     }
     else{
         retmoney = value-1.69;
         return "Your input money is "+value+"\nYour remaining balance is "+ retmoney;
     }
   
   }
   

}

}
