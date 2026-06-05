package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴ要点脸ᛲᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2410Ujhhgtgfeyxiexzf implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f7812Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f7813Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f7814Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C2412Ujhhgtgfeyxiexzf f7815Ujhhgtgfeyxiexzf;

    public C2410Ujhhgtgfeyxiexzf(C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf) {
        this.f7815Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf;
        this.f7812Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f7814Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f7813Ujhhgtgfeyxiexzf;
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7815Ujhhgtgfeyxiexzf;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(key, c2412Ujhhgtgfeyxiexzf.m2536Ujhhgtgfeyxiexzf(i)) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(entry.getValue(), c2412Ujhhgtgfeyxiexzf.m2540Ujhhgtgfeyxiexzf(this.f7813Ujhhgtgfeyxiexzf));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f7814Ujhhgtgfeyxiexzf) {
            return this.f7815Ujhhgtgfeyxiexzf.m2536Ujhhgtgfeyxiexzf(this.f7813Ujhhgtgfeyxiexzf);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f7814Ujhhgtgfeyxiexzf) {
            return this.f7815Ujhhgtgfeyxiexzf.m2540Ujhhgtgfeyxiexzf(this.f7813Ujhhgtgfeyxiexzf);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7813Ujhhgtgfeyxiexzf < this.f7812Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f7814Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f7813Ujhhgtgfeyxiexzf;
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f7815Ujhhgtgfeyxiexzf;
        Object objM2536Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf.m2536Ujhhgtgfeyxiexzf(i);
        Object objM2540Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf.m2540Ujhhgtgfeyxiexzf(this.f7813Ujhhgtgfeyxiexzf);
        return (objM2536Ujhhgtgfeyxiexzf == null ? 0 : objM2536Ujhhgtgfeyxiexzf.hashCode()) ^ (objM2540Ujhhgtgfeyxiexzf != null ? objM2540Ujhhgtgfeyxiexzf.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7813Ujhhgtgfeyxiexzf++;
        this.f7814Ujhhgtgfeyxiexzf = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7814Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException();
        }
        this.f7815Ujhhgtgfeyxiexzf.mo2538Ujhhgtgfeyxiexzf(this.f7813Ujhhgtgfeyxiexzf);
        this.f7813Ujhhgtgfeyxiexzf--;
        this.f7812Ujhhgtgfeyxiexzf--;
        this.f7814Ujhhgtgfeyxiexzf = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f7814Ujhhgtgfeyxiexzf) {
            return this.f7815Ujhhgtgfeyxiexzf.mo2539Ujhhgtgfeyxiexzf(this.f7813Ujhhgtgfeyxiexzf, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
