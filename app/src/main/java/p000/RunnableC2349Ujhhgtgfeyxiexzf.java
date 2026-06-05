package p000;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2349Ujhhgtgfeyxiexzf implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7658Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f7659Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ View f7660Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f7661Ujhhgtgfeyxiexzf;

    public RunnableC2349Ujhhgtgfeyxiexzf(TextView textView, Typeface typeface, int i) {
        this.f7660Ujhhgtgfeyxiexzf = textView;
        this.f7661Ujhhgtgfeyxiexzf = typeface;
        this.f7659Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7658Ujhhgtgfeyxiexzf) {
            case 0:
                ((TextView) this.f7660Ujhhgtgfeyxiexzf).setTypeface((Typeface) this.f7661Ujhhgtgfeyxiexzf, this.f7659Ujhhgtgfeyxiexzf);
                break;
            default:
                ((BottomSheetBehavior) this.f7661Ujhhgtgfeyxiexzf).m794feyxiexzfUjhhgtg(this.f7660Ujhhgtgfeyxiexzf, this.f7659Ujhhgtgfeyxiexzf, false);
                break;
        }
    }

    public RunnableC2349Ujhhgtgfeyxiexzf(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f7661Ujhhgtgfeyxiexzf = bottomSheetBehavior;
        this.f7660Ujhhgtgfeyxiexzf = view;
        this.f7659Ujhhgtgfeyxiexzf = i;
    }
}
