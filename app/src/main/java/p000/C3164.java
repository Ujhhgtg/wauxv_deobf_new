package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3164 {
    public static final C3163 Companion = new C3163();

    public final C2989 f10144;

    public /* synthetic */ C3164(int i, C2989 c2989) {
        if (1 == (i & 1)) {
            this.f10144 = c2989;
        } else {
            AbstractC1270.m2997(i, 1, C3162.f10143.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3164) && AbstractC2207.m4087(this.f10144, ((C3164) obj).f10144);
    }

    public final int hashCode() {
        C2989 c2989 = this.f10144;
        if (c2989 == null) {
            return 0;
        }
        return c2989.hashCode();
    }

    public final String toString() {
        return "mh4Proto(d=" + this.f10144 + ')';
    }
}
