import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Logger;

class CharOccuranceCount{

	private static Logger logger = Logger.getLogger("CharOccuranceCount log");

	/**
	 * reads the contents of the given file
	 * 
	 * @param 	fileName name of the input file whose contents to be read
	 * 
	 * @throws 	FileNotFoundException if file with given name doesn't exist
	 * @throws 	IOException if an I/O error occurs while reading a line
	 * 
	 * @return 	contents of a file as a string
	 */
	private static String readFileAsString(String fileName) 
							throws FileNotFoundException, IOException  {

		InputStream inputStream = new FileInputStream(fileName);
		BufferedReader bufferedReader = 
						new BufferedReader(new InputStreamReader(inputStream));
		        
		String line = bufferedReader.readLine();
		StringBuilder stringBuilder = new StringBuilder();
		        
		while(line != null){
		   stringBuilder.append(line).append("\n");
		   line = bufferedReader.readLine();
		}
		        
		return stringBuilder.toString();
	}

	/**
	 * counts all the occurances of unique character into Map interface
	 *
	 * @param fileContent contents of a file as String
	 *
	 * @return unique character occurances count as Map interface
	 */
	private static Map< Character,Integer> countUniqueCharacters(String fileContent) {
		Map< Character,Integer> charCount = new HashMap< Character,Integer>();
		for(int index = 0; index < fileContent.length(); index++) {
			Character c = fileContent.charAt(index);
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			} else {
				charCount.put(c, 1);
			}
		}
		return charCount;
	}

	/**
	 * stores unique character occurances count into a file
	 * 
	 * @param charCount unique character occurances count as Map interface
	 * 
	 * @throws 	IOException if the named file exists but is a directory 
	 * 			rather than a regular file, does not exist but cannot be created, 
	 * 			or cannot be opened for any other reason
	 */
	private static void storeUniqueCharacterCountIntoFile(Map< Character,Integer> charCount) 
							throws IOException {
		File file = new File("output.txt");
		FileWriter fileWriter = new FileWriter(file, false);
		String charactersCountAsString = "";

		Set< Map.Entry< Character,Integer> > set = charCount.entrySet(); 
		for (Map.Entry< Character,Integer> mapEntity: set) { 
			charactersCountAsString += mapEntity.getKey()+":"+mapEntity.getValue()+"\n"; 
		}

		fileWriter.write(charactersCountAsString);
		fileWriter.close();
	}

	public static void main(String[] args) {
		try {
			String fileContent = readFileAsString(args[0]);
			Map< Character,Integer> charCount = countUniqueCharacters(fileContent);
			storeUniqueCharacterCountIntoFile(charCount);
		} catch(FileNotFoundException e) {
			logger.info(e.getMessage());
		} catch(IOException e) {
			logger.info(e.getMessage());
		}
	}
}
