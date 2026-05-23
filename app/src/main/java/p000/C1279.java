package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1279 {
    public static final C1278 Companion = new C1278();

    public final String f4686;

    public /* synthetic */ C1279(int i, String str) {
        if (1 == (i & 1)) {
            this.f4686 = str;
        } else {
            AbstractC1270.m2997(i, 1, C1277.f4685.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1279) && AbstractC2207.m4087(this.f4686, ((C1279) obj).f4686);
    }

    public final int hashCode() {
        return this.f4686.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChatInfoProto(senderId=");
        return AbstractC1194.m2786(sb, this.f4686, ')');
    }
}
