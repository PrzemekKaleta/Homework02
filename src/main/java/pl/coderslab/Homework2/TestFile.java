package pl.coderslab.Homework2;

import org.apache.commons.io.*;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {

        File frommFile = new File("src/main/files/test_comons_io.txt");
        File toFile = new File("src/main/files/copy_test_comons_io.txt");

        try{
            FileUtils.copyFile(frommFile,toFile);
        }catch (IOExceptionWithCause e){
            e.getCause();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
