package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲᛳᛴ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2350Ujhhgtgfeyxiexzf extends AbstractC1791feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7662Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f7663Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ WeakReference f7664Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C2353Ujhhgtgfeyxiexzf f7665Ujhhgtgfeyxiexzf;

    public C2350Ujhhgtgfeyxiexzf(C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf, int i, int i2, WeakReference weakReference) {
        this.f7665Ujhhgtgfeyxiexzf = c2353Ujhhgtgfeyxiexzf;
        this.f7662Ujhhgtgfeyxiexzf = i;
        this.f7663Ujhhgtgfeyxiexzf = i2;
        this.f7664Ujhhgtgfeyxiexzf = weakReference;
    }

    @Override // p000.AbstractC1791feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ */
    public final void mo3168feyxiexzfUjhhgtg(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f7662Ujhhgtgfeyxiexzf) != -1) {
            typeface = AbstractC2354Ujhhgtgfeyxiexzf.m3567Ujhhgtgfeyxiexzf(typeface, i, (this.f7663Ujhhgtgfeyxiexzf & 2) != 0);
        }
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7665Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf.f7682Ujhhgtgfeyxiexzf) {
            c2353Ujhhgtgfeyxiexzf.f7681Ujhhgtgfeyxiexzf = typeface;
            TextView textView = (TextView) this.f7664Ujhhgtgfeyxiexzf.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC2349Ujhhgtgfeyxiexzf(textView, typeface, c2353Ujhhgtgfeyxiexzf.f7679Ujhhgtgfeyxiexzf));
                } else {
                    textView.setTypeface(typeface, c2353Ujhhgtgfeyxiexzf.f7679Ujhhgtgfeyxiexzf);
                }
            }
        }
    }

    @Override // p000.AbstractC1791feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ */
    public final void mo3167feyxiexzfUjhhgtg(int i) {
    }
}
