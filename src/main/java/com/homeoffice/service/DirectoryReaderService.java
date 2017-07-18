package com.homeoffice.service;

import com.homeoffice.model.FileMeta;
import org.apache.commons.io.FilenameUtils;
import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


public class DirectoryReaderService{

    private String dirPath;


    public DirectoryReaderService(String dirPath) {
        super();
        this.dirPath = dirPath;
    }


    public File[] readDirectory() {
        File[] listOfFiles;
        if(this.dirPath == null || this.dirPath.equals("")){
            // Check for empty directory path
            throw new IllegalArgumentException("The directy path is empty");
        }
        File folder = new File(this.dirPath);
        listOfFiles = folder.listFiles();

        return listOfFiles;
    }


    public void displayDirectoryContent() {
        File[] listOfFiles = this.readDirectory();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }

    }

    public void displayLargeFiles() {
        List<FileMeta> fileMetas = fileMetaData();

        List<FileMeta> sortedFileMetas = fileMetas
                .stream()
                .sorted((e1, e2) -> Long.compare(e1.getFileSize(),
                        e2.getFileSize())).collect(Collectors.<FileMeta>toList());

        System.out.println(sortedFileMetas.size());

        for(int i=sortedFileMetas.size()-1;i>sortedFileMetas.size()-11; i--){
            System.out.println(sortedFileMetas.get(i));
        }
    }

    public void retrieveFilesWithSupportedMimeType() {
        File[] listOfFiles = this.readDirectory();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile() && new MimetypesFileTypeMap().getContentType(listOfFiles[i]).equals("application/octet-stream")) {
                System.out.println("File - " + listOfFiles[i].getName() + " type - "+ new MimetypesFileTypeMap().getContentType(listOfFiles[i]));
            }
        }
    }

    public String retrieveDataFilesWithSupportedMimeType() {
        File[] listOfFiles = this.readDirectory();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile() && new MimetypesFileTypeMap().getContentType(listOfFiles[i]).equals("application/octet-stream")) {
                System.out.println("File - " + listOfFiles[i].getName() + " type - "+ new MimetypesFileTypeMap().getContentType(listOfFiles[i]));
            }
        }
        return "";
    }

    public List<FileMeta> fileMetaData(){

        File file = new File(dirPath);

        List<FileMeta> fileMetas = new ArrayList<FileMeta>();
        File[] listOfFiles = this.readDirectory();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                FileMeta n = null;

                n = new FileMeta(UUID.randomUUID().toString(), listOfFiles[i].getName(), FilenameUtils.getExtension(listOfFiles[i].getName()), listOfFiles[i].length(), new MimetypesFileTypeMap().getContentType(listOfFiles[i]));
                fileMetas.add(n);
            }
        }
        return fileMetas;
    }

    public void displayFileMetaData(){
        List<FileMeta> fileMetas = fileMetaData();
        for(FileMeta fileMeta:fileMetas){
         System.out.println(fileMeta);
        }
    }

}
