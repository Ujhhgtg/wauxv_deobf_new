package p000;

import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᛸᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2399 implements InterfaceC2654 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f7669;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC2398 f7670;

    public C2399(String str, AbstractC2398 abstractC2398) {
        this.f7669 = str;
        this.f7670 = abstractC2398;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2399)) {
            return false;
        }
        C2399 c2399 = (C2399) obj;
        return AbstractC2207.m4087(this.f7669, c2399.f7669) && AbstractC2207.m4087(this.f7670, c2399.f7670);
    }

    public final int hashCode() {
        return (this.f7670.hashCode() * 31) + this.f7669.hashCode();
    }

    public final String toString() {
        return AbstractC1194.m2786(new StringBuilder("PrimitiveDescriptor("), this.f7669, ')');
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1342() {
        return this.f7669;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4371() {
        throw new IllegalStateException(AbstractC2784.m4752(new StringBuilder("Primitive descriptor "), this.f7669, " does not have elements"));
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo3471(String str) {
        m4371();
        throw null;
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final AbstractC1460 mo3472() {
        return this.f7670;
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo3473() {
        return 0;
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final String mo3474(int i) {
        m4371();
        throw null;
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final List mo3475(int i) {
        m4371();
        throw null;
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final InterfaceC2654 mo3476(int i) {
        m4371();
        throw null;
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo3477(int i) {
        m4371();
        throw null;
    }
}
