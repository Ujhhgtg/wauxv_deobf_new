package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲁᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0714 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f2722;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f2723;

    public C0714(String str, List list) {
        this.f2722 = str;
        this.f2723 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0714)) {
            return false;
        }
        C0714 c0714 = (C0714) obj;
        return AbstractC1469.m3322(this.f2722, c0714.f2722) && AbstractC1469.m3322(this.f2723, c0714.f2723);
    }

    public final int hashCode() {
        return this.f2723.hashCode() + (this.f2722.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("CleanData(name=");
        sb.append(this.f2722);
        sb.append(", pathList=");
        sb.append(this.f2723);
        sb.append(')');
        return sb.toString();
    }
}
