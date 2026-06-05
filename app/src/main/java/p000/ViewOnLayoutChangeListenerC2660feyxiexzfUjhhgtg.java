package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8525Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f8526Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg(int i, Object obj) {
        this.f8525Ujhhgtgfeyxiexzf = i;
        this.f8526Ujhhgtgfeyxiexzf = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg;
        int i9 = this.f8525Ujhhgtgfeyxiexzf;
        Object obj = this.f8526Ujhhgtgfeyxiexzf;
        switch (i9) {
            case 0:
                throw null;
            case 1:
                ViewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf viewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf = (ViewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf) obj;
                WindowInsets rootWindowInsets = view.getRootView().getRootWindowInsets();
                if (rootWindowInsets == null) {
                    ((C3491Ujhhgtgfeyxiexzf) viewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf.f10831Ujhhgtgfeyxiexzf).getClass();
                    int i10 = DialogXBaseRelativeLayout.f1012Ujhhgtgfeyxiexzf;
                    return;
                } else {
                    ((C3491Ujhhgtgfeyxiexzf) viewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf.f10831Ujhhgtgfeyxiexzf).getClass();
                    int i11 = DialogXBaseRelativeLayout.f1012Ujhhgtgfeyxiexzf;
                    ((C3491Ujhhgtgfeyxiexzf) viewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf.f10831Ujhhgtgfeyxiexzf).m4976Ujhhgtgfeyxiexzf(C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(null, rootWindowInsets), new C3490feyxiexzfUjhhgtg((C3490feyxiexzfUjhhgtg) viewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf.f10830Ujhhgtgfeyxiexzf));
                    return;
                }
            case 2:
                C2661feyxiexzfUjhhgtg c2661feyxiexzfUjhhgtg = (C2661feyxiexzfUjhhgtg) obj;
                ImageView imageView = c2661feyxiexzfUjhhgtg.f2214Ujhhgtgfeyxiexzf;
                if (imageView.getVisibility() != 0 || (c2449feyxiexzfUjhhgtg = c2661feyxiexzfUjhhgtg.f2232feyxiexzfUjhhgtg) == null) {
                    return;
                }
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                c2449feyxiexzfUjhhgtg.setBounds(rect);
                c2449feyxiexzfUjhhgtg.m3689Ujhhgtgfeyxiexzf(imageView, null);
                return;
            default:
                C1759feyxiexzfUjhhgtg c1759feyxiexzfUjhhgtg = (C1759feyxiexzfUjhhgtg) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                c1759feyxiexzfUjhhgtg.f5914feyxiexzfUjhhgtg = iArr[0];
                view.getWindowVisibleDisplayFrame(c1759feyxiexzfUjhhgtg.f5907feyxiexzfUjhhgtg);
                return;
        }
    }
}
