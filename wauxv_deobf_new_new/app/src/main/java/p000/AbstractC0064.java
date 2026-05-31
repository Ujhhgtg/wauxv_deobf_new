package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0064 extends C1723 implements InterfaceC0841, InterfaceC0882 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC0876 f1055;

    public AbstractC0064(InterfaceC0876 interfaceC0876, boolean z) {
        super(z);
        m3624((InterfaceC1716) interfaceC0876.mo1086(C1139.f4219));
        this.f1055 = interfaceC0876.mo1085(this);
    }

    @Override // p000.InterfaceC0841
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo1077(Object obj) {
        Throwable thM4616 = C2642.m4616(obj);
        if (thM4616 != null) {
            obj = new C0757(thM4616, false);
        }
        Object objM3628 = m3628(obj);
        if (objM3628 == AbstractC1272.f4640) {
            return;
        }
        mo2762(objM3628);
    }

    @Override // p000.InterfaceC0841
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC0876 mo1078() {
        return this.f1055;
    }

    @Override // p000.C1723
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String mo1079() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p000.C1723
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void mo1080(C0758 c0758) {
        AbstractC2236.m4233(this.f1055, c0758);
    }

    @Override // p000.InterfaceC0882
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final InterfaceC0876 mo96() {
        return this.f1055;
    }

    @Override // p000.C1723
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final void mo1081(Object obj) {
        if (obj instanceof C0757) {
            C0757.f2860.get((C0757) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public final void m1082(int i, AbstractC0064 abstractC0064, InterfaceC1437 interfaceC1437) {
        int iM4792 = AbstractC2844.m4792(i);
        C3554 c3554 = C3554.UNIT;
        if (iM4792 == 0) {
            try {
                AbstractC2235.m4212(AbstractC1470.m3365(((AbstractC0345) interfaceC1437).mo1343(this, abstractC0064)), c3554);
                return;
            } catch (Throwable th) {
                AbstractC2234.m4164(this, th);
                throw null;
            }
        }
        if (iM4792 != 1) {
            if (iM4792 == 2) {
                AbstractC1470.m3365(((AbstractC0345) interfaceC1437).mo1343(this, abstractC0064)).mo1077(c3554);
                return;
            }
            if (iM4792 != 3) {
                throw new C0758();
            }
            try {
                InterfaceC0876 interfaceC0876 = this.f1055;
                Object objM4910 = AbstractC2902.m4910(interfaceC0876, null);
                try {
                    AbstractC2902.m4886(2, interfaceC1437);
                    Object objMo1342 = interfaceC1437.mo1342(abstractC0064, this);
                    AbstractC2902.m4899(interfaceC0876, objM4910);
                    if (objMo1342 != EnumC0883.f3332) {
                        mo1077(objMo1342);
                    }
                } catch (Throwable th2) {
                    AbstractC2902.m4899(interfaceC0876, objM4910);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof C1076) {
                    th = ((C1076) th).f3896;
                }
                mo1077(new C2641(th));
            }
        }
    }
}
