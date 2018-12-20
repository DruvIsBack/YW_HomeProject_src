/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  net.sourceforge.javaocr.ocrPlugins.mseOCR.CharacterRange
 *  net.sourceforge.javaocr.ocrPlugins.mseOCR.OCRScanner
 *  net.sourceforge.javaocr.ocrPlugins.mseOCR.TrainingImageLoader
 *  net.sourceforge.javaocr.scanner.PixelImage
 */
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.imageio.ImageIO;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.CharacterRange;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.OCRScanner;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.TrainingImageLoader;
import net.sourceforge.javaocr.scanner.PixelImage;

public final class aZ {
    private boolean debug = true;
    private Image image;
    private OCRScanner a;

    public aZ() {
        try {
            OCRScanner oCRScanner = new OCRScanner();
            aZ aZ2 = this;
            this.a = oCRScanner;
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private String b(File object) {
        Object object2;
        object2 = "";
        try {
            Object object3;
            object3 = this;
            try {
                object3 = ImageIO.read((File)object);
                object = this;
                this.image = object3;
            }
            catch (IOException iOException) {}
            object3 = this;
            if (object3.image == null) {
                return object2;
            }
            object3 = this;
            object3 = this;
            object = new PixelImage(object3.image);
            object3 = this;
            object.toGrayScale(true);
            object3 = this;
            object.filter();
            object3 = this;
            object = new CharacterRange[1];
            if (GUI.D().contentEquals("IQUALIF Tunisia Yellow")) {
                object[0] = new CharacterRange(48, 57);
            }
            if (GUI.D().contentEquals("IQUALIF Tunisia Yellow")) {
                aZ aZ2 = this;
                object3 = aZ2;
                object3 = this;
                object = aZ2.a.scan(object3.image, 0, 0, 0, 0, object);
            } else {
                aZ aZ3 = this;
                object3 = aZ3;
                object3 = this;
                object = aZ3.a.scan(object3.image, 0, 0, 0, 0, null);
            }
            object2 = object;
        }
        catch (Throwable throwable) {}
        return object2;
    }

    public final String c(File file) {
        String string;
        string = "";
        try {
            if (file.length() < 1L) {
                return string;
            }
            System.setProperty("TRAINING_IMAGE_DIR", String.valueOf(GUI.y()) + "e");
            Object object = System.getProperty("TRAINING_IMAGE_DIR");
            if (object == null) {
                return string;
            }
            String string2 = object;
            object = this;
            try {
                Object object2 = object;
                if (!string2.endsWith(File.separator)) {
                    string2 = String.valueOf(string2) + File.separator;
                }
                object2 = object;
                object2.a.clearTrainingImages();
                TrainingImageLoader trainingImageLoader = new TrainingImageLoader();
                HashMap hashMap = new HashMap();
                object2 = object;
                trainingImageLoader.load(String.valueOf(string2) + "ascii.png", new CharacterRange(33, 126), hashMap);
                object2 = object;
                trainingImageLoader.load(String.valueOf(string2) + "hpljPica.jpg", new CharacterRange(33, 126), hashMap);
                if (GUI.D().contentEquals("IQUALIF Tunisia Yellow")) {
                    object2 = object;
                    trainingImageLoader.load(String.valueOf(string2) + "digits_tn.jpg", new CharacterRange(48, 57), hashMap);
                } else {
                    object2 = object;
                    trainingImageLoader.load(String.valueOf(string2) + "digits.jpg", new CharacterRange(48, 57), hashMap);
                    object2 = object;
                    trainingImageLoader.load(String.valueOf(string2) + "numbers.gif", new CharacterRange(48, 57), hashMap);
                }
                object2 = object;
                object2 = object;
                object2.a.addTrainingImages(hashMap);
                object2 = object;
            }
            catch (IOException iOException) {}
            string = this.b(file);
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static String I(String object) {
        String string;
        ArrayList<String> arrayList;
        String string2;
        block11 : {
            string = "";
            try {
                string2 = String.valueOf(GUI.w()) + "po";
                a.a(String.valueOf(string2) + ".txt", "");
                String string3 = "digits";
                arrayList = new ArrayList<String>();
                if (GUI.u().contentEquals("windows")) {
                    arrayList.add("tesseract");
                    arrayList.add("\"" + object.replace("\\\\", "\\").replace("\\", "/") + "\"");
                    arrayList.add("\"" + GUI.w().replace("\\\\", "\\").replace("\\", "/") + "po\"");
                    arrayList.add("-l");
                    arrayList.add("eng");
                    if (!GUI.D().contentEquals("IQUALIF Oedkniss White and Yellow")) {
                        arrayList.add(string3);
                    }
                    break block11;
                }
                if (GUI.u().contentEquals("mac")) {
                    arrayList.add("/opt/local/bin/tesseract");
                    arrayList.add((String)object);
                    arrayList.add(String.valueOf(GUI.w()) + "po");
                    arrayList.add("-l");
                    arrayList.add("eng");
                    if (!GUI.D().contentEquals("IQUALIF Oedkniss White and Yellow")) {
                        arrayList.add(string3);
                    }
                    break block11;
                }
                if (GUI.u().contentEquals("linux")) {
                    string = "not supported, contact us on www.iqualif.com";
                    return "not supported, contact us on www.iqualif.com";
                }
                string = "not supported, contact us on www.iqualif.com";
                return "not supported, contact us on www.iqualif.com";
            }
            catch (Throwable throwable) {}
        }
        object = arrayList.toArray(new String[arrayList.size()]);
        object = a.a(object);
        if (object.size() <= 0) {
            GUI.d("Unable to recognize number, please download and install Tesseract OCR 3.02 or earlier", "Information");
        } else if (a.a((List)object).contains("Usage:tesseract")) {
            GUI.d("Unable to execute command, check if Tesseract OCR is installed. Download and install Tesseract OCR 3.02 or earlier", "Information");
        }
        string = a.a(a.a(new File(String.valueOf(string2) + ".txt")));
        return string;
    }
}

