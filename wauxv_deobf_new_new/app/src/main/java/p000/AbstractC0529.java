package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲇᤝᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0529 implements InterfaceC1759, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public transient InterfaceC1759 f2223;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f2224;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Class f2225;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f2226;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f2227;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f2228;

    public AbstractC0529(Object obj, Class cls, String str, String str2, boolean z) {
        this.f2224 = obj;
        this.f2225 = cls;
        this.f2226 = str;
        this.f2227 = str2;
        this.f2228 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public InterfaceC1759 mo2025() {
        InterfaceC1759 interfaceC1759 = this.f2223;
        if (interfaceC1759 != null) {
            return interfaceC1759;
        }
        InterfaceC1759 interfaceC1759Mo2026 = mo2026();
        this.f2223 = interfaceC1759Mo2026;
        return interfaceC1759Mo2026;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public abstract InterfaceC1759 mo2026();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC0692 m2027() {
        boolean z = this.f2228;
        Class cls = this.f2225;
        if (!z) {
            return AbstractC2574.m4549(cls);
        }
        AbstractC2574.f8194.getClass();
        return new C2344(cls);
    }
}
