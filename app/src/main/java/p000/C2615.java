package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2615 {
    public static final C2614 Companion = new C2614();

    public String f8492;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2615) && AbstractC2207.m4087(this.f8492, ((C2615) obj).f8492);
    }

    public final int hashCode() {
        String str = this.f8492;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SKBuiltinString_t(string=");
        return AbstractC1194.m2786(sb, this.f8492, ')');
    }
}
