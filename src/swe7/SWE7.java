

package swe7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class SWE7{

    

    public static void main(String[] args) {
        Integer [] arr= new Integer[0];
        String word="";
        int size = 0;
        Character array[]=new Character[0];
        int type,numOfElements;
        
        while (true){
        System.out.print("Enter the array type:\n1-Integer\n2-Characters\nYour Choice: ");
        
        Scanner get = new Scanner(System.in);
        type=get.nextInt();
        
        if (type == 1){
            System.out.print("Enter the number of elements: ");
            get= new Scanner (System.in);
            numOfElements=get.nextInt();
            arr= new Integer [numOfElements];
            for (int i=0;i<numOfElements;i++){
                System.out.print("Enter element "+i+" : ");
                get = new Scanner(System.in);
                arr[i]=get.nextInt();
            }
        }
        else if (type ==2){
            System.out.print("Enter the Characters : ");
            get = new Scanner(System.in);
            word=get.next();
            size =word.length();
            array = new Character [word.length()];
           
            for (int i = 0;i<=(size-1);i++){
                array[i]=word.charAt(i);
                 System.out.println(array[i]);
            }
            //System.out.print("Enter the Characters : ");
        }
        else {
            System.out.println("Please enter a valid choice.");
            continue;
        }
        
        System.out.println("Choose What next :\nShiftArray:1");
        System.out.println("the reverse function press :2");
        System.out.println("To check if araay is sorted press :3");
        System.out.println("To Get The Average :4");
        System.out.println("To Get The Largest Prime :5");
        System.out.println("To Get The Min Prime :6");
        System.out.println("To Get The Primes :7");
        System.out.println("To Suffle array :8");
        System.out.println("To Get The Median press :9");
        System.out.println("To Distincit array :10");
        System.out.println("To Most repeated value :11");
        System.out.println("To Do all :18");
        System.out.println("To Exit :19");
        System.out.println("Your Choice: ");
        int num = 0;
        num = get.nextInt();
        if (num == 1) ///Shift array
        {
            if (type ==1){
                ShiftArray(arr);
            }
            else if (type == 2){
                ShiftArray(array);
            }
        }
        
        if (num == 2) //the reverse function
        {
            if (type == 1)
                reverse_array(arr);
            else 
                reverse_array(array);
        }

        if (num == 3) //check sort
        {
            if (type == 1 ){
                Boolean x = CheckSorted(arr);
                System.out.println(x);
            }
            else if (type==2){
                Character[] arg = new Character[size];
                for (int i =0 ; i <size ; i++)
                {
                    arg [i]=array[i];
                }
                Boolean x = CheckSorted(arg);
                System.out.println(x);
            }
        }

        if (num == 4) ///get average
        {
            if (type == 1){
                Getaverage(arr);
            }
            else if (type==2){
                System.out.println("Can't get average for Letters");
            }
        }
        
        if (num == 5) ///get largest prime
        {
            if (type == 1){
                largestprime(arr);
            }
            if (type == 2){
                System.out.println("you choose Characters , Can't get primes");
            }
        }
        if (num == 6) ///get min prime
        {
            if (type==1){
                minPrime(arr);
            }
            else if (type ==2){
                System.out.println("you choose Characters , Can't get primes");
            }
        }
        
        if (num == 7) ///get primes
        {
            ArrayList<Integer> myPrim_Arr = new ArrayList();
            System.out.println("The Prime Numbers are : ");
            myPrim_Arr = Prime_num(arr);
            for (int i = 0; i < myPrim_Arr.size(); i++) {
                System.out.println(myPrim_Arr.get(i));
            }
        }
        
         if (num == 8) /// Shuffle array
        {
            if (type==1){
                shuffle(arr);
            }
            else if (type==2){
                shuffle(array);
            }
        }
         
        if(num ==9)//get meadian
        {
             if (type==1){
                System.out.println("median is :=  "+median(arr));
             }
             else if (type==2){
                 System.out.println("Can't get the median for Characters");
             }
         }
        
        if (num==10) /// get Distincit array
        {
            if (type==1){
                PrintDistinctArray(arr,arr.length);
            }
            if (type==2){
                PrintDistinctArray(array,array.length);
            }
        } if (num == 11) {	
		RepeatedValue(arr);
    }
		
        if (num==18){
            if (type==1){
                System.out.println("median is : "+median(arr));
                ShiftArray(arr);
                reverse_array(arr);
                Boolean x = CheckSorted(arr);
                System.out.println(x);
                Getaverage(arr);
                largestprime(arr);
                minPrime(arr);
                ArrayList<Integer> myPrim_Arr = new ArrayList();
                System.out.print("The Prime Numbers are : ");
                myPrim_Arr = Prime_num(arr);
                for (int i = 0; i < myPrim_Arr.size(); i++) {
                    System.out.print(myPrim_Arr.get(i)+" ");
                }
                System.out.println();
                shuffle(arr);
                PrintDistinctArray(arr,arr.length);
            }
            else if (type==2){
                ShiftArray(arr);
                reverse_array(arr);
                Boolean x = CheckSorted(arr);
                System.out.println(x);
                shuffle(arr);
                PrintDistinctArray(arr,arr.length);
            }
        }
        if (num==19){
            break;
        }
    }
}

	public static void RepeatedValue(Integer[] arr) {
	    	int basicCount = 1;
			int repeated = 0;
			for (int i = 0 ; i < arr.length; i++) {
				int number = arr[i]; 
				int numberCount = 0; 
				for (int j = 0 ; j < arr.length ; j++) { 
					if (number == arr[j]) 
						numberCount++; 
				}
				if (numberCount > basicCount){
					repeated = number;
					basicCount = numberCount;
				}	
			}
			System.out.println("the most repeated value is " + repeated);
	    	
	    }

    public static void largestprime(Integer [] arr) {
        
        boolean isPrime;
        int m = -1;
        for (int i = 0; i < arr.length; i++) {
            isPrime = true;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;

                }
            }
            if (isPrime == true) {
                m = Math.max(m, arr[i]);
            }
        }
        System.out.println("The Largest Prime is : "+m);
    }
    
    
public static int median(Integer[] l)
  {
    Arrays.sort(l);
    int middle = l.length / 2;
    if (l.length % 2 == 0)
    {
      int left = l[middle - 1];
      int right = l[middle];
      return (left + right) / 2;
    }
    else
    {
      return l[middle];
    }
  }

    public static <E> void ShiftArray(E[] nums) {
        E start = null;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                start = nums[i];
            }
            if (i == (nums.length - 1)) {
                nums[i] = start;
                break;
            }
            nums[i] = nums[i + 1];
        }
    }

    public static <E> void PrintDistinctArray(E [] arr, int size) //Distinct Array  Function
    {
        System.out.print("Output :");
        for (int i = 0; i < size; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println();
    }

    public static < E> void reverse_array(E[] array) {
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                E temp;
                temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        } else {
            for (int i = 0; i <= (array.length / 2) - 1; i++) {
                E temp;
                temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> Boolean CheckSorted(T[] arr) {
        Boolean ascending = false;
        //check ascending
        for (int i = 0; i < (arr.length - 1); i++) {
            T x = arr[i];
            T y = arr[i + 1];
            if (y.compareTo(x) < 0) {
                ascending = false;
                break;
            } else {
                ascending = true;
            }

        }

        return (ascending);
    }

    public static void Getaverage(Integer[] arr) {
        float sum = 0;
        float avg;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println("average : " + avg);

    }

    public static boolean isPrime(int x) {
        if (x == 1 || x == 2) {
            return true;
        }
        int n = (int) Math.floor(Math.sqrt(x));
        for (int i = 2; i <= n; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void minPrime(Integer[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("no prime values in the array!");
            return;
        }
        System.out.println("Lowest prime value is:" + min);
    }

    public static ArrayList <Integer> Prime_num(Integer [] myArr) {
        ArrayList<Integer> Prim_Arr = new ArrayList();
        boolean prime;
        for (int i = 0; i < myArr.length; i++) {
            prime = true;
            if (myArr[i] == 2) {
                Prim_Arr.add(myArr[i]);
                continue;
            }
            for (int j = 2; j < myArr[i]; j++) {
                if (myArr[i] % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                Prim_Arr.add(myArr[i]);
            }
        }
        return Prim_Arr;
    }
    
    public static <E> void shuffle(E characters[]){
         for(int i=0;i<characters.length;i++){
            int s=i+(int)(Math.random()*(characters.length-i));
            E temp=characters[s];
            characters[s]=characters[i];
            characters[i]=temp;}
        System.out.println("Array in shuffle:");
        for(int j=0;j<characters.length;j++){
            System.out.print(characters[j]+" ");
        }
        System.out.println();
    }
}
