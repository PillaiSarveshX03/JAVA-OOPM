import java.io.BufferedReader;
import java.io.*;


interface test
{

}// END OF INTERFACE

class Student
{
    private String name="";
    private String rno="";

    Student(){}

    Student(String rno,String name)
    {
        this.rno=rno;
        this.name=name;
    }

    public String getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }
}// END OF CLASS STUDENT



class exam extends Student
{

    private float sem1=0;
    private float sem2=0;

    exam(){}

    exam(String rno,String name,float sem1, float sem2)
    {
        super(rno,name);

        this.sem1=sem1;
        this.sem2=sem2;

    }

}// END OF CLASS TEST



class result extends exam
{

    private float total=0;

    result(){}

    result(String rno,String name,float sem1,float sem2)
    {
        super(rno,name,sem1,sem2);
        total= sem1+sem2;
    }

    public float getResult()
    {
        return total;
    }

}// END OF CLASS RESULT 




class StudentDriver 
{
    public static void main(String[] args) throws IOException
    {
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String prn= "";
        float sem_1= 0;
        float sem_2= 0;
        String name = "";


        System.out.print("Enter Your PRN : ");
            prn = br.readLine();

        System.out.print("Enter Your Name : ");
            name = br.readLine();

        System.out.print("Enter Your Semester I Marks : ");
            sem_1 = Float.parseFloat(br.readLine());

        System.out.print("Enter Your Semester II Marks : ");
            sem_2 = Float.parseFloat(br.readLine());



    result r1 = new result(prn,name,sem_1,sem_2);
        
        System.out.println();

        System.out.println("PRN : "+ r1.getRno() + " Your Total Marks is " + r1.getResult() );


    
        br.close();

    }// END OF MAIN
    
}// END OF CLASS STUDENTDRIVER 