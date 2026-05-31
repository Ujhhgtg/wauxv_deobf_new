package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import p000.AbstractC0580;
import p000.AbstractC1469;
import p000.AbstractC2844;
import p000.AbstractC2909;
import p000.C0481;
import p000.C0516;
import p000.C1192;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class HttpHeaders {
    private static final C0516 QUOTED_STRING_DELIMITERS;
    private static final C0516 TOKEN_DELIMITERS;

    static {
        C0516 c0516 = new C0516("\"\\".getBytes(AbstractC0580.UTF_8));
        c0516.f2203 = "\"\\";
        QUOTED_STRING_DELIMITERS = c0516;
        C0516 c0517 = new C0516("\t ,=".getBytes(AbstractC0580.UTF_8));
        c0517.f2203 = "\t ,=";
        TOKEN_DELIMITERS = c0517;
    }

    public static final boolean hasBody(Response response) {
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                C0481 c0481 = new C0481();
                c0481.m1898(headers.value(i));
                try {
                    readChallengeHeader(c0481, arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        if (AbstractC1469.m3322(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2 A[EDGE_INSN: B:59:0x00b2->B:48:0x00b2 BREAK  A[LOOP:2: B:22:0x0068->B:47:0x00b0], SYNTHETIC] */
    private static final void readChallengeHeader(C0481 c0481, List<Challenge> list) throws EOFException {
        String token;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(c0481);
                    token2 = readToken(c0481);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(c0481);
                String token3 = readToken(c0481);
                if (token3 == null) {
                    if (c0481.mo1860()) {
                        list.add(new Challenge(token2, C1192.f4327));
                        return;
                    }
                    return;
                }
                int iSkipAll = Util.skipAll(c0481, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(c0481);
                if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || c0481.mo1860())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = Util.skipAll(c0481, (byte) 61) + iSkipAll;
                    while (true) {
                        if (token3 != null) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (startsWith(c0481, (byte) 34)) {
                                token = readQuotedString(c0481);
                            } else {
                                token = readToken(c0481);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(c0481)) {
                            }
                            token3 = null;
                        } else {
                            token3 = readToken(c0481);
                            if (!skipCommasAndWhitespace(c0481)) {
                                iSkipAll2 = Util.skipAll(c0481, (byte) 61);
                                if (iSkipAll2 != 0) {
                                    break;
                                }
                                if (iSkipAll2 <= 1 || skipCommasAndWhitespace(c0481)) {
                                    return;
                                }
                                if (startsWith(c0481, (byte) 34)) {
                                    token = readQuotedString(c0481);
                                } else {
                                    token = readToken(c0481);
                                }
                                if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
                                    return;
                                }
                                if (skipCommasAndWhitespace(c0481) && !c0481.mo1860()) {
                                    return;
                                } else {
                                    token3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new Challenge(token2, linkedHashMap));
                    token2 = token3;
                } else {
                    StringBuilder sbM4787 = AbstractC2844.m4787(token3);
                    sbM4787.append(AbstractC2909.m4917(iSkipAll, "="));
                    list.add(new Challenge(token2, (Map<String, String>) Collections.singletonMap(null, sbM4787.toString())));
                }
            }
        }
    }

    private static final String readQuotedString(C0481 c0481) throws EOFException {
        if (c0481.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0481 c0482 = new C0481();
        while (true) {
            long jM1872 = c0481.m1872(QUOTED_STRING_DELIMITERS);
            if (jM1872 == -1) {
                return null;
            }
            if (c0481.m1866(jM1872) == 34) {
                c0482.write(c0481, jM1872);
                c0481.readByte();
                return c0482.m1880();
            }
            if (c0481.f2128 == jM1872 + 1) {
                return null;
            }
            c0482.write(c0481, jM1872);
            c0481.readByte();
            c0482.write(c0481, 1L);
        }
    }

    private static final String readToken(C0481 c0481) {
        long jM1872 = c0481.m1872(TOKEN_DELIMITERS);
        if (jM1872 == -1) {
            jM1872 = c0481.f2128;
        }
        if (jM1872 != 0) {
            return c0481.m1879(jM1872, AbstractC0580.UTF_8);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.Companion.parseAll(httpUrl, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, all);
    }

    private static final boolean skipCommasAndWhitespace(C0481 c0481) throws EOFException {
        boolean z = false;
        while (!c0481.mo1860()) {
            byte bM1866 = c0481.m1866(0L);
            if (bM1866 == 44) {
                c0481.readByte();
                z = true;
            } else {
                if (bM1866 != 32 && bM1866 != 9) {
                    break;
                }
                c0481.readByte();
            }
        }
        return z;
    }

    private static final boolean startsWith(C0481 c0481, byte b) {
        return !c0481.mo1860() && c0481.m1866(0L) == b;
    }
}
