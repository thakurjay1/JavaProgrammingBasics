package Strings;

public class ak_20_StringReverseWords {
    public static void main(String[] args) {
//        Reverse words in a given string:-
//        I love Java, the coffee
//        coffee the Java, love I

        String s = "I love java, the coffee";
        String arr[] = s.split(" ");
        String reverseWord ="";
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                reverseWord = arr[i]+ reverseWord;
            }
            else{
                reverseWord = " " + arr[i] + reverseWord;
            }
        }
        System.out.println(reverseWord);
    }
}
