package com.javase.homework.text01;

import java.io.*;

public class MyFileCopy {
    public static void myFilePutStream(File inputFile, File outputFile) {
        byte[] bytes = new byte[1024 * 1024];
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int inputCount = 0;
        try {
            fileInputStream = new FileInputStream(inputFile);
            fileOutputStream = new FileOutputStream(outputFile);
            while ((inputCount = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0 , inputCount);
            }

            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void myFileCopy(File sourceFile, File sinkFile) {
        File[] sourceFiles = sourceFile.listFiles();
        for (File element : sourceFiles) {
            String sinkFileName = sinkFile.getAbsolutePath() + "\\" + element.getName();

            if (element.isFile()) {
                myFilePutStream(element, new File(sinkFileName));
            } else if (element.isDirectory()) {
                File file = new File(sinkFileName);
                if (!(file.exists())) {
                    file.mkdir();
                }
                myFileCopy(element, file);
            }
        }
    }
}
