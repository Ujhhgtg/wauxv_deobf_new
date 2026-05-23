package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2616 extends AbstractC2619 implements Iterator {

    public C2617 f8493;

    public C2617 f8494;

    public final /* synthetic */ int f8495;

    public C2616(C2617 c2617, C2617 c2618, int i) {
        this.f8495 = i;
        this.f8493 = c2618;
        this.f8494 = c2617;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8494 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2617 c2617 = this.f8494;
        C2617 c2618 = this.f8493;
        this.f8494 = (c2617 == c2618 || c2618 == null) ? null : m4632(c2617);
        return c2617;
    }

    @Override // p000.AbstractC2619
    public final void mo4631(C2617 c2617) {
        C2617 c2618;
        C2617 c2617M4632 = null;
        if (this.f8493 == c2617 && c2617 == this.f8494) {
            this.f8494 = null;
            this.f8493 = null;
        }
        C2617 c2619 = this.f8493;
        if (c2619 == c2617) {
            switch (this.f8495) {
                case 0:
                    c2618 = c2619.f8499;
                    break;
                default:
                    c2618 = c2619.f8498;
                    break;
            }
            this.f8493 = c2618;
        }
        C2617 c26110 = this.f8494;
        if (c26110 == c2617) {
            C2617 c26111 = this.f8493;
            if (c26110 != c26111 && c26111 != null) {
                c2617M4632 = m4632(c26110);
            }
            this.f8494 = c2617M4632;
        }
    }

    public final C2617 m4632(C2617 c2617) {
        switch (this.f8495) {
            case 0:
                return c2617.f8498;
            default:
                return c2617.f8499;
        }
    }
}
