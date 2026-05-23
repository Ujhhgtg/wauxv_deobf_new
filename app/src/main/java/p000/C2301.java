package p000;

import android.text.TextUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2301 {

    public static final C2102 f7412 = new C2102(5);

    public final Object f7413;

    public final InterfaceC2300 f7414;

    public final String f7415;

    public volatile byte[] f7416;

    public C2301(String str, Object obj, InterfaceC2300 interfaceC2300) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f7415 = str;
        this.f7413 = obj;
        this.f7414 = interfaceC2300;
    }

    public static C2301 m4164(Object obj, String str) {
        return new C2301(str, obj, f7412);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2301) {
            return this.f7415.equals(((C2301) obj).f7415);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7415.hashCode();
    }

    public final String toString() {
        return AbstractC2784.m4752(new StringBuilder("Option{key='"), this.f7415, "'}");
    }
}
