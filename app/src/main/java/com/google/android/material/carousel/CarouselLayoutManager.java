package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import me.hd.wauxv.R;
import p000.AbstractC0699Ujhhgtgfeyxiexzf;
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC0822feyxiexzfUjhhgtg;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.C0512Ujhhgtgfeyxiexzf;
import p000.C0810feyxiexzfUjhhgtg;
import p000.C0825feyxiexzfUjhhgtg;
import p000.C0831feyxiexzfUjhhgtg;
import p000.C2780feyxiexzfUjhhgtg;
import p000.C2781feyxiexzfUjhhgtg;
import p000.C2782feyxiexzfUjhhgtg;
import p000.InterfaceC0814feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0822feyxiexzfUjhhgtg implements InterfaceC0814feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C0512Ujhhgtgfeyxiexzf f728Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public AbstractC0699Ujhhgtgfeyxiexzf f729Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final View.OnLayoutChangeListener f730Ujhhgtgfeyxiexzf;

    public CarouselLayoutManager() {
        C0512Ujhhgtgfeyxiexzf c0512Ujhhgtgfeyxiexzf = new C0512Ujhhgtgfeyxiexzf();
        new C2781feyxiexzfUjhhgtg();
        this.f730Ujhhgtgfeyxiexzf = new View.OnLayoutChangeListener() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC2779feyxiexzfUjhhgtg(0, this.f8785Ujhhgtgfeyxiexzf));
            }
        };
        this.f728Ujhhgtgfeyxiexzf = c0512Ujhhgtgfeyxiexzf;
        m2216feyxiexzfUjhhgtg();
        m813Ujhhgtgfeyxiexzf(0);
    }

    @Override // p000.InterfaceC0814feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final PointF mo150Ujhhgtgfeyxiexzf(int i) {
        return null;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final boolean mo152Ujhhgtgfeyxiexzf() {
        return m811feyxiexzfUjhhgtg();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final boolean mo153Ujhhgtgfeyxiexzf() {
        return !m811feyxiexzfUjhhgtg();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final int mo156Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        m2203Ujhhgtgfeyxiexzf();
        return 0;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final int mo119Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return 0;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo120Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return 0;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final int mo157Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        m2203Ujhhgtgfeyxiexzf();
        return 0;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final int mo121Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return 0;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final int mo122Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return 0;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final C0825feyxiexzfUjhhgtg mo123Ujhhgtgfeyxiexzf() {
        return new C0825feyxiexzfUjhhgtg(-2, -2);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo809feyxiexzfUjhhgtg(Rect rect, View view) {
        super.mo809feyxiexzfUjhhgtg(rect, view);
        rect.centerY();
        if (m811feyxiexzfUjhhgtg()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ */
    public final boolean mo159feyxiexzfUjhhgtg() {
        return true;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ */
    public final void mo758feyxiexzfUjhhgtg(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        C0512Ujhhgtgfeyxiexzf c0512Ujhhgtgfeyxiexzf = this.f728Ujhhgtgfeyxiexzf;
        float dimension = c0512Ujhhgtgfeyxiexzf.f2447Ujhhgtgfeyxiexzf;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0512Ujhhgtgfeyxiexzf.f2447Ujhhgtgfeyxiexzf = dimension;
        float dimension2 = c0512Ujhhgtgfeyxiexzf.f2448Ujhhgtgfeyxiexzf;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0512Ujhhgtgfeyxiexzf.f2448Ujhhgtgfeyxiexzf = dimension2;
        m2216feyxiexzfUjhhgtg();
        recyclerView.addOnLayoutChangeListener(this.f730Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ */
    public final void mo161Ujhhgtgfeyxiexzf(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f730Ujhhgtgfeyxiexzf);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ */
    public final View mo128Ujhhgtgfeyxiexzf(View view, int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        byte b;
        if (m2203Ujhhgtgfeyxiexzf() == 0) {
            return null;
        }
        int i2 = this.f729Ujhhgtgfeyxiexzf.f2872Ujhhgtgfeyxiexzf;
        if (i == 1) {
            b = -1;
        } else if (i == 2) {
            b = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                    } else if (i2 == 1) {
                        b = 1;
                    }
                    b = -2147483648;
                } else if (i2 != 0) {
                    b = -2147483648;
                } else if (m812feyxiexzfUjhhgtg()) {
                    b = -1;
                } else {
                    b = 1;
                }
            } else if (i2 == 1) {
                b = -1;
            } else {
                b = -2147483648;
            }
        } else if (i2 != 0) {
            b = -2147483648;
        } else if (m812feyxiexzfUjhhgtg()) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == -2147483648) {
            return null;
        }
        if (b == -1) {
            if (AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(view) == 0) {
                return null;
            }
            int iM2196feyxiexzfUjhhgtg = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(0)) - 1;
            if (iM2196feyxiexzfUjhhgtg < 0 || iM2196feyxiexzfUjhhgtg >= m2204feyxiexzfUjhhgtg()) {
                return m2202Ujhhgtgfeyxiexzf(m812feyxiexzfUjhhgtg() ? m2203Ujhhgtgfeyxiexzf() - 1 : 0);
            }
            this.f729Ujhhgtgfeyxiexzf.mo1991Ujhhgtgfeyxiexzf();
            throw null;
        }
        if (AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(view) == m2204feyxiexzfUjhhgtg() - 1) {
            return null;
        }
        int iM2196feyxiexzfUjhhgtg2 = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(m2203Ujhhgtgfeyxiexzf() - 1)) + 1;
        if (iM2196feyxiexzfUjhhgtg2 < 0 || iM2196feyxiexzfUjhhgtg2 >= m2204feyxiexzfUjhhgtg()) {
            return m2202Ujhhgtgfeyxiexzf(m812feyxiexzfUjhhgtg() ? 0 : m2203Ujhhgtgfeyxiexzf() - 1);
        }
        this.f729Ujhhgtgfeyxiexzf.mo1991Ujhhgtgfeyxiexzf();
        throw null;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ */
    public final void mo162Ujhhgtgfeyxiexzf(AccessibilityEvent accessibilityEvent) {
        super.mo162Ujhhgtgfeyxiexzf(accessibilityEvent);
        if (m2203Ujhhgtgfeyxiexzf() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(0)));
            accessibilityEvent.setToIndex(AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(m2203Ujhhgtgfeyxiexzf() - 1)));
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ */
    public final void mo131feyxiexzfUjhhgtg(int i, int i2) {
        m2204feyxiexzfUjhhgtg();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ */
    public final void mo134feyxiexzfUjhhgtg(int i, int i2) {
        m2204feyxiexzfUjhhgtg();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ */
    public final void mo136feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() > 0) {
            if ((m811feyxiexzfUjhhgtg() ? this.f3273Ujhhgtgfeyxiexzf : this.f3274Ujhhgtgfeyxiexzf) > 0.0f) {
                m812feyxiexzfUjhhgtg();
                View view = c0831feyxiexzfUjhhgtg.m2239Ujhhgtgfeyxiexzf(0, Long.MAX_VALUE).f3241Ujhhgtgfeyxiexzf;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m2211feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ */
    public final void mo137Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (m2203Ujhhgtgfeyxiexzf() == 0) {
            return;
        }
        AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(0));
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean mo810Ujhhgtgfeyxiexzf(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ */
    public final int mo139Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (!m811feyxiexzfUjhhgtg() || m2203Ujhhgtgfeyxiexzf() == 0 || i == 0) {
            return 0;
        }
        View view = c0831feyxiexzfUjhhgtg.m2239Ujhhgtgfeyxiexzf(0, Long.MAX_VALUE).f3241Ujhhgtgfeyxiexzf;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ */
    public final int mo140Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (!mo153Ujhhgtgfeyxiexzf() || m2203Ujhhgtgfeyxiexzf() == 0 || i == 0) {
            return 0;
        }
        View view = c0831feyxiexzfUjhhgtg.m2239Ujhhgtgfeyxiexzf(0, Long.MAX_VALUE).f3241Ujhhgtgfeyxiexzf;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ */
    public final void mo167feyxiexzfUjhhgtg(RecyclerView recyclerView, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, int i) {
        C2780feyxiexzfUjhhgtg c2780feyxiexzfUjhhgtg = new C2780feyxiexzfUjhhgtg(recyclerView.getContext());
        c2780feyxiexzfUjhhgtg.f1088Ujhhgtgfeyxiexzf = i;
        m2223Ujhhgtgfeyxiexzf(c2780feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final boolean m811feyxiexzfUjhhgtg() {
        return this.f729Ujhhgtgfeyxiexzf.f2872Ujhhgtgfeyxiexzf == 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final boolean m812feyxiexzfUjhhgtg() {
        return m811feyxiexzfUjhhgtg() && this.f3261Ujhhgtgfeyxiexzf.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m813Ujhhgtgfeyxiexzf(int i) {
        C2782feyxiexzfUjhhgtg c2782feyxiexzfUjhhgtg;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "invalid orientation:"));
        }
        mo151Ujhhgtgfeyxiexzf(null);
        AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf = this.f729Ujhhgtgfeyxiexzf;
        if (abstractC0699Ujhhgtgfeyxiexzf == null || i != abstractC0699Ujhhgtgfeyxiexzf.f2872Ujhhgtgfeyxiexzf) {
            if (i == 0) {
                c2782feyxiexzfUjhhgtg = new C2782feyxiexzfUjhhgtg(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c2782feyxiexzfUjhhgtg = new C2782feyxiexzfUjhhgtg(this, 0);
            }
            this.f729Ujhhgtgfeyxiexzf = c2782feyxiexzfUjhhgtg;
            m2216feyxiexzfUjhhgtg();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C2781feyxiexzfUjhhgtg();
        this.f730Ujhhgtgfeyxiexzf = new View.OnLayoutChangeListener() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i3 == i7 && i4 == i8 && i5 == i9 && i6 == i10) {
                    return;
                }
                view.post(new RunnableC2779feyxiexzfUjhhgtg(0, this.f8785Ujhhgtgfeyxiexzf));
            }
        };
        this.f728Ujhhgtgfeyxiexzf = new C0512Ujhhgtgfeyxiexzf();
        m2216feyxiexzfUjhhgtg();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3120Ujhhgtgfeyxiexzf);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m2216feyxiexzfUjhhgtg();
            m813Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲ */
    public final void mo165Ujhhgtgfeyxiexzf(int i) {
    }
}
