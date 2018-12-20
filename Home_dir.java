import java.io.*;
import java.util.regex.*;
import java.util.Scanner;
public class Home_dir {
    public static void main(String args[]) throws Exception {
        File dir = new File("/home/zadmin");// home directory
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Pattern p = Pattern.compile(sc.next());// compiles the pattern input
            File[] listOfFiles = dir.listFiles();
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    String s = file.getName();
                    Matcher m = p.matcher(s);
                    if (m.matches()) {
                        System.out.println(file.getAbsolutePath());// prints the whole path of the matched file
                    }
                }
            }
        }
    }
}