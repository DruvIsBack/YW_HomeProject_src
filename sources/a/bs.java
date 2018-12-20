/*
 * Decompiled with CFR 0_132.
 */
public final class bs {
    private final String url;
    private final String aY;
    private final String aZ;
    private final String ba;
    private final String bb;
    private final String bc;

    public bs(getLaCentraleWebCrawler getLaCentraleWebCrawler2, String string, String string2, String string3, String string4, String string5, String string6) {
        this.url = string;
        this.aY = string2;
        this.aZ = string3;
        this.ba = string4;
        this.bb = string5;
        this.bc = string6;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.url).append(";");
        stringBuilder.append(this.aY).append(";");
        stringBuilder.append(this.aZ).append(";");
        stringBuilder.append(this.ba).append(";");
        stringBuilder.append(this.bb).append(";");
        stringBuilder.append(this.bc).append(";");
        return stringBuilder.toString();
    }
}

