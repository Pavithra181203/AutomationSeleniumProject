package example;


import org.testng.annotations.Test;

public class InvocationCountExample {
    @Test(invocationCount = 3)

    public void printMessage()
    {
        System.out.println("Hello TestNG");
    }

}
