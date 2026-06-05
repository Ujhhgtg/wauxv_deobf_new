package p000;

import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛳ能不能要点脸ᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0203Ujhhgtgfeyxiexzf implements Map.Entry, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f1454Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f1455Ujhhgtgfeyxiexzf;

    public C0203Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        this.f1454Ujhhgtgfeyxiexzf = obj;
        this.f1455Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0203Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0203Ujhhgtgfeyxiexzf c0203Ujhhgtgfeyxiexzf = (C0203Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1454Ujhhgtgfeyxiexzf, c0203Ujhhgtgfeyxiexzf.f1454Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1455Ujhhgtgfeyxiexzf, c0203Ujhhgtgfeyxiexzf.f1455Ujhhgtgfeyxiexzf);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1454Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1455Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f1454Ujhhgtgfeyxiexzf;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1455Ujhhgtgfeyxiexzf;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f1454Ujhhgtgfeyxiexzf + ", value=" + this.f1455Ujhhgtgfeyxiexzf + ')';
    }
}
