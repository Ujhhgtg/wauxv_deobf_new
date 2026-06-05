package okhttp3.internal.http2;

import p000.AbstractC2689Ujhhgtgfeyxiexzf;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.C2466feyxiexzfUjhhgtg;
import p000.C2633Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Header {
    public final int hpackSize;
    public final C2633Ujhhgtgfeyxiexzf name;
    public final C2633Ujhhgtgfeyxiexzf value;
    public static final Companion Companion = new Companion(null);
    public static final C2633Ujhhgtgfeyxiexzf PSEUDO_PREFIX = C2466feyxiexzfUjhhgtg.m3700Ujhhgtgfeyxiexzf(":");
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C2633Ujhhgtgfeyxiexzf RESPONSE_STATUS = C2466feyxiexzfUjhhgtg.m3700Ujhhgtgfeyxiexzf(RESPONSE_STATUS_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C2633Ujhhgtgfeyxiexzf TARGET_METHOD = C2466feyxiexzfUjhhgtg.m3700Ujhhgtgfeyxiexzf(TARGET_METHOD_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C2633Ujhhgtgfeyxiexzf TARGET_PATH = C2466feyxiexzfUjhhgtg.m3700Ujhhgtgfeyxiexzf(TARGET_PATH_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public static final C2633Ujhhgtgfeyxiexzf TARGET_SCHEME = C2466feyxiexzfUjhhgtg.m3700Ujhhgtgfeyxiexzf(TARGET_SCHEME_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C2633Ujhhgtgfeyxiexzf TARGET_AUTHORITY = C2466feyxiexzfUjhhgtg.m3700Ujhhgtgfeyxiexzf(TARGET_AUTHORITY_UTF8);

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
            this();
        }

        private Companion() {
        }
    }

    public Header(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf2) {
        this.name = c2633Ujhhgtgfeyxiexzf;
        this.value = c2633Ujhhgtgfeyxiexzf2;
        this.hpackSize = c2633Ujhhgtgfeyxiexzf2.mo2578Ujhhgtgfeyxiexzf() + c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf2, int i, Object obj) {
        if ((i & 1) != 0) {
            c2633Ujhhgtgfeyxiexzf = header.name;
        }
        if ((i & 2) != 0) {
            c2633Ujhhgtgfeyxiexzf2 = header.value;
        }
        return header.copy(c2633Ujhhgtgfeyxiexzf, c2633Ujhhgtgfeyxiexzf2);
    }

    public final C2633Ujhhgtgfeyxiexzf component1() {
        return this.name;
    }

    public final C2633Ujhhgtgfeyxiexzf component2() {
        return this.value;
    }

    public final Header copy(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf2) {
        return new Header(c2633Ujhhgtgfeyxiexzf, c2633Ujhhgtgfeyxiexzf2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.name, header.name) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.value, header.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.m3968Ujhhgtgfeyxiexzf() + ": " + this.value.m3968Ujhhgtgfeyxiexzf();
    }

    public Header(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, String str) {
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf2 = new C2633Ujhhgtgfeyxiexzf(str.getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf));
        c2633Ujhhgtgfeyxiexzf2.f8469Ujhhgtgfeyxiexzf = str;
        this(c2633Ujhhgtgfeyxiexzf, c2633Ujhhgtgfeyxiexzf2);
    }

    public Header(String str, String str2) {
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = new C2633Ujhhgtgfeyxiexzf(str.getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf));
        c2633Ujhhgtgfeyxiexzf.f8469Ujhhgtgfeyxiexzf = str;
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf2 = new C2633Ujhhgtgfeyxiexzf(str2.getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf));
        c2633Ujhhgtgfeyxiexzf2.f8469Ujhhgtgfeyxiexzf = str2;
        this(c2633Ujhhgtgfeyxiexzf, c2633Ujhhgtgfeyxiexzf2);
    }
}
