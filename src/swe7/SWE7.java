package swe7;

import java.util.Scanner;

public class SWE7 {


    public static void main(String[] args) {
    
        Scanner get =new Scanner(System.in);
        System.out.print("0- input numbers seprated by space \n1- input string\n");
        
        int v =get.nextInt();
        ImplementationMain(v);
    }
public static void ImplementationMain(int num)
{
    
    if (num ==0)
        {
        Scanner  g =new Scanner(System.in);
       System.out.print("Type the Size : ");

        int n =g.nextInt();
        Integer []Arr = new Integer[n];
       System.out.print("Type "+n+" elemnets : ");
        for (int i=0;i<n;i++)
        {
            Arr[i] = g.nextInt();
        }
        SheftArray(Arr);
        System.out.print("OutPut : ");
        for (Integer x : Arr)
        {
            System.out.print(x+" ");
        }
        }
    else if (num==1)
        {
            Scanner  g =new Scanner(System.in);
            System.out.print("String : ");
            String temp =g.next() ;
            String []arr = temp.split("");
            SheftArray(arr);
            System.out.println("OutPut : ");
            for (String x : arr)
                {
                    System.out.print(x);
                }
       
        }
 
     
}
public static < E > void SheftArray(E[] nums) {
    
    E start = null;
    for(int i = 0; i < nums.length; i++)
    {
        if(i == 0)
            start = nums[i];
        if(i == (nums.length -1))
        {
            nums[i] = start;
            break;
        }    
        nums[i] = nums[i + 1];
    }
              
}

}
