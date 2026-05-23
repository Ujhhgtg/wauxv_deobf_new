package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1072 extends AbstractC1074 implements InterfaceC0885, InterfaceC0842 {

    public static final /* synthetic */ AtomicReferenceFieldUpdater f3886 = AtomicReferenceFieldUpdater.newUpdater(C1072.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public final AbstractC0878 f3887;

    public final AbstractC0843 f3888;

    public Object f3889;

    public final Object f3890;

    public C1072(AbstractC0878 abstractC0878, AbstractC0843 abstractC0843) {
        super(-1);
        this.f3887 = abstractC0878;
        this.f3888 = abstractC0843;
        this.f3889 = AbstractC2203.f7166;
        this.f3890 = abstractC0843.f3249.mo940(0, AbstractC3681.f11563);
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3887 + ", " + AbstractC0968.m2489(this.f3888) + ']';
    }

    @Override // p000.InterfaceC0885
    public final InterfaceC0885 mo1491() {
        return this.f3888;
    }

    @Override // p000.InterfaceC0842
    public final void mo933(Object obj) throws C1071 {
        Throwable thM4594 = C2586.m4594(obj);
        Object c0760 = thM4594 == null ? obj : new C0760(thM4594, false);
        AbstractC0878 abstractC0878 = this.f3887;
        AbstractC0843 abstractC0843 = this.f3888;
        InterfaceC0877 interfaceC0877 = abstractC0843.f3249;
        try {
            if (abstractC0878.mo2393(interfaceC0877)) {
                this.f3889 = c0760;
                this.f3892 = 0;
                AbstractC2203.m4039(abstractC0878, interfaceC0877, this);
                return;
            }
            AbstractC1235 abstractC1235M4921 = AbstractC2920.m4921();
            if (abstractC1235M4921.f4463 >= 4294967296L) {
                this.f3889 = c0760;
                this.f3892 = 0;
                C0256 c0256 = abstractC1235M4921.f4465;
                if (c0256 == null) {
                    c0256 = new C0256();
                    abstractC1235M4921.f4465 = c0256;
                }
                c0256.addLast(this);
                return;
            }
            abstractC1235M4921.m2874(true);
            try {
                Object objM5341 = AbstractC3681.m5341(interfaceC0877, this.f3890);
                try {
                    abstractC0843.mo933(obj);
                    AbstractC3681.m5337(interfaceC0877, objM5341);
                    while (abstractC1235M4921.m2875()) {
                    }
                } catch (Throwable th) {
                    AbstractC3681.m5337(interfaceC0877, objM5341);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    m2637(th2);
                } finally {
                    abstractC1235M4921.m2873();
                }
            }
        } catch (Throwable th3) {
            throw new C1071(th3, abstractC0878, interfaceC0877);
        }
    }

    @Override // p000.InterfaceC0842
    public final InterfaceC0877 mo934() {
        return this.f3888.f3249;
    }

    @Override // p000.AbstractC1074
    public final Object mo1944() {
        Object obj = this.f3889;
        this.f3889 = AbstractC2203.f7166;
        return obj;
    }

    @Override // p000.AbstractC1074
    public final InterfaceC0842 mo1941() {
        return this;
    }
}
