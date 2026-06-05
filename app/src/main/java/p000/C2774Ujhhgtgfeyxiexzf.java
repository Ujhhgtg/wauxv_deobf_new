package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2774Ujhhgtgfeyxiexzf extends AbstractC3196feyxiexzfUjhhgtg implements InterfaceC3704Ujhhgtgfeyxiexzf, InterfaceC3747feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8770Ujhhgtgfeyxiexzf = AtomicIntegerFieldUpdater.newUpdater(C2774Ujhhgtgfeyxiexzf.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8771Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C2774Ujhhgtgfeyxiexzf.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8772Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C2774Ujhhgtgfeyxiexzf.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC3704Ujhhgtgfeyxiexzf f8773Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final InterfaceC3739feyxiexzfUjhhgtg f8774Ujhhgtgfeyxiexzf;

    public C2774Ujhhgtgfeyxiexzf(InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf) {
        super(1);
        this.f8773Ujhhgtgfeyxiexzf = interfaceC3704Ujhhgtgfeyxiexzf;
        this.f8774Ujhhgtgfeyxiexzf = interfaceC3704Ujhhgtgfeyxiexzf.mo2414Ujhhgtgfeyxiexzf();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C3011Ujhhgtgfeyxiexzf.f9361Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static void m4048Ujhhgtgfeyxiexzf(C2644feyxiexzfUjhhgtg c2644feyxiexzfUjhhgtg, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c2644feyxiexzfUjhhgtg + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static void m4049Ujhhgtgfeyxiexzf(C2774Ujhhgtgfeyxiexzf c2774Ujhhgtgfeyxiexzf, Object obj, int i) throws C3198feyxiexzfUjhhgtg {
        Object c2892feyxiexzfUjhhgtg;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8771Ujhhgtgfeyxiexzf;
            Object obj2 = atomicReferenceFieldUpdater.get(c2774Ujhhgtgfeyxiexzf);
            if (!(obj2 instanceof InterfaceC1271feyxiexzfUjhhgtg)) {
                if (obj2 instanceof C2775Ujhhgtgfeyxiexzf) {
                    if (C2775Ujhhgtgfeyxiexzf.f8775Ujhhgtgfeyxiexzf.compareAndSet((C2775Ujhhgtgfeyxiexzf) obj2, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            InterfaceC1271feyxiexzfUjhhgtg interfaceC1271feyxiexzfUjhhgtg = (InterfaceC1271feyxiexzfUjhhgtg) obj2;
            if (!(obj instanceof C2874Ujhhgtgfeyxiexzf) && ((i == 1 || i == 2) && (interfaceC1271feyxiexzfUjhhgtg instanceof C2644feyxiexzfUjhhgtg))) {
                c2892feyxiexzfUjhhgtg = new C2892feyxiexzfUjhhgtg(obj, interfaceC1271feyxiexzfUjhhgtg instanceof C2644feyxiexzfUjhhgtg ? (C2644feyxiexzfUjhhgtg) interfaceC1271feyxiexzfUjhhgtg : null, null, 16);
            } else {
                c2892feyxiexzfUjhhgtg = obj;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c2774Ujhhgtgfeyxiexzf, obj2, c2892feyxiexzfUjhhgtg)) {
                    if (!c2774Ujhhgtgfeyxiexzf.m4060Ujhhgtgfeyxiexzf()) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8772Ujhhgtgfeyxiexzf;
                        InterfaceC3227feyxiexzfUjhhgtg interfaceC3227feyxiexzfUjhhgtg = (InterfaceC3227feyxiexzfUjhhgtg) atomicReferenceFieldUpdater2.get(c2774Ujhhgtgfeyxiexzf);
                        if (interfaceC3227feyxiexzfUjhhgtg != null) {
                            interfaceC3227feyxiexzfUjhhgtg.mo2039Ujhhgtgfeyxiexzf();
                            atomicReferenceFieldUpdater2.set(c2774Ujhhgtgfeyxiexzf, C1270feyxiexzfUjhhgtg.f4645Ujhhgtgfeyxiexzf);
                        }
                    }
                    c2774Ujhhgtgfeyxiexzf.m4057Ujhhgtgfeyxiexzf(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c2774Ujhhgtgfeyxiexzf) == obj2);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo2038Ujhhgtgfeyxiexzf());
        sb.append('(');
        sb.append(AbstractC3085Ujhhgtgfeyxiexzf.m4571Ujhhgtgfeyxiexzf(this.f8773Ujhhgtgfeyxiexzf));
        sb.append("){");
        Object obj = f8771Ujhhgtgfeyxiexzf.get(this);
        if (obj instanceof InterfaceC1271feyxiexzfUjhhgtg) {
            str = "Active";
        } else {
            str = obj instanceof C2775Ujhhgtgfeyxiexzf ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC3085Ujhhgtgfeyxiexzf.m4563Ujhhgtgfeyxiexzf(this));
        return sb.toString();
    }

    @Override // p000.InterfaceC3747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC3747feyxiexzfUjhhgtg mo2553Ujhhgtgfeyxiexzf() {
        InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf = this.f8773Ujhhgtgfeyxiexzf;
        if (interfaceC3704Ujhhgtgfeyxiexzf instanceof InterfaceC3747feyxiexzfUjhhgtg) {
            return (InterfaceC3747feyxiexzfUjhhgtg) interfaceC3704Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    @Override // p000.AbstractC3196feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo4050Ujhhgtgfeyxiexzf(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8771Ujhhgtgfeyxiexzf;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC1271feyxiexzfUjhhgtg) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C2874Ujhhgtgfeyxiexzf) {
                return;
            }
            C2644feyxiexzfUjhhgtg c2644feyxiexzfUjhhgtg = null;
            if (!(obj instanceof C2892feyxiexzfUjhhgtg)) {
                C2892feyxiexzfUjhhgtg c2892feyxiexzfUjhhgtg = new C2892feyxiexzfUjhhgtg(obj, c2644feyxiexzfUjhhgtg, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2892feyxiexzfUjhhgtg)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C2892feyxiexzfUjhhgtg c2892feyxiexzfUjhhgtg2 = (C2892feyxiexzfUjhhgtg) obj;
            if (c2892feyxiexzfUjhhgtg2.f9168Ujhhgtgfeyxiexzf != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C2892feyxiexzfUjhhgtg c2892feyxiexzfUjhhgtgM4276Ujhhgtgfeyxiexzf = C2892feyxiexzfUjhhgtg.m4276Ujhhgtgfeyxiexzf(c2892feyxiexzfUjhhgtg2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c2892feyxiexzfUjhhgtgM4276Ujhhgtgfeyxiexzf)) {
                    C2644feyxiexzfUjhhgtg c2644feyxiexzfUjhhgtg2 = c2892feyxiexzfUjhhgtg2.f9165Ujhhgtgfeyxiexzf;
                    if (c2644feyxiexzfUjhhgtg2 != null) {
                        m4055Ujhhgtgfeyxiexzf(c2644feyxiexzfUjhhgtg2, cancellationException);
                    }
                    InterfaceC3556feyxiexzfUjhhgtg interfaceC3556feyxiexzfUjhhgtg = c2892feyxiexzfUjhhgtg2.f9166Ujhhgtgfeyxiexzf;
                    if (interfaceC3556feyxiexzfUjhhgtg != null) {
                        Object obj2 = c2892feyxiexzfUjhhgtg2.f9164Ujhhgtgfeyxiexzf;
                        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg = this.f8774Ujhhgtgfeyxiexzf;
                        try {
                            interfaceC3556feyxiexzfUjhhgtg.mo1207Ujhhgtgfeyxiexzf(cancellationException, obj2, interfaceC3739feyxiexzfUjhhgtg);
                            return;
                        } catch (Throwable th) {
                            AbstractC0615Ujhhgtgfeyxiexzf.m1884Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, new C2870Ujhhgtgfeyxiexzf("Exception in resume onCancellation handler for " + this, th));
                            return;
                        }
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // p000.InterfaceC3704Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo2588Ujhhgtgfeyxiexzf(Object obj) throws C3198feyxiexzfUjhhgtg {
        Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(obj);
        if (thM2409Ujhhgtgfeyxiexzf != null) {
            obj = new C2874Ujhhgtgfeyxiexzf(thM2409Ujhhgtgfeyxiexzf, false);
        }
        m4049Ujhhgtgfeyxiexzf(this, obj, this.f9878Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC3196feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC3704Ujhhgtgfeyxiexzf mo4051Ujhhgtgfeyxiexzf() {
        return this.f8773Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3704Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final InterfaceC3739feyxiexzfUjhhgtg mo2414Ujhhgtgfeyxiexzf() {
        return this.f8774Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3196feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Throwable mo4052Ujhhgtgfeyxiexzf(Object obj) {
        Throwable thMo4052Ujhhgtgfeyxiexzf = super.mo4052Ujhhgtgfeyxiexzf(obj);
        if (thMo4052Ujhhgtgfeyxiexzf != null) {
            return thMo4052Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    @Override // p000.AbstractC3196feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Object mo4053Ujhhgtgfeyxiexzf(Object obj) {
        return obj instanceof C2892feyxiexzfUjhhgtg ? ((C2892feyxiexzfUjhhgtg) obj).f9164Ujhhgtgfeyxiexzf : obj;
    }

    @Override // p000.AbstractC3196feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Object mo4054Ujhhgtgfeyxiexzf() {
        return f8771Ujhhgtgfeyxiexzf.get(this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4055Ujhhgtgfeyxiexzf(C2644feyxiexzfUjhhgtg c2644feyxiexzfUjhhgtg, Throwable th) {
        try {
            switch (c2644feyxiexzfUjhhgtg.f8491Ujhhgtgfeyxiexzf) {
                case 0:
                    ((C0530Ujhhgtgfeyxiexzf) c2644feyxiexzfUjhhgtg.f8492Ujhhgtgfeyxiexzf).invoke(th);
                    break;
                default:
                    ((InterfaceC3227feyxiexzfUjhhgtg) c2644feyxiexzfUjhhgtg.f8492Ujhhgtgfeyxiexzf).mo2039Ujhhgtgfeyxiexzf();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC0615Ujhhgtgfeyxiexzf.m1884Ujhhgtgfeyxiexzf(this.f8774Ujhhgtgfeyxiexzf, new C2870Ujhhgtgfeyxiexzf("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m4056Ujhhgtgfeyxiexzf(Throwable th) throws C3198feyxiexzfUjhhgtg {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8771Ujhhgtgfeyxiexzf;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC1271feyxiexzfUjhhgtg)) {
                return;
            }
            boolean z = obj instanceof C2644feyxiexzfUjhhgtg;
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C2775Ujhhgtgfeyxiexzf c2775Ujhhgtgfeyxiexzf = new C2775Ujhhgtgfeyxiexzf(cancellationException, z);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c2775Ujhhgtgfeyxiexzf)) {
                    if (((InterfaceC1271feyxiexzfUjhhgtg) obj) instanceof C2644feyxiexzfUjhhgtg) {
                        m4055Ujhhgtgfeyxiexzf((C2644feyxiexzfUjhhgtg) obj, th);
                    }
                    if (!m4060Ujhhgtgfeyxiexzf()) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8772Ujhhgtgfeyxiexzf;
                        InterfaceC3227feyxiexzfUjhhgtg interfaceC3227feyxiexzfUjhhgtg = (InterfaceC3227feyxiexzfUjhhgtg) atomicReferenceFieldUpdater2.get(this);
                        if (interfaceC3227feyxiexzfUjhhgtg != null) {
                            interfaceC3227feyxiexzfUjhhgtg.mo2039Ujhhgtgfeyxiexzf();
                            atomicReferenceFieldUpdater2.set(this, C1270feyxiexzfUjhhgtg.f4645Ujhhgtgfeyxiexzf);
                        }
                    }
                    m4057Ujhhgtgfeyxiexzf(this.f9878Ujhhgtgfeyxiexzf);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4057Ujhhgtgfeyxiexzf(int i) throws C3198feyxiexzfUjhhgtg {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f8770Ujhhgtgfeyxiexzf;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf = this.f8773Ujhhgtgfeyxiexzf;
                if (!z && (interfaceC3704Ujhhgtgfeyxiexzf instanceof C3194feyxiexzfUjhhgtg)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f9878Ujhhgtgfeyxiexzf;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C3194feyxiexzfUjhhgtg c3194feyxiexzfUjhhgtg = (C3194feyxiexzfUjhhgtg) interfaceC3704Ujhhgtgfeyxiexzf;
                        AbstractC3740feyxiexzfUjhhgtg abstractC3740feyxiexzfUjhhgtg = c3194feyxiexzfUjhhgtg.f9873Ujhhgtgfeyxiexzf;
                        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg = c3194feyxiexzfUjhhgtg.f9874Ujhhgtgfeyxiexzf.f11746Ujhhgtgfeyxiexzf;
                        try {
                            if (abstractC3740feyxiexzfUjhhgtg.mo1826feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg)) {
                                AbstractC1264feyxiexzfUjhhgtg.m2806Ujhhgtgfeyxiexzf(abstractC3740feyxiexzfUjhhgtg, interfaceC3739feyxiexzfUjhhgtg, this);
                                return;
                            }
                            AbstractC3359feyxiexzfUjhhgtg abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf = AbstractC1990feyxiexzfUjhhgtg.m3343Ujhhgtgfeyxiexzf();
                            if (abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf.f10506Ujhhgtgfeyxiexzf >= JSONWriter.MASK_IGNORE_NON_FIELD_GETTER) {
                                C2377Ujhhgtgfeyxiexzf c2377Ujhhgtgfeyxiexzf = abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf.f10508Ujhhgtgfeyxiexzf;
                                if (c2377Ujhhgtgfeyxiexzf == null) {
                                    c2377Ujhhgtgfeyxiexzf = new C2377Ujhhgtgfeyxiexzf();
                                    abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf.f10508Ujhhgtgfeyxiexzf = c2377Ujhhgtgfeyxiexzf;
                                }
                                c2377Ujhhgtgfeyxiexzf.addLast(this);
                                return;
                            }
                            abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf.m4865feyxiexzfUjhhgtg(true);
                            try {
                                AbstractC3516feyxiexzfUjhhgtg.m5070Ujhhgtgfeyxiexzf(this, interfaceC3704Ujhhgtgfeyxiexzf, true);
                                do {
                                } while (abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf.m4866feyxiexzfUjhhgtg());
                            } catch (Throwable th) {
                                try {
                                    m4697Ujhhgtgfeyxiexzf(th);
                                } finally {
                                    abstractC3359feyxiexzfUjhhgtgM3343Ujhhgtgfeyxiexzf.m4864feyxiexzfUjhhgtg();
                                }
                            }
                            return;
                        } catch (Throwable th2) {
                            throw new C3198feyxiexzfUjhhgtg(th2, abstractC3740feyxiexzfUjhhgtg, interfaceC3739feyxiexzfUjhhgtg);
                        }
                    }
                }
                AbstractC3516feyxiexzfUjhhgtg.m5070Ujhhgtgfeyxiexzf(this, interfaceC3704Ujhhgtgfeyxiexzf, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public Throwable mo2037Ujhhgtgfeyxiexzf(C0731Ujhhgtgfeyxiexzf c0731Ujhhgtgfeyxiexzf) {
        return c0731Ujhhgtgfeyxiexzf.mo1761Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final Object m4058Ujhhgtgfeyxiexzf() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        InterfaceC0717Ujhhgtgfeyxiexzf interfaceC0717Ujhhgtgfeyxiexzf;
        boolean zM4060Ujhhgtgfeyxiexzf = m4060Ujhhgtgfeyxiexzf();
        do {
            atomicIntegerFieldUpdater = f8770Ujhhgtgfeyxiexzf;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM4060Ujhhgtgfeyxiexzf) {
                    m4061Ujhhgtgfeyxiexzf();
                }
                Object obj = f8771Ujhhgtgfeyxiexzf.get(this);
                if (obj instanceof C2874Ujhhgtgfeyxiexzf) {
                    throw ((C2874Ujhhgtgfeyxiexzf) obj).f9139Ujhhgtgfeyxiexzf;
                }
                int i3 = this.f9878Ujhhgtgfeyxiexzf;
                if ((i3 != 1 && i3 != 2) || (interfaceC0717Ujhhgtgfeyxiexzf = (InterfaceC0717Ujhhgtgfeyxiexzf) this.f8774Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10561Ujhhgtgfeyxiexzf)) == null || interfaceC0717Ujhhgtgfeyxiexzf.mo1758Ujhhgtgfeyxiexzf()) {
                    return mo4053Ujhhgtgfeyxiexzf(obj);
                }
                CancellationException cancellationExceptionMo1761Ujhhgtgfeyxiexzf = interfaceC0717Ujhhgtgfeyxiexzf.mo1761Ujhhgtgfeyxiexzf();
                mo4050Ujhhgtgfeyxiexzf(cancellationExceptionMo1761Ujhhgtgfeyxiexzf);
                throw cancellationExceptionMo1761Ujhhgtgfeyxiexzf;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC3227feyxiexzfUjhhgtg) f8772Ujhhgtgfeyxiexzf.get(this)) == null) {
            m4059Ujhhgtgfeyxiexzf();
        }
        if (zM4060Ujhhgtgfeyxiexzf) {
            m4061Ujhhgtgfeyxiexzf();
        }
        return EnumC3746Ujhhgtgfeyxiexzf.f11822Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final InterfaceC3227feyxiexzfUjhhgtg m4059Ujhhgtgfeyxiexzf() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0717Ujhhgtgfeyxiexzf interfaceC0717Ujhhgtgfeyxiexzf = (InterfaceC0717Ujhhgtgfeyxiexzf) this.f8774Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10561Ujhhgtgfeyxiexzf);
        if (interfaceC0717Ujhhgtgfeyxiexzf == null) {
            return null;
        }
        InterfaceC3227feyxiexzfUjhhgtg interfaceC3227feyxiexzfUjhhgtgM4566Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4566Ujhhgtgfeyxiexzf(interfaceC0717Ujhhgtgfeyxiexzf, true, new C2915Ujhhgtgfeyxiexzf(0, this));
        do {
            atomicReferenceFieldUpdater = f8772Ujhhgtgfeyxiexzf;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC3227feyxiexzfUjhhgtgM4566Ujhhgtgfeyxiexzf)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC3227feyxiexzfUjhhgtgM4566Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m4060Ujhhgtgfeyxiexzf() {
        if (this.f9878Ujhhgtgfeyxiexzf != 2) {
            return false;
        }
        C3194feyxiexzfUjhhgtg c3194feyxiexzfUjhhgtg = (C3194feyxiexzfUjhhgtg) this.f8773Ujhhgtgfeyxiexzf;
        c3194feyxiexzfUjhhgtg.getClass();
        return C3194feyxiexzfUjhhgtg.f9872Ujhhgtgfeyxiexzf.get(c3194feyxiexzfUjhhgtg) != null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public String mo2038Ujhhgtgfeyxiexzf() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m4061Ujhhgtgfeyxiexzf() throws C3198feyxiexzfUjhhgtg {
        InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf = this.f8773Ujhhgtgfeyxiexzf;
        Throwable th = null;
        C3194feyxiexzfUjhhgtg c3194feyxiexzfUjhhgtg = interfaceC3704Ujhhgtgfeyxiexzf instanceof C3194feyxiexzfUjhhgtg ? (C3194feyxiexzfUjhhgtg) interfaceC3704Ujhhgtgfeyxiexzf : null;
        if (c3194feyxiexzfUjhhgtg != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3194feyxiexzfUjhhgtg.f9872Ujhhgtgfeyxiexzf;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c3194feyxiexzfUjhhgtg);
                C3290Ujhhgtgfeyxiexzf c3290Ujhhgtgfeyxiexzf = AbstractC1264feyxiexzfUjhhgtg.f4630Ujhhgtgfeyxiexzf;
                if (obj != c3290Ujhhgtgfeyxiexzf) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c3194feyxiexzfUjhhgtg, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c3194feyxiexzfUjhhgtg) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c3194feyxiexzfUjhhgtg, c3290Ujhhgtgfeyxiexzf, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c3194feyxiexzfUjhhgtg) == c3290Ujhhgtgfeyxiexzf);
            }
            if (th == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8772Ujhhgtgfeyxiexzf;
            InterfaceC3227feyxiexzfUjhhgtg interfaceC3227feyxiexzfUjhhgtg = (InterfaceC3227feyxiexzfUjhhgtg) atomicReferenceFieldUpdater2.get(this);
            if (interfaceC3227feyxiexzfUjhhgtg != null) {
                interfaceC3227feyxiexzfUjhhgtg.mo2039Ujhhgtgfeyxiexzf();
                atomicReferenceFieldUpdater2.set(this, C1270feyxiexzfUjhhgtg.f4645Ujhhgtgfeyxiexzf);
            }
            m4056Ujhhgtgfeyxiexzf(th);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m4062Ujhhgtgfeyxiexzf(AbstractC3740feyxiexzfUjhhgtg abstractC3740feyxiexzfUjhhgtg) throws C3198feyxiexzfUjhhgtg {
        InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf = this.f8773Ujhhgtgfeyxiexzf;
        C3194feyxiexzfUjhhgtg c3194feyxiexzfUjhhgtg = interfaceC3704Ujhhgtgfeyxiexzf instanceof C3194feyxiexzfUjhhgtg ? (C3194feyxiexzfUjhhgtg) interfaceC3704Ujhhgtgfeyxiexzf : null;
        m4049Ujhhgtgfeyxiexzf(this, C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf, (c3194feyxiexzfUjhhgtg != null ? c3194feyxiexzfUjhhgtg.f9873Ujhhgtgfeyxiexzf : null) == abstractC3740feyxiexzfUjhhgtg ? 4 : this.f9878Ujhhgtgfeyxiexzf);
    }
}
