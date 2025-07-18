
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImagehandlingDemo {
    public static void main(String[] args) {
        int width = 1805;
        int height = 874;

        BufferedImage image = null;

        image = readFromFile(width, height, image);

        writeToFile(image);
    }

    private static BufferedImage readFromFile(int width, int height, BufferedImage image){
        try {
            File sampleFile = new File("A:\\Java\\sample.png");

            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            image = ImageIO.read(sampleFile);
            System.out.println("Reading Completed." + image);
        } catch (IOException e) {
            System.out.println("Error." + e);
        }
        return image;
    }

    private static void writeToFile(BufferedImage image) {
        try {
            File output = new File("A:\\Java\\samesample.png");
            ImageIO.write(image,"png", output);

            System.out.println("Writing completed");
        } catch (IOException e) {
            System.out.println("Error." + e);
        }
    }
}
