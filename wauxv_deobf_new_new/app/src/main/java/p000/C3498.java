package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲀᤝᲈᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3498 extends AbstractC3494 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f11011;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public AbstractC3493 f11012;

    public /* synthetic */ C3498() {
        this.f11011 = 1;
    }

    @Override // p000.AbstractC3494, p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo3068(AbstractC3493 abstractC3493) {
        switch (this.f11011) {
            case 1:
                C0327 c0327 = (C0327) this.f11012;
                if (!c0327.f1638) {
                    c0327.m5019();
                    c0327.f1638 = true;
                }
                break;
        }
    }

    @Override // p000.AbstractC3494, p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo2109(AbstractC3493 abstractC3493) {
        switch (this.f11011) {
            case 1:
                C0327 c0327 = (C0327) this.f11012;
                int i = c0327.f1637 - 1;
                c0327.f1637 = i;
                if (i == 0) {
                    c0327.f1638 = false;
                    c0327.m5013();
                }
                abstractC3493.mo1563(this);
                break;
            case 2:
                this.f11012.mo1565();
                abstractC3493.mo1563(this);
                break;
        }
    }

    @Override // p000.AbstractC3494, p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public void mo2111(AbstractC3493 abstractC3493) {
        switch (this.f11011) {
            case 0:
                C0327 c0327 = (C0327) this.f11012;
                c0327.f1635.remove(abstractC3493);
                if (!c0327.mo1560()) {
                    c0327.m5018(c0327, C2425.f7766, false);
                    c0327.f10997 = true;
                    c0327.m5018(c0327, C2425.f7765, false);
                }
                break;
        }
    }

    public /* synthetic */ C3498(AbstractC3493 abstractC3493, int i) {
        this.f11011 = i;
        this.f11012 = abstractC3493;
    }
}
