package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1859 extends AbstractC2396 {

    public static final C1859 f6179 = new C1859(C1862.f6185);

    @Override // p000.AbstractC0056
    public final int mo928(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // p000.AbstractC0739, p000.AbstractC0056
    public final void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        C1858 c1858 = (C1858) obj;
        long jMo2240 = interfaceC0766.mo2240(this.f7659, i);
        c1858.mo1640(c1858.mo1641() + 1);
        long[] jArr = c1858.f6177;
        int i2 = c1858.f6178;
        c1858.f6178 = i2 + 1;
        jArr[i2] = jMo2240;
    }

    @Override // p000.AbstractC0056
    public final Object mo931(Object obj) {
        long[] jArr = (long[]) obj;
        C1858 c1858 = new C1858();
        c1858.f6177 = jArr;
        c1858.f6178 = jArr.length;
        c1858.mo1640(10);
        return c1858;
    }

    @Override // p000.AbstractC2396
    public final Object mo1642() {
        return new long[0];
    }

    @Override // p000.AbstractC2396
    public final void mo1643(InterfaceC0767 interfaceC0767, Object obj, int i) {
        long[] jArr = (long[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0767.mo2252(this.f7659, i2, jArr[i2]);
        }
    }
}
