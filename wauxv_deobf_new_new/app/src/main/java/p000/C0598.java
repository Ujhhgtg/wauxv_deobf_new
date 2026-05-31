package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᲁᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0598 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2950 f2430;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0310 f2431;

    public C0598(C2950 c2950, C0310 c0310) {
        this.f2430 = c2950;
        this.f2431 = c0310;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0598)) {
            return false;
        }
        C0598 c0598 = (C0598) obj;
        return this.f2430.equals(c0598.f2430) && this.f2431.equals(c0598.f2431);
    }

    public final int hashCode() {
        return this.f2431.hashCode() + (this.f2430.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ActiveTabHost(tabLayout=");
        sb.append(this.f2430);
        sb.append(", refreshList=");
        sb.append(this.f2431);
        sb.append(')');
        return sb.toString();
    }
}
