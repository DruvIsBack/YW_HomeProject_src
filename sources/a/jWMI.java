/*
 * Decompiled with CFR 0_132.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class jWMI {
    public static String Y(String string) {
        String string2;
        String string3 = "";
        if (GUI.u().contentEquals("windows") && (string3 = jWMI.a(new String[]{"cmd.exe", "/C", "echo " + (string2 = new StringBuilder("%").append(string).append("%").toString())})).equals(string2)) {
            throw new Exception("Environment variable '" + string + "' does not exist!");
        }
        return string3;
    }

    public static String h(String object, String object2) {
        Object object3 = object2;
        Object object4 = "Dim oWMI : Set oWMI = GetObject(\"winmgmts:\")\r\n";
        object4 = String.valueOf(object4) + "Dim classComponent : Set classComponent = oWMI.ExecQuery(\"" + (String)object + "\")\r\n";
        object4 = String.valueOf(object4) + "Dim obj, strData\r\n";
        object4 = String.valueOf(object4) + "For Each obj in classComponent\r\n";
        object = object3.split(",");
        int n2 = 0;
        while (n2 < ((String[])object).length) {
            object4 = String.valueOf(object4) + "  strData = strData & obj." + object[n2] + " & VBCrLf\r\n";
            ++n2;
        }
        object4 = String.valueOf(object4) + "Next\r\n";
        object = object4 = String.valueOf(object4) + "wscript.echo strData\r\n";
        String string = jWMI.Y("TEMP").trim();
        string = String.valueOf(string) + File.separator + "jwmi.vbs";
        object3 = object;
        object = string;
        object4 = new FileWriter((String)object);
        object4.write((String)object3);
        object4.flush();
        object4.close();
        object = jWMI.a(new String[]{"cmd.exe", "/C", "cscript.exe", string});
        new File(string).delete();
        return object.trim();
    }

    private static String a(String[] object) {
        String string;
        object = Runtime.getRuntime().exec((String[])object);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(object.getInputStream()));
        String string2 = "";
        while ((string = bufferedReader.readLine()) != null) {
            if (string.contains("Microsoft") || string.equals("")) continue;
            string2 = String.valueOf(string2) + string + "\r\n";
        }
        object.destroy();
        return string2.trim();
    }

    public static void main(String[] arrstring) {
    }
}

