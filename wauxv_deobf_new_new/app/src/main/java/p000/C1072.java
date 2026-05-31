package p000;

import java.io.File;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᤞᲈᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1072 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean f3866;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f3867;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f3868;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f3869;

    public C1072(C1216 c1216, C2770 c2770) {
        this.f3869 = new C2772(this);
        this.f3868 = c1216;
        this.f3867 = c2770;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m2743() {
        C1074.m2746((C1074) this.f3869, this, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public File m2744() {
        File file;
        synchronized (((C1074) this.f3869)) {
            try {
                C1073 c1073 = (C1073) this.f3867;
                if (c1073.f3875 != this) {
                    throw new IllegalStateException();
                }
                if (!c1073.f3874) {
                    ((boolean[]) this.f3868)[0] = true;
                }
                file = c1073.f3873[0];
                ((C1074) this.f3869).f3877.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public C1072(C1074 c1074, C1073 c1073) {
        this.f3869 = c1074;
        this.f3867 = c1073;
        this.f3868 = c1073.f3874 ? null : new boolean[c1074.f3883];
    }
}
