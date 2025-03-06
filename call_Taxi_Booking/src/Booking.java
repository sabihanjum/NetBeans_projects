/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drsab
 */
public class Booking {
   int customerId;
   char pickupPoint;
   char dropPoint;
   int pickupTime;
   int dropTime;
   int earnings;
   int taxino;
   Taxi[] t;
  

    Booking(int id, char pick, char drop, int PickTime) {
   customerId=id;
       pickupPoint=pick;
       dropPoint=drop;
       pickupTime=PickTime;
    }
    
    public void dropTime()
    {
        this.dropTime=(pickupTime+(Math.abs(pickupPoint-dropPoint))); 
    }
    public void calculateEarnings()
    {
        int dist=(Math.abs(pickupPoint-dropPoint)*15); 
        this.earnings=((dist-5)*10)+100;
        
    }
    
    
    
  
   public int isAvailable(Taxi[] t) 
   {
       int j,min=6,temp=-1;
       for(j=0;j<4;j++)
       {
          if(Math.abs(pickupPoint-t[j].initialPoint)<=min && t[j].departureTime<=pickupTime)
          {
                if(temp==-1 || Math.abs(pickupPoint-t[j].initialPoint)<min ) 
                 temp=j;
             if(Math.abs(pickupPoint-t[j].initialPoint)==min && t[j].earnings!=0) 
             {
                 if(t[temp].earnings>t[j].earnings) 
                 temp=j;
             }
             min= Math.abs(pickupPoint-t[j].initialPoint);
             
          }
       }
       if(min!=6){
           t[temp].departureTime(pickupTime,pickupPoint,dropPoint);
           t[temp].initialPoint=dropPoint;
           taxino=temp;
           return temp;} 
       return -1;
   }
}
