package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᲁᲇᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1127 implements InterfaceC1767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1127 f4196 = new C1127();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2452 f4197 = new C2452("kotlin.time.Duration", C2450.f7812);

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return f4197;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        C0348 c0348 = C1125.f4190;
        String strMo2642 = interfaceC0978.mo2642();
        try {
            long jM4205 = AbstractC2235.m4205(strMo2642);
            if (jM4205 == C1125.f4193) {
                throw new IllegalStateException("invariant failed");
            }
            return new C1125(jM4205);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC1095.m2800("Invalid ISO duration string format: '", strMo2642, "'."), e);
        }
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        long j;
        long j2 = ((C1125) obj).f4194;
        C0348 c0348 = C1125.f4190;
        StringBuilder sb = new StringBuilder();
        if (j2 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z = true;
        if (j2 < 0) {
            j = ((-(j2 >> 1)) << 1) + ((long) (((int) j2) & 1));
            int i = AbstractC1126.f4195;
        } else {
            j = j2;
        }
        long jM2848 = C1125.m2848(j, EnumC1128.HOURS);
        int iM2848 = C1125.m2846(j) ? 0 : (int) (C1125.m2848(j, EnumC1128.MINUTES) % ((long) 60));
        int iM2849 = C1125.m2846(j) ? 0 : (int) (C1125.m2848(j, EnumC1128.SECONDS) % ((long) 60));
        int iM2845 = C1125.m2845(j);
        if (C1125.m2846(j2)) {
            jM2848 = 9999999999999L;
        }
        boolean z2 = jM2848 != 0;
        boolean z3 = (iM2849 == 0 && iM2845 == 0) ? false : true;
        if (iM2848 == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(jM2848);
            sb.append('H');
        }
        if (z) {
            sb.append(iM2848);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            C1125.m2844(sb, iM2849, iM2845, 9, "S", true);
        }
        interfaceC1207.mo2930(sb.toString());
    }
}
