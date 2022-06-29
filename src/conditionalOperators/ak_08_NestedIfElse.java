package conditionalOperators;

public class ak_08_NestedIfElse {
    public static void main(String[] args) {
//  Max of three numbers:
       int a = 84;
       int b = 89;
       int c = 97;
       if(a>b){
           if(a>c){
               System.out.println("Greater number is "+a);
           }
           else{
               System.out.println("Greater number is "+c);
           }
       }
       else{
          if(b>c){
              System.out.println("Greater number is "+b);
          }
          else{
              System.out.println("Greater number is "+c);
          }
       }

//  Shorthand:-
       int x = 13;
       int y = 18;
       int z = 12;
       int result = x>y ? x>z ? x : z : y>z ? y : z;
        System.out.println(result);
    }
}
