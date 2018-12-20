/*
 * Decompiled with CFR 0_132.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

public final class aM {
    private static HashMap u;
    private static String ac;

    static {
        ac = "l.roa";
    }

    public aM(String string, String string2) {
        try {
            HashMap hashMap;
            u = hashMap = new HashMap();
            aM.f(string, string2);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static String G(String string) {
        String string2;
        string2 = "";
        try {
            string2 = u == null ? (GUI.a() == Level.FINEST ? "null" : "") : (u.get(string) == null ? (GUI.a() == Level.FINEST ? "null" : "") : (String)u.get(string));
        }
        catch (Throwable throwable) {}
        return string2;
    }

    public static String[] b() {
        String[] arrstring = new String[]{"Deutsch", "English", "Espa\u00f1ol", "Fran\u00e7ais", "Italiano", "Portugu\u00eas_br", "Portugu\u00eas_pt", "T\u00fcrk\u00e7e", "\u0420\u0443\u0441\u0441\u043a\u0438\u0439", "\u0627\u0644\u0644\u063a\u0629 \u0627\u0644\u0639\u0631\u0628\u064a\u0629", "\u0939\u093f\u0902\u0926\u0940", "\u09ac\u09be\u0982\u09b2\u09be", "\u4e2d\u6587", "\u65e5\u672c\u8a9e", "\u7e41\u9ad4\u4e2d\u6587"};
        return arrstring;
    }

    public static String[] c() {
        String[] arrstring;
        arrstring = new String[]{""};
        try {
            ArrayList<String> arrayList = new ArrayList<String>();
            for (Map.Entry entry : u.entrySet()) {
                String object = (String)entry.getKey();
                if (!object.startsWith("word_") || object.contentEquals("word_none")) continue;
                arrayList.add(object.substring(5, object.length()));
            }
            Collections.sort(arrayList);
            arrayList.add(0, "none");
            arrstring = new String[arrayList.size()];
            arrayList.toArray(arrstring);
        }
        catch (Throwable throwable) {}
        return arrstring;
    }

    public static Integer a(String string) {
        Integer n2;
        n2 = 0;
        try {
            String[] arrstring = aM.c();
            int n3 = 0;
            while (n3 < arrstring.length) {
                if (arrstring[n3].toLowerCase().contentEquals(string.toLowerCase())) {
                    return n3;
                }
                ++n3;
            }
            n2 = Integer.valueOf(string);
        }
        catch (Throwable throwable) {}
        return n2;
    }

    public static void f(String string, String string2) {
        block22 : {
            ResultSet resultSet;
            resultSet = null;
            try {
                try {
                    Object object;
                    boolean bl2 = false;
                    SQL.j("SQLite");
                    Connection connection = SQL.a(String.valueOf(GUI.x()) + ac);
                    if (string.startsWith("IQUALIF")) {
                        object = "SELECT text,[" + string + "] FROM '" + string2 + "';";
                        object = connection.prepareStatement((String)object);
                        resultSet = object.executeQuery();
                        while (resultSet.next()) {
                            u.put(resultSet.getString(1), resultSet.getString(2));
                            bl2 = true;
                        }
                        resultSet.close();
                        object.close();
                        if (!bl2) {
                            object = "SELECT text,[" + string + "] FROM English;";
                            object = connection.prepareStatement((String)object);
                            resultSet = object.executeQuery();
                            while (resultSet.next()) {
                                u.put(resultSet.getString(1), resultSet.getString(2));
                                bl2 = true;
                            }
                            resultSet.close();
                            object.close();
                            string = aM.G("dlg_defaultlanguage");
                            if (string.contentEquals("null") || string.contentEquals("")) {
                                string = "<html>Cannot load language module, loading default language, please restart IQUALIF or contact us to fix it<br />Impossible de charger le module de langue, chargement de la langue par d\u00e9faut, veuillez red\u00e9marrer IQUALIF ou contactez-nous pour corriger ce probl\u00e8me</html>";
                            }
                            GUI.d(string, aM.G("dlg_start"));
                        }
                    }
                    if (!bl2) {
                        object = "SELECT text,[IQUALIF France White] FROM '" + string2 + "';";
                        object = connection.prepareStatement((String)object);
                        resultSet = object.executeQuery();
                        while (resultSet.next()) {
                            u.put(resultSet.getString(1), resultSet.getString(2));
                        }
                        resultSet.close();
                        object.close();
                        string = aM.G("dlg_defaultlanguage");
                        if (string.contentEquals("null") || string.contentEquals("")) {
                            string = "<html>Try to uninstall and reinstall software. Cannot load language module, loading default language, please restart IQUALIF or contact us to fix it<br />Essayer de d\u00e9sinstaller et r\u00e9installer le logiciel. Impossible de charger le module de langue, chargement de la langue par d\u00e9faut, veuillez red\u00e9marrer IQUALIF ou contactez-nous pour une aide</html>";
                        }
                        GUI.d(string, aM.G("dlg_start"));
                    }
                    connection.close();
                }
                catch (Throwable throwable) {
                    String string3 = "<html>Try to uninstall and reinstall software. Cannot load language module, loading default language, please restart IQUALIF or contact us to fix it<br />Essayer de d\u00e9sinstaller et r\u00e9installer le logiciel. Impossible de charger le module de langue, chargement de la langue par d\u00e9faut, veuillez red\u00e9marrer IQUALIF ou contactez-nous pour une aide</html>";
                    GUI.d("<html>Try to uninstall and reinstall software. Cannot load language module, loading default language, please restart IQUALIF or contact us to fix it<br />Essayer de d\u00e9sinstaller et r\u00e9installer le logiciel. Impossible de charger le module de langue, chargement de la langue par d\u00e9faut, veuillez red\u00e9marrer IQUALIF ou contactez-nous pour une aide</html>", "Information");
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                            return;
                        }
                        catch (Throwable throwable2) {
                            return;
                        }
                    }
                    break block22;
                }
            }
            catch (Throwable throwable) {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    }
                    catch (Throwable throwable3) {}
                }
                throw throwable;
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                    return;
                }
                catch (Throwable throwable) {}
            }
        }
    }

    public static String N() {
        return ac;
    }
}

