package conditionalOperators;

public class ak_07_ifElse {
    public static void main(String[] args) {
        int age = 19;
        if(age>=18){
            System.out.println("You can vote now");
        }

//  Shorthand  If...Else (Ternary Operator):-
//        variable = Condition ?  expressionTrue : expressionFalse

        int a = 15;
        int b = 8;
        int maxOfNumber =0;
        maxOfNumber = a>b ? a : b;
        System.out.println("Max of both numbers is "+maxOfNumber);
    }
}
