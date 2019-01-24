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
            Pattern p = Pattern.compile(sc.next());    // compiles the pattern input
            for (File file : listOfFiles)
                if (file.isFile()) {
                    String fileName = file.getName();
                    Matcher m = p.matcher(fileName);
                    if (m.matches()) {
                        System.out.println(file.getAbsolutePath());    // prints the whole path of the matched file
                    }
                }
        }
    }
}