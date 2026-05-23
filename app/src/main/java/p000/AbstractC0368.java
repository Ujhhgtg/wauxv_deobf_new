package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0368 extends AbstractC0369 {

    public final /* synthetic */ int f1747 = 0;

    public final int f1748;

    public final AbstractC2106 f1749;

    public AbstractC0368(String str, C0177 c0177, int i) {
        super(str);
        try {
            if (c0177.f6944) {
                throw new C1022("annotations.isMutable()", null);
            }
            this.f1749 = c0177;
            this.f1748 = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("annotations == null");
        }
    }

    @Override // p000.AbstractC0369
    public final int mo1402() {
        int i;
        switch (0) {
            case 0:
                i = this.f1748;
                break;
            default:
                i = this.f1748;
                break;
        }
        return i + 6;
    }

    public AbstractC0368(String str, C0179 c0179, int i) {
        super(str);
        try {
            if (!c0179.f6944) {
                this.f1749 = c0179;
                this.f1748 = i;
                return;
            }
            throw new C1022("parameterAnnotations.isMutable()", null);
        } catch (NullPointerException unused) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }
}
