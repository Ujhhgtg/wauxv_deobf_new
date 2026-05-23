package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2590 {

    public final int f8204;

    public final C3448 f8205;

    public final InterfaceC3454 f8206;

    public final InterfaceC3454 f8207;

    public final int f8208;

    public final boolean f8209;

    public final String f8210;

    public C2590(int i, C3448 c3448, InterfaceC3454 interfaceC3454, InterfaceC3454 interfaceC3455, int i2, boolean z, String str) {
        if (c3448 == null) {
            throw new NullPointerException("result == null");
        }
        if (interfaceC3454 == null) {
            throw new NullPointerException("sources == null");
        }
        if (interfaceC3455 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i2 < 1 || i2 > 6) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i2, "invalid branchingness: "));
        }
        if (interfaceC3455.size() != 0 && i2 != 6) {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
        this.f8204 = i;
        this.f8205 = c3448;
        this.f8206 = interfaceC3454;
        this.f8207 = interfaceC3455;
        this.f8208 = i2;
        this.f8209 = z;
        this.f8210 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2590)) {
            return false;
        }
        C2590 c2590 = (C2590) obj;
        return this.f8204 == c2590.f8204 && this.f8208 == c2590.f8208 && this.f8205 == c2590.f8205 && this.f8206.equals(c2590.f8206) && this.f8207.equals(c2590.f8207);
    }

    public final int hashCode() {
        return this.f8207.hashCode() + ((this.f8206.hashCode() + AbstractC1194.m2775(((this.f8204 * 31) + this.f8208) * 31, 31, this.f8205.f10904)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("Rop{");
        sb.append(AbstractC2207.m4104(this.f8204));
        C3448 c3448 = C3448.f10874;
        C3448 c3449 = this.f8205;
        if (c3449 != c3448) {
            sb.append(" ");
            sb.append(c3449);
        } else {
            sb.append(" .");
        }
        sb.append(" <-");
        InterfaceC3454 interfaceC3454 = this.f8206;
        int size = interfaceC3454.size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(' ');
                sb.append(interfaceC3454.getType(i));
            }
        }
        if (this.f8209) {
            sb.append(" call");
        }
        InterfaceC3454 interfaceC3455 = this.f8207;
        int size2 = interfaceC3455.size();
        if (size2 != 0) {
            sb.append(" throws");
            for (int i2 = 0; i2 < size2; i2++) {
                sb.append(' ');
                if (interfaceC3455.getType(i2) == C3448.f10885) {
                    sb.append("<any>");
                } else {
                    sb.append(interfaceC3455.getType(i2));
                }
            }
        } else {
            int i3 = this.f8208;
            if (i3 == 1) {
                sb.append(" flows");
            } else if (i3 == 2) {
                sb.append(" returns");
            } else if (i3 == 3) {
                sb.append(" gotos");
            } else if (i3 == 4) {
                sb.append(" ifs");
            } else if (i3 != 5) {
                sb.append(" ".concat(AbstractC1460.m3222(i3)));
            } else {
                sb.append(" switches");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean m4599() {
        return this.f8207.size() != 0;
    }

    public C2590(int i, C3448 c3448, InterfaceC3454 interfaceC3454, int i2, String str) {
        this(i, c3448, interfaceC3454, C2819.f9030, i2, false, str);
    }

    public C2590(int i, C3448 c3448, InterfaceC3454 interfaceC3454, String str) {
        this(i, c3448, interfaceC3454, C2819.f9030, 1, false, str);
    }

    public C2590(int i, C3448 c3448, InterfaceC3454 interfaceC3454, InterfaceC3454 interfaceC3455, String str) {
        this(i, c3448, interfaceC3454, interfaceC3455, 6, false, str);
    }

    public C2590(int i, C2819 c2819, InterfaceC3454 interfaceC3454) {
        this(i, C3448.f10874, c2819, interfaceC3454, 6, true, null);
    }
}
