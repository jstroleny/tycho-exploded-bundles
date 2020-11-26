package my.example.bundle;

import org.apache.tools.ant.DirectoryScanner;

public class Example {

    DirectoryScanner scanner = new DirectoryScanner();

    Example() {
	super();
	scanner.scan();
    }
    
}
