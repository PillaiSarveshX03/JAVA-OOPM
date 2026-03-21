import java.util.Scanner;

class Student 
{
    String name;
    int age;
    String course;


        Student() 
        {
                this.name = "Unknown";
                this.age = 0;
        }

        
        Student(String name) 
        {
                this.name = name;
                this.age = 0;
        }

        Student(int age) 
        {
                this.name = "Unknown";
                this.age = age; 
        }
        
        Student(String name,int age) 
        {
                this.name = name;
                this.age = age;
        }


        String getName()
        {
                return this.name;
        }

        int getAge()
        {
                return this.age;
        }

    

}// END OF CLASS STUDENT

class ConstructorOverloading 
{
        public static void main(String[] args) 
        {
                Scanner sc = new Scanner(System.in);
                Student s;

                String name="";
                int age=0;


                  System.out.println("Enter Student Details:");

                System.out.print("Enter Name (or press Enter to skip): ");
                    name = sc.nextLine();

                System.out.print("Enter Age (or press 0 to skip): ");
                    age = sc.nextInt();
            

                if(name.equals(""))
                {
                       
                        s = new Student(age);
                        System.out.println("Name :"+s.getName());
                        System.out.println("Age :"+s.getAge());
                }

                else if(age == 0)
                {
                        s = new Student(name);
                        System.out.println("Name :"+s.getName());
                        System.out.println("Age :"+s.getAge());
                }

                else
                {
                        s = new Student(name, age);
                        System.out.println("Name :"+s.getName());
                        System.out.println("Age :"+s.getAge());
                }

        sc.close();

            
        }// END OF MAIN

}// END OF CLASS CONSTRUCTOROVERLOADING
