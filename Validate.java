package com.hiber;
import java.util.Iterator;

public class Validate {
		public static boolean name(String name)
		{
			boolean b=false;
			for (int i = 0; i< name.length(); i++) 
			{
				char ch=name.charAt(i);
				if ((ch>=65&&ch<=90||ch>=97&&ch<=122)&&(name.length()>3)) 
				{
					b=true;
				}
				else {
				   b= false;
				}
			}
			return b;
		}
		public static boolean phn(long po)
		{
			if (po>=61111111&&po<=9999999999l) {
				return true;
			}
			else {
				
			}
			return false;
		}
		public static boolean email(String jj)
		{
		   String g=jj;
			String em=g.substring(g.length()-10,g.length()-1);
			String e="@gmail.com";
			int c=0;
			boolean c1=false;
			boolean ret=true;
			if(g.contains(e)&&g.length()>=13)
			{
				c1=true;
				c++;
			}
			if (c1==true&&g.contains(em)) {
			
			     ret=true;
			}
			else {
				if(c>1)
				{
					ret= false;
				}
				}
			return ret;
		}
		public static boolean Pass(String pass)
		{

			for (int i = 0; i < pass.length(); i++) {
				char ch=pass.charAt(i);
				if(pass.length()>=6) {
				if (ch>=48&&ch<=57&&ch>=65&&ch<=90||ch>=97&&ch<=122&&!(ch>=48&&ch<=57||ch>=65&&ch<=90||ch>=97&&ch<=122)) {
					return true;
				}
			} else {
				return false;
				
			}
				
				}
			return true;
			}
		public static boolean  agee(int age)
		{
			if (age>18&&age<30) {
				return true;
				
			}
			return false;
		}
		public static boolean gender(String gen)
		{
			
			String m="male";
			String f="female";
			String ge="others";
			if (gen.equalsIgnoreCase(f)||gen.equalsIgnoreCase(m)||gen.equalsIgnoreCase(ge)) {
				return true;
			}
			else
			{
				return false;
			}	
		}
		public static boolean add(String h)
		{
			for (int  i= 0;  i< h.length(); i++) {
				char  ch=h.charAt(i);
				if (ch>=65&&ch<=90||ch>=97&&ch<=122&& ch==' ') {
					return true;
				}
				
			}
			return true;
			
		}

		public static boolean altadd(String h)
		{

			for (int  i= 0;  i< h.length(); i++) {
				char  ch=h.charAt(i);
				if (ch>=65&&ch<=90||ch>=97&&ch<=122&& ch==' ') {
					return true;
				}
				
			}
			return true;
		}
		public static boolean altphn(long l)
		{
			Dtodataa nn=new Dtodataa();
			long j=l;
			if(j!=nn.getPhnno()) {
			return true;	
			}
			return false;
		}
//		public static boolean id(int n1)
//		{
//			   if (n1>0)
//			   {
//				
//				System.out.println("id is :"+n1);
//				//id=q;
//				return true;
//			   }
//			   else
//			   {
//				   System.out.println("Id is invaild");
//			   }
//			return false;
//		}
		
		public static boolean  dob(String bo)
		{
			for (int i = 0; i < bo.length()-1; i++) {
				char ch=bo.charAt(i);
		   if (ch>=48&&ch<=57&&!(ch>=65&&ch<=122||ch>=97&&ch<=122)) {
			
		   return true;
		}
			}
		return false;
			
		}
		}
		
