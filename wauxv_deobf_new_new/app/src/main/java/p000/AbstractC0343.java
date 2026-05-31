package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤝᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0343 extends AbstractC0344 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1718 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f1719;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC2139 f1720;

    public AbstractC0343(String str, C0185 c0185, int i) {
        super(str);
        try {
            if (c0185.f7068) {
                throw new C1025("annotations.isMutable()", null);
            }
            this.f1720 = c0185;
            this.f1719 = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("annotations == null");
        }
    }

    @Override // p000.AbstractC0344
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1548() {
        int i;
        switch (this.f1718) {
            case 0:
                i = this.f1719;
                break;
            default:
                i = this.f1719;
                break;
        }
        return i + 6;
    }

    public AbstractC0343(String str, C0187 c0187, int i) {
        super(str);
        try {
            if (!c0187.f7068) {
                this.f1720 = c0187;
                this.f1719 = i;
                return;
            }
            throw new C1025("parameterAnnotations.isMutable()", null);
        } catch (NullPointerException unused) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }
}
