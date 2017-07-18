package com.homeoffice.service;

import com.homeoffice.service.DirectoryReaderService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.fail;

public class TestDirectoryReader {
    DirectoryReaderService directoryReader;
    File testDir;

    @Before
    public void setUp() throws Exception {
        this.directoryReader= new DirectoryReaderService("./files");
        this.testDir = new File("./files/mytest");
        this.testDir.mkdirs();
    }

    @After
    public void tearDown() throws Exception {
        this.testDir.delete();
    }

    @Test
    public void testReadDirectory() {
        File[] files = directoryReader.readDirectory();
        boolean foundDirectpry=false;
        for (File file : files){
            if (file.getName().equals("mytest")){
                foundDirectpry = true;
                break;
            }

        }

        Assert.assertTrue("Found the expected directoy = /mytest",foundDirectpry);
    }

    @Test
    public void testReadDirectoryEmptyPath() {
        this.directoryReader= new DirectoryReaderService("");
        try{
            directoryReader.readDirectory();
            fail("Accpeted empty directry parameter");
        } catch ( Exception e){
            // Thrown exception as expected

        }

    }



}
