package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᛸᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2380 extends C2379 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f7635;

    public C2380(int i) {
        super(i);
        this.f7635 = new Object();
    }

    @Override // p000.C2379, p000.InterfaceC2378
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1311(Object obj) {
        boolean zMo1311;
        synchronized (this.f7635) {
            zMo1311 = super.mo1311(obj);
        }
        return zMo1311;
    }

    @Override // p000.C2379, p000.InterfaceC2378
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1312() {
        Object objMo1312;
        synchronized (this.f7635) {
            objMo1312 = super.mo1312();
        }
        return objMo1312;
    }
}
