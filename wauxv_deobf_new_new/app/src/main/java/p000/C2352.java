package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᲈᤞᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2352 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2358 f7573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f7574;

    public C2352(C2358 c2358, List list) {
        this.f7573 = c2358;
        this.f7574 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2352)) {
            return false;
        }
        C2352 c2352 = (C2352) obj;
        return this.f7573.equals(c2352.f7573) && this.f7574.equals(c2352.f7574);
    }

    public final int hashCode() {
        return this.f7574.hashCode() + (this.f7573.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("LoadedEmojiGroup(config=");
        sb.append(this.f7573);
        sb.append(", items=");
        sb.append(this.f7574);
        sb.append(')');
        return sb.toString();
    }
}
