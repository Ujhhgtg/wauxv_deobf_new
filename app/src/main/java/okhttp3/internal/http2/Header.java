package okhttp3.internal.http2;

import p000.AbstractC0599;
import p000.AbstractC0981;
import p000.AbstractC2207;
import p000.C0373;
import p000.C0539;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Header {
    public final int hpackSize;
    public final C0539 name;
    public final C0539 value;
    public static final Companion Companion = new Companion(null);
    public static final C0539 PSEUDO_PREFIX = C0373.m1498(":");
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C0539 RESPONSE_STATUS = C0373.m1498(RESPONSE_STATUS_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C0539 TARGET_METHOD = C0373.m1498(TARGET_METHOD_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C0539 TARGET_PATH = C0373.m1498(TARGET_PATH_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public static final C0539 TARGET_SCHEME = C0373.m1498(TARGET_SCHEME_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C0539 TARGET_AUTHORITY = C0373.m1498(TARGET_AUTHORITY_UTF8);

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0981 abstractC0981) {
            this();
        }

        private Companion() {
        }
    }

    public Header(C0539 c0539, C0539 c05310) {
        this.name = c0539;
        this.value = c05310;
        this.hpackSize = c05310.mo1870() + c0539.mo1870() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, C0539 c0539, C0539 c05310, int i, Object obj) {
        if ((i & 1) != 0) {
            c0539 = header.name;
        }
        if ((i & 2) != 0) {
            c05310 = header.value;
        }
        return header.copy(c0539, c05310);
    }

    public final C0539 component1() {
        return this.name;
    }

    public final C0539 component2() {
        return this.value;
    }

    public final Header copy(C0539 c0539, C0539 c05310) {
        return new Header(c0539, c05310);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return AbstractC2207.m4087(this.name, header.name) && AbstractC2207.m4087(this.value, header.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.m1877() + ": " + this.value.m1877();
    }

    public Header(C0539 c0539, String str) {
        C0539 c05310 = new C0539(str.getBytes(AbstractC0599.f2413));
        c05310.f2247 = str;
        this(c0539, c05310);
    }

    public Header(String str, String str2) {
        C0539 c0539 = new C0539(str.getBytes(AbstractC0599.f2413));
        c0539.f2247 = str;
        C0539 c05310 = new C0539(str2.getBytes(AbstractC0599.f2413));
        c05310.f2247 = str2;
        this(c0539, c05310);
    }
}
