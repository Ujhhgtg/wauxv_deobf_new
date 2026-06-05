package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛳ能不能ᛱfeyxiexzfᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0200Ujhhgtgfeyxiexzf extends AbstractC1335feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final EnumC0704Ujhhgtgfeyxiexzf f1449Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final AbstractC1090feyxiexzfUjhhgtg f1450Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final AbstractC0691Ujhhgtgfeyxiexzf f1451Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f1452Ujhhgtgfeyxiexzf;

    public C0200Ujhhgtgfeyxiexzf(EnumC0704Ujhhgtgfeyxiexzf enumC0704Ujhhgtgfeyxiexzf, AbstractC1090feyxiexzfUjhhgtg abstractC1090feyxiexzfUjhhgtg, AbstractC0691Ujhhgtgfeyxiexzf abstractC0691Ujhhgtgfeyxiexzf, AbstractC0691Ujhhgtgfeyxiexzf abstractC0691Ujhhgtgfeyxiexzf2, int i) {
        super(4, 12);
        if (enumC0704Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("type == null");
        }
        if (abstractC0691Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("firstItem == null");
        }
        if (abstractC0691Ujhhgtgfeyxiexzf2 == null) {
            throw new NullPointerException("lastItem == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("itemCount <= 0");
        }
        this.f1449Ujhhgtgfeyxiexzf = enumC0704Ujhhgtgfeyxiexzf;
        this.f1450Ujhhgtgfeyxiexzf = abstractC1090feyxiexzfUjhhgtg;
        this.f1451Ujhhgtgfeyxiexzf = abstractC0691Ujhhgtgfeyxiexzf;
        this.f1452Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m1273Ujhhgtgfeyxiexzf(AbstractC1090feyxiexzfUjhhgtg[] abstractC1090feyxiexzfUjhhgtgArr, C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf) {
        if (abstractC1090feyxiexzfUjhhgtgArr == null) {
            throw new NullPointerException("sections == null");
        }
        if (c0295Ujhhgtgfeyxiexzf.f1744Ujhhgtgfeyxiexzf.size() != 0) {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arrayList = new ArrayList(50);
        for (AbstractC1090feyxiexzfUjhhgtg abstractC1090feyxiexzfUjhhgtg : abstractC1090feyxiexzfUjhhgtgArr) {
            int i = 0;
            EnumC0704Ujhhgtgfeyxiexzf enumC0704Ujhhgtgfeyxiexzf = null;
            AbstractC0691Ujhhgtgfeyxiexzf abstractC0691Ujhhgtgfeyxiexzf = null;
            AbstractC0691Ujhhgtgfeyxiexzf abstractC0691Ujhhgtgfeyxiexzf2 = null;
            for (AbstractC0691Ujhhgtgfeyxiexzf abstractC0691Ujhhgtgfeyxiexzf3 : abstractC1090feyxiexzfUjhhgtg.mo1505Ujhhgtgfeyxiexzf()) {
                EnumC0704Ujhhgtgfeyxiexzf enumC0704UjhhgtgfeyxiexzfMo1275Ujhhgtgfeyxiexzf = abstractC0691Ujhhgtgfeyxiexzf3.mo1275Ujhhgtgfeyxiexzf();
                if (enumC0704UjhhgtgfeyxiexzfMo1275Ujhhgtgfeyxiexzf != enumC0704Ujhhgtgfeyxiexzf) {
                    if (i != 0) {
                        arrayList.add(new C0200Ujhhgtgfeyxiexzf(enumC0704Ujhhgtgfeyxiexzf, abstractC1090feyxiexzfUjhhgtg, abstractC0691Ujhhgtgfeyxiexzf, abstractC0691Ujhhgtgfeyxiexzf2, i));
                    }
                    i = 0;
                    abstractC0691Ujhhgtgfeyxiexzf = abstractC0691Ujhhgtgfeyxiexzf3;
                    enumC0704Ujhhgtgfeyxiexzf = enumC0704UjhhgtgfeyxiexzfMo1275Ujhhgtgfeyxiexzf;
                }
                i++;
                abstractC0691Ujhhgtgfeyxiexzf2 = abstractC0691Ujhhgtgfeyxiexzf3;
            }
            if (i != 0) {
                arrayList.add(new C0200Ujhhgtgfeyxiexzf(enumC0704Ujhhgtgfeyxiexzf, abstractC1090feyxiexzfUjhhgtg, abstractC0691Ujhhgtgfeyxiexzf, abstractC0691Ujhhgtgfeyxiexzf2, i));
            } else if (abstractC1090feyxiexzfUjhhgtg == c0295Ujhhgtgfeyxiexzf) {
                arrayList.add(new C0200Ujhhgtgfeyxiexzf(c0295Ujhhgtgfeyxiexzf));
            }
        }
        c0295Ujhhgtgfeyxiexzf.m1509Ujhhgtgfeyxiexzf(new C1942Ujhhgtgfeyxiexzf(EnumC0704Ujhhgtgfeyxiexzf.f2895Ujhhgtgfeyxiexzf, arrayList));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C0200Ujhhgtgfeyxiexzf.class.getName());
        sb.append('{');
        sb.append(this.f1450Ujhhgtgfeyxiexzf.toString());
        sb.append(' ');
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f1449Ujhhgtgfeyxiexzf.f2911Ujhhgtgfeyxiexzf, '}');
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final EnumC0704Ujhhgtgfeyxiexzf mo1275Ujhhgtgfeyxiexzf() {
        return EnumC0704Ujhhgtgfeyxiexzf.f2906feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void mo1276Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        EnumC0704Ujhhgtgfeyxiexzf enumC0704Ujhhgtgfeyxiexzf = this.f1449Ujhhgtgfeyxiexzf;
        int i = enumC0704Ujhhgtgfeyxiexzf.f2909Ujhhgtgfeyxiexzf;
        AbstractC1090feyxiexzfUjhhgtg abstractC1090feyxiexzfUjhhgtg = this.f1450Ujhhgtgfeyxiexzf;
        AbstractC0691Ujhhgtgfeyxiexzf abstractC0691Ujhhgtgfeyxiexzf = this.f1451Ujhhgtgfeyxiexzf;
        int iM2561Ujhhgtgfeyxiexzf = abstractC0691Ujhhgtgfeyxiexzf == null ? abstractC1090feyxiexzfUjhhgtg.m2561Ujhhgtgfeyxiexzf() : abstractC1090feyxiexzfUjhhgtg.mo1504Ujhhgtgfeyxiexzf(abstractC0691Ujhhgtgfeyxiexzf);
        boolean zM3888Ujhhgtgfeyxiexzf = c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf();
        int i2 = this.f1452Ujhhgtgfeyxiexzf;
        if (zM3888Ujhhgtgfeyxiexzf) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, m2858Ujhhgtgfeyxiexzf() + ' ' + enumC0704Ujhhgtgfeyxiexzf.f2910Ujhhgtgfeyxiexzf + " map");
            StringBuilder sb = new StringBuilder("  type:   ");
            sb.append(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i));
            sb.append(" // ");
            sb.append(enumC0704Ujhhgtgfeyxiexzf.toString());
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(2, sb.toString());
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(2, "  unused: 0");
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "  size:   ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i2)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "  offset: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf)));
        }
        c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(i);
        c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(0);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(i2);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf);
    }

    public C0200Ujhhgtgfeyxiexzf(C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf) {
        super(4, 12);
        if (c0295Ujhhgtgfeyxiexzf != null) {
            this.f1449Ujhhgtgfeyxiexzf = EnumC0704Ujhhgtgfeyxiexzf.f2895Ujhhgtgfeyxiexzf;
            this.f1450Ujhhgtgfeyxiexzf = c0295Ujhhgtgfeyxiexzf;
            this.f1451Ujhhgtgfeyxiexzf = null;
            this.f1452Ujhhgtgfeyxiexzf = 1;
            return;
        }
        throw new NullPointerException("section == null");
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void mo1274Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
    }
}
