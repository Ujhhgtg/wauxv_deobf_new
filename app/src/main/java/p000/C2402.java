package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᛸᲁᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2402 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C2785 f7677;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C2403 f7678;

    public C2402(C2403 c2403) {
        this.f7678 = c2403;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7677.f8886 - ((C2785) obj).f8886;
    }

    public final String toString() {
        String string = "[ ";
        if (this.f7677 != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder sbM4753 = AbstractC2784.m4753(string);
                sbM4753.append(this.f7677.f8892[i]);
                sbM4753.append(" ");
                string = sbM4753.toString();
            }
        }
        StringBuilder sbM2788 = AbstractC1194.m2788(string, "] ");
        sbM2788.append(this.f7677);
        return sbM2788.toString();
    }
}
