package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲈᲁᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0915 extends AbstractC0906 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0915 f3384 = new C0915(0);

    @Override // p000.InterfaceC3507
    public final C3505 getType() {
        return C3505.f11033;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("short{0x");
        int i = this.f3371;
        sb.append(AbstractC2902.m4906(i));
        sb.append(" / ");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return Integer.toString(this.f3371);
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2371() {
        return "short";
    }
}
