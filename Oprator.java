
public class Oprator{

    static void Arithmatic(int num1,int num2){

        long ans=0;
        long ans2=1;
        ans=num1+num2;
        System.out.println("ans sum :"+ans);
        ans2=num1*num2;
        System.out.println("ans mul:"+ans2);
        int ansSub=Math.abs(num1-num2);
        System.out.println("ans sub:"+ansSub);
        float ansdiv=num1/num2;
        System.out.println("ansdiv:"+ansdiv);

    }

    static void compares(int num1,int num2){

          Boolean s=num1!=num2;
          System.out.println("compare !=:"+s);
          Boolean s2=num1==num2;
          System.out.println("compare ==:"+s2);
          Boolean s3=num1>num2;
          System.out.println("compare >:"+s3);
          Boolean s4=num1<num2;
          System.out.println("compare <:"+s4);
          Boolean s5=num1<=num2;
          System.out.println("compare <=:"+s5);
          Boolean s6=num1>=num2;
          System.out.println("compare >=:"+s6);
    }

    static void iseven(int num){

          boolean isevn=num%2==0;

          System.out.println("iseven:"+isevn);
    }

    
	static void bitwise(){

		int a = 5;   // 0101 in binary
        int b = 3;   // 0011 in binary

        System.out.println("a & b = " + (a & b));   // 1  (0001)
        System.out.println("a | b = " + (a | b));   // 7  (0111)
        System.out.println("a ^ b = " + (a ^ b));   // 6  (0110)
        System.out.println("~a = " + (~a));         // -6 (inverts all bits)
        System.out.println("a << 2 = " + (a << 2)); // 10 (1010)
        System.out.println("a >> 2 = " + (a >> 2)); // 2  (0010)
	}


    public static void main(String[] args) {

         Oprator.Arithmatic(4000,2000);
         Oprator.compares(2, -2);
         System.out.println("");
         Oprator.compares(2, 2);
         System.out.println("");
         Oprator.compares(2, 52);
         System.out.println("");
         Oprator.compares(24, -2);
         System.out.println("evenis");
         Oprator.iseven(24);
         Oprator.iseven(0);
         Oprator.iseven(8);
         Oprator.iseven(9);
         Oprator.iseven(6);
         System.out.println("Bitwase");
         Oprator.bitwise();

        
    }
}