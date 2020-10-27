package oops.Encapsulation;

public class Run_User_Data {

	public static void main(String[] args) 
	{
		
		UserData data=new UserData();
		data.empid="mqe002";  //Public variable allow assigning data at runtime.
		
		data.set_name("Viay");
		data.set_email("akram@gmail.com");
		data.set_mobile("9030248855");
		
		
		String UN=data.get_name();
		System.out.println(UN);
		
		String UE=data.get_email();
		System.out.println(UE);
		
		String UM=data.get_mobile();
		System.out.println(UM);

	}

}
