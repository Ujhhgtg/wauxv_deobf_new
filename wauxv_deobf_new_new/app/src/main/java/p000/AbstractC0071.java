package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0071 implements InterfaceC1881, Serializable {
    private static final long serialVersionUID = -2529255052481744503L;

    public Object readResolve() {
        return AbstractC1883.m3802(((C1238) this).f4464);
    }

    @Override // p000.InterfaceC1881
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1088(String str) {
        m1090(4);
    }

    @Override // p000.InterfaceC1881
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void mo1089(String str, Throwable th) {
        m1090(2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1090(int i) {
        C1238 c1238 = (C1238) this;
        C2916 c2916 = new C2916();
        System.currentTimeMillis();
        c2916.f9296 = i;
        c2916.f9297 = c1238.f4465;
        Thread.currentThread().getName();
        c1238.f4466.add(c2916);
    }
}
