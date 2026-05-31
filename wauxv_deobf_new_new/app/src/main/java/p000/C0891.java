package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲇᲀᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0891 extends AbstractC0906 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0891 f3339 = new C0891(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0891 f3340 = new C0891(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static C0891 m2528(int i) {
        if (i == 0) {
            return f3339;
        }
        if (i == 1) {
            return f3340;
        }
        throw new IllegalArgumentException(AbstractC1095.m2794(i, "bogus value: "));
    }

    @Override // p000.InterfaceC3507
    public final C3505 getType() {
        return C3505.f11026;
    }

    public final String toString() {
        return this.f3371 == 0 ? "boolean{false}" : "boolean{true}";
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return this.f3371 == 0 ? "false" : "true";
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2371() {
        return "boolean";
    }
}
