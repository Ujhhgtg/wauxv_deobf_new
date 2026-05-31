package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᤝᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1734 extends C1667 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f5869;

    public C1734(String str) {
        super(str);
        this.f5869 = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f5869;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1734(String str, String str2) {
        StringBuilder sbM4787 = AbstractC2844.m4787(str);
        sbM4787.append((str2 == null || AbstractC2901.m4869(str2)) ? "" : "\n".concat(str2));
        this(sbM4787.toString());
    }
}
