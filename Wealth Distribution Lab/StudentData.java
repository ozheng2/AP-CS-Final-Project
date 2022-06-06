import java.util.*;
import java.io.*;

public class StudentData {
  
  private ArrayList<String> unformattedData;
  private String[][] formattedData;
  private File fileName;
  private int col;
  
  public StudentData(String file) {
    try {
      fileName = new File(file); //opens the file to read
      Scanner scan = new Scanner(fileName); //instantiates a Scanner object that will read the file
      
      /* Initialize the ArrayList and read through the file, populating the  */
      unformattedData = new ArrayList<String>();
      while(scan.hasNextLine())
      {
          unformattedData.add(scan.nextLine());
      }
      
      /* populate unformattedData array with data from the table */
      /* use String method replaceAll(String replace, String replacement) to get rid double quotes */
      int tempLength = unformattedData.size();
      for(int i = 0; i < tempLength; i++)
      {
          String word = unformattedData.get(i);
          String newWord = word.replaceAll("\"", "");
          unformattedData.add(newWord);
      }
      
      /* parse through the first row of unformattedData to determine the number of columns */
      int columns = 1;
      int index = unformattedData.get(0).indexOf(",");
      String temp = unformattedData.get(0);
      while(index != -1)
      {
          columns++;
          temp = temp.substring(index + 1);
          index = temp.indexOf(",");
      }
      col = columns;
      /* initialize the formattedData array using rows and columns */
      formattedData = new String[unformattedData.size()][columns];
      /* populate formattedData array with data from unformattedData */
      for(int r = 0; r < formattedData.length; r++){
        String temp2 = unformattedData.get(r);
        int i = temp2.indexOf(",");
        for(int c = 0; c < formattedData[0].length; c++){
            if(i != -1){
                formattedData[r][c] = temp2.substring(0,i);
                temp2 = temp2.substring(i + 1);
                i = temp2.indexOf(",");
            }else
                formattedData[r][c] = temp2;
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
  
  public String[][] getFormattedData() {
    return formattedData;
  }
  
  public int getCol(){
      return col;
  }
  
  /* Returns the row containing the country and year. Returns -1 if not found. */
  public int getRow(String countryName, String year) {
    for(int r = 0; r < formattedData.length; r++)
    {   
        String[] data = formattedData[r];
        if(data[0].equals(countryName) && data[1].equals(year))
            return r;
    }
    return -1;
  }
}
  
  