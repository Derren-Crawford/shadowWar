package shadowwararmaggeddon;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile 
{
    
    private String filePath;

    public ReadFile(String filePath) 
    {
        this.filePath = filePath;
    }
    
    public String[] openFile() throws IOException
    {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader textReader = new BufferedReader(fileReader);
        
        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];
        
        for(int i=0; i < numberOfLines; i++)
        {
            textData[i] = textReader.readLine();
        }
        
        textReader.close();
        return textData;
    }
    
    private int readLines() throws IOException
    {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader textReader = new BufferedReader(fileReader);
        
        String aLine;
        int numberOfLines = 0;
        
        while ((aLine = textReader.readLine()) != null)
        {
            numberOfLines++;
        }
        textReader.close();
        
        return numberOfLines;
    }
    
    

}
