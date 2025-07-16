
public class Condition{

          static void chekPositve(int num){

            if(num==0){

            System.out.println("Zero");

          }else if(num>0){

                System.out.println("Positive!");
            }else{

                System.out.println("Negetive!");
            }

          }

         static void evenodd(int num){
             if(num%2==0){
                 System.out.println("even!");
             }else{
                 System.out.println("Odd!");
             }
         }

         static void typechar(char ch){

               if((ch=='a'|| ch=='o'||ch=='e'|| ch=='u'||ch=='i')||(ch=='A'|| ch=='O'||ch=='E'|| ch=='U'||ch=='I')){
        
                   System.out.println(ch+":VOWELS");
               }else{
                   System.out.println(ch+":consonant");
               }
         }

         static void MaxNumber(int number1 ,int number2){

              if(number1>number2){
                  System.out.println("MAX:"+number1);    
              }else{
                 System.out.println("MAX:"+number2);
              }
         }

         static void Max3(int num1,int num2,int num3){

              if(num1>=num2 && num1>=num3){

                  System.out.println("MAX:"+num1);

              }else if(num2>=num1 && num2>=num3){

                    System.out.println("MAX:"+num2);

              }else if(num3>=num1 && num3>=num2){

                   System.out.println("MAX:"+num3);
              }
         }

         static void typestring(char s){
 
              if(s>='a' && s<='z'){

                 System.out.println("Lower case!");

              }else if( s>='A'&& s<='Z'){

                 System.out.println("Upeer case!");

              }else if(s>='0' && s<='9'){

                 System.out.println("its Digits!");

              }else{
                   System.out.println("special character!");
              }
         }

          static void inrange(int n){

                 if(n>=1 && n<=100){
                       System.out.println("in range!");
                 }else{
                      System.out.println("un not range!");
                 }
          }

          static void numberMultiple(int num){

         for(int i=0;i<num;i++){
               if(i%3==0 && i%7==0){     

                   System.out.println("multiple:"+i+",");
               }
             }
          }
          
          public static void main(String[] args) {
            
          Condition.chekPositve(0);
          Condition.chekPositve(-1);
          Condition.chekPositve(2);
          Condition.chekPositve(32);
          Condition.chekPositve(320);

          Condition.evenodd(3);
          Condition.evenodd(2);
          Condition.evenodd(3);
          Condition.evenodd(4);
          Condition.evenodd(6);
          Condition.evenodd(100);

          Condition.typechar('Z');
          Condition.typechar('A');
          Condition.typechar('a');
          Condition.typechar('K');
          Condition.typechar('i');
          Condition.typechar('u');

        Condition.MaxNumber(1200, 3000);
        Condition.MaxNumber(-12, 3000);
        Condition.MaxNumber(12, -3000);
        Condition.MaxNumber(12346, 3000);
        Condition.MaxNumber(12345, 300330);
        Condition.Max3(1, 2, 3);
        Condition.Max3(3, 2, 1);
        Condition.Max3(3, 1, 2);
        Condition.Max3(-1, 0, 3);
        Condition.Max3(1000, 200, 300);
        Condition.Max3(100, 200, 3000);


         Condition.typestring('a');
         Condition.typestring('1');
         Condition.typestring('Z');
         Condition.typestring('@');
         Condition.typestring('D');

         Condition.inrange(12);
         Condition.inrange(111);
         Condition.inrange(33);
         Condition.inrange(99);
         Condition.inrange(121);
         Condition.inrange(52);

         Condition.numberMultiple(100);

   }
}

