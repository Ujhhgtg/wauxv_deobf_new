package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0262 implements Iterator, Map.Entry {

    public int f1453;

    public int f1454 = -1;

    public boolean f1455;

    public final /* synthetic */ C0264 f1456;

    public C0262(C0264 c0264) {
        this.f1456 = c0264;
        this.f1453 = c0264.f8716 - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f1455) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f1454;
        C0264 c0264 = this.f1456;
        return AbstractC2207.m4087(key, c0264.m4706(i)) && AbstractC2207.m4087(entry.getValue(), c0264.m4707(this.f1454));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f1455) {
            return this.f1456.m4706(this.f1454);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f1455) {
            return this.f1456.m4707(this.f1454);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1454 < this.f1453;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f1455) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f1454;
        C0264 c0264 = this.f1456;
        Object objM4706 = c0264.m4706(i);
        Object objM4707 = c0264.m4707(this.f1454);
        return (objM4706 == null ? 0 : objM4706.hashCode()) ^ (objM4707 != null ? objM4707.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1454++;
        this.f1455 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1455) {
            throw new IllegalStateException();
        }
        this.f1456.mo1918(this.f1454);
        this.f1454--;
        this.f1453--;
        this.f1455 = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f1455) {
            return this.f1456.mo1919(this.f1454, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
