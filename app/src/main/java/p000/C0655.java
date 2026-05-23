package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤝᲀᲁᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0655 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f2515;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f2516;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC1414 f2517;

    public C0655(int i, String str, InterfaceC1414 interfaceC1414) {
        this.f2515 = i;
        this.f2516 = str;
        this.f2517 = interfaceC1414;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0655)) {
            return false;
        }
        C0655 c0655 = (C0655) obj;
        return this.f2515 == c0655.f2515 && AbstractC2207.m4087(this.f2516, c0655.f2516) && AbstractC2207.m4087(this.f2517, c0655.f2517);
    }

    public final int hashCode() {
        return this.f2517.hashCode() + AbstractC1194.m2775(Integer.hashCode(this.f2515) * 31, 31, this.f2516);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("MenuBean(iconId=");
        sb.append(this.f2515);
        sb.append(", title=");
        sb.append(this.f2516);
        sb.append(", onClick=");
        sb.append(this.f2517);
        sb.append(')');
        return sb.toString();
    }
}
