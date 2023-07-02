/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Fast food
package fastfood;
import java.util.Scanner;
/**
 *
 * @author abood
 */
class Menu
{
    private String [] items;
    private int noOfItems;
    private int noOfItemsprice;
    private double [] initems;
    
    public Menu()
    {
        items = new String[10];
        noOfItems=0;
        noOfItemsprice=0;
        initems = new double[10];
    }
    public void add(String newEntry)
    {
        if(noOfItems<10)
        {
        items[noOfItems]=newEntry;
        noOfItems++;
        }
        else
            System.out.println("sorry list is full");
        
    }

    public void add(double newEntry)
    {
        if(noOfItemsprice<10)
        {
        initems[noOfItemsprice]=newEntry;
        noOfItemsprice++;
        System.out.println("-------------------------------"); 
        }
        else
            System.out.println("sorry list is full");
        
    }



    public void add(int pos, String newEntry)
//      pos=3 newentry=carla noOfitems=4
    {
        if((noOfItems<10)&&(pos<=noOfItems)&&(pos>=1))
        {
        for(int i=noOfItems;i>=pos;i--)
            items[i]=items[i-1];
        items[pos-1]=newEntry;
        noOfItems++;
        }
        else
            System.out.println("add cant be done");
    }
    public void print()
    {
        for(int i=0;i<noOfItems;i++)
            System.out.println(items[i]);

        
    }
        public void printprice()
    {

          for(int i=0;i<noOfItemsprice;i++)
            System.out.println(initems[i]);
        
    }
    public String remove(int pos)
    {
        String result = null;
        if((pos>=1)&&(noOfItems>0)&&(pos<=noOfItems))
        {
            result = items[pos-1];
            for(int i=pos-1;i<noOfItems-1;i++)
                items[i]=items[i+1];
            noOfItems--;
        }
        else
            System.out.println("cannnot remove");
        
        return result;
    }
    
        public double removeprice(int pos)
    {
        double result = 0;
        if((pos>=1)&&(noOfItemsprice>0)&&(pos<=noOfItemsprice))
        {
            result = initems[pos-1];
            for(int i=pos-1;i<noOfItemsprice-1;i++)
                initems[i]=initems[i+1];
            noOfItemsprice--;
        }
        else
            System.out.println("cannnot remove");
        
        return result;
    }
    
    public void clear()
    {
        noOfItems=0;
        noOfItemsprice=0;
    }
    
    public double Total(){
        double total=0;
       for(int i=0;i<noOfItemsprice;i++)
       total+=initems[i];
       return total; 
    }
    
}
public class FastFood {





   public static String []  Meals = {"1-big hamburger","2-small hamburger","3-hot dog","4-zengar","5-Taco","6-Sausage sandwich"};
   public static   double price[] = {4.75, 2.10, 2.50,2.75,3.0,2.75};
   public static String []  Additions = {"1-Potato","2-Big Potato","3-mayonnaise","4-the cheese","5-Pomegranate molasses"};
    public static  double price2[] = {1.0, 1.5, 0.50, 0.75,0,0.75};
   public static String [] Drinks = {"1-Pepsi","2-seven Up","3-Mirinda orange","4-Orange juice","5-lemon juice","6-Mango juice","7-Cocktail juice"};
  public  static   double price3[] = {0.5, 0.5, 0.5, 0.5,1.0,1.5,2.0};





public void getMeals(){

		        for (int i = 0; i < Meals.length; i++) {
            System.out.println(Meals[i] + "      \b" + price[i]);
            System.out.println("-------------------------------"); 
        }

}

public void getAdditions(){

      for (int i = 0; i < Additions.length; i++) {
            System.out.println(Additions[i] + "      \b" + price2[i]);
            System.out.println("-------------------------------"); 
 
        }
}

public void getDrinks(){

        for (int i = 0; i < Drinks.length; i++) {
            System.out.println(Drinks[i]+ "      \b" +price3[i]);
            System.out.println("-------------------------------"); 

        }
}


public int Mealslength(){
   return Meals.length;
}




   public static void main(String[] args) {
         FastFood list =new FastFood();
         Menu list1 =new Menu();
         Menu list2 = new Menu();
         Scanner scan = new Scanner(System.in);



     System.out.println("Meals :");
     list.getMeals();

    System.out.println("-----------------------------------------------");
    System.out.println("Additions :");

         list.getAdditions();

    System.out.println("-----------------------------------------------");
    System.out.println("Drinks :");
         list.getDrinks();
    System.out.println(" ");
    System.out.println("-----------------------------------------------");
int c;
    do{
    System.out.println(" ");
    System.out.println("1-add");
    System.out.println(" ");
    System.out.println("2-Total Price");
    System.out.println(" ");
    System.out.println("3-Romve form the Bill");
    System.out.println(" ");
    System.out.println("4-Clear list");
    System.out.println(" ");
    System.out.println("99-print");
    System.out.println(" ");
    System.out.println("100-Exit");
    System.out.println(" ");
    System.out.print("Your choise : ");  
    System.out.println(" ");
              c=scan.nextInt();
    System.out.println(" ");  
             if(c==1){
             int a;
              do{
               System.out.println("1-Meals\n2-Additions\n3-Drinks\n100-Exit");
               System.out.println("plase enter where choise ");
               a=scan.nextInt();
               System.out.println(" ");  
               if(a==1){
               String conut;
               System.out.println("Select form this :");           
               list.getMeals();
               System.out.println(" ");  
               int s=scan.nextInt();  
               conut=Meals[s-1]+"  "+String.valueOf(price[s-1]);
               System.out.println(conut);
               list1.add(conut);
               list2.add(price[s-1]);

}
                if(a==2){
               String conut;
               System.out.println("Select form this :");           
               list.getAdditions();
               System.out.println(" ");  
               int s=scan.nextInt();  
               conut=Additions[s-1]+"  "+String.valueOf(price2[s-1]);
               System.out.println(conut);
               list1.add(conut);
               list2.add(price2[s-1]);                  
             }
               if(a==3){
               String conut;
               System.out.println("Select form this :");           
               list.getDrinks();
               int s=scan.nextInt();  
               conut=Drinks[s-1]+"  "+String.valueOf(price3[s-1]);
               System.out.println(conut);
               list1.add(conut);
               list2.add(price3[s-1]);                    
             }                

}
while(a!=100);



}

if(c==2){
list1.print();
System.out.println("-------------------------------");    
System.out.println("The total price is: "+list2.Total());
System.out.println("-------------------------------");
}

if(c==3){
System.out.println(" ");
list1.print();
System.out.println("plase select item you want to remove");
int r =scan.nextInt();
System.out.print("This the romve : ");
System.out.println(list1.remove(r));
System.out.println(list2.removeprice(r));
    
}

if(c==4){
list1.clear();
list2.clear();
    
}

if(c==99){
System.out.println("-------------------------------");    
list1.print();
System.out.println("-------------------------------");
//list2.printprice();
}

}      
while(c!=100);


}
}
