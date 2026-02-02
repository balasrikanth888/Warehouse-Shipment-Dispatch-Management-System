package com.warehouse.app;

import java.util.Scanner;

import com.warehouse.service.DispatchService;

       public class WarehouseMain { 
                private static DispatchService dispatchService; 
       public static void main(String[] args) { 
           dispatchService = new DispatchService(); 
           Scanner sc = new Scanner(System.in); 
           System.out.println("--- Warehouse Dispatch Console ---"); 
        try { 
             boolean r = dispatchService.dispatchShipment("SH1002","Warehouse D",10); 
             System.out.println(r ? "DISPATCHED" : "FAILED"); 
         } 
        catch(Exception e)
          { 
        	System.out.println(e); 
        	} 
        try { 
             boolean r = dispatchService.dispatchShipment("SH1001","Retail Outlet 5",25); 
              System.out.println(r ? "DISPATCHED" : "FAILED"); 
         } 
            catch(Exception e) 
        { 
            	System.out.println(e); 
            	} 
         try { 
             boolean r = dispatchService.cancelDispatch(81001); 
             System.out.println(r ? "CANCELLED" : "FAILED"); 
          } 
         catch(Exception e) 
         { 
        	 System.out.println(e); 
        	 } 
sc.close(); 
} 
}