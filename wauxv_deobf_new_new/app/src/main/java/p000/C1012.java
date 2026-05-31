package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲇᲁᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1012 implements InterfaceC2711 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3689;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f3690;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f3691;

    public /* synthetic */ C1012(Object obj, InterfaceC1444 interfaceC1444, int i) {
        this.f3689 = i;
        this.f3690 = obj;
        this.f3691 = interfaceC1444;
    }

    @Override // p000.InterfaceC2711
    public final Iterator iterator() {
        switch (this.f3689) {
            case 0:
                return new C1011(this);
            case 1:
                return new C1452(this);
            default:
                return new C3487(this);
        }
    }
}
