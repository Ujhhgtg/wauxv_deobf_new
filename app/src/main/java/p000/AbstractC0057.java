package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0057 extends C1705 implements InterfaceC0842, InterfaceC0883 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC0877 f990;

    public AbstractC0057(InterfaceC0877 interfaceC0877, boolean z) {
        super(z);
        m3456((InterfaceC1698) interfaceC0877.mo942(C1133.f4207));
        this.f990 = interfaceC0877.mo941(this);
    }

    @Override // p000.InterfaceC0842
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo933(Object obj) {
        Throwable thM4594 = C2586.m4594(obj);
        if (thM4594 != null) {
            obj = new C0760(thM4594, false);
        }
        Object objM3460 = m3460(obj);
        if (objM3460 == AbstractC1458.f5186) {
            return;
        }
        mo2636(objM3460);
    }

    @Override // p000.InterfaceC0842
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC0877 mo934() {
        return this.f990;
    }

    @Override // p000.C1705
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String mo935() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p000.C1705
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void mo936(C0761 c0761) {
        AbstractC3681.m5328(this.f990, c0761);
    }

    @Override // p000.InterfaceC0883
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final InterfaceC0877 mo96() {
        return this.f990;
    }

    @Override // p000.C1705
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final void mo937(Object obj) {
        if (obj instanceof C0760) {
            C0760.f2860.get((C0760) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public final void m938(int i, AbstractC0057 abstractC0057, InterfaceC1429 interfaceC1429) {
        int iM4759 = AbstractC2784.m4759(i);
        Unit unit = Unit.INSTANCE;
        if (iM4759 == 0) {
            try {
                AbstractC2203.m4038(AbstractC2209.m4135(((AbstractC0370) interfaceC1429).mo1197(this, abstractC0057)), unit);
                return;
            } catch (Throwable th) {
                AbstractC2209.m4127(this, th);
                throw null;
            }
        }
        if (iM4759 != 1) {
            if (iM4759 == 2) {
                AbstractC2209.m4135(((AbstractC0370) interfaceC1429).mo1197(this, abstractC0057)).mo933(unit);
                return;
            }
            if (iM4759 != 3) {
                throw new C0761();
            }
            try {
                InterfaceC0877 interfaceC0877 = this.f990;
                Object objM5341 = AbstractC3681.m5341(interfaceC0877, null);
                try {
                    AbstractC3453.m4986(2, interfaceC1429);
                    Object objMo1196 = interfaceC1429.mo1196(abstractC0057, this);
                    AbstractC3681.m5337(interfaceC0877, objM5341);
                    if (objMo1196 != EnumC0884.f3325) {
                        mo933(objMo1196);
                    }
                } catch (Throwable th2) {
                    AbstractC3681.m5337(interfaceC0877, objM5341);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof C1071) {
                    th = ((C1071) th).f3885;
                }
                mo933(new C2585(th));
            }
        }
    }
}
