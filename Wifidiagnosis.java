package wifidiagnosis;
import java.util.*;
public class Wifidiagnosis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	   System.out.println("------------------------");
	   System.out.println("Wifi-Diagnosis");
	   System.out.println("------------------------");
	   
	   
	   System.out.println("Reboot the computer and try to connect.");
	   System.out.println("Did that fix the problem?");
	   String remove_Item = input.next();
	   if(remove_Item.equals("no")) {
		   System.out.println("Reboot the router and try to connect.");
		   System.out.println("Did that fix the problem?");
		   remove_Item = input.next();
		   if(remove_Item.contentEquals("no")){
			   System.out.println("Make sure the cables connecting the router are firmly plugges in and the power is getting to the router.");
			   System.out.println("Did that fix the problem?");
			   remove_Item =input.next();
			   if(remove_Item.equals("no")){
				  System.out.println("Move the computer closer to the router and try to connect.");
				  System.out.println("Did that fix the problem?");
				  remove_Item = input.next();
				  if(remove_Item.contentEquals("no")) {
					  System.out.println("Contact your ISP");
				  }
			   }
			   	
		   }
	   }
	   else {
		   System.out.println("done");
	   }
	}

}
