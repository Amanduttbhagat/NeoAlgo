/*
  - Power of Four :
      We are given an integer and we have to find is it power of 4 or not

  - Example : input : Enter the number : 262144
              output : Yes 262144 is a power of 4 such that 4 to the power 9 equals 262144
 */

import java.util.Scanner;

public class Power {
	// method poweroffour
	public static int poweroffour(int n) {

		//declaring and initializing count by 0
		int count = 0;

		//as 4 to the power any number is not equal to 0
		if(n==0) {
			return 0;
		}
		//4 to the power 0 is 1
		if(n==1) {
			return 0;
		}

		//after iteration, if n is equal to 1 then it is power of 4, therefore loop will run till n!=1
		for(  ; n!=1 ;  ) {
			//if n%4 is not 0 then it is not a power of 4
			if(n%4!=0) {
				return 0;
			}
			//dividing n by 4
			n = n/4;
			//increment count by 1
			count++;
		}
		return count;
	}

	//main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        //Input the number
		System.out.print("Enter the number : ");
		int n = sc.nextInt();

		//if Power.poweroffour(n)==0 then print no, if n==1 then print yes
		if(Power.poweroffour(n)==0) {
			if(n==1) {
				System.out.println("Yes, "+n+" is a power of 4 such that 4 to the power "+Power.poweroffour(n)+" equals "+n);
			}else {
				System.out.println("No, "+n+" is not a power of 4");
			}
		//if Power.poweroffour(n)!=0 then print yes
		}else {
			System.out.println("Yes, "+n+" is a power of 4 such that 4 to the power "+Power.poweroffour(n)+" equals "+n);
		}

	}
}
/*
- Test Cases :
      Input : Enter the number : 262144
     Output : Yes 262144 is a power of 4 such that 4 to the power 9 equals 262144

- Complexity Analysis :
 * Time Complexity : O(log(n))
         Because after every iteration n is divided by 4
 * Space Complexity : O(1)
	  	 Auxiliary space : O(1)  +  input space : O(1)
*/
  
