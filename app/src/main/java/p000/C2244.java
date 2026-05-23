package p000;

import java.security.MessageDigest;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2244 implements InterfaceC1749 {

    public final Object f7263;

    public C2244(Object obj) {
        AbstractC1460.m3210(obj, "Argument must not be null");
        this.f7263 = obj;
    }

    @Override // p000.InterfaceC1749
    public final boolean equals(Object obj) {
        if (obj instanceof C2244) {
            return this.f7263.equals(((C2244) obj).f7263);
        }
        return false;
    }

    @Override // p000.InterfaceC1749
    public final int hashCode() {
        return this.f7263.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f7263 + '}';
    }

    @Override // p000.InterfaceC1749
    public final void mo2001(MessageDigest messageDigest) {
        messageDigest.update(this.f7263.toString().getBytes(InterfaceC1749.f5849));
    }
}
