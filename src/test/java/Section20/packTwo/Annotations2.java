package Section20.packTwo;

import org.testng.annotations.Test;

public class Annotations2 {
    //DependsOnExample
    //enabled = false
    //timeOut


    @Test(dependsOnMethods ={"Test4"}, timeOut = 4000,enabled = false)   //dependsOnMethods = "Test4" Test 4 runs before Test1
    public void Test1()
    {
        //This opens the Browser
        System.out.println("Executing Test 1");

    }
    @Test(enabled = false) //it will skip this method. We use this feature if we have a bug and we want to skip that part for now
    public void Test2()
    {
        System.out.println("Executing Test 2");
    }

    @Test(timeOut = 4000) //waits 40sec before giving an error. It will use only for this method. We use this type of waiting in case we have to wait for particular block
    public void Test3()
    {
        System.out.println("Executing Test 3");
    }

    @Test(groups = {"smoke"})
    public void Test4()
    {
        System.out.println("Executing Test 4");
        //delete cookies
    }


}