package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2698 {

    public final String f8703;

    public final String f8704;

    public C2698(String str, String str2) {
        this.f8703 = str;
        this.f8704 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2698)) {
            return false;
        }
        C2698 c2698 = (C2698) obj;
        return AbstractC2207.m4087(this.f8703, c2698.f8703) && AbstractC2207.m4087(this.f8704, c2698.f8704);
    }

    public final int hashCode() {
        return this.f8704.hashCode() + (this.f8703.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("HideConfig(title=");
        sb.append(this.f8703);
        sb.append(", key=");
        return AbstractC1194.m2786(sb, this.f8704, ')');
    }
}
