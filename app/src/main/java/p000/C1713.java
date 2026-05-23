package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᲀᲇᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1713 extends C1653 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f5809;

    public C1713(String str) {
        super(str);
        this.f5809 = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f5809;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1713(String str, String str2) {
        StringBuilder sbM4753 = AbstractC2784.m4753(str);
        sbM4753.append((str2 == null || AbstractC2841.m4836(str2)) ? "" : "\n".concat(str2));
        this(sbM4753.toString());
    }
}
