package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class FileParser {
    
    public static Map<String, Double> parse(String file) throws Exception
    {
    	Map<String, Double> tM = new ConcurrentHashMap<String, Double>();
    	BufferedReader bufferread = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
    	
    	String next = null;
    	while((next = bufferread.readLine()) !=null)
    	{
    		String [] letters = next.split(" ");
    		double freq = Double.parseDouble(letters[1]);
    		tM.put(letters[0], freq);
    	}
    	
    	bufferread.close();
    	return tM;
    }
}
