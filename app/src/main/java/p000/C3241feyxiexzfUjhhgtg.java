package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3241feyxiexzfUjhhgtg implements InterfaceC0146Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C3241feyxiexzfUjhhgtg f10159Ujhhgtgfeyxiexzf = new C3241feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C0834feyxiexzfUjhhgtg f10160Ujhhgtgfeyxiexzf = new C0834feyxiexzfUjhhgtg("kotlin.time.Duration", C0839feyxiexzfUjhhgtg.f3317Ujhhgtgfeyxiexzf);

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC1121feyxiexzfUjhhgtg mo1106Ujhhgtgfeyxiexzf() {
        return f10160Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo1180Ujhhgtgfeyxiexzf(InterfaceC3091Ujhhgtgfeyxiexzf interfaceC3091Ujhhgtgfeyxiexzf) {
        C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg = C3246feyxiexzfUjhhgtg.f10184Ujhhgtgfeyxiexzf;
        String strMo2281feyxiexzfUjhhgtg = interfaceC3091Ujhhgtgfeyxiexzf.mo2281feyxiexzfUjhhgtg();
        try {
            long jM5189feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5189feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg);
            if (jM5189feyxiexzfUjhhgtg == C3246feyxiexzfUjhhgtg.f10187Ujhhgtgfeyxiexzf) {
                throw new IllegalStateException("invariant failed");
            }
            return new C3246feyxiexzfUjhhgtg(jM5189feyxiexzfUjhhgtg);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("Invalid ISO duration string format: '", strMo2281feyxiexzfUjhhgtg, "'."), e);
        }
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1107Ujhhgtgfeyxiexzf(InterfaceC3329Ujhhgtgfeyxiexzf interfaceC3329Ujhhgtgfeyxiexzf, Object obj) {
        long j;
        long j2 = ((C3246feyxiexzfUjhhgtg) obj).f10188Ujhhgtgfeyxiexzf;
        C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg = C3246feyxiexzfUjhhgtg.f10184Ujhhgtgfeyxiexzf;
        StringBuilder sb = new StringBuilder();
        if (j2 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z = true;
        if (j2 < 0) {
            j = ((-(j2 >> 1)) << 1) + ((long) (((int) j2) & 1));
            int i = AbstractC3242feyxiexzfUjhhgtg.f10161Ujhhgtgfeyxiexzf;
        } else {
            j = j2;
        }
        long jM4752Ujhhgtgfeyxiexzf = C3246feyxiexzfUjhhgtg.m4752Ujhhgtgfeyxiexzf(j, EnumC3244feyxiexzfUjhhgtg.HOURS);
        int iM4752Ujhhgtgfeyxiexzf = C3246feyxiexzfUjhhgtg.m4750Ujhhgtgfeyxiexzf(j) ? 0 : (int) (C3246feyxiexzfUjhhgtg.m4752Ujhhgtgfeyxiexzf(j, EnumC3244feyxiexzfUjhhgtg.MINUTES) % ((long) 60));
        int iM4752Ujhhgtgfeyxiexzf2 = C3246feyxiexzfUjhhgtg.m4750Ujhhgtgfeyxiexzf(j) ? 0 : (int) (C3246feyxiexzfUjhhgtg.m4752Ujhhgtgfeyxiexzf(j, EnumC3244feyxiexzfUjhhgtg.SECONDS) % ((long) 60));
        int iM4749Ujhhgtgfeyxiexzf = C3246feyxiexzfUjhhgtg.m4749Ujhhgtgfeyxiexzf(j);
        if (C3246feyxiexzfUjhhgtg.m4750Ujhhgtgfeyxiexzf(j2)) {
            jM4752Ujhhgtgfeyxiexzf = 9999999999999L;
        }
        boolean z2 = jM4752Ujhhgtgfeyxiexzf != 0;
        boolean z3 = (iM4752Ujhhgtgfeyxiexzf2 == 0 && iM4749Ujhhgtgfeyxiexzf == 0) ? false : true;
        if (iM4752Ujhhgtgfeyxiexzf == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(jM4752Ujhhgtgfeyxiexzf);
            sb.append('H');
        }
        if (z) {
            sb.append(iM4752Ujhhgtgfeyxiexzf);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            C3246feyxiexzfUjhhgtg.m4748Ujhhgtgfeyxiexzf(sb, iM4752Ujhhgtgfeyxiexzf2, iM4749Ujhhgtgfeyxiexzf, 9, "S", true);
        }
        interfaceC3329Ujhhgtgfeyxiexzf.mo2348Ujhhgtgfeyxiexzf(sb.toString());
    }
}
