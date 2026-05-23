package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1888 implements Map.Entry, InterfaceC1737 {

    public final C1890 f6235;

    public final int f6236;

    public final int f6237;

    public C1888(C1890 c1890, int i) {
        this.f6235 = c1890;
        this.f6236 = i;
        this.f6237 = c1890.f6250;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC2207.m4087(entry.getKey(), getKey()) && AbstractC2207.m4087(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m3670();
        return this.f6235.f6243[this.f6236];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m3670();
        return this.f6235.f6244[this.f6236];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m3670();
        C1890 c1890 = this.f6235;
        c1890.m3682();
        Object[] objArr = c1890.f6244;
        if (objArr == null) {
            int length = c1890.f6243.length;
            if (false) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c1890.f6244 = objArr;
        }
        int i = this.f6236;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }

    public final void m3670() {
        if (this.f6235.f6250 != this.f6237) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }
}
