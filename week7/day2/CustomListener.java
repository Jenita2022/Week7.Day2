package week7.day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

//IRetryAnalyzer - auto retry failed Test cases based on count given in retry method. Link this class to TC -Add attribute 
//@Test level for each case @Test(retryAnalyzer= Customerlistener.class)

//IAnnotationTransformer - auto retry applies to all test cases in xml. No need to add attribute IretryAnalyzer at TC level. 
 //Instead add <listeners> in xml.	
public class CustomListener implements IRetryAnalyzer,IAnnotationTransformer{
int count=0;
	public boolean retry(ITestResult result) {
		if(count<1) {
			count++;
			return true;
		}
		return false;
	}
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(CustomListener.class);
}
}