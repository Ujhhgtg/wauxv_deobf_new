package p000;

import android.text.TextUtils;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᤞᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2334 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2135 f7534 = new C2135(5);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object f7535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC2333 f7536;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f7537;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public volatile byte[] f7538;

    public C2334(String str, Object obj, InterfaceC2333 interfaceC2333) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f7537 = str;
        this.f7535 = obj;
        this.f7536 = interfaceC2333;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2334 m4293(Object obj, String str) {
        return new C2334(str, obj, f7534);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2334) {
            return this.f7537.equals(((C2334) obj).f7537);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7537.hashCode();
    }

    public final String toString() {
        return AbstractC2844.m4786(new StringBuilder("Option{key='"), this.f7537, "'}");
    }
}
