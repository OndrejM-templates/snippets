package sk.mihalyi.exp;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.imageio.ImageIO;

/**
 * Takes screenshot of main screen and saves it file (tested and works).
 * @see <a href="http://stackoverflow.com/questions/58305/is-there-a-way-to-take-a-screenshot-using-java-and-save-it-to-some-sort-of-image">Advice on StackOverflow</a>
 * @author ondrej.mihalyi
 */
public class TakeScreenshot {

    public static void main(String[] args) throws AWTException, IOException {
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture = new Robot().createScreenCapture(screenRect);
        File outF = Files.createTempFile("screenshot", ".bmp").toFile();
        System.out.println("Saving to: " + outF.getAbsolutePath());
        ImageIO.write(capture, "bmp", outF);
    }
}
