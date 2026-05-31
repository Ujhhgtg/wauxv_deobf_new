package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲇᲀᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1011 implements Iterator, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f3684 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f3685;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3686;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C1679 f3687;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1012 f3688;

    public C1011(C1012 c1012) {
        this.f3688 = c1012;
        int iM5328 = AbstractC3744.m5328(0, ((CharSequence) c1012.f3690).length());
        this.f3685 = iM5328;
        this.f3686 = iM5328;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3684 == -1) {
            m2702();
        }
        return this.f3684 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3684 == -1) {
            m2702();
        }
        if (this.f3684 == 0) {
            throw new NoSuchElementException();
        }
        C1679 c1679 = this.f3687;
        this.f3687 = null;
        this.f3684 = -1;
        return c1679;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2702() {
        C2348 c2348;
        C1012 c1012 = this.f3688;
        CharSequence charSequence = (CharSequence) c1012.f3690;
        int i = this.f3686;
        if (i < 0) {
            this.f3684 = 0;
            this.f3687 = null;
            return;
        }
        if (i <= charSequence.length() && (c2348 = (C2348) ((InterfaceC1437) c1012.f3691).mo1342(charSequence, Integer.valueOf(this.f3686))) != null) {
            int iIntValue = ((Number) c2348.f7567).intValue();
            int iIntValue2 = ((Number) c2348.f7568).intValue();
            this.f3687 = AbstractC3744.m5348(this.f3685, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.f3685 = i2;
            this.f3686 = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f3687 = new C1679(this.f3685, AbstractC2901.m4863(charSequence), 1);
            this.f3686 = -1;
        }
        this.f3684 = 1;
    }
}
