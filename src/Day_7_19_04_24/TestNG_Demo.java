package Day_7_19_04_24;

import org.testng.annotations.Test;

public class TestNG_Demo {
@Test(priority=3, invocationCount=3)
//InvocationCount means it execute that given time i.e 3 time
//InvocationCount = 0 then we can skip our test case also
// Rather than e can use (enabled=false) then also we can skip our test case

public void test() {
	System.out.println("Test  ");
}
@Test(priority=2, enabled=false)// wher eused true then it is not skip
public void test1() {
	System.out.println("Test 1 ");
}

@Test(priority=1)
public void test2() {
	System.out.println("Test 2 ");
}

@Test(priority=4)
public void test3() {
	System.out.println("Test 3 ");
}
// If we give same proprity to diff testcase then is execute by alphanumeric order of method names
// we can use priority using -ve number also.
@Test
public void test4() {
	System.out.println("Test 4 ");
}


}
