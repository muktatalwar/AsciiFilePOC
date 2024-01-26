package poc.file.processor.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import poc.file.processor.AsciiFileProcessor;


public class AsciiFileProcessorTest {
	
	@Test
	public void testEmptyFileContent() {
		List<String> emptyList = new ArrayList<String>();
		AsciiFileProcessor processor = new AsciiFileProcessor();
		
		List<String> outputList= processor.reverseContent(emptyList);
		assertTrue(outputList != null);
		assertTrue(outputList.isEmpty());
	}
	
	@Test
	public void testNonEmptyFileContent() {
		List<String> nonEmptyList = new ArrayList<String>();
		nonEmptyList.add("Test1");
		nonEmptyList.add("Test2");
		nonEmptyList.add("Test3");
		nonEmptyList.add("Test4");
		nonEmptyList.add("Test5");
		AsciiFileProcessor processor = new AsciiFileProcessor();
		
		List<String> outputList= processor.reverseContent(nonEmptyList);
		List<String> mockListForValidation = new ArrayList<String>();
		
		mockListForValidation.add("5tseT");
		mockListForValidation.add("4tseT");
		mockListForValidation.add("3tseT");
		mockListForValidation.add("2tseT");
		mockListForValidation.add("1tseT");
		
		assertTrue(outputList != null);
		assertTrue(outputList.size()>0);
		
	
		for (int i = 0; i < outputList.size(); i++) {
			
			assertTrue(outputList.get(i).equals(mockListForValidation.get(i)));
			
		}
	
	}

}
