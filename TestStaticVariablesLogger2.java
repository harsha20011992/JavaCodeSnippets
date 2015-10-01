import java.util.logging.*;
import java.io.*;

public class TestStaticVariablesLogger2{
private static Logger myLogger2;
private static FileHandler fileHandler2;

static{
initialize();
}

private static void initialize(){

try{
 myLogger2= Logger.getLogger("TestStaticVariablesLogger2");
 fileHandler2 = new FileHandler("TestStaticVariablesLogger.%u.%g.txt",1024 * 1024, 10, true);
 fileHandler2.setFormatter(new MyFormatter());
 myLogger2.addHandler(fileHandler2);
}catch(IOException ex){
	//throw new IOException("test");
}

}
 

/*public static void main(String[] args){
	myLogger.info("inside TestStaticVariables main method");
	
	TestStaticVariablesLogger2 testobj2 = new TestStaticVariablesLogger2();
	testobj2.test2();
	
}*/

public void test2(){
myLogger2.info("inside TestStaticVariablesLogger2 test2 method");
}

public void test2_2(){
myLogger2.info("inside TestStaticVariablesLogger2 test3 method");
}
}