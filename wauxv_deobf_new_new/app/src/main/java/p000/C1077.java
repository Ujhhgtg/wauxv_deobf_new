package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᲇᤞᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1077 extends AbstractC1079 implements InterfaceC0884, InterfaceC0841 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3897 = AtomicReferenceFieldUpdater.newUpdater(C1077.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final AbstractC0877 f3898;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final AbstractC0842 f3899;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Object f3900;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Object f3901;

    public C1077(AbstractC0877 abstractC0877, AbstractC0842 abstractC0842) {
        super(-1);
        this.f3898 = abstractC0877;
        this.f3899 = abstractC0842;
        this.f3900 = AbstractC2235.f7286;
        this.f3901 = abstractC0842.f3256.mo1084(0, AbstractC2902.f9275);
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3898 + ", " + AbstractC0972.m2607(this.f3899) + ']';
    }

    @Override // p000.InterfaceC0884
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC0884 mo1596() {
        return this.f3899;
    }

    @Override // p000.InterfaceC0841
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1077(Object obj) throws C1076 {
        Throwable thM4616 = C2642.m4616(obj);
        Object c0757 = thM4616 == null ? obj : new C0757(thM4616, false);
        AbstractC0877 abstractC0877 = this.f3898;
        AbstractC0842 abstractC0842 = this.f3899;
        InterfaceC0876 interfaceC0876 = abstractC0842.f3256;
        try {
            if (abstractC0877.mo2510(interfaceC0876)) {
                this.f3900 = c0757;
                this.f3903 = 0;
                AbstractC2235.m4213(abstractC0877, interfaceC0876, this);
                return;
            }
            AbstractC1237 abstractC1237M4983 = AbstractC2979.m4983();
            if (abstractC1237M4983.f4461 >= JSONWriter.MASK_IGNORE_NON_FIELD_GETTER) {
                this.f3900 = c0757;
                this.f3903 = 0;
                C0266 c0266 = abstractC1237M4983.f4463;
                if (c0266 == null) {
                    c0266 = new C0266();
                    abstractC1237M4983.f4463 = c0266;
                }
                c0266.addLast(this);
                return;
            }
            abstractC1237M4983.m2996(true);
            try {
                Object objM4910 = AbstractC2902.m4910(interfaceC0876, this.f3901);
                try {
                    abstractC0842.mo1077(obj);
                    AbstractC2902.m4899(interfaceC0876, objM4910);
                    while (abstractC1237M4983.m2997()) {
                    }
                } catch (Throwable th) {
                    AbstractC2902.m4899(interfaceC0876, objM4910);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    m2763(th2);
                } finally {
                    abstractC1237M4983.m2995();
                }
            }
        } catch (Throwable th3) {
            throw new C1076(th3, abstractC0877, interfaceC0876);
        }
    }

    @Override // p000.InterfaceC0841
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final InterfaceC0876 mo1078() {
        return this.f3899.f3256;
    }

    @Override // p000.AbstractC1079
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final Object mo2039() {
        Object obj = this.f3900;
        this.f3900 = AbstractC2235.f7286;
        return obj;
    }

    @Override // p000.AbstractC1079
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final InterfaceC0841 mo2036() {
        return this;
    }
}
