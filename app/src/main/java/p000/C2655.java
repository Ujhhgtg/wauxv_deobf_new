package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᤞᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2655 implements InterfaceC2654, InterfaceC0546 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2654 f8557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f8558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Set f8559;

    public C2655(InterfaceC2654 interfaceC2654) {
        this.f8557 = interfaceC2654;
        this.f8558 = interfaceC2654.mo1342() + '?';
        this.f8559 = AbstractC2202.m3995(interfaceC2654);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2655) {
            return AbstractC2207.m4087(this.f8557, ((C2655) obj).f8557);
        }
        return false;
    }

    @Override // p000.InterfaceC2654
    public final List getAnnotations() {
        return this.f8557.getAnnotations();
    }

    public final int hashCode() {
        return this.f8557.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8557);
        sb.append('?');
        return sb.toString();
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1342() {
        return this.f8558;
    }

    @Override // p000.InterfaceC0546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Set mo1920() {
        return this.f8559;
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final boolean mo3470() {
        return true;
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo3471(String str) {
        return this.f8557.mo3471(str);
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final AbstractC1460 mo3472() {
        return this.f8557.mo3472();
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo3473() {
        return this.f8557.mo3473();
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final String mo3474(int i) {
        return this.f8557.mo3474(i);
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo3358() {
        return this.f8557.mo3358();
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final List mo3475(int i) {
        return this.f8557.mo3475(i);
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final InterfaceC2654 mo3476(int i) {
        return this.f8557.mo3476(i);
    }

    @Override // p000.InterfaceC2654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo3477(int i) {
        return this.f8557.mo3477(i);
    }
}
