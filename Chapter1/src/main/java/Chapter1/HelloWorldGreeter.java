package Chapter1;

import java.io.PrintStream;

public class HelloWorldGreeter implements Greeter {

  @Override
  public void setPrintStream(PrintStream printStream) {
    printStream.print("Hello, World!");
  }

  @Override
  public void greet() {
  }

}
