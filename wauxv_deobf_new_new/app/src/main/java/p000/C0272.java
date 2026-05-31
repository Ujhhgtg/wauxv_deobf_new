package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᤝᲁᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0272 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f1527;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f1528 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f1529;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0274 f1530;

    public C0272(C0274 c0274) {
        this.f1530 = c0274;
        this.f1527 = c0274.f8887 - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f1529) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f1528;
        C0274 c0274 = this.f1530;
        return AbstractC1469.m3322(key, c0274.m4743(i)) && AbstractC1469.m3322(entry.getValue(), c0274.m4744(this.f1528));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f1529) {
            return this.f1530.m4743(this.f1528);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f1529) {
            return this.f1530.m4744(this.f1528);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1528 < this.f1527;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f1529) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f1528;
        C0274 c0274 = this.f1530;
        Object objM4743 = c0274.m4743(i);
        Object objM4744 = c0274.m4744(this.f1528);
        return (objM4743 == null ? 0 : objM4743.hashCode()) ^ (objM4744 != null ? objM4744.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1528++;
        this.f1529 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1529) {
            throw new IllegalStateException();
        }
        this.f1530.mo2013(this.f1528);
        this.f1528--;
        this.f1527--;
        this.f1529 = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f1529) {
            return this.f1530.mo2014(this.f1528, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
