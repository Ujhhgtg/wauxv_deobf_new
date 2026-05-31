package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᲈᲇᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1757 extends AbstractC2640 implements InterfaceC1438 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f5895;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public /* synthetic */ C0981 f5896;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0383 f5897;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1757(C0383 c0383, InterfaceC0841 interfaceC0841) {
        super(3, interfaceC0841);
        this.f5897 = c0383;
    }

    @Override // p000.InterfaceC1438
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo2135(Object obj, Object obj2, Object obj3) {
        C1757 c1757 = new C1757(this.f5897, (InterfaceC0841) obj3);
        c1757.f5896 = (C0981) obj;
        return c1757.mo1344(C3554.UNIT);
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Throwable {
        C0383 c0383 = this.f5897;
        C0154 c0154 = (C0154) c0383.f1894;
        C0981 c0981 = this.f5896;
        int i = this.f5895;
        if (i == 0) {
            AbstractC1470.m3372(obj);
            byte bM1326 = c0154.m1326();
            if (bM1326 == 1) {
                return c0383.m1712(true);
            }
            if (bM1326 == 0) {
                return c0383.m1712(false);
            }
            if (bM1326 != 6) {
                if (bM1326 == 8) {
                    return c0383.m1711();
                }
                C0154.m1298(c0154, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f5896 = null;
            this.f5895 = 1;
            obj = C0383.m1707(c0383, c0981, this);
            EnumC0883 enumC0883 = EnumC0883.f3332;
            if (obj == enumC0883) {
                return enumC0883;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1470.m3372(obj);
        }
        return (AbstractC1736) obj;
    }
}
