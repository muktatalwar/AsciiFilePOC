package poc.file.writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import poc.file.util.AsciiFileConstants;

/**
 *Handles the Responsibility of Writing Content to a File
 */
public class AsciiFileWriter {
	
	
	
	public void writeContentToFile(List<String> fileContent,String fileName) throws IOException {
		
		
		   Path path = Paths.get(fileName);
		   try (BufferedWriter writer = Files.newBufferedWriter(path, AsciiFileConstants.OUTPUT_FILE_ENCODING)){
		     
			   for(String line : fileContent){
			        writer.write(line);
			        writer.newLine();
			      }
		        
		      }
		    }
		  

		
	

}
