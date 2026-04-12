import java.io.*;


final class SemesterII
{
	static String[] subjects;
	static int[] totalLectures;
	SemesterII()
	{
		subjects = new String[] {"AM","AP","AC","DSD", "EG","EW","PCT","OOPM"};
		totalLectures = new int[] {40,30,30,40,40,10,25,25};
	}
}// End of final Class



interface internalMarksCriteria
{
	public static final int minAttendance = 75;
	abstract public float getTW(int idx); 
} // End of interface definition




class Student
{
	private String rno;
	private String name;
	
	Student(){}
	Student(String rno,String name)
	{
		this.rno = rno;
		this.name = name;
		
	}
	protected String getRno()
	{ return rno;}
	protected String getName()
	{ return name;}
	
}// End of Student class



class Exam extends Student 
{
	private float[] marks;
	Exam(){}	
	Exam(String rno,String name,float[] mks)
	{
		super(rno,name);
		marks = mks;
	
    }
	
	protected float[] getMarks()
	{
		return marks;
	}
	
}//End of Exam class


class Result extends Exam implements internalMarksCriteria
{
	private int[] lecturesAttended;
	private float[] labMarks;
	
	Result(){}
	Result(String rno,String name,float[] mks,int[] lectAtt,float[] labmks)
	{
		super(rno,name,mks);
		lecturesAttended =lectAtt;
		labMarks = labmks;
		
	}
	
	public float getTW(int idx)
	{
		int attend =0;
		float temp = ((float)lecturesAttended[idx]/SemesterII.totalLectures[idx])*100;
		 
		if(temp>=95)
			 attend=5;
		else if (temp>=85)
			attend=4;
		else if (temp>=80)
			attend=3;
		else if (temp>=75)
			attend=2;
		else if (temp>=70)
		attend=1; 
		return (attend +labMarks[idx]);
	}

	public void displayMarks()
	{
		
		System.out.println("Roll No :" + getRno());
		System.out.println("Name    :" + getName());
		float[] theoryMks = getMarks();
		float total = 0.0f;
		
		System.out.printf("%-15s %-10s %-15s %-10s%n", "Subject", "Theory","Termwork","Sub Total");
		for(int i=0;i< SemesterII.totalLectures.length ;i++)
		{
		float tw = getTW(i);
		
		System.out.printf("%-15s %-10.1f %-15.1f %-10.1f%n",SemesterII.subjects[i] , theoryMks[i],tw,(theoryMks[i]+tw));
			total+=(theoryMks[i]+tw);
		}
		
		System.out.printf("%n%35s %12s%n","Total",total);
	}
}// End of Result class


class StudentAdmin
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SemesterII sem = new SemesterII();
		
			System.out.print("Enter Roll no ");
			String rno = br.readLine();

			System.out.print("Enter Name ");
			String name = br.readLine();

		float[] mks = new float[SemesterII.totalLectures.length];
		int[] lectAtt = new int[SemesterII.totalLectures.length];
		float[] labmks = new float[SemesterII.totalLectures.length];


		for(int i=0;i< SemesterII.totalLectures.length  ;i++)
		{
			System.out.println("Enter marks, No of lectures & lab Marks in " + SemesterII.subjects[i] +"  " );
		
			mks[i]=Float.parseFloat(br.readLine());
			
			lectAtt[i]=Integer.parseInt(br.readLine());
			
			labmks[i]=Float.parseFloat(br.readLine());
		}
		
		Result r = new Result(rno,name,mks,lectAtt,labmks);
		r.displayMarks();
		
		br.close();
	}	
}// End of driver class