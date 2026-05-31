package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᲁᤞᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2300 extends AbstractC1351 {
    public C2300(C2848 c2848) {
        super(c2848, C2582.f8208);
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1489() {
        return null;
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final int mo1490() {
        return m2561() & 1;
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final String mo1491() {
        if (mo1490() == 0) {
            return null;
        }
        return "nop // spacer";
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final AbstractC0953 mo1492(C2582 c2582) {
        return new C2300(this.f3484);
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo1493(C0496 c0496) {
        if (mo1490() != 0) {
            c0496.m1934(AbstractC1467.m3266(0, 0));
        }
    }
}
