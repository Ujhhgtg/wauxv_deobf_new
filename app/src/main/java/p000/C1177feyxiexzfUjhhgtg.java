package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1177feyxiexzfUjhhgtg extends ViewGroup {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f4459Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f4460Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f4461Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final PointF f4462Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final PointF f4463Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public boolean f4464Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f4465Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public InterfaceC1176feyxiexzfUjhhgtg f4466Ujhhgtgfeyxiexzf;

    public C1177feyxiexzfUjhhgtg(Context context) {
        super(context, null, 0);
        this.f4462Ujhhgtgfeyxiexzf = new PointF();
        this.f4463Ujhhgtgfeyxiexzf = new PointF();
        this.f4459Ujhhgtgfeyxiexzf = ViewConfiguration.get(context).getScaledTouchSlop();
        setClickable(true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:48:0x015a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ff  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float fAbs;
        float f;
        InterfaceC1176feyxiexzfUjhhgtg interfaceC1176feyxiexzfUjhhgtg;
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf;
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf;
        Object origin;
        C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf;
        InterfaceC1176feyxiexzfUjhhgtg interfaceC1176feyxiexzfUjhhgtg2;
        Object obj;
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2;
        Vibrator defaultVibrator;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        int action = motionEvent.getAction();
        PointF pointF = this.f4462Ujhhgtgfeyxiexzf;
        PointF pointF2 = this.f4463Ujhhgtgfeyxiexzf;
        if (action != 0) {
            if (action == 1) {
                fAbs = Math.abs(motionEvent.getRawX() - pointF.x);
                f = this.f4459Ujhhgtgfeyxiexzf;
                if (fAbs <= f && Math.abs(motionEvent.getRawY() - pointF.y) <= f && Math.abs(getScrollX()) <= 10 && (interfaceC1176feyxiexzfUjhhgtg2 = this.f4466Ujhhgtgfeyxiexzf) != null) {
                    int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    obj = ((C0416Ujhhgtgfeyxiexzf) interfaceC1176feyxiexzfUjhhgtg2).f2244Ujhhgtgfeyxiexzf;
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928401261931267466L, strArr);
                    if (((View) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2)).m4939Ujhhgtgfeyxiexzf()).getVisibility() == 0) {
                        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
                        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928401360715515274L, strArr);
                        ((View) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3)).m4939Ujhhgtgfeyxiexzf()).performClick();
                        this.f4464Ujhhgtgfeyxiexzf = false;
                        this.f4465Ujhhgtgfeyxiexzf = false;
                        return true;
                    }
                }
                if (Math.abs(getScrollX()) > this.f4461Ujhhgtgfeyxiexzf) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt.addUpdateListener(new C3235feyxiexzfUjhhgtg(4, this));
                    valueAnimatorOfInt.setDuration(100L);
                    valueAnimatorOfInt.start();
                    interfaceC1176feyxiexzfUjhhgtg = this.f4466Ujhhgtgfeyxiexzf;
                    if (interfaceC1176feyxiexzfUjhhgtg != null) {
                        c0416Ujhhgtgfeyxiexzf = (C0416Ujhhgtgfeyxiexzf) interfaceC1176feyxiexzfUjhhgtg;
                        int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf).m2021Ujhhgtgfeyxiexzf();
                        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928401300585973130L, strArr);
                        if (((View) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf()).getVisibility() != 0) {
                            C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = new C2065feyxiexzfUjhhgtg(new C2739feyxiexzfUjhhgtg(1, c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf));
                            C2724feyxiexzfUjhhgtg c2724feyxiexzfUjhhgtg = C2724feyxiexzfUjhhgtg.f8678Ujhhgtgfeyxiexzf;
                            FrameLayout frameLayout = (FrameLayout) c2065feyxiexzfUjhhgtg.getValue();
                            origin = ((MsgInfoBean) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf).getOrigin();
                            c2724feyxiexzfUjhhgtg.getClass();
                            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(frameLayout).m2024Ujhhgtgfeyxiexzf();
                            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Boolean.TYPE);
                            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f10478Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(9);
                            c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf());
                            if (c0393Ujhhgtgfeyxiexzf.f2132Ujhhgtgfeyxiexzf.getParameterCount() == 2) {
                                c0393Ujhhgtgfeyxiexzf.m1649Ujhhgtgfeyxiexzf(origin, null);
                            } else {
                                c0393Ujhhgtgfeyxiexzf.m1649Ujhhgtgfeyxiexzf(origin);
                            }
                        }
                    }
                } else {
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt2.addUpdateListener(new C3235feyxiexzfUjhhgtg(4, this));
                    valueAnimatorOfInt2.setDuration(100L);
                    valueAnimatorOfInt2.start();
                }
                this.f4464Ujhhgtgfeyxiexzf = false;
                this.f4465Ujhhgtgfeyxiexzf = false;
            } else if (action == 2) {
                float rawX = pointF2.x - motionEvent.getRawX();
                if (Math.abs(rawX) > 10.0f || Math.abs(getScrollX()) > 10) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    scrollBy((int) rawX, 0);
                    if (getScrollX() < 0) {
                        scrollTo(0, 0);
                    }
                    int scrollX = getScrollX();
                    int i3 = this.f4460Ujhhgtgfeyxiexzf;
                    if (scrollX > i3) {
                        scrollTo(i3, 0);
                    }
                    if (Math.abs(getScrollX()) <= this.f4461Ujhhgtgfeyxiexzf) {
                        this.f4465Ujhhgtgfeyxiexzf = false;
                    } else if (!this.f4465Ujhhgtgfeyxiexzf) {
                        InterfaceC1176feyxiexzfUjhhgtg interfaceC1176feyxiexzfUjhhgtg3 = this.f4466Ujhhgtgfeyxiexzf;
                        if (interfaceC1176feyxiexzfUjhhgtg3 != null) {
                            Context context = ((C1177feyxiexzfUjhhgtg) ((C0416Ujhhgtgfeyxiexzf) interfaceC1176feyxiexzfUjhhgtg3).f2243Ujhhgtgfeyxiexzf).getContext();
                            if (Build.VERSION.SDK_INT >= 31) {
                                Object systemService = context.getSystemService(MagicFactory.get(4928228492576818570L, strArr));
                                MagicFactory.get(4928228557001328010L, strArr);
                                defaultVibrator = AbstractC2666Ujhhgtgfeyxiexzf.m3997Ujhhgtgfeyxiexzf(systemService).getDefaultVibrator();
                            } else {
                                Object systemService2 = context.getSystemService(MagicFactory.get(4928227732367607178L, strArr));
                                MagicFactory.get(4928227831151854986L, strArr);
                                defaultVibrator = (Vibrator) systemService2;
                            }
                            defaultVibrator.vibrate(VibrationEffect.createOneShot(40L, -1));
                        }
                        this.f4465Ujhhgtgfeyxiexzf = true;
                    }
                }
                pointF2.set(motionEvent.getRawX(), motionEvent.getRawY());
            } else if (action == 3) {
                fAbs = Math.abs(motionEvent.getRawX() - pointF.x);
                f = this.f4459Ujhhgtgfeyxiexzf;
                if (fAbs <= f) {
                    int i4 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    obj = ((C0416Ujhhgtgfeyxiexzf) interfaceC1176feyxiexzfUjhhgtg2).f2244Ujhhgtgfeyxiexzf;
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928401261931267466L, strArr);
                    if (((View) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2)).m4939Ujhhgtgfeyxiexzf()).getVisibility() == 0) {
                        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
                        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928401360715515274L, strArr);
                        ((View) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4)).m4939Ujhhgtgfeyxiexzf()).performClick();
                        this.f4464Ujhhgtgfeyxiexzf = false;
                        this.f4465Ujhhgtgfeyxiexzf = false;
                        return true;
                    }
                }
                if (Math.abs(getScrollX()) > this.f4461Ujhhgtgfeyxiexzf) {
                    ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt3.addUpdateListener(new C3235feyxiexzfUjhhgtg(4, this));
                    valueAnimatorOfInt3.setDuration(100L);
                    valueAnimatorOfInt3.start();
                    interfaceC1176feyxiexzfUjhhgtg = this.f4466Ujhhgtgfeyxiexzf;
                    if (interfaceC1176feyxiexzfUjhhgtg != null) {
                        c0416Ujhhgtgfeyxiexzf = (C0416Ujhhgtgfeyxiexzf) interfaceC1176feyxiexzfUjhhgtg;
                        int i5 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf).m2021Ujhhgtgfeyxiexzf();
                        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928401300585973130L, strArr);
                        if (((View) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf()).getVisibility() != 0) {
                            C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg2 = new C2065feyxiexzfUjhhgtg(new C2739feyxiexzfUjhhgtg(1, c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf));
                            C2724feyxiexzfUjhhgtg c2724feyxiexzfUjhhgtg2 = C2724feyxiexzfUjhhgtg.f8678Ujhhgtgfeyxiexzf;
                            FrameLayout frameLayout2 = (FrameLayout) c2065feyxiexzfUjhhgtg2.getValue();
                            origin = ((MsgInfoBean) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf).getOrigin();
                            c2724feyxiexzfUjhhgtg2.getClass();
                            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(frameLayout2).m2024Ujhhgtgfeyxiexzf();
                            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Boolean.TYPE);
                            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f10478Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(9);
                            c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1635Ujhhgtgfeyxiexzf());
                            if (c0393Ujhhgtgfeyxiexzf.f2132Ujhhgtgfeyxiexzf.getParameterCount() == 2) {
                                c0393Ujhhgtgfeyxiexzf.m1649Ujhhgtgfeyxiexzf(origin, null);
                            } else {
                                c0393Ujhhgtgfeyxiexzf.m1649Ujhhgtgfeyxiexzf(origin);
                            }
                        }
                    }
                } else {
                    ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt4.addUpdateListener(new C3235feyxiexzfUjhhgtg(4, this));
                    valueAnimatorOfInt4.setDuration(100L);
                    valueAnimatorOfInt4.start();
                }
                this.f4464Ujhhgtgfeyxiexzf = false;
                this.f4465Ujhhgtgfeyxiexzf = false;
            }
        } else {
            if (this.f4464Ujhhgtgfeyxiexzf) {
                return false;
            }
            this.f4464Ujhhgtgfeyxiexzf = true;
            pointF.set(motionEvent.getRawX(), motionEvent.getRawY());
            pointF2.set(motionEvent.getRawX(), motionEvent.getRawY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final InterfaceC1176feyxiexzfUjhhgtg getSmoothListener() {
        return this.f4466Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2 || Math.abs(motionEvent.getRawX() - this.f4462Ujhhgtgfeyxiexzf.x) <= this.f4459Ujhhgtgfeyxiexzf) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        C3447Ujhhgtgfeyxiexzf c3447Ujhhgtgfeyxiexzf = new C3447Ujhhgtgfeyxiexzf(new C3455feyxiexzfUjhhgtg(new C2399Ujhhgtgfeyxiexzf(3, this), new C1127feyxiexzfUjhhgtg(10), 0));
        while (c3447Ujhhgtgfeyxiexzf.hasNext()) {
            View view = (View) c3447Ujhhgtgfeyxiexzf.next();
            view.layout(paddingLeft, getPaddingTop(), view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + getPaddingTop());
            paddingLeft += view.getMeasuredWidth();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        super.onMeasure(i, i2);
        int measuredWidth = 0;
        this.f4460Ujhhgtgfeyxiexzf = 0;
        C3447Ujhhgtgfeyxiexzf c3447Ujhhgtgfeyxiexzf = new C3447Ujhhgtgfeyxiexzf(new C3455feyxiexzfUjhhgtg(new C2399Ujhhgtgfeyxiexzf(3, this), new C1127feyxiexzfUjhhgtg(11), 0));
        int iMax = 0;
        boolean z = false;
        int i3 = 0;
        while (c3447Ujhhgtgfeyxiexzf.hasNext()) {
            Object next = c3447Ujhhgtgfeyxiexzf.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            View view = (View) next;
            setClickable(true);
            measureChild(view, i, i2);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            MagicFactory.get(4928456508095595914L, strArr);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iMax = Math.max(iMax, view.getMeasuredHeight());
            if (View.MeasureSpec.getMode(i2) != 1073741824 && marginLayoutParams.height == -1) {
                z = true;
            }
            if (i3 > 0) {
                this.f4460Ujhhgtgfeyxiexzf = view.getMeasuredWidth() + this.f4460Ujhhgtgfeyxiexzf;
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            i3 = i4;
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + measuredWidth, getPaddingBottom() + getPaddingTop() + iMax);
        this.f4461Ujhhgtgfeyxiexzf = (this.f4460Ujhhgtgfeyxiexzf * 4) / 10;
        if (z) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            C3447Ujhhgtgfeyxiexzf c3447Ujhhgtgfeyxiexzf2 = new C3447Ujhhgtgfeyxiexzf(new C3455feyxiexzfUjhhgtg(new C2399Ujhhgtgfeyxiexzf(3, this), new C1127feyxiexzfUjhhgtg(12), 0));
            while (c3447Ujhhgtgfeyxiexzf2.hasNext()) {
                View view2 = (View) c3447Ujhhgtgfeyxiexzf2.next();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                MagicFactory.get(4928456855987946890L, strArr);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams2.height == -1) {
                    int i5 = marginLayoutParams2.width;
                    marginLayoutParams2.width = view2.getMeasuredWidth();
                    measureChildWithMargins(view2, i, 0, iMakeMeasureSpec, 0);
                    marginLayoutParams2.width = i5;
                }
            }
        }
    }

    public final void setSmoothListener(InterfaceC1176feyxiexzfUjhhgtg interfaceC1176feyxiexzfUjhhgtg) {
        this.f4466Ujhhgtgfeyxiexzf = interfaceC1176feyxiexzfUjhhgtg;
    }
}
