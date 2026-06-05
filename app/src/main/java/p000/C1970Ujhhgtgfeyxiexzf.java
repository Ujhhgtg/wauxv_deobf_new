package p000;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1970Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public float f6469Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public float f6470Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final WeakReference f6472Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C1969Ujhhgtgfeyxiexzf f6473Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final TextPaint f6467Ujhhgtgfeyxiexzf = new TextPaint(1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2818Ujhhgtgfeyxiexzf f6468Ujhhgtgfeyxiexzf = new C2818Ujhhgtgfeyxiexzf(1, this);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f6471Ujhhgtgfeyxiexzf = true;

    public C1970Ujhhgtgfeyxiexzf(InterfaceC1971Ujhhgtgfeyxiexzf interfaceC1971Ujhhgtgfeyxiexzf) {
        this.f6472Ujhhgtgfeyxiexzf = new WeakReference(null);
        this.f6472Ujhhgtgfeyxiexzf = new WeakReference(interfaceC1971Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final float m3308Ujhhgtgfeyxiexzf(String str) {
        if (!this.f6471Ujhhgtgfeyxiexzf) {
            return this.f6469Ujhhgtgfeyxiexzf;
        }
        m3309Ujhhgtgfeyxiexzf(str);
        return this.f6469Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3309Ujhhgtgfeyxiexzf(String str) {
        TextPaint textPaint = this.f6467Ujhhgtgfeyxiexzf;
        this.f6469Ujhhgtgfeyxiexzf = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f6470Ujhhgtgfeyxiexzf = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f6471Ujhhgtgfeyxiexzf = false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3310Ujhhgtgfeyxiexzf(C1969Ujhhgtgfeyxiexzf c1969Ujhhgtgfeyxiexzf, Context context) {
        if (this.f6473Ujhhgtgfeyxiexzf != c1969Ujhhgtgfeyxiexzf) {
            this.f6473Ujhhgtgfeyxiexzf = c1969Ujhhgtgfeyxiexzf;
            if (c1969Ujhhgtgfeyxiexzf != null) {
                TextPaint textPaint = this.f6467Ujhhgtgfeyxiexzf;
                C2818Ujhhgtgfeyxiexzf c2818Ujhhgtgfeyxiexzf = this.f6468Ujhhgtgfeyxiexzf;
                c1969Ujhhgtgfeyxiexzf.m3306Ujhhgtgfeyxiexzf(context, textPaint, c2818Ujhhgtgfeyxiexzf);
                InterfaceC1971Ujhhgtgfeyxiexzf interfaceC1971Ujhhgtgfeyxiexzf = (InterfaceC1971Ujhhgtgfeyxiexzf) this.f6472Ujhhgtgfeyxiexzf.get();
                if (interfaceC1971Ujhhgtgfeyxiexzf != null) {
                    textPaint.drawableState = interfaceC1971Ujhhgtgfeyxiexzf.getState();
                }
                c1969Ujhhgtgfeyxiexzf.m3305Ujhhgtgfeyxiexzf(context, textPaint, c2818Ujhhgtgfeyxiexzf);
                this.f6471Ujhhgtgfeyxiexzf = true;
            }
            InterfaceC1971Ujhhgtgfeyxiexzf interfaceC1971Ujhhgtgfeyxiexzf2 = (InterfaceC1971Ujhhgtgfeyxiexzf) this.f6472Ujhhgtgfeyxiexzf.get();
            if (interfaceC1971Ujhhgtgfeyxiexzf2 != null) {
                interfaceC1971Ujhhgtgfeyxiexzf2.mo1358Ujhhgtgfeyxiexzf();
                interfaceC1971Ujhhgtgfeyxiexzf2.onStateChange(interfaceC1971Ujhhgtgfeyxiexzf2.getState());
            }
        }
    }
}
