package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᲀᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1721 extends AbstractC1719 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1723 f5831;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C1722 f5832;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0679 f5833;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Object f5834;

    public C1721(C1723 c1723, C1722 c1722, C0679 c0679, Object obj) {
        this.f5831 = c1723;
        this.f5832 = c1722;
        this.f5833 = c0679;
        this.f5834 = obj;
    }

    @Override // p000.AbstractC1719
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final boolean mo2162() {
        return false;
    }

    @Override // p000.AbstractC1719
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo2163(Throwable th) {
        C0679 c0679 = this.f5833;
        C0679 c0679M3614 = C1723.m3614(c0679);
        C1723 c1723 = this.f5831;
        C1722 c1722 = this.f5832;
        Object obj = this.f5834;
        if (c0679M3614 == null || !c1723.m3635(c1722, c0679M3614, obj)) {
            c1722.f5838.m3784(new C1837(2), 2);
            C0679 c0679M3615 = C1723.m3614(c0679);
            if (c0679M3615 == null || !c1723.m3635(c1722, c0679M3615, obj)) {
                c1723.mo2761(c1723.m3621(c1722, obj));
            }
        }
    }
}
