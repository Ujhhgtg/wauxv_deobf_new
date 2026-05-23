package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲈᛸᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1649 implements InterfaceC3407 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2590 f5588;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2788 f5589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2525 f5590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2526 f5591;

    public AbstractC1649(C2590 c2590, C2788 c2788, C2525 c2525, C2526 c2526) {
        if (c2590 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c2788 == null) {
            throw new NullPointerException("position == null");
        }
        if (c2526 == null) {
            throw new NullPointerException("sources == null");
        }
        this.f5588 = c2590;
        this.f5589 = c2788;
        this.f5590 = c2525;
        this.f5591 = c2526;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String strMo2413 = mo2413();
        StringBuilder sb = new StringBuilder(80);
        sb.append("Insn{");
        sb.append(this.f5589);
        sb.append(' ');
        sb.append(this.f5588);
        if (strMo2413 != null) {
            sb.append(' ');
            sb.append(strMo2413);
        }
        sb.append(" :: ");
        C2525 c2525 = this.f5590;
        if (c2525 != null) {
            sb.append(c2525);
            sb.append(" <- ");
        }
        sb.append(this.f5591);
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1214() {
        String strMo2413 = mo2413();
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.f5589);
        sb.append(": ");
        C2590 c2590 = this.f5588;
        String string = c2590.f8210;
        if (string == null) {
            string = c2590.toString();
        }
        sb.append(string);
        if (strMo2413 != null) {
            sb.append("(");
            sb.append(strMo2413);
            sb.append(")");
        }
        C2525 c2525 = this.f5590;
        if (c2525 == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c2525.m4543(true));
        }
        sb.append(" <-");
        C2526 c2526 = this.f5591;
        int length = c2526.f4836.length;
        if (length == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < length; i++) {
                sb.append(" ");
                sb.append(((C2525) c2526.m3062(i)).m4543(true));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public abstract void mo3046(InterfaceC1648 interfaceC1648);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract InterfaceC3454 mo3047();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public String mo2413() {
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public abstract AbstractC1649 mo3048(C3448 c3448);
}
