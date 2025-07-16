



public class Datatype{

	 //Declare variables of all primitive data types and print their default values.
	 static void prob1(){

		   int num1=12;
		   short num2=1000;
		   byte num3=10;
		   long num4=1234567L;
		   float num5=3.13f;
		   double num6=99.99;
		   char ch='s';
		   boolean isvirgin=true;

		   System.out.println("int:"+num1);
		   System.out.println("short:"+num2);
		   System.out.println("byte:"+num3);
		   System.out.println("long:"+num4);
		   System.out.println("float:"+num5);
		   System.out.println("double:"+num6);
		   System.out.println("ch:"+ch);
		   System.out.println("svirgin:"+isvirgin);


	 }

      //Create a program that adds two integers and prints the result.
	  static int sums(int num1,int num2){

		   return num1+num2;
	  }
	//Show type casting from float to int and vice versa.
    static void  typecasting(double  n){

		      int inti=(int) n;
			  double doble=(double)inti;
			  float s=(float)inti;

			  System.out.println("float to int:"+inti);
			  System.out.println("int to double:"+doble);
			  System.out.println("int to float :"+s);	
	}

	static void  cheakEligible(int age){

		    boolean isEligible=true;

			if(age>=18){

				  isEligible=true;

			}else{

				   isEligible=false;
			}

			System.out.println("Eligibale for voting:"+isEligible);
	}

	static  void constant(){

		  final  String name="Sahil";

		  System.out.println("my name:"+name);  

	}


	 public static void main(String[] args){

		 System.out.print("hello\n");

		  Datatype.cheakEligible(21);
		  Datatype.cheakEligible(22);
		  Datatype.cheakEligible(30);
		  Datatype.cheakEligible(12);
		  Datatype.cheakEligible(18);

		  Datatype.constant();
	 }
}
