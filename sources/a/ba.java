/*
 * Decompiled with CFR 0_132.
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import javax.imageio.ImageIO;

public final class ba {
    private static int[][] a;
    private static int[][] b;
    private static int[][] c;
    private static int[][] d;
    private static int[][] e;
    private static int[][] f;
    private static int[][] g;
    private static int[][] h;
    private static int[][] i;
    private static int[][] j;
    private static int[][] k;

    static {
        int[][] arrarrn = new int[6][];
        arrarrn[0] = new int[9];
        int[] arrn = new int[9];
        arrn[0] = 1;
        arrn[1] = 1;
        arrn[8] = 1;
        arrarrn[1] = arrn;
        arrarrn[2] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        arrarrn[3] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arrn2 = new int[9];
        arrn2[8] = 1;
        arrarrn[4] = arrn2;
        arrarrn[5] = new int[9];
        b = arrarrn;
        int[][] arrarrn2 = new int[6][];
        int[] arrn3 = new int[9];
        arrn3[0] = 1;
        arrn3[8] = 1;
        arrarrn2[0] = arrn3;
        int[] arrn4 = new int[9];
        arrn4[0] = 1;
        arrn4[6] = 1;
        arrn4[7] = 1;
        arrn4[8] = 1;
        arrarrn2[1] = arrn4;
        int[] arrn5 = new int[9];
        arrn5[0] = 1;
        arrn5[4] = 1;
        arrn5[5] = 1;
        arrn5[6] = 1;
        arrn5[7] = 1;
        arrn5[8] = 1;
        arrarrn2[2] = arrn5;
        int[] arrn6 = new int[9];
        arrn6[0] = 1;
        arrn6[2] = 1;
        arrn6[3] = 1;
        arrn6[4] = 1;
        arrn6[5] = 1;
        arrn6[6] = 1;
        arrarrn2[3] = arrn6;
        int[] arrn7 = new int[9];
        arrn7[0] = 1;
        arrn7[1] = 1;
        arrn7[2] = 1;
        arrn7[3] = 1;
        arrn7[4] = 1;
        arrn7[5] = 1;
        arrarrn2[4] = arrn7;
        arrarrn2[5] = new int[9];
        c = arrarrn2;
        int[][] arrarrn3 = new int[6][];
        arrarrn3[0] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        arrarrn3[1] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arrn8 = new int[9];
        arrn8[0] = 1;
        arrn8[1] = 1;
        arrn8[3] = 1;
        arrn8[4] = 1;
        arrn8[7] = 1;
        arrn8[8] = 1;
        arrarrn3[2] = arrn8;
        int[] arrn9 = new int[9];
        arrn9[0] = 1;
        arrn9[1] = 1;
        arrn9[3] = 1;
        arrn9[4] = 1;
        arrn9[5] = 1;
        arrn9[7] = 1;
        arrn9[8] = 1;
        arrarrn3[3] = arrn9;
        arrarrn3[4] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        arrarrn3[5] = new int[9];
        d = arrarrn3;
        int[][] arrarrn4 = new int[6][];
        arrarrn4[0] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arrn10 = new int[9];
        arrn10[0] = 1;
        arrn10[1] = 1;
        arrn10[2] = 1;
        arrn10[3] = 1;
        arrn10[5] = 1;
        arrn10[6] = 1;
        arrn10[7] = 1;
        arrn10[8] = 1;
        arrarrn4[1] = arrn10;
        int[] arrn11 = new int[9];
        arrn11[0] = 1;
        arrn11[1] = 1;
        arrn11[7] = 1;
        arrn11[8] = 1;
        arrarrn4[2] = arrn11;
        int[] arrn12 = new int[9];
        arrn12[0] = 1;
        arrn12[1] = 1;
        arrn12[7] = 1;
        arrn12[8] = 1;
        arrarrn4[3] = arrn12;
        arrarrn4[4] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        arrarrn4[5] = new int[9];
        e = arrarrn4;
        int[][] arrarrn5 = new int[6][];
        int[] arrn13 = new int[9];
        arrn13[0] = 1;
        arrn13[1] = 1;
        arrn13[7] = 1;
        arrn13[8] = 1;
        arrarrn5[0] = arrn13;
        int[] arrn14 = new int[9];
        arrn14[0] = 1;
        arrn14[1] = 1;
        arrn14[6] = 1;
        arrn14[7] = 1;
        arrn14[8] = 1;
        arrarrn5[1] = arrn14;
        int[] arrn15 = new int[9];
        arrn15[0] = 1;
        arrn15[1] = 1;
        arrn15[5] = 1;
        arrn15[6] = 1;
        arrn15[7] = 1;
        arrn15[8] = 1;
        arrarrn5[2] = arrn15;
        int[] arrn16 = new int[9];
        arrn16[0] = 1;
        arrn16[1] = 1;
        arrn16[4] = 1;
        arrn16[5] = 1;
        arrn16[6] = 1;
        arrn16[8] = 1;
        arrarrn5[3] = arrn16;
        int[] arrn17 = new int[9];
        arrn17[0] = 1;
        arrn17[1] = 1;
        arrn17[2] = 1;
        arrn17[3] = 1;
        arrn17[4] = 1;
        arrn17[5] = 1;
        arrn17[8] = 1;
        arrarrn5[4] = arrn17;
        arrarrn5[5] = new int[9];
        f = arrarrn5;
        int[][] arrarrn6 = new int[6][];
        int[] arrn18 = new int[9];
        arrn18[3] = 1;
        arrn18[4] = 1;
        arrn18[5] = 1;
        arrarrn6[0] = arrn18;
        int[] arrn19 = new int[9];
        arrn19[2] = 1;
        arrn19[3] = 1;
        arrn19[4] = 1;
        arrn19[5] = 1;
        arrarrn6[1] = arrn19;
        int[] arrn20 = new int[9];
        arrn20[1] = 1;
        arrn20[2] = 1;
        arrn20[3] = 1;
        arrn20[5] = 1;
        arrarrn6[2] = arrn20;
        arrarrn6[3] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        arrarrn6[4] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        arrarrn6[5] = new int[9];
        g = arrarrn6;
        int[][] arrarrn7 = new int[6][];
        int[] arrn21 = new int[9];
        arrn21[0] = 1;
        arrn21[1] = 1;
        arrn21[7] = 1;
        arrn21[8] = 1;
        arrarrn7[0] = arrn21;
        int[] arrn22 = new int[9];
        arrn22[0] = 1;
        arrn22[1] = 1;
        arrn22[7] = 1;
        arrn22[8] = 1;
        arrarrn7[1] = arrn22;
        int[] arrn23 = new int[9];
        arrn23[0] = 1;
        arrn23[1] = 1;
        arrn23[3] = 1;
        arrn23[7] = 1;
        arrn23[8] = 1;
        arrarrn7[2] = arrn23;
        int[] arrn24 = new int[9];
        arrn24[0] = 1;
        arrn24[1] = 1;
        arrn24[2] = 1;
        arrn24[3] = 1;
        arrn24[4] = 1;
        arrn24[7] = 1;
        arrn24[8] = 1;
        arrarrn7[3] = arrn24;
        arrarrn7[4] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        arrarrn7[5] = new int[9];
        h = arrarrn7;
        int[][] arrarrn8 = new int[6][];
        int[] arrn25 = new int[9];
        arrn25[0] = 1;
        arrn25[1] = 1;
        arrn25[2] = 1;
        arrn25[3] = 1;
        arrn25[4] = 1;
        arrn25[5] = 1;
        arrn25[7] = 1;
        arrn25[8] = 1;
        arrarrn8[0] = arrn25;
        int[] arrn26 = new int[9];
        arrn26[0] = 1;
        arrn26[1] = 1;
        arrn26[2] = 1;
        arrn26[3] = 1;
        arrn26[4] = 1;
        arrn26[5] = 1;
        arrn26[7] = 1;
        arrn26[8] = 1;
        arrarrn8[1] = arrn26;
        int[] arrn27 = new int[9];
        arrn27[0] = 1;
        arrn27[1] = 1;
        arrn27[4] = 1;
        arrn27[5] = 1;
        arrn27[7] = 1;
        arrn27[8] = 1;
        arrarrn8[2] = arrn27;
        int[] arrn28 = new int[9];
        arrn28[0] = 1;
        arrn28[1] = 1;
        arrn28[4] = 1;
        arrn28[5] = 1;
        arrn28[7] = 1;
        arrn28[8] = 1;
        arrarrn8[3] = arrn28;
        arrarrn8[4] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        arrarrn8[5] = new int[9];
        i = arrarrn8;
        int[][] arrarrn9 = new int[6][];
        int[] arrn29 = new int[9];
        arrn29[0] = 1;
        arrn29[1] = 1;
        arrn29[2] = 1;
        arrn29[3] = 1;
        arrn29[4] = 1;
        arrn29[7] = 1;
        arrn29[8] = 1;
        arrarrn9[0] = arrn29;
        int[] arrn30 = new int[9];
        arrn30[0] = 1;
        arrn30[1] = 1;
        arrn30[2] = 1;
        arrn30[3] = 1;
        arrn30[4] = 1;
        arrn30[7] = 1;
        arrn30[8] = 1;
        arrarrn9[1] = arrn30;
        int[] arrn31 = new int[9];
        arrn31[0] = 1;
        arrn31[3] = 1;
        arrn31[7] = 1;
        arrn31[8] = 1;
        arrarrn9[2] = arrn31;
        int[] arrn32 = new int[9];
        arrn32[0] = 1;
        arrn32[3] = 1;
        arrn32[4] = 1;
        arrn32[7] = 1;
        arrn32[8] = 1;
        arrarrn9[3] = arrn32;
        int[] arrn33 = new int[9];
        arrn33[0] = 1;
        arrn33[3] = 1;
        arrn33[4] = 1;
        arrn33[5] = 1;
        arrn33[6] = 1;
        arrn33[7] = 1;
        arrn33[8] = 1;
        arrarrn9[4] = arrn33;
        arrarrn9[5] = new int[9];
        j = arrarrn9;
        int[][] arrarrn10 = new int[6][];
        int[] arrn34 = new int[9];
        arrn34[1] = 1;
        arrn34[2] = 1;
        arrn34[3] = 1;
        arrn34[4] = 1;
        arrn34[5] = 1;
        arrn34[6] = 1;
        arrn34[7] = 1;
        arrn34[8] = 1;
        arrarrn10[0] = arrn34;
        arrarrn10[1] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arrn35 = new int[9];
        arrn35[0] = 1;
        arrn35[1] = 1;
        arrn35[3] = 1;
        arrn35[4] = 1;
        arrn35[7] = 1;
        arrn35[8] = 1;
        arrarrn10[2] = arrn35;
        int[] arrn36 = new int[9];
        arrn36[0] = 1;
        arrn36[1] = 1;
        arrn36[3] = 1;
        arrn36[4] = 1;
        arrn36[7] = 1;
        arrn36[8] = 1;
        arrarrn10[3] = arrn36;
        int[] arrn37 = new int[9];
        arrn37[0] = 1;
        arrn37[1] = 1;
        arrn37[3] = 1;
        arrn37[4] = 1;
        arrn37[5] = 1;
        arrn37[6] = 1;
        arrn37[7] = 1;
        arrn37[8] = 1;
        arrarrn10[4] = arrn37;
        arrarrn10[5] = new int[9];
        k = arrarrn10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static boolean a(int[][] var0, int[][] var1_1) {
        try {
            var2_2 = 0;
            ** GOTO lbl13
        }
        catch (Throwable v0) {}
        return true;
lbl-1000: // 1 sources:
        {
            var3_3 = 0;
            while (var3_3 < 9) {
                if (var0[var2_2][var3_3] != var1_1[var2_2][var3_3]) {
                    return false;
                }
                ++var3_3;
            }
            ++var2_2;
lbl13: // 2 sources:
            ** while (var2_2 < 6)
        }
lbl14: // 1 sources:
        return true;
    }

    private static int a(int[][] arrn) {
        block20 : {
            block19 : {
                block18 : {
                    block17 : {
                        block16 : {
                            block15 : {
                                block14 : {
                                    block13 : {
                                        block12 : {
                                            try {
                                                if (!ba.a(arrn, b)) break block12;
                                                return 1;
                                            }
                                            catch (Throwable throwable) {}
                                        }
                                        if (!ba.a(arrn, d)) break block13;
                                        return 8;
                                    }
                                    if (!ba.a(arrn, c)) break block14;
                                    return 7;
                                }
                                if (!ba.a(arrn, e)) break block15;
                                return 0;
                            }
                            if (!ba.a(arrn, k)) break block16;
                            return 6;
                        }
                        if (!ba.a(arrn, g)) break block17;
                        return 4;
                    }
                    if (!ba.a(arrn, f)) break block18;
                    return 2;
                }
                if (!ba.a(arrn, h)) break block19;
                return 3;
            }
            if (!ba.a(arrn, i)) break block20;
            return 9;
        }
        if (ba.a(arrn, j)) {
            return 5;
        }
        return 999;
    }

    private static int a(int n2, BufferedImage bufferedImage) {
        int n3;
        n3 = 0;
        try {
            int[][] arrn = new int[6][9];
            a = arrn;
            int n4 = n2;
            while (n4 < n2 + 5) {
                int n5 = 0;
                while (n5 < 9) {
                    if (bufferedImage.getRGB(n4, n5) < -1) {
                        ba.a[n4 - n2][n5] = 1;
                    }
                    ++n5;
                }
                ++n4;
            }
            n3 = ba.a(a);
        }
        catch (Throwable throwable) {}
        return n3;
    }

    public static String J(String string) {
        String string2;
        string2 = "";
        try {
            BufferedImage bufferedImage = null;
            try {
                bufferedImage = ImageIO.read(new File(string));
            }
            catch (IOException iOException) {
                System.out.println(iOException.toString());
            }
            int n2 = ba.a(1, bufferedImage);
            string2 = String.valueOf(string2) + Integer.toString(n2);
            n2 = ba.a(9, bufferedImage);
            string2 = String.valueOf(string2) + Integer.toString(n2);
            n2 = ba.a(17, bufferedImage);
            string2 = String.valueOf(string2) + Integer.toString(n2);
            n2 = ba.a(25, bufferedImage);
            string2 = String.valueOf(string2) + Integer.toString(n2);
            n2 = ba.a(33, bufferedImage);
            string2 = String.valueOf(string2) + Integer.toString(n2);
            n2 = ba.a(41, bufferedImage);
            string2 = String.valueOf(string2) + Integer.toString(n2);
            n2 = ba.a(49, bufferedImage);
            string2 = String.valueOf(string2) + Integer.toString(n2);
            n2 = ba.a(57, bufferedImage);
            string2 = String.valueOf(string2) + Integer.toString(n2);
            n2 = ba.a(65, bufferedImage);
            string2 = String.valueOf(string2) + Integer.toString(n2);
            n2 = ba.a(73, bufferedImage);
            string2 = String.valueOf(string2) + Integer.toString(n2);
        }
        catch (Throwable throwable) {}
        return string2;
    }
}

