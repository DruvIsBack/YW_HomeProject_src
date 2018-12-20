/*
 * Decompiled with CFR 0_132.
 */
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SQL {
    private static Connection a = null;
    private static Connection b = null;
    private static Connection c = null;
    private static Connection d = null;
    private static Connection e = null;
    private static Connection f = null;
    private static Connection g = null;

    static {
        new java.util.ArrayList();
    }

    public static void main(String[] object) {
        block15 : {
            object = null;
            try {
                try {
                    object = DriverManager.getConnection("jdbc:sqlite:sample.db");
                    Statement statement = object.createStatement();
                    statement.setQueryTimeout(30);
                    statement.executeUpdate("drop table if exists person");
                    statement.executeUpdate("create table person (id integer, name string)");
                    statement.executeUpdate("insert into person values(1, 'leo')");
                    statement.executeUpdate("insert into person values(2, 'yui')");
                    ResultSet resultSet = statement.executeQuery("select * from person");
                    while (resultSet.next()) {
                    }
                    resultSet.close();
                    statement.close();
                }
                catch (SQLException sQLException) {
                    try {
                        if (object != null) {
                            object.close();
                            return;
                        }
                        break block15;
                    }
                    catch (SQLException sQLException2) {
                        return;
                    }
                }
            }
            catch (Throwable throwable) {
                try {
                    if (object != null) {
                        object.close();
                    }
                }
                catch (SQLException sQLException) {}
                throw throwable;
            }
            try {
                if (object != null) {
                    object.close();
                    return;
                }
            }
            catch (SQLException sQLException) {}
        }
    }

    public static void F() {
        try {
            String string = String.valueOf(GUI.A()) + bi.ao();
            if (GUI.a() == null) {
                GUI.a(SQL.a(string));
            } else if (GUI.a().isClosed()) {
                GUI.a(SQL.a(string));
            } else {
                GUI.a().isValid(30);
            }
            string = String.valueOf(GUI.A()) + bi.ak();
            if (GUI.b() == null) {
                GUI.b(SQL.a(string));
            } else if (GUI.b().isClosed()) {
                GUI.b(SQL.a(string));
            } else {
                GUI.b().isValid(30);
            }
            string = String.valueOf(GUI.A()) + bi.am();
            if (GUI.c() == null) {
                GUI.c(SQL.a(string));
            } else if (GUI.c().isClosed()) {
                GUI.c(SQL.a(string));
            } else {
                GUI.c().isValid(30);
            }
            string = String.valueOf(GUI.A()) + bi.an();
            if (GUI.d() == null) {
                GUI.d(SQL.a(string));
            } else if (GUI.d().isClosed()) {
                GUI.d(SQL.a(string));
            } else {
                GUI.d().isValid(30);
            }
            string = String.valueOf(GUI.A()) + bi.at();
            if (GUI.e() == null) {
                GUI.e(SQL.a(string));
            } else if (GUI.e().isClosed()) {
                GUI.e(SQL.a(string));
            } else {
                GUI.e().isValid(30);
            }
            string = String.valueOf(GUI.A()) + bi.as();
            if (GUI.f() == null) {
                GUI.f(SQL.a(string));
            } else if (GUI.f().isClosed()) {
                GUI.f(SQL.a(string));
            } else {
                GUI.f().isValid(30);
            }
            string = String.valueOf(GUI.A()) + bi.ar();
            if (GUI.g() == null) {
                GUI.g(SQL.a(string));
                return;
            }
            if (GUI.g().isClosed()) {
                GUI.g(SQL.a(string));
                return;
            }
            GUI.g().isValid(30);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void G() {
        try {
        }
        catch (Throwable throwable) {}
    }

    public static boolean j(String string) {
        boolean bl2;
        bl2 = false;
        try {
            if (string.contentEquals("SQLite")) {
                Class.forName("org.sqlite.JDBC").newInstance();
                bl2 = true;
            } else if (string.contentEquals("MySQL")) {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                bl2 = true;
            }
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public static void a(Connection connection, String string) {
        block14 : {
            PreparedStatement preparedStatement;
            preparedStatement = null;
            try {
                try {
                    preparedStatement = connection.prepareStatement(string);
                    preparedStatement.execute();
                }
                catch (Throwable throwable) {
                    if (preparedStatement != null) {
                        try {
                            preparedStatement.close();
                            return;
                        }
                        catch (Throwable throwable2) {
                            return;
                        }
                    }
                    break block14;
                }
            }
            catch (Throwable throwable) {
                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
                    }
                    catch (Throwable throwable3) {}
                }
                throw throwable;
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                    return;
                }
                catch (Throwable throwable) {}
            }
        }
    }

    public static Connection a(String string, String string2, String string3, String string4) {
        Connection connection;
        connection = null;
        try {
            string = "jdbc:mysql://" + string + ":3306/" + string2;
            DriverManager.setLoginTimeout(30);
            connection = DriverManager.getConnection(string, string3, string4);
        }
        catch (Throwable throwable) {}
        return connection;
    }

    public static Connection a(String string) {
        Connection connection;
        connection = null;
        try {
            File file = new File(string);
            if (file.exists() && !file.isDirectory()) {
                string = "jdbc:sqlite:" + string;
                connection = DriverManager.getConnection(string);
            } else {
                SQL.a(null, "PRAGMA main.page_size = 4096;");
                SQL.a(null, "PRAGMA main.cache_size=10000;");
                SQL.a(null, "PRAGMA main.locking_mode=EXCLUSIVE;");
                SQL.a(null, "PRAGMA main.synchronous=NORMAL;");
                SQL.a(null, "PRAGMA main.journal_mode=WAL;");
                SQL.a(null, "PRAGMA main.cache_size=5000;");
            }
        }
        catch (Throwable throwable) {}
        return connection;
    }

    public static boolean a(Connection connection, String string, String[][] arrstring, String string2) {
        boolean bl2;
        block18 : {
            Statement statement;
            bl2 = false;
            statement = null;
            try {
                try {
                    String string3 = "";
                    boolean bl3 = false;
                    Arrays.fill((Object[])arrstring, null);
                    if (arrstring.length != 1) {
                        int n2 = 0;
                        while (n2 < arrstring.length) {
                            string3 = String.valueOf(string3) + "'" + arrstring[n2][0] + "'='" + arrstring[n2][1] + "' " + string2 + ";";
                            bl3 = true;
                            ++n2;
                        }
                        string3 = string3.substring(0, string3.length() - 5);
                        if (bl3) {
                            string3 = "WHERE " + string3;
                        }
                    }
                    String string4 = "DELETE FROM " + string + " " + string3 + ";";
                    statement = connection.createStatement();
                    int n3 = statement.executeUpdate(string4);
                    if (n3 != 0 && n3 > 0) {
                        bl2 = true;
                    }
                }
                catch (Throwable throwable) {
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    break block18;
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

    public static boolean a(Connection connection, String string, String[][] arrstring) {
        boolean bl2;
        block17 : {
            Statement statement;
            bl2 = false;
            statement = null;
            try {
                try {
                    String string2 = "";
                    String string3 = "";
                    int n2 = 0;
                    while (n2 < arrstring.length) {
                        string2 = String.valueOf(string2) + arrstring[n2][0] + ",";
                        string3 = String.valueOf(string3) + "?,";
                        ++n2;
                    }
                    string2 = string2.substring(0, string2.length() - 1);
                    string3 = string3.substring(0, string3.length() - 1);
                    String string4 = "INSERT INTO " + string + " (" + string2 + ") VALUES (" + string3 + ");";
                    statement = connection.prepareStatement(string4);
                    int n3 = 0;
                    while (n3 < arrstring.length) {
                        statement.setString(n3 + 1, arrstring[n3][1]);
                        ++n3;
                    }
                    n3 = statement.executeUpdate();
                    if (n3 != 0 && n3 == 1) {
                        bl2 = true;
                    }
                }
                catch (Throwable throwable) {
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    break block17;
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

    public static boolean a(Connection connection, String string, LinkedHashMap linkedHashMap) {
        boolean bl2;
        block17 : {
            Statement statement;
            bl2 = false;
            statement = null;
            try {
                try {
                    String string2 = "?,";
                    Iterator iterator = linkedHashMap.keySet().iterator();
                    while (iterator.hasNext()) {
                        iterator.next();
                        string2 = String.valueOf(string2) + "?,";
                    }
                    string2 = string2.substring(0, string2.length() - 1);
                    string = "REPLACE INTO " + string + " VALUES (" + string2 + ");";
                    statement = connection.prepareStatement(string);
                    statement.setInt(1, 0);
                    int n2 = 2;
                    iterator = linkedHashMap.keySet().iterator();
                    while (iterator.hasNext()) {
                        string = ((String)iterator.next()).toString();
                        statement.setString(n2, (String)linkedHashMap.get(string));
                        ++n2;
                    }
                    int n3 = statement.executeUpdate();
                    if (n3 != 0 && n3 == 1) {
                        bl2 = true;
                    }
                }
                catch (Throwable throwable) {
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    break block17;
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

    public static boolean a(Connection connection, String string, String[][] arrstring, String[][] arrstring2, String string2) {
        boolean bl2;
        block18 : {
            Statement statement;
            bl2 = false;
            statement = null;
            try {
                try {
                    String string3 = "";
                    String string4 = "";
                    boolean bl3 = false;
                    int n2 = 0;
                    while (n2 < arrstring.length) {
                        string3 = String.valueOf(string3) + arrstring[n2][0] + "=?,";
                        ++n2;
                    }
                    string3 = string3.substring(0, string3.length() - 1);
                    n2 = 0;
                    while (n2 < arrstring2.length) {
                        string4 = String.valueOf(string4) + arrstring2[n2][0] + "=" + arrstring2[n2][1] + " " + string2 + " ";
                        bl3 = true;
                        ++n2;
                    }
                    string4 = string4.substring(0, string4.length() - 5);
                    if (bl3) {
                        string4 = "WHERE " + string4;
                    }
                    String string5 = "UPDATE " + string + " SET " + string3 + " " + string4 + ";";
                    statement = connection.prepareStatement(string5);
                    int n3 = 0;
                    while (n3 < arrstring.length) {
                        statement.setString(n3 + 1, arrstring[n3][1]);
                        ++n3;
                    }
                    statement.execute();
                    bl2 = true;
                }
                catch (Throwable throwable) {
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    break block18;
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

    public static List a(Connection connection, String object, String[] arrstring, String[][] var3_5, String string) {
        ArrayList arrayList;
        block30 : {
            Statement statement;
            ResultSet resultSet;
            arrayList = new ArrayList();
            statement = null;
            resultSet = null;
            try {
                try {
                    String string2 = "";
                    String string3 = "";
                    boolean bl2 = false;
                    int n2 = 0;
                    while (n2 < arrstring.length) {
                        string2 = String.valueOf(string2) + arrstring[n2] + ",";
                        ++n2;
                    }
                    string2 = string2.substring(0, string2.length() - 1);
                    n2 = 0;
                    while (n2 < ((reference)var3_5).length) {
                        if (((void)var3_5[n2]).length == 2) {
                            string3 = String.valueOf(string3) + (String)var3_5[n2][0] + "=" + (String)var3_5[n2][1] + " " + string;
                            bl2 = true;
                        }
                        ++n2;
                    }
                    if (bl2) {
                        string3 = string3.substring(0, string3.length() - 4);
                        string3 = "WHERE " + string3;
                    }
                    String string4 = "SELECT " + string2 + " FROM " + (String)((Object)object) + " " + string3 + ";";
                    statement = connection.createStatement();
                    resultSet = statement.executeQuery(string4);
                    int n3 = 0;
                    while (resultSet.next()) {
                        object = new HashMap<String, String>();
                        var3_5 = (reference)false;
                        while (var3_5 < arrstring.length) {
                            object.put(arrstring[var3_5], resultSet.getString(arrstring[var3_5]));
                            ++var3_5;
                        }
                        arrayList.add(n3, object);
                        ++n3;
                    }
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
                        }
                        catch (Throwable throwable3) {}
                    }
                    break block30;
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
                }
                catch (Throwable throwable) {}
            }
        }
        return arrayList;
    }

    public static void a(Connection connection, String string, String[] object) {
        String string2 = string;
        Object object2 = connection;
        ArrayList<String> arrayList = new ArrayList<String>();
        string2 = "pragma table_info('" + string2 + "');";
        object2 = object2.prepareStatement(string2).executeQuery();
        while (object2.next()) {
            arrayList.add(object2.getString("name"));
        }
        object2.close();
        object2 = arrayList;
        object2.removeAll(Arrays.asList(object));
        object = object2.stream().collect(Collectors.joining("],["));
        SQL.a(connection, "CREATE TABLE '" + string + "_backup' AS SELECT [" + (String)object + "] FROM '" + string + "';");
        SQL.a(connection, "DROP TABLE '" + string + "';");
        SQL.a(connection, "ALTER TABLE '" + string + "_backup' RENAME TO '" + string + "';");
    }
}

