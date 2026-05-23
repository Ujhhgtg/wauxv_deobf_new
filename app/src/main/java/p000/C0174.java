package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0174 extends AbstractC2270 {

    public final C0177 f1209;

    public final C0172[] f1210;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0174(C0177 c0177, C1023 c1023) {
        try {
            TreeMap treeMap = c0177.f1224;
            super(4, (treeMap.size() * 4) + 4);
            this.f1209 = c0177;
            this.f1210 = new C0172[treeMap.size()];
            Iterator it = Collections.unmodifiableCollection(treeMap.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                this.f1210[i] = new C0172((C0165) it.next(), c1023);
                i++;
            }
        } catch (NullPointerException unused) {
            throw new NullPointerException("list == null");
        }
    }

    public final int hashCode() {
        return this.f1209.f1224.hashCode();
    }

    @Override // p000.AbstractC1675
    public final void mo1221(C1023 c1023) {
        C1986 c1986 = c1023.f3750;
        C0172[] c0172Arr = this.f1210;
        int length = c0172Arr.length;
        for (int i = 0; i < length; i++) {
            c0172Arr[i] = (C0172) c1986.m3855(c0172Arr[i]);
        }
    }

    @Override // p000.AbstractC1675
    public final EnumC1683 mo1222() {
        return EnumC1683.f5725;
    }

    @Override // p000.AbstractC2270
    public final int mo1223(AbstractC2270 abstractC2270) {
        return this.f1209.compareTo(((C0174) abstractC2270).f1209);
    }

    @Override // p000.AbstractC2270
    public final void mo1224(C1986 c1986, int i) {
        Arrays.sort(this.f1210, C0172.f1203);
    }

    @Override // p000.AbstractC2270
    public final void mo1225(C1023 c1023, C0519 c0519) {
        boolean zM1833 = c0519.m1833();
        C0172[] c0172Arr = this.f1210;
        int length = c0172Arr.length;
        if (zM1833) {
            c0519.m1831(0, m4151() + " annotation set");
            c0519.m1831(4, "  size: ".concat(AbstractC1460.m3224(length)));
        }
        c0519.m1839(length);
        for (int i = 0; i < length; i++) {
            int iM4150 = c0172Arr[i].m4150();
            if (zM1833) {
                c0519.m1831(4, "  entries[" + Integer.toHexString(i) + "]: " + AbstractC1460.m3224(iM4150));
                C0172 c0172 = c0172Arr[i];
                c0172.getClass();
                C0165 c0165 = c0172.f1204;
                c0519.m1831(0, "    visibility: ".concat(AbstractC2784.m4734(c0165.f1191)));
                c0519.m1831(0, "    type: " + c0165.f1190.f3401.mo1214());
                for (C2119 c2119 : Collections.unmodifiableCollection(c0165.f1192.values())) {
                    c0519.m1831(0, "    " + c2119.f6978.mo1214() + ": " + C2825.m4801(c2119.f6979));
                }
            }
            c0519.m1839(iM4150);
        }
    }
}
