/*
 * Decompiled with CFR 0_132.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public final class aH {
    private static String V = "table_t";
    private static String W = "h.roa";
    private static HashMap b;

    public aH(String string) {
        try {
            HashMap hashMap;
            b = hashMap = new HashMap();
            aH.x(string);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static String D(String string) {
        String string2;
        string2 = "";
        try {
            string2 = (String)b.get(string);
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private static void x(String object) {
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
                            string = "<html>Try to uninstall and reinstall software. Cannot load settings history, loading default settings, please restart IQUALIF or contact us to fix it<br />Essayer de d\u00e9sinstaller et r\u00e9installer le logiciel. Impossible de charger l'historique des param\u00e8tres, chargement des param\u00e8tres par d\u00e9faut, veuillez red\u00e9marrer IQUALIF ou contactez-nous pour une aide</html>";
                        }
                        GUI.d(string, aM.G("dlg_start"));
                    }
                    connection.close();
                }
                catch (Throwable throwable) {
                    String string = "<html>Try to uninstall and reinstall software. Cannot load settings history, loading default settings, please restart IQUALIF or contact us to fix it<br />Essayer de d\u00e9sinstaller et r\u00e9installer le logiciel. Impossible de charger l'historique des param\u00e8tres, chargement des param\u00e8tres par d\u00e9faut, veuillez red\u00e9marrer IQUALIF ou contactez-nous pour une aide</html>";
                    GUI.d("<html>Try to uninstall and reinstall software. Cannot load settings history, loading default settings, please restart IQUALIF or contact us to fix it<br />Essayer de d\u00e9sinstaller et r\u00e9installer le logiciel. Impossible de charger l'historique des param\u00e8tres, chargement des param\u00e8tres par d\u00e9faut, veuillez red\u00e9marrer IQUALIF ou contactez-nous pour une aide</html>", "Information");
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

    public static boolean b(String string, String string2, String string3) {
        boolean bl2;
        block14 : {
            Statement statement;
            bl2 = false;
            statement = null;
            try {
                try {
                    SQL.j("SQLite");
                    Connection connection = SQL.a(String.valueOf(GUI.x()) + W);
                    string = "UPDATE " + V + " SET [" + string + "]=? WHERE text=?;";
                    String string4 = K.F(string3);
                    statement = connection.prepareStatement(string);
                    statement.setString(1, string4);
                    statement.setString(2, string2);
                    statement.execute();
                    bl2 = true;
                    statement.close();
                    connection.close();
                    b.put(string2, string3);
                }
                catch (Throwable throwable) {
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    break block14;
                }
            }
            catch (Throwable throwable) {
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable3) {}
                }
                throw throwable;
            }
            if (statement != null) {
                try {
                    statement.close();
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

