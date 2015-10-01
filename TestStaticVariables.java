import java.util.logging.*;
import java.io.*;

public class TestStaticVariables{

private static Logger myLogger;
private static FileHandler fileHandler;

static{
initialize();
}

private static void initialize(){

try{
 myLogger= Logger.getLogger("TestStaticVariablesLogger1");
 fileHandler = new FileHandler("./test/TestStaticVariables.%u.%g.txt",1024 * 1024, 10, true);
 fileHandler.setFormatter(new MyFormatter());
 myLogger.addHandler(fileHandler);
}catch(IOException ex){
	//throw new IOException("test");
}

}


public static void main(String[] args){
	myLogger.info("inside TestStaticVariables main method");
	
	TestStaticVariables testobj = new TestStaticVariables();
	//testobj.test();
	
	TestStaticVariablesLogger2 testobj2 = new TestStaticVariablesLogger2();
	testobj2.test2();
	testobj2.test2_2();
}

public void test(){
myLogger.info("inside TestStaticVariables test method");
}
}