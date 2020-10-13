import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            Scanner read = new Scanner(new File("input.txt"));
            do {
                //Read each line
                int line = read.nextInt();
                list.add(line);
            } while (read.hasNext());
            read.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        }
        for (int i = 0; i < list.size()-1 ; i+=2){
            int x = i;
            int n = i + 1;
            if ( x == 0 && n == 0){
                break;
            }

        }
    }
}
