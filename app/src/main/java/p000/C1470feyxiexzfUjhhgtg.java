package p000;

import java.util.RandomAccess;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸能不能ᛳᛱUjhhgtgᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1470feyxiexzfUjhhgtg extends AbstractC2933Ujhhgtgfeyxiexzf implements RandomAccess {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2633Ujhhgtgfeyxiexzf[] f5108Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int[] f5109Ujhhgtgfeyxiexzf;

    public C1470feyxiexzfUjhhgtg(C2633Ujhhgtgfeyxiexzf[] c2633UjhhgtgfeyxiexzfArr, int[] iArr) {
        this.f5108Ujhhgtgfeyxiexzf = c2633UjhhgtgfeyxiexzfArr;
        this.f5109Ujhhgtgfeyxiexzf = iArr;
    }

    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C2633Ujhhgtgfeyxiexzf) {
            return super.contains((C2633Ujhhgtgfeyxiexzf) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f5108Ujhhgtgfeyxiexzf[i];
    }

    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C2633Ujhhgtgfeyxiexzf) {
            return super.indexOf((C2633Ujhhgtgfeyxiexzf) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C2633Ujhhgtgfeyxiexzf) {
            return super.lastIndexOf((C2633Ujhhgtgfeyxiexzf) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo1287Ujhhgtgfeyxiexzf() {
        return this.f5108Ujhhgtgfeyxiexzf.length;
    }
}
