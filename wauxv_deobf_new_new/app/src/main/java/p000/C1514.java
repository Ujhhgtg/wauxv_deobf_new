package p000;

import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲈᲁᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1514 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f5341;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ArrayList f5342;

    public C1514(String str, ArrayList arrayList) {
        this.f5341 = str;
        this.f5342 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1514)) {
            return false;
        }
        C1514 c1514 = (C1514) obj;
        return AbstractC1469.m3322(this.f5341, c1514.f5341) && this.f5342.equals(c1514.f5342);
    }

    public final int hashCode() {
        return this.f5342.hashCode() + (this.f5341.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("LabelTab(title=");
        sb.append(this.f5341);
        sb.append(", contacts=");
        sb.append(this.f5342);
        sb.append(')');
        return sb.toString();
    }
}
