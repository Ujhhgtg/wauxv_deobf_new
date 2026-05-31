package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᤝᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0270 implements Iterator, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f1521;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f1522;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f1523;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1524;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f1525;

    public C0270(int i) {
        this.f1521 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1522 < this.f1521;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM4743;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f1522;
        switch (this.f1524) {
            case 0:
                objM4743 = ((C0274) this.f1525).m4743(i);
                break;
            case 1:
                objM4743 = ((C0274) this.f1525).m4744(i);
                break;
            default:
                objM4743 = ((C0279) this.f1525).f1545[i];
                break;
        }
        this.f1522++;
        this.f1523 = true;
        return objM4743;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1523) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f1522 - 1;
        this.f1522 = i;
        switch (this.f1524) {
            case 0:
                ((C0274) this.f1525).mo2013(i);
                break;
            case 1:
                ((C0274) this.f1525).mo2013(i);
                break;
            default:
                ((C0279) this.f1525).m1522(i);
                break;
        }
        this.f1521--;
        this.f1523 = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0270(C0279 c0279) {
        this(c0279.f1546);
        this.f1524 = 2;
        this.f1525 = c0279;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0270(C0274 c0274, int i) {
        this(c0274.f8887);
        this.f1524 = i;
        switch (i) {
            case 1:
                this.f1525 = c0274;
                this(c0274.f8887);
                break;
            default:
                this.f1525 = c0274;
                break;
        }
    }
}
