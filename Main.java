import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // File file= new File("Hello.txt");
        // try {
        //     file.createNewFile();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // try {
        //     FileWriter fw= new FileWriter("Hello.txt");
        //     fw.write("Hello world");
        //     fw.close();
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }


        // Reading the file 
        try {
            FileReader fr =new FileReader("Hello.txt");
            int value;
            try {
                while((value=fr.read()) != -1){
                    System.out.print((char)value);
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}