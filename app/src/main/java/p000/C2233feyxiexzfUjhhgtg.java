package p000;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2233feyxiexzfUjhhgtg extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final AbstractC2684Ujhhgtgfeyxiexzf f7269Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public List f7270Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public ArrayList f7271Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final HashMap f7272Ujhhgtgfeyxiexzf;

    public C2233feyxiexzfUjhhgtg(AbstractC2684Ujhhgtgfeyxiexzf abstractC2684Ujhhgtgfeyxiexzf) {
        super(abstractC2684Ujhhgtgfeyxiexzf.f8572Ujhhgtgfeyxiexzf);
        this.f7272Ujhhgtgfeyxiexzf = new HashMap();
        this.f7269Ujhhgtgfeyxiexzf = abstractC2684Ujhhgtgfeyxiexzf;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        m3401Ujhhgtgfeyxiexzf(windowInsetsAnimation);
        this.f7269Ujhhgtgfeyxiexzf.mo1959feyxiexzfUjhhgtg();
        this.f7272Ujhhgtgfeyxiexzf.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        m3401Ujhhgtgfeyxiexzf(windowInsetsAnimation);
        this.f7269Ujhhgtgfeyxiexzf.mo1960feyxiexzfUjhhgtg();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f7271Ujhhgtgfeyxiexzf;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f7271Ujhhgtgfeyxiexzf = arrayList2;
            this.f7270Ujhhgtgfeyxiexzf = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM4385Ujhhgtgfeyxiexzf = AbstractC2955feyxiexzfUjhhgtg.m4385Ujhhgtgfeyxiexzf(list.get(size));
            C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtgM3401Ujhhgtgfeyxiexzf = m3401Ujhhgtgfeyxiexzf(windowInsetsAnimationM4385Ujhhgtgfeyxiexzf);
            c2234feyxiexzfUjhhgtgM3401Ujhhgtgfeyxiexzf.f7273Ujhhgtgfeyxiexzf.mo3400Ujhhgtgfeyxiexzf(windowInsetsAnimationM4385Ujhhgtgfeyxiexzf.getFraction());
            this.f7271Ujhhgtgfeyxiexzf.add(c2234feyxiexzfUjhhgtgM3401Ujhhgtgfeyxiexzf);
        }
        return this.f7269Ujhhgtgfeyxiexzf.mo1961feyxiexzfUjhhgtg(C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(null, windowInsets), this.f7270Ujhhgtgfeyxiexzf).m3453Ujhhgtgfeyxiexzf();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        m3401Ujhhgtgfeyxiexzf(windowInsetsAnimation);
        C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtgMo1962feyxiexzfUjhhgtg = this.f7269Ujhhgtgfeyxiexzf.mo1962feyxiexzfUjhhgtg(new C2073feyxiexzfUjhhgtg(bounds));
        c2073feyxiexzfUjhhgtgMo1962feyxiexzfUjhhgtg.getClass();
        AbstractC2955feyxiexzfUjhhgtg.m4388Ujhhgtgfeyxiexzf();
        return AbstractC2955feyxiexzfUjhhgtg.m4383Ujhhgtgfeyxiexzf(((C0688Ujhhgtgfeyxiexzf) c2073feyxiexzfUjhhgtgMo1962feyxiexzfUjhhgtg.f6810Ujhhgtgfeyxiexzf).m1958Ujhhgtgfeyxiexzf(), ((C0688Ujhhgtgfeyxiexzf) c2073feyxiexzfUjhhgtgMo1962feyxiexzfUjhhgtg.f6811Ujhhgtgfeyxiexzf).m1958Ujhhgtgfeyxiexzf());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2234feyxiexzfUjhhgtg m3401Ujhhgtgfeyxiexzf(WindowInsetsAnimation windowInsetsAnimation) {
        C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtg = (C2234feyxiexzfUjhhgtg) this.f7272Ujhhgtgfeyxiexzf.get(windowInsetsAnimation);
        if (c2234feyxiexzfUjhhgtg != null) {
            return c2234feyxiexzfUjhhgtg;
        }
        C2234feyxiexzfUjhhgtg c2234feyxiexzfUjhhgtg2 = new C2234feyxiexzfUjhhgtg(0, null, 0L);
        c2234feyxiexzfUjhhgtg2.f7273Ujhhgtgfeyxiexzf = new C2232feyxiexzfUjhhgtg(windowInsetsAnimation);
        this.f7272Ujhhgtgfeyxiexzf.put(windowInsetsAnimation, c2234feyxiexzfUjhhgtg2);
        return c2234feyxiexzfUjhhgtg2;
    }
}
