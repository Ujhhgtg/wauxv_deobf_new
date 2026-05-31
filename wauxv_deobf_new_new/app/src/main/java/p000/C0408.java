package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᲇᤝᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0408 extends AbstractC0061 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0406 f1961 = new C0406();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static boolean m1742(C1093 c1093, int i) {
        CharSequence charSequence = c1093.f3922;
        return c1093.f3928 < 4 && i < charSequence.length() && charSequence.charAt(i) == '>';
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final AbstractC0403 mo1064() {
        return this.f1961;
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final C0404 mo1067(C1093 c1093) {
        char cCharAt;
        int i = c1093.f3926;
        if (!m1742(c1093, i)) {
            return null;
        }
        int i2 = c1093.f3924 + c1093.f3928;
        int i3 = i2 + 1;
        CharSequence charSequence = c1093.f3922;
        int i4 = i + 1;
        if (i4 < charSequence.length() && ((cCharAt = charSequence.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new C0404(-1, i3, false);
    }
}
