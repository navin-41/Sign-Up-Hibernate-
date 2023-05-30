package com.hiber;
import java.util.*;
public class Valid {
		
	      Dtodataa dd;
	     public Valid(Dtodataa dd)
	     {
	    	 this.dd=dd;
	     }
		static Scanner sc=new Scanner(System.in);
		public static void id1(int id)
		{
			boolean rr=true;
			while(rr)
			{
				System.out.println("Enter the Id :");
			   int q=sc.nextInt();
			   if (q>0)
			   {
				
				System.out.println("id is :"+q);
				id=q;
				return;
			   }
			   else
			   {
				   System.out.println("Id is invaild");
			   }
		    }
		}
		public  boolean na(String s)
		{
			
			if (Validate.name(s)==true) {
				
				dd.setName(s);	
			}
			else
			{
				
				System.out.println("enter valid name");
				Validate.name(s);
			}
			return false;
			
		}
		public  void phn(long pon)
		{
			
			if (Validate.phn(pon)) {
				dd.setPhnno(pon);
			}
			else
			{
				System.out.println("enter valid number");
				Validate.phn(pon);
			}
			
		}
		public  void mai(String s)
		{
			
			if (Validate.email(s)) {
				dd.setEmail(s);
				
			}
			else
			{
				System.out.println("enter valid mail id");
				Validate.email(s);
			}
		} 
		public  void pass(String pa)
		{
			
			if (Validate.Pass(pa)) {
				dd.setPassword(pa);
				
			}
			else
			{
				System.out.println("enter valid password");
				Validate.Pass(pa);
			}
			
		}
		public  void gen(String s)
		{

			if (Validate.gender(s)) {
			dd.setGender(s);
				
			}
			else
			{
				System.out.println("enter valid gender");
				Validate.gender(s);
			}
		}
		public  boolean altph(long phn)
		{
			
			if (Validate.altphn(phn)) {
				dd.setAltphn(phn);
			}
			return false;
			
		}
		public  void add(String j)
		{
			
			if (Validate.add(j)) 
			{
				dd.setAddress(j);;
			}
			else
			{
				
				System.out.println("enter valid address");
				Validate.add(j);
			}
			
		}
//		public  void altaddd(long d)
//		{
//			if (Validate.altadd(d)) {
//				nn.setAltphn(d);
//				
//			}
//			else
//			{
//				System.out.println("enter valid altenative address");
//				Validate.altadd(d);
//			}
//		}
		public  void dateof(String bo)
		{
			if (Validate.dob(bo)) {
				dd.setDob(bo);	
			}
			else
			{
				System.out.println("enter the valid date of birth");
				Validate.dob(bo);
			}
			
		}
		public   boolean age(int age1)
		{
			
	         if (Validate.agee(age1)) {
				dd.setAge(age1);
			}
	         else
	         {
	        	 System.out.println("enter valid age");
	        	 Validate.agee(age1);
	         }
			return false;
		}
	}

