package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᛸᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1927 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object f6344;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f6345;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f6346;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f6347;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f6348;

    public C1927(C1215 c1215) {
        this.f6344 = (C1928) c1215.f4374;
        this.f6345 = (C2135) c1215.f4376;
        this.f6346 = (InterfaceC1819) c1215.f4377;
        this.f6347 = (C1224) c1215.f4378;
        this.f6348 = (C1477) c1215.f4380;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2766 m3878() {
        return new C2766("stack mismatch: illegal top-of-stack for opcode", null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C3505 m3879(C3505 c3505, C3505 c3506) {
        C3505 c3507;
        C3505 c3508 = C3505.f11035;
        if (c3506 == c3508) {
            return c3505.m5036() ? c3508 : c3505.m5027();
        }
        if (c3505 == C3505.f11042 && c3506.m5032() && c3506.m5030().m5036()) {
            return c3506;
        }
        return (c3505 == C3505.f11027 && c3506 == (c3507 = C3505.f11055)) ? c3507 : c3505.m5027();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m3880(String str) {
        InterfaceC2002 interfaceC2002 = ((C0766) this.f6346).f2867;
        throw new C2766("ERROR in " + interfaceC2002.mo2359().f3408.mo1360() + "." + interfaceC2002.mo2361().mo1360() + ": " + str, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object[] m3881() {
        return ((C1571) this.f6346).f5461.args;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public void m3882(Throwable th) {
        ((C1572) this.f6348).mo1342(th, Boolean.TRUE);
    }

    public C1927(C1571 c1571, C1571 c1572, C1571 c1573, C1572 c1574, C1572 c1575) {
        this.f6344 = c1571;
        this.f6345 = c1572;
        this.f6346 = c1573;
        this.f6347 = c1574;
        this.f6348 = c1575;
    }

    public C1927(C2655 c2655, C0766 c0766, C0561 c0561) {
        InterfaceC2002 interfaceC2002 = c0766.f2867;
        this.f6344 = c2655;
        this.f6345 = c0766.f2869.f1569;
        this.f6346 = c0766;
        this.f6347 = c0766.f2871;
        this.f6348 = new C0776(this);
        C1046 c1046 = c0766.f2868;
        c1046.m2737();
        if ((c1046.f3806 & 512) == 0 || interfaceC2002.mo2361().f3381.f3385.equals("<clinit>") || C0561.m2099(24)) {
            return;
        }
        String str = String.format("defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s", (interfaceC2002.mo2360() & 8) != 0 ? "static" : "default", 24, 13, interfaceC2002.mo2359().f3408.mo1360(), interfaceC2002.mo2361().mo1360());
        c0561.f2319.println("WARNING in " + interfaceC2002.mo2359().f3408.mo1360() + "." + interfaceC2002.mo2361().mo1360() + ": " + str);
    }
}
