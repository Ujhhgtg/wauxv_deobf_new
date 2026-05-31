package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᛸᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1663 implements InterfaceC3466 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2648 f5623;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2848 f5624;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2581 f5625;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2582 f5626;

    public AbstractC1663(C2648 c2648, C2848 c2848, C2581 c2581, C2582 c2582) {
        if (c2648 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c2848 == null) {
            throw new NullPointerException("position == null");
        }
        if (c2582 == null) {
            throw new NullPointerException("sources == null");
        }
        this.f5623 = c2648;
        this.f5624 = c2848;
        this.f5625 = c2581;
        this.f5626 = c2582;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String strMo2530 = mo2530();
        StringBuilder sb = new StringBuilder(80);
        sb.append("Insn{");
        sb.append(this.f5624);
        sb.append(' ');
        sb.append(this.f5623);
        if (strMo2530 != null) {
            sb.append(' ');
            sb.append(strMo2530);
        }
        sb.append(" :: ");
        C2581 c2581 = this.f5625;
        if (c2581 != null) {
            sb.append(c2581);
            sb.append(" <- ");
        }
        sb.append(this.f5626);
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        String strMo2530 = mo2530();
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.f5624);
        sb.append(": ");
        C2648 c2648 = this.f5623;
        String string = c2648.f8362;
        if (string == null) {
            string = c2648.toString();
        }
        sb.append(string);
        if (strMo2530 != null) {
            sb.append("(");
            sb.append(strMo2530);
            sb.append(")");
        }
        C2581 c2581 = this.f5625;
        if (c2581 == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c2581.m4565(true));
        }
        sb.append(" <-");
        C2582 c2582 = this.f5626;
        int length = c2582.f4833.length;
        if (length == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < length; i++) {
                sb.append(" ");
                sb.append(((C2581) c2582.m3165(i)).m4565(true));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public abstract void mo3149(InterfaceC1662 interfaceC1662);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract InterfaceC3510 mo3150();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public String mo2530() {
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public abstract AbstractC1663 mo3151(C3505 c3505);
}
