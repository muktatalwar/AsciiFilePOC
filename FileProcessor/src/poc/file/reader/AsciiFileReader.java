package poc.file.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import poc.file.util.AsciiFileConstants;


/**
 * Class Responsible to Read a File
 */
public class AsciiFileReader {
	
	
	
	public List<String> readFile(String filePath) throws IOException{
		
			List<String> fileContent = new ArrayList<String>();
			Path path = Paths.get(AsciiFileConstants.INPUT_FILE_PATH);
			
			try (BufferedReader reader = Files.newBufferedReader(path, AsciiFileConstants.INPUT_FILE_ENCODING)){
			      String line = null;
			      
			      while ((line = reader.readLine()) != null) {
			        //Add each line to an arraylist of string
			        fileContent.add(line);
			      }      
			    } catch (IOException e) {
					// log error
					e.printStackTrace();
					//return error back to calling class
					throw e;
				}
			return fileContent;
	}
}
