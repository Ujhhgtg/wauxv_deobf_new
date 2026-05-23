package p000;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤝᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0339 extends AbstractC2707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public String f1612;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public Class f1613;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f1614;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f1615;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f1616;

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + this.f1612 + ", final=" + this.f1614 + ", varargs=" + this.f1615;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        if (m4710().length > 0) {
            Class clsM1467 = ((C0356) this.f8721[0]).m1467(c0550, runnableC1668);
            this.f1613 = clsM1467;
            if (this.f1616 > 0) {
                if (clsM1467.isArray()) {
                    throw new C1229("Array dimensions not allowed on both type and name: " + this.f1612, this, null);
                }
                this.f1613 = Array.newInstance((Class<?>) this.f1613, new int[this.f1616]).getClass();
            }
        } else {
            this.f1613 = null;
        }
        if (this.f1615) {
            this.f1613 = Array.newInstance((Class<?>) this.f1613, 0).getClass();
        }
        return this.f1613;
    }
}
