package com.neusoft.base.answer;

public class Ex17 {
/*�߶ȣ�9
��ǰ�У�n
�ո�����h<=5		��ǰ��h-n
	    h>5		��ǰ��h-��10-n��		n=6ʱ�൱��n=4
�Ǻ�����h<=5		2n-1
		h>5		2(10-n)-1*/
		public static void main(String[] args) {
		for(int n=1;n<=9;n++) {
			if(n<=5) {
			for(int m=1;m<=9-n;m++) {
				System.out.print(" ");
			}
			for(int m=1;m<=2*n-1;m++) {
				System.out.print("*");
			}
			System.out.println();
			}
			if(n>5) {
				for(int m=1;m<=9-10+n;m++) {
					System.out.print(" ");
				}
				for(int m=1;m<=20-2*n-1;m++) {
					System.out.print("*");
				}
				System.out.println();
				}
			}
		}
		}
	/*public static void main(String[] args) {
		for(int n=1;n<=5;n++) {
			for(int m=1;m<=5-n;m++) {
				System.out.print(" ");
			}
			for(int m=1;m<=2*n-1;m++) {
				System.out.print("*");
			}
			for(int m=1;m<=5-n;m++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		for(int n=4;n>=1;n--) {
			for(int m=1;m<=5-n;m++) {
				System.out.print(" ");
			}
			for(int m=1;m<=2*n-1;m++) {
				System.out.print("*");
			}
			for(int m=1;m<=5-n;m++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}*/
//}
