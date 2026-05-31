package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᲈᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2716 implements InterfaceC2715, InterfaceC0523 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2715 f8722;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f8723;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Set f8724;

    public C2716(InterfaceC2715 interfaceC2715) {
        this.f8722 = interfaceC2715;
        this.f8723 = interfaceC2715.mo1488() + '?';
        this.f8724 = AbstractC1586.m3469(interfaceC2715);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2716) {
            return AbstractC1469.m3322(this.f8722, ((C2716) obj).f8722);
        }
        return false;
    }

    @Override // p000.InterfaceC2715
    public final List getAnnotations() {
        return this.f8722.getAnnotations();
    }

    public final int hashCode() {
        return this.f8722.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8722);
        sb.append('?');
        return sb.toString();
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1488() {
        return this.f8723;
    }

    @Override // p000.InterfaceC0523
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Set mo2015() {
        return this.f8724;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final boolean mo3638() {
        return true;
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo3639(String str) {
        return this.f8722.mo3639(str);
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final AbstractC2236 mo3640() {
        return this.f8722.mo3640();
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo3641() {
        return this.f8722.mo3641();
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final String mo3642(int i) {
        return this.f8722.mo3642(i);
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo3522() {
        return this.f8722.mo3522();
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final List mo3643(int i) {
        return this.f8722.mo3643(i);
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final InterfaceC2715 mo3644(int i) {
        return this.f8722.mo3644(i);
    }

    @Override // p000.InterfaceC2715
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo3645(int i) {
        return this.f8722.mo3645(i);
    }
}
