package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1887 extends AbstractC1889 implements Iterator, InterfaceC1737 {

    public final /* synthetic */ int f6234;

    public C1887(C1890 c1890, int i) {
        this.f6234 = i;
        this.f6241 = c1890;
        this.f6239 = -1;
        this.f6240 = c1890.f6250;
        m3677();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6234) {
            case 0:
                m3673();
                int i = this.f6238;
                C1890 c1890 = (C1890) this.f6241;
                if (i >= c1890.f6248) {
                    throw new NoSuchElementException();
                }
                this.f6238 = i + 1;
                this.f6239 = i;
                C1888 c1888 = new C1888(c1890, i);
                m3677();
                return c1888;
            case 1:
                m3673();
                int i2 = this.f6238;
                C1890 c1891 = (C1890) this.f6241;
                if (i2 >= c1891.f6248) {
                    throw new NoSuchElementException();
                }
                this.f6238 = i2 + 1;
                this.f6239 = i2;
                Object obj = c1891.f6243[i2];
                m3677();
                return obj;
            default:
                m3673();
                int i3 = this.f6238;
                C1890 c1892 = (C1890) this.f6241;
                if (i3 >= c1892.f6248) {
                    throw new NoSuchElementException();
                }
                this.f6238 = i3 + 1;
                this.f6239 = i3;
                Object obj2 = c1892.f6244[i3];
                m3677();
                return obj2;
        }
    }
}
