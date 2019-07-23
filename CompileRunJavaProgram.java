


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.*;
public class CompileRunJavaProgram {

    public static void main(String[] args) {
        try {
            System.out.println("**********");
            CompileRunJavaProgram.runProcess("javac /home/yatin/bla/demo.java");
            System.out.println("**********");
            CompileRunJavaProgram.runProcess("java -cp /home/yatin/bla demo");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

      public static void printLines(String cmd, InputStream ins,OutputStream outputStream) throws Exception {
        String line = null;
        BufferedReader in = new BufferedReader(
                new InputStreamReader(ins));
        while ((line = in.readLine()) != null) {
              //outputStream.write(ins.read());
            System.out.println(cmd + " -----  " + line);
        }
    }

    public static void runProcess(String command) throws Exception {
        Process pro = Runtime.getRuntime().exec(command);
        printLines(command + " stdout:", pro.getInputStream(), pro.getOutputStream());

        printLines(command + " stderr:", pro.getErrorStream(), pro.getOutputStream());
      
        pro.waitFor();
        System.out.println(command + " exitValue() " + pro.exitValue());
    }


}


  
 class demo1 {  
public static void main(String args[]){  
          Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
          String name = in.nextLine();  
          System.out.println("Name is: " + name);             
          in.close();             
          }  
}  
