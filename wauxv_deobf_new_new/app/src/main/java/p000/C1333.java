package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᤞᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1333 implements InterfaceC2711 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2711 f4787;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean f4788;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC1433 f4789;

    public C1333(InterfaceC2711 interfaceC2711, boolean z, InterfaceC1433 interfaceC1433) {
        this.f4787 = interfaceC2711;
        this.f4788 = z;
        this.f4789 = interfaceC1433;
    }

    @Override // p000.InterfaceC2711
    public final Iterator iterator() {
        return new C1332(this);
    }
}
