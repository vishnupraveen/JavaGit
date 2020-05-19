package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String source="src/testfile";
        String target="src/outputfile";
        //try with resources implements autoclosable thee are closable objects
        try
                (FileReader fr=new FileReader(source);
                 BufferedReader br=new BufferedReader(fr);
                 FileWriter wr=new FileWriter(target);
        )
        {
            while(true)
            {
                String line=br.readLine();
                if(line==null)
                {
                    break;
                }
                else
                {
                    wr.write(line+ "\n");
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("File Copied");
    }
}
