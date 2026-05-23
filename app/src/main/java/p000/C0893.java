package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲁᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0893 extends AbstractC0907 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0893 f3334 = new C0893(0);

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return C3448.f10867;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("byte{0x");
        int i = this.f3364;
        sb.append(AbstractC1460.m3222(i));
        sb.append(" / ");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1214() {
        return Integer.toString(this.f3364);
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2269() {
        return "byte";
    }
}
