package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᲁᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2873 implements InterfaceC1758, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public InterfaceC1414 f9211;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public volatile Object f9212 = C1133.f4215;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f9213 = this;

    public C2873(InterfaceC1414 interfaceC1414) {
        this.f9211 = interfaceC1414;
    }

    @Override // p000.InterfaceC1758
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f9212;
        C1133 c1133 = C1133.f4215;
        if (obj != c1133) {
            return obj;
        }
        synchronized (this.f9213) {
            objInvoke = this.f9212;
            if (objInvoke == c1133) {
                objInvoke = this.f9211.invoke();
                this.f9212 = objInvoke;
                this.f9211 = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f9212 != C1133.f4215 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
