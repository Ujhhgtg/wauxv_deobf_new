package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᲇᲈᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1079 extends AbstractRunnableC2957 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3903;

    public AbstractC1079(int i) {
        super(false, 0L);
        this.f3903 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C1077 c1077 = (C1077) mo2036();
            AbstractC0842 abstractC0842 = c1077.f3899;
            InterfaceC0876 interfaceC0876 = abstractC0842.f3256;
            Object objM4910 = AbstractC2902.m4910(interfaceC0876, c1077.f3901);
            InterfaceC1716 interfaceC1716 = null;
            C3550 c3550M4189 = objM4910 != AbstractC2902.f9274 ? AbstractC2234.m4189(abstractC0842, interfaceC0876, objM4910) : null;
            try {
                Object objMo2039 = mo2039();
                Throwable thMo2037 = mo2037(objMo2039);
                if (thMo2037 == null) {
                    int i = this.f3903;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        interfaceC1716 = (InterfaceC1716) interfaceC0876.mo1086(C1139.f4219);
                    }
                }
                if (interfaceC1716 != null && !interfaceC1716.mo3605()) {
                    CancellationException cancellationExceptionMo3608 = interfaceC1716.mo3608();
                    mo2035(cancellationExceptionMo3608);
                    abstractC0842.mo1077(new C2641(cancellationExceptionMo3608));
                } else if (thMo2037 != null) {
                    abstractC0842.mo1077(new C2641(thMo2037));
                } else {
                    abstractC0842.mo1077(mo2038(objMo2039));
                }
            } finally {
                if (c3550M4189 == null || c3550M4189.m5104()) {
                    AbstractC2902.m4899(interfaceC0876, objM4910);
                }
            }
        } catch (C1076 e) {
            AbstractC2236.m4233(mo2036().mo1078(), e.f3896);
        } catch (Throwable th) {
            m2763(th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public abstract InterfaceC0841 mo2036();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public Throwable mo2037(Object obj) {
        C0757 c0757 = obj instanceof C0757 ? (C0757) obj : null;
        if (c0757 != null) {
            return c0757.f2861;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m2763(Throwable th) {
        AbstractC2236.m4233(mo2036().mo1078(), new C0885("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public abstract Object mo2039();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo2035(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public Object mo2038(Object obj) {
        return obj;
    }
}
