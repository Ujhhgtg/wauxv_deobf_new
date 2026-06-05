package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ要点脸能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0102Ujhhgtgfeyxiexzf implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1211Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0253Ujhhgtgfeyxiexzf f1212Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC0102Ujhhgtgfeyxiexzf(AbstractC0253Ujhhgtgfeyxiexzf abstractC0253Ujhhgtgfeyxiexzf, int i) {
        this.f1211Ujhhgtgfeyxiexzf = i;
        this.f1212Ujhhgtgfeyxiexzf = abstractC0253Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1211Ujhhgtgfeyxiexzf) {
            case 0:
                C0363Ujhhgtgfeyxiexzf c0363Ujhhgtgfeyxiexzf = this.f1212Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf;
                if (c0363Ujhhgtgfeyxiexzf != null) {
                    c0363Ujhhgtgfeyxiexzf.setListSelectionHidden(true);
                    c0363Ujhhgtgfeyxiexzf.requestLayout();
                }
                break;
            default:
                AbstractC0253Ujhhgtgfeyxiexzf abstractC0253Ujhhgtgfeyxiexzf = this.f1212Ujhhgtgfeyxiexzf;
                C0363Ujhhgtgfeyxiexzf c0363Ujhhgtgfeyxiexzf2 = abstractC0253Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf;
                if (c0363Ujhhgtgfeyxiexzf2 != null && c0363Ujhhgtgfeyxiexzf2.isAttachedToWindow() && abstractC0253Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf.getCount() > abstractC0253Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf.getChildCount() && abstractC0253Ujhhgtgfeyxiexzf.f1589Ujhhgtgfeyxiexzf.getChildCount() <= Integer.MAX_VALUE) {
                    abstractC0253Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf.setInputMethodMode(2);
                    abstractC0253Ujhhgtgfeyxiexzf.mo1416Ujhhgtgfeyxiexzf();
                    break;
                }
                break;
        }
    }
}
