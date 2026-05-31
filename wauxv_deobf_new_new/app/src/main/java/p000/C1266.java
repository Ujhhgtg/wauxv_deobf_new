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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲁᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1266 extends AbstractC3493 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static final String[] f4594 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final int f4595;

    public C1266(int i) {
        this();
        this.f4595 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static void m3070(C3501 c3501) {
        View view = c3501.f11015;
        int visibility = view.getVisibility();
        HashMap map = c3501.f11014;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static float m3071(C3501 c3501, float f) {
        Float f2;
        return (c3501 == null || (f2 = (Float) c3501.f11014.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static C3666 m3072(C3501 c3501, C3501 c3502) {
        C3666 c3666 = new C3666();
        c3666.f11410 = false;
        c3666.f11411 = false;
        if (c3501 != null) {
            HashMap map = c3501.f11014;
            if (map.containsKey("android:visibility:visibility")) {
                c3666.f11412 = ((Integer) map.get("android:visibility:visibility")).intValue();
                c3666.f11414 = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c3666.f11412 = -1;
                c3666.f11414 = null;
            }
        } else {
            c3666.f11412 = -1;
            c3666.f11414 = null;
        }
        if (c3502 != null) {
            HashMap map2 = c3502.f11014;
            if (map2.containsKey("android:visibility:visibility")) {
                c3666.f11413 = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c3666.f11415 = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c3666.f11413 = -1;
                c3666.f11415 = null;
            }
        } else {
            c3666.f11413 = -1;
            c3666.f11415 = null;
        }
        if (c3501 != null && c3502 != null) {
            int i = c3666.f11412;
            int i2 = c3666.f11413;
            if (i != i2 || c3666.f11414 != c3666.f11415) {
                if (i != i2) {
                    if (i == 0) {
                        c3666.f11411 = false;
                        c3666.f11410 = true;
                        return c3666;
                    }
                    if (i2 == 0) {
                        c3666.f11411 = true;
                        c3666.f11410 = true;
                        return c3666;
                    }
                } else {
                    if (c3666.f11415 == null) {
                        c3666.f11411 = false;
                        c3666.f11410 = true;
                        return c3666;
                    }
                    if (c3666.f11414 == null) {
                        c3666.f11411 = true;
                        c3666.f11410 = true;
                        return c3666;
                    }
                }
            }
        } else {
            if (c3501 == null && c3666.f11413 == 0) {
                c3666.f11411 = true;
                c3666.f11410 = true;
                return c3666;
            }
            if (c3502 == null && c3666.f11412 == 0) {
                c3666.f11411 = false;
                c3666.f11410 = true;
            }
        }
        return c3666;
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1555(C3501 c3501) {
        m3070(c3501);
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo1557(C3501 c3501) {
        m3070(c3501);
        View view = c3501.f11015;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC3655.f11380.mo3495(view)) : Float.valueOf(0.0f);
        }
        c3501.f11014.put("android:fade:transitionAlpha", fValueOf);
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
    
        if (m3072(m5014(r3, false), m5016(r3, false)).f11410 != false) goto L9;
     */
    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo2113(ViewGroup viewGroup, C3501 c3501, C3501 c3502) {
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
        C3666 c3666M3072 = m3072(c3501, c3502);
        if (c3666M3072.f11410 && (c3666M3072.f11414 != null || c3666M3072.f11415 != null)) {
            boolean z3 = c3666M3072.f11411;
            int i4 = this.f4595;
            int i5 = 1;
            if (!z3) {
                int i6 = c3666M3072.f11413;
                if ((i4 & 2) == 2 && c3501 != null) {
                    View view5 = c3501.f11015;
                    View view6 = c3502 != null ? c3502.f11015 : null;
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
                                    if (m3072(m5016(view4, true), m5014(view4, true)).f11410) {
                                        i = i6;
                                        c = 1;
                                        view2 = view;
                                        id = view4.getId();
                                        if (view4.getParent() == null && id != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                    } else {
                                        boolean z4 = AbstractC3500.f11013;
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                        C3660 c3660 = AbstractC3655.f11380;
                                        c3660.mo5220(view5, matrix);
                                        c3660.mo5221(viewGroup, matrix);
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
                                            if (AbstractC3500.f11013) {
                                                Picture picture = new Picture();
                                                Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                                canvasBeginRecording.concat(matrix);
                                                view5.draw(canvasBeginRecording);
                                                picture.endRecording();
                                                bitmapCreateBitmap = AbstractC3499.m5022(picture);
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
                                    i5 = i2;
                                    view3 = view2;
                                } else {
                                    i = i6;
                                    c = 1;
                                    i2 = 0;
                                    view2 = view;
                                    animator = null;
                                }
                                view7 = view6;
                                i5 = i2;
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
                                    if (m3072(m5016(view4, true), m5014(view4, true)).f11410) {
                                        boolean z5 = AbstractC3500.f11013;
                                        Matrix matrix2 = new Matrix();
                                        matrix2.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                        C3660 c3661 = AbstractC3655.f11380;
                                        c3661.mo5220(view5, matrix2);
                                        c3661.mo5221(viewGroup, matrix2);
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
                                            if (z2) {
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
                                            viewGroup2.addView(view5, i3);
                                        }
                                        if (bitmapCreateBitmap != null) {
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
                                    i5 = i2;
                                    view3 = view2;
                                } else {
                                    i = i6;
                                    c = 1;
                                    i2 = 0;
                                    view2 = view;
                                    animator = null;
                                }
                                view7 = view6;
                                i5 = i2;
                                view3 = view2;
                            }
                        }
                        z = true;
                        view6 = null;
                        view = null;
                        if (!z) {
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
                                if (m3072(m5016(view4, true), m5014(view4, true)).f11410) {
                                    boolean z6 = AbstractC3500.f11013;
                                    Matrix matrix3 = new Matrix();
                                    matrix3.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                    C3660 c3662 = AbstractC3655.f11380;
                                    c3662.mo5220(view5, matrix3);
                                    c3662.mo5221(viewGroup, matrix3);
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
                                        if (z2) {
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
                                        viewGroup2.addView(view5, i3);
                                    }
                                    if (bitmapCreateBitmap != null) {
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
                                i5 = i2;
                                view3 = view2;
                            } else {
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                            }
                            view7 = view6;
                            i5 = i2;
                            view3 = view2;
                        }
                    }
                    if (view7 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        AbstractC3655.m5211(view3, i2);
                        C3660 c3663 = AbstractC3655.f11380;
                        c3663.getClass();
                        ObjectAnimator objectAnimatorM3074 = m3074(view3, m3071(c3501, 1.0f), 0.0f);
                        if (objectAnimatorM3074 == null) {
                            c3663.mo3496(view3, m3071(c3502, 1.0f));
                        }
                        if (objectAnimatorM3074 == null) {
                            AbstractC3655.m5211(view3, visibility);
                            return objectAnimatorM3074;
                        }
                        C3664 c3664 = new C3664(view3, i);
                        objectAnimatorM3074.addListener(c3664);
                        m5015().m5009(c3664);
                        return objectAnimatorM3074;
                    }
                    if (i5 == 0) {
                        int[] iArr = (int[]) c3501.f11014.get("android:visibility:screenLocation");
                        int i7 = iArr[i2];
                        int i8 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view7.offsetLeftAndRight((i7 - iArr2[i2]) - view7.getLeft());
                        view7.offsetTopAndBottom((i8 - iArr2[c]) - view7.getTop());
                        viewGroup.getOverlay().add(view7);
                    }
                    C3660 c3665 = AbstractC3655.f11380;
                    c3665.getClass();
                    ObjectAnimator objectAnimatorM3075 = m3074(view7, m3071(c3501, 1.0f), 0.0f);
                    if (objectAnimatorM3075 == null) {
                        c3665.mo3496(view7, m3071(c3502, 1.0f));
                    }
                    if (i5 == 0) {
                        if (objectAnimatorM3075 == null) {
                            viewGroup.getOverlay().remove(view7);
                            return objectAnimatorM3075;
                        }
                        view5.setTag(R.id.save_overlay_view, view7);
                        C3665 c3666 = new C3665(this, viewGroup, view7, view5);
                        objectAnimatorM3075.addListener(c3666);
                        objectAnimatorM3075.addPauseListener(c3666);
                        m5015().m5009(c3666);
                    }
                    return objectAnimatorM3075;
                }
            } else if ((i4 & 1) == 1 && c3502 != null) {
                View view8 = c3502.f11015;
                if (c3501 == null) {
                    View view9 = (View) view8.getParent();
                }
                AbstractC3655.f11380.getClass();
                return m3074(view8, m3071(c3501, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final String[] mo2114() {
        return f4594;
    }

    @Override // p000.AbstractC3493
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final boolean mo3073(C3501 c3501, C3501 c3502) {
        if (c3501 == null && c3502 == null) {
            return false;
        }
        if (c3501 != null && c3502 != null && c3502.f11014.containsKey("android:visibility:visibility") != c3501.f11014.containsKey("android:visibility:visibility")) {
            return false;
        }
        C3666 c3666M3072 = m3072(c3501, c3502);
        if (c3666M3072.f11410) {
            return c3666M3072.f11412 == 0 || c3666M3072.f11413 == 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final ObjectAnimator m3074(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC3655.f11380.mo3496(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC3655.f11381, f2);
        C1265 c1265 = new C1265(view);
        objectAnimatorOfFloat.addListener(c1265);
        m5015().m5009(c1265);
        return objectAnimatorOfFloat;
    }

    public C1266() {
        this.f4595 = 3;
    }
}
