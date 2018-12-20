/*
 * Decompiled with CFR 0_132.
 */
public final class ac
implements Comparable {
    public String columnName;
    public boolean b;
    public int c;

    public ac(int n2, String string, boolean bl2) {
        this.c = n2;
        this.columnName = string;
        this.b = bl2;
    }

    public final /* synthetic */ int compareTo(Object object) {
        ac ac2 = (ac)object;
        object = this;
        return new Integer(object.c).compareTo(new Integer(ac2.c));
    }
}

