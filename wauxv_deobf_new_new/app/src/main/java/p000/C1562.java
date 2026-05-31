package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲁᲈᲀᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1562 extends AbstractC1351 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C2768[] f5444;

    public C1562(C2848 c2848, C2582 c2582) {
        super(c2848, c2582);
        if (c2582.f4833.length == 0) {
            throw new IllegalArgumentException("registers.size() == 0");
        }
        this.f5444 = null;
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1489() {
        return null;
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final int mo1490() {
        m3441();
        int iMo1490 = 0;
        for (C2768 c2768 : this.f5444) {
            iMo1490 += c2768.mo1490();
        }
        return iMo1490;
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final String mo1491() {
        C2582 c2582 = this.f3485;
        int length = c2582.f4833.length;
        StringBuilder sb = new StringBuilder(100);
        int iM4562 = 0;
        for (int i = 0; i < length; i++) {
            C2581 c2581 = (C2581) c2582.m3165(i);
            C2768 c2768M2560 = AbstractC0953.m2560(C2848.f9066, C2581.m4554(iM4562, c2581.f8206.getType(), null), c2581);
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(c2768M2560.mo1491());
            iM4562 += c2581.m4562();
        }
        return sb.toString();
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final AbstractC0953 mo1492(C2582 c2582) {
        return new C1562(this.f3484, c2582);
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo1493(C0496 c0496) {
        m3441();
        for (C2768 c2768 : this.f5444) {
            c2768.mo1493(c0496);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3441() {
        if (this.f5444 != null) {
            return;
        }
        C2582 c2582 = this.f3485;
        int length = c2582.f4833.length;
        this.f5444 = new C2768[length];
        int iM4562 = 0;
        for (int i = 0; i < length; i++) {
            C2581 c2581 = (C2581) c2582.m3165(i);
            this.f5444[i] = AbstractC0953.m2560(C2848.f9066, C2581.m4554(iM4562, c2581.f8206.getType(), null), c2581);
            iM4562 += c2581.m4562();
        }
    }
}
