package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᲁᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2302 extends AbstractC1690 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f7488;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f7489;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C2017 f7490;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f7491;

    public AbstractC2302(int i, int i2) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("writeSize < -1");
        }
        this.f7488 = i;
        this.f7489 = i2;
        this.f7490 = null;
        this.f7491 = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC2302 abstractC2302 = (AbstractC2302) obj;
        if (this == abstractC2302) {
            return 0;
        }
        EnumC1701 enumC1701Mo1368 = mo1368();
        EnumC1701 enumC1701Mo1369 = abstractC2302.mo1368();
        return enumC1701Mo1368 != enumC1701Mo1369 ? enumC1701Mo1368.compareTo(enumC1701Mo1369) : mo1369(abstractC2302);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AbstractC2302 abstractC2302 = (AbstractC2302) obj;
        return mo1368() == abstractC2302.mo1368() && mo1369(abstractC2302) == 0;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2016() {
        int i = this.f7489;
        if (i >= 0) {
            return i;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2017(C1026 c1026, C0496 c0496) {
        c0496.m1924(this.f7488);
        try {
            if (this.f7489 < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            int iM4279 = m4279();
            if (c0496.f2152 == iM4279) {
                mo1371(c1026, c0496);
                return;
            }
            throw new C1240("expected cursor " + iM4279 + "; actual value: " + c0496.f2152, null);
        } catch (RuntimeException e) {
            throw C1240.m3003("...while writing " + this, e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public int mo1369(AbstractC2302 abstractC2302) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m4279() {
        int i = this.f7491;
        if (i < 0) {
            throw new RuntimeException("offset not yet known");
        }
        C2017 c2017 = this.f7490;
        if (i < 0) {
            c2017.getClass();
            throw new IllegalArgumentException("relative < 0");
        }
        int i2 = c2017.f8701;
        if (i2 >= 0) {
            return i2 + i;
        }
        throw new RuntimeException("fileOffset not yet set");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String m4280() {
        return "[" + Integer.toHexString(m4279()) + ']';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m4281(C2017 c2017, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (this.f7490 != null) {
            throw new RuntimeException("already written");
        }
        int i2 = this.f7488 - 1;
        int i3 = (i + i2) & (~i2);
        this.f7490 = c2017;
        this.f7491 = i3;
        mo1370(c2017, i3);
        return i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m4282(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (this.f7489 >= 0) {
            throw new UnsupportedOperationException("writeSize already set");
        }
        this.f7489 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public abstract void mo1371(C1026 c1026, C0496 c0496);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public void mo1370(C2017 c2017, int i) {
    }
}
