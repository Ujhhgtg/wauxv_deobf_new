package p000;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛳ要点脸ᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1909Ujhhgtgfeyxiexzf extends AbstractC0171Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f6372Ujhhgtgfeyxiexzf;

    public C1909Ujhhgtgfeyxiexzf(int i, Class cls, int i2, int i3, int i4) {
        this.f6372Ujhhgtgfeyxiexzf = i4;
        this.f1355Ujhhgtgfeyxiexzf = i;
        this.f1358Ujhhgtgfeyxiexzf = cls;
        this.f1357Ujhhgtgfeyxiexzf = i2;
        this.f1356Ujhhgtgfeyxiexzf = i3;
    }

    @Override // p000.AbstractC0171Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final Object mo1226Ujhhgtgfeyxiexzf(View view) {
        switch (this.f6372Ujhhgtgfeyxiexzf) {
            case 0:
                return AbstractC1890Ujhhgtgfeyxiexzf.m3218Ujhhgtgfeyxiexzf(view);
            default:
                return AbstractC1899feyxiexzfUjhhgtg.m3236Ujhhgtgfeyxiexzf(view);
        }
    }

    @Override // p000.AbstractC0171Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo1227Ujhhgtgfeyxiexzf(View view, Object obj) {
        switch (this.f6372Ujhhgtgfeyxiexzf) {
            case 0:
                AbstractC1890Ujhhgtgfeyxiexzf.m3221Ujhhgtgfeyxiexzf(view, (CharSequence) obj);
                break;
            default:
                AbstractC1899feyxiexzfUjhhgtg.m3237Ujhhgtgfeyxiexzf(view, (CharSequence) obj);
                break;
        }
    }

    @Override // p000.AbstractC0171Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final boolean mo1232Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f6372Ujhhgtgfeyxiexzf) {
            case 0:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
        }
        return !zEquals;
    }
}
