package readfile;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map; 
import java.util.Map.Entry; 

public class readfile {

	
	public static void main(String[]args) throws IOException{
	
	File inputFile = new File("/Users/ted/eclipse-workspace/readfile/src/main/java/readfile/test.txt");
	
	FileReader fileReader = new FileReader(inputFile);
	
	BufferedReader bufferReader = new BufferedReader(fileReader);
	
	String line = bufferReader.readLine();
	
	//System.out.println(line);

	Scanner input = new Scanner(System.in);
//	System.out.print("Please enter your name: ");
//	String userInput = input.nextLine();
//	
//	System.out.println("My name is: " + userInput);
	
	
	/* ****************** Read File for Data *****************/
	File inputFile1 = new File("/Users/ted/eclipse-workspace/readfile/src/main/java/readfile/test.txt");
	Scanner readFileData = new Scanner(inputFile1);
	ArrayList<String> data = new ArrayList<String>();
	//String linec =new String();

	while(readFileData.hasNextLine())
	{
		String lines = readFileData.nextLine();
		//String aa = readFileData.();
        //String[] strs = lines.trim().split("[，。？,.? ]");
		//String linea ="";
		//String lineb = lines+linea;
		//System.out.println(lineb);
		//String linec =lineb；
		//data.addall(lines.asList(lines.split("[，。？,.? ]")));
		data.add(lines);
		//data.add(aa);
		//System.out.println(data);
	}
	//System.out.println(data);
	
	String listString = String.join(" ", data);
	System.out.println(listString);
    String[] userIdArray = listString.split(",");
	//System.out.println(userIdArray);

    ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(userIdArray));
	System.out.println(arrayList);
	
//    ArrayList<String> list = new ArrayList<String>(); 
//    list.add("Geeks"); 
//    list.add("for"); 
//    list.add("Geeks"); 
//    System.out.println(list);
	String[]  s2 = listString.split(" ");
	ArrayList<String> words = new ArrayList<String>();

	for(int x =0; x< s2.length-1;x++)
	   {
	        words.add(s2[x]);
	   }
	//return words;
	System.out.println(words);
	
//	if ( (Collections.frequency(data, data)) > 1 ){
//	    System.out.println(data + " is in portList more than once ");
//	} 
   // countFrequencies(words); 

	countWords(listString);
	
	readFileData.close();
}
	
//	public static void countFrequencies(ArrayList<String> list) 
//    { 
//        // hashmap to store the frequency of element 
//        Map<String, Integer> hm = new HashMap<String, Integer>(); 
//  
//        for (String i : list) { 
//            Integer j = hm.get(i); 
//            hm.put(i, (j == null) ? 1 : j + 1); 
//        } 
//  
//        // displaying the occurrence of elements in the arraylist 
//        for (Map.Entry<String, Integer> val : hm.entrySet()) { 
//            System.out.println("Element " + val.getKey() + " "
//                               + "occurs"
//                               + ": " + val.getValue() + " times"); 
//        } 
//    } 
	public static void countWords(String listString) {
        // 正则表达式，获得句子中的单词
        String[] str = listString.trim().split("[，。？,.? ]");
        // LinkedHashMap基于链表，可以保证有序
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        for (int i = 0; i < str.length; i++) {
            if (!("".equals(str[i]))) {
                // 遍历key的集合，判断key（不区分大小写）是否已存在
                Iterator<String> it = map.keySet().iterator();
                // 用来标记key在map集合总是否存在
                boolean exist = false;
                // 遍历key的set集合
                while (it.hasNext()) {
                    String key = it.next();
                    // 如果key已存在，值加1
                    if (key.equalsIgnoreCase(str[i])) {
                        exist = true;
                        map.put(key, map.get(key) + 1);
                    }
                }
                // map中不存在就添加
                if (exist == false) {
                    map.put(str[i], 1);
                }
            }
        }
    	ArrayList<String> final_word = new ArrayList<String>();
    	String s1 ="";
        // 遍历map集合
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        	if (entry.getValue()>5 && entry.getKey().length()>3 )
            //System.out.println(entry.getKey() + ":" + entry.getValue());
        		{
        		System.out.println(entry.getKey());
        		//final_word.add(entry.getKey());}
        		s1=s1+" "+entry.getKey();
        		//System.out.println(s1);
        		}
        		//System.out.println(final_word);}
        		
        }
        String blogName = s1;
        
        StringBuilder reverseString = new StringBuilder();
        
        String[] words = blogName.split(" ");       //step 1
         
        for (String word : words) 
        {
            String reverseWord = new StringBuilder(word).reverse().toString();      //step 2
            reverseString.append(reverseWord + " ");                                //step 3
        }
         
        //System.out.println( reverseString.toString().trim() );  
		//System.out.println(final_word);
        final_word.add(reverseString.toString());
        System.out.println(final_word);
    }


	
	
}
