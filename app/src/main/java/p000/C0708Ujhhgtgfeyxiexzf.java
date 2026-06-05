package p000;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛳᛴ能不能ᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0708Ujhhgtgfeyxiexzf extends AbstractC0826feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public float f2919Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public float f2920Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public float f2921Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public float f2922Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public float f2923Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public float f2924Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f2925Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public float f2926Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final AbstractC0699Ujhhgtgfeyxiexzf f2928Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f2930Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public int f2932Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public RecyclerView f2933Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public VelocityTracker f2935Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public ArrayList f2936Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ArrayList f2937Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public GestureDetector f2939Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public C0707Ujhhgtgfeyxiexzf f2940feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public Rect f2942feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public long f2943feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final ArrayList f2916Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final float[] f2917Ujhhgtgfeyxiexzf = new float[2];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public AbstractC0821feyxiexzfUjhhgtg f2918Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f2927Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f2929Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList f2931Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final RunnableC3012feyxiexzfUjhhgtg f2934Ujhhgtgfeyxiexzf = new RunnableC3012feyxiexzfUjhhgtg(10, this);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public View f2938Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0698Ujhhgtgfeyxiexzf f2941feyxiexzfUjhhgtg = new C0698Ujhhgtgfeyxiexzf(this);

    public C0708Ujhhgtgfeyxiexzf(AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf) {
        this.f2928Ujhhgtgfeyxiexzf = abstractC0699Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static boolean m1997Ujhhgtgfeyxiexzf(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // p000.AbstractC0826feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void mo1998Ujhhgtgfeyxiexzf(Rect rect, View view) {
        rect.setEmpty();
    }

    @Override // p000.AbstractC0826feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void mo1999Ujhhgtgfeyxiexzf(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.f2918Ujhhgtgfeyxiexzf != null) {
            float[] fArr = this.f2917Ujhhgtgfeyxiexzf;
            m2007Ujhhgtgfeyxiexzf(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = this.f2918Ujhhgtgfeyxiexzf;
        this.f2928Ujhhgtgfeyxiexzf.getClass();
        ArrayList arrayList = this.f2931Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0697Ujhhgtgfeyxiexzf c0697Ujhhgtgfeyxiexzf = (C0697Ujhhgtgfeyxiexzf) arrayList.get(i);
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg2 = c0697Ujhhgtgfeyxiexzf.f2857Ujhhgtgfeyxiexzf;
            float f3 = c0697Ujhhgtgfeyxiexzf.f2853Ujhhgtgfeyxiexzf;
            float f4 = c0697Ujhhgtgfeyxiexzf.f2855Ujhhgtgfeyxiexzf;
            if (f3 == f4) {
                c0697Ujhhgtgfeyxiexzf.f2861Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg2.f3241Ujhhgtgfeyxiexzf.getTranslationX();
            } else {
                c0697Ujhhgtgfeyxiexzf.f2861Ujhhgtgfeyxiexzf = ((f4 - f3) * c0697Ujhhgtgfeyxiexzf.f2865Ujhhgtgfeyxiexzf) + f3;
            }
            float f5 = c0697Ujhhgtgfeyxiexzf.f2854Ujhhgtgfeyxiexzf;
            float f6 = c0697Ujhhgtgfeyxiexzf.f2856Ujhhgtgfeyxiexzf;
            if (f5 == f6) {
                c0697Ujhhgtgfeyxiexzf.f2862Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg2.f3241Ujhhgtgfeyxiexzf.getTranslationY();
            } else {
                c0697Ujhhgtgfeyxiexzf.f2862Ujhhgtgfeyxiexzf = ((f6 - f5) * c0697Ujhhgtgfeyxiexzf.f2865Ujhhgtgfeyxiexzf) + f5;
            }
            int iSave = canvas.save();
            AbstractC0699Ujhhgtgfeyxiexzf.m1983Ujhhgtgfeyxiexzf(recyclerView, c0697Ujhhgtgfeyxiexzf.f2857Ujhhgtgfeyxiexzf, c0697Ujhhgtgfeyxiexzf.f2861Ujhhgtgfeyxiexzf, c0697Ujhhgtgfeyxiexzf.f2862Ujhhgtgfeyxiexzf, false);
            canvas.restoreToCount(iSave);
        }
        if (abstractC0821feyxiexzfUjhhgtg != null) {
            int iSave2 = canvas.save();
            AbstractC0699Ujhhgtgfeyxiexzf.m1983Ujhhgtgfeyxiexzf(recyclerView, abstractC0821feyxiexzfUjhhgtg, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // p000.AbstractC0826feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void mo2000Ujhhgtgfeyxiexzf(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.f2918Ujhhgtgfeyxiexzf != null) {
            float[] fArr = this.f2917Ujhhgtgfeyxiexzf;
            m2007Ujhhgtgfeyxiexzf(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = this.f2918Ujhhgtgfeyxiexzf;
        this.f2928Ujhhgtgfeyxiexzf.getClass();
        ArrayList arrayList = this.f2931Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0697Ujhhgtgfeyxiexzf c0697Ujhhgtgfeyxiexzf = (C0697Ujhhgtgfeyxiexzf) arrayList.get(i);
            int iSave = canvas.save();
            View view = c0697Ujhhgtgfeyxiexzf.f2857Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf;
            canvas.restoreToCount(iSave);
        }
        if (abstractC0821feyxiexzfUjhhgtg != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C0697Ujhhgtgfeyxiexzf c0697Ujhhgtgfeyxiexzf2 = (C0697Ujhhgtgfeyxiexzf) arrayList.get(i2);
            boolean z2 = c0697Ujhhgtgfeyxiexzf2.f2864Ujhhgtgfeyxiexzf;
            if (z2 && !c0697Ujhhgtgfeyxiexzf2.f2860Ujhhgtgfeyxiexzf) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m2001Ujhhgtgfeyxiexzf(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2933Ujhhgtgfeyxiexzf;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C0698Ujhhgtgfeyxiexzf c0698Ujhhgtgfeyxiexzf = this.f2941feyxiexzfUjhhgtg;
        if (recyclerView2 != null) {
            recyclerView2.m249feyxiexzfUjhhgtg(this);
            RecyclerView recyclerView3 = this.f2933Ujhhgtgfeyxiexzf;
            recyclerView3.f373Ujhhgtgfeyxiexzf.remove(c0698Ujhhgtgfeyxiexzf);
            if (recyclerView3.f374Ujhhgtgfeyxiexzf == c0698Ujhhgtgfeyxiexzf) {
                recyclerView3.f374Ujhhgtgfeyxiexzf = null;
            }
            ArrayList arrayList = this.f2933Ujhhgtgfeyxiexzf.f385feyxiexzfUjhhgtg;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.f2931Ujhhgtgfeyxiexzf;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C0697Ujhhgtgfeyxiexzf c0697Ujhhgtgfeyxiexzf = (C0697Ujhhgtgfeyxiexzf) arrayList2.get(0);
                c0697Ujhhgtgfeyxiexzf.f2859Ujhhgtgfeyxiexzf.cancel();
                this.f2928Ujhhgtgfeyxiexzf.mo1986Ujhhgtgfeyxiexzf(this.f2933Ujhhgtgfeyxiexzf, c0697Ujhhgtgfeyxiexzf.f2857Ujhhgtgfeyxiexzf);
            }
            arrayList2.clear();
            this.f2938Ujhhgtgfeyxiexzf = null;
            VelocityTracker velocityTracker = this.f2935Ujhhgtgfeyxiexzf;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2935Ujhhgtgfeyxiexzf = null;
            }
            C0707Ujhhgtgfeyxiexzf c0707Ujhhgtgfeyxiexzf = this.f2940feyxiexzfUjhhgtg;
            if (c0707Ujhhgtgfeyxiexzf != null) {
                c0707Ujhhgtgfeyxiexzf.f2914Ujhhgtgfeyxiexzf = false;
                this.f2940feyxiexzfUjhhgtg = null;
            }
            if (this.f2939Ujhhgtgfeyxiexzf != null) {
                this.f2939Ujhhgtgfeyxiexzf = null;
            }
        }
        this.f2933Ujhhgtgfeyxiexzf = recyclerView;
        Resources resources = recyclerView.getResources();
        this.f2921Ujhhgtgfeyxiexzf = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
        this.f2922Ujhhgtgfeyxiexzf = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
        this.f2932Ujhhgtgfeyxiexzf = ViewConfiguration.get(this.f2933Ujhhgtgfeyxiexzf.getContext()).getScaledTouchSlop();
        this.f2933Ujhhgtgfeyxiexzf.m206Ujhhgtgfeyxiexzf(this);
        this.f2933Ujhhgtgfeyxiexzf.f373Ujhhgtgfeyxiexzf.add(c0698Ujhhgtgfeyxiexzf);
        RecyclerView recyclerView4 = this.f2933Ujhhgtgfeyxiexzf;
        if (recyclerView4.f385feyxiexzfUjhhgtg == null) {
            recyclerView4.f385feyxiexzfUjhhgtg = new ArrayList();
        }
        recyclerView4.f385feyxiexzfUjhhgtg.add(this);
        this.f2940feyxiexzfUjhhgtg = new C0707Ujhhgtgfeyxiexzf(this);
        this.f2939Ujhhgtgfeyxiexzf = new GestureDetector(this.f2933Ujhhgtgfeyxiexzf.getContext(), this.f2940feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int m2002Ujhhgtgfeyxiexzf(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f2923Ujhhgtgfeyxiexzf > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f2935Ujhhgtgfeyxiexzf;
        AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf = this.f2928Ujhhgtgfeyxiexzf;
        if (velocityTracker != null && this.f2927Ujhhgtgfeyxiexzf > -1) {
            float f = this.f2922Ujhhgtgfeyxiexzf;
            abstractC0699Ujhhgtgfeyxiexzf.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f2935Ujhhgtgfeyxiexzf.getXVelocity(this.f2927Ujhhgtgfeyxiexzf);
            float yVelocity = this.f2935Ujhhgtgfeyxiexzf.getYVelocity(this.f2927Ujhhgtgfeyxiexzf);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f2921Ujhhgtgfeyxiexzf && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f2933Ujhhgtgfeyxiexzf.getWidth();
        abstractC0699Ujhhgtgfeyxiexzf.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f2923Ujhhgtgfeyxiexzf) <= f2) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m2003Ujhhgtgfeyxiexzf(int i, int i2, MotionEvent motionEvent) {
        View viewM2006Ujhhgtgfeyxiexzf;
        if (this.f2918Ujhhgtgfeyxiexzf == null && i == 2 && this.f2929Ujhhgtgfeyxiexzf != 2) {
            AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf = this.f2928Ujhhgtgfeyxiexzf;
            abstractC0699Ujhhgtgfeyxiexzf.getClass();
            if (this.f2933Ujhhgtgfeyxiexzf.getScrollState() == 1) {
                return;
            }
            AbstractC0822feyxiexzfUjhhgtg layoutManager = this.f2933Ujhhgtgfeyxiexzf.getLayoutManager();
            int i3 = this.f2927Ujhhgtgfeyxiexzf;
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg = null;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(iFindPointerIndex) - this.f2919Ujhhgtgfeyxiexzf;
                float y = motionEvent.getY(iFindPointerIndex) - this.f2920Ujhhgtgfeyxiexzf;
                float fAbs = Math.abs(x);
                float fAbs2 = Math.abs(y);
                float f = this.f2932Ujhhgtgfeyxiexzf;
                if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.mo152Ujhhgtgfeyxiexzf()) && ((fAbs2 <= fAbs || !layoutManager.mo153Ujhhgtgfeyxiexzf()) && (viewM2006Ujhhgtgfeyxiexzf = m2006Ujhhgtgfeyxiexzf(motionEvent)) != null))) {
                    abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg = this.f2933Ujhhgtgfeyxiexzf.m232feyxiexzfUjhhgtg(viewM2006Ujhhgtgfeyxiexzf);
                }
            }
            if (abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg == null) {
                return;
            }
            int iM1980Ujhhgtgfeyxiexzf = (AbstractC0699Ujhhgtgfeyxiexzf.m1980Ujhhgtgfeyxiexzf(abstractC0699Ujhhgtgfeyxiexzf.mo1987Ujhhgtgfeyxiexzf(), this.f2933Ujhhgtgfeyxiexzf.getLayoutDirection()) & 65280) >> 8;
            if (iM1980Ujhhgtgfeyxiexzf == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.f2919Ujhhgtgfeyxiexzf;
            float f3 = y2 - this.f2920Ujhhgtgfeyxiexzf;
            float fAbs3 = Math.abs(f2);
            float fAbs4 = Math.abs(f3);
            float f4 = this.f2932Ujhhgtgfeyxiexzf;
            if (fAbs3 >= f4 || fAbs4 >= f4) {
                if (fAbs3 > fAbs4) {
                    if (f2 < 0.0f && (iM1980Ujhhgtgfeyxiexzf & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (iM1980Ujhhgtgfeyxiexzf & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (iM1980Ujhhgtgfeyxiexzf & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (iM1980Ujhhgtgfeyxiexzf & 2) == 0) {
                        return;
                    }
                }
                this.f2924Ujhhgtgfeyxiexzf = 0.0f;
                this.f2923Ujhhgtgfeyxiexzf = 0.0f;
                this.f2927Ujhhgtgfeyxiexzf = motionEvent.getPointerId(0);
                m2010Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg, 1);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m2004Ujhhgtgfeyxiexzf(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f2924Ujhhgtgfeyxiexzf > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f2935Ujhhgtgfeyxiexzf;
        AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf = this.f2928Ujhhgtgfeyxiexzf;
        if (velocityTracker != null && this.f2927Ujhhgtgfeyxiexzf > -1) {
            float f = this.f2922Ujhhgtgfeyxiexzf;
            abstractC0699Ujhhgtgfeyxiexzf.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f2935Ujhhgtgfeyxiexzf.getXVelocity(this.f2927Ujhhgtgfeyxiexzf);
            float yVelocity = this.f2935Ujhhgtgfeyxiexzf.getYVelocity(this.f2927Ujhhgtgfeyxiexzf);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f2921Ujhhgtgfeyxiexzf && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f2933Ujhhgtgfeyxiexzf.getHeight();
        abstractC0699Ujhhgtgfeyxiexzf.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f2924Ujhhgtgfeyxiexzf) <= f2) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m2005Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, boolean z) {
        ArrayList arrayList = this.f2931Ujhhgtgfeyxiexzf;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0697Ujhhgtgfeyxiexzf c0697Ujhhgtgfeyxiexzf = (C0697Ujhhgtgfeyxiexzf) arrayList.get(size);
            if (c0697Ujhhgtgfeyxiexzf.f2857Ujhhgtgfeyxiexzf == abstractC0821feyxiexzfUjhhgtg) {
                c0697Ujhhgtgfeyxiexzf.f2863Ujhhgtgfeyxiexzf |= z;
                if (!c0697Ujhhgtgfeyxiexzf.f2864Ujhhgtgfeyxiexzf) {
                    c0697Ujhhgtgfeyxiexzf.f2859Ujhhgtgfeyxiexzf.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final View m2006Ujhhgtgfeyxiexzf(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = this.f2918Ujhhgtgfeyxiexzf;
        if (abstractC0821feyxiexzfUjhhgtg != null) {
            View view = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
            if (m1997Ujhhgtgfeyxiexzf(view, x, y, this.f2925Ujhhgtgfeyxiexzf + this.f2923Ujhhgtgfeyxiexzf, this.f2926Ujhhgtgfeyxiexzf + this.f2924Ujhhgtgfeyxiexzf)) {
                return view;
            }
        }
        ArrayList arrayList = this.f2931Ujhhgtgfeyxiexzf;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0697Ujhhgtgfeyxiexzf c0697Ujhhgtgfeyxiexzf = (C0697Ujhhgtgfeyxiexzf) arrayList.get(size);
            View view2 = c0697Ujhhgtgfeyxiexzf.f2857Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf;
            if (m1997Ujhhgtgfeyxiexzf(view2, x, y, c0697Ujhhgtgfeyxiexzf.f2861Ujhhgtgfeyxiexzf, c0697Ujhhgtgfeyxiexzf.f2862Ujhhgtgfeyxiexzf)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.f2933Ujhhgtgfeyxiexzf;
        for (int iM4084Ujhhgtgfeyxiexzf = recyclerView.f362Ujhhgtgfeyxiexzf.m4084Ujhhgtgfeyxiexzf() - 1; iM4084Ujhhgtgfeyxiexzf >= 0; iM4084Ujhhgtgfeyxiexzf--) {
            View viewM4083Ujhhgtgfeyxiexzf = recyclerView.f362Ujhhgtgfeyxiexzf.m4083Ujhhgtgfeyxiexzf(iM4084Ujhhgtgfeyxiexzf);
            float translationX = viewM4083Ujhhgtgfeyxiexzf.getTranslationX();
            float translationY = viewM4083Ujhhgtgfeyxiexzf.getTranslationY();
            if (x >= viewM4083Ujhhgtgfeyxiexzf.getLeft() + translationX && x <= viewM4083Ujhhgtgfeyxiexzf.getRight() + translationX && y >= viewM4083Ujhhgtgfeyxiexzf.getTop() + translationY && y <= viewM4083Ujhhgtgfeyxiexzf.getBottom() + translationY) {
                return viewM4083Ujhhgtgfeyxiexzf;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m2007Ujhhgtgfeyxiexzf(float[] fArr) {
        if ((this.f2930Ujhhgtgfeyxiexzf & 12) != 0) {
            fArr[0] = (this.f2925Ujhhgtgfeyxiexzf + this.f2923Ujhhgtgfeyxiexzf) - this.f2918Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf.getLeft();
        } else {
            fArr[0] = this.f2918Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf.getTranslationX();
        }
        if ((this.f2930Ujhhgtgfeyxiexzf & 3) != 0) {
            fArr[1] = (this.f2926Ujhhgtgfeyxiexzf + this.f2924Ujhhgtgfeyxiexzf) - this.f2918Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf.getTop();
        } else {
            fArr[1] = this.f2918Ujhhgtgfeyxiexzf.f3241Ujhhgtgfeyxiexzf.getTranslationY();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m2008Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg) {
        ArrayList arrayList;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        if (!this.f2933Ujhhgtgfeyxiexzf.isLayoutRequested() && this.f2929Ujhhgtgfeyxiexzf == 2) {
            AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf = this.f2928Ujhhgtgfeyxiexzf;
            abstractC0699Ujhhgtgfeyxiexzf.getClass();
            int i2 = (int) (this.f2925Ujhhgtgfeyxiexzf + this.f2923Ujhhgtgfeyxiexzf);
            int i3 = (int) (this.f2926Ujhhgtgfeyxiexzf + this.f2924Ujhhgtgfeyxiexzf);
            View view = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
            if (Math.abs(i3 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i2 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.f2936Ujhhgtgfeyxiexzf;
                if (arrayList2 == null) {
                    this.f2936Ujhhgtgfeyxiexzf = new ArrayList();
                    this.f2937Ujhhgtgfeyxiexzf = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.f2937Ujhhgtgfeyxiexzf.clear();
                }
                int iRound = Math.round(this.f2925Ujhhgtgfeyxiexzf + this.f2923Ujhhgtgfeyxiexzf);
                int iRound2 = Math.round(this.f2926Ujhhgtgfeyxiexzf + this.f2924Ujhhgtgfeyxiexzf);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i4 = (iRound + width) / 2;
                int i5 = (iRound2 + height) / 2;
                AbstractC0822feyxiexzfUjhhgtg layoutManager = this.f2933Ujhhgtgfeyxiexzf.getLayoutManager();
                int iM2203Ujhhgtgfeyxiexzf = layoutManager.m2203Ujhhgtgfeyxiexzf();
                int i6 = 0;
                while (i6 < iM2203Ujhhgtgfeyxiexzf) {
                    View viewM2202Ujhhgtgfeyxiexzf = layoutManager.m2202Ujhhgtgfeyxiexzf(i6);
                    if (viewM2202Ujhhgtgfeyxiexzf == view) {
                        i = i6;
                    } else {
                        i = i6;
                        if (viewM2202Ujhhgtgfeyxiexzf.getBottom() >= iRound2 && viewM2202Ujhhgtgfeyxiexzf.getTop() <= height && viewM2202Ujhhgtgfeyxiexzf.getRight() >= iRound && viewM2202Ujhhgtgfeyxiexzf.getLeft() <= width) {
                            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg = this.f2933Ujhhgtgfeyxiexzf.m232feyxiexzfUjhhgtg(viewM2202Ujhhgtgfeyxiexzf);
                            int iAbs5 = Math.abs(i4 - ((viewM2202Ujhhgtgfeyxiexzf.getRight() + viewM2202Ujhhgtgfeyxiexzf.getLeft()) / 2));
                            int iAbs6 = Math.abs(i5 - ((viewM2202Ujhhgtgfeyxiexzf.getBottom() + viewM2202Ujhhgtgfeyxiexzf.getTop()) / 2));
                            int i7 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            int size = this.f2936Ujhhgtgfeyxiexzf.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < size) {
                                int i10 = size;
                                if (i7 <= ((Integer) this.f2937Ujhhgtgfeyxiexzf.get(i8)).intValue()) {
                                    break;
                                }
                                i9++;
                                i8++;
                                size = i10;
                            }
                            this.f2936Ujhhgtgfeyxiexzf.add(i9, abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg);
                            this.f2937Ujhhgtgfeyxiexzf.add(i9, Integer.valueOf(i7));
                        }
                        i6 = i + 1;
                        i2 = i2;
                        i3 = i3;
                        iRound = iRound;
                    }
                    i6 = i + 1;
                    i2 = i2;
                    i3 = i3;
                    iRound = iRound;
                }
                int i11 = i2;
                int i12 = i3;
                ArrayList arrayList3 = this.f2936Ujhhgtgfeyxiexzf;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i11;
                int height2 = view.getHeight() + i12;
                int left2 = i11 - view.getLeft();
                int top2 = i12 - view.getTop();
                int size2 = arrayList3.size();
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg2 = null;
                int i13 = -1;
                int i14 = 0;
                while (i14 < size2) {
                    AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg3 = (AbstractC0821feyxiexzfUjhhgtg) arrayList3.get(i14);
                    if (left2 <= 0 || (right = abstractC0821feyxiexzfUjhhgtg3.f3241Ujhhgtgfeyxiexzf.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (abstractC0821feyxiexzfUjhhgtg3.f3241Ujhhgtgfeyxiexzf.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i13) {
                            i13 = iAbs4;
                            abstractC0821feyxiexzfUjhhgtg2 = abstractC0821feyxiexzfUjhhgtg3;
                        }
                    }
                    if (left2 < 0 && (left = abstractC0821feyxiexzfUjhhgtg3.f3241Ujhhgtgfeyxiexzf.getLeft() - i11) > 0 && abstractC0821feyxiexzfUjhhgtg3.f3241Ujhhgtgfeyxiexzf.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i13) {
                        i13 = iAbs3;
                        abstractC0821feyxiexzfUjhhgtg2 = abstractC0821feyxiexzfUjhhgtg3;
                    }
                    if (top2 < 0 && (top = abstractC0821feyxiexzfUjhhgtg3.f3241Ujhhgtgfeyxiexzf.getTop() - i12) > 0 && abstractC0821feyxiexzfUjhhgtg3.f3241Ujhhgtgfeyxiexzf.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i13) {
                        i13 = iAbs2;
                        abstractC0821feyxiexzfUjhhgtg2 = abstractC0821feyxiexzfUjhhgtg3;
                    }
                    if (top2 > 0 && (bottom = abstractC0821feyxiexzfUjhhgtg3.f3241Ujhhgtgfeyxiexzf.getBottom() - height2) < 0 && abstractC0821feyxiexzfUjhhgtg3.f3241Ujhhgtgfeyxiexzf.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i13) {
                        i13 = iAbs;
                        abstractC0821feyxiexzfUjhhgtg2 = abstractC0821feyxiexzfUjhhgtg3;
                    }
                    i14++;
                    arrayList3 = arrayList;
                }
                if (abstractC0821feyxiexzfUjhhgtg2 == null) {
                    this.f2936Ujhhgtgfeyxiexzf.clear();
                    this.f2937Ujhhgtgfeyxiexzf.clear();
                    return;
                }
                View view2 = abstractC0821feyxiexzfUjhhgtg2.f3241Ujhhgtgfeyxiexzf;
                int iM2171Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg2.m2171Ujhhgtgfeyxiexzf();
                abstractC0821feyxiexzfUjhhgtg.m2171Ujhhgtgfeyxiexzf();
                if (abstractC0699Ujhhgtgfeyxiexzf.mo1995Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg, abstractC0821feyxiexzfUjhhgtg2)) {
                    RecyclerView recyclerView = this.f2933Ujhhgtgfeyxiexzf;
                    AbstractC0822feyxiexzfUjhhgtg layoutManager2 = recyclerView.getLayoutManager();
                    if (!(layoutManager2 instanceof LinearLayoutManager)) {
                        if (layoutManager2.mo152Ujhhgtgfeyxiexzf()) {
                            if (AbstractC0822feyxiexzfUjhhgtg.m2191feyxiexzfUjhhgtg(view2) <= recyclerView.getPaddingLeft()) {
                                recyclerView.m253feyxiexzfUjhhgtg(iM2171Ujhhgtgfeyxiexzf);
                            }
                            if (AbstractC0822feyxiexzfUjhhgtg.m2194feyxiexzfUjhhgtg(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.m253feyxiexzfUjhhgtg(iM2171Ujhhgtgfeyxiexzf);
                            }
                        }
                        if (layoutManager2.mo153Ujhhgtgfeyxiexzf()) {
                            if (AbstractC0822feyxiexzfUjhhgtg.m2195feyxiexzfUjhhgtg(view2) <= recyclerView.getPaddingTop()) {
                                recyclerView.m253feyxiexzfUjhhgtg(iM2171Ujhhgtgfeyxiexzf);
                            }
                            if (AbstractC0822feyxiexzfUjhhgtg.m2190feyxiexzfUjhhgtg(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.m253feyxiexzfUjhhgtg(iM2171Ujhhgtgfeyxiexzf);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                    linearLayoutManager.mo151Ujhhgtgfeyxiexzf("Cannot drop a view during a scroll or layout calculation");
                    linearLayoutManager.m173feyxiexzfUjhhgtg();
                    linearLayoutManager.m188feyxiexzfUjhhgtg();
                    int iM2196feyxiexzfUjhhgtg = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(view);
                    int iM2196feyxiexzfUjhhgtg2 = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(view2);
                    byte b = iM2196feyxiexzfUjhhgtg < iM2196feyxiexzfUjhhgtg2 ? (byte) 1 : (byte) -1;
                    if (linearLayoutManager.f338Ujhhgtgfeyxiexzf) {
                        if (b == 1) {
                            linearLayoutManager.mo190Ujhhgtgfeyxiexzf(iM2196feyxiexzfUjhhgtg2, linearLayoutManager.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - (linearLayoutManager.f335Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view) + linearLayoutManager.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(view2)));
                            return;
                        } else {
                            linearLayoutManager.mo190Ujhhgtgfeyxiexzf(iM2196feyxiexzfUjhhgtg2, linearLayoutManager.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - linearLayoutManager.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(view2));
                            return;
                        }
                    }
                    if (b == -1) {
                        linearLayoutManager.mo190Ujhhgtgfeyxiexzf(iM2196feyxiexzfUjhhgtg2, linearLayoutManager.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(view2));
                    } else {
                        linearLayoutManager.mo190Ujhhgtgfeyxiexzf(iM2196feyxiexzfUjhhgtg2, linearLayoutManager.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(view2) - linearLayoutManager.f335Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2009Ujhhgtgfeyxiexzf(View view) {
        if (view == this.f2938Ujhhgtgfeyxiexzf) {
            this.f2938Ujhhgtgfeyxiexzf = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ要点脸能不能ᛲ] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛳᛲᛴᛱfeyxiexzfᛱ能不能] */
    /* JADX WARN: Type inference failed for: r3v3, types: [上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛳᛲᛴᛱfeyxiexzfᛱ能不能] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m2010Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, int i) {
        ?? r3;
        ?? r12;
        boolean z;
        ?? r13;
        ?? r14;
        ?? r4;
        int iM2004Ujhhgtgfeyxiexzf;
        char c;
        float fSignum;
        Object obj;
        long j;
        if (abstractC0821feyxiexzfUjhhgtg == this.f2918Ujhhgtgfeyxiexzf && i == this.f2929Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f2943feyxiexzfUjhhgtg = Long.MIN_VALUE;
        int i2 = this.f2929Ujhhgtgfeyxiexzf;
        m2005Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg, true);
        this.f2929Ujhhgtgfeyxiexzf = i;
        if (i == 2) {
            if (abstractC0821feyxiexzfUjhhgtg == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f2938Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.f2918Ujhhgtgfeyxiexzf;
        AbstractC0699Ujhhgtgfeyxiexzf abstractC0699Ujhhgtgfeyxiexzf = this.f2928Ujhhgtgfeyxiexzf;
        if (r2 != 0) {
            View view = r2.f3241Ujhhgtgfeyxiexzf;
            if (view.getParent() != null) {
                if (i2 == 2 || this.f2929Ujhhgtgfeyxiexzf == 2) {
                    iM2004Ujhhgtgfeyxiexzf = 0;
                } else {
                    int iMo1987Ujhhgtgfeyxiexzf = abstractC0699Ujhhgtgfeyxiexzf.mo1987Ujhhgtgfeyxiexzf();
                    int iM1980Ujhhgtgfeyxiexzf = (AbstractC0699Ujhhgtgfeyxiexzf.m1980Ujhhgtgfeyxiexzf(iMo1987Ujhhgtgfeyxiexzf, this.f2933Ujhhgtgfeyxiexzf.getLayoutDirection()) & 65280) >> 8;
                    if (iM1980Ujhhgtgfeyxiexzf == 0) {
                        iM2004Ujhhgtgfeyxiexzf = 0;
                    } else {
                        int i4 = (iMo1987Ujhhgtgfeyxiexzf & 65280) >> 8;
                        if (Math.abs(this.f2923Ujhhgtgfeyxiexzf) > Math.abs(this.f2924Ujhhgtgfeyxiexzf)) {
                            iM2004Ujhhgtgfeyxiexzf = m2002Ujhhgtgfeyxiexzf(iM1980Ujhhgtgfeyxiexzf);
                            if (iM2004Ujhhgtgfeyxiexzf <= 0) {
                                iM2004Ujhhgtgfeyxiexzf = m2004Ujhhgtgfeyxiexzf(iM1980Ujhhgtgfeyxiexzf);
                                if (iM2004Ujhhgtgfeyxiexzf <= 0) {
                                    iM2004Ujhhgtgfeyxiexzf = 0;
                                }
                            } else if ((i4 & iM2004Ujhhgtgfeyxiexzf) == 0) {
                                iM2004Ujhhgtgfeyxiexzf = AbstractC0699Ujhhgtgfeyxiexzf.m1981Ujhhgtgfeyxiexzf(iM2004Ujhhgtgfeyxiexzf, this.f2933Ujhhgtgfeyxiexzf.getLayoutDirection());
                            }
                        } else {
                            iM2004Ujhhgtgfeyxiexzf = m2004Ujhhgtgfeyxiexzf(iM1980Ujhhgtgfeyxiexzf);
                            if (iM2004Ujhhgtgfeyxiexzf <= 0) {
                                iM2004Ujhhgtgfeyxiexzf = m2002Ujhhgtgfeyxiexzf(iM1980Ujhhgtgfeyxiexzf);
                                if (iM2004Ujhhgtgfeyxiexzf <= 0) {
                                    iM2004Ujhhgtgfeyxiexzf = 0;
                                } else if ((i4 & iM2004Ujhhgtgfeyxiexzf) == 0) {
                                    iM2004Ujhhgtgfeyxiexzf = AbstractC0699Ujhhgtgfeyxiexzf.m1981Ujhhgtgfeyxiexzf(iM2004Ujhhgtgfeyxiexzf, this.f2933Ujhhgtgfeyxiexzf.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f2935Ujhhgtgfeyxiexzf;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f2935Ujhhgtgfeyxiexzf = null;
                }
                char c2 = 4;
                float fSignum2 = 0.0f;
                if (iM2004Ujhhgtgfeyxiexzf == 1 || iM2004Ujhhgtgfeyxiexzf == 2) {
                    c = 0;
                    fSignum = Math.signum(this.f2924Ujhhgtgfeyxiexzf) * this.f2933Ujhhgtgfeyxiexzf.getHeight();
                    obj = null;
                } else if (iM2004Ujhhgtgfeyxiexzf == 4 || iM2004Ujhhgtgfeyxiexzf == 8 || iM2004Ujhhgtgfeyxiexzf == 16 || iM2004Ujhhgtgfeyxiexzf == 32) {
                    c = 0;
                    obj = null;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f2923Ujhhgtgfeyxiexzf) * this.f2933Ujhhgtgfeyxiexzf.getWidth();
                } else {
                    obj = null;
                    c = 0;
                    fSignum = 0.0f;
                }
                if (i2 == 2) {
                    c2 = '\b';
                } else if (iM2004Ujhhgtgfeyxiexzf > 0) {
                    c2 = 2;
                }
                float[] fArr = this.f2917Ujhhgtgfeyxiexzf;
                m2007Ujhhgtgfeyxiexzf(fArr);
                char c3 = c2;
                ?? r15 = c;
                C0697Ujhhgtgfeyxiexzf c0697Ujhhgtgfeyxiexzf = new C0697Ujhhgtgfeyxiexzf(this, r2, i2, fArr[c], fArr[1], fSignum2, fSignum, iM2004Ujhhgtgfeyxiexzf, r2);
                RecyclerView recyclerView = this.f2933Ujhhgtgfeyxiexzf;
                abstractC0699Ujhhgtgfeyxiexzf.getClass();
                AbstractC0793feyxiexzfUjhhgtg itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator == null) {
                    j = c3 == '\b' ? 200L : 250L;
                } else {
                    j = c3 == '\b' ? itemAnimator.f3109Ujhhgtgfeyxiexzf : itemAnimator.f3108Ujhhgtgfeyxiexzf;
                }
                ValueAnimator valueAnimator = c0697Ujhhgtgfeyxiexzf.f2859Ujhhgtgfeyxiexzf;
                valueAnimator.setDuration(j);
                this.f2931Ujhhgtgfeyxiexzf.add(c0697Ujhhgtgfeyxiexzf);
                r2.m2185Ujhhgtgfeyxiexzf(r15);
                valueAnimator.start();
                r4 = abstractC0699Ujhhgtgfeyxiexzf;
                z = true;
                r14 = r15;
            } else {
                r14 = 0;
                m2009Ujhhgtgfeyxiexzf(view);
                ?? r5 = abstractC0699Ujhhgtgfeyxiexzf;
                r5.mo1986Ujhhgtgfeyxiexzf(this.f2933Ujhhgtgfeyxiexzf, r2);
                z = false;
                r4 = r5;
            }
            this.f2918Ujhhgtgfeyxiexzf = null;
            r3 = r4;
            r12 = r14;
        } else {
            r3 = abstractC0699Ujhhgtgfeyxiexzf;
            r12 = 0;
            z = false;
        }
        if (abstractC0821feyxiexzfUjhhgtg != null) {
            View view2 = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
            this.f2930Ujhhgtgfeyxiexzf = (AbstractC0699Ujhhgtgfeyxiexzf.m1980Ujhhgtgfeyxiexzf(r3.mo1987Ujhhgtgfeyxiexzf(), this.f2933Ujhhgtgfeyxiexzf.getLayoutDirection()) & i3) >> (this.f2929Ujhhgtgfeyxiexzf * 8);
            this.f2925Ujhhgtgfeyxiexzf = view2.getLeft();
            this.f2926Ujhhgtgfeyxiexzf = view2.getTop();
            this.f2918Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg;
            if (i == 2) {
                view2.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.f2933Ujhhgtgfeyxiexzf.getParent();
        if (parent != 0) {
            if (this.f2918Ujhhgtgfeyxiexzf != null) {
                r13 = r12;
                r13 = 1;
            }
            r13 = r12;
            parent.requestDisallowInterceptTouchEvent(r13);
        }
        if (!z) {
            this.f2933Ujhhgtgfeyxiexzf.getLayoutManager().f3265Ujhhgtgfeyxiexzf = true;
        }
        r3.mo1996Ujhhgtgfeyxiexzf(this.f2929Ujhhgtgfeyxiexzf);
        this.f2933Ujhhgtgfeyxiexzf.invalidate();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2011Ujhhgtgfeyxiexzf(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f2919Ujhhgtgfeyxiexzf;
        this.f2923Ujhhgtgfeyxiexzf = f;
        this.f2924Ujhhgtgfeyxiexzf = y - this.f2920Ujhhgtgfeyxiexzf;
        if ((i & 4) == 0) {
            this.f2923Ujhhgtgfeyxiexzf = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f2923Ujhhgtgfeyxiexzf = Math.min(0.0f, this.f2923Ujhhgtgfeyxiexzf);
        }
        if ((i & 1) == 0) {
            this.f2924Ujhhgtgfeyxiexzf = Math.max(0.0f, this.f2924Ujhhgtgfeyxiexzf);
        }
        if ((i & 2) == 0) {
            this.f2924Ujhhgtgfeyxiexzf = Math.min(0.0f, this.f2924Ujhhgtgfeyxiexzf);
        }
    }
}
