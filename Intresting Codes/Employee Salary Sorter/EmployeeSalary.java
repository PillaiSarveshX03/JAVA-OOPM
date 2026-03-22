import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class SalaryCalculator{

	private String ename="";
	private String eno="";
	private double basicsa=0.0;
	private double ta=0.0;
	private double da=0.0;
	private double hra=0.0;
	private double tsalary=0.0;

	public SalaryCalculator(){}

	public void setdata(String name,String num, double BS, double TA,double DA,double HRA)
	{
		
	 ename=name;
	 eno=num;
	 basicsa=BS;
	 ta=TA;
 	 da=DA;
	 hra=HRA;
	 tsalary= basicsa+ta+da+hra;
	
	}


	public String getename()
	{return ename;}
	public String geteno()
	{return eno;}
	public double getbs()
	{return basicsa;}
	public double getta()
	{return ta;}
	public double getda()
	{return da;}
	public double gethra()
	{return hra;}
	

	public double getgrossSal()
	{
		return tsalary;
	}



}// END OF CLASS SALARYCALCULATOR


class EmployeeSalary{
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 

			System.out.print("Enter The Number of Employees.. : ");
			int emp =Integer.parseInt(reader.readLine());

		
			SalaryCalculator s[] =new SalaryCalculator[emp];
			int counter=0;

				for(int i=0;i<emp;i++)
				{s[i] =new SalaryCalculator();}

				
					while(counter<emp)

					{	
						System.out.println("\n Welcome Employee "+(counter+1));
						System.out.println();


							System.out.print("Enter your name: ");
							String name = reader.readLine();

							System.out.print("Enter your Identification Number: ");
							String num = reader.readLine();

							System.out.print("Enter your Basic Salary: ");
							double BS = Double.parseDouble(reader.readLine());

							System.out.print("Enter your Travel Allowance: ");
							double TA = Double.parseDouble(reader.readLine());

							System.out.print("Enter your Dearness Allowance: ");
							double DA = Double.parseDouble(reader.readLine());

							System.out.print("Enter your House Rent Allowance: ");
							double HRA = Double.parseDouble(reader.readLine());

						
						System.out.println();

							s[counter].setdata(name, num, BS, TA, DA, HRA);

							counter++;

					}// END OF WHILE LOOP

					System.out.println();
					System.out.println();



//SORTING BEGINS 		

		SalaryCalculator temp;
		
        for(int i=0;i<emp;i++)
            {
                for(int j=i+1;j<emp;j++)
                {
                 if(s[i].getgrossSal()>=s[j].getgrossSal())
                 {}
                 else
                 {
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                 }
                }
            }			
			
// SORTING ENDS 

			counter =0;

				System.out.println("Employee List According To Value......");
						
				while(counter<emp)
				{
					System.out.println();

							System.out.println("Employee Name: "+s[counter].getename());
							System.out.println("Identification Number: "+s[counter].geteno());
							System.out.println("Basic Salary: "+s[counter].getbs());
							System.out.println("Travel Allowance: "+s[counter].getta());
							System.out.println("Dearness Allowance: "+s[counter].getda());
							System.out.println("House Rent Allowance: "+s[counter].gethra());

							System.out.println();
							System.out.println("Gross Salary: "+s[counter].getgrossSal());

					counter++;

				}// END OF WHILE LOOP


		reader.close();
	
	}// END OF MAIN
	
	
	
	
}// END OF CLASS EMPLOYEESALARY