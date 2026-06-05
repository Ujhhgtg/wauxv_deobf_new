package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2299feyxiexzfUjhhgtg extends AbstractC3723feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public C3647Ujhhgtgfeyxiexzf f7533Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC3723feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public boolean mo762Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo775Ujhhgtgfeyxiexzf(coordinatorLayout, view, i);
        if (this.f7533Ujhhgtgfeyxiexzf == null) {
            this.f7533Ujhhgtgfeyxiexzf = new C3647Ujhhgtgfeyxiexzf(view);
        }
        C3647Ujhhgtgfeyxiexzf c3647Ujhhgtgfeyxiexzf = this.f7533Ujhhgtgfeyxiexzf;
        View view2 = (View) c3647Ujhhgtgfeyxiexzf.f11469Ujhhgtgfeyxiexzf;
        c3647Ujhhgtgfeyxiexzf.f11467Ujhhgtgfeyxiexzf = view2.getTop();
        c3647Ujhhgtgfeyxiexzf.f11468Ujhhgtgfeyxiexzf = view2.getLeft();
        C3647Ujhhgtgfeyxiexzf c3647Ujhhgtgfeyxiexzf2 = this.f7533Ujhhgtgfeyxiexzf;
        View view3 = (View) c3647Ujhhgtgfeyxiexzf2.f11469Ujhhgtgfeyxiexzf;
        int top = 0 - (view3.getTop() - c3647Ujhhgtgfeyxiexzf2.f11467Ujhhgtgfeyxiexzf);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c3647Ujhhgtgfeyxiexzf2.f11468Ujhhgtgfeyxiexzf));
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public void mo775Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m71Ujhhgtgfeyxiexzf(view, i);
    }
}
