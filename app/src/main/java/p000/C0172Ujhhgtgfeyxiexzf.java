package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ能不能要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0172Ujhhgtgfeyxiexzf implements Map.Entry, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0174Ujhhgtgfeyxiexzf f1359Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f1360Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f1361Ujhhgtgfeyxiexzf;

    public C0172Ujhhgtgfeyxiexzf(C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf, int i) {
        this.f1359Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf;
        this.f1360Ujhhgtgfeyxiexzf = i;
        this.f1361Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf.f1372Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(entry.getKey(), getKey()) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m1233Ujhhgtgfeyxiexzf();
        return this.f1359Ujhhgtgfeyxiexzf.f1365Ujhhgtgfeyxiexzf[this.f1360Ujhhgtgfeyxiexzf];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m1233Ujhhgtgfeyxiexzf();
        return this.f1359Ujhhgtgfeyxiexzf.f1366Ujhhgtgfeyxiexzf[this.f1360Ujhhgtgfeyxiexzf];
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
        m1233Ujhhgtgfeyxiexzf();
        C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = this.f1359Ujhhgtgfeyxiexzf;
        c0174Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
        Object[] objArr = c0174Ujhhgtgfeyxiexzf.f1366Ujhhgtgfeyxiexzf;
        if (objArr == null) {
            int length = c0174Ujhhgtgfeyxiexzf.f1365Ujhhgtgfeyxiexzf.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c0174Ujhhgtgfeyxiexzf.f1366Ujhhgtgfeyxiexzf = objArr;
        }
        int i = this.f1360Ujhhgtgfeyxiexzf;
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m1233Ujhhgtgfeyxiexzf() {
        if (this.f1359Ujhhgtgfeyxiexzf.f1372Ujhhgtgfeyxiexzf != this.f1361Ujhhgtgfeyxiexzf) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }
}
