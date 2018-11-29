package swe7;

import java.util.Scanner;

public class SWE7 {


   public static Vector <Integer> v = new Vector<Integer>();
    public static void main(String[] args) {

    // adding the reverse function
    public static < E > void reverse_array(E [] array){
        if (array.length%2==0){
            for (int i=0;i<array.length/2;i++){
                E temp;
                temp=array[i];
                array[i]=array[array.length-i-1];
                array[array.length-i-1]=temp;
            }
        }
        else {
            for (int i=0;i<=(array.length/2)-1;i++){
                E temp;
                temp=array[i];
                array[i]=array[array.length-i-1];
                array[array.length-i-1]=temp;
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner get =new Scanner(System.in);
        
        System.out.print("0- input numbers seprated by space \n1- input string\n11- Distinct Array\n");
        
        int v =get.nextInt();
        ImplementationMain(v);
         largestprime();
    }



 public static void largestprime() {
   Scanner input =new Scanner (System.in);
  int x;
  System.out.println("Enter no of digits you want to add");
  x = input.nextInt();
  for (int i=0;i<x;i++) {
	  int n= input.nextInt();
	  v.add(n);
	  
	  
  }
 
  boolean isPrime;
  int m=-1;
  for(int i=0;i<x;i++) {
	  isPrime = true;
	  for(int j=2;j<v.get(i);j++) {
		  if (v.get(i)%j==0) {
			  isPrime = false;
			  break;
			  
		  }
		  
		  }
	  
	  if(isPrime==true) {
		  m=Math.max(m, v.get(i));
	  }
	  
	  
  }
  System.out.println(m);
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
    else if (num ==  11)
    {
    	Scanner  y =new Scanner(System.in);
    	System.out.print("Enter the Size of the Array : ");
    	int sizeofarr =y.nextInt();
    	Integer []Arr = new Integer[sizeofarr];
    	System.out.print("Type "+sizeofarr+" elemnets : ");
    	for (int i= 0; i < sizeofarr ; i++)
    	{
    		Arr[i] = y.nextInt();
    	}
    	PrintDistinctArray(Arr,sizeofarr);
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
public static void PrintDistinctArray (Integer [] arr,int size)		//Distinct Array  Function
{
	System.out.print("Output :");
	for (int i = 0 ; i < size ; i++)
	{
		int j;
		for (j = 0 ; j < i ; j++)
		{
			if (arr[i]==arr[j])
				break;
		}
		if (i==j)
			System.out.print(" "+arr[i]);
	}

}
}
