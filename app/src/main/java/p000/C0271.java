package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲀᲁᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0271 implements InterfaceC2650 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1473;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1474;

    public /* synthetic */ C0271(int i, Object obj) {
        this.f1473 = i;
        this.f1474 = obj;
    }

    @Override // p000.InterfaceC2650
    public final Iterator iterator() {
        switch (this.f1473) {
            case 0:
                return new C0060(1, (Object[]) this.f1474);
            case 1:
                return ((Iterable) this.f1474).iterator();
            case 2:
                return (Iterator) this.f1474;
            default:
                return new C0060(7, (C2865) this.f1474);
        }
    }
}
