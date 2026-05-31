package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᤞᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0417 extends AbstractC1352 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public AbstractC0344 m1750(String str) {
        int length = this.f4833.length;
        for (int i = 0; i < length; i++) {
            AbstractC0344 abstractC0344 = (AbstractC0344) m3165(i);
            if (abstractC0344.f1721.equals(str)) {
                return abstractC0344;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public AbstractC1663 m1751() {
        return (AbstractC1663) m3165(this.f4833.length - 1);
    }
}
