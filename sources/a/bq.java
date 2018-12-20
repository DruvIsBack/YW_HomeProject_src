/*
 * Decompiled with CFR 0_132.
 */
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bq {
    private String aD;
    private static String aR;
    private String aS;
    private List l;
    private static boolean e;
    private static List m;
    private static String aT;
    private String aU;
    private String aV;
    private String aW;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private Integer k;
    private Integer l;
    private static String aX;

    static {
        aX = "";
    }

    public bq(String[] arrstring) {
        try {
            Object object = "record_t";
            Object object2 = this;
            this.aD = object;
            object2 = " ";
            aR = " ";
            object = "";
            object2 = this;
            this.aS = object;
            object = new ArrayList();
            object2 = this;
            this.l = object;
            boolean bl2 = false;
            e = false;
            Object object3 = new ArrayList();
            m = object3;
            object3 = "";
            aT = "";
            object3 = "testing";
            aX = "testing";
            if (arrstring != null && arrstring.length == 2) {
                object3 = arrstring[1];
                aT = object3;
            }
            bn.d(GUI.D(), "mailattachment", "empty");
            bq.y();
            bq.z();
            bq.A();
            this.C();
            object3 = this;
            bq.r(object3.aS);
            this.E();
            Thread.sleep(3000L);
            object3 = "";
            aX = "";
        }
        catch (Throwable throwable) {}
        System.exit(0);
    }

    private boolean q(String string) {
        try {
            if (string.contentEquals("IQUALIF 712 White and Yellow")) {
                this.Q("75013");
                this.R("Paris");
                this.S("Avenue d'italie");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF AConcession Yellow")) {
                this.Q("Renault");
                this.R("");
                this.S("");
                this.b(50);
                this.c(50);
                this.d(50);
                this.e(50);
                this.f(50);
                this.g(50);
                this.h(50);
                this.i(1);
                this.j(0);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Australia Yellow")) {
                bq.r("US IP recommended for test, anti spam on this directory");
                this.Q("");
                this.R("Australia");
                this.S("Restaurant");
                this.b(100);
                this.c(100);
                this.d(100);
                this.e(100);
                this.f(100);
                this.g(100);
                this.h(100);
                this.i(0);
                this.j(0);
                this.k(100);
                this.l(100);
            } else if (string.contentEquals("IQUALIF Austria Yellow")) {
                this.Q("");
                this.R("Austria");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Austria Yellow")) {
                this.Q("");
                this.R("Austria");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Auto24 White and Yellow")) {
                this.Q("");
                this.R("");
                this.S("voitures");
                this.b(50);
                this.c(50);
                this.d(50);
                this.e(50);
                this.f(50);
                this.g(50);
                this.h(50);
                this.i(1);
                this.j(0);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Bangladesh Yellow")) {
                this.Q("");
                this.R("");
                this.S("Restaurant");
                this.b(30);
                this.c(0);
                this.d(0);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(0);
                this.j(0);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF BCoin White and Yellow")) {
                this.Q("");
                this.R("ile_de_france");
                this.S("voitures");
                this.b(40);
                this.c(0);
                this.d(0);
                this.e(0);
                this.f(40);
                this.g(40);
                this.h(1);
                this.i(3);
                this.j(0);
                this.k(40);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Belgium White")) {
                this.Q("1000");
                this.R("Bruxelles");
                this.S("*");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(0);
                this.g(60);
                this.h(60);
                this.i(1);
                this.j(1);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Belgium Yellow")) {
                this.Q("1000");
                this.R("Bruxelles");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Belgium 07 Yellow")) {
                this.Q("1000");
                this.R("Bruxelles");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Canada 41 White")) {
                this.Q("QC");
                this.R("Montreal");
                this.S("*");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(0);
                this.g(30);
                this.h(30);
                this.i(0);
                this.j(0);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Canada White")) {
                this.Q("QC");
                this.R("Montreal");
                this.S("Sainte Catherine");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(0);
                this.g(60);
                this.h(60);
                this.i(0);
                this.j(0);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Canada Yellow")) {
                this.Q("QC");
                this.R("Montr\u00e9al");
                this.S("Restaurant");
                this.b(100);
                this.c(100);
                this.d(100);
                this.e(100);
                this.f(100);
                this.g(100);
                this.h(100);
                this.i(0);
                this.j(0);
                this.k(50);
                this.l(50);
            } else if (string.contentEquals("IQUALIF Croatia Yellow")) {
                this.Q("QC");
                this.R("Montr\u00e9al");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Denmark Yellow")) {
                this.Q("QC");
                this.R("Montreal");
                this.S("Sainte Catherine");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Finland Yellow")) {
                this.Q("QC");
                this.R("Montreal");
                this.S("Sainte Catherine");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF France White")) {
                this.Q("75013");
                this.R("Paris");
                this.S("Avenue d'italie");
                this.b(40);
                this.c(40);
                this.d(40);
                this.e(40);
                this.f(0);
                this.g(40);
                this.h(40);
                this.i(0);
                this.j(0);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF France Yellow")) {
                this.Q("");
                this.R("Paris");
                this.S("Restaurant");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(60);
                this.g(60);
                this.h(60);
                this.i(0);
                this.j(1);
                this.k(3);
                this.l(3);
            } else if (string.contentEquals("IQUALIF Germany White")) {
                this.Q("");
                this.R("Berlin");
                this.S("Ackerstra\u00dfe");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(0);
                this.g(60);
                this.h(60);
                this.i(10);
                this.j(1);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Germany GS Yellow")) {
                this.Q("");
                this.R("Berlin");
                this.S("Restaurant");
                this.b(40);
                this.c(40);
                this.d(40);
                this.e(40);
                this.f(40);
                this.g(40);
                this.h(40);
                this.i(0);
                this.j(1);
                this.k(1);
                this.l(1);
            } else if (string.contentEquals("IQUALIF Germany Yellow")) {
                this.Q("");
                this.R("Berlin");
                this.S("Restaurant");
                this.b(40);
                this.c(40);
                this.d(40);
                this.e(40);
                this.f(40);
                this.g(40);
                this.h(40);
                this.i(40);
                this.j(40);
                this.k(40);
                this.l(40);
            } else if (string.contentEquals("IQUALIF Hungary Yellow")) {
                this.Q("");
                this.R("Budapest");
                this.S("Etterem");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Immo24 White and Yellow")) {
                this.Q("");
                this.R("");
                this.S("pays-suisse-fl");
                this.b(40);
                this.c(40);
                this.d(40);
                this.e(40);
                this.f(40);
                this.g(40);
                this.h(40);
                this.i(40);
                this.j(40);
                this.k(40);
                this.l(40);
            } else if (string.contentEquals("IQUALIF Italy White")) {
                this.Q("");
                this.R("Roma");
                this.S("Francesco");
                this.b(40);
                this.c(40);
                this.d(40);
                this.e(40);
                this.f(0);
                this.g(40);
                this.h(40);
                this.i(1);
                this.j(1);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Italy PG Yellow")) {
                this.Q("");
                this.R("Roma");
                this.S("Ristorante");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(60);
                this.g(60);
                this.h(60);
                this.i(60);
                this.j(60);
                this.k(60);
                this.l(60);
            } else if (string.contentEquals("IQUALIF Italy Yellow")) {
                this.Q("");
                this.R("Roma");
                this.S("Ristorante");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(60);
                this.g(60);
                this.h(60);
                this.i(60);
                this.j(60);
                this.k(60);
                this.l(60);
            } else if (string.contentEquals("IQUALIF Kapa White and Yellow")) {
                this.Q("");
                this.R("anvers");
                this.S("auto");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Luxembourg White")) {
                this.Q("");
                this.R("Luxembourg");
                this.S("");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(0);
                this.g(60);
                this.h(60);
                this.i(0);
                this.j(1);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Luxembourg Yellow")) {
                this.Q("");
                this.R("Luxembourg");
                this.S("Restaurant");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(60);
                this.g(60);
                this.h(60);
                this.i(1);
                this.j(1);
                this.k(1);
                this.l(1);
            } else if (string.contentEquals("IQUALIF Morocco White")) {
                this.Q("");
                this.R("Casablanca");
                this.S("Ahmed");
                this.b(40);
                this.c(40);
                this.d(40);
                this.e(40);
                this.f(40);
                this.g(40);
                this.h(40);
                this.i(1);
                this.j(40);
                this.k(1);
                this.l(1);
            } else if (string.contentEquals("IQUALIF Morocco Yellow")) {
                this.Q("");
                this.R("Casablanca");
                this.S("Restaurant");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(60);
                this.g(60);
                this.h(60);
                this.i(1);
                this.j(0);
                this.k(1);
                this.l(1);
            } else if (string.contentEquals("IQUALIF Netherlands White")) {
                this.Q("");
                this.R("Amsterdam");
                this.S("");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Netherlands Yellow")) {
                this.Q("");
                this.R("Amsterdam");
                this.S("Restaurant");
                this.b(20);
                this.c(20);
                this.d(20);
                this.e(20);
                this.f(20);
                this.g(20);
                this.h(20);
                this.i(0);
                this.j(0);
                this.k(10);
                this.l(10);
            } else if (string.contentEquals("IQUALIF Norway Yellow")) {
                this.Q("QC");
                this.R("Montreal");
                this.S("Sainte Catherine");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Oedkniss White and Yellow")) {
                this.Q("");
                this.R("");
                this.S("automobiles");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Peru Yellow")) {
                this.Q("");
                this.R("Peru");
                this.S("Restaurante");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Philippines Yellow")) {
                this.Q("");
                this.R("Makati");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(1);
                this.j(1);
                this.k(5);
                this.l(5);
            } else if (string.contentEquals("IQUALIF Poland Yellow")) {
                this.Q("");
                this.R("Warszawa");
                this.S("Restauracja");
                this.b(60);
                this.c(0);
                this.d(60);
                this.e(60);
                this.f(60);
                this.g(60);
                this.h(60);
                this.i(0);
                this.j(0);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Portugal White")) {
                this.Q("");
                this.R("Lisboa");
                this.S("Campo Grande");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(0);
                this.g(60);
                this.h(60);
                this.i(0);
                this.j(1);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Portugal Yellow")) {
                this.Q("");
                this.R("Lisboa");
                this.S("Restaurantes");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(60);
                this.g(60);
                this.h(60);
                this.i(0);
                this.j(0);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Russia Yellow")) {
                this.Q("");
                this.R("");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(1);
                this.j(1);
                this.k(5);
                this.l(5);
            } else if (string.contentEquals("IQUALIF Saudi Arabia Yellow")) {
                this.Q("");
                this.R("");
                this.S("Restaurant");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(60);
                this.g(60);
                this.h(60);
                this.i(0);
                this.j(0);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Singapore Yellow")) {
                this.Q("");
                this.R("");
                this.S("Restaurant");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(60);
                this.g(60);
                this.h(60);
                this.i(0);
                this.j(0);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Spain White")) {
                this.Q("");
                this.R("Madrid");
                this.S("");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Spain Yellow")) {
                this.Q("");
                this.R("Madrid");
                this.S("Restaurantes");
                this.b(40);
                this.c(40);
                this.d(40);
                this.e(40);
                this.f(40);
                this.g(40);
                this.h(40);
                this.i(0);
                this.j(0);
                this.k(1);
                this.l(1);
            } else if (string.contentEquals("IQUALIF Switzerland CH White")) {
                this.Q("");
                this.R("Bern");
                this.S("Rohrweg");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(0);
                this.g(60);
                this.h(60);
                this.i(0);
                this.j(0);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Switzerland White")) {
                this.Q("");
                this.R("Bern");
                this.S("Rohrweg");
                this.b(60);
                this.c(60);
                this.d(60);
                this.e(60);
                this.f(0);
                this.g(60);
                this.h(60);
                this.i(0);
                this.j(0);
                this.k(0);
                this.l(0);
            } else if (string.contentEquals("IQUALIF Switzerland Yellow")) {
                this.Q("");
                this.R("Bern");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(0);
                this.j(0);
                this.k(1);
                this.l(1);
            } else if (string.contentEquals("IQUALIF TAdvisor Yellow")) {
                this.Q("");
                this.R("Tunis");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Tunisia Yellow")) {
                this.Q("");
                this.R("Tunis");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Tuti White and Yellow")) {
                this.Q("");
                this.R("");
                this.S("Voitures");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF United Kingdom White")) {
                this.Q("");
                this.R("London");
                this.S("Smith");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF United Kingdom Yellow")) {
                this.Q("");
                this.R("London");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(1);
                this.l(1);
            } else if (string.contentEquals("IQUALIF United Kingdom YL Yellow")) {
                this.Q("");
                this.R("London");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(1);
                this.l(1);
            } else if (string.contentEquals("IQUALIF United States White")) {
                this.Q("");
                this.R("New York");
                this.S("Smith");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF United States WP White")) {
                this.Q("NY");
                this.R("New York");
                this.S("55 5th av");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF United States Yellow")) {
                this.Q("");
                this.R("New York");
                this.S("Restaurant");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else if (string.contentEquals("IQUALIF Viva White and Yellow")) {
                this.Q("");
                this.R("Alsace");
                this.S("vehicule-utilitaire");
                this.b(30);
                this.c(30);
                this.d(30);
                this.e(30);
                this.f(30);
                this.g(30);
                this.h(30);
                this.i(30);
                this.j(30);
                this.k(30);
                this.l(30);
            } else {
                this.Q("");
                this.R("");
                this.S("");
                this.b(100);
                this.c(100);
                this.d(100);
                this.e(100);
                this.f(100);
                this.g(100);
                this.h(100);
                this.i(100);
                this.j(100);
                this.k(100);
                this.l(100);
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean y() {
        block29 : {
            Statement statement;
            ResultSet resultSet;
            resultSet = null;
            statement = null;
            try {
                try {
                    Connection connection = SQL.a(String.valueOf(GUI.x()) + bn.I());
                    String string = "pragma table_info(" + bn.H() + ");";
                    statement = connection.prepareStatement(string);
                    resultSet = statement.executeQuery();
                    while (resultSet.next()) {
                        if (resultSet.getString("name").startsWith("IQUALIF")) {
                            m.add(resultSet.getString("name"));
                            continue;
                        }
                        if (resultSet.getString("name").contentEquals("id") || resultSet.getString("name").contentEquals("text") || resultSet.getString("name").contentEquals("value1")) continue;
                        bq.r("unknow field : " + resultSet.getString("name"));
                        boolean bl2 = true;
                        e = true;
                    }
                    Collections.sort(m);
                    int n2 = 0;
                    while (n2 < m.size()) {
                        string = "SELECT * FROM " + bn.H() + " WHERE [" + (String)m.get(n2) + "] is null OR [" + (String)m.get(n2) + "] like '';";
                        statement = connection.prepareStatement(string);
                        resultSet = statement.executeQuery();
                        boolean bl3 = false;
                        while (resultSet.next()) {
                            bq.r("empty field : " + (String)m.get(n2) + " : " + resultSet.getString("text"));
                            bl3 = true;
                            e = true;
                            bl3 = true;
                        }
                        resultSet.close();
                        statement.close();
                        if (bl3) {
                            String string2 = "UPDATE " + bn.H() + " SET [" + (String)m.get(n2) + "]=? WHERE [" + (String)m.get(n2) + "] is null OR [" + (String)m.get(n2) + "] like '';";
                            statement = connection.prepareStatement(string2);
                            statement.setString(1, K.F(""));
                            statement.execute();
                            bq.r("updated field : " + string2);
                            bl3 = true;
                            e = true;
                        }
                        ++n2;
                    }
                    statement.close();
                    connection.close();
                }
                catch (Throwable throwable) {
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable3) {}
                    }
                    break block29;
                }
            }
            catch (Throwable throwable) {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    }
                    catch (Throwable throwable4) {}
                }
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable5) {}
                }
                throw throwable;
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                }
                catch (Throwable throwable) {}
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

    private static boolean z() {
        block33 : {
            Statement statement;
            ResultSet resultSet;
            resultSet = null;
            statement = null;
            try {
                try {
                    Connection connection = SQL.a(String.valueOf(GUI.x()) + aH.I());
                    ArrayList<String> arrayList = new ArrayList<String>();
                    String string = "pragma table_info(" + aH.H() + ");";
                    statement = connection.prepareStatement(string);
                    resultSet = statement.executeQuery();
                    while (resultSet.next()) {
                        if (resultSet.getString("name").startsWith("IQUALIF")) {
                            arrayList.add(resultSet.getString("name"));
                            continue;
                        }
                        if (resultSet.getString("name").contentEquals("id") || resultSet.getString("name").contentEquals("text") || resultSet.getString("name").contentEquals("value1")) continue;
                        bq.r("unknow field : " + resultSet.getString("name"));
                        boolean bl2 = true;
                        e = true;
                    }
                    int n2 = 0;
                    while (n2 < m.size()) {
                        if (!arrayList.contains(m.get(n2))) {
                            bq.r("missing field : History has no field named : " + (String)m.get(n2));
                            boolean bl3 = true;
                            e = true;
                        }
                        ++n2;
                    }
                    n2 = 0;
                    while (n2 < arrayList.size()) {
                        if (!m.contains(arrayList.get(n2))) {
                            bq.r("missing field : Setting has no field named : " + (String)arrayList.get(n2));
                            boolean bl4 = true;
                            e = true;
                        }
                        ++n2;
                    }
                    n2 = 0;
                    while (n2 < m.size()) {
                        string = "SELECT * FROM " + aH.H() + " WHERE [" + (String)m.get(n2) + "] is null OR [" + (String)m.get(n2) + "] like '';";
                        statement = connection.prepareStatement(string);
                        resultSet = statement.executeQuery();
                        boolean bl5 = false;
                        while (resultSet.next()) {
                            bq.r("empty field : " + (String)m.get(n2) + " : " + resultSet.getString("text"));
                            boolean bl6 = true;
                            e = true;
                            bl5 = true;
                        }
                        resultSet.close();
                        statement.close();
                        if (bl5) {
                            string = "UPDATE " + aH.H() + " SET [" + (String)m.get(n2) + "]=? WHERE [" + (String)m.get(n2) + "] is null OR [" + (String)m.get(n2) + "] like '';";
                            statement = connection.prepareStatement(string);
                            statement.setString(1, K.F(""));
                            statement.execute();
                            bq.r("updated field : " + string);
                            boolean bl7 = true;
                            e = true;
                        }
                        ++n2;
                    }
                    statement.close();
                    connection.close();
                }
                catch (Throwable throwable) {
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable3) {}
                    }
                    break block33;
                }
            }
            catch (Throwable throwable) {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    }
                    catch (Throwable throwable4) {}
                }
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable5) {}
                }
                throw throwable;
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                }
                catch (Throwable throwable) {}
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

    private static boolean A() {
        block38 : {
            Statement statement;
            ResultSet resultSet;
            resultSet = null;
            statement = null;
            try {
                try {
                    Object object;
                    int n2;
                    boolean bl2;
                    String[] arrstring = aM.b();
                    Connection connection = SQL.a(String.valueOf(GUI.x()) + aM.N());
                    HashMap hashMap = new HashMap();
                    int n3 = 0;
                    while (n3 < arrstring.length) {
                        ArrayList<String> arrayList = new ArrayList<String>();
                        object = "pragma table_info(" + arrstring[n3] + ");";
                        statement = connection.prepareStatement((String)object);
                        resultSet = statement.executeQuery();
                        while (resultSet.next()) {
                            if (resultSet.getString("name").startsWith("IQUALIF")) {
                                arrayList.add(resultSet.getString("name"));
                                continue;
                            }
                            if (resultSet.getString("name").contentEquals("id") || resultSet.getString("name").contentEquals("text") || resultSet.getString("name").contentEquals("value1")) continue;
                            bq.r("unknow field : " + resultSet.getString("name"));
                            bl2 = true;
                            e = true;
                        }
                        resultSet.close();
                        statement.close();
                        n2 = 0;
                        while (n2 < m.size()) {
                            if (!arrayList.contains(m.get(n2))) {
                                bq.r("missing field : Language/" + arrstring[n3] + " has no field named : " + (String)m.get(n2));
                                bl2 = true;
                                e = true;
                            }
                            ++n2;
                        }
                        n2 = 0;
                        while (n2 < arrayList.size()) {
                            if (!m.contains(arrayList.get(n2))) {
                                bq.r("missing field : Setting has no field named : " + (String)arrayList.get(n2));
                                bl2 = true;
                                e = true;
                            }
                            ++n2;
                        }
                        ArrayList<String> arrayList2 = new ArrayList<String>();
                        object = "SELECT * FROM " + arrstring[n3] + ";";
                        statement = connection.prepareStatement((String)object);
                        resultSet = statement.executeQuery();
                        while (resultSet.next()) {
                            arrayList2.add(resultSet.getString("text"));
                        }
                        resultSet.close();
                        statement.close();
                        hashMap.put(arrstring[n3], arrayList2);
                        ++n3;
                    }
                    List list = (List)hashMap.get(arrstring[0]);
                    int n4 = 1;
                    while (n4 < arrstring.length) {
                        object = (List)hashMap.get(arrstring[n4]);
                        if (n4 == 1) {
                            int n5 = 0;
                            while (n5 < object.size()) {
                                if (!object.contains(list.get(n5))) {
                                    bq.r("missing field : Language/" + arrstring[n4] + " has no field named : " + (String)list.get(n5));
                                    bl2 = true;
                                    e = true;
                                }
                                ++n5;
                            }
                        }
                        n2 = 0;
                        while (n2 < object.size()) {
                            if (!list.contains(object.get(n2))) {
                                bq.r("missing field : Language/" + arrstring[n4] + " has no field named : " + (String)object.get(n2));
                                bl2 = true;
                                e = true;
                            }
                            ++n2;
                        }
                        ++n4;
                    }
                    connection.close();
                }
                catch (Throwable throwable) {
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable3) {}
                    }
                    break block38;
                }
            }
            catch (Throwable throwable) {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    }
                    catch (Throwable throwable4) {}
                }
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable5) {}
                }
                throw throwable;
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                }
                catch (Throwable throwable) {}
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

    private boolean B() {
        block26 : {
            Statement statement;
            ResultSet resultSet;
            resultSet = null;
            statement = null;
            try {
                try {
                    Object object = SQL.a(String.valueOf(GUI.A()) + bi.am());
                    Object object2 = "SELECT COUNT(id) FROM " + bi.ay() + ";";
                    statement = object.prepareStatement((String)object2);
                    resultSet = statement.executeQuery();
                    object2 = 0;
                    while (resultSet.next()) {
                        object2 = Integer.valueOf(resultSet.getString(1));
                    }
                    bq bq2 = this;
                    if (object2.intValue() < bq2.b) {
                        bq2 = this;
                        bq.r("error : only " + object2 + " contacts instead of " + bq2.b);
                        boolean bl2 = true;
                        e = true;
                    }
                    object.close();
                    object = this;
                    bq.b("zip", object.c);
                    object = this;
                    bq.b("city", object.d);
                    object = this;
                    bq.b("street", object.e);
                    object = this;
                    bq.b("company", object.f);
                    object = this;
                    bq.b("name", object.g);
                    object = this;
                    bq.b("phone1", object.h);
                    object = this;
                    bq.b("mobile1", object.i);
                    object = this;
                    bq.b("fax", object.j);
                    object = this;
                    bq.b("site", object.k);
                    object = this;
                    bq.b("mail", object.l);
                }
                catch (Throwable throwable) {
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable3) {}
                    }
                    break block26;
                }
            }
            catch (Throwable throwable) {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    }
                    catch (Throwable throwable4) {}
                }
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable5) {}
                }
                throw throwable;
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                }
                catch (Throwable throwable) {}
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

    private static boolean b(String string, Integer n2) {
        block26 : {
            Statement statement;
            ResultSet resultSet;
            resultSet = null;
            statement = null;
            try {
                try {
                    Connection connection = SQL.a(String.valueOf(GUI.A()) + bi.am());
                    Object object = "SELECT COUNT(id) FROM " + bi.ay() + " WHERE [" + string + "] is not null AND [" + string + "] not like '';";
                    statement = connection.prepareStatement((String)object);
                    resultSet = statement.executeQuery();
                    object = 0;
                    while (resultSet.next()) {
                        object = Integer.valueOf(resultSet.getString(1));
                    }
                    if (n2 != 0 && object.intValue() < n2) {
                        bq.r("error : only " + object + " " + string.replace("company", "category") + " instead of " + n2);
                        boolean bl2 = true;
                        e = true;
                    }
                    connection.close();
                }
                catch (Throwable throwable) {
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable3) {}
                    }
                    break block26;
                }
            }
            catch (Throwable throwable) {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    }
                    catch (Throwable throwable4) {}
                }
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable5) {}
                }
                throw throwable;
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                }
                catch (Throwable throwable) {}
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean C() {
        try {
            aH.b(GUI.D(), "defaultdisplaymode", "Manuelle");
            GUI.a("_settingtool_searchmode").setSelectedItem(aM.G("dlg_man_manual"));
            String string = GUI.D();
            int n2 = 0;
            do {
                if (n2 >= m.size()) {
                    GUI.w(string);
                    bn.x(GUI.D());
                    return false;
                }
                String string2 = " ";
                aR = " ";
                boolean bl2 = false;
                e = false;
                if (!(aT == null || aT.contentEquals("") || !m.contains(aT) ? ((String)m.get(n2)).contentEquals("IQUALIF 712 White and Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Africa Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Anbis White and Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Australia White") || ((String)m.get(n2)).contentEquals("IQUALIF Austria Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Belgium 07 Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Belgium Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Croatia Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Denmark Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Dominica White") || ((String)m.get(n2)).contentEquals("IQUALIF England White") || ((String)m.get(n2)).contentEquals("IQUALIF England Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Finland Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF First Name White") || ((String)m.get(n2)).contentEquals("IQUALIF India Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Hungary White") || ((String)m.get(n2)).contentEquals("IQUALIF Kapa White and Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Lucia White") || ((String)m.get(n2)).contentEquals("IQUALIF Madagascar White") || ((String)m.get(n2)).contentEquals("IQUALIF Madagascar Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Netherlands White") || ((String)m.get(n2)).contentEquals("IQUALIF Norway Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF PAnnonces White and Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Polynesia White") || ((String)m.get(n2)).contentEquals("IQUALIF Polynesia Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF PP Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Sbito White and Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Sweden Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF TAdvisor Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Tunisia Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF Tuti White and Yellow") || ((String)m.get(n2)).contentEquals("IQUALIF United Kingdom White") || ((String)m.get(n2)).contentEquals("IQUALIF United States WP White") || ((String)m.get(n2)).contentEquals("IQUALIF Viva White and Yellow") : !((String)m.get(n2)).contentEquals(aT))) {
                    Thread.sleep(20000L);
                    bn.x((String)m.get(n2));
                    aM.f((String)m.get(n2), "english");
                    GUI.w((String)m.get(n2));
                    this.q((String)m.get(n2));
                    Object object = this;
                    GUI.a("_container1c_col0").setText(object.aU);
                    object = this;
                    GUI.a("_container1c_col1").setText(object.aV);
                    object = this;
                    GUI.a("_container1c_col2").setText(object.aW);
                    object = new br(this);
                    object = new Thread((Runnable)object);
                    object.start();
                    Thread.sleep(5000L);
                    if (GUI.a().isVisible()) {
                        JOptionPane.getRootFrame().dispose();
                    }
                    Thread.sleep(5000L);
                    if (GUI.a().isVisible()) {
                        JOptionPane.getRootFrame().dispose();
                    }
                    Thread.sleep(5000L);
                    if (GUI.a().isVisible()) {
                        JOptionPane.getRootFrame().dispose();
                    }
                    long l2 = System.nanoTime();
                    while (!GUI.a("_recherche").getText().contentEquals(aM.G("dlg_man_search_end"))) {
                        GUI.a();
                        if (Integer.valueOf(GUI.p().split("\u00a4")[3].split(" / ")[1]) >= 5) break;
                        Thread.sleep(3000L);
                        long l3 = System.nanoTime();
                        long l4 = l3 - l2;
                        long l5 = l4 / 1000000000L;
                        long l6 = 300L;
                        if (bn.Q("detailcapture").contentEquals("1")) {
                            l6 = 480L;
                        } else if (((String)m.get(n2)).contains("White and Yellow")) {
                            l6 = 300L;
                        } else if (((String)m.get(n2)).contains("Yellow")) {
                            l6 = 480L;
                        } else if (((String)m.get(n2)).contains("White")) {
                            l6 = 300L;
                        }
                        if (l5 < l6) continue;
                        bq.r("timeout : " + (String)m.get(n2) + " exceed " + l6 + "sec");
                        break;
                    }
                    if (!GUI.a("_recherche").getText().contentEquals(aM.G("dlg_man_search_end"))) {
                        GUI.a().n();
                    }
                    Thread.sleep(80000L);
                    this.B();
                    this.D();
                }
                ++n2;
            } while (true);
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean r(String string) {
        boolean bl2;
        bl2 = false;
        try {
            aR = string = String.valueOf(aR) + "\r\n" + string;
            bl2 = true;
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    private boolean D() {
        boolean bl2;
        bl2 = false;
        try {
            a.DeleteFile(String.valueOf(GUI.w()) + GUI.D() + ".xls");
            a.DeleteFile(String.valueOf(GUI.w()) + "ko_" + GUI.D() + ".xls");
            a.DeleteFile(String.valueOf(GUI.w()) + "ko_" + GUI.D() + ".csv");
            Object object = this;
            object = a.a(new File(String.valueOf(GUI.A()) + object.aD));
            Object object2 = String.valueOf(aR) + "\r\n\r\n" + GUI.D() + " : \r\n";
            aR = object2;
            int n2 = 0;
            while (n2 < object.size()) {
                object2 = String.valueOf(aR) + (String)object.get(n2);
                aR = object2;
                ++n2;
            }
            String string = "";
            if (e) {
                string = "ko_";
                a.a(String.valueOf(GUI.w()) + string + GUI.D() + ".csv", aR);
            }
            bi.a(String.valueOf(GUI.w()) + string + GUI.D() + ".xls", "", null);
            object2 = this;
            object2.l.add(String.valueOf(GUI.w()) + string + GUI.D() + ".xls");
            bl2 = true;
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    private boolean E() {
        try {
            bn.Q("mailtype");
            Object object = bn.Q("mailcrypt");
            String string = bn.Q("mailauth");
            String string2 = bn.Q("mailhost");
            String string3 = bn.Q("mailport");
            String string4 = bn.Q("mailuser");
            String string5 = bn.Q("mailpass");
            String string6 = bn.Q("mailfrom");
            String string7 = bn.Q("mailto");
            String string8 = bn.Q("mailcc");
            String string9 = bn.Q("mailcci");
            String string10 = !e ? "Test passe avec succes" : "Erreur lors des tests";
            String string11 = aR;
            String[] arrstring = string7.split(";");
            String[] arrstring2 = string8.split(";");
            String[] arrstring3 = string9.split(";");
            if (!string7.contains(";") && string7.contains("@")) {
                arrstring = new String[]{string7};
            }
            if (!string8.contains(";") && string8.contains("@")) {
                arrstring2 = new String[]{string8};
            }
            if (!string9.contains(";") && string9.contains("@")) {
                arrstring3 = new String[]{string9};
            }
            String string12 = object;
            object = this;
            object = aI.a(string12, string, string2, string3, string4, string5, string6, arrstring, arrstring2, arrstring3, string10, string11, object.l, false);
            if (!object.contentEquals("false")) {
                object.contentEquals("");
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private void Q(String string) {
        this.aU = string;
    }

    private void R(String string) {
        this.aV = string;
    }

    private void S(String string) {
        this.aW = string;
    }

    private void b(Integer n2) {
        this.b = n2;
    }

    private void c(Integer n2) {
        this.c = n2;
    }

    private void d(Integer n2) {
        this.d = n2;
    }

    private void e(Integer n2) {
        this.e = n2;
    }

    private void f(Integer n2) {
        this.f = n2;
    }

    private void g(Integer n2) {
        this.g = n2;
    }

    private void h(Integer n2) {
        this.h = n2;
    }

    private void i(Integer n2) {
        this.i = n2;
    }

    private void j(Integer n2) {
        this.j = n2;
    }

    private void k(Integer n2) {
        this.k = n2;
    }

    private void l(Integer n2) {
        this.l = n2;
    }

    public static String aA() {
        return aX;
    }

    public static void T(String string) {
        aX = string;
    }
}

