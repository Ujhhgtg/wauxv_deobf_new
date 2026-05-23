package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0442 extends AbstractC1352 {
    public AbstractC0369 m1644(String str) {
        int length = this.f4836.length;
        for (int i = 0; i < length; i++) {
            AbstractC0369 abstractC0369 = (AbstractC0369) m3062(i);
            if (abstractC0369.f1750.equals(str)) {
                return abstractC0369;
            }
        }
        return null;
    }

    public AbstractC1649 m1645() {
        return (AbstractC1649) m3062(this.f4836.length - 1);
    }
}
