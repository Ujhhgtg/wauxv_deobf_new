package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᛸᤞᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1296 extends AbstractC0054 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1295 f4716;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public String f4717;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final StringBuilder f4718;

    public C1296(char c, int i, int i2) {
        C1295 c1295 = new C1295();
        this.f4716 = c1295;
        this.f4718 = new StringBuilder();
        c1295.f4711 = c;
        c1295.f4712 = i;
        c1295.f4713 = i2;
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo917(CharSequence charSequence) {
        if (this.f4717 == null) {
            this.f4717 = charSequence.toString();
            return;
        }
        StringBuilder sb = this.f4718;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo919() {
        String strM2863 = AbstractC1228.m2863(this.f4717.trim());
        C1295 c1295 = this.f4716;
        c1295.f4714 = strM2863;
        c1295.f4715 = this.f4718.toString();
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final AbstractC0428 mo920() {
        return this.f4716;
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final C0429 mo923(C1088 c1088) {
        int i = c1088.f3915;
        int i2 = c1088.f3912;
        CharSequence charSequence = c1088.f3911;
        int i3 = c1088.f3917;
        C1295 c1295 = this.f4716;
        if (i3 < 4) {
            char c = c1295.f4711;
            int i4 = c1295.f4712;
            int iM5087 = AbstractC3471.m5087(c, i, charSequence.length(), charSequence) - i;
            if (iM5087 >= i4 && AbstractC3471.m5089(charSequence, i + iM5087, charSequence.length()) == charSequence.length()) {
                return new C0429(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i5 = c1295.f4713; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return C0429.m1634(i2);
    }
}
