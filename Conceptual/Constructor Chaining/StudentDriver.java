import java.util.Scanner;

class Student
{

    private String rno="";

    Student(){}

    Student(String rno)
    {
        this.rno=rno;
    }

    public String getRno() {
        return rno;
    }

}// END OF CLASS STUDENT



class test extends Student
{

    private float sem1=0;
    private float sem2=0;

    test(){}

    test(String rno,float sem1, float sem2)
    {
        super(rno);

        this.sem1=sem1;
        this.sem2=sem2;

    }

}// END OF CLASS TEST



class result extends test
{

    private float total=0;

    result(){}

    result(String rno,float sem1,float sem2)
    {
        super(rno,sem1,sem2);
        total= sem1+sem2;
    }

    public float getResult()
    {
        return total;
    }

}// END OF CLASS RESULT 




class StudentDriver 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        String prn= "";
        float sem_1= 0;
        float sem_2= 0;

        System.out.print("Enter Your PRN : ");
            prn = sc.nextLine();

        System.out.print("Enter Your Semester I Marks : ");
            sem_1 =sc.nextFloat();

        System.out.print("Enter Your Semester II Marks : ");
            sem_2 =sc.nextFloat();
        
 
    result r1 = new result(prn,sem_1,sem_2);
        
        System.out.println();

        System.out.println("PRN : "+ r1.getRno() + " Your Total Marks is " + r1.getResult() );


    
        sc.close();

    }// END OF MAIN
    
}// END OF CLASS STUDENTDRIVER 