package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ要点脸能不能ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1025feyxiexzfUjhhgtg extends AbstractC1004feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f4022Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Matrix f4023Ujhhgtgfeyxiexzf;

    public C1025feyxiexzfUjhhgtg(ArrayList arrayList, Matrix matrix) {
        this.f4022Ujhhgtgfeyxiexzf = arrayList;
        this.f4023Ujhhgtgfeyxiexzf = matrix;
    }

    @Override // p000.AbstractC1004feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo2501Ujhhgtgfeyxiexzf(Matrix matrix, C1015feyxiexzfUjhhgtg c1015feyxiexzfUjhhgtg, int i, Canvas canvas) {
        Iterator it = this.f4022Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            ((AbstractC1004feyxiexzfUjhhgtg) it.next()).mo2501Ujhhgtgfeyxiexzf(this.f4023Ujhhgtgfeyxiexzf, c1015feyxiexzfUjhhgtg, i, canvas);
        }
    }
}
