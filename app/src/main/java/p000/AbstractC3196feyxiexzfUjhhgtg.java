package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛲᛴᛳ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3196feyxiexzfUjhhgtg extends AbstractRunnableC1963Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f9878Ujhhgtgfeyxiexzf;

    public AbstractC3196feyxiexzfUjhhgtg(int i) {
        super(false, 0L);
        this.f9878Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C3194feyxiexzfUjhhgtg c3194feyxiexzfUjhhgtg = (C3194feyxiexzfUjhhgtg) mo4051Ujhhgtgfeyxiexzf();
            AbstractC3705feyxiexzfUjhhgtg abstractC3705feyxiexzfUjhhgtg = c3194feyxiexzfUjhhgtg.f9874Ujhhgtgfeyxiexzf;
            InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg = abstractC3705feyxiexzfUjhhgtg.f11746Ujhhgtgfeyxiexzf;
            Object objM2759Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2759Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, c3194feyxiexzfUjhhgtg.f9876Ujhhgtgfeyxiexzf);
            InterfaceC0717Ujhhgtgfeyxiexzf interfaceC0717Ujhhgtgfeyxiexzf = null;
            C1959feyxiexzfUjhhgtg c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg = objM2759Ujhhgtgfeyxiexzf != AbstractC1245feyxiexzfUjhhgtg.f4587Ujhhgtgfeyxiexzf ? AbstractC3594Ujhhgtgfeyxiexzf.m5198feyxiexzfUjhhgtg(abstractC3705feyxiexzfUjhhgtg, interfaceC3739feyxiexzfUjhhgtg, objM2759Ujhhgtgfeyxiexzf) : null;
            try {
                Object objMo4054Ujhhgtgfeyxiexzf = mo4054Ujhhgtgfeyxiexzf();
                Throwable thMo4052Ujhhgtgfeyxiexzf = mo4052Ujhhgtgfeyxiexzf(objMo4054Ujhhgtgfeyxiexzf);
                if (thMo4052Ujhhgtgfeyxiexzf == null) {
                    int i = this.f9878Ujhhgtgfeyxiexzf;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        interfaceC0717Ujhhgtgfeyxiexzf = (InterfaceC0717Ujhhgtgfeyxiexzf) interfaceC3739feyxiexzfUjhhgtg.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10561Ujhhgtgfeyxiexzf);
                    }
                }
                if (interfaceC0717Ujhhgtgfeyxiexzf != null && !interfaceC0717Ujhhgtgfeyxiexzf.mo1758Ujhhgtgfeyxiexzf()) {
                    CancellationException cancellationExceptionMo1761Ujhhgtgfeyxiexzf = interfaceC0717Ujhhgtgfeyxiexzf.mo1761Ujhhgtgfeyxiexzf();
                    mo4050Ujhhgtgfeyxiexzf(cancellationExceptionMo1761Ujhhgtgfeyxiexzf);
                    abstractC3705feyxiexzfUjhhgtg.mo2588Ujhhgtgfeyxiexzf(new C0919feyxiexzfUjhhgtg(cancellationExceptionMo1761Ujhhgtgfeyxiexzf));
                } else if (thMo4052Ujhhgtgfeyxiexzf != null) {
                    abstractC3705feyxiexzfUjhhgtg.mo2588Ujhhgtgfeyxiexzf(new C0919feyxiexzfUjhhgtg(thMo4052Ujhhgtgfeyxiexzf));
                } else {
                    abstractC3705feyxiexzfUjhhgtg.mo2588Ujhhgtgfeyxiexzf(mo4053Ujhhgtgfeyxiexzf(objMo4054Ujhhgtgfeyxiexzf));
                }
            } finally {
                if (c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg == null || c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg.m3295feyxiexzfUjhhgtg()) {
                    AbstractC1245feyxiexzfUjhhgtg.m2757Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, objM2759Ujhhgtgfeyxiexzf);
                }
            }
        } catch (C3198feyxiexzfUjhhgtg e) {
            AbstractC0615Ujhhgtgfeyxiexzf.m1884Ujhhgtgfeyxiexzf(mo4051Ujhhgtgfeyxiexzf().mo2414Ujhhgtgfeyxiexzf(), e.f9884Ujhhgtgfeyxiexzf);
        } catch (Throwable th) {
            m4697Ujhhgtgfeyxiexzf(th);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public abstract InterfaceC3704Ujhhgtgfeyxiexzf mo4051Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public Throwable mo4052Ujhhgtgfeyxiexzf(Object obj) {
        C2874Ujhhgtgfeyxiexzf c2874Ujhhgtgfeyxiexzf = obj instanceof C2874Ujhhgtgfeyxiexzf ? (C2874Ujhhgtgfeyxiexzf) obj : null;
        if (c2874Ujhhgtgfeyxiexzf != null) {
            return c2874Ujhhgtgfeyxiexzf.f9139Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m4697Ujhhgtgfeyxiexzf(Throwable th) {
        AbstractC0615Ujhhgtgfeyxiexzf.m1884Ujhhgtgfeyxiexzf(mo4051Ujhhgtgfeyxiexzf().mo2414Ujhhgtgfeyxiexzf(), new C3748feyxiexzfUjhhgtg("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public abstract Object mo4054Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public void mo4050Ujhhgtgfeyxiexzf(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public Object mo4053Ujhhgtgfeyxiexzf(Object obj) {
        return obj;
    }
}
