package com.copy.directory;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileCopyVisitor extends SimpleFileVisitor<Path>{
	private Path source, destination;
	
	MyFileCopyVisitor(Path source, Path destination){
		this.source = source;
		this.destination = destination;
	}
	public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes){
		Path newPath = destination.relativize(source.relativize(path));
		try{
			Files.copy(path, newPath, StandardCopyOption.REPLACE_EXISTING);
		}catch(IOException e){
			e.printStackTrace();
		}
		return FileVisitResult.CONTINUE;
	}
	
	public FileVisitResult preVisitFile(Path path, BasicFileAttributes fileAttributes){
		Path newPath = destination.relativize(source.relativize(path));
		try{
			Files.copy(path, newPath, StandardCopyOption.REPLACE_EXISTING);
		}catch(IOException e){
			e.printStackTrace();
		}
		return FileVisitResult.CONTINUE;
	}
}
