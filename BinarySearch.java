import java.util.Scanner;


class Logic
{

     // BINARY SEARCH BEGINS


        public int check(int[] arr,int low,int high,int key)
        {
        
            int mid=((low+high)/2);

            if (low > high) 
                { return -1;}

            if(arr[mid]==key)
                {return mid;}

            else if(arr[mid]>key)
                {return check(arr,low,mid-1,key);}

            else
                {return check(arr,mid+1,high,key);}
            
    
        }


        // BINARY SEARCH ENDS


}// END OF CLASS LOGIC


class BinarySearch
{
    public static void main (String[] args)
    
    
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter The Number Of Elements.. : ");
        int len= sc.nextInt();


        int[] arr = new int[len];

        System.out.println("Enter The Elements.. : ");

         for(int i=0;i<len;i++)
            {
                arr[i]=sc.nextInt();
            }

        
        int temp;
    

        // SORTING BEGINS

        for(int i=0;i<len;i++)
            {
                for(int j=i+1;j<len;j++)
                    {
                       if(arr[i]<=arr[j])
                        {}
                       else
                        {
                            temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp; 
                        } 
                    }
            }

        // SORTING ENDS   


        Logic l1=new Logic();

        System.out.println("Enter The Number you Want to find.. : ");
        int key= sc.nextInt();

        int c=l1.check(arr, 0, len-1, key);

        if(c==-1)
            { System.out.println("NOT FOUND");}
        else
            { System.out.println("FOUND AT INDEX "+c);}
       


      sc.close();

    }// END OF MAIN

}// END OF BINARY SEARCH CLASS