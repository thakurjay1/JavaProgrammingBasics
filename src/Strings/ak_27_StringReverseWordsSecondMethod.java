package Strings;

public class ak_27_StringReverseWordsSecondMethod {
    public String reverseWords(String word){
        String result = "";
        int i = word.length() - 1;
        while(i>=0){
            while(i>=0 && word.charAt(i)==' ') i--;
            int j = i;

            if(i<0) break;
            while(i>=0 && word.charAt(i)!= ' ') i--;
            if(result.isEmpty()){
                result = result.concat(word.substring(i+1, j+1));
            }
            else{
             result = result.concat(" "+word.substring(i+1, j+1));
            }

        }
        return result;
    }


    public static void main(String[] args) {
        ak_27_StringReverseWordsSecondMethod obj = new ak_27_StringReverseWordsSecondMethod();
        System.out.println(obj.reverseWords("    Hey guys here's an invitation    "));


    }
}
