/*
 * Decompiled with CFR 0_132.
 */
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aS {
    private static char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private IvParameterSpec a;
    private SecretKeySpec a;
    private Cipher a;

    public aS(String object, String string) {
        Object object2 = new IvParameterSpec(object.getBytes());
        object = this;
        this.a = object2;
        object2 = new SecretKeySpec(string.getBytes(), "AES");
        object = this;
        this.a = object2;
        try {
            object2 = Cipher.getInstance("AES/CBC/NoPadding");
            object = this;
            this.a = object2;
            return;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return;
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            return;
        }
    }

    public final byte[] b(String arrby) {
        if (arrby == null || arrby.length() == 0) {
            throw new Exception("Empty string");
        }
        try {
            aS aS2 = this;
            aS aS3 = aS2;
            aS aS4 = this;
            aS3 = aS4;
            aS3 = this;
            aS2.a.init(1, (Key)aS4.a, aS3.a);
            aS3 = this;
            arrby = aS3.a.doFinal(aS.H((String)arrby).getBytes());
        }
        catch (Exception exception) {
            throw new Exception("[encrypt] " + exception.getMessage());
        }
        return arrby;
    }

    public final byte[] c(String arrby) {
        if (arrby == null || arrby.length() == 0) {
            throw new Exception("Empty string");
        }
        try {
            aS aS2 = this;
            aS aS3 = aS2;
            aS aS4 = this;
            aS3 = aS4;
            aS3 = this;
            aS2.a.init(2, (Key)aS4.a, aS3.a);
            aS3 = this;
            arrby = aS3.a.doFinal(aS.d((String)arrby));
            if (arrby.length > 0) {
                int n2 = 0;
                int n3 = arrby.length - 1;
                while (n3 >= 0) {
                    if (arrby[n3] == 0) {
                        ++n2;
                    }
                    --n3;
                }
                if (n2 > 0) {
                    byte[] arrby2 = new byte[arrby.length - n2];
                    System.arraycopy(arrby, 0, arrby2, 0, arrby.length - n2);
                    arrby = arrby2;
                }
            }
        }
        catch (Exception exception) {
            throw new Exception("[decrypt] " + exception.getMessage());
        }
        return arrby;
    }

    public static String b(byte[] arrby) {
        char[] arrc = new char[2 * arrby.length];
        int n2 = 0;
        while (n2 < arrby.length) {
            arrc[2 * n2] = a[(arrby[n2] & 240) >>> 4];
            arrc[2 * n2 + 1] = a[arrby[n2] & 15];
            ++n2;
        }
        return new String(arrc);
    }

    private static byte[] d(String string) {
        if (string == null) {
            return null;
        }
        if (string.length() < 2) {
            return null;
        }
        int n2 = string.length() / 2;
        byte[] arrby = new byte[n2];
        int n3 = 0;
        while (n3 < n2) {
            arrby[n3] = (byte)Integer.parseInt(string.substring(n3 << 1, (n3 << 1) + 2), 16);
            ++n3;
        }
        return arrby;
    }

    private static String H(String string) {
        int n2 = string.length() % 16;
        n2 = 16 - n2;
        int n3 = 0;
        while (n3 < n2) {
            string = String.valueOf(string) + '\u0000';
            ++n3;
        }
        return string;
    }
}

