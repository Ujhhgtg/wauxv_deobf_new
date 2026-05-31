package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᛸᲇᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2435 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f7786;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2848 f7787;

    public C2435(int i, C2848 c2848) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (c2848 == null) {
            throw new NullPointerException("position == null");
        }
        this.f7786 = i;
        this.f7787 = c2848;
    }
}
