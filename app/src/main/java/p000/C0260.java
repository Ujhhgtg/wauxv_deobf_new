package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0260 implements Iterator, InterfaceC1737 {

    public int f1447;

    public int f1448;

    public boolean f1449;

    public final /* synthetic */ int f1450;

    public final /* synthetic */ Object f1451;

    public C0260(int i) {
        this.f1447 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1448 < this.f1447;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM4706;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f1448;
        switch (this.f1450) {
            case 0:
                objM4706 = ((C0264) this.f1451).m4706(i);
                break;
            case 1:
                objM4706 = ((C0264) this.f1451).m4707(i);
                break;
            default:
                objM4706 = ((C0269) this.f1451).f1471[i];
                break;
        }
        this.f1448++;
        this.f1449 = true;
        return objM4706;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1449) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f1448 - 1;
        this.f1448 = i;
        switch (this.f1450) {
            case 0:
                ((C0264) this.f1451).mo1918(i);
                break;
            case 1:
                ((C0264) this.f1451).mo1918(i);
                break;
            default:
                ((C0269) this.f1451).m1376(i);
                break;
        }
        this.f1447--;
        this.f1449 = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0260(C0269 c0269) {
        this(c0269.f1472);
        this.f1450 = 2;
        this.f1451 = c0269;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0260(C0264 c0264, int i) {
        this(c0264.f8716);
        this.f1450 = i;
        switch (i) {
            case 1:
                this.f1451 = c0264;
                this(c0264.f8716);
                break;
            default:
                this.f1451 = c0264;
                break;
        }
    }
}
