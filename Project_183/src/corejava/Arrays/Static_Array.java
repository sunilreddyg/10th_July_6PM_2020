package corejava.Arrays;

public class Static_Array {

	public static void main(String[] args) 
	{
		
		//Static Single dimensional array
		String ArrayName[]=new String[4];
		ArrayName[0]="Akash";
		ArrayName[1]="Bhavan";
		ArrayName[2]="Shyam";
		ArrayName[3]="Radha";
		
		System.out.println("3rd index value is ---> "+ArrayName[2]);
		//get size of array
		int len=ArrayName.length;
		System.out.println("Size of array is ---> "+len);
		
		
		
		
		
		
		
		//Static Double Dimensional array
		String userdata[][]=new String[3][2];
		
		//1st row data
		userdata[0][0]="User1";
		userdata[0][1]="pwd1";
		
		//2nd row data
		userdata[1][0]="user2";
		userdata[1][1]="pwd2";
		
		//3nd row data
		userdata[2][0]="user3";
		userdata[2][1]="pwd3";
		
		System.out.println(userdata[1][0]);
		

	}

}
