package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲁᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0904 extends AbstractC0775 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f3364;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0913 f3365;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2492 f3366;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0917 f3367;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0893 f3368;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final ArrayList f3369 = new ArrayList();

    public C0904(int i, C0913 c0913) {
        this.f3364 = i;
        this.f3365 = c0913;
        this.f3366 = C2492.m4440(c0913.f3382.mo1360());
    }

    public final String toString() {
        return mo1360();
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        C0917 c0917 = this.f3367;
        StringBuilder sbM4625 = AbstractC2647.m4625("InvokeDynamic(", c0917 != null ? c0917.f3408.mo1360() : "Unknown", ":");
        sbM4625.append(this.f3364);
        sbM4625.append(", ");
        sbM4625.append(this.f3365.mo1360());
        sbM4625.append(")");
        return sbM4625.toString();
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2369(AbstractC0775 abstractC0775) {
        C0904 c0904 = (C0904) abstractC0775;
        int iCompare = Integer.compare(this.f3364, c0904.f3364);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = this.f3365.compareTo(c0904.f3365);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f3367.compareTo(c0904.f3367);
        return iCompareTo2 != 0 ? iCompareTo2 : this.f3368.compareTo(c0904.f3368);
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo2370() {
        return false;
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2371() {
        return "InvokeDynamic";
    }
}
