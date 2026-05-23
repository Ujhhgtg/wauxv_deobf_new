package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᲇᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2270 extends AbstractC1675 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f7367;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f7368;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C1986 f7369;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f7370;

    public AbstractC2270(int i, int i2) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("writeSize < -1");
        }
        this.f7367 = i;
        this.f7368 = i2;
        this.f7369 = null;
        this.f7370 = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC2270 abstractC2270 = (AbstractC2270) obj;
        if (this == abstractC2270) {
            return 0;
        }
        EnumC1683 enumC1683Mo1222 = mo1222();
        EnumC1683 enumC1683Mo1223 = abstractC2270.mo1222();
        return enumC1683Mo1222 != enumC1683Mo1223 ? enumC1683Mo1222.compareTo(enumC1683Mo1223) : mo1223(abstractC2270);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AbstractC2270 abstractC2270 = (AbstractC2270) obj;
        return mo1222() == abstractC2270.mo1222() && mo1223(abstractC2270) == 0;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1921() {
        int i = this.f7368;
        if (i >= 0) {
            return i;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1922(C1023 c1023, C0519 c0519) {
        c0519.m1830(this.f7367);
        try {
            if (this.f7368 < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            int iM4150 = m4150();
            if (c0519.f2196 == iM4150) {
                mo1225(c1023, c0519);
                return;
            }
            throw new C1238("expected cursor " + iM4150 + "; actual value: " + c0519.f2196, null);
        } catch (RuntimeException e) {
            throw C1238.m2884("...while writing " + this, e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public int mo1223(AbstractC2270 abstractC2270) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m4150() {
        int i = this.f7370;
        if (i < 0) {
            throw new RuntimeException("offset not yet known");
        }
        C1986 c1986 = this.f7369;
        if (i < 0) {
            c1986.getClass();
            throw new IllegalArgumentException("relative < 0");
        }
        int i2 = c1986.f8536;
        if (i2 >= 0) {
            return i2 + i;
        }
        throw new RuntimeException("fileOffset not yet set");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String m4151() {
        return "[" + Integer.toHexString(m4150()) + ']';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m4152(C1986 c1986, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (this.f7369 != null) {
            throw new RuntimeException("already written");
        }
        int i2 = this.f7367 - 1;
        int i3 = (i + i2) & (~i2);
        this.f7369 = c1986;
        this.f7370 = i3;
        mo1224(c1986, i3);
        return i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m4153(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (this.f7368 >= 0) {
            throw new UnsupportedOperationException("writeSize already set");
        }
        this.f7368 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public abstract void mo1225(C1023 c1023, C0519 c0519);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public void mo1224(C1986 c1986, int i) {
    }
}
