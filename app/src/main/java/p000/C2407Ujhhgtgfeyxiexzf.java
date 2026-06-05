package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴ要点脸ᛱfeyxiexzfᛱᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2407Ujhhgtgfeyxiexzf extends AbstractSet {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C2412Ujhhgtgfeyxiexzf f7805Ujhhgtgfeyxiexzf;

    public C2407Ujhhgtgfeyxiexzf(C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf) {
        this.f7805Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2410Ujhhgtgfeyxiexzf(this.f7805Ujhhgtgfeyxiexzf);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7805Ujhhgtgfeyxiexzf.f4069Ujhhgtgfeyxiexzf;
    }
}
