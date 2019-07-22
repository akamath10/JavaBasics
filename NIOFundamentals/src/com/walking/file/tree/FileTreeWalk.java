package com.walking.file.tree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTreeWalk {

	public static void main(String[] args) {
		Path path = Paths.get("C:/Users/ashwini.kamath/Downloads/Backup_Story14May19");
		try{
			Files.walkFileTree(path, new MyFileVisitor());
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
