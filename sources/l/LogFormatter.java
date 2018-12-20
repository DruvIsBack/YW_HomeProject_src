/*
 * Decompiled with CFR 0_132.
 */
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

final class LogFormatter
extends Formatter {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    LogFormatter() {
    }

    @Override
    public String format(LogRecord record) {
        String result = "";
        try {
            Date actuelle = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String dat = dateFormat.format(actuelle);
            StringBuilder sb = new StringBuilder();
            sb.append(dat).append(" # ").append(record.getLevel().getLocalizedName()).append(" ").append(this.formatMessage(record)).append(LINE_SEPARATOR);
            if (record.getThrown() != null) {
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                record.getThrown().printStackTrace(pw);
                pw.close();
                sb.append(sw.toString());
            }
            result = sb.toString();
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
        return result;
    }
}

