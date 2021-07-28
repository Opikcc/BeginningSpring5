package Chapter1Test;

import Chapter1.Greeter;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

public class GreeterTest {

  @Test
  public void testHelloWorld() {
    ApplicationContext      context = new ClassPathXmlApplicationContext("/applicationContext.xml");
    Greeter                 greeter = context.getBean("helloGreeter", Greeter.class);
    ByteArrayOutputStream   baos    = context.getBean("baos", ByteArrayOutputStream.class);
    greeter.greet();
    String data = new String(baos.toByteArray(), StandardCharsets.UTF_8);
    assertEquals(data, "Hello, World!");
  }

}
