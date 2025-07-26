import java.io.FileWriter;   
import java.io.IOException;  
class Filewrite
{
 	 public static void main(String[] args)
      {
        try
          {
      	FileWriter FW = new FileWriter("TEMP.txt");
	 FW.write("WELCOME TO GOVT POLYTECHNIC MIRLE......");
    	  FW.close();
      	System.out.println("Successfully wrote to the file.");
           } 
      catch (IOException e)
      {
           System.out.println("An error occurred.");
          e.printStackTrace();
     }
  }
}
