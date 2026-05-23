package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3495 extends AbstractC2643 {
    @Override // p000.AbstractC2643
    public final int mo3850(AbstractC1675 abstractC1675) {
        AbstractC1628 abstractC1628 = (AbstractC1628) abstractC1675;
        int iMo1921 = abstractC1628.mo1921() * abstractC1628.m3345();
        if (iMo1921 < 0) {
            throw new IllegalArgumentException("relative < 0");
        }
        int i = this.f8536;
        if (i >= 0) {
            return i + iMo1921;
        }
        throw new RuntimeException("fileOffset not yet set");
    }

    @Override // p000.AbstractC2643
    public final void mo3851() {
        mo1924();
        Iterator it = mo1923().iterator();
        while (it.hasNext()) {
            ((AbstractC1675) it.next()).mo1221(this.f8534);
        }
    }

    @Override // p000.AbstractC2643
    public final int mo3852() {
        Collection collectionMo1923 = mo1923();
        int size = collectionMo1923.size();
        if (size == 0) {
            return 0;
        }
        return ((AbstractC1675) collectionMo1923.iterator().next()).mo1921() * size;
    }

    @Override // p000.AbstractC2643
    public final void mo3853(C0519 c0519) {
        Iterator it = mo1923().iterator();
        while (it.hasNext()) {
            ((AbstractC1675) it.next()).mo1922(this.f8534, c0519);
            c0519.m1830(this.f8535);
        }
    }

    public abstract void mo1924();
}
