package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛴᛳᛱUjhhgtgᛱᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1326feyxiexzfUjhhgtg extends AbstractC0246Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC1793feyxiexzfUjhhgtg[] f4804Ujhhgtgfeyxiexzf;

    public C1326feyxiexzfUjhhgtg(int i) {
        super(i != 0);
        this.f4804Ujhhgtgfeyxiexzf = new InterfaceC1793feyxiexzfUjhhgtg[i];
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            InterfaceC1793feyxiexzfUjhhgtg[] interfaceC1793feyxiexzfUjhhgtgArr = this.f4804Ujhhgtgfeyxiexzf;
            if (i >= interfaceC1793feyxiexzfUjhhgtgArr.length) {
                return sb.toString();
            }
            InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg = interfaceC1793feyxiexzfUjhhgtgArr[i];
            sb.append("locals[" + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i) + "]: " + (interfaceC1793feyxiexzfUjhhgtg == null ? "<invalid>" : interfaceC1793feyxiexzfUjhhgtg.toString()) + "\n");
            i++;
        }
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1394Ujhhgtgfeyxiexzf(C1045feyxiexzfUjhhgtg c1045feyxiexzfUjhhgtg) {
        int i = 0;
        while (true) {
            InterfaceC1793feyxiexzfUjhhgtg[] interfaceC1793feyxiexzfUjhhgtgArr = this.f4804Ujhhgtgfeyxiexzf;
            if (i >= interfaceC1793feyxiexzfUjhhgtgArr.length) {
                return;
            }
            InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg = interfaceC1793feyxiexzfUjhhgtgArr[i];
            c1045feyxiexzfUjhhgtg.m4861Ujhhgtgfeyxiexzf("locals[" + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i) + "]: " + (interfaceC1793feyxiexzfUjhhgtg == null ? "<invalid>" : interfaceC1793feyxiexzfUjhhgtg.toString()));
            i++;
        }
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final AbstractC0246Ujhhgtgfeyxiexzf mo1395Ujhhgtgfeyxiexzf() {
        InterfaceC1793feyxiexzfUjhhgtg[] interfaceC1793feyxiexzfUjhhgtgArr = this.f4804Ujhhgtgfeyxiexzf;
        C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg = new C1326feyxiexzfUjhhgtg(interfaceC1793feyxiexzfUjhhgtgArr.length);
        System.arraycopy(interfaceC1793feyxiexzfUjhhgtgArr, 0, c1326feyxiexzfUjhhgtg.f4804Ujhhgtgfeyxiexzf, 0, interfaceC1793feyxiexzfUjhhgtgArr.length);
        return c1326feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final InterfaceC1793feyxiexzfUjhhgtg mo1396Ujhhgtgfeyxiexzf(int i) {
        InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg = this.f4804Ujhhgtgfeyxiexzf[i];
        if (interfaceC1793feyxiexzfUjhhgtg != null) {
            return interfaceC1793feyxiexzfUjhhgtg;
        }
        throw new C1045feyxiexzfUjhhgtg("local " + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i) + ": invalid", null);
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo1398Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        InterfaceC1793feyxiexzfUjhhgtg[] interfaceC1793feyxiexzfUjhhgtgArr = this.f4804Ujhhgtgfeyxiexzf;
        int length = interfaceC1793feyxiexzfUjhhgtgArr.length;
        if (length == 0) {
            return;
        }
        m1729Ujhhgtgfeyxiexzf();
        C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtgM3122Ujhhgtgfeyxiexzf = c1784feyxiexzfUjhhgtg.m3122Ujhhgtgfeyxiexzf();
        for (int i = 0; i < length; i++) {
            if (interfaceC1793feyxiexzfUjhhgtgArr[i] == c1784feyxiexzfUjhhgtg) {
                interfaceC1793feyxiexzfUjhhgtgArr[i] = c1784feyxiexzfUjhhgtgM3122Ujhhgtgfeyxiexzf;
            }
        }
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final AbstractC0246Ujhhgtgfeyxiexzf mo1399Ujhhgtgfeyxiexzf(AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf) {
        return abstractC0246Ujhhgtgfeyxiexzf instanceof C1326feyxiexzfUjhhgtg ? m2854Ujhhgtgfeyxiexzf((C1326feyxiexzfUjhhgtg) abstractC0246Ujhhgtgfeyxiexzf) : abstractC0246Ujhhgtgfeyxiexzf.mo1399Ujhhgtgfeyxiexzf(this);
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public final C0242Ujhhgtgfeyxiexzf mo1400Ujhhgtgfeyxiexzf(AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf, int i) {
        return new C0242Ujhhgtgfeyxiexzf(this.f4804Ujhhgtgfeyxiexzf.length).mo1400Ujhhgtgfeyxiexzf(abstractC0246Ujhhgtgfeyxiexzf, i);
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final void mo1401Ujhhgtgfeyxiexzf(int i, InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg) {
        int i2;
        InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg2;
        m1729Ujhhgtgfeyxiexzf();
        try {
            InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtgMo2413Ujhhgtgfeyxiexzf = interfaceC1793feyxiexzfUjhhgtg.mo2413Ujhhgtgfeyxiexzf();
            if (i < 0) {
                throw new IndexOutOfBoundsException("idx < 0");
            }
            boolean zM3125Ujhhgtgfeyxiexzf = interfaceC1793feyxiexzfUjhhgtgMo2413Ujhhgtgfeyxiexzf.getType().m3125Ujhhgtgfeyxiexzf();
            InterfaceC1793feyxiexzfUjhhgtg[] interfaceC1793feyxiexzfUjhhgtgArr = this.f4804Ujhhgtgfeyxiexzf;
            if (zM3125Ujhhgtgfeyxiexzf) {
                interfaceC1793feyxiexzfUjhhgtgArr[i + 1] = null;
            }
            interfaceC1793feyxiexzfUjhhgtgArr[i] = interfaceC1793feyxiexzfUjhhgtgMo2413Ujhhgtgfeyxiexzf;
            if (i == 0 || (interfaceC1793feyxiexzfUjhhgtg2 = interfaceC1793feyxiexzfUjhhgtgArr[(i2 = i - 1)]) == null || !interfaceC1793feyxiexzfUjhhgtg2.getType().m3125Ujhhgtgfeyxiexzf()) {
                return;
            }
            interfaceC1793feyxiexzfUjhhgtgArr[i2] = null;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public final void mo1402Ujhhgtgfeyxiexzf(C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        mo1401Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf, c0961feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final C1326feyxiexzfUjhhgtg m2854Ujhhgtgfeyxiexzf(C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg) {
        try {
            return AbstractC3594Ujhhgtgfeyxiexzf.m5183Ujhhgtgfeyxiexzf(this, c1326feyxiexzfUjhhgtg);
        } catch (C1045feyxiexzfUjhhgtg e) {
            e.m4861Ujhhgtgfeyxiexzf("underlay locals:");
            mo1394Ujhhgtgfeyxiexzf(e);
            e.m4861Ujhhgtgfeyxiexzf("overlay locals:");
            c1326feyxiexzfUjhhgtg.mo1394Ujhhgtgfeyxiexzf(e);
            throw e;
        }
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final C1326feyxiexzfUjhhgtg mo1397Ujhhgtgfeyxiexzf() {
        return this;
    }
}
