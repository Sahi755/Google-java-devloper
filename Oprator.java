
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

    public static void main(String[] args) {

         Oprator.Arithmatic(4000,2000);
        
    }
}