/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  chrriis.dj.nativeswing.NSOption
 *  chrriis.dj.nativeswing.swtimpl.NSPanelComponent
 *  chrriis.dj.nativeswing.swtimpl.components.JWebBrowser
 *  org.apache.commons.codec.binary.Base64
 *  org.apache.commons.validator.routines.UrlValidator
 *  org.apache.http.HttpEntity
 *  org.apache.http.client.config.RequestConfig
 *  org.apache.http.client.config.RequestConfig$Builder
 *  org.apache.http.client.entity.UrlEncodedFormEntity
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpPost
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClientBuilder
 *  org.apache.http.message.BasicNameValuePair
 *  org.apache.http.util.EntityUtils
 *  org.apache.poi.hssf.usermodel.HSSFWorkbook
 *  org.apache.poi.poifs.filesystem.DirectoryNode
 *  org.apache.poi.poifs.filesystem.NPOIFSFileSystem
 *  org.apache.poi.ss.usermodel.Cell
 *  org.apache.poi.ss.usermodel.Row
 *  org.apache.poi.ss.usermodel.Sheet
 *  org.apache.poi.xssf.usermodel.XSSFWorkbook
 *  org.json.JSONArray
 *  org.json.JSONObject
 *  org.mozilla.universalchardet.CharsetListener
 *  org.mozilla.universalchardet.UniversalDetector
 */
import chrriis.dj.nativeswing.NSOption;
import chrriis.dj.nativeswing.swtimpl.NSPanelComponent;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.LayoutManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.validator.routines.UrlValidator;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;
import org.mozilla.universalchardet.CharsetListener;
import org.mozilla.universalchardet.UniversalDetector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a {
    private static String a;
    private static List a;

    public static String a(String string) {
        String string2 = "";
        a = "";
        try {
            SwingUtilities.invokeAndWait(new p(string));
        }
        catch (Throwable throwable) {}
        return a;
    }

    public static String b(String string) {
        String string2 = "";
        a = "";
        try {
            SwingUtilities.invokeAndWait(new s(string));
        }
        catch (Throwable throwable) {}
        return a;
    }

    public static String c(String string) {
        String string2 = "";
        a = "";
        try {
            SwingUtilities.invokeAndWait(new t(string));
        }
        catch (Throwable throwable) {}
        return a;
    }

    public static String d(String string) {
        String string2 = "";
        a = "";
        try {
            SwingUtilities.invokeAndWait(new u(string));
        }
        catch (Throwable throwable) {}
        return a;
    }

    public static String e(String string) {
        String string2 = "";
        a = "";
        try {
            SwingUtilities.invokeAndWait(new v(string));
        }
        catch (Throwable throwable) {}
        return a;
    }

    public static String f(String string) {
        String string2 = "";
        a = "";
        try {
            SwingUtilities.invokeAndWait(new w(string));
        }
        catch (Throwable throwable) {}
        return a;
    }

    public static JPanel a(String string, String string2, String string3) {
        JPanel jPanel;
        jPanel = new JPanel(new BorderLayout());
        try {
            if (GUI.c() == 0) {
                return jPanel;
            }
            JPanel jPanel2 = new JPanel(new BorderLayout());
            jPanel2.setLayout(new BoxLayout(jPanel2, 2));
            jPanel2.setBorder(BorderFactory.createTitledBorder(string2));
            string2 = new JWebBrowser(new NSOption[]{NSPanelComponent.constrainVisibility()});
            string2.setName(string);
            GUI.b().put(string, string2);
            jPanel2.add((Component)((Object)string2), "Center");
            jPanel.add((Component)jPanel2, "Center");
            string2.setMenuBarVisible(false);
            string2.setLocationBarVisible(false);
            string2.setButtonBarVisible(false);
            string2.setOpaque(true);
            jPanel2.setOpaque(true);
            string2 = string3;
            SwingUtilities.invokeLater(new r(string, string2));
        }
        catch (Throwable throwable) {}
        return jPanel;
    }

    static /* synthetic */ void a(String string) {
        a = string;
    }

    public static void a(Runnable object) {
        try {
            object = String.valueOf(System.getProperty("java.home")) + File.separator + "bin" + File.separator + "java";
            String string = "-Xdock:name=" + GUI.D();
            String string2 = String.valueOf(GUI.v()) + "l.jar";
            Runtime.getRuntime().addShutdownHook(new aN((String)object, string, string2));
            System.exit(0);
            return;
        }
        catch (Throwable throwable) {
            throw new IOException("Error while trying to restart the application", throwable);
        }
    }

    public static String g(String string) {
        try {
            string = string.replace("\\u00aa", "\u00aa");
            string = string.replace("\\u00ba", "\u00ba");
            string = string.replace("\\u00cd", "\u00cd");
            string = string.replace("\\u00c0", "\u00c0");
            string = string.replace("\\u00c3", "\u00c3");
            string = string.replace("\\u00c7", "\u00c7");
            string = string.replace("\\u00c9", "\u00c9");
            string = string.replace("\\u00d3", "\u00d3");
            string = string.replace("\\u00e7", "\u00e7");
            string = string.replace("\\u00e9", "\u00e9");
            string = string.replace("\\u00e8", "\u00e8");
            string = string.replace("\\u00ea", "\u00ea");
            string = string.replace("\\u00eb", "\u00eb");
            string = string.replace("\\u00e0", "\u00e0");
            string = string.replace("\\u00e1", "\u00e1");
            string = string.replace("\\u00e2", "\u00e2");
            string = string.replace("\\u00e3", "\u00e3");
            string = string.replace("\\u00f3", "\u00f3");
            string = string.replace("\\u00f4", "\u00f4");
            string = string.replace("\\u00f5", "\u00f5");
            string = string.replace("\\u00f6", "\u00f6");
            string = string.replace("\\u00f9", "\u00f9");
            string = string.replace("\\u00fb", "\u00fb");
            string = string.replace("\\u00fc", "\u00fc");
            string = string.replace("\\u00ed", "\u00ed");
            string = string.replace("\\u00ee", "\u00ee");
            string = string.replace("\\u00ef", "\u00ef");
            string = string.replace("\u00c3\u00a9", "\u00e9");
            string = string.replace("\u00c3\u00a8", "\u00e8");
            string = string.replace("\u00c3\u00aa", "\u00ea");
            string = string.replace("\u00c3\u00ab", "\u00eb");
            string = string.replace("\u00c3\u00b9", "\u00f9");
            string = string.replace("\u00c3\u00bb", "\u00fb");
            string = string.replace("\u00c3\u00bc", "\u00fc");
            string = string.replace("\u00c3\u00ae", "\u00ee");
            string = string.replace("\u00c3\u00af", "\u00ef");
            string = string.replace("\u00c3\u00b4", "\u00f4");
            string = string.replace("\u00c3\u00b6", "\u00f6");
            string = string.replace("\u00c3\u00a7", "\u00e7");
            string = string.replace("\u00c5\u0093", "\u0153");
            string = string.replace("\u00c3\u00a2", "\u00e2");
            string = string.replace("\u00c3", "\u00e0");
            string = string.replace("&#39", "'");
            string = string.replace("&quot;", "\"");
            string = string.replace("&amp;", "&");
            string = string.replace("&lt;", "<");
            string = string.replace("&gt;", ">");
            string = string.replace("&nbsp;", " ");
            string = string.replace("&iexcl;", "\u00a1");
            string = string.replace("&cent;", "\u00a2");
            string = string.replace("&pound;", "\u00a3");
            string = string.replace("&curren;", "\u00a4");
            string = string.replace("&yen;", "\u00a5");
            string = string.replace("&brvbar;", "\u00a6");
            string = string.replace("&sect;", "\u00a7");
            string = string.replace("&uml;", "\u00a8");
            string = string.replace("&copy;", "\u00a9");
            string = string.replace("&ordf;", "\u00aa");
            string = string.replace("&laquo;", "\u00ab");
            string = string.replace("&not;", "\u00ac");
            string = string.replace("&shy;", "\u00ad");
            string = string.replace("&reg;", "\u00ae");
            string = string.replace("&macr;", "\u00af");
            string = string.replace("&deg;", "\u00b0");
            string = string.replace("&plusmn;", "\u00b1");
            string = string.replace("&sup2;", "\u00b2");
            string = string.replace("&sup3;", "\u00b3");
            string = string.replace("&acute;", "\u00b4");
            string = string.replace("&micro;", "\u00b5");
            string = string.replace("&para;", "\u00b6");
            string = string.replace("&middot;", "\u00b7");
            string = string.replace("&cedil;", "\u00b8");
            string = string.replace("&sup1;", "\u00b9");
            string = string.replace("&ordm;", "\u00ba");
            string = string.replace("&raquo;", "\u00bb");
            string = string.replace("&frac14;", "\u00bc");
            string = string.replace("&frac12;", "\u00bd");
            string = string.replace("&frac34;", "\u00be");
            string = string.replace("&iquest;", "\u00bf");
            string = string.replace("&Agrave;", "\u00c0");
            string = string.replace("&Aacute;", "\u00c1");
            string = string.replace("&Acirc;", "\u00c2");
            string = string.replace("&Atilde;", "\u00c3");
            string = string.replace("&Auml;", "\u00c4");
            string = string.replace("&Aring;", "\u00c5");
            string = string.replace("&AElig;", "\u00c6");
            string = string.replace("&Ccedil;", "\u00c7");
            string = string.replace("&Egrave;", "\u00c8");
            string = string.replace("&Eacute;", "\u00c9");
            string = string.replace("&Ecirc;", "\u00ca");
            string = string.replace("&Euml;", "\u00cb");
            string = string.replace("&Igrave;", "\u00cc");
            string = string.replace("&Iacute;", "\u00cd");
            string = string.replace("&Icirc;", "\u00ce");
            string = string.replace("&Iuml;", "\u00cf");
            string = string.replace("&ETH;", "\u00d0");
            string = string.replace("&Ntilde;", "\u00d1");
            string = string.replace("&Ograve;", "\u00d2");
            string = string.replace("&Oacute;", "\u00d3");
            string = string.replace("&Ocirc;", "\u00d4");
            string = string.replace("&Otilde;", "\u00d5");
            string = string.replace("&Ouml;", "\u00d6");
            string = string.replace("&times;", "\u00d7");
            string = string.replace("&Oslash;", "\u00d8");
            string = string.replace("&Ugrave;", "\u00d9");
            string = string.replace("&Uacute;", "\u00da");
            string = string.replace("&Ucirc;", "\u00db");
            string = string.replace("&Uuml;", "\u00dc");
            string = string.replace("&Yacute;", "\u00dd");
            string = string.replace("&THORN;", "\u00de");
            string = string.replace("&szlig;", "\u00df");
            string = string.replace("&agrave;", "\u00e0");
            string = string.replace("&aacute;", "\u00e1");
            string = string.replace("&acirc;", "\u00e2");
            string = string.replace("&atilde;", "\u00e3");
            string = string.replace("&auml;", "\u00e4");
            string = string.replace("&aring;", "\u00e5");
            string = string.replace("&aelig;", "\u00e6");
            string = string.replace("&ccedil;", "\u00e7");
            string = string.replace("&egrave;", "\u00e8");
            string = string.replace("&eacute;", "\u00e9");
            string = string.replace("&ecirc;", "\u00ea");
            string = string.replace("&euml;", "\u00eb");
            string = string.replace("&igrave;", "\u00ec");
            string = string.replace("&iacute;", "\u00ed");
            string = string.replace("&icirc;", "\u00ee");
            string = string.replace("&iuml;", "\u00ef");
            string = string.replace("&eth;", "\u00f0");
            string = string.replace("&ntilde;", "\u00f1");
            string = string.replace("&ograve;", "\u00f2");
            string = string.replace("&oacute;", "\u00f3");
            string = string.replace("&ocirc;", "\u00f4");
            string = string.replace("&otilde;", "\u00f5");
            string = string.replace("&ouml;", "\u00f6");
            string = string.replace("&divide;", "\u00f7");
            string = string.replace("&oslash;", "\u00f8");
            string = string.replace("&ugrave;", "\u00f9");
            string = string.replace("&uacute;", "\u00fa");
            string = string.replace("&ucirc;", "\u00fb");
            string = string.replace("&uuml;", "\u00fc");
            string = string.replace("&yacute;", "\u00fd");
            string = string.replace("&thorn;", "\u00fe");
            string = string.replace("&yuml;", "\u00ff");
            string = string.replace("&euro;", "\u20ac");
            if (GUI.D().contentEquals("IQUALIF Germany Yellow")) {
                string = string.replace("%fc", "\u00fc");
                string = string.replace("%f6", "\u00f6");
                string = URLDecoder.decode(string, "UTF-8");
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static boolean isBase64(String string) {
        try {
            string = string.replace("\\", "");
            if (Base64.isBase64((byte[])string.getBytes("UTF-8"))) {
                return true;
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static String h(String arrby) {
        Object object;
        object = arrby;
        try {
            if (a.isBase64((String)arrby)) {
                arrby = Base64.decodeBase64((String)arrby);
                object = new String(arrby, "UTF-8");
            }
        }
        catch (Throwable throwable) {}
        return object;
    }

    public static String a() {
        String string;
        String string2;
        string = "";
        string2 = "C:";
        try {
            string = String.valueOf(string) + System.getProperty("os.name");
            string = String.valueOf(string) + System.getProperty("os.arch");
            if (GUI.u().contentEquals("windows")) {
                string2 = jWMI.Y("SystemDrive");
                string = String.valueOf(string) + jWMI.Y("SystemDrive");
                string = String.valueOf(string) + jWMI.Y("OS");
                string = String.valueOf(string) + jWMI.Y("PROCESSOR_ARCHITECTURE");
                string = String.valueOf(string) + jWMI.Y("PROCESSOR_IDENTIFIER");
            }
        }
        catch (Throwable throwable) {}
        try {
            if (GUI.u().contentEquals("windows")) {
                string = String.valueOf(string) + a.c();
                string = String.valueOf(string) + a.i(string2);
            } else if (GUI.u().contentEquals("mac")) {
                string = String.valueOf(string) + a.d();
            } else if (GUI.u().contentEquals("linux")) {
                String string3 = "";
                Object object = new File("/sys/class/dmi/id/product_uuid");
                object = a.a((File)object);
                string3 = String.valueOf(string3) + a.a((List)object);
                string = String.valueOf(string) + string3.trim();
                string = String.valueOf(string) + a.e();
            }
        }
        catch (Throwable throwable) {}
        if (GUI.u().contentEquals("windows")) {
            try {
                string = String.valueOf(string) + jWMI.h("Select Name, BootDevice, SystemDevice, SystemDrive, InstallDate, CountryCode, OSType, SerialNumber from Win32_OperatingSystem", "Name, BootDevice, SystemDevice, SystemDrive, InstallDate, CountryCode, OSType, SerialNumber");
            }
            catch (Throwable throwable) {}
            try {
                string = String.valueOf(string) + jWMI.h("Select Manufacturer,Product,SerialNumber,Name from Win32_BaseBoard", "Manufacturer,Product,SerialNumber,Name");
            }
            catch (Throwable throwable) {}
            try {
                string = String.valueOf(string) + jWMI.h("Select Manufacturer,SerialNumber from Win32_BIOS", "Manufacturer,SerialNumber");
            }
            catch (Throwable throwable) {}
            try {
                string = String.valueOf(string) + jWMI.h("Select Model,Name,SystemType,UUID,IdentifyingNumber from Win32_ComputerSystem", "Model,Name,SystemType,UUID,IdentifyingNumber");
            }
            catch (Throwable throwable) {}
            try {
                string = String.valueOf(string) + jWMI.h("Select Manufacturer,Name,ProcessorId,UniqueId,SocketDesignation,NumberOfCores from Win32_Processor", "Manufacturer,Name,ProcessorId,UniqueId,SocketDesignation,NumberOfCores");
            }
            catch (Throwable throwable) {}
            try {
                string = String.valueOf(string) + jWMI.h(new StringBuilder("Select FileSystem,Size,VolumeSerialNumber from Win32_Processor WHERE Name='").append(string2).append("'").toString(), "FileSystem,Size,VolumeSerialNumber");
            }
            catch (Throwable throwable) {}
        }
        return string;
    }

    public static String b() {
        String string;
        string = "unknown OS";
        try {
            String string2 = System.getProperty("os.name").toLowerCase();
            string = string2.indexOf("win") >= 0 ? "windows" : (string2.indexOf("mac") >= 0 ? "mac" : (string2.indexOf("nix") >= 0 || string2.indexOf("nux") >= 0 || string2.indexOf("aix") >= 0 ? "linux" : (string2.indexOf("sunos") >= 0 ? "windows" : "windows")));
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static String c() {
        String string;
        string = "";
        try {
            if (GUI.u().contentEquals("windows")) {
                Object object = File.createTempFile("realhowto", ".vbs");
                object.deleteOnExit();
                Object object2 = new FileWriter((File)object);
                String string2 = "Set objWMIService = GetObject(\"winmgmts:\\\\.\\root\\cimv2\")\nSet colItems = objWMIService.ExecQuery _ \n   (\"Select * from Win32_BaseBoard\") \nFor Each objItem in colItems \n    Wscript.Echo objItem.SerialNumber \n    exit for  ' do the first cpu only! \nNext \n";
                object2.write(string2);
                object2.close();
                object = Runtime.getRuntime().exec("cscript //NoLogo " + object.getPath());
                object = new BufferedReader(new InputStreamReader(object.getInputStream()));
                while ((object2 = object.readLine()) != null) {
                    string = String.valueOf(string) + (String)object2;
                }
                object.close();
            }
        }
        catch (Throwable throwable) {}
        return string.trim();
    }

    public static String d() {
        String string;
        Object object;
        string = "";
        Object object2 = Runtime.getRuntime();
        try {
            object = object2.exec(new String[]{"/usr/sbin/system_profiler", "SPHardwareDataType"});
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        object2 = object.getOutputStream();
        object = object.getInputStream();
        try {
            object2.close();
        }
        catch (IOException iOException) {
            try {
                object.close();
            }
            catch (Throwable throwable) {}
            throw new RuntimeException(iOException);
        }
        object2 = new BufferedReader(new InputStreamReader((InputStream)object));
        try {
            try {
                String string2;
                while ((string2 = object2.readLine()) != null) {
                    string = String.valueOf(string) + string2.trim();
                }
            }
            catch (Throwable throwable) {
                try {
                    object.close();
                }
                catch (IOException iOException) {
                    throw new RuntimeException(iOException);
                }
            }
        }
        finally {
            try {
                object.close();
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        return string;
    }

    public static String e() {
        String string;
        string = "";
        try {
            String string2;
            Object object = Runtime.getRuntime().exec("/sbin/udevadm info --query=property --name=sda | grep SERIAL");
            object.waitFor();
            object = new BufferedReader(new InputStreamReader(object.getInputStream()));
            while ((string2 = object.readLine()) != null) {
                string = String.valueOf(string) + string2;
            }
            object = Runtime.getRuntime().exec("ls -l /dev/disk/by-id/ | grep scsi- | grep -v part | awk '{print $NF \" \" $(NF-2)}' | sed 's|../../||g' | sed 's/scsi-...._//g'");
            object.waitFor();
            object = new BufferedReader(new InputStreamReader(object.getInputStream()));
            while ((string2 = object.readLine()) != null) {
                string = String.valueOf(string) + string2;
            }
        }
        catch (Throwable throwable) {}
        return string.trim();
    }

    public static String i(String object) {
        String string;
        string = "";
        try {
            if (GUI.u().contentEquals("windows")) {
                Object object2 = File.createTempFile("realhowto", ".vbs");
                object2.deleteOnExit();
                FileWriter fileWriter = new FileWriter((File)object2);
                object = "Set objFSO = CreateObject(\"Scripting.FileSystemObject\")\nSet colDrives = objFSO.Drives\nSet objDrive = colDrives.item(\"" + (String)object + "\")\nWscript.Echo objDrive.SerialNumber";
                fileWriter.write((String)object);
                fileWriter.close();
                object = Runtime.getRuntime().exec("cscript //NoLogo " + object2.getPath());
                object = new BufferedReader(new InputStreamReader(object.getInputStream()));
                while ((object2 = object.readLine()) != null) {
                    string = String.valueOf(string) + (String)object2;
                }
                object.close();
            }
        }
        catch (Throwable throwable) {}
        return string.trim();
    }

    public static String a(String string, String[] arrstring) {
        String string2 = "";
        try {
            RequestConfig requestConfig;
            String string3;
            CloseableHttpResponse closeableHttpResponse = new CloseableHttpResponse(arrstring.length);
            int n2 = 0;
            while (n2 < arrstring.length) {
                requestConfig = arrstring[n2].split("=", 2);
                closeableHttpResponse.add(new BasicNameValuePair((String)requestConfig[0], (String)requestConfig[1]));
                ++n2;
            }
            CloseableHttpClient closeableHttpClient = HttpClientBuilder.create().build();
            requestConfig = RequestConfig.custom().setConnectTimeout(30000).setConnectionRequestTimeout(30000).setSocketTimeout(30000).build();
            HttpPost httpPost = new HttpPost(string);
            httpPost.setConfig(requestConfig);
            httpPost.setEntity((HttpEntity)new UrlEncodedFormEntity(closeableHttpResponse, "UTF-8"));
            closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)httpPost);
            requestConfig = closeableHttpResponse.getEntity();
            InputStream inputStream = requestConfig.getContent();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "iso-8859-1");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader, 8);
            StringBuilder stringBuilder = new StringBuilder();
            while ((string3 = bufferedReader.readLine()) != null) {
                stringBuilder.append(string3);
            }
            string2 = stringBuilder.toString();
            inputStream.close();
            inputStreamReader.close();
            httpPost.releaseConnection();
            EntityUtils.consume((HttpEntity)requestConfig);
            closeableHttpResponse.close();
            closeableHttpClient.close();
        }
        catch (Throwable throwable) {
            if (string.startsWith("https")) {
                string2 = a.a(string.replace("https://", "http://"), arrstring);
            }
            GUI.d(aM.G("dlg_lic_get_txt7"), "Information");
        }
        return string2;
    }

    public static HashMap a(String object, String object2, String object3) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        try {
            String string;
            System.setProperty("http.keepAlive", "false");
            Object object4 = new CookieManager();
            object4.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
            CookieHandler.setDefault((CookieHandler)object4);
            object = new URL((String)object);
            if (!object2.contentEquals("")) {
                object3 = new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String)object2, (int)Integer.valueOf((String)object3)));
                object2 = (HttpURLConnection)object.openConnection((Proxy)object3);
            } else {
                object2 = (HttpURLConnection)object.openConnection();
            }
            object2.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
            object2.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
            object2.setConnectTimeout(15000);
            object2.setReadTimeout(15000);
            object2.connect();
            object3 = "UTF8";
            if (GUI.D().contains(" BCoin")) {
                object3 = "ISO-8859-15";
            }
            object4 = object2.getInputStream();
            object3 = new BufferedReader(new InputStreamReader((InputStream)object4, (String)object3));
            object = "";
            while ((string = object3.readLine()) != null) {
                object = String.valueOf(object) + string;
            }
            object2 = object2.getErrorStream();
            object4.close();
            object3.close();
            object2.close();
            hashMap.put("page", new String((String)object));
            hashMap.put("error", "curl_error");
            hashMap.put("info", "curl_getinfo");
            hashMap.put("data_t", "data_t");
        }
        catch (Throwable throwable) {
            hashMap.put("page", "");
            hashMap.put("error", "curl_error");
            hashMap.put("info", "curl_getinfo");
            hashMap.put("data_t", "data_t");
        }
        return hashMap;
    }

    public static String j(String string) {
        String string2;
        string2 = "";
        try {
            string2 = Normalizer.normalize(string, Normalizer.Form.NFD);
            string2 = string2.replaceAll("[^\\p{ASCII}]", "");
        }
        catch (Throwable throwable) {}
        return string2;
    }

    public static boolean a() {
        try {
            Object object = new URL("http://www.google.com");
            object = (HttpURLConnection)object.openConnection();
            object.getContent();
            return true;
        }
        catch (UnknownHostException unknownHostException) {
        }
        catch (IOException iOException) {}
        return false;
    }

    public static Integer a(Integer n2, Integer n3) {
        Integer n4;
        n4 = n2;
        try {
            Random random = new Random();
            n4 = random.nextInt(n3 - n2) + n2;
        }
        catch (Throwable throwable) {}
        return n4;
    }

    public static void b(String object) {
        try {
            object = new File((String)object);
            if (!object.exists()) {
                object.mkdirs();
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    public static void a(List list, List object) {
        try {
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (String)iterator.next();
                if (!list.contains(object)) continue;
                list.remove(object);
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static String[] a(List list) {
        String[] arrstring = new String[]{};
        try {
            String[] arrstring2 = new String[list.size()];
            arrstring2 = list.toArray(arrstring2);
            return arrstring2;
        }
        catch (Throwable throwable) {
            return arrstring;
        }
    }

    public static boolean a(String string) {
        boolean bl2;
        bl2 = false;
        try {
            Object object;
            Object object2;
            String string2;
            Connection connection;
            string2 = "IQUALIF France White";
            if (string.contains("White and Yellow")) {
                string2 = "IQUALIF Viva White and Yellow";
            } else if (string.contains("Yellow")) {
                string2 = "IQUALIF France Yellow";
            }
            connection = SQL.a(String.valueOf(GUI.x()) + aM.N());
            String[] arrstring = aM.b();
            object2 = 0;
            while (object2 < arrstring.length) {
                String string3;
                string3 = arrstring[object2];
                try {
                    object = "ALTER TABLE [" + string3 + "] ADD COLUMN \"" + string + "\" TEXT";
                    object = connection.prepareStatement((String)object);
                    object.execute();
                    object.close();
                }
                catch (Throwable throwable) {}
                object = "UPDATE [" + string3 + "] SET [" + string + "]=[" + string2 + "];";
                object = connection.prepareStatement((String)object);
                object.execute();
                object.close();
                ++object2;
            }
            connection.close();
            connection = SQL.a(String.valueOf(GUI.x()) + aH.I());
            try {
                object = "ALTER TABLE table_t ADD COLUMN \"" + string + "\" TEXT";
                PreparedStatement preparedStatement = connection.prepareStatement((String)object);
                preparedStatement.execute();
                preparedStatement.close();
            }
            catch (Throwable throwable) {}
            try {
                object = "UPDATE table_t SET [" + string + "]=[" + string2 + "];";
                PreparedStatement preparedStatement = connection.prepareStatement((String)object);
                object2 = preparedStatement;
                preparedStatement.execute();
                object2.close();
            }
            catch (Throwable throwable) {}
            connection.close();
            connection = SQL.a(String.valueOf(GUI.x()) + bn.I());
            try {
                object = "ALTER TABLE table_t ADD COLUMN \"" + string + "\" TEXT";
                object2 = connection.prepareStatement((String)object);
                object2.execute();
                object2.close();
            }
            catch (Throwable throwable) {}
            object = "UPDATE table_t SET [" + string + "]=[" + string2 + "];";
            object2 = connection.prepareStatement((String)object);
            object2.execute();
            object2.close();
            connection.close();
            bl2 = true;
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean b(String var0) {
        var1_2 = null;
        var2_3 = null;
        try {
            try {
                if (var0.contentEquals("")) {
                    return false;
                }
                var3_4 = -1;
                var4_6 = new Scanner(System.in);
                block16 : do {
                    block30 : {
                        if (var3_4 > 100 || var3_4 < 0) break block30;
                        var4_6.close();
                        var3_5 = SQL.a(String.valueOf(GUI.x()) + aM.N());
                        var4_6 = SQL.a(String.valueOf(GUI.x()) + "dev" + File.separator + aM.N());
                        var5_7 = SQL.a(String.valueOf(GUI.x()) + bn.I());
                        var6_8 = SQL.a(String.valueOf(GUI.x()) + "dev" + File.separator + bn.I());
                        var7_9 = SQL.a(String.valueOf(GUI.x()) + aH.I());
                        var8_10 = SQL.a(String.valueOf(GUI.x()) + "dev" + File.separator + aH.I());
                        var9_11 = "SELECT text,[" + var0 + "] FROM " + bn.H() + ";";
                        var2_3 = var6_8.prepareStatement(var9_11);
                        var1_2 = var2_3.executeQuery();
                        ** GOTO lbl62
                    }
                    do {
                        if (var4_6.hasNextInt()) {
                            var3_4 = var4_6.nextInt();
                            continue block16;
                        }
                        var4_6.next();
                    } while (true);
                    break;
                } while (true);
            }
            catch (Throwable v0) {
                if (var1_2 != null) {
                    try {
                        var1_2.close();
                    }
                    catch (Throwable v1) {}
                }
                if (var2_3 == null) return false;
                try {
                    var2_3.close();
                    return false;
                }
                catch (Throwable v2) {
                    return false;
                }
            }
        }
        catch (Throwable var0_1) {
            if (var1_2 != null) {
                try {
                    var1_2.close();
                }
                catch (Throwable v3) {}
            }
            if (var2_3 == null) throw var0_1;
            try {
                var2_3.close();
                throw var0_1;
            }
            catch (Throwable v4) {}
            throw var0_1;
        }
lbl-1000: // 1 sources:
        {
            var10_12 = var1_2.getString(1);
            var11_13 = var1_2.getString(2);
            var12_15 = "UPDATE " + bn.H() + " SET [" + var0 + "]=? WHERE text=?;";
            var2_3 = var5_7.prepareStatement(var12_15);
            var2_3.setString(1, var11_13);
            var2_3.setString(2, (String)var10_12);
            var2_3.execute();
lbl62: // 2 sources:
            ** while (var1_2.next())
        }
lbl63: // 1 sources:
        var1_2.close();
        var2_3.close();
        var9_11 = "SELECT text,[" + var0 + "] FROM " + aH.H() + ";";
        var2_3 = var8_10.prepareStatement(var9_11);
        var1_2 = var2_3.executeQuery();
        while (var1_2.next()) {
            var10_12 = var1_2.getString(1);
            var11_13 = var1_2.getString(2);
            var12_15 = "UPDATE " + aH.H() + " SET [" + var0 + "]=? WHERE text=?;";
            var2_3 = var7_9.prepareStatement(var12_15);
            var2_3.setString(1, var11_13);
            var2_3.setString(2, (String)var10_12);
            var2_3.execute();
        }
        var1_2.close();
        var2_3.close();
        var10_12 = aM.b();
        var11_14 = 0;
        while (var11_14 < var10_12.length) {
            var12_15 = var10_12[var11_14];
            var9_11 = "SELECT text,[" + var0 + "] FROM '" + var12_15 + "';";
            var2_3 = var4_6.prepareStatement(var9_11);
            var1_2 = var2_3.executeQuery();
            while (var1_2.next()) {
                var9_11 = var1_2.getString(1);
                var13_16 = var1_2.getString(2);
                var14_17 = "UPDATE '" + var12_15 + "' SET [" + var0 + "]=? WHERE text=?;";
                var2_3 = var3_5.prepareStatement(var14_17);
                var2_3.setString(1, var13_16);
                var2_3.setString(2, var9_11);
                var2_3.execute();
            }
            ++var11_14;
        }
        var3_5.close();
        var4_6.close();
        var5_7.close();
        var6_8.close();
        var7_9.close();
        var8_10.close();
        System.exit(0);
        if (var1_2 != null) {
            try {
                var1_2.close();
            }
            catch (Throwable v5) {}
        }
        if (var2_3 == null) return false;
        try {
            var2_3.close();
            return false;
        }
        catch (Throwable v6) {}
        return false;
    }

    public static List a(String[] object) {
        ArrayList<String> arrayList;
        new File("").getAbsolutePath();
        arrayList = new ArrayList<String>();
        try {
            String string;
            object = Runtime.getRuntime().exec((String[])object);
            object.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(object.getInputStream()));
            object = new BufferedReader(new InputStreamReader(object.getErrorStream()));
            while ((string = bufferedReader.readLine()) != null) {
                arrayList.add(string);
            }
            while ((string = object.readLine()) != null) {
                arrayList.add(string);
            }
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    public static void c(String object) {
        try {
            object = new URL((String)object);
            object = object.toURI();
            Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
            if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                try {
                    desktop.browse((URI)object);
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
        }
        catch (Throwable throwable) {}
    }

    public static List a(String object, String string) {
        ArrayList<Object> arrayList;
        arrayList = new ArrayList<Object>();
        try {
            object = new File((String)object);
            File[] arrfile = object.listFiles();
            int n2 = 0;
            while (n2 < arrfile.length) {
                if (arrfile[n2].isFile() && (object = arrfile[n2].getName()).contains(string)) {
                    arrayList.add(object);
                }
                ++n2;
            }
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    public static boolean DeleteFile(String object) {
        boolean bl2;
        bl2 = false;
        try {
            object = new File((String)object);
            if (object.delete()) {
                bl2 = true;
            }
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public static boolean a(File file, String string) {
        try {
            if (file.isDirectory()) {
                if (file.list().length == 0) {
                    if (file.getName().endsWith(string)) {
                        file.delete();
                    }
                } else {
                    Object object;
                    String[] arrstring = object = file.list();
                    int n2 = ((String[])object).length;
                    int n3 = 0;
                    while (n3 < n2) {
                        object = arrstring[n3];
                        if ((object = new File(file, (String)object)).getName().endsWith(string)) {
                            a.a((File)object, string);
                        }
                        ++n3;
                    }
                    if (file.list().length == 0) {
                        file.delete();
                    }
                }
            } else if (file.getName().endsWith(string)) {
                file.delete();
            }
        }
        catch (Throwable throwable) {}
        return true;
    }

    public static boolean b() {
        try {
            Object object = new URL("http://www.google.com");
            object = (HttpURLConnection)object.openConnection();
            object.getContent();
        }
        catch (Throwable throwable) {
            return false;
        }
        return true;
    }

    public static boolean a(String string, List list) {
        try {
            Sheet sheet;
            FileInputStream fileInputStream = null;
            NPOIFSFileSystem nPOIFSFileSystem = null;
            File file = new File(string);
            if (file.exists() && !file.isDirectory()) {
                if (string.contains(".xlsx")) {
                    fileInputStream = new FileInputStream(string);
                    file = new XSSFWorkbook((InputStream)fileInputStream);
                } else if (string.contains(".xls")) {
                    nPOIFSFileSystem = new NPOIFSFileSystem(file);
                    file = new HSSFWorkbook(nPOIFSFileSystem.getRoot(), true);
                } else {
                    return false;
                }
                sheet = file.getSheetAt(0);
            } else {
                if (string.contains(".xlsx")) {
                    file = new XSSFWorkbook();
                } else if (string.contains(".xls")) {
                    file = new HSSFWorkbook();
                } else {
                    return false;
                }
                sheet = file.createSheet("iqualif");
            }
            int n2 = 0;
            while (n2 < list.size()) {
                String[] arrstring = (String[])list.get(n2);
                Row row = sheet.getPhysicalNumberOfRows() == 0 ? sheet.createRow(0) : sheet.createRow(sheet.getLastRowNum() + 1);
                int n3 = 0;
                while (n3 < arrstring.length) {
                    Cell cell = row.createCell(n3);
                    cell.setCellValue(arrstring[n3]);
                    ++n3;
                }
                ++n2;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(string));
            file.write((OutputStream)fileOutputStream);
            fileOutputStream.close();
            if (nPOIFSFileSystem != null) {
                nPOIFSFileSystem.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static boolean a(String object, String string, String string2) {
        boolean bl2;
        bl2 = false;
        try {
            object = new BufferedWriter(new OutputStreamWriter((OutputStream)new FileOutputStream((String)object, true), string2));
            object.append(string);
            object.close();
            bl2 = true;
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public static boolean a(String object, String string) {
        boolean bl2;
        bl2 = false;
        try {
            object = new BufferedWriter(new FileWriter((String)object));
            if (string != null) {
                object.write(string);
            }
            object.close();
            bl2 = true;
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public static String a(byte[] arrby) {
        String string;
        string = "UTF-8";
        try {
            String string2 = "UTF-8";
            UniversalDetector universalDetector = new UniversalDetector(null);
            universalDetector.handleData(arrby, 0, arrby.length);
            universalDetector.dataEnd();
            string = universalDetector.getDetectedCharset();
            universalDetector.reset();
            if (string == null) {
                string = string2;
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static String a(File object) {
        String string;
        string = "UTF-8";
        try {
            int n2;
            String string2 = "UTF-8";
            byte[] arrby = new byte[4096];
            object = new FileInputStream((File)object);
            UniversalDetector universalDetector = new UniversalDetector(null);
            while ((n2 = object.read(arrby)) > 0 && !universalDetector.isDone()) {
                universalDetector.handleData(arrby, 0, n2);
            }
            universalDetector.dataEnd();
            string = universalDetector.getDetectedCharset();
            if (string == null) {
                string = string2;
            }
            universalDetector.reset();
            object.close();
        }
        catch (Throwable throwable) {}
        return string;
    }

    static String f() {
        String string;
        string = "";
        try {
            ArrayList arrayList;
            if (a != null) {
                if (a.size() > 1) {
                    int n2 = a.a(0, (Integer)a.size());
                    string = (String)a.get(n2);
                    return string;
                }
                arrayList = new ArrayList();
                a = arrayList;
            } else {
                a = arrayList = new ArrayList();
            }
            a.add("Mozilla/5.0 (iPhone; CPU iPhone OS 7_0 like Mac OS X) AppleWebKit/537.51.1 (KHTML, like Gecko) Version/7.0 Mobile/11A465 Safari/9537.53 (compatible; bingbot/2.0; http://www.bing.com/bingbot.htm)");
            a.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; Media Center PC");
            a.add("Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
            a.add("Mozilla/4.0 (compatible; MSIE 5.01; Windows NT 5.0)");
            a.add("Mozilla/4.0 (compatible; MSIE 6.0; MSIE 5.5; Windows NT 5.0) Opera 7.02 Bork-edition [en]");
            a.add("Mediapartners-Google");
            a.add("magpie-crawler/1.1 (U; Linux amd64; en-GB; +http://www.brandwatch.net)");
            a.add("Opera/9.80 (Windows NT 6.2; Win64; x64) Presto/2.12.388 Version/12.15");
            a.add("Mozilla/5.0 (iPhone; U; CPU iPhone OS 4_1 like Mac OS X; en-us) AppleWebKit/532.9 (KHTML, like Gecko) Version/4.0.5 Mobile/8B117 Safari/6531.22.7 (compatible; Googlebot-Mobile/2.1; +http://www.google.com/bot.html)");
            a.add("Opera/9.80 (Windows NT 5.1; U; en) Presto/2.10.289 Version/12.01");
            a.add("Xenu Link Sleuth/1.3.8");
            a.add("ADmantX Platform Semantic Analyzer - ADmantX Inc. - www.admantx.com - support@admantx.com");
            a.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            a.add("Mozilla/5.0 (X11; U; Linux x86_64; en-US; rv:1.9.0.19; aggregator:Spinn3r (Spinn3r 3.1); http://spinn3r.com/robot) Gecko/2010040121 Firefox/3.0.19");
            a.add("checks.panopta.com");
            a.add("DoCoMo/2.0 P900i(c100;TB;W24H11) (compatible; ichiro/mobile goo;+http://search.goo.ne.jp/option/use/sub4/sub4-1/)");
            a.add("Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
            a.add("msnbot/2.0b (+http://search.msn.com/msnbot.htm)");
            a.add("Sosospider+(+http://help.soso.com/webspider.htm)");
            a.add("Mozilla/4.5 (compatible; HTTrack 3.0x; Windows 98)");
            a.add("Mozilla/5.0 (compatible; BLEXBot/1.0; +http://webmeup-crawler.com/)");
            a.add("Mozilla/5.0 (compatible; GrapeshotCrawler/2.0; +http://www.grapeshot.co.uk/crawler.php)");
            a.add("Mozilla/5.0 (compatible; PaperLiBot/2.1; http://support.paper.li/entries/20023257-what-is-paper-li)");
            a.add("Mozilla/5.0 (compatible; MJ12bot/v1.4.4; http://www.majestic12.co.uk/bot.php?+)");
            a.add("Googlebot");
            a.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
            a.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1;)");
            a.add("Mozilla/5.0 (compatible; SEOkicks-Robot; +http://www.seokicks.de/robot.html)");
            a.add("Sogou web spider/4.0(+http://www.sogou.com/docs/help/webmasters.htm#07)");
            a.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1) )");
            a.add("facebookexternalhit/1.1 (+http://www.facebook.com/externalhit_uatext.php)");
            a.add("Wget/1.13.4 (linux-gnu)");
            a.add("Mozilla/5.0 (compatible; bnf.fr_bot; +http://www.bnf.fr/fr/outils/a.dl_web_capture_robot.html)");
            a.add("Mozilla/5.0 (compatible; SEOkicks-Robot +http://www.seokicks.de/robot.html)");
            a.add("Mozilla/5.0 (compatible; AcoonBot/4.11.1; +http://www.acoon.de/robot.asp)");
            a.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; TencentTraveler)");
            a.add("ia_archiver (+http://www.alexa.com/site/help/webmasters; crawler@alexa.com)");
            a.add("Mozilla/5.0 (compatible; Exabot/3.0 (BiggerBetter); +http://www.exabot.com/go/robot)");
            a.add("integrity/3");
            a.add("Tiny Tiny RSS/1.5.5 (http://tt-rss.org/)");
            a.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/4.0)");
            a.add("Mozilla/5.0 (compatible; spbot/4.0.7; +http://OpenLinkProfiler.org/bot )");
            a.add("Reeder/1.5.7 CFNetwork/548.1.4 Darwin/11.0.0");
            a.add("DoCoMo/2.0 N905i(c100;TB;W24H16) (compatible; Googlebot-Mobile/2.1; +http://www.google.com/bot.html)");
            a.add("MobileSafari/8536.25 CFNetwork/609.1.4 Darwin/13.0.0");
            a.add("Mozilla/5.0 (compatible; Linux x86_64; Mail.RU_Bot/2.0; +http://go.mail.ru/help/robots)");
            a.add("Java/1.7.0_25");
            a.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0)");
            a.add("SAMSUNG-SGH-E250/1.0 Profile/MIDP-2.0 Configuration/CLDC-1.1 UP.Browser/6.2.3.3.c.1.101 (GUI) MMP/2.0 (compatible; Googlebot-Mobile/2.1; +http://www.google.com/bot.html)");
            a.add("Mozilla/5.0 (compatible; linkdexbot/2.0; +http://www.linkdex.com/about/bots/)");
            a.add("Mozilla/5.0 (compatible; WBSearchBot/1.1; +http://www.warebay.com/bot.html)");
            a.add("ichiro/3.0 (http://help.goo.ne.jp/door/crawler.html)");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64) Presto/2.12.388 Version/12.16");
            a.add("TurnitinBot/2.1 (http://www.turnitin.com/robot/crawlerinfo.html)");
            a.add("yacybot (freeworld/global; amd64 Linux 3.8.0-27-generic; java 1.6.0_27; Europe/fr) http://yacy.net/bot.html");
            a.add("Mozilla/5.0 (compatible; sindice-fetcher/0.1.0 +http://sindice.com/developers/bot)");
            a.add("Mozilla/5.0 (compatible; archive.org_bot +http://www.archive.org/details/archive.org_bot)");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64) Presto/2.12.388 Version/12.15");
            a.add("Java/1.6.0_18");
            a.add("Mozilla/5.0 (compatible; spbot/3.1; +http://www.seoprofiler.com/bot )");
            a.add("psbot/0.1 (+http://www.picsearch.com/bot.html)");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64) Presto/2.12.388 Version/12.14");
            a.add("Apache-HttpClient/4.2.3 (java 1.5)");
            a.add("Netscape 6.0; WinNT6.1");
            a.add("Nutch12/Nutch-1.2");
            a.add("Mozilla/4.0 (compatible; Synapse)");
            a.add("BUbiNG (+http://law.di.unimi.it/BUbiNG.html)");
            a.add("linkdex.com/v2.0");
            a.add("Mozilla/5.0 (compatible; AhrefsBot/3.1; +http://ahrefs.com/robot/)");
            a.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1)");
            a.add("CybEye.com/2.0 (compatible; MSIE 9.0; Windows NT 5.1; Trident/4.0; GTB6.4)");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64) Presto/2.12.388 Version/12.11");
            a.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Trident/4.0)");
            a.add("Opera/9.80 (Windows NT 6.1; U; ru) Presto/2.10.229 Version/11.64");
            a.add("Mozilla/5.0 (compatible; SearchmetricsBot; http://www.searchmetrics.com/en/searchmetrics-bot/)");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; U; ru) Presto/2.10.289 Version/12.00");
            a.add("ichiro/3.0 (http://search.goo.ne.jp/option/use/sub4/sub4-1/)");
            a.add("Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Win 9x 4.90)");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64) Presto/2.12.388 Version/12.10");
            a.add("Mozilla/4.0 (compatible; Win32; WinHttp.WinHttpRequest.5)");
            a.add("Opera/9.80 (Windows NT 5.1; U; ru) Presto/2.10.229 Version/11.64");
            a.add("Opera/9.80 (Windows NT 5.1; U; ru) Presto/2.10.289 Version/12.00");
            a.add("msnbot-media/1.1 (+http://search.msn.com/msnbot.htm)");
            a.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT)");
            a.add("Mozilla/5.0 (compatible; SemrushBot/0.96.3; +http://www.semrush.com/bot.html)");
            a.add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Trident/4.0)");
            a.add("Opera/9.80 (Windows NT 6.1; Win64; x64; Edition Yx) Presto/2.12.388 Version/12.11");
            a.add("Opera/9.80 (Windows NT 6.1; U; YB/3.5.1; ru) Presto/2.6.30 Version/10.63");
            a.add("yacybot (freeworld/global; i386 Linux 3.12-1-686-pae; java 1.7.0_21; Europe/en) http://yacy.net/bot.html");
            a.add("Mozilla/5.0 (compatible; Mail.RU_Bot/2.0)");
            a.add("siclab (cboc-test@lab.ntt.co.jp)");
            a.add("MobileSafari/8536.25 CFNetwork/609 Darwin/13.0.0");
            a.add("Opera/9.80 (Windows NT 5.1) Presto/2.12.388 Version/12.11");
            a.add("MobileSafari/9537.53 CFNetwork/672.0.8 Darwin/14.0.0");
            a.add("Opera/9.80 (Windows NT 6.1) Presto/2.12.388 Version/12.11");
            a.add("Opera/9.80 (Windows NT 5.1; Edition Yx) Presto/2.12.388 Version/12.11");
            a.add("Mozilla/4.0 (compatible;)");
            a.add("Opera/9.80 (Windows NT 6.1; Win64; x64) Presto/2.12.388 Version/12.11");
            a.add("Opera/9.80 (Windows NT 6.1; U; ru) Presto/2.10.289 Version/12.02");
            a.add("Opera/9.80 (Windows NT 5.1) Presto/2.12.388 Version/12.10");
            a.add("Opera/9.80 (Windows NT 6.2; U; en) Presto/2.10.289 Version/12.02");
            a.add("Opera/9.80 (Windows NT 6.1; MRA 6.0 (build 5970)) Presto/2.12.388 Version/12.10");
            a.add("Opera/9.80 (Windows NT 6.1; U; ru) Presto/2.10.229 Version/11.61");
            a.add("Opera/9.80 (Windows NT 6.1; Win64; x64) Presto/2.12.388 Version/12.10");
            a.add("Opera/9.80 (Windows NT 6.1; U; Edition Yx; ru) Presto/2.10.289 Version/12.02");
            a.add("Opera/9.80 (Windows NT 6.1; MRA 6.0 (build 6001)) Presto/2.12.388 Version/12.10");
            a.add("Opera/9.80 (Windows NT 5.1; U; YB/3.5.1; ru) Presto/2.10.229 Version/11.64");
            a.add("Opera/9.80 (Windows NT 6.0) Presto/2.12.388 Version/12.10");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; MRA 6.0 (build 5976)) Presto/2.12.388 Version/12.11");
            a.add("Opera/9.80 (Windows NT 6.2; WOW64; MRA 8.0 (build 5784)) Presto/2.12.388 Version/12.10");
            a.add("Opera/9.80 (Windows NT 5.1; U; fr) Presto/2.10.229 Version/11.64");
            a.add("Opera/9.80 (Windows NT 5.1; U; MRA 6.0 (build 5970); ru) Presto/2.7.62 Version/11.00");
            a.add("Opera/9.80 (Windows NT 6.2; WOW64) Presto/2.12.388 Version/12.11");
            a.add("Opera/9.80 (Windows NT 6.1; U; Edition Next; ru) Presto/2.11.310 Version/12.50");
            a.add("Opera/9.80 (Windows NT 6.1; Edition Yx) Presto/2.12.388 Version/12.11");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; MRA 6.0 (build 6001)) Presto/2.12.388 Version/12.11");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; U; ru) Presto/2.10.289 Version/12.01");
            a.add("Opera/9.80 (Windows NT 6.1; MRA 6.0 (build 5970)) Presto/2.12.388 Version/12.11");
            a.add("Opera/9.80 (Windows NT 6.2; WOW64; MRA 8.0 (build 5784)) Presto/2.12.388 Version/12.11");
            a.add("Opera/9.80 (Windows NT 5.1; MRA 6.0 (build 5831)) Presto/2.12.388 Version/12.10");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64) Presto/2.12.388 Version/12.12");
            a.add("Java/1.6.0_31");
            a.add("yacybot (freeworld/global; i386 Linux 3.10-2-686-pae; java 1.7.0_21; Europe/en) http://yacy.net/bot.html");
            a.add("Linguee Bot (http://www.linguee.com/bot; bot@linguee.com)");
            a.add("www.integromedb.org/Crawler");
            a.add("Opera/9.80 (Windows NT 5.1; U; Edition Yx; ru) Presto/2.10.289 Version/12.02");
            a.add("Opera/9.80 (Windows NT 6.1) Presto/2.12.388 Version/12.10");
            a.add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; MRA 6.0 (build 5993); MRA 8.0 (build 5784); InfoPath.2)");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; U; MRA 8.0 (build 5880); ru) Presto/2.10.289 Version/12.02");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; U; Edition Next; Edition Yx; ru) Presto/2.11.310 Version/12.50");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; U; ru) Presto/2.10.289 Version/12.02");
            a.add("Mozilla/4.0 (compatible; MSIE 7.0b; Windows NT 6.0)");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; Edition Yx) Presto/2.12.388 Version/12.11");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; MRA 8.0 (build 5880)) Presto/2.12.388 Version/12.11");
            a.add("Java/1.6.0_20");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; MRA 8.0 (build 5784)) Presto/2.12.388 Version/12.10");
            a.add("Opera/9.80 (Windows NT 5.1; Edition Yx) Presto/2.12.388 Version/12.10");
            a.add("Mozilla/5.0 (compatible; news bot /2.1)");
            a.add("Opera/9.80 (Windows NT 6.0; U; ru) Presto/2.10.289 Version/12.02");
            a.add("Opera/9.80 (Windows NT 5.1; MRA 6.0 (build 5998)) Presto/2.12.388 Version/12.11");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; U; fr) Presto/2.10.289 Version/12.02");
            a.add("Opera/9.80 (Windows NT 5.1; U; ru) Presto/2.10.289 Version/12.02");
            a.add("Opera/9.80 (Windows NT 6.1; Win64; x64; Edition Yx) Presto/2.12.388 Version/12.10");
            a.add("Mozilla/5.0 (compatible; imrbot/1.10.8 +http://www.mignify.com)");
            a.add("Scrapy/0.16.4 (+http://scrapy.org)");
            a.add("Opera/9.80 (Windows NT 5.1; Edition Ukraine Local) Presto/2.12.388 Version/12.10");
            a.add("Opera/9.80 (Windows NT 5.1; U; MRA 8.0 (build 5784); ru) Presto/2.10.289 Version/12.02");
            a.add("Opera/9.80 (Windows NT 6.1; MRA 6.0 (build 5976)) Presto/2.12.388 Version/12.10");
            a.add("Opera/9.80 (Windows NT 6.1; U; ru) Presto/2.7.39 Version/11.00");
            a.add("Mozilla/5.0 (X11; Linux i686) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.101 Safari/537.36; SSL-Crawler: http://crawler.dcsec.uni-hannover.de");
            a.add("Java/1.6.0_22");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; Edition Yx) Presto/2.12.388 Version/12.10");
            a.add("niki-bot");
            a.add("Opera/9.80 (Windows NT 6.1; WOW64; MRA 6.0 (build 5998)) Presto/2.12.388 Version/12.10");
            a.add("WordPress/3.8; http://blog.infowebmaster.fr");
            a.a().add("Java/1.6.0_37");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; ru) Presto/2.10.289 Version/12.01");
            a.a().add("Apache-HttpClient/4.2.1 (java 1.5)");
            a.a().add("Mozilla/5.0 (compatible; IstellaBot/1.10.2 +http://www.tiscali.it/)");
            a.a().add("Wget/1.12 (linux-gnu)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; AOL 9.0; Windows NT 5.1)");
            a.a().add("Mozilla/5.0 (compatible; SemrushBot/0.97; +http://www.semrush.com/bot.html)");
            a.a().add("Opera/9.80 (Windows NT 6.1) Presto/2.12.388 Version/12.15");
            a.a().add("Mozilla/5.0 (compatible; 200PleaseBot/1.0; +http://www.200please.com/bot)");
            a.a().add("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.11) Gecko GranParadiso/3.0.11");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt; DTS Agent");
            a.a().add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)");
            a.a().add("yacybot (freeworld/global; i386 Linux 3.10-3-686-pae; java 1.7.0_21; Europe/fr) http://yacy.net/bot.html");
            a.a().add("Mozilla/5.0 (compatible; URLAppendBot/1.0; +http://www.profound.net/urlappendbot.html)");
            a.a().add("DoCoMo/2.0 P900i(c100;TB;W24H11) (compatible; ichiro/mobile goo; +http://search.goo.ne.jp/option/use/sub4/sub4-1/)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)");
            a.a().add("NING/1.0");
            a.a().add("Reeder/1020.09.00 CFNetwork/454.12.4 Darwin/10.8.0 (i386) (iMac11%2C3)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.1; Windows NT)");
            a.a().add("WeSEE:Search/0.1 (Alpha, http://www.wesee.com/bot/)");
            a.a().add("BTWebClient/3120(26773)");
            a.a().add("Java/1.6.0_32");
            a.a().add("Mozilla/5.0 (compatible; TweetedTimes Bot/1.0; +http://tweetedtimes.com)");
            a.a().add("Java/1.7.0_13");
            a.a().add("Opera/9.80 (Windows NT 6.1) Presto/2.12.388 Version/12.12");
            a.a().add("Java/1.7.0_51");
            a.a().add("Mozilla/4.0");
            a.a().add("WordPress.com mShots; http://support.wordpress.com/contact/");
            a.a().add("Opera/9.80 (Windows NT 5.1) Presto/2.12.388 Version/12.15");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; fr) Presto/2.10.289 Version/12.02");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; en) Presto/2.2.15 Version/10.10");
            a.a().add("yacybot (freeworld/global; i386 Linux 3.12-1-686-pae; java 1.7.0_21; Europe/fr) http://yacy.net/bot.html");
            a.a().add("SEOENGWorldBot/1.0 (+http://www.seoengine.com/seoengbot.htm)");
            a.a().add("Opera/9.80 (Windows NT 5.1) Presto/2.12.388 Version/12.14");
            a.a().add("Opera/9.80 (Windows NT 5.1) Presto/2.12.388 Version/12.16");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; fr) Presto/2.10.289 Version/12.02");
            a.a().add("Java/1.6.0_35");
            a.a().add("Opera/9.80 (Windows NT 6.1) Presto/2.12.388 Version/12.16");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Win 9x4.90)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
            a.a().add("W3C_Validator/1.3");
            a.a().add("Java/1.6.0_21");
            a.a().add("facebookexternalhit/1.0 (+http://www.facebook.com/externalhit_uatext.php)");
            a.a().add("UnwindFetchor/1.0 (+http://www.gnip.com/)");
            a.a().add("Mozilla/5.0 (compatible; Konqueror/3.5; Linux) KHTML/3.5.5 (like Gecko) (Exabot-Thumbnails)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0;)");
            a.a().add("Opera/9.80 (Windows NT 6.2; WOW64) Presto/2.12.388 Version/12.16");
            a.a().add("Python-urllib/2.7");
            a.a().add("Opera/9.80 (Windows NT 5.1) Presto/2.12.388 Version/12.12");
            a.a().add("Opera/9.80 (Windows NT 6.1) Presto/2.12.388 Version/12.14");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; ru) Presto/2.10.229 Version/11.64");
            a.a().add("yacybot (freeworld/global; i386 Linux 3.10-2-686-pae; java 1.7.0_21; Europe/fr) http://yacy.net/bot.html");
            a.a().add("Java/1.6.0_39");
            a.a().add("Jigsaw/2.3.0 W3C_CSS_Validator_JFouffa/2.0 (See &lt;http://validator.w3.org/services&gt;)");
            a.a().add("Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 5.0;.NET CLR 1.0.3705; ContextAd Bot 1.0)");
            a.a().add("Java/1.6.0_07");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; MRA 6.0 (build 5680); ru) Presto/2.10.289 Version/12.00");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; MRA 5.10 (build 5339); ru) Presto/2.10.289 Version/12.00");
            a.a().add("Mozilla/5.0 (compatible; Mail.RU_Bot/2.0; +http://go.mail.ru/help/robots)");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; Edition Yx; ru) Presto/2.10.289 Version/12.00");
            a.a().add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; SV1)");
            a.a().add("Opera/9.80 (Windows NT 6.0; U; ru) Presto/2.10.289 Version/12.00");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; Edition Next; Edition Yx; ru) Presto/2.10.289 Version/12.00");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; en) Presto/2.10.229 Version/11.64");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; Edition Yx; ru) Presto/2.10.289 Version/12.00");
            a.a().add("Mozilla/5.0 (compatible; YioopBot; +http://173.13.143.74/bot.php)");
            a.a().add("Mozilla/4.0 (compatible; ICS)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; InfoPath.2)");
            a.a().add("FeedValidator/1.3");
            a.a().add("User-Agent: Mozilla/5.0 (Windows; U; Windows NT 6.1; en; rv:1.9.2.28) Gecko/20120306 Firefox/3.6.28 GTB7.1");
            a.a().add("Mozilla/5.0 (compatible; GeliyooBot/1.0beta; +http://www.geliyoo.com/)");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; ru) Presto/2.10.289 Version/12.00");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; MSIE 5.5; Windows 95) Opera 7.03 [de]");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; ru) Presto/2.6.30 Version/10.63");
            a.a().add("Googlebot-Image/1.0");
            a.a().add("Opera/9.80 (Windows NT 6.1; Win64; x64) Presto/2.12.388 Version/12.16");
            a.a().add("Mozilla/5.0 (compatible; AcoonBot/4.12.1; +http://www.acoon.de/robot.asp)");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; Edition Ukraine Local; ru) Presto/2.10.289 Version/12.00");
            a.a().add("W3C_Unicorn/1.0");
            a.a().add("W3C_I18n-Checker/1.0");
            a.a().add("Mozilla/5.0 (compatible; SemrushBot/0.96.4; +http://www.semrush.com/bot.html)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.2)");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; MRA 5.10 (build 5310); ru) Presto/2.10.289 Version/12.00");
            a.a().add("Java/1.7.0_04");
            a.a().add("Mozilla/5.0 (compatible; MojeekBot/0.6; http://www.mojeek.com/bot.html)");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; ru) Presto/2.9.168 Version/11.51");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; Edition Ukraine Local; ru) Presto/2.10.229 Version/11.64");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; en) Presto/2.10.289 Version/12.00");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; MRA 5.10 (build 5339); ru) Presto/2.10.229 Version/11.64");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; KKman2.0)");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; MRA 6.0 (build 5680); ru) Presto/2.10.289 Version/12.00");
            a.a().add("Sphider");
            a.a().add("MobileSafari/9537.53 CFNetwork/672.0.2 Darwin/14.0.0");
            a.a().add("Java/1.6.0_29");
            a.a().add("Opera/9.64(Windows NT 5.1; U; en) Presto/2.1.1");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; ru) Presto/2.10.229 Version/11.62");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; MRA 5.10 (build 5339); ru) Presto/2.10.289 Version/12.00");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; ru) Presto/2.10.229 Version/11.61");
            a.a().add("Internet Explorer 8.0; WinXP");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; en) Presto/2.10.229 Version/11.61");
            a.a().add("LinksCrawler 0.1beta");
            a.a().add("Java/1.5.0_06");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; Win64; AMD64)");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; Edition Ukraine Local; ru) Presto/2.10.289 Version/12.00");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; Edition Yx; ru) Presto/2.10.229 Version/11.64");
            a.a().add("ContextAd Bot 1.0");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; Edition Yx; ru) Presto/2.10.229 Version/11.64");
            a.a().add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; GTB7.4)");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; MRA 5.10 (build 5339); ru) Presto/2.10.229 Version/11.64");
            a.a().add("1");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; en) Presto/2.10.289 Version/12.00");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; MRA 5.10 (build 5288); ru) Presto/2.2.15 Version/10.10");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; Edition Yx; ru) Presto/2.10.229 Version/11.64");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; Edition Next; ru) Presto/2.10.289 Version/12.01");
            a.a().add("A6-Indexer/1.0 (http://www.a6corp.com/a6-web-scraping-policy/)");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; ru) Presto/2.10.229 Version/11.62");
            a.a().add("Mozilla/5.0 (compatible; SolomonoBot/1.05; +http://www.solomono.ru)");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; ru) Presto/2.9.211 Version/12.00");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; MRA 5.9 (build 4876); ru) Presto/2.10.289 Version/12.00");
            a.a().add("CCBot/2.0");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; MRA 5.10 (build 5310); ru) Presto/2.10.289 Version/12.00");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; Edition Campaign 09; ru) Presto/2.10.289 Version/12.00");
            a.a().add("Pinterest/0.1 +http://pinterest.com/");
            a.a().add("Opera/9.80 (Windows NT 6.1; Win64; x64; U; Edition Yx; ru) Presto/2.10.289 Version/12.00");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; Edition Yx; ru) Presto/2.10.289 Version/12.00");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; ru) Presto/2.9.168 Version/11.52");
            a.a().add("Googlebot/2.1 (+http://www.google.com/bot.html)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; ru) Opera 8.01");
            a.a().add("Opera/9.80 (Windows NT 6.1; Win64; x64; U; ru) Presto/2.10.289 Version/12.00");
            a.a().add("Opera/9.80 (Windows NT 6.1; Win64; x64) Presto/2.12.388 Version/12.15");
            a.a().add("User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.64 Safari/537.31");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; U; MRA 5.10 (build 5339); ru) Presto/2.10.229 Version/11.64");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; ru) Presto/2.10.229 Version/11.60");
            a.a().add("Dorado WAP-Browser/1.0.0");
            a.a().add("Opera/9.80 (Windows NT 6.0) Presto/2.12.388 Version/12.16");
            a.a().add("Java/1.7.0_05");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; MRA 6.0 (build 5754); ru) Presto/2.2.15 Version/10.00");
            a.a().add("Reeder/1.5.7 CFNetwork/609 Darwin/13.0.0");
            a.a().add("MetaURI API/2.0 +metauri.com");
            a.a().add("Ruby");
            a.a().add("Mozilla/5.0 (compatible; SemrushBot/0.96.2; +http://www.semrush.com/bot.html)");
            a.a().add("PHPCrawl");
            a.a().add("Mozilla/5.0 (iPhone; U; CPU iPhone OS 4_1 like Mac OS X; en-us) AppleWebKit/532.9 (KHTML, like Gecko) Version/4.0.5 Mobile/8B117 Safari/6531.22.7 (compatible; Mediapartners-Google/2.1; +http://www.google.com/bot.html)");
            a.a().add("Reeder/1020.09.00 CFNetwork/596.2.3 Darwin/12.2.0 (x86_64) (MacBookAir3%2C2)");
            a.a().add("WordPress/3.5; http://blog.infowebmaster.fr");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; Edition Campaign 09; ru) Presto/2.10.229 Version/11.64");
            a.a().add("Opera/9.80 (Windows NT 6.0; U; ru) Presto/2.10.229 Version/11.64");
            a.a().add("BluzzIn parser");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; ru) Presto/2.10.229 Version/11.60");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; MRA 6.0 (build 5711); ru) Presto/2.10.289 Version/12.00");
            a.a().add("Atomic_Email_Hunter/4.0");
            a.a().add("Jigsaw/2.2.5 W3C_CSS_Validator_JFouffa/2.0");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; Edition Ukraine Local; en) Presto/2.10.289 Version/12.00");
            a.a().add("Reeder/1020.09.00 CFNetwork/596.2.3 Darwin/12.2.0 (x86_64) (MacBookPro7%2C1)");
            a.a().add("SiteSucker/2.3.4");
            a.a().add("Mozilla/4.0 (compatible; MSIE 4.01; Windows CE; PPC; 240x320)");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; MRA 5.10 (build 5310); ru) Presto/2.10.229 Version/11.64");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; ru) Presto/2.7.62 Version/11.00");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; ru) Presto/2.2.15 Version/10.10");
            a.a().add("Dillo/0.8.6-i18n-misc");
            a.a().add("Opera/9.80 (Windows NT 6.2; WOW64) Presto/2.12.388 Version/12.14");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; en) Opera 8.00");
            a.a().add("Python-urllib/2.6");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; ru) Presto/2.10.229 Version/11.62");
            a.a().add("Netvibes (http://www.netvibes.com)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; InfoPath.2)");
            a.a().add("Java/1.6.0_06");
            a.a().add("Opera/9.80 (Windows NT 6.0) Presto/2.12.388 Version/12.14");
            a.a().add("BOT/0.1 (BOT for JCE)");
            a.a().add("woobot/1.1");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1) Netscape/8.0.4");
            a.a().add("Reeder/1.5.7 CFNetwork/609.1.4 Darwin/13.0.0");
            a.a().add("W3C_Validator/1.3 http://validator.w3.org/services");
            a.a().add("Reeder/1020.09.00 CFNetwork/596.3.3 Darwin/12.3.0 (x86_64) (iMac9%2C1)");
            a.a().add("Opera/9.00 (Windows NT 4.0; U; en)");
            a.a().add("Mozilla/4.0 (compatible; Blog Search;)");
            a.a().add("MSIE9");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; en) Presto/2.10.229 Version/11.64");
            a.a().add("Mozilla/5.0 (compatible; CompSpyBot/1.0; +http://www.compspy.com/spider.html)");
            a.a().add("Wget/1.11.4 Red Hat modified");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.17; Mac_PowerPC)");
            a.a().add("Opera/9.80 (Android 2.3.5; Linux; Opera Mobi/ADR-1210241511) Presto/2.11.355 Version/12.10");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; MRA 5.8 (build 4598); ru) Presto/2.10.289 Version/12.00");
            a.a().add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1)");
            a.a().add("Curious George - www.analyticsseo.com/crawler");
            a.a().add("Mozilla/3.0 (compatible; Indy Library)");
            a.a().add("Mozilla/5.0 (compatible; Crawler/0.9; http://linkfluence.net/)");
            a.a().add("SimplePie/1.2.1-dev (Feed Parser; http://simplepie.org; Allow like Gecko) Build/20120502205932");
            a.a().add("MobileSafari/7534.48.3 CFNetwork/548.1.4 Darwin/11.0.0");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; America Online Browser 1.1; rev1.5; Windows NT 5.1;)");
            a.a().add("Java/1.6.0_24");
            a.a().add("Opera/9.80 (Windows NT 6.2; WOW64) Presto/2.12.388 Version/12.15");
            a.a().add("Site Redirect Checker 2011.1");
            a.a().add("Reeder/1020.09.00 CFNetwork/596.3.3 Darwin/12.3.0 (x86_64) (MacBookAir3%2C2)");
            a.a().add("Java/1.6.0_27");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.0; Windows NT 4.0)");
            a.a().add("WordPress/3.7.1; http://blog.infowebmaster.fr");
            a.a().add("HTTPing v1.4.1");
            a.a().add("Googlebot/2.1 (+http://www.googlebot.com/bot.html)");
            a.a().add("Opera/9.80 (X11; Linux i686) Presto/2.12.388 Version/12.10");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; InfoPath.1)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; MRA 4.6 (build 01425))");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows XP)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; T312461)");
            a.a().add("Reeder/1020.09.00 CFNetwork/596.2.3 Darwin/12.2.0 (x86_64) (iMac9%2C1)");
            a.a().add("Microsoft Office Protocol Discovery");
            a.a().add("Mozilla/4.0 (compatible; MSIE 4.01; Digital AlphaServer 1000A 4/233; Windows NT; Powered By 64-Bit Alpha Processor)");
            a.a().add("Mozilla/5.0 (compatible; YandexBot/3.0; MirrorDetector; +http://yandex.com/bots)");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64) Presto/2.12.388 Version/12.13");
            a.a().add("Java/1.6.0_23-ea");
            a.a().add("Opera/9.80 (Windows NT 6.0) Presto/2.12.388 Version/12.15");
            a.a().add("Java/1.7.0_01");
            a.a().add("crawler4j (http://code.google.com/p/crawler4j/)");
            a.a().add("Java/1.6.0_19");
            a.a().add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; Media Center PC 6.0; InfoPath.2; MS-RTC LM 8)");
            a.a().add("Opera/9.80 (X11; Linux x86_64; U; ru) Presto/2.10.289 Version/12.02");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; InfoPath.1");
            a.a().add("python-requests/1.1.0 CPython/2.6.6 Linux/2.6.32-220.el6.i686");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows ME) Opera 7.11  [en]");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows 98)");
            a.a().add("Opera/9.80 (Windows NT 6.1; Win64; x64) Presto/2.12.388 Version/12.14");
            a.a().add("larbin_2.6.3 larbin2.6.3@unspecified.mail");
            a.a().add("AntBot/1.0 (http://www.ant.com)");
            a.a().add("Opera/7.60 (Windows NT 5.2; U)  [en] (IBM EVV/3.0/EAK01AG9/LE)");
            a.a().add("HTTPing v1.5.3");
            a.a().add("libwww-perl/5.805");
            a.a().add("Screaming Frog SEO Spider/2,20");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.0; Windows 3.1)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; en) Opera 8.50");
            a.a().add("Opera/8.00 (Windows NT 5.1; U; en)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT) ::ELNSB50::000061100320025802a00111000000000507000900000000");
            a.a().add("User-Agent=Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.0.1) Gecko/2008070208 Firefox/3.0.1");
            a.a().add("Reeder/1020.09.00 CFNetwork/596.3.3 Darwin/12.3.0 (x86_64) (MacBookPro7%2C1)");
            a.a().add("JS-Kit URL Resolver, http://js-kit.com/");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; FunWebProducts)");
            a.a().add("Opera/9.00 (Windows NT 5.1; U; en)");
            a.a().add("Opera/9.0 (Windows NT 5.1; U; en)");
            a.a().add("TinyBrowser/2.0 (TinyBrowser Comment; rv:1.9.1a2pre) Gecko/20201231");
            a.a().add("Apache-HttpClient/4.2.5 (java 1.5)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Trident/4.0; InfoPath.2)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.0; Windows 2000) Opera 6.0 [en]");
            a.a().add("Mozilla/5.0 (compatible; MojeekBot/0.5; http://www.mojeek.com/bot.html)");
            a.a().add("Mozilla/5.0 (compatible; spbot/3.0; +http://www.seoprofiler.com/bot )");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; MRA 4.6 (build 01425); MRSPUTNIK 1, 5, 0, 19 SW)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0)");
            a.a().add("Opera/8.01 (Windows NT 5.1)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Update a; AOL 6.0; Windows 98)");
            a.a().add("yacybot (freeworld/global; i386 Linux 3.10-3-686-pae; java 1.7.0_21; Europe/en) http://yacy.net/bot.html");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.5; Windows NT 4.0)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1) Opera 7.54 [en]");
            a.a().add("Java/1.6.0_45");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.0; Windows 95) Opera 6.01  [en]");
            a.a().add("Avant Browser (http://www.avantbrowser.com)");
            a.a().add("Mozilla/5.0 (compatible; TweetmemeBot/3.0; +http://tweetmeme.com/)");
            a.a().add("Java/1.6.0_33");
            a.a().add("W3C_Validator/1.767");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; ru) Opera 8.50");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; en) Opera 9.0");
            a.a().add("Mozilla/5.0 (compatible; bingbot/2.0; +http://www.bing.com/bingbot.htm) SitemapProbe");
            a.a().add("Opera/9.80 (Windows NT 6.0; U; fr) Presto/2.10.289 Version/12.02");
            a.a().add("Java/1.7.0");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; KTXN)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; Q312461)");
            a.a().add("Opera/7.11 (Windows NT 5.1; U) [en]");
            a.a().add("Opera/9.80 (Android 4.0.4; Linux; Opera Mobi/ADR-1309251116) Presto/2.11.355 Version/12.10");
            a.a().add("Opera/9.01 (Windows NT 5.1; U; en)");
            a.a().add("Opera/7.54 (Windows NT 5.1; U)  [pl]");
            a.a().add("WeSEE:Search/0.1 (Alpha, http://www.wesee.com/en/support/bot/)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; InfoPath.2)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Win 9x 4.90; Creative)");
            a.a().add("URLChecker");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.5; Windows NT 5.0; T312461)");
            a.a().add("AdMedia bot");
            a.a().add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; SV1; .NET CLR 2.0.50727) Havij");
            a.a().add("Opera/9.80 (X11; Linux x86_64) Presto/2.12.388 Version/12.14");
            a.a().add("Mozilla/4.0 (MSIE 6.0; Windows NT 5.1; Search)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; MSIE 5.5; Windows NT 4.0) Opera 7.0 [en]");
            a.a().add("My Nutch Spider/Nutch-1.7");
            a.a().add("Mozilla/4.0 (compatible; MSIE 10.0; Windows NT 6.1; Trident/5.0)");
            a.a().add("Reeder/1020.09.00 CFNetwork/596.3.3 Darwin/12.3.0 (x86_64) (iMac12%2C2)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.5; Windows 95)");
            a.a().add("AppEngine-Google; (+http://code.google.com/appengine; appid: s~feedly-social)");
            a.a().add("integrity/4");
            a.a().add("COMODOSpider/Nutch-1.2");
            a.a().add("libwww-perl/6.05");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.5; Windows 98)");
            a.a().add("WordPress/3.5; http://www.architectic.fr");
            a.a().add("Opera/9.80 (J2ME/MIDP; Opera Mini/4.2/32.1312; U; en) Presto/2.8.119 Version/11.10");
            a.a().add("Mozilla/5.0 (X11; Linux x86_64; rv:10.0.12) Gecko/20100101 Firefox/21.0 WordPress.com mShots");
            a.a().add("SolomonoBot/1.04 (http://www.solomono.ru)");
            a.a().add("Opera/9.80 (X11; Linux x86_64) Presto/2.12.388 Version/12.16");
            a.a().add("WordPress/3.7.1; http://tonyarchambeau.com/blog");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; MyIE2; Deepnet Explorer)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.5; Windows 95; BCD2000)");
            a.a().add("Mozilla/5.0 (compatible; LinkpadBot/1.06; +http://www.linkpad.ru)");
            a.a().add("BlackBerry8520/5.0.0.592 Profile/MIDP-2.1 Configuration/CLDC-1.1 VendorID/118");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; en)");
            a.a().add("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.8.1.6) Gecko/20070725 Firefox/2.0.0.6 - James BOT - WebCrawler http://cognitiveseo.com/bot.html");
            a.a().add("Opera/9.00 (Windows NT 5.1; U; ru)");
            a.a().add("Java/1.7.0_02");
            a.a().add("Yeti/1.0 (NHN Corp.; http://help.naver.com/robots/)");
            a.a().add("Opera/9.80 (Android; Opera Mini/7.5.33361/29.3638; U; en) Presto/2.8.119 Version/11.10");
            a.a().add("snk");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; fr) Presto/2.10.229 Version/11.61");
            a.a().add("Mozilla/5.0 (compatible; oBot/2.3.1; +http://filterdb.iss.net/crawler/)");
            a.a().add("Mozilla/4.0 (PSP (PlayStation Portable); 2.00)");
            a.a().add("Java/1.6.0_05");
            a.a().add("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; Crazy Browser 1.0.5)");
            a.a().add("Microsoft-WebDAV-MiniRedir/6.1.7601");
            a.a().add("Opera/9.80 (X11; Linux zbov) Presto/2.11.355 Version/12.10");
            a.a().add("Seamonkey-1.1.13-1(X11; U; GNU Fedora fc 10) Gecko/20081112");
            a.a().add("Opera/9.80 (Windows NT 6.2; Win64; x64) Presto/2.12.388 Version/12.12");
            a.a().add("ScreenerBot Crawler Beta 2.0 (+http://www.ScreenerBot.com)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; GTB6.4)");
            a.a().add("WordPress/3.4.2; http://blog.infowebmaster.fr");
            a.a().add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; GTB7.5)");
            a.a().add("Opera/9.80 (Windows NT 6.0) Presto/2.12.388 Version/12.12");
            a.a().add("Opera/9.80 (Windows NT 6.2; WOW64) Presto/2.12.388 Version/12.12");
            a.a().add("Opera/9.80 (X11; Linux x86_64; U; ru) Presto/2.10.289 Version/12.00");
            a.a().add("BacklinkCrawler (http://www.backlinktest.com/crawler.html)");
            a.a().add("Opera/9.80 (Windows NT 6.1; WOW64; Edition Campaign 21) Presto/2.12.388 Version/12.16");
            a.a().add("FreeWebMonitoring SiteChecker/0.1 (+http://www.freewebmonitoring.com)");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; fr) Presto/2.10.289 Version/12.00");
            a.a().add("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Win64; x64; Trident/4.0)");
            a.a().add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0; Trident/4.0)");
            a.a().add("Reeder/1010.79.00 CFNetwork/454.12.4 Darwin/10.8.0 (i386) (iMac11%2C3)");
            a.a().add("Reeder/1020.09.00 CFNetwork/596.2.3 Darwin/12.2.1 (x86_64) (MacBookAir5%2C2)");
            a.a().add("Opera/9.80 (Windows NT 6.2) Presto/2.12.388 Version/12.14");
            a.a().add("Reeder/1020.09.00 CFNetwork/596.4.3 Darwin/12.4.0 (x86_64) (iMac9%2C1)");
            a.a().add("Mozilla/5.0 (compatible; Blekkobot; ScoutJet; +http://blekko.com/about/blekkobot)");
            a.a().add("Opera/9.80 (Windows NT 6.2; WOW64; Edition Campaign 21) Presto/2.12.388 Version/12.10");
            a.a().add("Opera/9.80 (Macintosh; Intel Mac OS X 10.7.4; U; ru) Presto/2.10.289 Version/12.00");
            a.a().add("FeedBurner/1.0 (http://www.FeedBurner.com)");
            a.a().add("Mozilla/5.0 (compatible; MSIE 8.0; Windows NT 5.1) KomodiaBot/1.0");
            a.a().add("Infoseek SideWinder/2.0B (Linux 2.4 i686)");
            a.a().add("NutchCVS/0.7.2 (Nutch; http://lucene.apache.org/nutch/bot.html; nutch-agent@lucene.apache.org)");
            a.a().add("PHP/5.2.17p1");
            a.a().add("Opera/9.80 (J2ME/MIDP; Opera Mini/7.1.32052/28.3392; U; fr) Presto/2.8.119 Version/11.10");
            a.a().add("Browserlet");
            a.a().add("InAGist URL Resolver (http://inagist.com)");
            a.a().add("Lynx/2.8.8dev.2 libwww-FM/2.14 SSL-MM/1.4.1");
            a.a().add("Mozilla/4.0 (compatible; MSIE 5.0; Windows 98; DigExt)");
            a.a().add("Java/1.8.0-ea");
            a.a().add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Trident/4.0; GTB7.4)");
            a.a().add("HTTPConnect");
            a.a().add("Mozilla/5.0 (compatible; Plukkie/1.5; http://www.botje.com/plukkie.htm)");
            a.a().add("curl/7.21.0 (x86_64-pc-linux-gnu) libcurl/7.21.0 OpenSSL/0.9.8o zlib/1.2.3.4 libidn/1.15 libssh2/1.2.6");
            a.a().add("W3C-checklink/4.81 libwww-perl/5.836");
            a.a().add("Opera/9.80 (Windows NT 5.1; U; fr) Presto/2.10.229 Version/11.60");
            a.a().add("Mozilla/4.0 (compatible; MSIE 999.1; Unknown)");
            a.a().add("Microsoft Internet Explorer/4.0b1 (Windows 95)");
            a.a().add("Slurp");
            a.a().add("Reeder/1010.79.00 CFNetwork/596.2.3 Darwin/12.2.0 (x86_64) (MacBookPro7%2C1)");
            a.a().add("Safari");
            a.a().add("WordPress/3.4.2; http://4h18.com");
            a.a().add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Trident/4.0; FBSMTWB; SIMBAR={1D4FCA4E-E24D-48FA-B8BA-3A2F25446472};");
            a.a().add("Opera/9.80 (Windows NT 6.1; U; fr) Presto/2.10.289 Version/12.01");
            a.a().add("Mozilla/4.0 (compatible");
            a.a().add("Opera/9.50 (Nintendo DSi; Opera/507; U; fr)");
            a.a().add("Mozilla/5.0 (compatible; YandexImages/3.0; +http://yandex.com/bots)");
            a.a().add("Mozila/5.0");
            a.a().add("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; MyIE2; InfoPath.2)");
            a.a().add("WordPress/3.2.1; http://idbusiness.unblog.fr");
            int n3 = a.a(0, (Integer)a.a().size());
            string = (String)a.a().get(n3);
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static String k(String string) {
        block3 : {
            String string2 = "";
            try {
                if (string != null && string.length() != 0) break block3;
                return "";
            }
            catch (Throwable throwable) {
                return string2;
            }
        }
        int n2 = string.indexOf("//");
        n2 = n2 == -1 ? 0 : (n2 += 2);
        int n3 = string.indexOf(47, n2);
        n3 = n3 >= 0 ? n3 : string.length();
        return string.substring(n2, n3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean c(String var0) {
        if (var0 == null) {
            return false;
        }
        try {
            var1_1 = var0.length();
            if (var1_1 == 0) {
                return false;
            }
            var2_2 = 0;
            if (var0.charAt(0) == '-') {
                if (var1_1 == 1) {
                    return false;
                }
                var2_2 = 1;
            }
            ** GOTO lbl20
        }
        catch (Throwable v0) {}
        return true;
lbl-1000: // 1 sources:
        {
            var3_3 = var0.charAt(var2_2);
            if (var3_3 <= '/') return false;
            if (var3_3 >= ':') {
                return false;
            }
            ++var2_2;
lbl20: // 2 sources:
            ** while (var2_2 < var1_1)
        }
lbl21: // 1 sources:
        return true;
    }

    public static String l(String string) {
        String string2 = "";
        try {
            string = a.k(string);
            int n2 = 0;
            int n3 = string.indexOf(46);
            int n4 = string.lastIndexOf(46);
            while (n3 < n4) {
                n2 = n3 + 1;
                n3 = string.indexOf(46, n2);
            }
            if (n2 > 0) {
                return string.substring(n2);
            }
            return string;
        }
        catch (Throwable throwable) {
            return string2;
        }
    }

    public static long a(Date date, Date date2, TimeUnit timeUnit) {
        long l2;
        l2 = 0L;
        try {
            long l3 = date2.getTime() - date.getTime();
            l2 = timeUnit.convert(l3, TimeUnit.MILLISECONDS);
        }
        catch (Throwable throwable) {}
        return l2;
    }

    public static ArrayList a(String object) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>();
        try {
            Object object2 = "[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
            String[] arrstring = new String[]{".*\\.avi$", ".*\\.mov$", ".*\\.bmp$", ".*\\.gif$", ".*\\.jpg$", ".*\\.jpeg$", ".*\\.png$", ".*\\.ico$", ".*\\.pdf$", ".*\\.css$", ".*\\.js$", ".*virgilio.it$"};
            object2 = Pattern.compile((String)object2);
            object = object2.matcher((CharSequence)object);
            block2 : while (object.find()) {
                int n2 = 0;
                while (n2 < arrstring.length) {
                    if (object.group(0).toLowerCase().matches(arrstring[n2])) continue block2;
                    ++n2;
                }
                arrayList.add(object.group(0));
            }
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    public static String a(String object, bb bb2) {
        String string;
        string = "";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params", (Object)("query=" + (String)object + "&getRankingInfo=1&hitsPerPage=5&allowTyposOnNumericTokens=0&useQueryEqualsOneAttributeInRanking=0&facets=&facetFilters="));
            object = a.a(jSONObject, bb2);
            if (object.size() > 0) {
                string = (String)object.get(0);
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    private static ArrayList a(JSONObject object, bb object2) {
        ArrayList<JSONObject> arrayList;
        arrayList = new ArrayList<JSONObject>();
        try {
            int n2;
            Object object3;
            DisableCertificateValidation.main(null);
            Object object4 = "https://dsk3ufaxut-dsn.algolia.net/1/indexes/PROD_OuPub/query?x-algolia-agent=Algolia%20for%20vanilla%20JavaScript%203.20.4&x-algolia-application-id=DSK3UFAXUT&x-algolia-api-key=30a9c866c7245bafc39b9d3612ca1a95";
            object4 = new URL((String)object4);
            if (Proxys.isEnabled()) {
                object3 = Proxys.a((bb)object2);
                object2 = (HttpURLConnection)object4.openConnection((Proxy)object3);
            } else {
                object2 = (HttpURLConnection)object4.openConnection();
            }
            object2.setDoOutput(true);
            object2.setRequestMethod("POST");
            object2.setRequestProperty("accept", "application/json");
            object2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            object2.setRequestProperty("Origin", "https://www.pagesjaunes.fr");
            object2.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
            object2.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/12.246");
            object2.setRequestProperty("Referer", "https://www.pagesjaunes.fr/pagesblanches");
            object2.setRequestProperty("Connection", "keep-alive");
            object2.setRequestProperty("DNT", "1");
            object2.setRequestProperty("Host", "dsk3ufaxut-dsn.algolia.net");
            object3 = object2.getOutputStream();
            object3.write(object.toString().getBytes());
            object = new BufferedReader(new InputStreamReader(object2.getInputStream(), "UTF-8"));
            object2 = "";
            while ((n2 = object.read()) >= 0) {
                object2 = String.valueOf(object2) + String.valueOf((char)n2);
            }
            Object object5 = new JSONObject((String)object2);
            object = object5.getJSONArray("hits");
            int n3 = 0;
            while (n3 < object.length()) {
                object5 = object.getJSONObject(n3);
                object5 = object5.getString("objectID");
                arrayList.add((JSONObject)object5);
                ++n3;
            }
            object3.close();
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    public static String a(String object, String object2) {
        String string;
        string = object;
        try {
            object2 = Pattern.compile((String)object2);
            object = object2.matcher((CharSequence)object);
            if (object.find()) {
                string = object.group(1);
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static String b(String object, String object2) {
        String string;
        string = "";
        try {
            object2 = Pattern.compile((String)object2);
            object = object2.matcher((CharSequence)object);
            if (object.find()) {
                if (object.group(1) != null) {
                    string = object.group(1);
                } else if (object.groupCount() > 1 && object.group(2) != null) {
                    string = object.group(2);
                } else if (object.groupCount() > 2 && object.group(3) != null) {
                    string = object.group(3);
                }
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static List a(String string) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>();
        try {
            ArrayList<String> arrayList2 = new ArrayList<String>();
            arrayList2.add("([0-9]{2}.?[0-9]{2}.?[0-9]{2}.?[0-9]{2}.?[0-9]{2})");
            arrayList2.add("(\\+?[0-9]{1,3}.?[ -/\\.\\(\\)0-9]{8,20}[0-9])");
            int n2 = 0;
            while (n2 < arrayList2.size()) {
                Object object = (String)arrayList2.get(n2);
                object = Pattern.compile((String)object);
                object = object.matcher(string);
                while (object.find()) {
                    arrayList.add(object.group(0).replace("/", ""));
                }
                int n3 = 0;
                while (n3 < arrayList.size()) {
                    String string2 = "(.*?[a-zA_Z]+.*?)";
                    if (((String)arrayList.get(n3)).matches(string2)) {
                        arrayList.remove(n3);
                    }
                    string2 = "(.*?/.*?)";
                    if (((String)arrayList.get(n3)).matches(string2)) {
                        arrayList.remove(n3);
                    }
                    ++n3;
                }
                ++n2;
            }
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    public static String m(String string) {
        block4 : {
            String string2 = string;
            try {
                if (string != null && string.length() != 0) break block4;
                return "";
            }
            catch (Throwable throwable) {
                return string2;
            }
        }
        if (string.length() == 1) {
            return string.toLowerCase();
        }
        return String.valueOf(string.substring(0, 1).toLowerCase()) + string.substring(1);
    }

    public static String n(String string) {
        String string2;
        string2 = string;
        try {
            string2 = String.valueOf(string.substring(0, 1).toUpperCase()) + string.substring(1);
        }
        catch (Throwable throwable) {}
        return string2;
    }

    public static String o(String arrstring) {
        Object object;
        object = arrstring;
        try {
            arrstring = arrstring.toLowerCase().split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            int n2 = 0;
            while (n2 < arrstring.length) {
                stringBuilder.append(Character.toUpperCase(arrstring[n2].charAt(0)));
                stringBuilder.append(arrstring[n2].substring(1));
                if (n2 < arrstring.length - 1) {
                    stringBuilder.append(' ');
                }
                ++n2;
            }
            object = stringBuilder.toString();
        }
        catch (Throwable throwable) {}
        return object;
    }

    public static String p(String string) {
        try {
            string = string.substring(1);
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static String q(String string) {
        String string2;
        string2 = string;
        try {
            if (string != null && string.length() > 1) {
                string2 = string.substring(0, string.length() - 1);
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    public static boolean d(String string) {
        boolean bl2;
        bl2 = false;
        try {
            UrlValidator urlValidator = new String[]{"http", "https"};
            urlValidator = new UrlValidator((String[])urlValidator);
            if (urlValidator.isValid(string)) {
                bl2 = true;
            }
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public static String c(String string, String object) {
        Object object2;
        object2 = "";
        try {
            if (object.contentEquals("")) {
                object2 = string;
                if (!string.startsWith("http://")) {
                    if (!string.startsWith("https://")) {
                        object2 = "http://" + string;
                    }
                } else if (!(string.endsWith("/") || GUI.D().contentEquals("IQUALIF Italy Yellow") && bn.Q("detailcapture").contentEquals("0"))) {
                    object2 = String.valueOf(object2) + "/";
                }
            } else if (object.startsWith("/")) {
                object2 = string.length() > 0 && string.endsWith("/") ? String.valueOf(string) + object.substring(1) : String.valueOf(string) + (String)object;
            } else if (object.matches("^www\\..*")) {
                object2 = "http://" + (String)object;
            } else if (object.startsWith("http://")) {
                object2 = object;
                Pattern pattern = Pattern.compile("^\\..*/([a-zA-Z0-9].*)");
                object = pattern.matcher((CharSequence)object);
                if (object.find()) {
                    object2 = String.valueOf(string) + object.group(1);
                }
            } else if (object.startsWith("https://")) {
                object2 = object;
                Pattern pattern = Pattern.compile("^\\..*/([a-zA-Z0-9].*)");
                object = pattern.matcher((CharSequence)object);
                if (object.find()) {
                    object2 = String.valueOf(string) + object.group(1);
                }
            } else {
                object2 = object.matches("^[a-zA-Z0-9].*") ? String.valueOf(string) + (String)object : object;
            }
        }
        catch (Throwable throwable) {}
        return object2;
    }

    public static String a(String string, Integer n2) {
        String string2;
        string2 = string;
        try {
            if (string.length() > n2) {
                string2 = string2.substring(0, n2);
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    public static void a(List list) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(list);
            list.clear();
            list.addAll(linkedHashSet);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static String r(String string) {
        try {
            string = a.g(string);
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static String s(String string) {
        String string2;
        string2 = string;
        try {
            if (GUI.D().contentEquals("IQUALIF Germany Yellow")) {
                string = string.replaceAll("\\<span class=\"hide\".*?>.*?</span>", "").replace("+", " ");
                string = string.replaceAll("\\<span style=\"display:none\".*?>.*?</span>", "");
                string = string.replaceAll("\\<spanclass=\"hide\".*?>.*?</span>", "");
                string = string.replaceAll("\\<spanstyle=\"display:none\".*?>.*?</span>", "");
            }
            string = string.replaceAll("\\<.*?>", "");
            if ((string = string.replace(";", "").replace("\t", " ").replace("\n", "").replace("\r", "")).length() > 32700) {
                string = string.substring(0, 32700);
            }
            string2 = string = string.trim().replaceAll(" +", " ").trim();
        }
        catch (Throwable throwable) {}
        return string2;
    }

    public static boolean fileExists(String object) {
        boolean bl2;
        bl2 = false;
        try {
            object = new File((String)object);
            if (object.exists() && !object.isDirectory()) {
                bl2 = true;
            }
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public static byte[] a(String object) {
        byte[] arrby;
        arrby = null;
        try {
            int n2;
            object = new File((String)object);
            byte[] arrby2 = new byte[4096];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object = new FileInputStream((File)object);
            while ((n2 = object.read(arrby2)) != -1) {
                byteArrayOutputStream.write(arrby2, 0, n2);
            }
            arrby = byteArrayOutputStream.toByteArray();
            object.close();
            byteArrayOutputStream.close();
        }
        catch (Throwable throwable) {}
        return arrby;
    }

    public static String a(List list) {
        String string;
        string = "";
        try {
            int n2 = 0;
            while (n2 < list.size()) {
                string = String.valueOf(string) + (String)list.get(n2);
                ++n2;
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static List a(File object) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>();
        try {
            String string = a.a((File)object);
            if (string.contentEquals("")) {
                return arrayList;
            }
            object = new BufferedReader(new InputStreamReader((InputStream)new FileInputStream((File)object), string));
            while ((string = object.readLine()) != null) {
                arrayList.add(string);
            }
            object.close();
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    private static List a() {
        return a;
    }

    public static String a(bb object) {
        HttpURLConnection httpURLConnection = null;
        try {
            String string;
            Object object2 = object.getUrl();
            object2 = new URL((String)object2);
            if (Proxys.isEnabled()) {
                object = Proxys.a((bb)object);
                httpURLConnection = (HttpURLConnection)object2.openConnection((Proxy)object);
            } else if (Proxys.u()) {
                object = Proxys.a();
                httpURLConnection = (HttpURLConnection)object2.openConnection((Proxy)object);
            } else {
                httpURLConnection = (HttpURLConnection)object2.openConnection();
            }
            httpURLConnection.setConnectTimeout(GUI.b());
            httpURLConnection.setReadTimeout(GUI.b());
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
            httpURLConnection.setRequestProperty("Accept-Encoding", "*");
            httpURLConnection.setRequestProperty("Accept-Language", "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4");
            httpURLConnection.setRequestProperty("Connection", "keep-alive");
            httpURLConnection.setRequestProperty("Host", "www.pagesjaunes.fr");
            httpURLConnection.setRequestProperty("Referer", "https://www.google.com/");
            httpURLConnection.setRequestProperty("Upgrade-Insecure-Requests", "1");
            httpURLConnection.setRequestProperty("User-Agent", a.f());
            httpURLConnection.setUseCaches(false);
            object = httpURLConnection.getInputStream();
            object2 = new BufferedReader(new InputStreamReader((InputStream)object));
            StringBuilder stringBuilder = new StringBuilder();
            while ((string = object2.readLine()) != null) {
                stringBuilder.append(string);
                stringBuilder.append('\r');
            }
            object2.close();
            object.close();
            object = stringBuilder.toString();
            return object;
        }
        catch (Exception exception) {
            return "";
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }
}

