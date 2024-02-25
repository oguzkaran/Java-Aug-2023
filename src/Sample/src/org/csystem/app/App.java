/*-----------------------------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

import java.io.Closeable;
import java.io.IOException;

class App {
    public static void main(String[] args)
    {
        DemoApp.run();
    }
}

class DemoApp {
    public static void run()
    {
        while (true) {
            Image image = null;

            try {
                String name = Console.readString("Input image name:");
                image = new Image(name);

                image.makeGrayScale();

                //...

            }
            catch (Throwable ex) {
                Console.writeLine(ex.getMessage());
            }
            finally {
                if (image != null) {
                    try {
                        image.close();
                    } catch (IOException e) {

                    }
                }
            }
        }
    }
}

class Image implements Closeable {
    private final String m_imageName;

    public Image(String imageName)
    {
        m_imageName = imageName;
        Console.writeLine("%s image opened!...", m_imageName);
    }

    public void makeGrayScale()
    {
        Console.writeLine("Image processing!...");
        Console.writeLine("%s image changed!...", m_imageName);
    }

    public void close() throws IOException
    {
        Console.writeLine("Release image!...");
    }
}

