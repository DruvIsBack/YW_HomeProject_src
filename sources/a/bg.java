/*
 * Decompiled with CFR 0_132.
 */
import java.net.Authenticator;
import java.net.PasswordAuthentication;

final class bg
extends Authenticator {
    private final /* synthetic */ String aA;
    private final /* synthetic */ String aB;

    bg(String string, String string2) {
        this.aA = string;
        this.aB = string2;
    }

    @Override
    public final PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.aA, this.aB.toCharArray());
    }
}

