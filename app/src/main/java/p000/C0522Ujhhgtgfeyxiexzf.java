package p000;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴ要点脸能不能ᛳᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0522Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0618Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C0522Ujhhgtgfeyxiexzf f2470Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f2471Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f2472Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f2473Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f2470Ujhhgtgfeyxiexzf = new C0522Ujhhgtgfeyxiexzf(MagicFactory.get(4928401322060809610L, strArr));
        f2471Ujhhgtgfeyxiexzf = MagicFactory.get(4928400475952252298L, strArr);
        f2472Ujhhgtgfeyxiexzf = MagicFactory.get(4928400463067350410L, strArr);
        f2473Ujhhgtgfeyxiexzf = MagicFactory.get(4928400433002579338L, strArr);
    }

    @Override // p000.InterfaceC0618Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1789Ujhhgtgfeyxiexzf(ViewGroup viewGroup) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (mo1424feyxiexzfUjhhgtg()) {
            C0521Ujhhgtgfeyxiexzf.f2469Ujhhgtgfeyxiexzf.getClass();
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            View viewFindViewById = viewGroup.findViewById(C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf() ? C0520Ujhhgtgfeyxiexzf.f2468Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() : AbstractC1245feyxiexzfUjhhgtg.m2752Ujhhgtgfeyxiexzf(C0521Ujhhgtgfeyxiexzf.m1809feyxiexzfUjhhgtg()));
            if (viewFindViewById.getParent() instanceof C1177feyxiexzfUjhhgtg) {
                return;
            }
            ViewParent parent = viewFindViewById.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            int iIndexOfChild = viewGroup2.indexOfChild(viewFindViewById);
            C1177feyxiexzfUjhhgtg c1177feyxiexzfUjhhgtg = new C1177feyxiexzfUjhhgtg(viewFindViewById.getContext());
            c1177feyxiexzfUjhhgtg.setId(R.id.MsgLeftSwipe_SwipeMenu);
            c1177feyxiexzfUjhhgtg.setLayoutParams(layoutParams);
            c1177feyxiexzfUjhhgtg.setClickable(false);
            c1177feyxiexzfUjhhgtg.setFocusable(false);
            viewGroup2.removeView(viewFindViewById);
            c1177feyxiexzfUjhhgtg.addView(viewFindViewById);
            FrameLayout frameLayout = new FrameLayout(c1177feyxiexzfUjhhgtg.getContext());
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams((int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(Integer.valueOf(Opcodes.GETFIELD), frameLayout.getContext()), -1));
            ImageView imageView = new ImageView(frameLayout.getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            layoutParams2.setMargins((int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(Double.valueOf(36.0d), imageView.getContext()), ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
            imageView.setLayoutParams(layoutParams2);
            imageView.setImageResource(R.drawable.ic_menu_quote_24dp);
            imageView.setImageTintList(AbstractC1252feyxiexzfUjhhgtg.m2782Ujhhgtgfeyxiexzf(Color.parseColor(MagicFactory.get(AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(imageView.getContext()) ? 4928401386485319050L : 4928400381462971786L, strArr))));
            frameLayout.addView(imageView);
            c1177feyxiexzfUjhhgtg.addView(frameLayout);
            viewGroup2.addView(c1177feyxiexzfUjhhgtg, iIndexOfChild);
        }
    }

    @Override // p000.InterfaceC0618Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ */
    public final void mo1790Ujhhgtgfeyxiexzf(Object obj, ViewGroup viewGroup, Object obj2, MsgInfoBean msgInfoBean) {
        C1177feyxiexzfUjhhgtg c1177feyxiexzfUjhhgtg;
        if (mo1424feyxiexzfUjhhgtg() && (c1177feyxiexzfUjhhgtg = (C1177feyxiexzfUjhhgtg) viewGroup.findViewById(R.id.MsgLeftSwipe_SwipeMenu)) != null) {
            c1177feyxiexzfUjhhgtg.setSmoothListener(new C0416Ujhhgtgfeyxiexzf(c1177feyxiexzfUjhhgtg, obj, msgInfoBean, obj2));
        }
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f2473Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f2472Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f2471Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
