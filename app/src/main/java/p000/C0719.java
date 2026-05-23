package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0719 {

    public final String f2728;

    public final List f2729;

    public C0719(String str, List list) {
        this.f2728 = str;
        this.f2729 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0719)) {
            return false;
        }
        C0719 c0719 = (C0719) obj;
        return AbstractC2207.m4087(this.f2728, c0719.f2728) && AbstractC2207.m4087(this.f2729, c0719.f2729);
    }

    public final int hashCode() {
        return this.f2729.hashCode() + (this.f2728.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("CleanData(name=");
        sb.append(this.f2728);
        sb.append(", pathList=");
        sb.append(this.f2729);
        sb.append(')');
        return sb.toString();
    }
}
