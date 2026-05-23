package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᲇᛸᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1121 implements InterfaceC1743 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1121 f4185 = new C1121();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2399 f4186 = new C2399("kotlin.time.Duration", C2397.f7668);

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        return f4186;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        C0373 c0373 = C1119.f4179;
        String strMo2518 = interfaceC0974.mo2518();
        try {
            long jM5336 = AbstractC3681.m5336(strMo2518);
            if (jM5336 == C1119.f4182) {
                throw new IllegalStateException("invariant failed");
            }
            return new C1119(jM5336);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC1194.m2785("Invalid ISO duration string format: '", strMo2518, "'."), e);
        }
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        long j;
        long j2 = ((C1119) obj).f4183;
        C0373 c0373 = C1119.f4179;
        StringBuilder sb = new StringBuilder();
        if (j2 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z = true;
        if (j2 < 0) {
            j = ((-(j2 >> 1)) << 1) + ((long) (((int) j2) & 1));
            int i = AbstractC1120.f4184;
        } else {
            j = j2;
        }
        long jM2699 = C1119.m2699(j, EnumC1122.HOURS);
        int iM2699 = C1119.m2697(j) ? 0 : (int) (C1119.m2699(j, EnumC1122.MINUTES) % ((long) 60));
        int iM26910 = C1119.m2697(j) ? 0 : (int) (C1119.m2699(j, EnumC1122.SECONDS) % ((long) 60));
        int iM2696 = C1119.m2696(j);
        if (C1119.m2697(j2)) {
            jM2699 = 9999999999999L;
        }
        boolean z2 = jM2699 != 0;
        boolean z3 = (iM26910 == 0 && iM2696 == 0) ? false : true;
        if (iM2699 == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(jM2699);
            sb.append('H');
        }
        if (z) {
            sb.append(iM2699);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            C1119.m2695(sb, iM26910, iM2696, 9, "S", true);
        }
        interfaceC1206.mo2808(sb.toString());
    }
}
