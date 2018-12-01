package swe7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class SWE7 {

    public static Vector<Integer> v = new Vector<Integer>();

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("0- input numbers seprated by space \n1- input string\n11- Distinct Array\npraee :1");
        System.out.println("the reverse function press :2");
        System.out.println("To check if araay is sorted press :3");
        System.out.println("To Get The Average :4");
        System.out.println("To Get The Largest Prime :5");
        System.out.println("To Get The Min Prime :6");
        System.out.println("To Get The Primes :7");
        System.out.println("To Suffle array :8");
        System.out.println("To Get The Median press :9");
        int num = 0;
        num = get.nextInt();
        if (num == 1) {
            int v = get.nextInt();
            ImplementationMain(v);
            largestprime();

        }
        if (num == 2) //the reverse function
        {
            Integer arr[] = {1, 1, 3, 3, 5};
            reverse_array(arr);
        }

        if (num == 3) //check sort
        {
            Integer arr[] = {1, 1, 3, 3, 5};
            Double arr2[] = {1.0, .70, 3.0, 3.0, 4.5};

            Boolean x = CheckSorted(arr);
            Boolean y = CheckSorted(arr2);
            System.out.println(x);
            System.out.println(y);
        }

        if (num == 4) ///get average
        {
            System.out.println("enter how many number");
            int l = 0;
            l = get.nextInt();
            int[] arr = new int[l];
            System.out.println("enter numbers ");
            for (int i = 0; i < l; i++) {
                arr[i] = get.nextInt();
            }
            Getaverage(arr);
        }
        if (num == 5) ///get largest prime
        {
            largestprime();
        }
        if (num == 6) ///get min prime
        {
            int[] arr = new int[5];
            minPrime(arr);
        }
        if (num == 7) ///get primes
        {
            Scanner input = new Scanner(System.in);
            ArrayList<Integer> myPrim_Arr = new ArrayList();
            ArrayList<Integer> myArr = new ArrayList();
            int x;
            System.out.println("Enter five inputs");
            for (int i = 0; i < 5; i++) {
                x = input.nextInt();
                myArr.add(x);
            }
            System.out.println("The Prime Numbers are : ");
            myPrim_Arr = Prime_num(myArr);
            for (int i = 0; i < myPrim_Arr.size(); i++) {
                System.out.println(myPrim_Arr.get(i));
            }
        }
         if (num == 8) /// Shuffle array
        {
            Integer [] arr =new Integer [5];
            shuffle(arr);
        }
        if(num ==9)//get meadian
        {
             System.out.println("Enter How Many Number In ARRAY");
             int x = 0;
             x=get.nextInt();
             int [] arr=new int [x];
             System.out.println("Enter The Numbers ");
              for(int i=0;i<x;i++)
             {
             arr[i]=get.nextInt();
             }
             System.out.println("median is :=  "+median(arr));
         }
    }

    public static void largestprime() {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Enter no of digits you want to add");
        x = input.nextInt();
        for (int i = 0; i < x; i++) {
            int n = input.nextInt();
            v.add(n);
        }
        boolean isPrime;
        int m = -1;
        for (int i = 0; i < x; i++) {
            isPrime = true;
            for (int j = 2; j < v.get(i); j++) {
                if (v.get(i) % j == 0) {
                    isPrime = false;
                    break;

                }
            }
            if (isPrime == true) {
                m = Math.max(m, v.get(i));
            }
        }
        System.out.println(m);
    }
    //median function
    //edit by poula
public static int median(int[] l)
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
    public static void ImplementationMain(int num) {

        if (num == 0) {
            Scanner g = new Scanner(System.in);
            System.out.print("Type the Size : ");

            int n = g.nextInt();
            Integer[] Arr = new Integer[n];
            System.out.print("Type " + n + " elemnets : ");
            for (int i = 0; i < n; i++) {
                Arr[i] = g.nextInt();
            }
            SheftArray(Arr);
            System.out.print("OutPut : ");
            for (Integer x : Arr) {
                System.out.print(x + " ");
            }
        } else if (num == 1) {
            Scanner g = new Scanner(System.in);
            System.out.print("String : ");
            String temp = g.next();
            String[] arr = temp.split("");
            SheftArray(arr);
            System.out.println("OutPut : ");
            for (String x : arr) {
                System.out.print(x);
            }

        } else if (num == 11) {
            Scanner y = new Scanner(System.in);
            System.out.print("Enter the Size of the Array : ");
            int sizeofarr = y.nextInt();
            Integer[] Arr = new Integer[sizeofarr];
            System.out.print("Type " + sizeofarr + " elemnets : ");
            for (int i = 0; i < sizeofarr; i++) {
                Arr[i] = y.nextInt();
            }
            PrintDistinctArray(Arr, sizeofarr);
        }

    }

    public static < E> void SheftArray(E[] nums) {
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

    public static void PrintDistinctArray(Integer[] arr, int size) //Distinct Array  Function
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

    public static void Getaverage(int[] arr) {
        float sum = 0;
        float avg;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println("average" + avg);

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

    public static void minPrime(int[] arr) {
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

    public static ArrayList<Integer> Prime_num(ArrayList<Integer> myArr) {
        ArrayList<Integer> Prim_Arr = new ArrayList();
        boolean prime;
        for (int i = 0; i < myArr.size(); i++) {
            prime = true;
            if (myArr.get(i) == 2) {
                Prim_Arr.add(myArr.get(i));
                continue;
            }
            for (int j = 2; j < myArr.get(i); j++) {
                if (myArr.get(i) % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                Prim_Arr.add(myArr.get(i));
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
            System.out.println(characters[j]+" ");
        }
    }
}
