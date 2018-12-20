/*
 * Decompiled with CFR 0_132.
 */
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Proxys {
    private static boolean d = false;

    public static void main(String[] arrstring) {
        try {
            new aR();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static boolean a(bb object) {
        block14 : {
            Statement statement;
            statement = null;
            try {
                try {
                    object = object.P();
                    String string = "UPDATE " + bi.au() + " SET error=error+1 WHERE id= ?;";
                    statement = GUI.a().prepareStatement(string);
                    statement.setString(1, (String)object);
                    statement.execute();
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
        return false;
    }

    public static boolean isEnabled() {
        try {
            if (bn.Q("proxy_use").contentEquals("1")) {
                return true;
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static Proxy getProxy() {
        Proxy proxy;
        proxy = null;
        try {
            Proxy.Type type;
            Object object = Proxys.e();
            if (((String)object.get("protocol")).contains("sock")) {
                type = Proxy.Type.SOCKS;
            } else {
                ((String)object.get("protocol")).contains("http");
                type = Proxy.Type.HTTP;
            }
            String string = (String)object.get("ip");
            Integer n2 = Integer.valueOf((String)object.get("port"));
            String string2 = (String)object.get("user");
            object = (String)object.get("pass");
            if (!string2.contentEquals("")) {
                object = new be(string2, (String)object);
                Authenticator.setDefault((Authenticator)object);
            }
            proxy = new Proxy(type, new InetSocketAddress(string, (int)n2));
        }
        catch (Throwable throwable) {}
        return proxy;
    }

    private static String ae() {
        String string;
        string = "";
        try {
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("209.205.212.34:1200");
            arrayList.add("209.205.212.34:1201");
            arrayList.add("209.205.212.34:1202");
            arrayList.add("209.205.212.34:1203");
            arrayList.add("209.205.212.34:1204");
            arrayList.add("209.205.212.34:1205");
            arrayList.add("209.205.212.34:1206");
            arrayList.add("209.205.212.34:1207");
            arrayList.add("209.205.212.34:1208");
            arrayList.add("209.205.212.34:1209");
            arrayList.add("209.205.212.34:1210");
            arrayList.add("209.205.212.34:1211");
            arrayList.add("209.205.212.34:1212");
            arrayList.add("209.205.212.34:1213");
            arrayList.add("209.205.212.34:1214");
            arrayList.add("209.205.212.34:1215");
            arrayList.add("209.205.212.34:1216");
            arrayList.add("209.205.212.34:1217");
            arrayList.add("209.205.212.34:1218");
            arrayList.add("209.205.212.34:1219");
            arrayList.add("209.205.212.34:1220");
            arrayList.add("209.205.212.34:1221");
            arrayList.add("209.205.212.34:1222");
            arrayList.add("209.205.212.34:1223");
            arrayList.add("209.205.212.34:1224");
            arrayList.add("209.205.212.34:1225");
            arrayList.add("209.205.212.34:1226");
            arrayList.add("209.205.212.34:1227");
            arrayList.add("209.205.212.34:1228");
            arrayList.add("209.205.212.34:1229");
            arrayList.add("209.205.212.34:1230");
            arrayList.add("209.205.212.34:1231");
            arrayList.add("209.205.212.34:1232");
            arrayList.add("209.205.212.34:1233");
            arrayList.add("209.205.212.34:1234");
            arrayList.add("209.205.212.34:1235");
            arrayList.add("209.205.212.34:1236");
            arrayList.add("209.205.212.34:1237");
            arrayList.add("209.205.212.34:1238");
            arrayList.add("209.205.212.34:1239");
            arrayList.add("209.205.212.34:1240");
            arrayList.add("209.205.212.34:1241");
            arrayList.add("209.205.212.34:1242");
            arrayList.add("209.205.212.34:1243");
            arrayList.add("209.205.212.34:1244");
            arrayList.add("209.205.212.34:1245");
            arrayList.add("209.205.212.34:1246");
            arrayList.add("209.205.212.34:1247");
            arrayList.add("209.205.212.34:1248");
            arrayList.add("209.205.212.34:1249");
            arrayList.add("209.205.212.34:1250");
            arrayList.add("209.205.212.34:222");
            arrayList.add("209.205.212.35:222");
            arrayList.add("209.205.212.36:222");
            arrayList.add("209.205.212.37:222");
            arrayList.add("209.205.212.38:222");
            Random random = new Random();
            string = (String)arrayList.get(random.nextInt(arrayList.size()));
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static Proxy a() {
        Proxy proxy;
        proxy = null;
        try {
            Random random = new Random();
            random.nextInt(2);
            proxy = Proxys.c();
        }
        catch (Throwable throwable) {}
        return proxy;
    }

    public static Proxy b() {
        Proxy proxy;
        proxy = null;
        try {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("5.230.195.238", 8080));
        }
        catch (Throwable throwable) {}
        return proxy;
    }

    private static Proxy c() {
        Proxy proxy;
        proxy = null;
        try {
            Object object = Proxys.ae();
            String string = object.split(":")[0];
            object = Integer.valueOf(object.split(":")[1]);
            Object object2 = "user985" + "aaa".replace("aaa", "") + "d12vsw3q";
            String string2 = "fG1bCmsA" + "aaa".replace("aaa", "") + "q4Rf5vFGhjqw";
            if (!object2.contentEquals("")) {
                object2 = new bf((String)object2, string2);
                Authenticator.setDefault((Authenticator)object2);
            }
            proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(string, object.intValue()));
        }
        catch (Throwable throwable) {}
        return proxy;
    }

    public static Proxy a(bb object) {
        Proxy proxy;
        proxy = null;
        try {
            Proxy.Type type;
            System.setProperty("socksProxyVersion", "5");
            if (object.R().contentEquals("") || object.Q().contentEquals("")) {
                return Proxys.getProxy();
            }
            if (object.S().contains("sock")) {
                type = Proxy.Type.SOCKS;
            } else {
                object.S().contains("http");
                type = Proxy.Type.HTTP;
            }
            String string = object.Q();
            Integer n2 = Integer.valueOf(object.R());
            String string2 = object.T();
            object = object.U();
            if (!string2.contentEquals("")) {
                object = new bg(string2, (String)object);
                Authenticator.setDefault((Authenticator)object);
            }
            proxy = new Proxy(type, new InetSocketAddress(string, (int)n2));
        }
        catch (Throwable throwable) {}
        return proxy;
    }

    private static HashMap e() {
        HashMap<String, String> hashMap;
        block26 : {
            ResultSet resultSet;
            Statement statement;
            hashMap = new HashMap<String, String>();
            resultSet = null;
            statement = null;
            try {
                try {
                    hashMap.put("id", "0");
                    hashMap.put("created_on", "");
                    hashMap.put("protocol", "");
                    hashMap.put("ip", "");
                    hashMap.put("port", "");
                    hashMap.put("user", "");
                    hashMap.put("pass", "");
                    hashMap.put("error", "");
                    hashMap.put("locked", "");
                    Object object = Integer.valueOf(bn.Q("proxy_use"));
                    if (object.intValue() == 1) {
                        object = "SELECT * FROM " + bi.au() + " WHERE error<10 AND locked = ? ORDER BY RANDOM() LIMIT 1;";
                        statement = GUI.a().prepareStatement((String)object);
                        statement.setInt(1, 0);
                        resultSet = statement.executeQuery();
                        while (resultSet.next()) {
                            hashMap.put("id", resultSet.getString("id"));
                            hashMap.put("protocol", resultSet.getString("protocol"));
                            hashMap.put("ip", resultSet.getString("ip"));
                            hashMap.put("port", resultSet.getString("port"));
                            hashMap.put("user", resultSet.getString("user"));
                            hashMap.put("pass", resultSet.getString("pass"));
                            hashMap.put("error", resultSet.getString("error"));
                            hashMap.put("locked", resultSet.getString("locked"));
                        }
                    }
                }
                catch (Throwable throwable) {
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        }
                        catch (Throwable throwable3) {}
                    }
                    break block26;
                }
            }
            catch (Throwable throwable) {
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable4) {}
                }
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    }
                    catch (Throwable throwable5) {}
                }
                throw throwable;
            }
            if (statement != null) {
                try {
                    statement.close();
                }
                catch (Throwable throwable) {}
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                }
                catch (Throwable throwable) {}
            }
        }
        return hashMap;
    }

    public static boolean u() {
        return d;
    }

    public static void a(boolean bl2) {
        d = true;
    }
}

