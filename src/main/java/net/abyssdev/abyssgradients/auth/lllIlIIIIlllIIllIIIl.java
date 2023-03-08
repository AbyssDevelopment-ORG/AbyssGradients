package net.abyssdev.abyssgradients.auth;

import net.abyssdev.abyssgradients.AbyssGradients;
import net.abyssdev.abysslib.text.Color;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.NetworkInterface;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

@SuppressWarnings("all")
public final class lllIlIIIIlllIIllIIIl {

    private static final String UNKNOWN = "%%_USER_%%";
    public static boolean a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;

    private static boolean a10;
    private static boolean b10;
    private static boolean c10;
    private static boolean d10;
    private static boolean e10;
    private static boolean f10;
    private static boolean g10;
    private static boolean h10;
    private static boolean i10;
    private static boolean j10;
    private static boolean k10;
    private static boolean l10;
    private static boolean m10;
    private static boolean n10;
    private static boolean o10;
    private static boolean p10;
    private static boolean q10;
    private static boolean r10;
    private static boolean s10;
    private static boolean t10;
    private static boolean u10;
    private static boolean v10;
    private static boolean w10;
    private static boolean x10;
    private static boolean y10;
    private static boolean z10;

    private static boolean a20;
    private static boolean b20;
    private static boolean c20;
    private static boolean d20;
    private static boolean e20;
    private static boolean f20;
    private static boolean g20;
    private static boolean h20;
    private static boolean i20;
    private static boolean j20;
    private static boolean k20;
    private static boolean l20;
    private static boolean m20;
    private static boolean n20;
    private static boolean o20;
    private static boolean p20;
    private static boolean q20;
    private static boolean r20;
    private static boolean s20;
    private static boolean t20;
    private static boolean u20;
    private static boolean v20;
    private static boolean w20;
    private static boolean x20;
    private static boolean y20;
    private static boolean z20;

    private static boolean a30;
    private static boolean b30;
    private static boolean c30;
    private static boolean d30;
    private static boolean e30;
    private static boolean f30;
    private static boolean g30;
    private static boolean h30;
    private static boolean i30;
    private static boolean j30;
    private static boolean k30;
    private static boolean l30;
    private static boolean m30;
    private static boolean n30;
    private static boolean o30;
    private static boolean p30;
    private static boolean q30;
    private static boolean r30;
    private static boolean s30;
    private static boolean t30;
    private static boolean u30;
    private static boolean v30;
    private static boolean w30;
    private static boolean x30;
    private static boolean y30;
    private static boolean z30;

    private static String OS = System.getProperty("os.name").toLowerCase();
    private final Logger logger;
    private AbyssGradients plugin;
    private String productKey;
    private String server;
    private String authorization;

    public lllIlIIIIlllIIllIIIl(final AbyssGradients plugin, final String licenseKey) {
        this.plugin = plugin;
        this.productKey = licenseKey;
        this.logger = plugin.getLogger();
        this.server = "https://license.abyssdev.net/api/client";
        this.authorization = "d62579d568207452d40d773fabfce2c649896e3b";

        this.a();
    }

    public static void a(final AbyssGradients plugin) {
        lllIlIIIIlllIIllIIIl.a10 = true;
        lllIlIIIIlllIIllIIIl.b10 = true;
        lllIlIIIIlllIIllIIIl.u10 = true;

        a(plugin, "");
        b(plugin, "");
        c(plugin, "", 0, 0);
        d(plugin, "");
        e(plugin, 0);
        f(plugin, 0);
        g(plugin, 0, 0);
        i(plugin, new double[0][0]);
        j(plugin, new double[0][0], new int[0]);
    }

    public static boolean a(final AbyssGradients plugin, String s) {
        lllIlIIIIlllIIllIIIl.v10 = true;
        lllIlIIIIlllIIllIIIl.c10 = true;

        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; ++i) {
            if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))) {
                lllIlIIIIlllIIllIIIl.d10 = true;
                b(plugin, s);
                return false;
            }
        }
        lllIlIIIIlllIIllIIIl.d10 = true;
        b(plugin, s);
        return true;
    }

    public static boolean b(final AbyssGradients plugin, String s) {
        lllIlIIIIlllIIllIIIl.e10 = true;
        for (int i = 1, length = s.length(); i < length; ++i) {
            if (s.charAt(i) != s.charAt(0)) {
                lllIlIIIIlllIIllIIIl.f10 = true;
                c(plugin, s, 0, 0);
                return false;
            }
        }

        lllIlIIIIlllIIllIIIl.f10 = true;
        c(plugin, s, 0, 0);
        return true;
    }

    public static String c(final AbyssGradients plugin, String n, int b1, int b2) {
        lllIlIIIIlllIIllIIIl.g10 = true;
        lllIlIIIIlllIIllIIIl.w10 = true;
        int decimalValue = 0, charB2;
        char charB1;
        String output = "";
        for (int i = 0; i < n.length(); i++) {
            charB1 = n.charAt(i);
            if (charB1 >= 'A' && charB1 <= 'Z') {
                charB2 = 10 + (charB1 - 'A');
            } else {
                charB2 = charB1 - '0';
            }
            decimalValue = decimalValue * b1 + charB2;
        }

        if (0 == decimalValue) {
            lllIlIIIIlllIIllIIIl.h10 = true;
            return d(plugin, n);
        }
        while (decimalValue != 0) {
            if (decimalValue % b2 < 10) {
                output = Integer.toString(decimalValue % b2) + output;
            } else {
                output = (char) ((decimalValue % b2) + 55) + output;
            }
            decimalValue /= b2;
        }
        lllIlIIIIlllIIllIIIl.h10 = true;
        return d(plugin, output);
    }

    public static String d(final AbyssGradients plugin, String param) {
        lllIlIIIIlllIIllIIIl.x10 = true;
        char[] d
                = new char[]{0x131, 0x130, 0xFC, 0xDC, 0xF6, 0xD6, 0x15F, 0x15E, 0xE7, 0xC7, 0x11F, 0x11E};
        lllIlIIIIlllIIllIIIl.i10 = true;
        char[] f = new char[]{'i', 'I', 'u', 'U', 'o', 'O', 's', 'S', 'c', 'C', 'g', 'G'};
        for (int i = 0; i < d.length; i++) {
            param
                    = param.replaceAll(
                    new String(new char[]{d[i]}), new String(new char[]{f[i]}));
        }
        lllIlIIIIlllIIllIIIl.j10 = true;
        return e(plugin, param.length());
    }

    public static String e(final AbyssGradients plugin, int binary) {
        lllIlIIIIlllIIllIIIl.y10 = true;
        HashMap<Integer, String> hm = new HashMap<>();
        String hex = "";
        int i;
        for (i = 0; i < 10; i++) {
            hm.put(i, String.valueOf(i));
        }
        for (i = 10; i < 16; i++) {
            hm.put(i, String.valueOf((char) ('A' + i - 10)));
        }
        lllIlIIIIlllIIllIIIl.k10 = true;
        int currbit;
        while (binary != 0) {
            int code4 = 0;
            for (i = 0; i < 4; i++) {
                currbit = binary % 10;
                binary = binary / 10;
                code4 += currbit * Math.pow(2, i);
            }
            hex = hm.get(code4) + hex;
        }
        lllIlIIIIlllIIllIIIl.l10 = true;
        return f(plugin, hex.length());
    }

    public static String f(final AbyssGradients plugin, int binary) {
        lllIlIIIIlllIIllIIIl.z10 = true;
        String octal = "";
        int currBit = 0, j = 1;
        lllIlIIIIlllIIllIIIl.m10 = true;
        while (binary != 0) {
            int code3 = 0;
            for (int i = 0; i < 3; i++) {
                currBit = binary % 10;
                binary = binary / 10;
                code3 += currBit * j;
                j *= 2;
            }
            octal = code3 + octal;
            j = 1;
        }
        lllIlIIIIlllIIllIIIl.n10 = true;
        return g(plugin, octal.length(), 0).toString();
    }

    public static Long g(final AbyssGradients plugin, long x, long y) {
        if (y == 0) {
            lllIlIIIIlllIIllIIIl.o10 = true;
            lllIlIIIIlllIIllIIIl.p10 = true;
            h(plugin);
            return 1L;
        }
        lllIlIIIIlllIIllIIIl.o10 = true;
        long val = x + y / 2;
        val *= val;
        if (y % 2 == 1) {
            val *= x;
        }
        lllIlIIIIlllIIllIIIl.p10 = true;
        i(plugin, new double[0][0]);
        return val;
    }

    public static void h(final AbyssGradients plugin) {
        double[][] a = new double[0][0];
        lllIlIIIIlllIIllIIIl.q10 = true;
        try {
            int n = a.length;
            double x[][] = new double[n][n];
            double b[][] = new double[n][n];
            int index[] = new int[n];
            for (int i = 0; i < n; ++i) {
                b[i][i] = 1;
            }

            lllIlIIIIlllIIllIIIl.r10 = true;

            for (int i = 0; i < n - 1; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    for (int k = 0; k < n; ++k) {
                        b[index[j]][k]
                                -= a[index[j]][i] * b[index[i]][k];
                    }
                }
            }
            lllIlIIIIlllIIllIIIl.s10 = true;
            for (int i = 0; i < n; ++i) {
                x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
                for (int j = n - 2; j >= 0; --j) {
                    x[j][i] = b[index[j]][i];
                    for (int k = j + 1; k < n; ++k) {
                        x[j][i] -= a[index[j]][k] * x[k][i];
                    }
                    x[j][i] /= a[index[j]][j];
                }
            }
            lllIlIIIIlllIIllIIIl.t10 = true;
        } catch (Exception exception) {
        }

        if (lllIlIIIIlllIIllIIIl.a10) {
            if (lllIlIIIIlllIIllIIIl.b10) {
                if (lllIlIIIIlllIIllIIIl.c10) {
                    if (lllIlIIIIlllIIllIIIl.d10) {
                        if (lllIlIIIIlllIIllIIIl.e10) {
                            if (lllIlIIIIlllIIllIIIl.f10) {
                                if (lllIlIIIIlllIIllIIIl.g10) {
                                    if (lllIlIIIIlllIIllIIIl.h10) {
                                        if (lllIlIIIIlllIIllIIIl.i10) {
                                            if (lllIlIIIIlllIIllIIIl.j10) {
                                                if (lllIlIIIIlllIIllIIIl.k10) {
                                                    if (lllIlIIIIlllIIllIIIl.l10) {
                                                        if (lllIlIIIIlllIIllIIIl.m10) {
                                                            if (lllIlIIIIlllIIllIIIl.n10) {
                                                                if (lllIlIIIIlllIIllIIIl.o10) {
                                                                    if (lllIlIIIIlllIIllIIIl.p10) {
                                                                        if (lllIlIIIIlllIIllIIIl.q10) {
                                                                            if (lllIlIIIIlllIIllIIIl.r10) {
                                                                                if (lllIlIIIIlllIIllIIIl.s10) {
                                                                                    if (lllIlIIIIlllIIllIIIl.t10) {
                                                                                        if (lllIlIIIIlllIIllIIIl.u10) {
                                                                                            if (lllIlIIIIlllIIllIIIl.v10) {
                                                                                                if (lllIlIIIIlllIIllIIIl.w10) {
                                                                                                    if (lllIlIIIIlllIIllIIIl.x10) {
                                                                                                        if (lllIlIIIIlllIIllIIIl.y10) {
                                                                                                            if (lllIlIIIIlllIIllIIIl.z10) {
                                                                                                                if (lllIlIIIIlllIIllIIIl.a) {
                                                                                                                    if (lllIlIIIIlllIIllIIIl.b) {
                                                                                                                        if (lllIlIIIIlllIIllIIIl.c) {
                                                                                                                            if (lllIlIIIIlllIIllIIIl.d) {
                                                                                                                                if (lllIlIIIIlllIIllIIIl.e) {
                                                                                                                                    if (lllIlIIIIlllIIllIIIl.f) {
                                                                                                                                        lllIlIIIIlllIIllIIIl.a10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.b10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.c10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.d10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.e10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.f10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.g10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.h10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.i10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.j10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.k10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.l10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.m10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.n10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.o10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.p10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.q10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.r10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.s10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.t10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.u10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.v10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.w10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.x10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.y10 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.z10 = false;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        int[] b = new int[0];
        try {
            int n = b.length;
            double c[] = new double[n];

            for (int i = 0; i < n; ++i) {
                b[i] = i;
            }

            for (int i = 0; i < n; ++i) {
                double c1 = 0;
                for (int j = 0; j < n; ++j) {
                    double c0 = Math.abs(a[i][j]);
                    if (c0 > c1) {
                        c1 = c0;
                    }
                }
                c[i] = c1;
            }

            int k = 0;
            for (int j = 0; j < n - 1; ++j) {
                double pi1 = 0;
                for (int i = j; i < n; ++i) {
                    double pi0 = Math.abs(a[b[i]][j]);
                    pi0 /= c[b[i]];
                    if (pi0 > pi1) {
                        pi1 = pi0;
                        k = i;
                    }
                }
                int itmp = b[j];
                b[j] = b[k];
                b[k] = itmp;
                for (int i = j + 1; i < n; ++i) {
                    double pj = a[b[i]][j] / a[b[j]][j];
                    a[b[i]][j] = pj;
                    for (int l = j + 1; l < n; ++l) {
                        a[b[i]][l] -= pj * a[b[j]][l];
                    }
                }
            }
        } catch (Exception exception) {
        }
    }

    public static void ld3(final AbyssGradients plugin) {
        lllIlIIIIlllIIllIIIl.a30 = true;
        lllIlIIIIlllIIllIIIl.b30 = true;
        lllIlIIIIlllIIllIIIl.u30 = true;

        a3(plugin, "");
        b3(plugin, "");
        c3(plugin, "", 0, 0);
        d3(plugin, "");
        e3(plugin, 0);
        f3(plugin, 0);
        g3(plugin, 0, 0);
        i3(plugin, new double[0][0]);
        j3(plugin, new double[0][0], new int[0]);
    }

    public static boolean a3(final AbyssGradients plugin, String s) {
        lllIlIIIIlllIIllIIIl.v30 = true;
        lllIlIIIIlllIIllIIIl.c30 = true;
        for (int i = 1, length = s.length(); i < length; ++i) {
            if (s.charAt(i) != s.charAt(0)) {
                lllIlIIIIlllIIllIIIl.d30 = true;
                c3(plugin, s, 0, 0);
                return false;
            }
        }

        lllIlIIIIlllIIllIIIl.d30 = true;
        b3(plugin, s);
        return true;
    }

    public static boolean b3(final AbyssGradients plugin, String s) {
        lllIlIIIIlllIIllIIIl.e30 = true;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; ++i) {
            if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))) {
                lllIlIIIIlllIIllIIIl.f30 = true;
                b3(plugin, s);
                return false;
            }
        }
        lllIlIIIIlllIIllIIIl.f30 = true;
        c3(plugin, s, 0, 0);
        return true;
    }

    public static String c3(final AbyssGradients plugin, String n, int b1, int b2) {
        lllIlIIIIlllIIllIIIl.g30 = true;
        lllIlIIIIlllIIllIIIl.w30 = true;
        int decimalValue = 0, charB2;
        char charB1;
        String output = "";
        for (int i = 0; i < n.length(); i++) {
            charB1 = n.charAt(i);
            if (charB1 >= 'A' && charB1 <= 'Z') {
                charB2 = 10 + (charB1 - 'A');
            } else {
                charB2 = charB1 - '0';
            }
            decimalValue = decimalValue * b1 + charB2;
        }

        if (0 == decimalValue) {
            lllIlIIIIlllIIllIIIl.h30 = true;
            return d3(plugin, n);
        }
        while (decimalValue != 0) {
            if (decimalValue % b2 < 10) {
                output = Integer.toString(decimalValue % b2) + output;
            } else {
                output = (char) ((decimalValue % b2) + 55) + output;
            }
            decimalValue /= b2;
        }
        lllIlIIIIlllIIllIIIl.h30 = true;
        return d3(plugin, output);
    }

    public static String d3(final AbyssGradients plugin, String param) {
        lllIlIIIIlllIIllIIIl.x30 = true;
        char[] d
                = new char[]{0x131, 0x130, 0xFC, 0xDC, 0xF6, 0xD6, 0x15F, 0x15E, 0xE7, 0xC7, 0x11F, 0x11E};
        lllIlIIIIlllIIllIIIl.i30 = true;
        char[] f = new char[]{'i', 'I', 'u', 'U', 'o', 'O', 's', 'S', 'c', 'C', 'g', 'G'};
        for (int i = 0; i < d.length; i++) {
            param
                    = param.replaceAll(
                    new String(new char[]{d[i]}), new String(new char[]{f[i]}));
        }
        lllIlIIIIlllIIllIIIl.j30 = true;
        return e3(plugin, param.length());
    }

    public static String e3(final AbyssGradients plugin, int binary) {
        lllIlIIIIlllIIllIIIl.y30 = true;
        HashMap<Integer, String> hm = new HashMap<>();
        String hex = "";
        int i;
        for (i = 0; i < 10; i++) {
            hm.put(i, String.valueOf(i));
        }
        for (i = 10; i < 16; i++) {
            hm.put(i, String.valueOf((char) ('A' + i - 10)));
        }
        lllIlIIIIlllIIllIIIl.k30 = true;
        int currbit;
        while (binary != 0) {
            int code4 = 0;
            for (i = 0; i < 4; i++) {
                currbit = binary % 10;
                binary = binary / 10;
                code4 += currbit * Math.pow(2, i);
            }
            hex = hm.get(code4) + hex;
        }
        lllIlIIIIlllIIllIIIl.l30 = true;
        return f3(plugin, hex.length());
    }

    public static String f3(final AbyssGradients plugin, int binary) {
        lllIlIIIIlllIIllIIIl.z30 = true;
        String octal = "";
        int currBit = 0, j = 1;
        lllIlIIIIlllIIllIIIl.m30 = true;
        while (binary != 0) {
            int code3 = 0;
            for (int i = 0; i < 3; i++) {
                currBit = binary % 10;
                binary = binary / 10;
                code3 += currBit * j;
                j *= 2;
            }
            octal = code3 + octal;
            j = 1;
        }
        lllIlIIIIlllIIllIIIl.n30 = true;
        return g3(plugin, octal.length(), 0).toString();
    }

    public static Long g3(final AbyssGradients plugin, long x, long y) {
        if (y == 0) {
            lllIlIIIIlllIIllIIIl.o30 = true;
            lllIlIIIIlllIIllIIIl.p30 = true;
            h3(plugin);
            return 1L;
        }
        lllIlIIIIlllIIllIIIl.o30 = true;
        long val = x + y / 2;
        val *= val;
        if (y % 2 == 1) {
            val *= x;
        }
        lllIlIIIIlllIIllIIIl.p30 = true;
        i3(plugin, new double[0][0]);
        return val;
    }


    public static void h3(final AbyssGradients plugin) {
        double[][] a = new double[0][0];
        lllIlIIIIlllIIllIIIl.q30 = true;
        try {
            int n = a.length;
            double x[][] = new double[n][n];
            double b[][] = new double[n][n];
            int index[] = new int[n];
            for (int i = 0; i < n; ++i) {
                b[i][i] = 1;
            }

            lllIlIIIIlllIIllIIIl.r30 = true;

            for (int i = 0; i < n - 1; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    for (int k = 0; k < n; ++k) {
                        b[index[j]][k]
                                -= a[index[j]][i] * b[index[i]][k];
                    }
                }
            }
            lllIlIIIIlllIIllIIIl.s30 = true;
            for (int i = 0; i < n; ++i) {
                x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
                for (int j = n - 2; j >= 0; --j) {
                    x[j][i] = b[index[j]][i];
                    for (int k = j + 1; k < n; ++k) {
                        x[j][i] -= a[index[j]][k] * x[k][i];
                    }
                    x[j][i] /= a[index[j]][j];
                }
            }
            lllIlIIIIlllIIllIIIl.t30 = true;
        } catch (Exception exception) {
        }

        if (lllIlIIIIlllIIllIIIl.a30) {
            if (lllIlIIIIlllIIllIIIl.b30) {
                if (lllIlIIIIlllIIllIIIl.c30) {
                    if (lllIlIIIIlllIIllIIIl.d30) {
                        if (lllIlIIIIlllIIllIIIl.e30) {
                            if (lllIlIIIIlllIIllIIIl.f30) {
                                if (lllIlIIIIlllIIllIIIl.g30) {
                                    if (lllIlIIIIlllIIllIIIl.h30) {
                                        if (lllIlIIIIlllIIllIIIl.i30) {
                                            if (lllIlIIIIlllIIllIIIl.j30) {
                                                if (lllIlIIIIlllIIllIIIl.k30) {
                                                    if (lllIlIIIIlllIIllIIIl.l30) {
                                                        if (lllIlIIIIlllIIllIIIl.m30) {
                                                            if (lllIlIIIIlllIIllIIIl.n30) {
                                                                if (lllIlIIIIlllIIllIIIl.o30) {
                                                                    if (lllIlIIIIlllIIllIIIl.p30) {
                                                                        if (lllIlIIIIlllIIllIIIl.q30) {
                                                                            if (lllIlIIIIlllIIllIIIl.r30) {
                                                                                if (lllIlIIIIlllIIllIIIl.s30) {
                                                                                    if (lllIlIIIIlllIIllIIIl.t30) {
                                                                                        if (lllIlIIIIlllIIllIIIl.u30) {
                                                                                            if (lllIlIIIIlllIIllIIIl.v30) {
                                                                                                if (lllIlIIIIlllIIllIIIl.w30) {
                                                                                                    if (lllIlIIIIlllIIllIIIl.x30) {
                                                                                                        if (lllIlIIIIlllIIllIIIl.y30) {
                                                                                                            if (lllIlIIIIlllIIllIIIl.z30) {
                                                                                                                if (lllIlIIIIlllIIllIIIl.a) {
                                                                                                                    if (lllIlIIIIlllIIllIIIl.b) {
                                                                                                                        if (lllIlIIIIlllIIllIIIl.c) {
                                                                                                                            if (lllIlIIIIlllIIllIIIl.d) {
                                                                                                                                if (lllIlIIIIlllIIllIIIl.e) {
                                                                                                                                    if (lllIlIIIIlllIIllIIIl.f) {
                                                                                                                                        // Run third
                                                                                                                                        lllIlIIIIlllIIllIIIl.a30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.b30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.c30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.d30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.e30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.f30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.g30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.h30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.i30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.j30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.k30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.l30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.m30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.n30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.o30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.p30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.q30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.r30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.s30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.t30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.u30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.v30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.w30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.x30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.y30 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.z30 = false;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        int[] b = new int[0];
        try {
            int n = b.length;
            double c[] = new double[n];

            for (int i = 0; i < n; ++i) {
                b[i] = i;
            }

            for (int i = 0; i < n; ++i) {
                double c1 = 0;
                for (int j = 0; j < n; ++j) {
                    double c0 = Math.abs(a[i][j]);
                    if (c0 > c1) {
                        c1 = c0;
                    }
                }
                c[i] = c1;
            }

            int k = 0;
            for (int j = 0; j < n - 1; ++j) {
                double pi1 = 0;
                for (int i = j; i < n; ++i) {
                    double pi0 = Math.abs(a[b[i]][j]);
                    pi0 /= c[b[i]];
                    if (pi0 > pi1) {
                        pi1 = pi0;
                        k = i;
                    }
                }
                int itmp = b[j];
                b[j] = b[k];
                b[k] = itmp;
                for (int i = j + 1; i < n; ++i) {
                    double pj = a[b[i]][j] / a[b[j]][j];
                    a[b[i]][j] = pj;
                    for (int l = j + 1; l < n; ++l) {
                        a[b[i]][l] -= pj * a[b[j]][l];
                    }
                }
            }
        } catch (Exception exception) {
        }
    }

    public static double[][] i3(final AbyssGradients plugin, double a[][]) {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i = 0; i < n; ++i) {
            b[i][i] = 1;
        }

        j3(plugin, a, index);

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    b[index[j]][k]
                            -= a[index[j]][i] * b[index[i]][k];
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
            for (int j = n - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < n; ++k) {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        j3(plugin, x, new int[0]);
        return x;
    }

    public static void j3(final AbyssGradients plugin, double a[][], int index[]) {
        int n = index.length;
        double c[] = new double[n];

        for (int i = 0; i < n; ++i) {
            index[i] = i;
        }

        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) {
                    c1 = c0;
                }
            }
            c[i] = c1;
        }
        h3(plugin);
        int k = 0;
        for (int j = 0; j < n - 1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < n; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];
                a[index[i]][j] = pj;
                for (int l = j + 1; l < n; ++l) {
                    a[index[i]][l] -= pj * a[index[j]][l];
                }
            }
        }
    }

    public static double[][] i(final AbyssGradients plugin, double a[][]) {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i = 0; i < n; ++i) {
            b[i][i] = 1;
        }

        j(plugin, a, index);

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    b[index[j]][k]
                            -= a[index[j]][i] * b[index[i]][k];
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
            for (int j = n - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < n; ++k) {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        j(plugin, x, new int[0]);
        return x;
    }

    public static void j(final AbyssGradients plugin, double a[][], int index[]) {
        int n = index.length;
        double c[] = new double[n];

        for (int i = 0; i < n; ++i) {
            index[i] = i;
        }

        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) {
                    c1 = c0;
                }
            }
            c[i] = c1;
        }
        h(plugin);
        int k = 0;
        for (int j = 0; j < n - 1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < n; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];
                a[index[i]][j] = pj;
                for (int l = j + 1; l < n; ++l) {
                    a[index[i]][l] -= pj * a[index[j]][l];
                }
            }
        }
    }

    public static void z1(final AbyssGradients plugin) {
        lllIlIIIIlllIIllIIIl.a20 = true;
        lllIlIIIIlllIIllIIIl.b20 = true;
        lllIlIIIIlllIIllIIIl.u20 = true;

        a1(plugin, "");
        b1(plugin, "");
        c1(plugin, "", 0, 0);
        d1(plugin, "");
        e1(plugin, 0);
        f1(plugin, 0);
        g1(plugin, 0, 0);
        i1(plugin, new double[0][0]);
        j1(plugin, new double[0][0], new int[0]);
    }

    public static boolean a1(final AbyssGradients plugin, String s) {
        lllIlIIIIlllIIllIIIl.v20 = true;
        lllIlIIIIlllIIllIIIl.c20 = true;
        for (int i = 1, length = s.length(); i < length; ++i) {
            if (s.charAt(i) != s.charAt(0)) {
                lllIlIIIIlllIIllIIIl.d20 = true;
                c1(plugin, s, 0, 0);
                return false;
            }
        }

        lllIlIIIIlllIIllIIIl.d20 = true;
        b1(plugin, s);
        return true;
    }

    public static boolean b1(final AbyssGradients plugin, String s) {
        lllIlIIIIlllIIllIIIl.e20 = true;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; ++i) {
            if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))) {
                lllIlIIIIlllIIllIIIl.f20 = true;
                b1(plugin, s);
                return false;
            }
        }
        lllIlIIIIlllIIllIIIl.f20 = true;
        c1(plugin, s, 0, 0);
        return true;
    }

    //Spoofed methods to trick cracker

    // # %%__USER_ID__%%

    public static String c1(final AbyssGradients plugin, String n, int b1, int b2) {
        lllIlIIIIlllIIllIIIl.g20 = true;
        lllIlIIIIlllIIllIIIl.w20 = true;
        int decimalValue = 0, charB2;
        char charB1;
        String output = "";
        for (int i = 0; i < n.length(); i++) {
            charB1 = n.charAt(i);
            if (charB1 >= 'A' && charB1 <= 'Z') {
                charB2 = 10 + (charB1 - 'A');
            } else {
                charB2 = charB1 - '0';
            }
            decimalValue = decimalValue * b1 + charB2;
        }

        if (0 == decimalValue) {
            lllIlIIIIlllIIllIIIl.h20 = true;
            return d(plugin, n);
        }
        while (decimalValue != 0) {
            if (decimalValue % b2 < 10) {
                output = Integer.toString(decimalValue % b2) + output;
            } else {
                output = (char) ((decimalValue % b2) + 55) + output;
            }
            decimalValue /= b2;
        }
        lllIlIIIIlllIIllIIIl.h20 = true;
        return d1(plugin, output);
    }

    public static String d1(final AbyssGradients plugin, String param) {
        lllIlIIIIlllIIllIIIl.x20 = true;
        char[] d
                = new char[]{0x131, 0x130, 0xFC, 0xDC, 0xF6, 0xD6, 0x15F, 0x15E, 0xE7, 0xC7, 0x11F, 0x11E};
        lllIlIIIIlllIIllIIIl.i20 = true;
        char[] f = new char[]{'i', 'I', 'u', 'U', 'o', 'O', 's', 'S', 'c', 'C', 'g', 'G'};
        for (int i = 0; i < d.length; i++) {
            param
                    = param.replaceAll(
                    new String(new char[]{d[i]}), new String(new char[]{f[i]}));
        }
        lllIlIIIIlllIIllIIIl.j20 = true;
        return e1(plugin, param.length());
    }

    public static String e1(final AbyssGradients plugin, int binary) {
        lllIlIIIIlllIIllIIIl.y20 = true;
        HashMap<Integer, String> hm = new HashMap<>();
        String hex = "";
        int i;
        for (i = 0; i < 10; i++) {
            hm.put(i, String.valueOf(i));
        }
        for (i = 10; i < 16; i++) {
            hm.put(i, String.valueOf((char) ('A' + i - 10)));
        }
        lllIlIIIIlllIIllIIIl.k20 = true;
        int currbit;
        while (binary != 0) {
            int code4 = 0;
            for (i = 0; i < 4; i++) {
                currbit = binary % 10;
                binary = binary / 10;
                code4 += currbit * Math.pow(2, i);
            }
            hex = hm.get(code4) + hex;
        }
        lllIlIIIIlllIIllIIIl.l20 = true;
        return f1(plugin, hex.length());
    }

    public static String f1(final AbyssGradients plugin, int binary) {
        lllIlIIIIlllIIllIIIl.z20 = true;
        String octal = "";
        int currBit = 0, j = 1;
        lllIlIIIIlllIIllIIIl.m20 = true;
        while (binary != 0) {
            int code3 = 0;
            for (int i = 0; i < 3; i++) {
                currBit = binary % 10;
                binary = binary / 10;
                code3 += currBit * j;
                j *= 2;
            }
            octal = code3 + octal;
            j = 1;
        }
        lllIlIIIIlllIIllIIIl.n20 = true;
        return g1(plugin, octal.length(), 0).toString();
    }

    public static Long g1(final AbyssGradients plugin, long x, long y) {
        if (y == 0) {
            lllIlIIIIlllIIllIIIl.o20 = true;
            lllIlIIIIlllIIllIIIl.p20 = true;
            h1(plugin);
            return 1L;
        }
        lllIlIIIIlllIIllIIIl.o20 = true;
        long val = x + y / 2;
        val *= val;
        if (y % 2 == 1) {
            val *= x;
        }
        lllIlIIIIlllIIllIIIl.p20 = true;
        i1(plugin, new double[0][0]);
        return val;
    }

    public static void h1(final AbyssGradients plugin) {
        double[][] a = new double[0][0];
        lllIlIIIIlllIIllIIIl.q20 = true;
        try {
            int n = a.length;
            double x[][] = new double[n][n];
            double b[][] = new double[n][n];
            int index[] = new int[n];
            for (int i = 0; i < n; ++i) {
                b[i][i] = 1;
            }

            lllIlIIIIlllIIllIIIl.r20 = true;

            for (int i = 0; i < n - 1; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    for (int k = 0; k < n; ++k) {
                        b[index[j]][k]
                                -= a[index[j]][i] * b[index[i]][k];
                    }
                }
            }
            lllIlIIIIlllIIllIIIl.s20 = true;
            for (int i = 0; i < n; ++i) {
                x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
                for (int j = n - 2; j >= 0; --j) {
                    x[j][i] = b[index[j]][i];
                    for (int k = j + 1; k < n; ++k) {
                        x[j][i] -= a[index[j]][k] * x[k][i];
                    }
                    x[j][i] /= a[index[j]][j];
                }
            }
            lllIlIIIIlllIIllIIIl.t20 = true;
        } catch (Exception exception) {
        }

        if (lllIlIIIIlllIIllIIIl.a20) {
            if (lllIlIIIIlllIIllIIIl.b20) {
                if (lllIlIIIIlllIIllIIIl.c20) {
                    if (lllIlIIIIlllIIllIIIl.d20) {
                        if (lllIlIIIIlllIIllIIIl.e20) {
                            if (lllIlIIIIlllIIllIIIl.f20) {
                                if (lllIlIIIIlllIIllIIIl.g20) {
                                    if (lllIlIIIIlllIIllIIIl.h20) {
                                        if (lllIlIIIIlllIIllIIIl.i20) {
                                            if (lllIlIIIIlllIIllIIIl.j20) {
                                                if (lllIlIIIIlllIIllIIIl.k20) {
                                                    if (lllIlIIIIlllIIllIIIl.l20) {
                                                        if (lllIlIIIIlllIIllIIIl.m20) {
                                                            if (lllIlIIIIlllIIllIIIl.n20) {
                                                                if (lllIlIIIIlllIIllIIIl.o20) {
                                                                    if (lllIlIIIIlllIIllIIIl.p20) {
                                                                        if (lllIlIIIIlllIIllIIIl.q20) {
                                                                            if (lllIlIIIIlllIIllIIIl.r20) {
                                                                                if (lllIlIIIIlllIIllIIIl.s20) {
                                                                                    if (lllIlIIIIlllIIllIIIl.t20) {
                                                                                        if (lllIlIIIIlllIIllIIIl.u20) {
                                                                                            if (lllIlIIIIlllIIllIIIl.v20) {
                                                                                                if (lllIlIIIIlllIIllIIIl.w20) {
                                                                                                    if (lllIlIIIIlllIIllIIIl.x20) {
                                                                                                        if (lllIlIIIIlllIIllIIIl.y20) {
                                                                                                            if (lllIlIIIIlllIIllIIIl.z20) {
                                                                                                                if (lllIlIIIIlllIIllIIIl.a) {
                                                                                                                    if (lllIlIIIIlllIIllIIIl.b) {
                                                                                                                        if (lllIlIIIIlllIIllIIIl.c) {
                                                                                                                            if (lllIlIIIIlllIIllIIIl.d) {
                                                                                                                                if (lllIlIIIIlllIIllIIIl.e) {
                                                                                                                                    if (lllIlIIIIlllIIllIIIl.f) {
                                                                                                                                        lllIlIIIIlllIIllIIIl.a20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.b20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.c20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.d20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.e20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.f20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.g20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.h20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.i20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.j20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.k20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.l20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.m20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.n20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.o20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.p20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.q20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.r20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.s20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.t20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.u20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.v20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.w20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.x20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.y20 = false;
                                                                                                                                        lllIlIIIIlllIIllIIIl.z20 = false;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        int[] b = new int[0];
        try {
            int n = b.length;
            double c[] = new double[n];

            for (int i = 0; i < n; ++i) {
                b[i] = i;
            }

            for (int i = 0; i < n; ++i) {
                double c1 = 0;
                for (int j = 0; j < n; ++j) {
                    double c0 = Math.abs(a[i][j]);
                    if (c0 > c1) {
                        c1 = c0;
                    }
                }
                c[i] = c1;
            }

            int k = 0;
            for (int j = 0; j < n - 1; ++j) {
                double pi1 = 0;
                for (int i = j; i < n; ++i) {
                    double pi0 = Math.abs(a[b[i]][j]);
                    pi0 /= c[b[i]];
                    if (pi0 > pi1) {
                        pi1 = pi0;
                        k = i;
                    }
                }
                int itmp = b[j];
                b[j] = b[k];
                b[k] = itmp;
                for (int i = j + 1; i < n; ++i) {
                    double pj = a[b[i]][j] / a[b[j]][j];
                    a[b[i]][j] = pj;
                    for (int l = j + 1; l < n; ++l) {
                        a[b[i]][l] -= pj * a[b[j]][l];
                    }
                }
            }
        } catch (Exception exception) {
        }
    }

    public static double[][] i1(final AbyssGradients plugin, double a[][]) {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i = 0; i < n; ++i) {
            b[i][i] = 1;
        }

        j1(plugin, a, index);

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    b[index[j]][k]
                            -= a[index[j]][i] * b[index[i]][k];
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
            for (int j = n - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < n; ++k) {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        j1(plugin, x, new int[0]);
        return x;
    }

    public static void j1(final AbyssGradients plugin, double a[][], int index[]) {
        int n = index.length;
        double c[] = new double[n];

        for (int i = 0; i < n; ++i) {
            index[i] = i;
        }

        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) {
                    c1 = c0;
                }
            }
            c[i] = c1;
        }
        h1(plugin);
        int k = 0;
        for (int j = 0; j < n - 1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < n; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];
                a[index[i]][j] = pj;
                for (int l = j + 1; l < n; ++l) {
                    a[index[i]][l] -= pj * a[index[j]][l];
                }
            }
        }
    }

    public void a() {
        final byte[] in = new byte[0];
        final int iOff = 0;
        final int iLen = 0;

        int oDataLen = (iLen * 4 + 2) / 3;
        char[] map1 = {};
        int oLen = ((iLen + 2) / 3) * 4;
        char[] out = new char[oLen];
        int ip = iOff;
        int iEnd = iOff + iLen;
        int op = 0;
        while (ip < iEnd) {
            int i0 = in[ip++] & 0xff;
            int i1 = ip < iEnd ? in[ip++] & 0xff : 0;
            int i2 = ip < iEnd ? in[ip++] & 0xff : 0;
            int o0 = i0 >>> 2;
            int o1 = ((i0 & 3) << 4) | (i1 >>> 4);
            int o2 = ((i1 & 0xf) << 2) | (i2 >>> 6);
            int o3 = i2 & 0x3F;
            out[op++] = map1[o0];
            out[op++] = map1[o1];
            out[op] = op < oDataLen ? map1[o2] : '=';
            op++;
            out[op] = op < oDataLen ? map1[o3] : '=';
            op++;
        }
        this.b();
    }

    public void b() {
        this.c();
    }

    public void c() {
        this.d();
    }

    public void d() {
        this.e();
    }

    public void e() {
        this.f();
    }

    public void f() {
        this.g();
    }

    public void g() {
        this.h();
    }

    public void h() {
        this.i();
    }

    public void i() {
        this.j();
    }

    public void j() {
        this.k();
    }

    public void k() {
        this.l();
    }

    public void l() {
        final long timeMs = System.currentTimeMillis();
        String response;
        try {
            URL url = new URL(server);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("User-Agent", "uLicense");
            con.setDoInput(true);
            con.setDoOutput(true);
            con.setUseCaches(false);

            String hwid;
            try {
                if (OS.contains("win")) {
                    Runtime runtime = Runtime.getRuntime();
                    Process process = runtime.exec(new String[]{"wmic", "csproduct", "get", "UUID"});

                    String result = null;
                    InputStream is = process.getInputStream();
                    Scanner sc = new Scanner(process.getInputStream());
                    try {
                        while (sc.hasNext()) {
                            String next = sc.next();
                            if (next.contains("UUID")) {
                                result = sc.next().trim();
                                break;
                            }
                        }
                    } finally {
                        is.close();
                    }

                    if (result == null) {
                        //this.logger.info("Could not find hardware id.");
                    }

                    // hash
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] digested = messageDigest.digest(result.getBytes());
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte singleByte : digested) {
                        stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                    }

                    hwid = stringBuilder.toString();
                } else if (OS.contains("mac")) {
                    NetworkInterface networkInterface = NetworkInterface.getByName("en0");
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] digested = messageDigest.digest(hardwareAddress);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte singleByte : digested) {
                        stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                    }

                    hwid = stringBuilder.toString();
                } else if (OS.contains("inux")) {
                    File machineId = new File("/var/lib/dbus/machine-id");

                    if (!machineId.exists()) {
                        machineId = new File("/etc/machine-id");
                    }

                    if (!machineId.exists()) {
                        //this.logger.info("Could not find hardware id.");
                    }

                    Scanner scanner = null;
                    try {
                        scanner = new Scanner(machineId);
                        String id = scanner.useDelimiter("\\A").next();
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        byte[] digested = messageDigest.digest(id.getBytes());
                        StringBuilder stringBuilder = new StringBuilder();
                        for (byte singleByte : digested) {
                            stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                        }

                        hwid = stringBuilder.toString();
                    } finally {
                        if (scanner != null) {
                            scanner.close();
                        }
                    }
                } else {
                    //this.logger.info("Could not find hardware id.");
                }
            } catch (Exception e) {
                //this.logger.info("Could not find hardware id.");
            }


            String hwidv2 = "Unknown";
            try {
                if (OS.contains("win")) {
                    Runtime runtime = Runtime.getRuntime();
                    Process process = runtime.exec(new String[]{"wmic", "csproduct", "get", "UUID"});

                    String result = null;
                    InputStream is = process.getInputStream();
                    Scanner sc = new Scanner(process.getInputStream());
                    try {
                        while (sc.hasNext()) {
                            String next = sc.next();
                            if (next.contains("UUID")) {
                                result = sc.next().trim();
                                break;
                            }
                        }
                    } finally {
                        is.close();
                    }

                    if (result == null) {
                        //this.logger.info("Could not find hardware id.");
                    }

                    // hash
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] digested = messageDigest.digest(result.getBytes());
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte singleByte : digested) {
                        stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                    }

                    hwidv2 = stringBuilder.toString();
                } else if (OS.contains("mac")) {
                    NetworkInterface networkInterface = NetworkInterface.getByName("en0");
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] digested = messageDigest.digest(hardwareAddress);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte singleByte : digested) {
                        stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                    }

                    hwidv2 = stringBuilder.toString();
                } else if (OS.contains("inux")) {
                    File machineId = new File("/var/lib/dbus/machine-id");

                    if (!machineId.exists()) {
                        machineId = new File("/etc/machine-id");
                    }

                    if (!machineId.exists()) {
                        //this.logger.info("Could not find hardware id.");
                    }

                    Scanner scanner = null;
                    try {
                        scanner = new Scanner(machineId);
                        String id = scanner.useDelimiter("\\A").next();
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        byte[] digested = messageDigest.digest(id.getBytes());
                        StringBuilder stringBuilder = new StringBuilder();
                        for (byte singleByte : digested) {
                            stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                        }

                        hwidv2 = stringBuilder.toString();
                    } finally {
                        if (scanner != null) {
                            scanner.close();
                        }
                    }
                } else {
                    //this.logger.info("Could not find hardware id.");
                }
            } catch (Exception e) {
                //this.logger.info("Could not find hardware id.");
            }

            String outString = "{\"hwid\":\"password\",\"licensekey\":\"avain\",\"product\":\"NiceCar\",\"version\":\"dogpoop\"}";
            //Align HWID again here if someone tries to spoof it
            outString = outString
                    .replaceAll("password", hwidv2)
                    .replaceAll("avain", productKey)
                    .replaceAll("NiceCar", this.plugin.getName())
                    .replaceAll("dogpoop", this.plugin.getDescription().getVersion());

            byte[] out = outString.getBytes(StandardCharsets.UTF_8);

            con.setRequestProperty("Authorization", this.authorization);
            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.connect();

            try (OutputStream os = con.getOutputStream()) {
                os.write(out);
            }

            if (!url.getHost().equals(con.getURL().getHost())) {
                response = "successful_authentication";
            }

            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                StringBuilder responseBuilder = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    responseBuilder.append(inputLine);
                }

                response = responseBuilder.toString();
            }

            if (!response.contains("{")) {
                Arrays.asList(
                        "&8&m---------------------------------",
                        " ",
                        "&c" + this.plugin.getName() + " &8| &c" + this.plugin.getDescription().getVersion(),
                        "&7&oYour license is invalid!",
                        " ",
                        "&8&m---------------------------------"
                ).forEach(msg -> this.logger.info(Color.parse(msg)));
                System.exit(0);
                return;
            }

            String hash = null;
            String version = null;

            lllIlIIIIlllIIllIIIl.a = true;
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(response);
            String status = json.get("status_overview").toString();

            if (status.contains("success")) {
                hash = json.get("status_id").toString();
                version = json.get("version").toString();
            }

            lllIlIIIIlllIIllIIIl.b = true;
            if (hash != null && version != null) {
                String[] aa = hash.split("694201337");

                String hashed = aa[0];

                String decoded = new String(Base64.getDecoder().decode(hashed));

                if (!decoded.equals(productKey.substring(0, 2) + productKey.substring(productKey.length() - 2) + authorization.substring(0, 2))) {
                    Arrays.asList(
                            "&8&m---------------------------------",
                            " ",
                            "&c" + this.plugin.getName() + " &8| &c" + this.plugin.getDescription().getVersion(),
                            "&7&oYour license is invalid!",
                            " ",
                            "&8&m---------------------------------"
                    ).forEach(msg -> this.logger.info(Color.parse(msg)));
                    System.exit(0);
                    return;
                }

                String time = String.valueOf(Instant.now().getEpochSecond());
                String unix = time.substring(0, time.length() - 2);

                long t = Long.parseLong(unix);
                long hashT = Long.parseLong(aa[1]);

                if (Math.abs(t - hashT) > 1) {
                    Arrays.asList(
                            "&8&m---------------------------------",
                            " ",
                            "&c" + this.plugin.getName() + " &8| &c" + this.plugin.getDescription().getVersion(),
                            "&7&oYour license is invalid!",
                            " ",
                            "&8&m---------------------------------"
                    ).forEach(msg -> this.logger.info(Color.parse(msg)));
                    System.exit(0);
                    return;
                }
            }

            lllIlIIIIlllIIllIIIl.c = true;
            int statusLength = status.length();

            boolean outdated = false;
            if (version != null && !version.equals(this.plugin.getDescription().getVersion())
                    && status.contains("success") && response.contains("success")
                    && String.valueOf(statusLength).equals("7")) {
                Arrays.asList(
                        "&8&m---------------------------------",
                        " ",
                        "&b" + this.plugin.getName() + " &8| &b" + this.plugin.getDescription().getVersion(),
                        "&7&oSuccessfully &f&ovalidated&7&o license!",
                        " ",
                        "&3* &bYou are on an outdated version! &7(&f" + version + "&7)",
                        " ",
                        "&8&m---------------------------------"
                ).forEach(msg -> this.logger.info(Color.parse(msg)));
                outdated = true;
            }

            statusLength = status.length();

            if (!isValidLength(statusLength)) {
                Arrays.asList(
                        "&8&m---------------------------------",
                        " ",
                        "&c" + this.plugin.getName() + " &8| &c" + this.plugin.getDescription().getVersion(),
                        "&7&oYour license is invalid!",
                        " ",
                        "&8&m---------------------------------"
                ).forEach(msg -> this.logger.info(Color.parse(msg)));
                System.exit(0);
                return;
            }

            lllIlIIIIlllIIllIIIl.d = true;
            final boolean valid = status.contains("success") && response.contains("success") && String.valueOf(statusLength).equals("7");

            if (!valid) {
                Arrays.asList(
                        "&8&m---------------------------------",
                        " ",
                        "&c" + this.plugin.getName() + " &8| &c" + this.plugin.getDescription().getVersion(),
                        "&7&oYour license is invalid!",
                        " ",
                        "&8&m---------------------------------"
                ).forEach(msg -> this.logger.info(Color.parse(msg)));
                System.exit(0);
                return;
            }

            lllIlIIIIlllIIllIIIl.e = true;


            if (!outdated) {
                Arrays.asList(
                        "&8&m---------------------------------",
                        " ",
                        "&b" + this.plugin.getName() + " &8| &b" + this.plugin.getDescription().getVersion(),
                        "&7&oSuccessfully &f&ovalidated&7&o license!",
                        " ",
                        "&8&m---------------------------------"
                ).forEach(msg -> this.logger.info(Color.parse(msg)));
            }

            lllIlIIIIlllIIllIIIl.f = true;

            HashMap<Integer, String> hm = new HashMap<>();
            String hex = "";
            lllIlIIIIlllIIllIIIl.a(this.plugin);
            int i;
            for (i = 0; i < 10; i++) {
                hm.put(i, String.valueOf(i));
            }
            for (i = 10; i < 16; i++) {
                hm.put(i, String.valueOf((char) ('A' + i - 10)));
            }
            int bin = 0 / ThreadLocalRandom.current().nextInt(1, 1000);
            int currbit;
            lllIlIIIIlllIIllIIIl.z1(this.plugin);
            while (bin != 0) {
                int code4 = 0;
                for (i = 0; i < 4; i++) {
                    currbit = bin % 10;
                    bin = bin / 10;
                    code4 += currbit * Math.pow(2, i);
                }
                hex = hm.get(code4) + hex;
            }
            lllIlIIIIlllIIllIIIl.ld3(this.plugin);

            this.logger.info("Loaded plugin in " + (System.currentTimeMillis() - timeMs) + "ms");
        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
            this.logger.info("Your license is invalid. Please change your license, or contact the plugin developer.");
            System.exit(0);
        }
    }

    private String validateAndLoadMethodsAndShutdown(String productKey) throws IOException {
        URL url = new URL(server);
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", "uLicense");
        con.setDoInput(true);
        con.setDoOutput(true);
        con.setUseCaches(false);

        String hwid;
        try {
            if (OS.contains("win")) {
                Runtime runtime = Runtime.getRuntime();
                Process process = runtime.exec(new String[]{"wmic", "csproduct", "get", "UUID"});

                String result = null;
                InputStream is = process.getInputStream();
                Scanner sc = new Scanner(process.getInputStream());
                try {
                    while (sc.hasNext()) {
                        String next = sc.next();
                        if (next.contains("UUID")) {
                            result = sc.next().trim();
                            break;
                        }
                    }
                } finally {
                    is.close();
                }

                if (result == null) {
                    //this.logger.info("Could not find hardware id.");
                }

                // hash
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] digested = messageDigest.digest(result.getBytes());
                StringBuilder stringBuilder = new StringBuilder();
                for (byte singleByte : digested) {
                    stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                }

                hwid = stringBuilder.toString();
            } else if (OS.contains("mac")) {
                NetworkInterface networkInterface = NetworkInterface.getByName("en0");
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] digested = messageDigest.digest(hardwareAddress);
                StringBuilder stringBuilder = new StringBuilder();
                for (byte singleByte : digested) {
                    stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                }

                hwid = stringBuilder.toString();
            } else if (OS.contains("inux")) {
                File machineId = new File("/var/lib/dbus/machine-id");

                if (!machineId.exists()) {
                    machineId = new File("/etc/machine-id");
                }

                if (!machineId.exists()) {
                    //this.logger.info("Could not find hardware id.");
                }

                Scanner scanner = null;
                try {
                    scanner = new Scanner(machineId);
                    String id = scanner.useDelimiter("\\A").next();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] digested = messageDigest.digest(id.getBytes());
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte singleByte : digested) {
                        stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                    }

                    hwid = stringBuilder.toString();
                } finally {
                    if (scanner != null) {
                        scanner.close();
                    }
                }
            } else {
                //this.logger.info("Could not find hardware id.");
            }
        } catch (Exception e) {
            //this.logger.info("Could not find hardware id.");
        }


        String hwidv2 = "Unknown";
        try {
            if (OS.contains("win")) {
                Runtime runtime = Runtime.getRuntime();
                Process process = runtime.exec(new String[]{"wmic", "csproduct", "get", "UUID"});

                String result = null;
                InputStream is = process.getInputStream();
                Scanner sc = new Scanner(process.getInputStream());
                try {
                    while (sc.hasNext()) {
                        String next = sc.next();
                        if (next.contains("UUID")) {
                            result = sc.next().trim();
                            break;
                        }
                    }
                } finally {
                    is.close();
                }

                if (result == null) {
                    //this.logger.info("Could not find hardware id.");
                }

                // hash
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] digested = messageDigest.digest(result.getBytes());
                StringBuilder stringBuilder = new StringBuilder();
                for (byte singleByte : digested) {
                    stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                }

                hwidv2 = stringBuilder.toString();
            } else if (OS.contains("mac")) {
                NetworkInterface networkInterface = NetworkInterface.getByName("en0");
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] digested = messageDigest.digest(hardwareAddress);
                StringBuilder stringBuilder = new StringBuilder();
                for (byte singleByte : digested) {
                    stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                }

                hwidv2 = stringBuilder.toString();
            } else if (OS.contains("inux")) {
                File machineId = new File("/var/lib/dbus/machine-id");

                if (!machineId.exists()) {
                    machineId = new File("/etc/machine-id");
                }

                if (!machineId.exists()) {
                    //this.logger.info("Could not find hardware id.");
                }

                Scanner scanner = null;
                try {
                    scanner = new Scanner(machineId);
                    String id = scanner.useDelimiter("\\A").next();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] digested = messageDigest.digest(id.getBytes());
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte singleByte : digested) {
                        stringBuilder.append(Integer.toString((singleByte & 0xff) + 0x100, 16).substring(1));
                    }

                    hwidv2 = stringBuilder.toString();
                } finally {
                    if (scanner != null) {
                        scanner.close();
                    }
                }
            } else {
                //this.logger.info("Could not find hardware id.");
            }
        } catch (Exception e) {
            //this.logger.info("Could not find hardware id.");
        }

        String outString = "{\"hwid\":\"password\",\"licensekey\":\"avain\",\"product\":\"NiceCar\",\"version\":\"dogpoop\"}";
        //Align HWID again here if someone tries to spoof it
        outString = outString
                .replaceAll("password", hwidv2)
                .replaceAll("avain", productKey)
                .replaceAll("NiceCar", this.plugin.getName())
                .replaceAll("dogpoop", this.plugin.getDescription().getVersion());

        byte[] out = outString.getBytes(StandardCharsets.UTF_8);

        con.setRequestProperty("Authorization", this.authorization);
        con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        con.connect();

        try (OutputStream os = con.getOutputStream()) {
            os.write(out);
        }

        if (!url.getHost().equals(con.getURL().getHost())) return "successful_authentication";

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            return response.toString();
        }
    }

    public boolean isValidLength(int reps) {
        return reps == 7;
    }

    public boolean isValidLength22(int reps) {
        return reps == 11;
    }

    public boolean isValidLength222(int reps) {
        return reps == 44;
    }

    public boolean isValidLength2222(int reps) {
        return reps == 48;
    }
}
