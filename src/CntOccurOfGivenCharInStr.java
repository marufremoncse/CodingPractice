import java.util.Scanner;

public class CntOccurOfGivenCharInStr {
    public static void main(String[] args) {
        String s = "ecnqcyrtewycrwhtertuirnchtcrvbvjvxnfgrckghsgchdighshcf";
        System.out.print("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println(String.format("Occurrence of char %c: %d",c,count));
    }
}
