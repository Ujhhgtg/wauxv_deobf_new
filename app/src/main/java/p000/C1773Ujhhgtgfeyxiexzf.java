package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛴᛱUjhhgtgᛱ能不能要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1773Ujhhgtgfeyxiexzf extends AbstractC1335feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final InterfaceC1790feyxiexzfUjhhgtg f5949Ujhhgtgfeyxiexzf;

    public C1773Ujhhgtgfeyxiexzf(InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg) {
        super(4, (interfaceC1790feyxiexzfUjhhgtg.size() * 2) + 4);
        this.f5949Ujhhgtgfeyxiexzf = interfaceC1790feyxiexzfUjhhgtg;
    }

    public final int hashCode() {
        C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg = C1163feyxiexzfUjhhgtg.f4359Ujhhgtgfeyxiexzf;
        InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg = this.f5949Ujhhgtgfeyxiexzf;
        int size = interfaceC1790feyxiexzfUjhhgtg.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + interfaceC1790feyxiexzfUjhhgtg.getType(i).f6017Ujhhgtgfeyxiexzf.hashCode();
        }
        return iHashCode;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1274Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10265Ujhhgtgfeyxiexzf;
        InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg = this.f5949Ujhhgtgfeyxiexzf;
        int size = interfaceC1790feyxiexzfUjhhgtg.size();
        for (int i = 0; i < size; i++) {
            c0395Ujhhgtgfeyxiexzf.m1673Ujhhgtgfeyxiexzf(interfaceC1790feyxiexzfUjhhgtg.getType(i));
        }
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final EnumC0704Ujhhgtgfeyxiexzf mo1275Ujhhgtgfeyxiexzf() {
        return EnumC0704Ujhhgtgfeyxiexzf.f2896Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo2622Ujhhgtgfeyxiexzf(AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg) {
        InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg = ((C1773Ujhhgtgfeyxiexzf) abstractC1335feyxiexzfUjhhgtg).f5949Ujhhgtgfeyxiexzf;
        C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg = C1163feyxiexzfUjhhgtg.f4359Ujhhgtgfeyxiexzf;
        InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg2 = this.f5949Ujhhgtgfeyxiexzf;
        int size = interfaceC1790feyxiexzfUjhhgtg2.size();
        int size2 = interfaceC1790feyxiexzfUjhhgtg.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = interfaceC1790feyxiexzfUjhhgtg2.getType(i).f6017Ujhhgtgfeyxiexzf.compareTo(interfaceC1790feyxiexzfUjhhgtg.getType(i).f6017Ujhhgtgfeyxiexzf);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1276Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10265Ujhhgtgfeyxiexzf;
        InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg = this.f5949Ujhhgtgfeyxiexzf;
        int size = interfaceC1790feyxiexzfUjhhgtg.size();
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, m2858Ujhhgtgfeyxiexzf() + " type_list");
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "  size: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(size)));
            for (int i = 0; i < size; i++) {
                C1784feyxiexzfUjhhgtg type = interfaceC1790feyxiexzfUjhhgtg.getType(i);
                c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(2, "  " + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(c0395Ujhhgtgfeyxiexzf.m1668Ujhhgtgfeyxiexzf(type)) + " // " + type.mo1392Ujhhgtgfeyxiexzf());
            }
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(size);
        for (int i2 = 0; i2 < size; i2++) {
            c2608Ujhhgtgfeyxiexzf.m3895Ujhhgtgfeyxiexzf(c0395Ujhhgtgfeyxiexzf.m1668Ujhhgtgfeyxiexzf(interfaceC1790feyxiexzfUjhhgtg.getType(i2)));
        }
    }
}
