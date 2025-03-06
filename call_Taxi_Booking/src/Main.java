import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Taxi[] t=new Taxi[4];
      t[0]=new Taxi();
      t[1]=new Taxi();
      t[2]=new Taxi();
      t[3]=new Taxi();
      Booking[] b=new Booking[10];
      int i=0,j=0;
      Scanner scan=new Scanner(System.in);
      while(true)
      {
      System.out.println("__________________CALL TAXI BOOKING__________________");
      System.out.println("1)Booking");
      System.out.println("2)Display");
      System.out.println("3)exit");
      System.out.println("Enter your choice");
      int ch=scan.nextInt();
      
      if(ch>3 || ch<1){System.out.println("Invalid Input");return;}
      if(ch==1)
      {
         System.out.println("Input "+(i+1)+":");
         System.out.println("Customer Id");
         int id=scan.nextInt();
         System.out.println("Pickup Point:");
         scan.nextLine();
         char pick=scan.nextLine().charAt(0);
         System.out.println("Drop Point:");
         char drop=scan.nextLine().charAt(0);
         System.out.println("Pickup Time:");
         int PickTime=scan.nextInt();
        b[i]=new Booking(id,pick,drop,PickTime);
        int a;
         a = b[i].isAvailable(t);
        System.out.println("ouput "+(i+1));
        if(a!=-1)
        {
               System.out.println("Taxi-"+(a+1)+" is alloted");
               
               t[a].calculateEarnings(b[i].pickupPoint,b[i].dropPoint);
               
               b[i].dropTime();
               b[i].calculateEarnings();
        }
        else System.out.println("Booking is rejected");
        i++;
      }
      else if(ch==2)
      {
          System.out.format("%-10s%-10s\n","Taxi No:","Total Earnings:");
          System.out.format("%-10s%-13s%-10s%-10s%-13s%-10s%-10s\n","BookingID","CustomerId","From","To","PickupTime","DropTime","Amount");
          System.out.println("output");
          for(int k=0;k<4;k++)
          {
              if(t[k].earnings!=0)
              {
                  System.out.println("Taxi-"+(k+1)+"    "+"Total Earnings:"+"Rs . "+t[k].earnings);
                  for(j=0;j<i;j++)
                  {
                      if(b[j].taxino==k)
                      {
                        
                          System.out.format("%-10d%-10d%-10c%-10c%-10d%-10d%-10d\n",(j+1),b[j].customerId,
                            b[j].pickupPoint,b[j].dropPoint,b[j].pickupTime,b[j].dropTime,b[j].earnings);
                      }
                      
                  }
              }
          }
      }
      else if(ch==3)
      return;
      }
     
}
    
}

