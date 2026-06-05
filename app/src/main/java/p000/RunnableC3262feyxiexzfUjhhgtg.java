package p000;

import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱ能不能ᛲᛳᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3262feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10241Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f10242Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f10243Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f10244Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC3262feyxiexzfUjhhgtg(Object obj, int i, Object obj2, int i2) {
        this.f10241Ujhhgtgfeyxiexzf = i2;
        this.f10243Ujhhgtgfeyxiexzf = obj;
        this.f10242Ujhhgtgfeyxiexzf = i;
        this.f10244Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10241Ujhhgtgfeyxiexzf) {
            case 0:
                C3263feyxiexzfUjhhgtg c3263feyxiexzfUjhhgtg = (C3263feyxiexzfUjhhgtg) this.f10243Ujhhgtgfeyxiexzf;
                c3263feyxiexzfUjhhgtg.f10246Ujhhgtgfeyxiexzf.mo1738Ujhhgtgfeyxiexzf(this.f10242Ujhhgtgfeyxiexzf, this.f10244Ujhhgtgfeyxiexzf);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f10243Ujhhgtgfeyxiexzf;
                C1019feyxiexzfUjhhgtg c1019feyxiexzfUjhhgtg = (C1019feyxiexzfUjhhgtg) this.f10244Ujhhgtgfeyxiexzf;
                int i = this.f10242Ujhhgtgfeyxiexzf;
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg = recyclerView.m228feyxiexzfUjhhgtg(i);
                if (abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg != null && abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg.m2172Ujhhgtgfeyxiexzf() == i) {
                    View view = abstractC0821feyxiexzfUjhhgtgM228feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
                    if (view.isAttachedToWindow() && view.getWidth() > 0 && view.getHeight() > 0) {
                        ColorDrawable colorDrawable = new ColorDrawable(c1019feyxiexzfUjhhgtg.f3986Ujhhgtgfeyxiexzf.getColor(R.color.md_theme_primaryContainer));
                        colorDrawable.setBounds(0, 0, view.getWidth(), view.getHeight());
                        view.getOverlay().add(colorDrawable);
                        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(colorDrawable, MagicFactory.get(4928454871713056138L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf), 0, Opcodes.FCMPG, 0, Opcodes.FCMPG, 0);
                        objectAnimatorOfInt.addListener(new C1113feyxiexzfUjhhgtg(view, colorDrawable));
                        objectAnimatorOfInt.setDuration(900L);
                        objectAnimatorOfInt.start();
                        break;
                    }
                }
                break;
        }
    }
}
