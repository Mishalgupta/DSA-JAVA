package javapractice;

import java.io.*;

public class FileBuffer {

    public static void main(String[] args) throws IOException {
//        *********Buffered Writer**********
        FileWriter f1 = new FileWriter("D:/JAVA Practice/name1.txt", true);
        BufferedWriter b1 = new BufferedWriter(f1);
        b1.write("-III");
        b1.close();
        System.out.println("Written Sucessfully");

//        *****Buffered Reader*******
        FileReader r1 = new FileReader("D:/JAVA Practice/name1.txt");
        BufferedReader br1 = new BufferedReader(r1, 5);
//        while ((int i = br1.read()) != -1) {
//            System.out.print((char) i);
//        }

//        ****Another Method of reading lines from file*****
//        String s1;
//        s1=br1.readLine();
//        System.out.println("\n"+s1);
//        br1.close();

//        String s2;
//       while( (s2=br1.readLine())!=null){
//        System.out.println("\n"+s2);
//       } br1.close();

//        ***Reading characters for specified length & position*****
        char ch[] = new char[20];
        br1.read(ch, 3, 5);
        System.out.println(ch);
        br1.close();
    }

}