package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᛸᲁᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1706 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C1706 f5798 = new C1706();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1227 f5799;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2102 f5800;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0094 f5801;

    public C1706() {
        C1227 c1227 = new C1227(20);
        C2102 c2102 = AbstractC2209.f7185;
        this.f5799 = c1227;
        this.f5800 = c2102;
        this.f5801 = new C0094(14);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m3468(C0258 c0258, String str) {
        C0146 c0146M3963 = AbstractC2201.m3963(this, str);
        Object objMo2515 = new C2828(this, EnumC3672.OBJ, c0146M3963, (C0254) c0258.f1445).mo2515(c0258);
        if (c0146M3963.m1159() == 10) {
            return objMo2515;
        }
        C0146.m1152(c0146M3963, "Expected EOF after parsing, but had " + ((String) c0146M3963.f1154).charAt(c0146M3963.f1149 - 1) + " instead", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String m3469(C0258 c0258, Object obj) {
        char[] cArr;
        C0408 c0408 = new C0408((byte) 0, 7);
        C0591 c0591 = C0591.f2398;
        synchronized (c0591) {
            C0256 c0256 = (C0256) c0591.f2400;
            cArr = null;
            char[] cArr2 = (char[]) (c0256.isEmpty() ? null : c0256.removeLast());
            if (cArr2 != null) {
                c0591.f2399 -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c0408.f1922 = cArr;
        try {
            EnumC3672 enumC3672 = EnumC3672.OBJ;
            C2829[] c2829Arr = new C2829[EnumC3672.f11466.mo943()];
            this.f5799.getClass();
            new C2829(new C0452(c0408), this, enumC3672, c2829Arr).mo2798(c0258, obj);
            return c0408.toString();
        } finally {
            c0408.m1607();
        }
    }
}
