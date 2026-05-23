package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3182 {
    public static final C3181 Companion = new C3181();

    public final Integer f10183;

    public /* synthetic */ C3182(int i, Integer num) {
        if (1 == (i & 1)) {
            this.f10183 = num;
        } else {
            AbstractC1270.m2997(i, 1, C3180.f10182.mo1363());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3182) && AbstractC2207.m4087(this.f10183, ((C3182) obj).f10183);
    }

    public final int hashCode() {
        Integer num = this.f10183;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ni1Proto(audience_no_privilege=");
        return AbstractC2668.m4677(sb, this.f10183, ')');
    }
}
