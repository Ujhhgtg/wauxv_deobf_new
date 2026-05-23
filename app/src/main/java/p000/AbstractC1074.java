package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᲈᛸᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1074 extends AbstractRunnableC2898 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f3892;

    public AbstractC1074(int i) {
        super(false, 0L);
        this.f3892 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C1072 c1072 = (C1072) mo1941();
            AbstractC0843 abstractC0843 = c1072.f3888;
            InterfaceC0877 interfaceC0877 = abstractC0843.f3249;
            Object objM5341 = AbstractC3681.m5341(interfaceC0877, c1072.f3890);
            InterfaceC1698 interfaceC1698 = null;
            C3493 c3493M5012 = objM5341 != AbstractC3681.f11562 ? AbstractC3453.m5012(abstractC0843, interfaceC0877, objM5341) : null;
            try {
                Object objMo1944 = mo1944();
                Throwable thMo1942 = mo1942(objMo1944);
                if (thMo1942 == null) {
                    int i = this.f3892;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        interfaceC1698 = (InterfaceC1698) interfaceC0877.mo942(C1133.f4207);
                    }
                }
                if (interfaceC1698 != null && !interfaceC1698.mo3437()) {
                    CancellationException cancellationExceptionMo3440 = interfaceC1698.mo3440();
                    mo1940(cancellationExceptionMo3440);
                    abstractC0843.mo933(new C2585(cancellationExceptionMo3440));
                } else if (thMo1942 != null) {
                    abstractC0843.mo933(new C2585(thMo1942));
                } else {
                    abstractC0843.mo933(mo1943(objMo1944));
                }
            } finally {
                if (c3493M5012 == null || c3493M5012.m5092()) {
                    AbstractC3681.m5337(interfaceC0877, objM5341);
                }
            }
        } catch (C1071 e) {
            AbstractC3681.m5328(mo1941().mo934(), e.f3885);
        } catch (Throwable th) {
            m2637(th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public abstract InterfaceC0842 mo1941();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public Throwable mo1942(Object obj) {
        C0760 c0760 = obj instanceof C0760 ? (C0760) obj : null;
        if (c0760 != null) {
            return c0760.f2861;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m2637(Throwable th) {
        AbstractC3681.m5328(mo1941().mo934(), new C0886("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public abstract Object mo1944();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo1940(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public Object mo1943(Object obj) {
        return obj;
    }
}
