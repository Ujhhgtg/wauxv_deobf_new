package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0433 extends AbstractC0054 {

    public final C0431 f1989 = new C0431();

    public static boolean m1636(C1088 c1088, int i) {
        CharSequence charSequence = c1088.f3911;
        return c1088.f3917 < 4 && i < charSequence.length() && charSequence.charAt(i) == '>';
    }

    @Override // p000.AbstractC0054
    public final AbstractC0428 mo920() {
        return this.f1989;
    }

    @Override // p000.AbstractC0054
    public final C0429 mo923(C1088 c1088) {
        char cCharAt;
        int i = c1088.f3915;
        if (!m1636(c1088, i)) {
            return null;
        }
        int i2 = c1088.f3913 + c1088.f3917;
        int i3 = i2 + 1;
        CharSequence charSequence = c1088.f3911;
        int i4 = i + 1;
        if (i4 < charSequence.length() && ((cCharAt = charSequence.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new C0429(-1, i3, false);
    }
}
