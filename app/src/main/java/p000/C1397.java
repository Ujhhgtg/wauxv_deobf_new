package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲀᛸᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1397 extends AbstractC2205 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1397 f5049 = new C1397();

    @Override // p000.AbstractC2205
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo3109() {
        return 3;
    }

    @Override // p000.AbstractC2205
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final String mo3111(AbstractC1351 abstractC1351) {
        return AbstractC2205.m4048(abstractC1351);
    }

    @Override // p000.AbstractC2205
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final String mo3112(AbstractC1351 abstractC1351) {
        return AbstractC2205.m4047(abstractC1351);
    }

    @Override // p000.AbstractC2205
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public final boolean mo3113(AbstractC0950 abstractC0950) {
        return (abstractC0950 instanceof C2896) && abstractC0950.f3470.f4836.length == 0;
    }

    @Override // p000.AbstractC2205
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public final void mo3114(C0519 c0519, AbstractC1351 abstractC1351) {
        int iM4903 = ((C2896) abstractC1351).m4903();
        c0519.m1840(AbstractC2205.m4066(abstractC1351, 0));
        c0519.m1840((short) iM4903);
        c0519.m1840((short) (iM4903 >> 16));
    }
}
