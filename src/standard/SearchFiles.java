package standard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchFiles {
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        searchFiles(new File("/media/nolimit/Новый том/Design/"), fileList);
        for (File file: fileList) {
            System.out.println(file.getAbsolutePath());
        }
    }
    /*
    * It's algorithm to search all files in corresponding folder with a recursion.
    * */
    // O(n*n)
    private static void searchFiles(File rootFile, List<File> fileList){
        if (rootFile.isDirectory()) {
            System.out.println("Searching at:" + rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFiles(file, fileList);
                    }else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}
