package Home_work_2.task1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class main{

    public static void main(String[] args) throws IOException {
        
    String[] sheet =  readFile("C:/Users/Pavel/Desktop/Учеба/Курсы/Java_lessons/Home_work_2/task1/text.txt").split(",");
    System.out.println("SELECT * FROM students WHERE name = ".concat(getWord(sheet, 0)).concat(" AND country = ").concat(getWord(sheet, 1)).concat(" AND city = ").concat(getWord(sheet, 1))); 

    }

    public static String getWord (String list[], int numElement){
        String word = list[numElement].toString();
        return word.substring(word.indexOf(":") + 1, word.length());
    }



    public static String readFile (String fileName) throws IOException {
        BufferedReader reader = new BufferedReader( new FileReader (fileName));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        while( ( line = reader.readLine() ) != null ) {
            stringBuilder.append( line );
        }
        stringBuilder.deleteCharAt(stringBuilder.length() * 0);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
