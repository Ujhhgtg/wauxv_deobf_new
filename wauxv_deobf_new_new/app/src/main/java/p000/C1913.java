package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᤝᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1913 extends AbstractC1915 implements Iterator, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6308;

    public C1913(C1916 c1916, int i) {
        this.f6308 = i;
        this.f6315 = c1916;
        this.f6313 = -1;
        this.f6314 = c1916.f6324;
        m3855();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6308) {
            case 0:
                m3851();
                int i = this.f6312;
                C1916 c1916 = (C1916) this.f6315;
                if (i >= c1916.f6322) {
                    throw new NoSuchElementException();
                }
                this.f6312 = i + 1;
                this.f6313 = i;
                C1914 c1914 = new C1914(c1916, i);
                m3855();
                return c1914;
            case 1:
                m3851();
                int i2 = this.f6312;
                C1916 c1917 = (C1916) this.f6315;
                if (i2 >= c1917.f6322) {
                    throw new NoSuchElementException();
                }
                this.f6312 = i2 + 1;
                this.f6313 = i2;
                Object obj = c1917.f6317[i2];
                m3855();
                return obj;
            default:
                m3851();
                int i3 = this.f6312;
                C1916 c1918 = (C1916) this.f6315;
                if (i3 >= c1918.f6322) {
                    throw new NoSuchElementException();
                }
                this.f6312 = i3 + 1;
                this.f6313 = i3;
                Object obj2 = c1918.f6318[i3];
                m3855();
                return obj2;
        }
    }
}
