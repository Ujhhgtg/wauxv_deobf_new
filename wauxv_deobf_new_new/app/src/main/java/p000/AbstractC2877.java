package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᲁᛸᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2877 implements InterfaceC1957 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0917 f9187;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f9188;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0913 f9189;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0417 f9190;

    public AbstractC2877(C0917 c0917, int i, C0913 c0913, C0417 c0417) {
        if (c0917 == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c0417 == null) {
            throw new NullPointerException("attributes == null");
        }
        this.f9187 = c0917;
        this.f9188 = i;
        this.f9189 = c0913;
        this.f9190 = c0417;
    }

    @Override // p000.InterfaceC1957
    public final C0417 getAttributes() {
        return this.f9190;
    }

    @Override // p000.InterfaceC1957
    public final C0916 getName() {
        return this.f9189.f3381;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(this.f9189.mo1360());
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC1957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final C0916 mo2357() {
        return this.f9189.f3382;
    }

    @Override // p000.InterfaceC1957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final C0917 mo2359() {
        return this.f9187;
    }

    @Override // p000.InterfaceC1957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo2360() {
        return this.f9188;
    }

    @Override // p000.InterfaceC1957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final C0913 mo2361() {
        return this.f9189;
    }
}
