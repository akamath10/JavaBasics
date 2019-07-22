package com.nio.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author ashwini.kamath
 * Use case : Example covering important methods of Path class.
 */
public class PathOperations {
	public static void main (String args[]){
		Path filePath = Paths.get("C:/Users/ashwini.kamath/Documents/TextDocument.txt");
		System.out.println("Printing file information: ");
		System.out.println("File path : " + filePath.getFileName());
		System.out.println("Root of the path : " + filePath.getRoot());
		System.out.println("Parent of the path : " + filePath.getParent());
		System.out.println("Printing elements of the path : ");
		for (Path element : filePath){
			System.out.println("Path element + " + element);
		}
		System.out.println("It's URI is : " + filePath.toUri());  // Can open the file in browser using the path/string generated.
		System.out.println("It's absolute path is : " + filePath.toAbsolutePath()); //Relative to absolute value
		System.out.println("Normalized path : " + filePath.normalize()); //Removes . and .. (current directory and parent directory)
	}
}
