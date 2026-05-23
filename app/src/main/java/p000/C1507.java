package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲈᲁᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1507 extends AbstractC3640 {
    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2003(InterfaceC1012 interfaceC1012) {
        C1014 c1014 = this.f11393;
        if (c1014.f3703 && !c1014.f3710) {
            c1014.mo2588((int) ((((C1014) c1014.f3712.get(0)).f3707 * ((C1506) this.f11387).f5317) + 0.5f));
        }
    }

    @Override // p000.AbstractC3640
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2004() {
        C0793 c0793 = this.f11387;
        C1506 c1506 = (C1506) c0793;
        int i = c1506.f5318;
        int i2 = c1506.f5319;
        int i3 = c1506.f5321;
        C1014 c1014 = this.f11393;
        if (i3 == 1) {
            if (i != -1) {
                c1014.f3712.add(c0793.f3112.f3076.f11393);
                this.f11387.f3112.f3076.f11393.f3711.add(c1014);
                c1014.f3706 = i;
            } else if (i2 != -1) {
                c1014.f3712.add(c0793.f3112.f3076.f11394);
                this.f11387.f3112.f3076.f11394.f3711.add(c1014);
                c1014.f3706 = -i2;
            } else {
                c1014.f3702 = true;
                c1014.f3712.add(c0793.f3112.f3076.f11394);
                this.f11387.f3112.f3076.f11394.f3711.add(c1014);
            }
            m3246(this.f11387.f3076.f11393);
            m3246(this.f11387.f3076.f11394);
            return;
        }
        if (i != -1) {
            c1014.f3712.add(c0793.f3112.f3077.f11393);
            this.f11387.f3112.f3077.f11393.f3711.add(c1014);
            c1014.f3706 = i;
        } else if (i2 != -1) {
            c1014.f3712.add(c0793.f3112.f3077.f11394);
            this.f11387.f3112.f3077.f11394.f3711.add(c1014);
            c1014.f3706 = -i2;
        } else {
            c1014.f3702 = true;
            c1014.f3712.add(c0793.f3112.f3077.f11394);
            this.f11387.f3112.f3077.f11394.f3711.add(c1014);
        }
        m3246(this.f11387.f3077.f11393);
        m3246(this.f11387.f3077.f11394);
    }

    @Override // p000.AbstractC3640
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2005() {
        C0793 c0793 = this.f11387;
        int i = ((C1506) c0793).f5321;
        C1014 c1014 = this.f11393;
        if (i == 1) {
            c0793.f3117 = c1014.f3707;
        } else {
            c0793.f3118 = c1014.f3707;
        }
    }

    @Override // p000.AbstractC3640
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2006() {
        this.f11393.m2587();
    }

    @Override // p000.AbstractC3640
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo2008() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3246(C1014 c1014) {
        C1014 c1015 = this.f11393;
        c1015.f3711.add(c1014);
        c1014.f3712.add(c1015);
    }
}
