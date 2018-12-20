/*
 * Decompiled with CFR 0_132.
 */
public final class bv {
    private final String url;
    private final String description;
    private final String bf;
    private final String bg;
    private final String bh;

    public bv(getLeBonCoinWebCrawler getLeBonCoinWebCrawler2, String string, String string2, String string3, String string4, String string5) {
        this.url = string;
        this.description = string2;
        this.bf = string3;
        this.bg = string4;
        this.bh = string5;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.url).append(";");
        stringBuilder.append(this.description).append(";");
        stringBuilder.append(this.bf).append(";");
        stringBuilder.append(this.bg).append(";");
        stringBuilder.append(this.bh).append(";");
        return stringBuilder.toString();
    }
}

