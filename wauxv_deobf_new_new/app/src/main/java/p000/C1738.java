package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᤝᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1738 extends AbstractC1446 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5871;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1738(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f5871 = i4;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        switch (this.f5871) {
            case 0:
                InterfaceC2715 interfaceC2715 = (InterfaceC2715) obj;
                int iIntValue = ((Number) obj2).intValue();
                C1739 c1739 = (C1739) this.f2224;
                c1739.getClass();
                boolean z = !interfaceC2715.mo3645(iIntValue) && interfaceC2715.mo3644(iIntValue).mo3638();
                c1739.f5873 = z;
                return Boolean.valueOf(z);
            default:
                InterfaceC2715 interfaceC2716 = (InterfaceC2715) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C2488 c2488 = (C2488) this.f2224;
                c2488.getClass();
                boolean z2 = false;
                if (!interfaceC2716.mo3645(iIntValue2)) {
                    InterfaceC2715 interfaceC2715Mo3644 = interfaceC2716.mo3644(iIntValue2);
                    AbstractC2236 abstractC2236Mo3640 = interfaceC2715Mo3644.mo3640();
                    if (AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9282) || AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9281)) {
                        c2488.f7886 = false;
                    } else if (interfaceC2715Mo3644.mo3638()) {
                        c2488.f7886 = true;
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }
}
