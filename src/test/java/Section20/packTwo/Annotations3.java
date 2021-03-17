package Section20.packTwo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations3 {

    @Test(groups = {"smoke"})
    public void One()
    {
        //This opens the Browser
        System.out.println("1");

    }
    @Parameters({"URL22"})
    @Test
    public void Two(String google)
    {
        System.out.println("2");
       System.out.println(google);

    }

    @Test
    public void Three()
    {
        System.out.println("3");
    }


}