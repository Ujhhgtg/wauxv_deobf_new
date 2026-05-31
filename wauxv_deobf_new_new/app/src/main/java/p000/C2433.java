package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᛸᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2433 extends C2432 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f7779;

    public C2433(int i) {
        super(i);
        this.f7779 = new Object();
    }

    @Override // p000.C2432, p000.InterfaceC2431
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1457(Object obj) {
        boolean zMo1457;
        synchronized (this.f7779) {
            zMo1457 = super.mo1457(obj);
        }
        return zMo1457;
    }

    @Override // p000.C2432, p000.InterfaceC2431
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1458() {
        Object objMo1458;
        synchronized (this.f7779) {
            objMo1458 = super.mo1458();
        }
        return objMo1458;
    }
}
