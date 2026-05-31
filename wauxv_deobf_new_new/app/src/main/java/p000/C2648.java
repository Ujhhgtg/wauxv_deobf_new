package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᛸᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2648 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f8356;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3505 f8357;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC3510 f8358;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC3510 f8359;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f8360;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean f8361;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f8362;

    public C2648(int i, C3505 c3505, InterfaceC3510 interfaceC3510, InterfaceC3510 interfaceC3511, int i2, boolean z, String str) {
        if (c3505 == null) {
            throw new NullPointerException("result == null");
        }
        if (interfaceC3510 == null) {
            throw new NullPointerException("sources == null");
        }
        if (interfaceC3511 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i2 < 1 || i2 > 6) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i2, "invalid branchingness: "));
        }
        if (interfaceC3511.size() != 0 && i2 != 6) {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
        this.f8356 = i;
        this.f8357 = c3505;
        this.f8358 = interfaceC3510;
        this.f8359 = interfaceC3511;
        this.f8360 = i2;
        this.f8361 = z;
        this.f8362 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2648)) {
            return false;
        }
        C2648 c2648 = (C2648) obj;
        return this.f8356 == c2648.f8356 && this.f8360 == c2648.f8360 && this.f8357 == c2648.f8357 && this.f8358.equals(c2648.f8358) && this.f8359.equals(c2648.f8359);
    }

    public final int hashCode() {
        return this.f8359.hashCode() + ((this.f8358.hashCode() + AbstractC2647.m4621(((this.f8356 * 31) + this.f8360) * 31, 31, this.f8357.f11064)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("Rop{");
        sb.append(AbstractC0972.m2598(this.f8356));
        C3505 c3505 = C3505.f11034;
        C3505 c3506 = this.f8357;
        if (c3506 != c3505) {
            sb.append(" ");
            sb.append(c3506);
        } else {
            sb.append(" .");
        }
        sb.append(" <-");
        InterfaceC3510 interfaceC3510 = this.f8358;
        int size = interfaceC3510.size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(' ');
                sb.append(interfaceC3510.getType(i));
            }
        }
        if (this.f8361) {
            sb.append(" call");
        }
        InterfaceC3510 interfaceC3511 = this.f8359;
        int size2 = interfaceC3511.size();
        if (size2 != 0) {
            sb.append(" throws");
            for (int i2 = 0; i2 < size2; i2++) {
                sb.append(' ');
                if (interfaceC3511.getType(i2) == C3505.f11045) {
                    sb.append("<any>");
                } else {
                    sb.append(interfaceC3511.getType(i2));
                }
            }
        } else {
            int i3 = this.f8360;
            if (i3 == 1) {
                sb.append(" flows");
            } else if (i3 == 2) {
                sb.append(" returns");
            } else if (i3 == 3) {
                sb.append(" gotos");
            } else if (i3 == 4) {
                sb.append(" ifs");
            } else if (i3 != 5) {
                sb.append(" ".concat(AbstractC2902.m4905(i3)));
            } else {
                sb.append(" switches");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m4629() {
        return this.f8359.size() != 0;
    }

    public C2648(int i, C3505 c3505, InterfaceC3510 interfaceC3510, int i2, String str) {
        this(i, c3505, interfaceC3510, C2879.f9192, i2, false, str);
    }

    public C2648(int i, C3505 c3505, InterfaceC3510 interfaceC3510, String str) {
        this(i, c3505, interfaceC3510, C2879.f9192, 1, false, str);
    }

    public C2648(int i, C3505 c3505, InterfaceC3510 interfaceC3510, InterfaceC3510 interfaceC3511, String str) {
        this(i, c3505, interfaceC3510, interfaceC3511, 6, false, str);
    }

    public C2648(int i, C2879 c2879, InterfaceC3510 interfaceC3510) {
        this(i, C3505.f11034, c2879, interfaceC3510, 6, true, null);
    }
}
