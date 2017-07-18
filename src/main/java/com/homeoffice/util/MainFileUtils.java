package com.homeoffice.util;

import com.homeoffice.service.DirectoryReaderService;

public class MainFileUtils {

    public static void main(String[] args) {
        //default directory name
        String dirPath="./files";
        if(args.length>1){
            //Get the directory name from command line
            dirPath=args[0];
        }
        DirectoryReaderService directoryReader = new DirectoryReaderService(dirPath);
        directoryReader.readDirectory();
        directoryReader.displayDirectoryContent();
        directoryReader.displayLargeFiles();
        directoryReader.displayFileMetaData();
        directoryReader.retrieveFilesWithSupportedMimeType();

    }

}
