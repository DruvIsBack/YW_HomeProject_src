/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  javax.mail.Authenticator
 *  javax.mail.Session
 *  org.apache.commons.mail.DefaultAuthenticator
 *  org.apache.commons.mail.Email
 *  org.apache.commons.mail.EmailAttachment
 *  org.apache.commons.mail.MultiPartEmail
 */
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Session;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

public final class aI {
    private static List j;
    private static List k;

    public aI() {
        try {
            ArrayList arrayList;
            j = arrayList = new ArrayList();
            arrayList = new ArrayList();
            k = arrayList;
            aI.C();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static void C() {
        block15 : {
            ResultSet resultSet;
            resultSet = null;
            try {
                try {
                    j.clear();
                    SQL.j("SQLite");
                    Connection connection = SQL.a(String.valueOf(GUI.A()) + bi.ap());
                    Object object = "SELECT b FROM " + bi.ay() + ";";
                    object = connection.prepareStatement((String)object);
                    resultSet = object.executeQuery();
                    while (resultSet.next()) {
                        j.add(resultSet.getString(1));
                    }
                    resultSet.close();
                    object.close();
                    connection.close();
                }
                catch (Throwable throwable) {
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                            return;
                        }
                        catch (Throwable throwable2) {
                            return;
                        }
                    }
                    break block15;
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

    public static boolean q() {
        boolean bl2;
        block14 : {
            Statement statement;
            bl2 = false;
            statement = null;
            try {
                try {
                    j.clear();
                    SQL.j("SQLite");
                    Connection connection = SQL.a(String.valueOf(GUI.A()) + bi.ap());
                    String string = "DELETE FROM " + bi.ay() + ";";
                    statement = connection.prepareStatement(string);
                    statement.executeUpdate();
                    bl2 = true;
                    statement.close();
                    connection.close();
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(File object) {
        Statement statement;
        boolean bl2;
        block15 : {
            bl2 = false;
            statement = null;
            if (GUI.D().contains("Yellow")) break block15;
            return false;
        }
        try {
            try {
                object = a.a((File)object);
                Connection connection = SQL.a(String.valueOf(GUI.A()) + bi.ap());
                int n2 = 0;
                while (n2 < object.size()) {
                    String string = (String)object.get(n2);
                    string.replace(",", ";");
                    if (string.contains(";")) {
                        string = string.split(";")[0];
                    }
                    if (string.contains("@")) {
                        String string2 = "INSERT OR IGNORE INTO " + bi.ay() + " (b) VALUES(?);";
                        statement = connection.prepareStatement(string2);
                        statement.setString(1, string);
                        int n3 = statement.executeUpdate();
                        if (n3 == 1) {
                            j.add(string);
                        }
                    }
                    ++n2;
                }
                bl2 = true;
                statement.close();
                connection.close();
            }
            catch (Throwable throwable) {
                if (statement == null) return bl2;
                try {
                    statement.close();
                    return bl2;
                }
                catch (Throwable throwable2) {}
                return bl2;
            }
        }
        catch (Throwable throwable) {
            if (statement == null) throw throwable;
            try {
                statement.close();
                throw throwable;
            }
            catch (Throwable throwable3) {}
            throw throwable;
        }
        if (statement == null) return bl2;
        try {
            statement.close();
            return bl2;
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public static boolean a(String string, JLabel jLabel) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("###");
            int n2 = 0;
            while (n2 < j.size()) {
                Object object = String.valueOf((String)j.get(n2)) + "\n";
                a.a(string, (String)object, "WINDOWS-1252");
                object = jLabel;
                int n3 = n2++;
                DecimalFormat decimalFormat2 = decimalFormat;
                SwingUtilities.invokeLater(new aJ((JLabel)object, decimalFormat2, n3));
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static Integer c() {
        Integer n2;
        n2 = 0;
        try {
            n2 = j.size();
        }
        catch (Throwable throwable) {}
        return n2;
    }

    public static String a(String string, String arrstring, String string2, String var3_4, String string3, String string4, String string5, String[] arrstring2, String[] arrstring3, String[] arrstring4, String string6, String string7, String string8, boolean bl2) {
        String string9;
        string9 = "false";
        try {
            if (k.size() > 1000) {
                k.remove(1000);
            }
            MultiPartEmail multiPartEmail = new MultiPartEmail();
            multiPartEmail.setHostName(string2);
            multiPartEmail.setSmtpPort(Integer.valueOf(var3_4).intValue());
            if (arrstring.contentEquals("1")) {
                multiPartEmail.setAuthenticator((Authenticator)new DefaultAuthenticator(string3, string4));
            }
            if (string.contentEquals("1")) {
                multiPartEmail.setSSLOnConnect(true);
            } else if (string.contentEquals("2")) {
                multiPartEmail.setStartTLSEnabled(true);
            }
            multiPartEmail.setFrom(string5);
            multiPartEmail.setSubject(string6);
            multiPartEmail.setMsg(string7);
            if (!string8.contentEquals("empty")) {
                string3 = new EmailAttachment();
                string3.setPath(string8);
                string3.setDisposition("attachment");
                multiPartEmail.attach((EmailAttachment)string3);
            }
            multiPartEmail.setDebug(true);
            multiPartEmail.getMailSession().getProperties().put("mail.smtp.host", string2);
            multiPartEmail.getMailSession().getProperties().put("mail.smtp.port", var3_4);
            multiPartEmail.getMailSession().getProperties().put("mail.smtp.socketFactory.port", var3_4);
            if (arrstring.contentEquals("1")) {
                multiPartEmail.getMailSession().getProperties().put("mail.smtp.auth", true);
            }
            multiPartEmail.getMailSession().getProperties().put("mail.debug", true);
            if (string.contentEquals("1")) {
                multiPartEmail.getMailSession().getProperties().put("mail.smtp.ssl.enable", true);
            } else if (string.contentEquals("2")) {
                multiPartEmail.getMailSession().getProperties().put("mail.smtp.starttls.enable", true);
            }
            boolean bl3 = false;
            int n2 = 0;
            while (n2 < arrstring2.length) {
                if (arrstring2[n2].contains("@")) {
                    arrstring = new String[]{"proximedia.be", "pagesjaunes", "pagesblanches", "yellowpages", "whitepages", "pagesdor", "@local.ch", "@yellow.lu"};
                    string2 = (String)false;
                    var3_4 = (reference)false;
                    while (var3_4 < arrstring.length) {
                        if (arrstring2[n2].contains(arrstring[var3_4])) {
                            string2 = (String)true;
                            break;
                        }
                        ++var3_4;
                    }
                    if (j.contains(arrstring2[n2])) {
                        string2 = (String)true;
                    }
                    if (string2 != false) {
                        string9 = "blacklist detected";
                    } else if (bl2) {
                        if (k.contains(arrstring2[n2])) {
                            k.remove(k.indexOf(arrstring2[n2]));
                            k.add(0, arrstring2[n2]);
                            string9 = "doublon detected";
                        } else {
                            multiPartEmail.addTo(arrstring2[n2]);
                            bl3 = true;
                            k.add(0, arrstring2[n2]);
                        }
                    } else {
                        multiPartEmail.addTo(arrstring2[n2]);
                        bl3 = true;
                    }
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < arrstring3.length) {
                if (arrstring3[n2].contains("@")) {
                    multiPartEmail.addCc(arrstring3[n2]);
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < arrstring4.length) {
                if (arrstring4[n2].contains("@")) {
                    multiPartEmail.addBcc(arrstring4[n2]);
                }
                ++n2;
            }
            if (bl3) {
                string9 = multiPartEmail.send();
            }
        }
        catch (Throwable throwable) {}
        return string9;
    }

    public static String a(String string, String var1_1, String string2, String string3, String string4, String string5, String arrstring, String[] arrstring2, String[] arrstring3, String[] arrstring4, String string6, String string7, List list, boolean bl2) {
        String string8;
        string8 = "false";
        try {
            if (k.size() > 1000) {
                k.remove(1000);
            }
            MultiPartEmail multiPartEmail = new MultiPartEmail();
            multiPartEmail.setHostName(string2);
            multiPartEmail.setSmtpPort(Integer.valueOf(string3).intValue());
            if (var1_1.contentEquals("1")) {
                multiPartEmail.setAuthenticator((Authenticator)new DefaultAuthenticator(string4, string5));
            }
            if (string.contentEquals("1")) {
                multiPartEmail.setSSLOnConnect(true);
            } else if (string.contentEquals("2")) {
                multiPartEmail.setStartTLSEnabled(true);
            }
            multiPartEmail.setFrom((String)arrstring);
            multiPartEmail.setSubject(string6);
            multiPartEmail.setMsg(string7);
            int n2 = 0;
            while (n2 < list.size()) {
                string5 = (String)list.get(n2);
                arrstring = new String[]();
                arrstring.setPath(string5);
                arrstring.setDisposition("attachment");
                multiPartEmail.attach((EmailAttachment)arrstring);
                ++n2;
            }
            multiPartEmail.setDebug(true);
            multiPartEmail.getMailSession().getProperties().put("mail.smtp.host", string2);
            multiPartEmail.getMailSession().getProperties().put("mail.smtp.port", string3);
            multiPartEmail.getMailSession().getProperties().put("mail.smtp.socketFactory.port", string3);
            if (var1_1.contentEquals("1")) {
                multiPartEmail.getMailSession().getProperties().put("mail.smtp.auth", true);
            }
            multiPartEmail.getMailSession().getProperties().put("mail.debug", true);
            if (string.contentEquals("1")) {
                multiPartEmail.getMailSession().getProperties().put("mail.smtp.ssl.enable", true);
            } else if (string.contentEquals("2")) {
                multiPartEmail.getMailSession().getProperties().put("mail.smtp.starttls.enable", true);
            }
            n2 = 0;
            int n3 = 0;
            while (n3 < arrstring2.length) {
                if (arrstring2[n3].contains("@")) {
                    arrstring = new String[]{"proximedia.be", "pagesjaunes", "pagesblanches", "yellowpages", "whitepages", "pagesdor", "@local.ch", "@yellow.lu"};
                    string = (String)false;
                    var1_1 = (reference)false;
                    while (var1_1 < arrstring.length) {
                        if (arrstring2[n3].contains(arrstring[var1_1])) {
                            string = (String)true;
                            break;
                        }
                        ++var1_1;
                    }
                    if (j.contains(arrstring2[n3])) {
                        string = (String)true;
                    }
                    if (string != false) {
                        string8 = "blacklist detected";
                    } else {
                        multiPartEmail.addTo(arrstring2[n3]);
                        n2 = 1;
                    }
                }
                ++n3;
            }
            n3 = 0;
            while (n3 < arrstring3.length) {
                if (arrstring3[n3].contains("@")) {
                    multiPartEmail.addCc(arrstring3[n3]);
                }
                ++n3;
            }
            n3 = 0;
            while (n3 < arrstring4.length) {
                if (arrstring4[n3].contains("@")) {
                    multiPartEmail.addBcc(arrstring4[n3]);
                }
                ++n3;
            }
            if (n2 != 0) {
                string8 = multiPartEmail.send();
            }
        }
        catch (Throwable throwable) {}
        return string8;
    }

    public static List d() {
        return j;
    }
}

