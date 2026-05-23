package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3687 {

    public final C3682 f11585;

    public C3687(C3682 c3682) {
        this.f11585 = c3682;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3687) && AbstractC2207.m4087(this.f11585, ((C3687) obj).f11585);
    }

    public final int hashCode() {
        C3682 c3682 = this.f11585;
        if (c3682 == null) {
            return 0;
        }
        return c3682.hashCode();
    }

    public final String toString() {
        return "YukiHookResult(hookedMember=" + this.f11585 + ")";
    }
}
