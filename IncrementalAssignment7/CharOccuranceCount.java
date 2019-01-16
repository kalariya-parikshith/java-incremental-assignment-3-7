import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

class CharOccuranceCount{
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader(args[0]);
		File file = new File("output.txt");
		FileWriter fw = new FileWriter(file, false);
		int[] charCount = new int[256];
		int i;
		while ((i = fr.read()) != -1) {
			charCount[i]++;
		}
		String s = "";
		for(i=0; i<256; i++){
			if(charCount[i]!=0){
				s += ((char)i+": "+charCount[i]+"\n");
			}
		}
		fw.write(s);
		fr.close();
		fw.close();
	}
}
