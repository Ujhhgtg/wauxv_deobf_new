package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤝᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0340 extends AbstractC2707 implements InterfaceC0480 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public String[] f1617;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C2000[] f1618;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f1619;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public Class[] f1620;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f1621;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public String[] f1622;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f1623;

    @Override // p000.InterfaceC0480
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo343() {
        this.f1620 = null;
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final Class[] mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        Class[] clsArr = this.f1620;
        if (clsArr != null) {
            return clsArr;
        }
        m1453();
        Class[] clsArr2 = new Class[this.f1621];
        for (int i = 0; i < this.f1621; i++) {
            clsArr2[i] = (Class) ((C0339) this.f8721[i]).mo306(c0550, runnableC1668);
        }
        this.f1620 = clsArr2;
        return clsArr2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1453() {
        if (this.f1617 != null) {
            return;
        }
        int length = m4710().length;
        this.f1621 = length;
        String[] strArr = new String[length];
        C2000[] c2000Arr = new C2000[length];
        for (int i = 0; i < this.f1621; i++) {
            C0339 c0339 = (C0339) this.f8721[i];
            this.f1623 = c0339.f1615;
            strArr[i] = c0339.f1612;
            C2000 c2000 = new C2000(4);
            c2000Arr[i] = c2000;
            if (c0339.f1614) {
                c2000.m3860("final");
            }
        }
        this.f1617 = strArr;
        this.f1618 = c2000Arr;
    }
}
