package p000;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2847Ujhhgtgfeyxiexzf implements Iterator {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f9046Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f9047Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f9048Ujhhgtgfeyxiexzf;

    public C2847Ujhhgtgfeyxiexzf(Object obj) {
        this.f9048Ujhhgtgfeyxiexzf = obj;
        this.f9047Ujhhgtgfeyxiexzf = Array.getLength(obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9046Ujhhgtgfeyxiexzf < this.f9047Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object obj = this.f9048Ujhhgtgfeyxiexzf;
            int i = this.f9046Ujhhgtgfeyxiexzf;
            this.f9046Ujhhgtgfeyxiexzf = i + 1;
            return Array.get(obj, i);
        } catch (Throwable th) {
            throw new NoSuchElementException(th.getMessage());
        }
    }
}
