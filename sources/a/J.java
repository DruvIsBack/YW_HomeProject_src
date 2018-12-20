/*
 * Decompiled with CFR 0_132.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public final class J {
    private static String o;
    private static String p;
    private static HashMap b;

    public J() {
        try {
            o = "table_t";
            p = "ressource_n_0.roa";
            b = new HashMap();
            J.e();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static String y(String string) {
        String string2;
        string2 = "";
        try {
            string2 = (String)b.get(string);
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private static void e() {
        block25 : {
            Statement statement;
            ResultSet resultSet;
            resultSet = null;
            statement = null;
            try {
                try {
                    SQL.j("SQLite");
                    Connection connection = SQL.a(String.valueOf(GUI.A()) + p);
                    String string = "SELECT * FROM " + o + ";";
                    statement = connection.prepareStatement(string);
                    resultSet = statement.executeQuery();
                    while (resultSet.next()) {
                        string = K.E(resultSet.getString(2));
                        b.put(string, String.valueOf(resultSet.getString(3)) + "\u00a4" + resultSet.getString(4) + "\u00a4" + resultSet.getString(5));
                    }
                    resultSet.close();
                    statement.close();
                    connection.close();
                }
                catch (Throwable throwable) {
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    if (statement != null) {
                        try {
                            statement.close();
                            return;
                        }
                        catch (Throwable throwable3) {
                            return;
                        }
                    }
                    break block25;
                }
            }
            catch (Throwable throwable) {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    }
                    catch (Throwable throwable4) {}
                }
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable5) {}
                }
                throw throwable;
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                }
                catch (Throwable throwable) {}
            }
            if (statement != null) {
                try {
                    statement.close();
                    return;
                }
                catch (Throwable throwable) {}
            }
        }
    }
}

