package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3496 extends AbstractC2270 {

    public final EnumC1683 f10995;

    public final ArrayList f10996;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3496(EnumC1683 enumC1683, ArrayList arrayList) {
        int iM5095 = m5095(arrayList);
        AbstractC2270 abstractC2270 = (AbstractC2270) arrayList.get(0);
        super(iM5095, m5095(arrayList) + (abstractC2270.mo1921() * arrayList.size()));
        if (enumC1683 == null) {
            throw new NullPointerException("itemType == null");
        }
        this.f10996 = arrayList;
        this.f10995 = enumC1683;
    }

    public static int m5095(ArrayList arrayList) {
        try {
            return Math.max(4, ((AbstractC2270) arrayList.get(0)).f7367);
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C3496.class.getName());
        sb.append(this.f10996);
        return sb.toString();
    }

    @Override // p000.AbstractC1675
    public final void mo1221(C1023 c1023) {
        Iterator it = this.f10996.iterator();
        while (it.hasNext()) {
            ((AbstractC2270) it.next()).mo1221(c1023);
        }
    }

    @Override // p000.AbstractC1675
    public final EnumC1683 mo1222() {
        return this.f10995;
    }

    @Override // p000.AbstractC2270
    public final void mo1224(C1986 c1986, int i) {
        int iM4152 = i + this.f7367;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        for (AbstractC2270 abstractC2270 : this.f10996) {
            int iMo1921 = abstractC2270.mo1921();
            int i4 = abstractC2270.f7367;
            if (z) {
                z = false;
                i2 = iMo1921;
                i3 = i4;
            } else {
                if (iMo1921 != i2) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (i4 != i3) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            }
            iM4152 = abstractC2270.m4152(c1986, iM4152) + iMo1921;
        }
    }

    @Override // p000.AbstractC2270
    public final void mo1225(C1023 c1023, C0519 c0519) {
        ArrayList arrayList = this.f10996;
        int size = arrayList.size();
        if (c0519.m1833()) {
            c0519.m1831(0, m4151() + " " + this.f10995.f5738);
            c0519.m1831(4, "  size: ".concat(AbstractC1460.m3224(size)));
        }
        c0519.m1839(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2270) it.next()).mo1922(c1023, c0519);
        }
    }
}
