package com.walking.file.tree;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
	public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes){
		System.out.println("File Name : " + path.getFileName());
		return FileVisitResult.CONTINUE;
	}
	
	public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes){
		System.out.println("----------Directory name : " + path + "------------");
		return FileVisitResult.CONTINUE;
	}
}
