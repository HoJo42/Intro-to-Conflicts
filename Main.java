import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File myFile = new File("./sometext.txt");
            Scanner myScanner = new Scanner(myFile);
            System.out.println("Scanner Created Sucessfully");
            ScannerPrinter mScannerPrinter = new ScannerPrinter(myScanner, System.out);
            mScannerPrinter.printScanner();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
			System.out.println("File not created properly");
			System.exit(1);
        }
    }
}
