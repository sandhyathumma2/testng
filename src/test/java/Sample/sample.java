package Sample;

import com.google.common.hash.HashCode;

public class sample {
	
	
	



	public static void main(String[] args) {
	/*	int c=0;
		
		if(c=='0' || c=='1') {
			System.out.println("yes");
		}else if (c>='2') {
			System.out.println("No");
				
			}*/
		
		boolean flag=false;
		int x=0; 
		
		for(;flag=!flag;) {
		x++;
		
		}System.out.println(x);
			
		
	
		
		int arr[][]= {{1,3,5},{7,8}};
		for(int []a: arr) 
		{
			for(int i:a) {
				System.out.println(i +" ");
			}
			
		}
		
	
String x1="name",y1="name1";
	System.out.println(x1.equals(y1));
	if(x1.hashCode()==y1.hashCode()) 
		System.out.println(true);
		else
			System.out.println(false);

	 {
	
	}
	 
	 try {
		 int n=2/0;
		 System.out.println(n);
	 }catch (ArithmeticException e) {
		e.getMessage();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
		
	
	int i=2,j=1;
	do {if(i++>--j)
	{
		break;
		
	}
		
	}while(i<9);
	System.out.println("i =" +i+ "and j=" +j);
	}
	
	
	}
	


