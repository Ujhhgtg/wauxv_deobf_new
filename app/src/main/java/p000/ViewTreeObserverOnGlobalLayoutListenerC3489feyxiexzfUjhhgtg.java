package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsetsController;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3489feyxiexzfUjhhgtg implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ View f10832Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ C3491Ujhhgtgfeyxiexzf f10833Ujhhgtgfeyxiexzf;

    public ViewTreeObserverOnGlobalLayoutListenerC3489feyxiexzfUjhhgtg(C3491Ujhhgtgfeyxiexzf c3491Ujhhgtgfeyxiexzf, View view) {
        this.f10833Ujhhgtgfeyxiexzf = c3491Ujhhgtgfeyxiexzf;
        this.f10832Ujhhgtgfeyxiexzf = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        View view = this.f10832Ujhhgtgfeyxiexzf;
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getHeight();
        int i = Build.VERSION.SDK_INT;
        C3491Ujhhgtgfeyxiexzf c3491Ujhhgtgfeyxiexzf = this.f10833Ujhhgtgfeyxiexzf;
        WindowInsetsController windowInsetsController = i >= 30 ? c3491Ujhhgtgfeyxiexzf.m4977Ujhhgtgfeyxiexzf().getWindowInsetsController() : null;
        if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
            rect.bottom = height;
        }
        int i2 = height - rect.bottom;
        if (i2 != c3491Ujhhgtgfeyxiexzf.f10844Ujhhgtgfeyxiexzf) {
            c3491Ujhhgtgfeyxiexzf.f10844Ujhhgtgfeyxiexzf = i2;
            int i3 = DialogXBaseRelativeLayout.f1012Ujhhgtgfeyxiexzf;
            C3490feyxiexzfUjhhgtg c3490feyxiexzfUjhhgtg = c3491Ujhhgtgfeyxiexzf.f10843Ujhhgtgfeyxiexzf;
            if (c3490feyxiexzfUjhhgtg != null) {
                c3491Ujhhgtgfeyxiexzf.m4975Ujhhgtgfeyxiexzf(c3490feyxiexzfUjhhgtg);
            }
        }
    }
}
