package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᲁᤝᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2933 implements InterfaceC1780, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public InterfaceC1422 f9381;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public volatile Object f9382 = C1139.f4227;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f9383 = this;

    public C2933(InterfaceC1422 interfaceC1422) {
        this.f9381 = interfaceC1422;
    }

    private final Object writeReplace() {
        return new C1649(getValue());
    }

    @Override // p000.InterfaceC1780
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f9382;
        C1139 c1139 = C1139.f4227;
        if (obj != c1139) {
            return obj;
        }
        synchronized (this.f9383) {
            objInvoke = this.f9382;
            if (objInvoke == c1139) {
                objInvoke = this.f9381.invoke();
                this.f9382 = objInvoke;
                this.f9381 = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f9382 != C1139.f4227 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
