package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2210 {

    public final Object f7186;

    public /* synthetic */ C2210(Object obj) {
        this.f7186 = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2210) {
            return AbstractC2207.m4087(this.f7186, ((C2210) obj).f7186);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7186.hashCode();
    }

    public final String toString() {
        return "RequestGroup(value=" + this.f7186 + ')';
    }
}
