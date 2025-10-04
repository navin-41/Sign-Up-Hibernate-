package com.hiber;
import java.util.*;
public class Getfromuser {
		
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			Dtodataa ct1=new Dtodataa();
			Valid name=new Valid(ct1);
			
			boolean q=true;
			System.out.println("Choose below options");
			   System.out.println(" 1-for Name \n 2-for Mobile No \n 3-for Password \n 4-for Email \n 5-for Age \n 6-for gender \n 7- for Address  \n 8-for Alternate Mobile No \n 9- for Date Of Birth ");
	            
			  int c=0;
			   while(q)
			   {
				   int f=sc.nextInt();
			switch (f) 
			{
//			case 1:
//			{
//				System.out.println("Enter the Id :");
//				   int q1=sc.nextInt();
//				   if (q1>0)
//				   {
//					
//					System.out.println("id is :"+q);
//					n1=q;
//					return;
//				   }
//				   else
//				   {
//					   System.out.println("Id is invaild");
//				   }
//				
//			}
				case 1:
				{
					  System.out.println("Enter the your Name");
					  String nam=sc.next();
			           name.na(nam);
			           c++;
				       System.out.println("2-for Mobile No \n 3-for Password \n 4-for Email \n 5-for Age \n 6-for gender \n 7- for Address  \n 8-for alter Mobile No \n 9- for Date Of Birth ");
				       System.out.println("your name is "+nam);
				}
				       break;
				case 2:
				{
			     System.out.println("Enter the Mobile number: ");
			     long l=sc.nextLong();
			     name.phn(l);
			     c++;
						System.out.println("3-for Password \n 4-for Email \n 5-for Age \n 6-for gender \n 7- for Address  \n 8-for alter Mobile No \n 9- for Date Of Birth ");
				}break;
				case 3:
				{
			      System.out.println("Enter the  Password: ");
			      String ps=sc.next();
			      name.pass(ps);
			      c++;
			      System.out.println("4-for Email \n 5-for Age \n 6-for gender \n 7- for Address  \n 8-for alter Mobile No \n 9- for Date Of Birth ");
				} break;
				case 4:
				{
				      System.out.println("Enter the Email");
				      String ff=sc.next();
				      name.mai(ff);
				      c++;
				       System.out.println("5-for Age \n 6-for gender \n 7- for Address  \n 8-for alter Mobile No \n 9- for Date Of Birth ");
				} break;
				case 6:
				{
				      System.out.println("Enter the Gender");
				     String sss=sc.next();
					  name.gen(sss);
					  c++;
					   System.out.println("7- for Address  \n 8-for alter Mobile No \n 9- for Date Of Birth ");
				}break;
					case 7:
					{
					  System.out.println("Enter the Address");
					  String jj=sc.next();
					  name.add(jj);
					  c++;
					  System.out.println("8-for alter Mobile No \n 9- for Date Of Birth ");
					} break;
//					case 7:
//					{
//				      System.out.println("Enter Alternative Address");
//				      String add=sc.next();
//					   name.add(add);
//					   c++;
//					   System.out.println("8-for alter Mobile No \n 9- for Date Of Birth ");
//					} break;
					case 8:
					{
				      System.out.println("Enter the  alternative Mobile number");
				      long l1=sc.nextLong();
				      name.altph(l1);
				      c++;
				      System.out.println("  9- for Date Of Birth ");
					}break;
					case 9:
					{
				       System.out.println("Enter the date of birth in date/month/year in this format ");
				       String s3=sc.next();
				        name.dateof(s3);
				        c++;
				        //System.out.println("10- for Date Of Birth ");
				        System.out.println(" enter 0 for submit"); 
					} break;
					case 5:
					{
				      System.out.println("enter your age");
				      int h=sc.nextInt();
				      name.age(h);
				      c++; 
				      System.out.println("6-for gender \n 7- for Address  \n 8-for alter Mobile No \n 9- for Date Of Birth ");
					}
					break; 
		
					case 0:
					{
						System.out.println("press again 0 for submit");
						int t=sc.nextInt();
						
						if (t==0&&c==9) {
							Daodata.ing(ct1);
							System.out.println(" your details are submited");
							
						}
						else
						{
							System.err.println("Please Enter all the above Details to Submit");
							 System.out.println(" 1-for Name \n 2-for Mobileno \n 3-for Password \n 4-for Email \n 5-for Gender \n 6-for Address \n 7-for Alt address \n 8- for alternative phone number  \n 9-for dat of birth \n 10- for age"); 
						}
					}break;	
					}   
			   }	 
			   }	
	}

