
import java.util.Scanner;

class TextCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int characters = 0 , words = 0 , lines = 0;
        System.out.println("enter text (type 'END' ina line to finsih) : ");
        while (true) { 
            String line = sc.nextLine();
            if(line.equals("END")){
                break;
            }
            lines++;
            characters+=line.length();
            String[] w = line.trim().split("\\s+");
            if(!line.trim().isEmpty()){
                words += w.length;
            }
        }
        System.out.println("\nNumber of lines : " + lines);
        System.out.println("\nNumber of words : " + words);
        System.out.println("\nNumber of character : " + characters);
    }
}