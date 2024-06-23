//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
public class Main {
    public static void main(String[] args) {

        System.out.println(sum(9, 9));


        reverseString("Preston Blake");


    }


    static int sum(int a, int b){
        return a + b;
    }

    static void reverseString(String sentence){
        String newSentence = "";
        for(int i = sentence.length() - 1; i >= 0; i--){
                newSentence += sentence.charAt(i);
        }
        System.out.println(newSentence);
    }
}