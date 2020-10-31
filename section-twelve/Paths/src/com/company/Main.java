package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try {
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2/Dir3/Dir4/Dir5/Dir6");
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
//            Files.createDirectories(dirToCreate);

//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.createDirectory(dirToCreate);

//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1","file1copy.txt");
//            Files.deleteIfExists(fileToDelete);

            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last modified = " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("Is Directory = " + attrs.isDirectory());
            System.out.println("Is regular file = " + attrs.isRegularFile());

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }



//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//        Path filePath = FileSystems.getDefault().getPath("files","SubDirectoryFile.txt");
//        Path filePath = Paths.get("files","SubDirectoryFile.txt");
//        System.out.println("\n");
//        printFile(filePath);
//        System.out.println("\n");
//
//        Absolute Path Example
//        filePath = Paths.get("C:/Users/home/Desktop/java-course/section-twelve/randomlocation.txt/");
//        printFile(filePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".","files","..","files","SubDirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2);
//
//        Path path3 = FileSystems.getDefault().getPath("thisfiledoesnotexist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("Desktop/java-course/","meh.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));
//        System.out.println("Exists = " + Files.exists(path4));
//
//    }
//
//    private static void printFile(Path path) {
//        try(BufferedReader fileReader = Files.newBufferedReader(path)){
//            String line;
//            while((line = fileReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
    }
}
