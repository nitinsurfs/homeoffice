package com.homeoffice.model;

public class FileMeta {

    String fileName;
    String fileExt;
    Long fileSize;
    String fileMimeType;
    String id;

    public FileMeta(String id, String fileName, String fileExt, Long fileSize, String fileMimeType) {
        this.fileName = fileName;
        this.fileExt = fileExt;
        this.fileSize = fileSize;
        this.fileMimeType = fileMimeType;
        this.id = id;
    }

    public String getFileName(){
        return fileName;
    }

    public String getFileExt(){
        return fileExt;
    }

    public Long getFileSize(){
        return fileSize;
    }

    public String getFileMimeType(){
        return fileMimeType;
    }


    @Override
    public String toString() {
        return "com.homeoffice.model.FileMeta{" +
                "fileName='" + fileName + '\'' +
                ", fileExt='" + fileExt + '\'' +
                ", fileSize=" + fileSize +
                ", fileMimeType='" + fileMimeType + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
