package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2462feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7991Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ View f7992Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Ujhhgtgfeyxiexzf f7993Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC2462feyxiexzfUjhhgtg(View view, Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf, int i) {
        this.f7991Ujhhgtgfeyxiexzf = i;
        this.f7992Ujhhgtgfeyxiexzf = view;
        this.f7993Ujhhgtgfeyxiexzf = ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7991Ujhhgtgfeyxiexzf) {
            case 0:
                View view = this.f7992Ujhhgtgfeyxiexzf;
                ViewParent parent = view.getParent();
                Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = this.f7993Ujhhgtgfeyxiexzf;
                if (parent == ujhhgtgfeyxiexzf.m901Ujhhgtgfeyxiexzf()) {
                    Ujhhgtgfeyxiexzf.m879Ujhhgtgfeyxiexzf(((Ujhhgtgfeyxiexzf) view.getTag()).mo896Ujhhgtgfeyxiexzf() + "已处于显示状态，请勿重复执行 show() 指令。");
                } else {
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    ujhhgtgfeyxiexzf.m901Ujhhgtgfeyxiexzf().addView(view);
                }
                break;
            default:
                View view2 = this.f7992Ujhhgtgfeyxiexzf;
                if (view2.getParent() == null || !(view2.getParent() instanceof ViewGroup)) {
                    Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf2 = this.f7993Ujhhgtgfeyxiexzf;
                    if (ujhhgtgfeyxiexzf2.m901Ujhhgtgfeyxiexzf() != null) {
                        ujhhgtgfeyxiexzf2.m901Ujhhgtgfeyxiexzf().removeView(view2);
                    }
                } else {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                if (Ujhhgtgfeyxiexzf.f985Ujhhgtgfeyxiexzf != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(Ujhhgtgfeyxiexzf.f985Ujhhgtgfeyxiexzf);
                    for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf3 = (Ujhhgtgfeyxiexzf) copyOnWriteArrayList.get(size);
                        if (ujhhgtgfeyxiexzf3.m899Ujhhgtgfeyxiexzf() == Ujhhgtgfeyxiexzf.m885Ujhhgtgfeyxiexzf() && ujhhgtgfeyxiexzf3.f996Ujhhgtgfeyxiexzf && ujhhgtgfeyxiexzf3.m898Ujhhgtgfeyxiexzf() != null) {
                            View viewFindViewById = ujhhgtgfeyxiexzf3.m898Ujhhgtgfeyxiexzf().findViewById(R.id.box_root);
                            if ((viewFindViewById instanceof DialogXBaseRelativeLayout) && ((DialogXBaseRelativeLayout) viewFindViewById).f1015Ujhhgtgfeyxiexzf) {
                                viewFindViewById.requestFocus();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
