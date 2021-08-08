package javapractice;

import java.io.*;

public class FileClass {

//    *********File Creation*********
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/JAVA Practice/name1.txt");
        f1.createNewFile();
        System.out.println("IS EXIST:" + f1.exists());
        System.out.println("FILE SIZE:" + f1.length());
//        f1.delete();

//        ********File writing******
//        FileOutputStream f2 = new FileOutputStream("D:/JAVA Practice/name1.txt");
        FileOutputStream f2 = new FileOutputStream(f1);
        String s = "Mishal Gupta - SDE";
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            f2.write(ch[i]);
        }
        System.out.println("Written Sucessfully");
        f2.close();

//       *******File Reading*********
        int i;
//        FileInputStream fin = new FileInputStream(f1);
        FileInputStream fin = new FileInputStream("D:/JAVA Practice/name1.txt");
//        while((i=fin.read())!=-1) {
//            System.out.print((char)i);
//        }

        do {
            i = fin.read();
            if (i != -1) {
                System.out.print((char) i);
            }
        } while (i != -1);
        fin.close();
    }
}
