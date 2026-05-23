package p000;

import bsh.C0007;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤞᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0344 extends AbstractC2707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public String f1630;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f1631;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C2000[] f1632;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public Class[] f1633;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public String[] f1634;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public InterfaceC2225 f1635;

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        if (!this.f1631) {
            if (m4710().length == 2) {
                C0340 c0340 = (C0340) this.f8721[0];
                this.f1633 = c0340.mo306(c0550, runnableC1668);
                c0340.m1453();
                this.f1632 = c0340.f1618;
                c0340.m1453();
                this.f1634 = c0340.f1617;
                this.f1635 = this.f8721[1];
            } else {
                this.f1633 = new Class[]{null};
                this.f1632 = new C2000[]{null};
                this.f1634 = new String[]{this.f1630};
                this.f1635 = this.f8721[0];
            }
            this.f1631 = true;
        }
        C0007 c0007M1929 = c0550.m1929();
        C2000[] c2000Arr = this.f1632;
        Class[] clsArr = this.f1633;
        String[] strArr = this.f1634;
        InterfaceC2225 interfaceC2225 = this.f1635;
        C0495 c0495 = AbstractC0496.f2133;
        return new C0493(this, c0007M1929, c2000Arr, clsArr, strArr, interfaceC2225);
    }
}
