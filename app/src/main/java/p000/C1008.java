package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᤞᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1008 implements Iterator, InterfaceC1737 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f3677 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3678;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f3679;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C1664 f3680;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1009 f3681;

    public C1008(C1009 c1009) {
        this.f3681 = c1009;
        int iM4027 = AbstractC2203.m4027(0, ((CharSequence) c1009.f3683).length());
        this.f3678 = iM4027;
        this.f3679 = iM4027;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3677 == -1) {
            m2578();
        }
        return this.f3677 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3677 == -1) {
            m2578();
        }
        if (this.f3677 == 0) {
            throw new NoSuchElementException();
        }
        C1664 c1664 = this.f3680;
        this.f3680 = null;
        this.f3677 = -1;
        return c1664;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2578() {
        C2315 c2315;
        C1009 c1009 = this.f3681;
        CharSequence charSequence = (CharSequence) c1009.f3683;
        int i = this.f3679;
        if (i < 0) {
            this.f3677 = 0;
            this.f3680 = null;
            return;
        }
        if (i <= charSequence.length() && (c2315 = (C2315) ((InterfaceC1429) c1009.f3684).mo1196(charSequence, Integer.valueOf(this.f3679))) != null) {
            int iIntValue = ((Number) c2315.f7445).intValue();
            int iIntValue2 = ((Number) c2315.f7446).intValue();
            this.f3680 = AbstractC2203.m4044(this.f3678, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.f3678 = i2;
            this.f3679 = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f3680 = new C1664(this.f3678, AbstractC2841.m4830(charSequence), 1);
            this.f3679 = -1;
        }
        this.f3677 = 1;
    }
}
