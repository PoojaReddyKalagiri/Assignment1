import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class filesMatchingRegex {
    public static void main(String args[]) throws Exception {
        File homeDirectory = new File("/home/zadmin");   // home directory
        Scanner sc = new Scanner(System.in);
        File[] listOfFiles = homeDirectory.listFiles();    // stores abstract pathnames of all files and  directories present in homeDirectory

        while (sc.hasNext()) {
            int numberOfFiles=0;
            Pattern p = Pattern.compile(sc.next());    // compiles the pattern input
            for (File file : listOfFiles)
                if (file.isFile()) {
                    String fileName = file.getName();
                    Matcher m = p.matcher(fileName);
                    if (m.find()) {
                        System.out.println(file.getAbsolutePath());    // prints the whole path of the matched file
                        numberOfFiles++;
                    }
                }
            if(numberOfFiles==0)
                System.out.println("No such files!");
        }
    }
}

/*
Test Cases:

Input1:
.java

Output1:
/home/zadmin/Exception5.java
/home/zadmin/ExceptionHandling.java
/home/zadmin/checkRegex.java

Input 2:
.js

Output 2:
No such files!

*/