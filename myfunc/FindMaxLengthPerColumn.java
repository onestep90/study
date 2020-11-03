import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaxLengthPerColumn {
	
	public static void main(String[] args) {
		
		int columnLength = 16;
		// for windows
		String path = "D:/PWOMC/2nd_interim_report/doc/DB/tmy/090.csv";
		// for macosx or linux
//		String path = "/Users/t/vgen/pwomc/2nd_interim_report/doc/db/DB_FAILURE_HISTORY.csv";
		
		List<List<String>> ret = new ArrayList<List<String>>();
		BufferedReader br = null;
		String[] value = new String[columnLength];
		int[] lengthArray = new int[columnLength];
		String[] lengthArrayStr = new String[columnLength];
		
		try {
			br = Files.newBufferedReader(Paths.get(path));
			String line = "";
			
			int cnt = 0;
			while((line = br.readLine()) != null) {
				 if (cnt==0){
				 	cnt++;
				 	continue;
				 }
				List<String> tmpList = new ArrayList<String>();
				String array[] = line.split(",");
				for (int i=0; i<columnLength; i++) {
					if (lengthArray[i]<array[i].length()) {
						value[i] = array[i];
						lengthArray[i] = array[i].length();
						continue;
					}
				}
				tmpList = Arrays.asList(array);
//				System.out.println(tmpList);
				ret.add(tmpList);
			}
			for(int i=0; i<columnLength; i++) {
				lengthArrayStr[i] = Integer.toString(lengthArray[i]);
			}
			List<String> maxValueList = new ArrayList<String>();
			List<String> maxLengthList = new ArrayList<String>();
			maxValueList = Arrays.asList(value);
			maxLengthList = Arrays.asList(lengthArrayStr);
			System.out.println(maxValueList);
			System.out.println(maxLengthList);
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
