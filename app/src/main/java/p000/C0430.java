package p000;

import bsh.C0007;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0430 {

    public C0007 f1986;

    public int f1987;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0430) {
            C0430 c0430 = (C0430) obj;
            if (this.f1986 == c0430.f1986 && this.f1987 == c0430.f1987) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1987) + (this.f1986.hashCode() * 31);
    }
}
