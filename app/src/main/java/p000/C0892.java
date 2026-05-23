package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲀᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0892 extends AbstractC0907 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0892 f3332 = new C0892(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0892 f3333 = new C0892(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static C0892 m2411(int i) {
        if (i == 0) {
            return f3332;
        }
        if (i == 1) {
            return f3333;
        }
        throw new IllegalArgumentException(AbstractC1194.m2779(i, "bogus value: "));
    }

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return C3448.f10866;
    }

    public final String toString() {
        return this.f3364 == 0 ? "boolean{false}" : "boolean{true}";
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1214() {
        return this.f3364 == 0 ? "false" : "true";
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2269() {
        return "boolean";
    }
}
