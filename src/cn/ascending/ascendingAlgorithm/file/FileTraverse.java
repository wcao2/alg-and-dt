package cn.ascending.ascendingAlgorithm.file;

import java.io.File;

public class FileTraverse {
    public static void main(String[] args) {
        File[] files=new File("C:/").listFiles();
        showFiles(files);
    }

    public static void showFiles(File[] file){
        for(File f:file){
            if(f.isDirectory()){
                System.out.println("Directory name: "+f.getName());
                showFiles(f.listFiles());
            }else{
                System.out.println("File: "+f.getName());
            }
        }
    }
}
