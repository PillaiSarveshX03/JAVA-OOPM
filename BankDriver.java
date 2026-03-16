import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

class BankAccount{
	
	private String name="";
	private String num="";
	private double bal=500.0;
	private String type="";
	
	public BankAccount()
			{}
			
	public BankAccount(String n,String no,String type_temp)
			{
				name = n;
				num = no;
				type = type_temp.toUpperCase();
			}
	
	public void deposit(double no)
			{bal+=no;}
			
	public int withdrawal(double n)
			{
				if((bal-n)<500)
					{return 1;}
				else
					{
					bal-=n;
					return 0;
					}	// END OF CONDITIONAL
			}
			
	public String getname()
			{return name;}

	public String getnum()
			{return num;}

	public double getbal()
			{return bal;}

	public int gettype()
			{
				if(type.charAt(0)=='S')
					{return 0;}
				else
					{return 1;}
			} // END OF CONDITIONAL
			
	
}// END OF CLASS BANKACC


class BankDriver{
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);


				System.out.print("Enter your name: ");
				String name = reader.readLine();

				System.out.println("Account Type - Savings Or Current : ");
				System.out.print("For SAVINGS Enter S AND For CURRENT Enter C : ");
				String type = reader.readLine();

				System.out.print("Enter your Account Number: ");
				String num = reader.readLine();


				System.out.println("\n \n ");


			BankAccount b1 =new BankAccount(name,num,type);
			
			int input=0;
			
			do {
					System.out.println("Enter - 1 For WITHDRAWAL ");
					System.out.println("Enter - 2 To DEPOSIT ");
					System.out.println("Enter - 3 To Check BALANCE OR Details ");
					System.out.println("Press 0 To EXIT \n ");
			
			input = sc.nextInt();


				System.out.println();
	
				switch(input)
				{
					case 1 :
						{
							System.out.println("WITHDRAWAL - Enter the Amount You Want to Withdraw... : ");
							if(b1.withdrawal(sc.nextDouble())==0)
								{System.out.println("WITHDRAWAL SUCCESSFUL !!   :) ");}
							else
								{System.out.println("INSUFFCIENT FUNDS OR MINIMUM BALANCE !!   :( ");}
						}
					break;

					case 2 :
						{
							System.out.println("DEPOSIT - Enter the Amount You Want to DEPOSIT... : ");
							b1.deposit(sc.nextDouble());
							System.out.println("YOUR DEPOSIT WAS SUCCESSFUL !! :) ");
						}
					break;

					case 3 :
						{
							System.out.println("Name Of Account Holder - "+ b1.getname());
							System.out.println("Account Number - "+ b1.getnum());
							
							if(b1.gettype()==0)
								{System.out.println("Account Type - SAVINGS");}
							else
								{System.out.println("Account Type - CURRENT");}

							System.out.println("Available Balance - "+ b1.getbal());
						}
					break;
					
					case 0: {}
					break;

					default: { System.out.println("Invalid Option !!");}
				} // END OF SWITCH CASE

				System.out.println();
	
			}while (input != 0); // END OF WHILE LOOP
		
		
		System.out.println("Thank You :) ");


		sc.close();
		reader.close();
	
	}// END OF MAIN
	
	
	
	
}// END OF CLASS BANKDRIVER