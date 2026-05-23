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
import p000.AbstractC0599;
import p000.AbstractC2207;
import p000.AbstractC2784;
import p000.AbstractC2849;
import p000.C0504;
import p000.C0539;
import p000.C1190;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class HttpHeaders {
    private static final C0539 QUOTED_STRING_DELIMITERS;
    private static final C0539 TOKEN_DELIMITERS;

    static {
        C0539 c0539 = new C0539("\"\\".getBytes(AbstractC0599.f2413));
        c0539.f2247 = "\"\\";
        QUOTED_STRING_DELIMITERS = c0539;
        C0539 c05310 = new C0539("\t ,=".getBytes(AbstractC0599.f2413));
        c05310.f2247 = "\t ,=";
        TOKEN_DELIMITERS = c05310;
    }

    public static final boolean hasBody(Response response) {
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                C0504 c0504 = new C0504();
                c0504.m1804(headers.value(i));
                try {
                    readChallengeHeader(c0504, arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        if (AbstractC2207.m4087(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2 A[EDGE_INSN: B:59:0x00b2->B:48:0x00b2 BREAK  A[LOOP:2: B:22:0x0068->B:47:0x00b0], SYNTHETIC] */
    private static final void readChallengeHeader(C0504 c0504, List<Challenge> list) throws EOFException {
        String token;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(c0504);
                    token2 = readToken(c0504);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(c0504);
                String token3 = readToken(c0504);
                if (token3 == null) {
                    if (c0504.mo1766()) {
                        list.add(new Challenge(token2, C1190.f4330));
                        return;
                    }
                    return;
                }
                int iSkipAll = Util.skipAll(c0504, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(c0504);
                if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || c0504.mo1766())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = Util.skipAll(c0504, (byte) 61) + iSkipAll;
                    while (true) {
                        if (true) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            }
                            if (true) {
                                return;
                            }
                            if (startsWith(c0504, (byte) 34)) {
                                token = readQuotedString(c0504);
                            } else {
                                token = readToken(c0504);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(c0504)) {
                            }
                            token3 = null;
                        } else {
                            token3 = readToken(c0504);
                            if (!skipCommasAndWhitespace(c0504)) {
                                iSkipAll2 = Util.skipAll(c0504, (byte) 61);
                                if (iSkipAll2 != 0) {
                                    break;
                                }
                                if (iSkipAll2 <= 1 || skipCommasAndWhitespace(c0504)) {
                                    return;
                                }
                                if (startsWith(c0504, (byte) 34)) {
                                    token = readQuotedString(c0504);
                                } else {
                                    token = readToken(c0504);
                                }
                                if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
                                    return;
                                }
                                if (skipCommasAndWhitespace(c0504) && !c0504.mo1766()) {
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
                    StringBuilder sbM4753 = AbstractC2784.m4753(token3);
                    sbM4753.append(AbstractC2849.m4856(iSkipAll, "="));
                    list.add(new Challenge(token2, (Map<String, String>) Collections.singletonMap(null, sbM4753.toString())));
                }
            }
        }
    }

    private static final String readQuotedString(C0504 c0504) throws EOFException {
        if (c0504.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0504 c0505 = new C0504();
        while (true) {
            long jM1778 = c0504.m1778(QUOTED_STRING_DELIMITERS);
            if (jM1778 == -1) {
                return null;
            }
            if (c0504.m1772(jM1778) == 34) {
                c0505.write(c0504, jM1778);
                c0504.readByte();
                return c0505.m1786();
            }
            if (c0504.f2172 == jM1778 + 1) {
                return null;
            }
            c0505.write(c0504, jM1778);
            c0504.readByte();
            c0505.write(c0504, 1L);
        }
    }

    private static final String readToken(C0504 c0504) {
        long jM1778 = c0504.m1778(TOKEN_DELIMITERS);
        if (jM1778 == -1) {
            jM1778 = c0504.f2172;
        }
        if (jM1778 != 0) {
            return c0504.m1785(jM1778, AbstractC0599.f2413);
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

    private static final boolean skipCommasAndWhitespace(C0504 c0504) throws EOFException {
        boolean z = false;
        while (!c0504.mo1766()) {
            byte bM1772 = c0504.m1772(0L);
            if (bM1772 == 44) {
                c0504.readByte();
                z = true;
            } else {
                if (bM1772 != 32 && bM1772 != 9) {
                    break;
                }
                c0504.readByte();
            }
        }
        return z;
    }

    private static final boolean startsWith(C0504 c0504, byte b) {
        return !c0504.mo1766() && c0504.m1772(0L) == b;
    }
}
