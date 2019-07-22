package com.copy.directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTreeWalkCopy {
	public static void main(String args[]){
		Path path = Paths.get("C:/Users/ashwini.kamath/Downloads/Backup_Story14May19");
		Path pathDestination = Paths.get("C:/Users/ashwini.kamath/Downloads/Backup_Story14May19_Copy");
		try{
			Files.walkFileTree(path, new MyFileCopyVisitor(path, pathDestination));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
