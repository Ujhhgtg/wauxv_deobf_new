package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲀᲇᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0281 implements InterfaceC2711 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1547;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1548;

    public /* synthetic */ C0281(Object obj, int i) {
        this.f1547 = i;
        this.f1548 = obj;
    }

    @Override // p000.InterfaceC2711
    public final Iterator iterator() {
        switch (this.f1547) {
            case 0:
                return new C0067((Object[]) this.f1548, 1);
            case 1:
                return ((Iterable) this.f1548).iterator();
            case 2:
                return (Iterator) this.f1548;
            default:
                return new C0067((C2925) this.f1548, 7);
        }
    }
}
