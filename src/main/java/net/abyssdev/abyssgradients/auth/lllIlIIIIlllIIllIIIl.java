package net.abyssdev.abyssgradients.auth;

import net.abyssdev.abysslib.text.Color;

import net.abyssdev.abyssgradients.AbyssGradients;
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
public class lllIlIIIIlllIIllIIIl {

    private static final String UNKNOWN = "%%__USER__%%";
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

    private static String OS = System.getProperty("os.name").toLowerCase();
    private final Logger logger;
    private AbyssGradients plugin;
    private String productKey;
    private String server;
    private String authorization;

    public lllIlIIIIlllIIllIIIl(AbyssGradients plugin, String licenseKey) {
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

        a(plugin, "");
        b(plugin, "");
        c(plugin, "", 0, 0);
        d(plugin, "");
        e(plugin, 0);
    }

    public static boolean a(final AbyssGradients plugin, String s) {
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
        char[] d = new char[] { 0x131, 0x130, 0xFC, 0xDC, 0xF6, 0xD6, 0x15F, 0x15E, 0xE7, 0xC7, 0x11F, 0x11E };
        lllIlIIIIlllIIllIIIl.i10 = true;
        char[] f = new char[] { 'i', 'I', 'u', 'U', 'o', 'O', 's', 'S', 'c', 'C', 'g', 'G' };
        for (int i = 0; i < d.length; i++) {
            param = param.replaceAll(
                    new String(new char[] { d[i] }), new String(new char[] { f[i] }));
        }
        lllIlIIIIlllIIllIIIl.j10 = true;
        return e(plugin, param.length());
    }

    public static String e(final AbyssGradients plugin, int binary) {
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

        return ("0x" + hex);
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
                    Process process = runtime.exec(new String[] { "wmic", "csproduct", "get", "UUID" });

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
                        // this.logger.info("Could not find hardware id.");
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
                        // this.logger.info("Could not find hardware id.");
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
                    // this.logger.info("Could not find hardware id.");
                }
            } catch (Exception e) {
                // this.logger.info("Could not find hardware id.");
            }

            String hwidv2 = "Unknown";
            try {
                if (OS.contains("win")) {
                    Runtime runtime = Runtime.getRuntime();
                    Process process = runtime.exec(new String[] { "wmic", "csproduct", "get", "UUID" });

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
                        // this.logger.info("Could not find hardware id.");
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
                        // this.logger.info("Could not find hardware id.");
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
                    // this.logger.info("Could not find hardware id.");
                }
            } catch (Exception e) {
                // this.logger.info("Could not find hardware id.");
            }

            String outString = "{\"hwid\":\"password\",\"licensekey\":\"avain\",\"product\":\"NiceCar\",\"version\":\"dogpoop\"}";
            // Align HWID again here if someone tries to spoof it
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
                        "&8&m---------------------------------").forEach(msg -> this.logger.info(Color.parse(msg)));
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

                if (!decoded.equals(productKey.substring(0, 2) + productKey.substring(productKey.length() - 2)
                        + authorization.substring(0, 2))) {
                    Arrays.asList(
                            "&8&m---------------------------------",
                            " ",
                            "&c" + this.plugin.getName() + " &8| &c" + this.plugin.getDescription().getVersion(),
                            "&7&oYour license is invalid!",
                            " ",
                            "&8&m---------------------------------").forEach(msg -> this.logger.info(Color.parse(msg)));
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
                            "&8&m---------------------------------").forEach(msg -> this.logger.info(Color.parse(msg)));
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
                        "&8&m---------------------------------").forEach(msg -> this.logger.info(Color.parse(msg)));
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
                        "&8&m---------------------------------").forEach(msg -> this.logger.info(Color.parse(msg)));
                System.exit(0);
                return;
            }

            lllIlIIIIlllIIllIIIl.d = true;
            final boolean valid = status.contains("success") && response.contains("success")
                    && String.valueOf(statusLength).equals("7");

            if (!valid) {
                Arrays.asList(
                        "&8&m---------------------------------",
                        " ",
                        "&c" + this.plugin.getName() + " &8| &c" + this.plugin.getDescription().getVersion(),
                        "&7&oYour license is invalid!",
                        " ",
                        "&8&m---------------------------------").forEach(msg -> this.logger.info(Color.parse(msg)));
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
                        "&8&m---------------------------------").forEach(msg -> this.logger.info(Color.parse(msg)));
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

            while (bin != 0) {
                int code4 = 0;
                for (i = 0; i < 4; i++) {
                    currbit = bin % 10;
                    bin = bin / 10;
                    code4 += currbit * Math.pow(2, i);
                }
                hex = hm.get(code4) + hex;
            }

            this.logger.info("Loaded plugin in " + (System.currentTimeMillis() - timeMs) + "ms");
        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
            this.logger.info("Your license is invalid. Please change your license, or contact the plugin developer.");
            System.exit(0);
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