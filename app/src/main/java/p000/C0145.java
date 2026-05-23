package p000;

import com.umeng.analytics.pro.g;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0145 {

    public int f1144;

    public int f1145;

    public Object f1146;

    public int f1147;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0145)) {
                return false;
            }
            C0145 c0145 = (C0145) obj;
            int i = this.f1144;
            if (i != c0145.f1144) {
                return false;
            }
            if (i != 8 || Math.abs(this.f1147 - this.f1145) != 1 || this.f1147 != c0145.f1145 || this.f1145 != c0145.f1147) {
                if (this.f1147 != c0145.f1147 || this.f1145 != c0145.f1145) {
                    return false;
                }
                Object obj2 = this.f1146;
                if (obj2 != null) {
                    if (!obj2.equals(c0145.f1146)) {
                        return false;
                    }
                } else if (c0145.f1146 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f1144 * 31) + this.f1145) * 31) + this.f1147;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f1144;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f1145);
        sb.append("c:");
        sb.append(this.f1147);
        sb.append(",p:");
        sb.append(this.f1146);
        sb.append("]");
        return sb.toString();
    }
}
