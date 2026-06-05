package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ要点脸能不能ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1961feyxiexzfUjhhgtg extends AbstractC1090feyxiexzfUjhhgtg {
    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo1504Ujhhgtgfeyxiexzf(AbstractC0691Ujhhgtgfeyxiexzf abstractC0691Ujhhgtgfeyxiexzf) {
        AbstractC0644Ujhhgtgfeyxiexzf abstractC0644Ujhhgtgfeyxiexzf = (AbstractC0644Ujhhgtgfeyxiexzf) abstractC0691Ujhhgtgfeyxiexzf;
        int iMo1294Ujhhgtgfeyxiexzf = abstractC0644Ujhhgtgfeyxiexzf.mo1294Ujhhgtgfeyxiexzf() * abstractC0644Ujhhgtgfeyxiexzf.m1909Ujhhgtgfeyxiexzf();
        if (iMo1294Ujhhgtgfeyxiexzf < 0) {
            throw new IllegalArgumentException("relative < 0");
        }
        int i = this.f4174Ujhhgtgfeyxiexzf;
        if (i >= 0) {
            return i + iMo1294Ujhhgtgfeyxiexzf;
        }
        throw new RuntimeException("fileOffset not yet set");
    }

    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo1506Ujhhgtgfeyxiexzf() {
        mo1298Ujhhgtgfeyxiexzf();
        Iterator it = mo1505Ujhhgtgfeyxiexzf().iterator();
        while (it.hasNext()) {
            ((AbstractC0691Ujhhgtgfeyxiexzf) it.next()).mo1274Ujhhgtgfeyxiexzf(this.f4172Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final int mo1507Ujhhgtgfeyxiexzf() {
        Collection collectionMo1505Ujhhgtgfeyxiexzf = mo1505Ujhhgtgfeyxiexzf();
        int size = collectionMo1505Ujhhgtgfeyxiexzf.size();
        if (size == 0) {
            return 0;
        }
        return ((AbstractC0691Ujhhgtgfeyxiexzf) collectionMo1505Ujhhgtgfeyxiexzf.iterator().next()).mo1294Ujhhgtgfeyxiexzf() * size;
    }

    @Override // p000.AbstractC1090feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo1508Ujhhgtgfeyxiexzf(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        Iterator it = mo1505Ujhhgtgfeyxiexzf().iterator();
        while (it.hasNext()) {
            ((AbstractC0691Ujhhgtgfeyxiexzf) it.next()).mo1295Ujhhgtgfeyxiexzf(this.f4172Ujhhgtgfeyxiexzf, c2608Ujhhgtgfeyxiexzf);
            c2608Ujhhgtgfeyxiexzf.m3885Ujhhgtgfeyxiexzf(this.f4173Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public abstract void mo1298Ujhhgtgfeyxiexzf();
}
