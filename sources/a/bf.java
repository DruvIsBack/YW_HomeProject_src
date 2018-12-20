/*
 * Decompiled with CFR 0_132.
 */
import java.net.Authenticator;
import java.net.PasswordAuthentication;

final class bf
extends Authenticator {
    private final /* synthetic */ String aA;
    private final /* synthetic */ String aB;

    bf(String string, String string2) {
        this.aA = string;
        this.aB = string2;
    }

    @Override
    public final PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.aA, this.aB.toCharArray());
    }
}

