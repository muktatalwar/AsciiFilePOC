package poc.file.util;

import java.io.IOException;
import java.util.List;

import poc.file.processor.AsciiFileProcessor;
import poc.file.reader.AsciiFileReader;
import poc.file.writer.AsciiFileWriter;

public class AsciiFileUtilValidator {
	
	
	public static void main(String args[]) {
		
		AsciiFileReader fileReader = new AsciiFileReader();
		AsciiFileProcessor fileProcessor = new AsciiFileProcessor();
		AsciiFileWriter fileWriter = new AsciiFileWriter();
		
		
		try {
			//read input file
			List<String> inputFileContent = fileReader.readFile(AsciiFileConstants.INPUT_FILE_PATH);
			
			//reverse the contens of a file
			List<String> reversedFileContent = fileProcessor.reverseContent(inputFileContent);
			
			//write reversed content to output file
			fileWriter.writeContentToFile(reversedFileContent, AsciiFileConstants.OUTPUT_FILE_PATH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
