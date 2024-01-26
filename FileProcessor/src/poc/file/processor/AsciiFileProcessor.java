package poc.file.processor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import poc.file.util.AsciiFileConstants;

/**
 * Class handling the responsibility of performing any kind of transformations on the file content
 */
public class AsciiFileProcessor {
	
	

	public List<String> reverseContent(List<String> fileContent){
		
		List<String> outputFileContent = new ArrayList<String>();
		//if File Content has lines
		if(fileContent.size()>0) {
			return reverseFileContent(fileContent);
		}else {
			System.out.println("File is Empty");
			return outputFileContent;
		}
		
	}

	private List<String> reverseFileContent(List<String> fileContent) {
		List<String> reversedContent = new ArrayList<String>();
		ListIterator<String> listIterator = fileContent.listIterator(fileContent.size());
		
		while (listIterator.hasPrevious()) {
			String reveresedString = reverseString(listIterator.previous());
			System.out.println("Reversed Sring: " + reveresedString );
			reversedContent.add(reveresedString);
		}
		
		return reversedContent;
		
		
	}

	private String reverseString(String previousElement) {
		return new StringBuilder(previousElement).reverse().toString();
	}

}
