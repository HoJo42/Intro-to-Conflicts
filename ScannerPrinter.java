import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
* Prints an entire scanner object.
* As an intro project for SOTAbots Super Group RHO (2024)
* @Author Howard Walz
* @Version 1.0.0
*/
public class ScannerPrinter {

    private Scanner mScanner;
    private PrintStream mOutputStream;

	/**
	* Prints an entire Scanner to a given PrintStream.
	* @param scanner - the Scanner to be printed.
	* @param outputStream - the OutputStream to print to.
	*/
    public ScannerPrinter(Scanner scanner, PrintStream outputStream) {
        this.mScanner = scanner;
        this.mOutputStream = outputStream;
    }

	/**
	* prints the entire stored Scanner object.
	*/
    public void printScanner() {
        while (mScanner.hasNextLine()) {
            mOutputStream.println(mScanner.nextLine());
        }
    }
}
