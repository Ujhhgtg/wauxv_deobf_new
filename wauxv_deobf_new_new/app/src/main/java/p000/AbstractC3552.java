package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᲀᲇᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3552 extends AbstractC2704 {
    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo4044(AbstractC1690 abstractC1690) {
        AbstractC1641 abstractC1641 = (AbstractC1641) abstractC1690;
        int iMo2016 = abstractC1641.mo2016() * abstractC1641.m3509();
        if (iMo2016 < 0) {
            throw new IllegalArgumentException("relative < 0");
        }
        int i = this.f8701;
        if (i >= 0) {
            return i + iMo2016;
        }
        throw new RuntimeException("fileOffset not yet set");
    }

    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo4045() {
        mo2019();
        Iterator it = mo2018().iterator();
        while (it.hasNext()) {
            ((AbstractC1690) it.next()).mo1367(this.f8699);
        }
    }

    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo4046() {
        Collection collectionMo2018 = mo2018();
        int size = collectionMo2018.size();
        if (size == 0) {
            return 0;
        }
        return ((AbstractC1690) collectionMo2018.iterator().next()).mo2016() * size;
    }

    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo4047(C0496 c0496) {
        Iterator it = mo2018().iterator();
        while (it.hasNext()) {
            ((AbstractC1690) it.next()).mo2017(this.f8699, c0496);
            c0496.m1924(this.f8700);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public abstract void mo2019();
}
