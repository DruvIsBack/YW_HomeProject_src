/*
 * Decompiled with CFR 0_132.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class bn {
    private static String V = "table_t";
    private static String W = "s.roa";
    private static HashMap b;

    public bn(String string) {
        try {
            HashMap hashMap;
            b = hashMap = new HashMap();
            bn.x(string);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static String Q(String string) {
        String string2;
        string2 = "";
        try {
            string2 = (String)b.get(string.toLowerCase());
            b.get(string.toLowerCase());
        }
        catch (Throwable throwable) {}
        return string2;
    }

    public static List i() {
        ArrayList<String> arrayList;
        block16 : {
            ResultSet resultSet;
            arrayList = new ArrayList<String>();
            resultSet = null;
            try {
                try {
                    Connection connection = SQL.a(String.valueOf(GUI.x()) + W);
                    Object object = "PRAGMA table_info(" + V + ");";
                    object = connection.prepareStatement((String)object);
                    resultSet = object.executeQuery();
                    while (resultSet.next()) {
                        if (!resultSet.getString(2).startsWith("IQUALIF")) continue;
                        arrayList.add(resultSet.getString(2));
                    }
                    Collections.sort(arrayList);
                    int n2 = 0;
                    while (n2 < arrayList.size()) {
                        ++n2;
                    }
                    resultSet.close();
                    object.close();
                    connection.close();
                }
                catch (Throwable throwable) {
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    break block16;
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
                }
                catch (Throwable throwable) {}
            }
        }
        return arrayList;
    }

    public static void x(String object) {
        block19 : {
            ResultSet resultSet;
            resultSet = null;
            try {
                try {
                    String string;
                    boolean bl2 = false;
                    SQL.j("SQLite");
                    Connection connection = SQL.a(String.valueOf(GUI.x()) + W);
                    if (object.startsWith("IQUALIF")) {
                        object = "SELECT text,[" + (String)object + "] FROM " + V + ";";
                        object = connection.prepareStatement((String)object);
                        resultSet = object.executeQuery();
                        while (resultSet.next()) {
                            string = resultSet.getString(2);
                            if (string == null) continue;
                            String string2 = K.E(string);
                            b.put(resultSet.getString(1), string2);
                            bl2 = true;
                        }
                        resultSet.close();
                        object.close();
                    }
                    if (!bl2) {
                        object = "SELECT text,value1 FROM " + V + ";";
                        object = connection.prepareStatement((String)object);
                        resultSet = object.executeQuery();
                        while (resultSet.next()) {
                            string = K.E(resultSet.getString(3));
                            b.put(resultSet.getString(2), string);
                        }
                        resultSet.close();
                        object.close();
                        string = aM.G("dlg_defaultsetting");
                        if (string.contentEquals("null") || string.contentEquals("")) {
                            string = "<html>Try to uninstall and reinstall software. Cannot load settings, loading default settings, please restart IQUALIF or contact us to fix it<br />Essayer de d\u00e9sinstaller et r\u00e9installer le logiciel. Impossible de charger les param\u00e8tres, chargement des param\u00e8tres par d\u00e9faut, veuillez red\u00e9marrer IQUALIF ou contactez-nous pour une aide</html>";
                        }
                        GUI.d(string, aM.G("dlg_start"));
                    }
                    connection.close();
                }
                catch (Throwable throwable) {
                    String string = "<html>Try to uninstall and reinstall software. Cannot load settings, loading default settings, please restart IQUALIF or contact us to fix it<br />Essayer de d\u00e9sinstaller et r\u00e9installer le logiciel. Impossible de charger les param\u00e8tres, chargement des param\u00e8tres par d\u00e9faut, veuillez red\u00e9marrer IQUALIF ou contactez-nous pour une aide</html>";
                    GUI.d("<html>Try to uninstall and reinstall software. Cannot load settings, loading default settings, please restart IQUALIF or contact us to fix it<br />Essayer de d\u00e9sinstaller et r\u00e9installer le logiciel. Impossible de charger les param\u00e8tres, chargement des param\u00e8tres par d\u00e9faut, veuillez red\u00e9marrer IQUALIF ou contactez-nous pour une aide</html>", "Information");
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                            return;
                        }
                        catch (Throwable throwable2) {
                            return;
                        }
                    }
                    break block19;
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

    public static boolean d(String object, String string, String string2) {
        boolean bl2;
        block14 : {
            Connection connection;
            bl2 = false;
            connection = null;
            try {
                try {
                    SQL.j("SQLite");
                    connection = SQL.a(String.valueOf(GUI.x()) + W);
                    object = "UPDATE " + V + " SET [" + (String)object + "]=? WHERE text=?;";
                    String string3 = K.F(string2);
                    object = connection.prepareStatement((String)object);
                    object.setString(1, string3);
                    object.setString(2, string.toLowerCase());
                    object.execute();
                    bl2 = true;
                    object.close();
                    connection.close();
                    b.put(string.toLowerCase(), string2);
                }
                catch (Throwable throwable) {
                    if (connection != null) {
                        try {
                            connection.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    break block14;
                }
            }
            catch (Throwable throwable) {
                if (connection != null) {
                    try {
                        connection.close();
                    }
                    catch (Throwable throwable3) {}
                }
                throw throwable;
            }
            if (connection != null) {
                try {
                    connection.close();
                }
                catch (Throwable throwable) {}
            }
        }
        return bl2;
    }

    public static String H() {
        return V;
    }

    public static String I() {
        return W;
    }
}

