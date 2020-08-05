import java.io.*;

/**
 * Created by KPS on 8/5/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\employee.txt");
        try(FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader)){
            String line = "";
            String value = "";
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
                value +="\n\t"+line;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
