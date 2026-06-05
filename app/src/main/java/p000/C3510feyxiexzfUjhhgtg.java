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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3510feyxiexzfUjhhgtg extends AbstractC1747feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static final String[] f10923feyxiexzfUjhhgtg = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public final int f10924feyxiexzfUjhhgtg;

    public C3510feyxiexzfUjhhgtg(int i) {
        this();
        this.f10924feyxiexzfUjhhgtg = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public static void m5026feyxiexzfUjhhgtg(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg) {
        View view = c1787feyxiexzfUjhhgtg.f6029Ujhhgtgfeyxiexzf;
        int visibility = view.getVisibility();
        HashMap map = c1787feyxiexzfUjhhgtg.f6028Ujhhgtgfeyxiexzf;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static float m5027feyxiexzfUjhhgtg(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg, float f) {
        Float f2;
        return (c1787feyxiexzfUjhhgtg == null || (f2 = (Float) c1787feyxiexzfUjhhgtg.f6028Ujhhgtgfeyxiexzf.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static C2220Ujhhgtgfeyxiexzf m5028feyxiexzfUjhhgtg(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg, C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg2) {
        C2220Ujhhgtgfeyxiexzf c2220Ujhhgtgfeyxiexzf = new C2220Ujhhgtgfeyxiexzf();
        c2220Ujhhgtgfeyxiexzf.f7205Ujhhgtgfeyxiexzf = false;
        c2220Ujhhgtgfeyxiexzf.f7206Ujhhgtgfeyxiexzf = false;
        if (c1787feyxiexzfUjhhgtg != null) {
            HashMap map = c1787feyxiexzfUjhhgtg.f6028Ujhhgtgfeyxiexzf;
            if (map.containsKey("android:visibility:visibility")) {
                c2220Ujhhgtgfeyxiexzf.f7207Ujhhgtgfeyxiexzf = ((Integer) map.get("android:visibility:visibility")).intValue();
                c2220Ujhhgtgfeyxiexzf.f7209Ujhhgtgfeyxiexzf = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c2220Ujhhgtgfeyxiexzf.f7207Ujhhgtgfeyxiexzf = -1;
                c2220Ujhhgtgfeyxiexzf.f7209Ujhhgtgfeyxiexzf = null;
            }
        } else {
            c2220Ujhhgtgfeyxiexzf.f7207Ujhhgtgfeyxiexzf = -1;
            c2220Ujhhgtgfeyxiexzf.f7209Ujhhgtgfeyxiexzf = null;
        }
        if (c1787feyxiexzfUjhhgtg2 != null) {
            HashMap map2 = c1787feyxiexzfUjhhgtg2.f6028Ujhhgtgfeyxiexzf;
            if (map2.containsKey("android:visibility:visibility")) {
                c2220Ujhhgtgfeyxiexzf.f7208Ujhhgtgfeyxiexzf = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c2220Ujhhgtgfeyxiexzf.f7210Ujhhgtgfeyxiexzf = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c2220Ujhhgtgfeyxiexzf.f7208Ujhhgtgfeyxiexzf = -1;
                c2220Ujhhgtgfeyxiexzf.f7210Ujhhgtgfeyxiexzf = null;
            }
        } else {
            c2220Ujhhgtgfeyxiexzf.f7208Ujhhgtgfeyxiexzf = -1;
            c2220Ujhhgtgfeyxiexzf.f7210Ujhhgtgfeyxiexzf = null;
        }
        if (c1787feyxiexzfUjhhgtg != null && c1787feyxiexzfUjhhgtg2 != null) {
            int i = c2220Ujhhgtgfeyxiexzf.f7207Ujhhgtgfeyxiexzf;
            int i2 = c2220Ujhhgtgfeyxiexzf.f7208Ujhhgtgfeyxiexzf;
            if (i != i2 || c2220Ujhhgtgfeyxiexzf.f7209Ujhhgtgfeyxiexzf != c2220Ujhhgtgfeyxiexzf.f7210Ujhhgtgfeyxiexzf) {
                if (i != i2) {
                    if (i == 0) {
                        c2220Ujhhgtgfeyxiexzf.f7206Ujhhgtgfeyxiexzf = false;
                        c2220Ujhhgtgfeyxiexzf.f7205Ujhhgtgfeyxiexzf = true;
                        return c2220Ujhhgtgfeyxiexzf;
                    }
                    if (i2 == 0) {
                        c2220Ujhhgtgfeyxiexzf.f7206Ujhhgtgfeyxiexzf = true;
                        c2220Ujhhgtgfeyxiexzf.f7205Ujhhgtgfeyxiexzf = true;
                        return c2220Ujhhgtgfeyxiexzf;
                    }
                } else {
                    if (c2220Ujhhgtgfeyxiexzf.f7210Ujhhgtgfeyxiexzf == null) {
                        c2220Ujhhgtgfeyxiexzf.f7206Ujhhgtgfeyxiexzf = false;
                        c2220Ujhhgtgfeyxiexzf.f7205Ujhhgtgfeyxiexzf = true;
                        return c2220Ujhhgtgfeyxiexzf;
                    }
                    if (c2220Ujhhgtgfeyxiexzf.f7209Ujhhgtgfeyxiexzf == null) {
                        c2220Ujhhgtgfeyxiexzf.f7206Ujhhgtgfeyxiexzf = true;
                        c2220Ujhhgtgfeyxiexzf.f7205Ujhhgtgfeyxiexzf = true;
                        return c2220Ujhhgtgfeyxiexzf;
                    }
                }
            }
        } else {
            if (c1787feyxiexzfUjhhgtg == null && c2220Ujhhgtgfeyxiexzf.f7208Ujhhgtgfeyxiexzf == 0) {
                c2220Ujhhgtgfeyxiexzf.f7206Ujhhgtgfeyxiexzf = true;
                c2220Ujhhgtgfeyxiexzf.f7205Ujhhgtgfeyxiexzf = true;
                return c2220Ujhhgtgfeyxiexzf;
            }
            if (c1787feyxiexzfUjhhgtg2 == null && c2220Ujhhgtgfeyxiexzf.f7207Ujhhgtgfeyxiexzf == 0) {
                c2220Ujhhgtgfeyxiexzf.f7206Ujhhgtgfeyxiexzf = false;
                c2220Ujhhgtgfeyxiexzf.f7205Ujhhgtgfeyxiexzf = true;
            }
        }
        return c2220Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo3015Ujhhgtgfeyxiexzf(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg) {
        m5026feyxiexzfUjhhgtg(c1787feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo3018Ujhhgtgfeyxiexzf(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg) {
        m5026feyxiexzfUjhhgtg(c1787feyxiexzfUjhhgtg);
        View view = c1787feyxiexzfUjhhgtg.f6029Ujhhgtgfeyxiexzf;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf.mo3523Ujhhgtgfeyxiexzf(view)) : Float.valueOf(0.0f);
        }
        c1787feyxiexzfUjhhgtg.f6028Ujhhgtgfeyxiexzf.put("android:fade:transitionAlpha", fValueOf);
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
    
        if (m5028feyxiexzfUjhhgtg(m3025Ujhhgtgfeyxiexzf(r3, false), m3028Ujhhgtgfeyxiexzf(r3, false)).f7205Ujhhgtgfeyxiexzf != false) goto L9;
     */
    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo3022Ujhhgtgfeyxiexzf(ViewGroup viewGroup, C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg, C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg2) {
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
        C2220Ujhhgtgfeyxiexzf c2220UjhhgtgfeyxiexzfM5028feyxiexzfUjhhgtg = m5028feyxiexzfUjhhgtg(c1787feyxiexzfUjhhgtg, c1787feyxiexzfUjhhgtg2);
        if (c2220UjhhgtgfeyxiexzfM5028feyxiexzfUjhhgtg.f7205Ujhhgtgfeyxiexzf && (c2220UjhhgtgfeyxiexzfM5028feyxiexzfUjhhgtg.f7209Ujhhgtgfeyxiexzf != null || c2220UjhhgtgfeyxiexzfM5028feyxiexzfUjhhgtg.f7210Ujhhgtgfeyxiexzf != null)) {
            boolean z3 = c2220UjhhgtgfeyxiexzfM5028feyxiexzfUjhhgtg.f7206Ujhhgtgfeyxiexzf;
            int i4 = this.f10924feyxiexzfUjhhgtg;
            int i5 = 1;
            if (!z3) {
                int i6 = c2220UjhhgtgfeyxiexzfM5028feyxiexzfUjhhgtg.f7208Ujhhgtgfeyxiexzf;
                if ((i4 & 2) == 2 && c1787feyxiexzfUjhhgtg != null) {
                    View view5 = c1787feyxiexzfUjhhgtg.f6029Ujhhgtgfeyxiexzf;
                    View view6 = c1787feyxiexzfUjhhgtg2 != null ? c1787feyxiexzfUjhhgtg2.f6029Ujhhgtgfeyxiexzf : null;
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
                                    if (m5028feyxiexzfUjhhgtg(m3028Ujhhgtgfeyxiexzf(view4, true), m3025Ujhhgtgfeyxiexzf(view4, true)).f7205Ujhhgtgfeyxiexzf) {
                                        i = i6;
                                        c = 1;
                                        view2 = view;
                                        id = view4.getId();
                                        if (view4.getParent() == null && id != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                    } else {
                                        boolean z4 = AbstractC1786Ujhhgtgfeyxiexzf.f6027Ujhhgtgfeyxiexzf;
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                        C2311Ujhhgtgfeyxiexzf c2311Ujhhgtgfeyxiexzf = AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf;
                                        c2311Ujhhgtgfeyxiexzf.mo3521feyxiexzfUjhhgtg(view5, matrix);
                                        c2311Ujhhgtgfeyxiexzf.mo3522feyxiexzfUjhhgtg(viewGroup, matrix);
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
                                            if (AbstractC1786Ujhhgtgfeyxiexzf.f6027Ujhhgtgfeyxiexzf) {
                                                Picture picture = new Picture();
                                                Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                                canvasBeginRecording.concat(matrix);
                                                view5.draw(canvasBeginRecording);
                                                picture.endRecording();
                                                bitmapCreateBitmap = AbstractC1753feyxiexzfUjhhgtg.m3049Ujhhgtgfeyxiexzf(picture);
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
                                    if (m5028feyxiexzfUjhhgtg(m3028Ujhhgtgfeyxiexzf(view4, true), m3025Ujhhgtgfeyxiexzf(view4, true)).f7205Ujhhgtgfeyxiexzf) {
                                        boolean z5 = AbstractC1786Ujhhgtgfeyxiexzf.f6027Ujhhgtgfeyxiexzf;
                                        Matrix matrix2 = new Matrix();
                                        matrix2.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                        C2311Ujhhgtgfeyxiexzf c2311Ujhhgtgfeyxiexzf2 = AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf;
                                        c2311Ujhhgtgfeyxiexzf2.mo3521feyxiexzfUjhhgtg(view5, matrix2);
                                        c2311Ujhhgtgfeyxiexzf2.mo3522feyxiexzfUjhhgtg(viewGroup, matrix2);
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
                                if (m5028feyxiexzfUjhhgtg(m3028Ujhhgtgfeyxiexzf(view4, true), m3025Ujhhgtgfeyxiexzf(view4, true)).f7205Ujhhgtgfeyxiexzf) {
                                    boolean z6 = AbstractC1786Ujhhgtgfeyxiexzf.f6027Ujhhgtgfeyxiexzf;
                                    Matrix matrix3 = new Matrix();
                                    matrix3.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                    C2311Ujhhgtgfeyxiexzf c2311Ujhhgtgfeyxiexzf3 = AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf;
                                    c2311Ujhhgtgfeyxiexzf3.mo3521feyxiexzfUjhhgtg(view5, matrix3);
                                    c2311Ujhhgtgfeyxiexzf3.mo3522feyxiexzfUjhhgtg(viewGroup, matrix3);
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
                        AbstractC2306Ujhhgtgfeyxiexzf.m3511Ujhhgtgfeyxiexzf(view3, i2);
                        C2311Ujhhgtgfeyxiexzf c2311Ujhhgtgfeyxiexzf4 = AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf;
                        c2311Ujhhgtgfeyxiexzf4.getClass();
                        ObjectAnimator objectAnimatorM5029feyxiexzfUjhhgtg = m5029feyxiexzfUjhhgtg(view3, m5027feyxiexzfUjhhgtg(c1787feyxiexzfUjhhgtg, 1.0f), 0.0f);
                        if (objectAnimatorM5029feyxiexzfUjhhgtg == null) {
                            c2311Ujhhgtgfeyxiexzf4.mo3524Ujhhgtgfeyxiexzf(view3, m5027feyxiexzfUjhhgtg(c1787feyxiexzfUjhhgtg2, 1.0f));
                        }
                        if (objectAnimatorM5029feyxiexzfUjhhgtg == null) {
                            AbstractC2306Ujhhgtgfeyxiexzf.m3511Ujhhgtgfeyxiexzf(view3, visibility);
                            return objectAnimatorM5029feyxiexzfUjhhgtg;
                        }
                        C2315Ujhhgtgfeyxiexzf c2315Ujhhgtgfeyxiexzf = new C2315Ujhhgtgfeyxiexzf(view3, i);
                        objectAnimatorM5029feyxiexzfUjhhgtg.addListener(c2315Ujhhgtgfeyxiexzf);
                        m3026Ujhhgtgfeyxiexzf().m3014Ujhhgtgfeyxiexzf(c2315Ujhhgtgfeyxiexzf);
                        return objectAnimatorM5029feyxiexzfUjhhgtg;
                    }
                    if (i5 == 0) {
                        int[] iArr = (int[]) c1787feyxiexzfUjhhgtg.f6028Ujhhgtgfeyxiexzf.get("android:visibility:screenLocation");
                        int i7 = iArr[i2];
                        int i8 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view7.offsetLeftAndRight((i7 - iArr2[i2]) - view7.getLeft());
                        view7.offsetTopAndBottom((i8 - iArr2[c]) - view7.getTop());
                        viewGroup.getOverlay().add(view7);
                    }
                    C2311Ujhhgtgfeyxiexzf c2311Ujhhgtgfeyxiexzf5 = AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf;
                    c2311Ujhhgtgfeyxiexzf5.getClass();
                    ObjectAnimator objectAnimatorM5029feyxiexzfUjhhgtg2 = m5029feyxiexzfUjhhgtg(view7, m5027feyxiexzfUjhhgtg(c1787feyxiexzfUjhhgtg, 1.0f), 0.0f);
                    if (objectAnimatorM5029feyxiexzfUjhhgtg2 == null) {
                        c2311Ujhhgtgfeyxiexzf5.mo3524Ujhhgtgfeyxiexzf(view7, m5027feyxiexzfUjhhgtg(c1787feyxiexzfUjhhgtg2, 1.0f));
                    }
                    if (i5 == 0) {
                        if (objectAnimatorM5029feyxiexzfUjhhgtg2 == null) {
                            viewGroup.getOverlay().remove(view7);
                            return objectAnimatorM5029feyxiexzfUjhhgtg2;
                        }
                        view5.setTag(R.id.save_overlay_view, view7);
                        C2316feyxiexzfUjhhgtg c2316feyxiexzfUjhhgtg = new C2316feyxiexzfUjhhgtg(this, viewGroup, view7, view5);
                        objectAnimatorM5029feyxiexzfUjhhgtg2.addListener(c2316feyxiexzfUjhhgtg);
                        objectAnimatorM5029feyxiexzfUjhhgtg2.addPauseListener(c2316feyxiexzfUjhhgtg);
                        m3026Ujhhgtgfeyxiexzf().m3014Ujhhgtgfeyxiexzf(c2316feyxiexzfUjhhgtg);
                    }
                    return objectAnimatorM5029feyxiexzfUjhhgtg2;
                }
            } else if ((i4 & 1) == 1 && c1787feyxiexzfUjhhgtg2 != null) {
                View view8 = c1787feyxiexzfUjhhgtg2.f6029Ujhhgtgfeyxiexzf;
                if (c1787feyxiexzfUjhhgtg == null) {
                    View view9 = (View) view8.getParent();
                }
                AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf.getClass();
                return m5029feyxiexzfUjhhgtg(view8, m5027feyxiexzfUjhhgtg(c1787feyxiexzfUjhhgtg, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final String[] mo3027Ujhhgtgfeyxiexzf() {
        return f10923feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC1747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public final boolean mo3030Ujhhgtgfeyxiexzf(C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg, C1787feyxiexzfUjhhgtg c1787feyxiexzfUjhhgtg2) {
        if (c1787feyxiexzfUjhhgtg == null && c1787feyxiexzfUjhhgtg2 == null) {
            return false;
        }
        if (c1787feyxiexzfUjhhgtg != null && c1787feyxiexzfUjhhgtg2 != null && c1787feyxiexzfUjhhgtg2.f6028Ujhhgtgfeyxiexzf.containsKey("android:visibility:visibility") != c1787feyxiexzfUjhhgtg.f6028Ujhhgtgfeyxiexzf.containsKey("android:visibility:visibility")) {
            return false;
        }
        C2220Ujhhgtgfeyxiexzf c2220UjhhgtgfeyxiexzfM5028feyxiexzfUjhhgtg = m5028feyxiexzfUjhhgtg(c1787feyxiexzfUjhhgtg, c1787feyxiexzfUjhhgtg2);
        if (c2220UjhhgtgfeyxiexzfM5028feyxiexzfUjhhgtg.f7205Ujhhgtgfeyxiexzf) {
            return c2220UjhhgtgfeyxiexzfM5028feyxiexzfUjhhgtg.f7207Ujhhgtgfeyxiexzf == 0 || c2220UjhhgtgfeyxiexzfM5028feyxiexzfUjhhgtg.f7208Ujhhgtgfeyxiexzf == 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final ObjectAnimator m5029feyxiexzfUjhhgtg(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC2306Ujhhgtgfeyxiexzf.f7544Ujhhgtgfeyxiexzf.mo3524Ujhhgtgfeyxiexzf(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC2306Ujhhgtgfeyxiexzf.f7545Ujhhgtgfeyxiexzf, f2);
        C3509Ujhhgtgfeyxiexzf c3509Ujhhgtgfeyxiexzf = new C3509Ujhhgtgfeyxiexzf(view);
        objectAnimatorOfFloat.addListener(c3509Ujhhgtgfeyxiexzf);
        m3026Ujhhgtgfeyxiexzf().m3014Ujhhgtgfeyxiexzf(c3509Ujhhgtgfeyxiexzf);
        return objectAnimatorOfFloat;
    }

    public C3510feyxiexzfUjhhgtg() {
        this.f10924feyxiexzfUjhhgtg = 3;
    }
}
