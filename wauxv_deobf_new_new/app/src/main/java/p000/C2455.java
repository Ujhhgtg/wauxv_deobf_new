package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᤝᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2455 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C2845 f7821;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2456 f7822;

    public C2455(C2456 c2456) {
        this.f7822 = c2456;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7821.f9048 - ((C2845) obj).f9048;
    }

    public final String toString() {
        String string = "[ ";
        if (this.f7821 != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder sbM4787 = AbstractC2844.m4787(string);
                sbM4787.append(this.f7821.f9054[i]);
                sbM4787.append(" ");
                string = sbM4787.toString();
            }
        }
        StringBuilder sbM2803 = AbstractC1095.m2803(string, "] ");
        sbM2803.append(this.f7821);
        return sbM2803.toString();
    }
}
