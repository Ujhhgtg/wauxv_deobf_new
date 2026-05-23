package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᤞᛸᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2382 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f7642;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2788 f7643;

    public C2382(int i, C2788 c2788) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (c2788 == null) {
            throw new NullPointerException("position == null");
        }
        this.f7642 = i;
        this.f7643 = c2788;
    }
}
