package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.HashMap;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1264 extends AbstractC3436 {

    public static final String[] f4595 = {"android:visibility:visibility", "android:visibility:parent"};

    public final int f4596;

    public C1264(int i) {
        this();
        this.f4596 = i;
    }

    public static void m2951(C3444 c3444) {
        View view = c3444.f10855;
        int visibility = view.getVisibility();
        HashMap map = c3444.f10854;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float m2952(C3444 c3444, float f) {
        Float f2;
        return (c3444 == null || (f2 = (Float) c3444.f10854.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static C3606 m2953(C3444 c3444, C3444 c3445) {
        C3606 c3606 = new C3606();
        c3606.f11261 = false;
        c3606.f11262 = false;
        if (c3444 != null) {
            HashMap map = c3444.f10854;
            if (map.containsKey("android:visibility:visibility")) {
                c3606.f11263 = ((Integer) map.get("android:visibility:visibility")).intValue();
                c3606.f11265 = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c3606.f11263 = -1;
                c3606.f11265 = null;
            }
        } else {
            c3606.f11263 = -1;
            c3606.f11265 = null;
        }
        if (c3445 != null) {
            HashMap map2 = c3445.f10854;
            if (map2.containsKey("android:visibility:visibility")) {
                c3606.f11264 = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c3606.f11266 = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c3606.f11264 = -1;
                c3606.f11266 = null;
            }
        } else {
            c3606.f11264 = -1;
            c3606.f11266 = null;
        }
        if (c3444 != null && c3445 != null) {
            int i = c3606.f11263;
            int i2 = c3606.f11264;
            if (i != i2 || c3606.f11265 != c3606.f11266) {
                if (i != i2) {
                    if (i == 0) {
                        c3606.f11262 = false;
                        c3606.f11261 = true;
                        return c3606;
                    }
                    if (i2 == 0) {
                        c3606.f11262 = true;
                        c3606.f11261 = true;
                        return c3606;
                    }
                } else {
                    if (c3606.f11266 == null) {
                        c3606.f11262 = false;
                        c3606.f11261 = true;
                        return c3606;
                    }
                    if (c3606.f11265 == null) {
                        c3606.f11262 = true;
                        c3606.f11261 = true;
                        return c3606;
                    }
                }
            }
        } else {
            if (c3444 == null && c3606.f11264 == 0) {
                c3606.f11262 = true;
                c3606.f11261 = true;
                return c3606;
            }
            if (c3445 == null && c3606.f11263 == 0) {
                c3606.f11262 = false;
                c3606.f11261 = true;
            }
        }
        return c3606;
    }

    @Override // p000.AbstractC3436
    public final void mo1409(C3444 c3444) {
        m2951(c3444);
    }

    @Override // p000.AbstractC3436
    public final void mo1411(C3444 c3444) {
        m2951(c3444);
        View view = c3444.f10855;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC3595.f11231.mo3226(view)) : Float.valueOf(0.0f);
        }
        c3444.f10854.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0140  */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0214  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (m2953(m4952(r3, false), m4954(r3, false)).f11261 != false) goto L9;
     */
    @Override // p000.AbstractC3436
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo2016(ViewGroup viewGroup, C3444 c3444, C3444 c3445) {
        boolean z;
        View view;
        int i;
        char c;
        int i2;
        View view2;
        Animator animator;
        View view3;
        View view4;
        int id;
        ImageView imageView;
        boolean zIsAttachedToWindow;
        boolean z2;
        ViewGroup viewGroup2;
        int i3;
        int iRound;
        Bitmap bitmapCreateBitmap;
        C3606 c3606M2953 = m2953(c3444, c3445);
        if (c3606M2953.f11261 && (c3606M2953.f11265 != null || c3606M2953.f11266 != null)) {
            boolean z3 = c3606M2953.f11262;
            int i4 = this.f4596;
            int i5 = 1;
            if (!z3) {
                int i6 = c3606M2953.f11264;
                if ((i4 & 2) == 2 && c3444 != null) {
                    View view5 = c3444.f10855;
                    View view6 = c3445 != null ? c3445.f10855 : null;
                    View view7 = (View) view5.getTag(R.id.save_overlay_view);
                    if (view7 != null) {
                        i = i6;
                        c = 1;
                        i2 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view6 == null || view6.getParent() == null) {
                            if (view6 != null) {
                                z = false;
                            }
                            view = null;
                            if (!z) {
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view7 = view6;
                                i5 = 0;
                                view3 = view2;
                            } else if (view5.getParent() == null) {
                                i = i6;
                                c = 1;
                                i5 = 0;
                                i2 = 0;
                                view3 = view;
                                animator = null;
                                view7 = view5;
                            } else {
                                if (view5.getParent() instanceof View) {
                                    view4 = (View) view5.getParent();
                                    animator = null;
                                    i2 = 0;
                                    if (m2953(m4954(view4, true), m4952(view4, true)).f11261) {
                                        i = i6;
                                        c = 1;
                                        view2 = view;
                                        id = view4.getId();
                                        if (view4.getParent() == null && id != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                    } else {
                                        boolean z4 = AbstractC3443.f10853;
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                        C3600 c3600 = AbstractC3595.f11231;
                                        c3600.mo5214(view5, matrix);
                                        c3600.mo5215(viewGroup, matrix);
                                        RectF rectF = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                        matrix.mapRect(rectF);
                                        int iRound2 = Math.round(rectF.left);
                                        int iRound3 = Math.round(rectF.top);
                                        c = 1;
                                        int iRound4 = Math.round(rectF.right);
                                        int iRound5 = Math.round(rectF.bottom);
                                        imageView = new ImageView(view5.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        zIsAttachedToWindow = view5.isAttachedToWindow();
                                        if (viewGroup == null && viewGroup.isAttachedToWindow()) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (zIsAttachedToWindow) {
                                            viewGroup2 = null;
                                            i3 = 0;
                                        } else {
                                            if (z2) {
                                                viewGroup2 = (ViewGroup) view5.getParent();
                                                int iIndexOfChild = viewGroup2.indexOfChild(view5);
                                                viewGroup.getOverlay().add(view5);
                                                i3 = iIndexOfChild;
                                            } else {
                                                i = i6;
                                                view2 = view;
                                                bitmapCreateBitmap = null;
                                            }
                                            if (bitmapCreateBitmap != null) {
                                                imageView.setImageBitmap(bitmapCreateBitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                            imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                            view7 = imageView;
                                        }
                                        view2 = view;
                                        iRound = Math.round(rectF.width());
                                        i = i6;
                                        int iRound6 = Math.round(rectF.height());
                                        if (iRound > 0 || iRound6 <= 0) {
                                            bitmapCreateBitmap = null;
                                        } else {
                                            float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound6));
                                            int iRound7 = Math.round(iRound * fMin);
                                            int iRound8 = Math.round(iRound6 * fMin);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(fMin, fMin);
                                            if (AbstractC3443.f10853) {
                                                Picture picture = new Picture();
                                                Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                                canvasBeginRecording.concat(matrix);
                                                view5.draw(canvasBeginRecording);
                                                picture.endRecording();
                                                bitmapCreateBitmap = AbstractC3442.m4960(picture);
                                            } else {
                                                bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                                canvas.concat(matrix);
                                                view5.draw(canvas);
                                            }
                                        }
                                        if (!zIsAttachedToWindow) {
                                            viewGroup.getOverlay().remove(view5);
                                            viewGroup2.addView(view5, i3);
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                        imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                        view7 = imageView;
                                    }
                                    i5 = 0;
                                    view3 = view2;
                                } else {
                                    i = i6;
                                    c = 1;
                                    i2 = 0;
                                    view2 = view;
                                    animator = null;
                                }
                                view7 = view6;
                                i5 = 0;
                                view3 = view2;
                            }
                        } else {
                            if (i6 == 4 || view5 == view6) {
                                z = false;
                                view = view6;
                                view6 = null;
                            }
                            if (!z) {
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view7 = view6;
                                i5 = 0;
                                view3 = view2;
                            } else if (view5.getParent() == null) {
                                i = i6;
                                c = 1;
                                i5 = 0;
                                i2 = 0;
                                view3 = view;
                                animator = null;
                                view7 = view5;
                            } else {
                                if (view5.getParent() instanceof View) {
                                    view4 = (View) view5.getParent();
                                    animator = null;
                                    i2 = 0;
                                    if (m2953(m4954(view4, true), m4952(view4, true)).f11261) {
                                        boolean z5 = AbstractC3443.f10853;
                                        Matrix matrix2 = new Matrix();
                                        matrix2.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                        C3600 c3601 = AbstractC3595.f11231;
                                        c3601.mo5214(view5, matrix2);
                                        c3601.mo5215(viewGroup, matrix2);
                                        RectF rectF2 = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                        matrix2.mapRect(rectF2);
                                        int iRound9 = Math.round(rectF2.left);
                                        int iRound10 = Math.round(rectF2.top);
                                        c = 1;
                                        int iRound11 = Math.round(rectF2.right);
                                        int iRound12 = Math.round(rectF2.bottom);
                                        imageView = new ImageView(view5.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        zIsAttachedToWindow = view5.isAttachedToWindow();
                                        if (viewGroup == null) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        if (zIsAttachedToWindow) {
                                            if (false) {
                                                i = i6;
                                                view2 = view;
                                                bitmapCreateBitmap = null;
                                            } else {
                                                viewGroup2 = (ViewGroup) view5.getParent();
                                                int iIndexOfChild2 = viewGroup2.indexOfChild(view5);
                                                viewGroup.getOverlay().add(view5);
                                                i3 = iIndexOfChild2;
                                            }
                                            if (bitmapCreateBitmap != null) {
                                                imageView.setImageBitmap(bitmapCreateBitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound11 - iRound9, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound12 - iRound10, 1073741824));
                                            imageView.layout(iRound9, iRound10, iRound11, iRound12);
                                            view7 = imageView;
                                        } else {
                                            viewGroup2 = null;
                                            i3 = 0;
                                        }
                                        view2 = view;
                                        iRound = Math.round(rectF2.width());
                                        i = i6;
                                        int iRound13 = Math.round(rectF2.height());
                                        if (iRound > 0) {
                                            bitmapCreateBitmap = null;
                                        } else {
                                            bitmapCreateBitmap = null;
                                        }
                                        if (!zIsAttachedToWindow) {
                                            viewGroup.getOverlay().remove(view5);
                                            viewGroup2.addView(view5, 0);
                                        }
                                        if (false) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound11 - iRound9, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound12 - iRound10, 1073741824));
                                        imageView.layout(iRound9, iRound10, iRound11, iRound12);
                                        view7 = imageView;
                                    } else {
                                        i = i6;
                                        c = 1;
                                        view2 = view;
                                        id = view4.getId();
                                        if (view4.getParent() == null) {
                                            viewGroup.findViewById(id);
                                        }
                                    }
                                    i5 = 0;
                                    view3 = view2;
                                } else {
                                    i = i6;
                                    c = 1;
                                    i2 = 0;
                                    view2 = view;
                                    animator = null;
                                }
                                view7 = view6;
                                i5 = 0;
                                view3 = view2;
                            }
                        }
                        z = true;
                        view6 = null;
                        view = null;
                        if (false) {
                            i = i6;
                            c = 1;
                            i2 = 0;
                            view2 = view;
                            animator = null;
                            view7 = view6;
                            i5 = i2;
                            view3 = view2;
                        } else if (view5.getParent() == null) {
                            i = i6;
                            c = 1;
                            i5 = 0;
                            i2 = 0;
                            view3 = view;
                            animator = null;
                            view7 = view5;
                        } else {
                            if (view5.getParent() instanceof View) {
                                view4 = (View) view5.getParent();
                                animator = null;
                                i2 = 0;
                                if (m2953(m4954(view4, true), m4952(view4, true)).f11261) {
                                    boolean z6 = AbstractC3443.f10853;
                                    Matrix matrix3 = new Matrix();
                                    matrix3.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                    C3600 c3602 = AbstractC3595.f11231;
                                    c3602.mo5214(view5, matrix3);
                                    c3602.mo5215(viewGroup, matrix3);
                                    RectF rectF3 = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                    matrix3.mapRect(rectF3);
                                    int iRound14 = Math.round(rectF3.left);
                                    int iRound15 = Math.round(rectF3.top);
                                    c = 1;
                                    int iRound16 = Math.round(rectF3.right);
                                    int iRound17 = Math.round(rectF3.bottom);
                                    imageView = new ImageView(view5.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    zIsAttachedToWindow = view5.isAttachedToWindow();
                                    if (viewGroup == null) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    if (zIsAttachedToWindow) {
                                        if (false) {
                                            i = i6;
                                            view2 = view;
                                            bitmapCreateBitmap = null;
                                        } else {
                                            viewGroup2 = (ViewGroup) view5.getParent();
                                            int iIndexOfChild3 = viewGroup2.indexOfChild(view5);
                                            viewGroup.getOverlay().add(view5);
                                            i3 = iIndexOfChild3;
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound16 - iRound14, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound17 - iRound15, 1073741824));
                                        imageView.layout(iRound14, iRound15, iRound16, iRound17);
                                        view7 = imageView;
                                    } else {
                                        viewGroup2 = null;
                                        i3 = 0;
                                    }
                                    view2 = view;
                                    iRound = Math.round(rectF3.width());
                                    i = i6;
                                    int iRound18 = Math.round(rectF3.height());
                                    if (iRound > 0) {
                                        bitmapCreateBitmap = null;
                                    } else {
                                        bitmapCreateBitmap = null;
                                    }
                                    if (!zIsAttachedToWindow) {
                                        viewGroup.getOverlay().remove(view5);
                                        viewGroup2.addView(view5, 0);
                                    }
                                    if (false) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound16 - iRound14, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound17 - iRound15, 1073741824));
                                    imageView.layout(iRound14, iRound15, iRound16, iRound17);
                                    view7 = imageView;
                                } else {
                                    i = i6;
                                    c = 1;
                                    view2 = view;
                                    id = view4.getId();
                                    if (view4.getParent() == null) {
                                        viewGroup.findViewById(id);
                                    }
                                }
                                i5 = 0;
                                view3 = view2;
                            } else {
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                            }
                            view7 = view6;
                            i5 = 0;
                            view3 = view2;
                        }
                    }
                    if (view7 == null) {
                        if (true) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        AbstractC3595.m5205(view3, i2);
                        C3600 c3603 = AbstractC3595.f11231;
                        
                        ObjectAnimator objectAnimatorM2955 = m2955(view3, m2952(c3444, 1.0f), 0.0f);
                        if (objectAnimatorM2955 == null) {
                            c3603.mo3227(view3, m2952(c3445, 1.0f));
                        }
                        if (objectAnimatorM2955 == null) {
                            AbstractC3595.m5205(view3, visibility);
                            return objectAnimatorM2955;
                        }
                        C3604 c3604 = new C3604(view3, i);
                        objectAnimatorM2955.addListener(c3604);
                        m4953().m4947(c3604);
                        return objectAnimatorM2955;
                    }
                    if (i5 == 0) {
                        int[] iArr = (int[]) c3444.f10854.get("android:visibility:screenLocation");
                        int i7 = iArr[0];
                        int i8 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view7.offsetLeftAndRight((i7 - iArr2[0]) - view7.getLeft());
                        view7.offsetTopAndBottom((i8 - iArr2[1]) - view7.getTop());
                        viewGroup.getOverlay().add(view7);
                    }
                    C3600 c3605 = AbstractC3595.f11231;
                    
                    ObjectAnimator objectAnimatorM2956 = m2955(view7, m2952(c3444, 1.0f), 0.0f);
                    if (objectAnimatorM2956 == null) {
                        c3605.mo3227(view7, m2952(c3445, 1.0f));
                    }
                    if (i5 == 0) {
                        if (objectAnimatorM2956 == null) {
                            viewGroup.getOverlay().remove(view7);
                            return objectAnimatorM2956;
                        }
                        view5.setTag(R.id.save_overlay_view, view7);
                        C3605 c3606 = new C3605(this, viewGroup, view7, view5);
                        objectAnimatorM2956.addListener(c3606);
                        objectAnimatorM2956.addPauseListener(c3606);
                        m4953().m4947(c3606);
                    }
                    return objectAnimatorM2956;
                }
            } else if ((i4 & 1) == 1 && c3445 != null) {
                View view8 = c3445.f10855;
                if (c3444 == null) {
                    View view9 = (View) view8.getParent();
                }
                
                return m2955(view8, m2952(c3444, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // p000.AbstractC3436
    public final String[] mo2017() {
        return f4595;
    }

    @Override // p000.AbstractC3436
    public final boolean mo2954(C3444 c3444, C3444 c3445) {
        if (c3444 == null && c3445 == null) {
            return false;
        }
        if (c3444 != null && c3445 != null && c3445.f10854.containsKey("android:visibility:visibility") != c3444.f10854.containsKey("android:visibility:visibility")) {
            return false;
        }
        C3606 c3606M2953 = m2953(c3444, c3445);
        if (c3606M2953.f11261) {
            return c3606M2953.f11263 == 0 || c3606M2953.f11264 == 0;
        }
        return false;
    }

    public final ObjectAnimator m2955(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC3595.f11231.mo3227(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC3595.f11232, f2);
        C1263 c1263 = new C1263(view);
        objectAnimatorOfFloat.addListener(c1263);
        m4953().m4947(c1263);
        return objectAnimatorOfFloat;
    }

    public C1264() {
        this.f4596 = 3;
    }
}
