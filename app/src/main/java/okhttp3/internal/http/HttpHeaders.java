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
import p000.AbstractC1192feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC2689Ujhhgtgfeyxiexzf;
import p000.C2598feyxiexzfUjhhgtg;
import p000.C2633Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;
import p000.C3308feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class HttpHeaders {
    private static final C2633Ujhhgtgfeyxiexzf QUOTED_STRING_DELIMITERS;
    private static final C2633Ujhhgtgfeyxiexzf TOKEN_DELIMITERS;

    static {
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = new C2633Ujhhgtgfeyxiexzf("\"\\".getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf));
        c2633Ujhhgtgfeyxiexzf.f8469Ujhhgtgfeyxiexzf = "\"\\";
        QUOTED_STRING_DELIMITERS = c2633Ujhhgtgfeyxiexzf;
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf2 = new C2633Ujhhgtgfeyxiexzf("\t ,=".getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf));
        c2633Ujhhgtgfeyxiexzf2.f8469Ujhhgtgfeyxiexzf = "\t ,=";
        TOKEN_DELIMITERS = c2633Ujhhgtgfeyxiexzf2;
    }

    public static final boolean hasBody(Response response) {
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
                c2598feyxiexzfUjhhgtg.m3877feyxiexzfUjhhgtg(headers.value(i));
                try {
                    readChallengeHeader(c2598feyxiexzfUjhhgtg, arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2 A[EDGE_INSN: B:59:0x00b2->B:48:0x00b2 BREAK  A[LOOP:2: B:22:0x0068->B:47:0x00b0], SYNTHETIC] */
    private static final void readChallengeHeader(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, List<Challenge> list) throws EOFException {
        String token;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(c2598feyxiexzfUjhhgtg);
                    token2 = readToken(c2598feyxiexzfUjhhgtg);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(c2598feyxiexzfUjhhgtg);
                String token3 = readToken(c2598feyxiexzfUjhhgtg);
                if (token3 == null) {
                    if (c2598feyxiexzfUjhhgtg.mo2109Ujhhgtgfeyxiexzf()) {
                        list.add(new Challenge(token2, C3308feyxiexzfUjhhgtg.f10345Ujhhgtgfeyxiexzf));
                        return;
                    }
                    return;
                }
                int iSkipAll = Util.skipAll(c2598feyxiexzfUjhhgtg, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(c2598feyxiexzfUjhhgtg);
                if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || c2598feyxiexzfUjhhgtg.mo2109Ujhhgtgfeyxiexzf())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = Util.skipAll(c2598feyxiexzfUjhhgtg, (byte) 61) + iSkipAll;
                    while (true) {
                        if (token3 != null) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (startsWith(c2598feyxiexzfUjhhgtg, (byte) 34)) {
                                token = readQuotedString(c2598feyxiexzfUjhhgtg);
                            } else {
                                token = readToken(c2598feyxiexzfUjhhgtg);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(c2598feyxiexzfUjhhgtg)) {
                            }
                            token3 = null;
                        } else {
                            token3 = readToken(c2598feyxiexzfUjhhgtg);
                            if (!skipCommasAndWhitespace(c2598feyxiexzfUjhhgtg)) {
                                iSkipAll2 = Util.skipAll(c2598feyxiexzfUjhhgtg, (byte) 61);
                                if (iSkipAll2 != 0) {
                                    break;
                                }
                                if (iSkipAll2 <= 1 || skipCommasAndWhitespace(c2598feyxiexzfUjhhgtg)) {
                                    return;
                                }
                                if (startsWith(c2598feyxiexzfUjhhgtg, (byte) 34)) {
                                    token = readQuotedString(c2598feyxiexzfUjhhgtg);
                                } else {
                                    token = readToken(c2598feyxiexzfUjhhgtg);
                                }
                                if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
                                    return;
                                }
                                if (skipCommasAndWhitespace(c2598feyxiexzfUjhhgtg) && !c2598feyxiexzfUjhhgtg.mo2109Ujhhgtgfeyxiexzf()) {
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
                    StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(token3);
                    sbM2707Ujhhgtgfeyxiexzf.append(AbstractC1192feyxiexzfUjhhgtg.m2680feyxiexzfUjhhgtg(iSkipAll, "="));
                    list.add(new Challenge(token2, (Map<String, String>) Collections.singletonMap(null, sbM2707Ujhhgtgfeyxiexzf.toString())));
                }
            }
        }
    }

    private static final String readQuotedString(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg) throws EOFException {
        if (c2598feyxiexzfUjhhgtg.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = new C2598feyxiexzfUjhhgtg();
        while (true) {
            long jM3861Ujhhgtgfeyxiexzf = c2598feyxiexzfUjhhgtg.m3861Ujhhgtgfeyxiexzf(QUOTED_STRING_DELIMITERS);
            if (jM3861Ujhhgtgfeyxiexzf == -1) {
                return null;
            }
            if (c2598feyxiexzfUjhhgtg.m3859Ujhhgtgfeyxiexzf(jM3861Ujhhgtgfeyxiexzf) == 34) {
                c2598feyxiexzfUjhhgtg2.write(c2598feyxiexzfUjhhgtg, jM3861Ujhhgtgfeyxiexzf);
                c2598feyxiexzfUjhhgtg.readByte();
                return c2598feyxiexzfUjhhgtg2.m3865feyxiexzfUjhhgtg();
            }
            if (c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf == jM3861Ujhhgtgfeyxiexzf + 1) {
                return null;
            }
            c2598feyxiexzfUjhhgtg2.write(c2598feyxiexzfUjhhgtg, jM3861Ujhhgtgfeyxiexzf);
            c2598feyxiexzfUjhhgtg.readByte();
            c2598feyxiexzfUjhhgtg2.write(c2598feyxiexzfUjhhgtg, 1L);
        }
    }

    private static final String readToken(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg) {
        long jM3861Ujhhgtgfeyxiexzf = c2598feyxiexzfUjhhgtg.m3861Ujhhgtgfeyxiexzf(TOKEN_DELIMITERS);
        if (jM3861Ujhhgtgfeyxiexzf == -1) {
            jM3861Ujhhgtgfeyxiexzf = c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf;
        }
        if (jM3861Ujhhgtgfeyxiexzf != 0) {
            return c2598feyxiexzfUjhhgtg.m3864feyxiexzfUjhhgtg(jM3861Ujhhgtgfeyxiexzf, AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
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

    private static final boolean skipCommasAndWhitespace(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg) throws EOFException {
        boolean z = false;
        while (!c2598feyxiexzfUjhhgtg.mo2109Ujhhgtgfeyxiexzf()) {
            byte bM3859Ujhhgtgfeyxiexzf = c2598feyxiexzfUjhhgtg.m3859Ujhhgtgfeyxiexzf(0L);
            if (bM3859Ujhhgtgfeyxiexzf == 44) {
                c2598feyxiexzfUjhhgtg.readByte();
                z = true;
            } else {
                if (bM3859Ujhhgtgfeyxiexzf != 32 && bM3859Ujhhgtgfeyxiexzf != 9) {
                    break;
                }
                c2598feyxiexzfUjhhgtg.readByte();
            }
        }
        return z;
    }

    private static final boolean startsWith(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, byte b) {
        return !c2598feyxiexzfUjhhgtg.mo2109Ujhhgtgfeyxiexzf() && c2598feyxiexzfUjhhgtg.m3859Ujhhgtgfeyxiexzf(0L) == b;
    }
}
