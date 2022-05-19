/*拷贝文件和目录：
	将D:\Note拷贝到C盘根下....
*/

package com.javase.homework.text01;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File sourceFile = new File("D:\\Note");
        File sinkFile = new File("C:\\Note");
        if (!(sinkFile.exists())) {
            sinkFile.mkdir();
        }

        MyFileCopy.myFileCopy(sourceFile, sinkFile);
    }
}
