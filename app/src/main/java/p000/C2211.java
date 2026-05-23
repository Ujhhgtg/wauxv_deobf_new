package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2211 {

    public final C3457 f7187;

    public final boolean equals(Object obj) {
        if (obj instanceof C2211) {
            return AbstractC2207.m4087(this.f7187, ((C2211) obj).f7187);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7187.hashCode();
    }

    public final String toString() {
        return "RequestKType(value=" + this.f7187 + ')';
    }
}
