package org.ifelse;

import java.util.Scanner;

public class Testing {
	private void check() {
		int maths,sci,ssci,result,tamil,english;
		Scanner scan = new Scanner(System.in);
		System.out.println("Check the seat Avaliablity in School Please Enter Your 10th Mark Below:");
		System.out.println("Enter Your Tamil mark:");
		tamil = scan.nextInt();
		System.out.println("Enter Your English mark:");
		english = scan.nextInt();
		System.out.println("Enter Your maths mark:");
		maths = scan.nextInt();
		System.out.println("Enter Your Science Mark:");
		sci = scan.nextInt();
		System.out.println("Enter Your Social Science Mark:");
		ssci = scan.nextInt();
		result=maths+ssci+sci+tamil+english;
		if(result>=450) {
			System.out.println("Congrats You Have Seat");
		}
		 else if(result>=400)
		{
			System.out.println("You Got Above the"+result+ "80% in Your 12 th mostly you got seat please Wait few Days");
		}
		else if(result>=250) {
			System.out.println("you Got above"+result+" 50% but we cant give the assurence for the seat we try our best ");
		}
		
		else
		{
			System.out.println("Sorry to say you Got :"+result +" below 50% mark so we dont have seat for below 50% students");
		}
	}
	public static void main(String[] args) {
		
		
     Testing t= new Testing();
     t.check();
	}

}
