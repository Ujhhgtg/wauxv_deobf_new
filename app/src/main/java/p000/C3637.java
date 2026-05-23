package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3637 {

    public final String f11375;

    public final String f11376;

    public final C3618 f11377;

    public C3637(String str, String str2, C3618 c3618) {
        this.f11375 = str;
        this.f11376 = str2;
        this.f11377 = c3618;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3637)) {
            return false;
        }
        C3637 c3637 = (C3637) obj;
        return AbstractC2207.m4087(this.f11375, c3637.f11375) && AbstractC2207.m4087(this.f11376, c3637.f11376) && this.f11377.equals(c3637.f11377);
    }

    public final int hashCode() {
        return this.f11377.hashCode() + ((Integer.hashCode(0) + AbstractC1194.m2775(this.f11375.hashCode() * 31, 31, this.f11376)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("PrefItemBean(key=");
        sb.append(this.f11375);
        sb.append(", title=");
        sb.append(this.f11376);
        sb.append(", index=");
        sb.append(0);
        sb.append(", onClick=");
        sb.append(this.f11377);
        sb.append(')');
        return sb.toString();
    }
}
