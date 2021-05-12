package file;
import jdk.nashorn.internal.runtime.ECMAException;

import java.io.File;

public class FileDemo1
{
    public static void main(String[] args)
    {
//        File dir = new File("D:/Java/Person");
//        dir.mkdir(); //directory will be created
//        String locatin = dir.getAbsolutePath();
//        System.out.println(locatin);
//        System.out.println(dir.getName());
//
//        if(dir.delete())
//        {
//            System.out.println(dir.getName() + "Folder has been deleted");
//        }

        File dir = new File("Person");
        dir.mkdir(); // directory will be created
        String path = dir.getAbsolutePath();

        File file1 = new File(path + "/Student.txt");
        File file2 = new File(path + "/Teacher.txt");

        try
        {
            file1.createNewFile();
            file2.createNewFile();

            System.out.println("Files are created");
        }catch (Exception e)
        {
            System.out.println(e);
        }
//
//        file2.delete();
//        if(file2.exists())
//        {
//            System.out.println("File exists");
//        }
//        else
//        {
//            System.out.println("Files does not exists");
//        }
    }
}
