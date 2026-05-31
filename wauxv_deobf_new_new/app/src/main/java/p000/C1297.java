package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᲈᛸᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1297 extends AbstractC0061 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1296 f4715;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public String f4716;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final StringBuilder f4717;

    public C1297(char c, int i, int i2) {
        C1296 c1296 = new C1296();
        this.f4715 = c1296;
        this.f4717 = new StringBuilder();
        c1296.f4710 = c;
        c1296.f4711 = i;
        c1296.f4712 = i2;
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1061(CharSequence charSequence) {
        if (this.f4716 == null) {
            this.f4716 = charSequence.toString();
            return;
        }
        StringBuilder sb = this.f4717;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1063() {
        String strM2985 = AbstractC1230.m2985(this.f4716.trim());
        C1296 c1296 = this.f4715;
        c1296.f4713 = strM2985;
        c1296.f4714 = this.f4717.toString();
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final AbstractC0403 mo1064() {
        return this.f4715;
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final C0404 mo1067(C1093 c1093) {
        int i = c1093.f3926;
        int i2 = c1093.f3923;
        CharSequence charSequence = c1093.f3922;
        int i3 = c1093.f3928;
        C1296 c1296 = this.f4715;
        if (i3 < 4) {
            char c = c1296.f4710;
            int i4 = c1296.f4711;
            int iM3370 = AbstractC1470.m3370(c, i, charSequence.length(), charSequence) - i;
            if (iM3370 >= i4 && AbstractC1470.m3371(charSequence, i + iM3370, charSequence.length()) == charSequence.length()) {
                return new C0404(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i5 = c1296.f4712; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return C0404.m1740(i2);
    }
}
