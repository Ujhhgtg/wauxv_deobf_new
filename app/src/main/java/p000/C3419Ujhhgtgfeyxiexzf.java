package p000;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱUjhhgtgᛱ能不能ᛴᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3419Ujhhgtgfeyxiexzf extends AbstractC0826feyxiexzfUjhhgtg implements InterfaceC0832feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final int[] f10646feyxiexzfUjhhgtg = {R.attr.state_pressed};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final int[] f10647feyxiexzfUjhhgtg = new int[0];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f10648Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f10649Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final StateListDrawable f10650Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Drawable f10651Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f10652Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f10653Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final StateListDrawable f10654Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Drawable f10655Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int f10656Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f10657Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f10658Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f10659Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public float f10660Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f10661Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f10662Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f10663Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final RecyclerView f10666Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ValueAnimator f10673feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f10674feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final RunnableC3012feyxiexzfUjhhgtg f10675feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public int f10664Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f10665Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public boolean f10667Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f10668Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f10669Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public int f10670Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int[] f10671Ujhhgtgfeyxiexzf = new int[2];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int[] f10672feyxiexzfUjhhgtg = new int[2];

    public C3419Ujhhgtgfeyxiexzf(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10673feyxiexzfUjhhgtg = valueAnimatorOfFloat;
        this.f10674feyxiexzfUjhhgtg = 0;
        RunnableC3012feyxiexzfUjhhgtg runnableC3012feyxiexzfUjhhgtg = new RunnableC3012feyxiexzfUjhhgtg(7, this);
        this.f10675feyxiexzfUjhhgtg = runnableC3012feyxiexzfUjhhgtg;
        C3417Ujhhgtgfeyxiexzf c3417Ujhhgtgfeyxiexzf = new C3417Ujhhgtgfeyxiexzf(this);
        this.f10650Ujhhgtgfeyxiexzf = stateListDrawable;
        this.f10651Ujhhgtgfeyxiexzf = drawable;
        this.f10654Ujhhgtgfeyxiexzf = stateListDrawable2;
        this.f10655Ujhhgtgfeyxiexzf = drawable2;
        this.f10652Ujhhgtgfeyxiexzf = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f10653Ujhhgtgfeyxiexzf = Math.max(i, drawable.getIntrinsicWidth());
        this.f10656Ujhhgtgfeyxiexzf = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f10657Ujhhgtgfeyxiexzf = Math.max(i, drawable2.getIntrinsicWidth());
        this.f10648Ujhhgtgfeyxiexzf = i2;
        this.f10649Ujhhgtgfeyxiexzf = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C3418Ujhhgtgfeyxiexzf(this));
        valueAnimatorOfFloat.addUpdateListener(new C2478feyxiexzfUjhhgtg(2, this));
        RecyclerView recyclerView2 = this.f10666Ujhhgtgfeyxiexzf;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m249feyxiexzfUjhhgtg(this);
            RecyclerView recyclerView3 = this.f10666Ujhhgtgfeyxiexzf;
            recyclerView3.f373Ujhhgtgfeyxiexzf.remove(this);
            if (recyclerView3.f374Ujhhgtgfeyxiexzf == this) {
                recyclerView3.f374Ujhhgtgfeyxiexzf = null;
            }
            ArrayList arrayList = this.f10666Ujhhgtgfeyxiexzf.f414feyxiexzfUjhhgtg;
            if (arrayList != null) {
                arrayList.remove(c3417Ujhhgtgfeyxiexzf);
            }
            this.f10666Ujhhgtgfeyxiexzf.removeCallbacks(runnableC3012feyxiexzfUjhhgtg);
        }
        this.f10666Ujhhgtgfeyxiexzf = recyclerView;
        recyclerView.m206Ujhhgtgfeyxiexzf(this);
        this.f10666Ujhhgtgfeyxiexzf.f373Ujhhgtgfeyxiexzf.add(this);
        RecyclerView recyclerView4 = this.f10666Ujhhgtgfeyxiexzf;
        if (recyclerView4.f414feyxiexzfUjhhgtg == null) {
            recyclerView4.f414feyxiexzfUjhhgtg = new ArrayList();
        }
        recyclerView4.f414feyxiexzfUjhhgtg.add(c3417Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static int m4914Ujhhgtgfeyxiexzf(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // p000.InterfaceC0832feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1977Ujhhgtgfeyxiexzf(MotionEvent motionEvent) {
        if (this.f10669Ujhhgtgfeyxiexzf == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM4916Ujhhgtgfeyxiexzf = m4916Ujhhgtgfeyxiexzf(motionEvent.getX(), motionEvent.getY());
            boolean zM4915Ujhhgtgfeyxiexzf = m4915Ujhhgtgfeyxiexzf(motionEvent.getX(), motionEvent.getY());
            if (zM4916Ujhhgtgfeyxiexzf || zM4915Ujhhgtgfeyxiexzf) {
                if (zM4915Ujhhgtgfeyxiexzf) {
                    this.f10670Ujhhgtgfeyxiexzf = 1;
                    this.f10663Ujhhgtgfeyxiexzf = (int) motionEvent.getX();
                } else if (zM4916Ujhhgtgfeyxiexzf) {
                    this.f10670Ujhhgtgfeyxiexzf = 2;
                    this.f10660Ujhhgtgfeyxiexzf = (int) motionEvent.getY();
                }
                m4917Ujhhgtgfeyxiexzf(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f10669Ujhhgtgfeyxiexzf == 2) {
            this.f10660Ujhhgtgfeyxiexzf = 0.0f;
            this.f10663Ujhhgtgfeyxiexzf = 0.0f;
            m4917Ujhhgtgfeyxiexzf(1);
            this.f10670Ujhhgtgfeyxiexzf = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f10669Ujhhgtgfeyxiexzf == 2) {
            m4918Ujhhgtgfeyxiexzf();
            int i = this.f10670Ujhhgtgfeyxiexzf;
            int i2 = this.f10649Ujhhgtgfeyxiexzf;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f10672feyxiexzfUjhhgtg;
                iArr[0] = i2;
                int i3 = this.f10664Ujhhgtgfeyxiexzf - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f10662Ujhhgtgfeyxiexzf - fMax) >= 2.0f) {
                    int iM4914Ujhhgtgfeyxiexzf = m4914Ujhhgtgfeyxiexzf(this.f10663Ujhhgtgfeyxiexzf, fMax, iArr, this.f10666Ujhhgtgfeyxiexzf.computeHorizontalScrollRange(), this.f10666Ujhhgtgfeyxiexzf.computeHorizontalScrollOffset(), this.f10664Ujhhgtgfeyxiexzf);
                    if (iM4914Ujhhgtgfeyxiexzf != 0) {
                        this.f10666Ujhhgtgfeyxiexzf.scrollBy(iM4914Ujhhgtgfeyxiexzf, 0);
                    }
                    this.f10663Ujhhgtgfeyxiexzf = fMax;
                }
            }
            if (this.f10670Ujhhgtgfeyxiexzf == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f10671Ujhhgtgfeyxiexzf;
                iArr2[0] = i2;
                int i4 = this.f10665Ujhhgtgfeyxiexzf - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f10659Ujhhgtgfeyxiexzf - fMax2) < 2.0f) {
                    return;
                }
                int iM4914Ujhhgtgfeyxiexzf2 = m4914Ujhhgtgfeyxiexzf(this.f10660Ujhhgtgfeyxiexzf, fMax2, iArr2, this.f10666Ujhhgtgfeyxiexzf.computeVerticalScrollRange(), this.f10666Ujhhgtgfeyxiexzf.computeVerticalScrollOffset(), this.f10665Ujhhgtgfeyxiexzf);
                if (iM4914Ujhhgtgfeyxiexzf2 != 0) {
                    this.f10666Ujhhgtgfeyxiexzf.scrollBy(0, iM4914Ujhhgtgfeyxiexzf2);
                }
                this.f10660Ujhhgtgfeyxiexzf = fMax2;
            }
        }
    }

    @Override // p000.InterfaceC0832feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final boolean mo1978Ujhhgtgfeyxiexzf(MotionEvent motionEvent) {
        int i = this.f10669Ujhhgtgfeyxiexzf;
        if (i != 1) {
            return i == 2;
        }
        boolean zM4916Ujhhgtgfeyxiexzf = m4916Ujhhgtgfeyxiexzf(motionEvent.getX(), motionEvent.getY());
        boolean zM4915Ujhhgtgfeyxiexzf = m4915Ujhhgtgfeyxiexzf(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM4916Ujhhgtgfeyxiexzf && !zM4915Ujhhgtgfeyxiexzf) {
            return false;
        }
        if (zM4915Ujhhgtgfeyxiexzf) {
            this.f10670Ujhhgtgfeyxiexzf = 1;
            this.f10663Ujhhgtgfeyxiexzf = (int) motionEvent.getX();
        } else if (zM4916Ujhhgtgfeyxiexzf) {
            this.f10670Ujhhgtgfeyxiexzf = 2;
            this.f10660Ujhhgtgfeyxiexzf = (int) motionEvent.getY();
        }
        m4917Ujhhgtgfeyxiexzf(2);
        return true;
    }

    @Override // p000.AbstractC0826feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo2000Ujhhgtgfeyxiexzf(Canvas canvas, RecyclerView recyclerView) {
        if (this.f10664Ujhhgtgfeyxiexzf != this.f10666Ujhhgtgfeyxiexzf.getWidth() || this.f10665Ujhhgtgfeyxiexzf != this.f10666Ujhhgtgfeyxiexzf.getHeight()) {
            this.f10664Ujhhgtgfeyxiexzf = this.f10666Ujhhgtgfeyxiexzf.getWidth();
            this.f10665Ujhhgtgfeyxiexzf = this.f10666Ujhhgtgfeyxiexzf.getHeight();
            m4917Ujhhgtgfeyxiexzf(0);
            return;
        }
        if (this.f10674feyxiexzfUjhhgtg != 0) {
            if (this.f10667Ujhhgtgfeyxiexzf) {
                int i = this.f10664Ujhhgtgfeyxiexzf;
                int i2 = this.f10652Ujhhgtgfeyxiexzf;
                int i3 = i - i2;
                int i4 = this.f10659Ujhhgtgfeyxiexzf;
                int i5 = this.f10658Ujhhgtgfeyxiexzf;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.f10650Ujhhgtgfeyxiexzf;
                stateListDrawable.setBounds(0, 0, i2, i5);
                int i7 = this.f10653Ujhhgtgfeyxiexzf;
                int i8 = this.f10665Ujhhgtgfeyxiexzf;
                Drawable drawable = this.f10651Ujhhgtgfeyxiexzf;
                drawable.setBounds(0, 0, i7, i8);
                if (this.f10666Ujhhgtgfeyxiexzf.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i2, i6);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i2, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i6);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.f10668Ujhhgtgfeyxiexzf) {
                int i9 = this.f10665Ujhhgtgfeyxiexzf;
                int i10 = this.f10656Ujhhgtgfeyxiexzf;
                int i11 = i9 - i10;
                int i12 = this.f10662Ujhhgtgfeyxiexzf;
                int i13 = this.f10661Ujhhgtgfeyxiexzf;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable2 = this.f10654Ujhhgtgfeyxiexzf;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                int i15 = this.f10664Ujhhgtgfeyxiexzf;
                int i16 = this.f10657Ujhhgtgfeyxiexzf;
                Drawable drawable2 = this.f10655Ujhhgtgfeyxiexzf;
                drawable2.setBounds(0, 0, i15, i16);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(i14, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i14, -i11);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean m4915Ujhhgtgfeyxiexzf(float f, float f2) {
        if (f2 < this.f10665Ujhhgtgfeyxiexzf - this.f10656Ujhhgtgfeyxiexzf) {
            return false;
        }
        int i = this.f10662Ujhhgtgfeyxiexzf;
        int i2 = this.f10661Ujhhgtgfeyxiexzf;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean m4916Ujhhgtgfeyxiexzf(float f, float f2) {
        int layoutDirection = this.f10666Ujhhgtgfeyxiexzf.getLayoutDirection();
        int i = this.f10652Ujhhgtgfeyxiexzf;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f10664Ujhhgtgfeyxiexzf - i) {
            return false;
        }
        int i2 = this.f10659Ujhhgtgfeyxiexzf;
        int i3 = this.f10658Ujhhgtgfeyxiexzf / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4917Ujhhgtgfeyxiexzf(int i) {
        RunnableC3012feyxiexzfUjhhgtg runnableC3012feyxiexzfUjhhgtg = this.f10675feyxiexzfUjhhgtg;
        StateListDrawable stateListDrawable = this.f10650Ujhhgtgfeyxiexzf;
        if (i == 2 && this.f10669Ujhhgtgfeyxiexzf != 2) {
            stateListDrawable.setState(f10646feyxiexzfUjhhgtg);
            this.f10666Ujhhgtgfeyxiexzf.removeCallbacks(runnableC3012feyxiexzfUjhhgtg);
        }
        if (i == 0) {
            this.f10666Ujhhgtgfeyxiexzf.invalidate();
        } else {
            m4918Ujhhgtgfeyxiexzf();
        }
        if (this.f10669Ujhhgtgfeyxiexzf == 2 && i != 2) {
            stateListDrawable.setState(f10647feyxiexzfUjhhgtg);
            this.f10666Ujhhgtgfeyxiexzf.removeCallbacks(runnableC3012feyxiexzfUjhhgtg);
            this.f10666Ujhhgtgfeyxiexzf.postDelayed(runnableC3012feyxiexzfUjhhgtg, 1200);
        } else if (i == 1) {
            this.f10666Ujhhgtgfeyxiexzf.removeCallbacks(runnableC3012feyxiexzfUjhhgtg);
            this.f10666Ujhhgtgfeyxiexzf.postDelayed(runnableC3012feyxiexzfUjhhgtg, 1500);
        }
        this.f10669Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m4918Ujhhgtgfeyxiexzf() {
        int i = this.f10674feyxiexzfUjhhgtg;
        ValueAnimator valueAnimator = this.f10673feyxiexzfUjhhgtg;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f10674feyxiexzfUjhhgtg = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // p000.InterfaceC0832feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1979Ujhhgtgfeyxiexzf(boolean z) {
    }
}
