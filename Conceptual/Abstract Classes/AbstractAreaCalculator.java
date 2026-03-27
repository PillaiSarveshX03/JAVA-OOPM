import java.util.Scanner;

abstract class BaseAreaCalculator
{
    BaseAreaCalculator(){}

    abstract public float area(float r);
    abstract public float area(float l, float b);
    abstract public double area(double b, double h);

}// END OF BASEAREACALCULATOR



class SubAreaCalculator extends BaseAreaCalculator 
{
    SubAreaCalculator(){}

    public float area(float r)
    {
        float circleArea=(3.14f*r*r);
        return circleArea;
    }
    // CIRCLE


    public float area(float l,float b)
    {
        float rectArea=(l*b);
        return rectArea;
    }
    // RECTANGLE


     public double area(double b,double h)
    {
        double triArea=(0.5*b*h);
        return triArea;
    }
    // TRIANGLE


    
}// END OF SUBAREACALCULATOR





class AbstractAreaCalculator
{
    public static void main (String[] args)
    {

        Scanner sc= new Scanner(System.in);

        BaseAreaCalculator calc = new SubAreaCalculator();

        System.out.println("####### AREA CALCULATOR #######");
    
        int input = 1;

        System.out.println();
        
        while(input !=0)
        {    
    
            System.out.println("");
            
                System.out.println("Enter 1 for Calculating Area of Circle");
                System.out.println("Enter 2 for Calculating Area of Rectangle");
                System.out.println("Enter 3 for Calculating Area of Triangle");
                System.out.println("Enter 0 to exit");

            System.out.println();

            input = sc.nextInt();

             switch(input)
            {
                case 1:{
                            System.out.print("Enter radius: ");
                                float r =sc.nextFloat();

                            float circleArea =calc.area(r);
                            System.out.println("Area of Circle: "+circleArea);
                        }
                break;

                case 2:{
                            System.out.print("Enter length: ");
                                float l =sc.nextFloat();
                            System.out.print("Enter breadth: ");
                                float b =sc.nextFloat();

                            float rectArea =calc.area(l, b);
                            System.out.println("Area of Rectangle: "+rectArea);
                        }
                break;
            
                case 3:{
                            System.out.print("Enter base: ");
                                double base =sc.nextDouble();
                            System.out.print("Enter height: ");
                                double h =sc.nextDouble();

                            double triArea =calc.area(base, h);
                            System.out.println("Area of Triangle: "+triArea);
                        }
                break;

                case 0:{
                        System.out.println("Exiting... Thank you for using the Area Calculator!");
                       }
                break;

                default:
                    System.out.println("Invalid choice");
              }

              System.out.println("-----------------------------");


        }

    
        sc.close();

    }// END OF MAIN

}// END OF CLASS ABSTRACTAREACALCULATOR