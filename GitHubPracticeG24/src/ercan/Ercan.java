package ercan;

import java.util.Scanner;

public class Ercan {
    public static void main(String[] args) {
        for(int i=0; i<=100; i++) {
            System.out.println("Ercan The king");
            System.out.println("Yes Sir. said Azad");
            System.out.println("Ladies and Gentlemen");

            Scanner scan = new Scanner(System.in);
            System.out.println("Please input you sentence");
            String sentence = scan.nextLine();

            String issue = "practice";
            if(sentence.contains(issue)){
                sentence = sentence.replaceFirst(issue, "More Practice");
                System.out.println(sentence);
            }else{
                System.out.println("practice,practice,practice,practice,practice");
            }



        }
    }
}
