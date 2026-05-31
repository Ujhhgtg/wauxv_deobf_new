package p000;

import com.umeng.analytics.pro.g;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲁᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0153 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f1212;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f1213;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public Object f1214;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f1215;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0153)) {
                return false;
            }
            C0153 c0153 = (C0153) obj;
            int i = this.f1212;
            if (i != c0153.f1212) {
                return false;
            }
            if (i != 8 || Math.abs(this.f1215 - this.f1213) != 1 || this.f1215 != c0153.f1213 || this.f1213 != c0153.f1215) {
                if (this.f1215 != c0153.f1215 || this.f1213 != c0153.f1213) {
                    return false;
                }
                Object obj2 = this.f1214;
                if (obj2 != null) {
                    if (!obj2.equals(c0153.f1214)) {
                        return false;
                    }
                } else if (c0153.f1214 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f1212 * 31) + this.f1213) * 31) + this.f1215;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f1212;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = g.R;
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f1213);
        sb.append("c:");
        sb.append(this.f1215);
        sb.append(",p:");
        sb.append(this.f1214);
        sb.append("]");
        return sb.toString();
    }
}
