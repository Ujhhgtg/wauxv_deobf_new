package p000;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲈᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1277 extends AbstractC2543 implements InterfaceC2549 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static final int[] f4654 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static final int[] f4655 = new int[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f4656;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f4657;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final StateListDrawable f4658;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Drawable f4659;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f4660;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f4661;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final StateListDrawable f4662;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Drawable f4663;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f4664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int f4665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f4666;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f4667;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public float f4668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f4669;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f4670;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public float f4671;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final RecyclerView f4674;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final ValueAnimator f4681;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public int f4682;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final RunnableC0149 f4683;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public int f4672 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public int f4673 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public boolean f4675 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public boolean f4676 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int f4677 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int f4678 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final int[] f4679 = new int[2];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final int[] f4680 = new int[2];

    public C1277(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4681 = valueAnimatorOfFloat;
        this.f4682 = 0;
        RunnableC0149 runnableC0149 = new RunnableC0149(this, 7);
        this.f4683 = runnableC0149;
        C1275 c1275 = new C1275(this);
        this.f4658 = stateListDrawable;
        this.f4659 = drawable;
        this.f4662 = stateListDrawable2;
        this.f4663 = drawable2;
        this.f4660 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4661 = Math.max(i, drawable.getIntrinsicWidth());
        this.f4664 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4665 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4656 = i2;
        this.f4657 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C1276(this));
        valueAnimatorOfFloat.addUpdateListener(new C0360(this, 2));
        RecyclerView recyclerView2 = this.f4674;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m249(this);
            RecyclerView recyclerView3 = this.f4674;
            recyclerView3.f372.remove(this);
            if (recyclerView3.f373 == this) {
                recyclerView3.f373 = null;
            }
            ArrayList arrayList = this.f4674.f413;
            if (arrayList != null) {
                arrayList.remove(c1275);
            }
            this.f4674.removeCallbacks(runnableC0149);
        }
        this.f4674 = recyclerView;
        recyclerView.m206(this);
        this.f4674.f372.add(this);
        RecyclerView recyclerView4 = this.f4674;
        if (recyclerView4.f413 == null) {
            recyclerView4.f413 = new ArrayList();
        }
        recyclerView4.f413.add(c1275);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static int m3107(float f, float f2, int[] iArr, int i, int i2, int i3) {
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

    @Override // p000.InterfaceC2549
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo3108(MotionEvent motionEvent) {
        if (this.f4677 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM3112 = m3112(motionEvent.getX(), motionEvent.getY());
            boolean zM3111 = m3111(motionEvent.getX(), motionEvent.getY());
            if (zM3112 || zM3111) {
                if (zM3111) {
                    this.f4678 = 1;
                    this.f4671 = (int) motionEvent.getX();
                } else if (zM3112) {
                    this.f4678 = 2;
                    this.f4668 = (int) motionEvent.getY();
                }
                m3113(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f4677 == 2) {
            this.f4668 = 0.0f;
            this.f4671 = 0.0f;
            m3113(1);
            this.f4678 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f4677 == 2) {
            m3114();
            int i = this.f4678;
            int i2 = this.f4657;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f4680;
                iArr[0] = i2;
                int i3 = this.f4672 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f4670 - fMax) >= 2.0f) {
                    int iM3107 = m3107(this.f4671, fMax, iArr, this.f4674.computeHorizontalScrollRange(), this.f4674.computeHorizontalScrollOffset(), this.f4672);
                    if (iM3107 != 0) {
                        this.f4674.scrollBy(iM3107, 0);
                    }
                    this.f4671 = fMax;
                }
            }
            if (this.f4678 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f4679;
                iArr2[0] = i2;
                int i4 = this.f4673 - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f4667 - fMax2) < 2.0f) {
                    return;
                }
                int iM3108 = m3107(this.f4668, fMax2, iArr2, this.f4674.computeVerticalScrollRange(), this.f4674.computeVerticalScrollOffset(), this.f4673);
                if (iM3108 != 0) {
                    this.f4674.scrollBy(0, iM3108);
                }
                this.f4668 = fMax2;
            }
        }
    }

    @Override // p000.InterfaceC2549
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean mo3109(MotionEvent motionEvent) {
        int i = this.f4677;
        if (i != 1) {
            return i == 2;
        }
        boolean zM3112 = m3112(motionEvent.getX(), motionEvent.getY());
        boolean zM3111 = m3111(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM3112 && !zM3111) {
            return false;
        }
        if (zM3111) {
            this.f4678 = 1;
            this.f4671 = (int) motionEvent.getX();
        } else if (zM3112) {
            this.f4678 = 2;
            this.f4668 = (int) motionEvent.getY();
        }
        m3113(2);
        return true;
    }

    @Override // p000.AbstractC2543
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2055(Canvas canvas, RecyclerView recyclerView) {
        if (this.f4672 != this.f4674.getWidth() || this.f4673 != this.f4674.getHeight()) {
            this.f4672 = this.f4674.getWidth();
            this.f4673 = this.f4674.getHeight();
            m3113(0);
            return;
        }
        if (this.f4682 != 0) {
            if (this.f4675) {
                int i = this.f4672;
                int i2 = this.f4660;
                int i3 = i - i2;
                int i4 = this.f4667;
                int i5 = this.f4666;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.f4658;
                stateListDrawable.setBounds(0, 0, i2, i5);
                int i7 = this.f4661;
                int i8 = this.f4673;
                Drawable drawable = this.f4659;
                drawable.setBounds(0, 0, i7, i8);
                if (this.f4674.getLayoutDirection() == 1) {
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
            if (this.f4676) {
                int i9 = this.f4673;
                int i10 = this.f4664;
                int i11 = i9 - i10;
                int i12 = this.f4670;
                int i13 = this.f4669;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable2 = this.f4662;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                int i15 = this.f4672;
                int i16 = this.f4665;
                Drawable drawable2 = this.f4663;
                drawable2.setBounds(0, 0, i15, i16);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(i14, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i14, -i11);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean m3111(float f, float f2) {
        if (f2 < this.f4673 - this.f4664) {
            return false;
        }
        int i = this.f4670;
        int i2 = this.f4669;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean m3112(float f, float f2) {
        int layoutDirection = this.f4674.getLayoutDirection();
        int i = this.f4660;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f4672 - i) {
            return false;
        }
        int i2 = this.f4667;
        int i3 = this.f4666 / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m3113(int i) {
        RunnableC0149 runnableC0149 = this.f4683;
        StateListDrawable stateListDrawable = this.f4658;
        if (i == 2 && this.f4677 != 2) {
            stateListDrawable.setState(f4654);
            this.f4674.removeCallbacks(runnableC0149);
        }
        if (i == 0) {
            this.f4674.invalidate();
        } else {
            m3114();
        }
        if (this.f4677 == 2 && i != 2) {
            stateListDrawable.setState(f4655);
            this.f4674.removeCallbacks(runnableC0149);
            this.f4674.postDelayed(runnableC0149, 1200);
        } else if (i == 1) {
            this.f4674.removeCallbacks(runnableC0149);
            this.f4674.postDelayed(runnableC0149, 1500);
        }
        this.f4677 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3114() {
        int i = this.f4682;
        ValueAnimator valueAnimator = this.f4681;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f4682 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // p000.InterfaceC2549
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo3110(boolean z) {
    }
}
