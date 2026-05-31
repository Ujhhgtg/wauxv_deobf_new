package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᤝᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1519 extends AbstractC3700 {
    @Override // p000.InterfaceC1015
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2100(InterfaceC1015 interfaceC1015) {
        C1017 c1017 = this.f11542;
        if (c1017.f3710 && !c1017.f3717) {
            c1017.mo2712((int) ((((C1017) c1017.f3719.get(0)).f3714 * ((C1518) this.f11536).f5348) + 0.5f));
        }
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2101() {
        C0792 c0792 = this.f11536;
        C1518 c1518 = (C1518) c0792;
        int i = c1518.f5349;
        int i2 = c1518.f5350;
        int i3 = c1518.f5352;
        C1017 c1017 = this.f11542;
        if (i3 == 1) {
            if (i != -1) {
                c1017.f3719.add(c0792.f3119.f3083.f11542);
                this.f11536.f3119.f3083.f11542.f3718.add(c1017);
                c1017.f3713 = i;
            } else if (i2 != -1) {
                c1017.f3719.add(c0792.f3119.f3083.f11543);
                this.f11536.f3119.f3083.f11543.f3718.add(c1017);
                c1017.f3713 = -i2;
            } else {
                c1017.f3709 = true;
                c1017.f3719.add(c0792.f3119.f3083.f11543);
                this.f11536.f3119.f3083.f11543.f3718.add(c1017);
            }
            m3427(this.f11536.f3083.f11542);
            m3427(this.f11536.f3083.f11543);
            return;
        }
        if (i != -1) {
            c1017.f3719.add(c0792.f3119.f3084.f11542);
            this.f11536.f3119.f3084.f11542.f3718.add(c1017);
            c1017.f3713 = i;
        } else if (i2 != -1) {
            c1017.f3719.add(c0792.f3119.f3084.f11543);
            this.f11536.f3119.f3084.f11543.f3718.add(c1017);
            c1017.f3713 = -i2;
        } else {
            c1017.f3709 = true;
            c1017.f3719.add(c0792.f3119.f3084.f11543);
            this.f11536.f3119.f3084.f11543.f3718.add(c1017);
        }
        m3427(this.f11536.f3084.f11542);
        m3427(this.f11536.f3084.f11543);
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2102() {
        C0792 c0792 = this.f11536;
        int i = ((C1518) c0792).f5352;
        C1017 c1017 = this.f11542;
        if (i == 1) {
            c0792.f3124 = c1017.f3714;
        } else {
            c0792.f3125 = c1017.f3714;
        }
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2103() {
        this.f11542.m2711();
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo2105() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3427(C1017 c1017) {
        C1017 c1018 = this.f11542;
        c1018.f3718.add(c1017);
        c1017.f3719.add(c1018);
    }
}
