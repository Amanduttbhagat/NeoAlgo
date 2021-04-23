/*
  Power of Four :
      We are given an integer and we have to find is it power of 4 or not

  Example :
      Suppose we input the number 64 and we have to find if it's power of four or not
      at first we will check if the number is equal to 0 or not, as 0 is not power of four
      after that we will recursively divide the number(64) by four till it becomes 1 and at each
      recursion we will increment count by 1
      example : 64/4 = 16, count = 1;  16/4 = 4, count = 2;  4/4 = 1, count = 3
      hence, 64 is a power of 4 such that 4 to the power 3 equals 64
 */

import java.util.Scanner;

public class Power_of_Four {

	// method poweroffour
	public static int poweroffour(int n) {

		int count = 0;

		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 0;
		}

		for(  ; n!=1 ;  )
		{
			if(n%4!=0)
			{
				return 0;
			}
			n = n/4;
			count++;
		}
		return count;
	}

	//Driver Code
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Input the number
		System.out.print("Enter the number : ");
		int n = sc.nextInt();

		if(Power_of_Four.poweroffour(n)==0)
		{
			if(n==1)
			{
				System.out.println("Yes, "+n+" is a power of 4 such that 4 to the power "+Power_of_Four.poweroffour(n)+" equals "+n);
			}else
			{
				System.out.println("No, "+n+" is not a power of 4");
			}
		}else
		{
			System.out.println("Yes, "+n+" is a power of 4 such that 4 to the power "+Power_of_Four.poweroffour(n)+" equals "+n);
		}

	}
}
/*

Input:
Enter the number : 262144

Output:
Yes 262144 is a power of 4 such that 4 to the power 9 equals 262144

Time Complexity : O(log(n))
Space Complexity : O(1)

*/
  
