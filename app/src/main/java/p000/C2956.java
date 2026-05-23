package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2956 {
    public static final C2955 Companion = new C2955();

    public final String f9457;

    public /* synthetic */ C2956(int i, String str) {
        if (1 == (i & 1)) {
            this.f9457 = str;
        } else {
            AbstractC1270.m2997(i, 1, C2954.f9456.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2956) && AbstractC2207.m4087(this.f9457, ((C2956) obj).f9457);
    }

    public final int hashCode() {
        String str = this.f9457;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinderContactProto(username=");
        return AbstractC1194.m2786(sb, this.f9457, ')');
    }
}
