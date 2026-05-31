package okhttp3.internal.http2;

import p000.AbstractC0580;
import p000.AbstractC0985;
import p000.AbstractC1469;
import p000.C0348;
import p000.C0516;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Header {
    public final int hpackSize;
    public final C0516 name;
    public final C0516 value;
    public static final Companion Companion = new Companion(null);
    public static final C0516 PSEUDO_PREFIX = C0348.m1603(":");
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C0516 RESPONSE_STATUS = C0348.m1603(RESPONSE_STATUS_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C0516 TARGET_METHOD = C0348.m1603(TARGET_METHOD_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C0516 TARGET_PATH = C0348.m1603(TARGET_PATH_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public static final C0516 TARGET_SCHEME = C0348.m1603(TARGET_SCHEME_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C0516 TARGET_AUTHORITY = C0348.m1603(TARGET_AUTHORITY_UTF8);

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0985 abstractC0985) {
            this();
        }

        private Companion() {
        }
    }

    public Header(C0516 c0516, C0516 c0517) {
        this.name = c0516;
        this.value = c0517;
        this.hpackSize = c0517.mo1964() + c0516.mo1964() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, C0516 c0516, C0516 c0517, int i, Object obj) {
        if ((i & 1) != 0) {
            c0516 = header.name;
        }
        if ((i & 2) != 0) {
            c0517 = header.value;
        }
        return header.copy(c0516, c0517);
    }

    public final C0516 component1() {
        return this.name;
    }

    public final C0516 component2() {
        return this.value;
    }

    public final Header copy(C0516 c0516, C0516 c0517) {
        return new Header(c0516, c0517);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return AbstractC1469.m3322(this.name, header.name) && AbstractC1469.m3322(this.value, header.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.m1971() + ": " + this.value.m1971();
    }

    public Header(C0516 c0516, String str) {
        C0516 c0517 = new C0516(str.getBytes(AbstractC0580.UTF_8));
        c0517.f2203 = str;
        this(c0516, c0517);
    }

    public Header(String str, String str2) {
        C0516 c0516 = new C0516(str.getBytes(AbstractC0580.UTF_8));
        c0516.f2203 = str;
        C0516 c0517 = new C0516(str2.getBytes(AbstractC0580.UTF_8));
        c0517.f2203 = str2;
        this(c0516, c0517);
    }
}
