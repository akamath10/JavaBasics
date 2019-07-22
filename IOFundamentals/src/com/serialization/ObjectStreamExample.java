package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ashwini.kamath
 * Use case : To write text in a file serialize it and then de-serialize the file. 
 */
public class ObjectStreamExample {
	public static void main(String args[]){
		Map<String, String> presidentsOfUS = new HashMap<>();
		presidentsOfUS.put("Barack Obama", "2009 to 2017 - Democratic Party, 56th and 57th term");
		presidentsOfUS.put("George W. Bush", "2001 to 2009 - Republican Party, 54th and 55th term");
		presidentsOfUS.put("Bill Clinton", "1993 to 2001 - Democratic Party, 52nd and 53rd term");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/ashwini.kamath/Documents/President.data"))){
			oos.writeObject(presidentsOfUS);
		} catch (FileNotFoundException e) {
			System.err.println("Cannot create the file with the given name");
		} catch (IOException e) {
			System.err.println("I/O exception has occurred for the file");
		}
		
		//Reading data from the file:
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/ashwini.kamath/Documents/President.data"))){
			Object obj = ois.readObject();
			if(obj != null && obj instanceof Map){
				@SuppressWarnings("unchecked")
				Map<String, String> presidents = (Map<String, String>)obj;
				for(Map.Entry<String, String> president : presidents.entrySet()){
					System.out.printf("%s \t %s %n", president.getKey(), president.getValue());
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("Cannot read data from the file mentioned");
		} catch (IOException e) {
			System.err.println("I/O exception has occurred for the file");
		} catch (ClassNotFoundException e) {
			System.err.println("Cannot recognize the class of the object, class may be corrupted");
		}	
	}
}
