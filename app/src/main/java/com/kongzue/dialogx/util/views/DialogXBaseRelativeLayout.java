package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import me.hd.wauxv.R;
import p000.AbstractC0798feyxiexzfUjhhgtg;
import p000.AbstractC1893Ujhhgtgfeyxiexzf;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3177feyxiexzfUjhhgtg;
import p000.C0399Ujhhgtgfeyxiexzf;
import p000.C0400Ujhhgtgfeyxiexzf;
import p000.C1457feyxiexzfUjhhgtg;
import p000.C2579Ujhhgtgfeyxiexzf;
import p000.C2965Ujhhgtgfeyxiexzf;
import p000.C3049Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;
import p000.C3081Ujhhgtgfeyxiexzf;
import p000.C3082Ujhhgtgfeyxiexzf;
import p000.C3178feyxiexzfUjhhgtg;
import p000.C3487Ujhhgtgfeyxiexzf;
import p000.C3490feyxiexzfUjhhgtg;
import p000.C3491Ujhhgtgfeyxiexzf;
import p000.C3639Ujhhgtgfeyxiexzf;
import p000.EnumC0044Ujhhgtgfeyxiexzf;
import p000.InterfaceC1316feyxiexzfUjhhgtg;
import p000.InterfaceC1327feyxiexzfUjhhgtg;
import p000.InterfaceC2773Ujhhgtgfeyxiexzf;
import p000.InterfaceC3161feyxiexzfUjhhgtg;
import p000.InterfaceC3179feyxiexzfUjhhgtg;
import p000.RunnableC3012feyxiexzfUjhhgtg;
import p000.ViewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class DialogXBaseRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static final /* synthetic */ int f1012Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public WeakReference f1013Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f1014Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean f1015Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f1016Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C3052Ujhhgtgfeyxiexzf f1017Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public InterfaceC3179feyxiexzfUjhhgtg f1018Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C3491Ujhhgtgfeyxiexzf f1019Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean f1020Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f1021Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f1022Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public float f1023Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public C3178feyxiexzfUjhhgtg f1024Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public WeakReference f1025Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Rect f1026Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f1027Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f1028Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final int[] f1029Ujhhgtgfeyxiexzf;

    public DialogXBaseRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 1;
        this.f1014Ujhhgtgfeyxiexzf = true;
        this.f1015Ujhhgtgfeyxiexzf = true;
        this.f1016Ujhhgtgfeyxiexzf = true;
        this.f1020Ujhhgtgfeyxiexzf = false;
        this.f1026Ujhhgtgfeyxiexzf = new Rect();
        this.f1027Ujhhgtgfeyxiexzf = true;
        this.f1029Ujhhgtgfeyxiexzf = new int[4];
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            setForceDarkAllowed(false);
        }
        if (this.f1020Ujhhgtgfeyxiexzf) {
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0798feyxiexzfUjhhgtg.f3114Ujhhgtgfeyxiexzf);
            this.f1015Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f1014Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(0, true);
            this.f1016Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(2, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f1020Ujhhgtgfeyxiexzf = true;
        }
        if (this.f1015Ujhhgtgfeyxiexzf) {
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
        m908Ujhhgtgfeyxiexzf(0.0f);
        if (getParentDialog() != null && getParentDialog().f1004Ujhhgtgfeyxiexzf != 1) {
            setFitsSystemWindows(true);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setDefaultFocusHighlightEnabled(false);
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(16, this);
        C3491Ujhhgtgfeyxiexzf c3491Ujhhgtgfeyxiexzf = new C3491Ujhhgtgfeyxiexzf();
        c3491Ujhhgtgfeyxiexzf.f10838Ujhhgtgfeyxiexzf = false;
        c3491Ujhhgtgfeyxiexzf.f10839Ujhhgtgfeyxiexzf = this;
        c3491Ujhhgtgfeyxiexzf.f10840Ujhhgtgfeyxiexzf = c2965Ujhhgtgfeyxiexzf;
        c3491Ujhhgtgfeyxiexzf.f10841Ujhhgtgfeyxiexzf = getParentDialog();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c3491Ujhhgtgfeyxiexzf.f10839Ujhhgtgfeyxiexzf;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        int paddingStart = dialogXBaseRelativeLayout.getPaddingStart();
        int paddingTop = c3491Ujhhgtgfeyxiexzf.f10839Ujhhgtgfeyxiexzf.getPaddingTop();
        int paddingEnd = c3491Ujhhgtgfeyxiexzf.f10839Ujhhgtgfeyxiexzf.getPaddingEnd();
        int paddingBottom = c3491Ujhhgtgfeyxiexzf.f10839Ujhhgtgfeyxiexzf.getPaddingBottom();
        C3490feyxiexzfUjhhgtg c3490feyxiexzfUjhhgtg = new C3490feyxiexzfUjhhgtg();
        c3490feyxiexzfUjhhgtg.f10834Ujhhgtgfeyxiexzf = paddingStart;
        c3490feyxiexzfUjhhgtg.f10835Ujhhgtgfeyxiexzf = paddingTop;
        c3490feyxiexzfUjhhgtg.f10836Ujhhgtgfeyxiexzf = paddingEnd;
        c3490feyxiexzfUjhhgtg.f10837Ujhhgtgfeyxiexzf = paddingBottom;
        AbstractC1893Ujhhgtgfeyxiexzf.m3227Ujhhgtgfeyxiexzf(c3491Ujhhgtgfeyxiexzf.f10839Ujhhgtgfeyxiexzf, new C1457feyxiexzfUjhhgtg(c3491Ujhhgtgfeyxiexzf, 5, c3490feyxiexzfUjhhgtg));
        if (i2 >= 30) {
            AbstractC1901feyxiexzfUjhhgtg.m3267Ujhhgtgfeyxiexzf(c3491Ujhhgtgfeyxiexzf.f10839Ujhhgtgfeyxiexzf, new C3487Ujhhgtgfeyxiexzf(c3491Ujhhgtgfeyxiexzf, c3490feyxiexzfUjhhgtg));
        }
        if (c3491Ujhhgtgfeyxiexzf.f10839Ujhhgtgfeyxiexzf.isAttachedToWindow()) {
            c3491Ujhhgtgfeyxiexzf.f10839Ujhhgtgfeyxiexzf.requestApplyInsets();
        } else {
            c3491Ujhhgtgfeyxiexzf.f10839Ujhhgtgfeyxiexzf.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf(c3491Ujhhgtgfeyxiexzf, i, c3490feyxiexzfUjhhgtg));
        }
        this.f1019Ujhhgtgfeyxiexzf = c3491Ujhhgtgfeyxiexzf;
    }

    private void setBackPressedDispatcher(boolean z) {
        InterfaceC1316feyxiexzfUjhhgtg interfaceC1316feyxiexzfUjhhgtg;
        if (!z) {
            C3178feyxiexzfUjhhgtg c3178feyxiexzfUjhhgtg = this.f1024Ujhhgtgfeyxiexzf;
            if (c3178feyxiexzfUjhhgtg != null) {
                Iterator it = ((CopyOnWriteArrayList) c3178feyxiexzfUjhhgtg.f2653Ujhhgtgfeyxiexzf).iterator();
                while (it.hasNext()) {
                    ((InterfaceC2773Ujhhgtgfeyxiexzf) it.next()).cancel();
                }
                return;
            }
            return;
        }
        View view = this;
        while (true) {
            if (view == null) {
                interfaceC1316feyxiexzfUjhhgtg = null;
                break;
            }
            Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
            interfaceC1316feyxiexzfUjhhgtg = tag instanceof InterfaceC1316feyxiexzfUjhhgtg ? (InterfaceC1316feyxiexzfUjhhgtg) tag : null;
            if (interfaceC1316feyxiexzfUjhhgtg != null) {
                break;
            }
            Object parent = view.getParent();
            if (parent == null) {
                Object tag2 = view.getTag(R.id.view_tree_disjoint_parent);
                parent = tag2 instanceof ViewParent ? (ViewParent) tag2 : null;
            }
            view = parent instanceof View ? (View) parent : null;
        }
        if (interfaceC1316feyxiexzfUjhhgtg == null) {
            return;
        }
        this.f1024Ujhhgtgfeyxiexzf = new C3178feyxiexzfUjhhgtg(true);
        throw null;
    }

    @Override // android.view.View
    public final boolean callOnClick() {
        if (isEnabled()) {
            return super.callOnClick();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        if (!isAttachedToWindow() || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4 || !this.f1016Ujhhgtgfeyxiexzf || this.f1018Ujhhgtgfeyxiexzf == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ((Ujhhgtgfeyxiexzf) this.f1013Ujhhgtgfeyxiexzf.get()).getClass();
        this.f1018Ujhhgtgfeyxiexzf.mo2023Ujhhgtgfeyxiexzf();
        return true;
    }

    public C3491Ujhhgtgfeyxiexzf getFitSystemBarUtils() {
        return this.f1019Ujhhgtgfeyxiexzf;
    }

    public InterfaceC1327feyxiexzfUjhhgtg getOnSafeInsetsChangeListener() {
        return null;
    }

    public Ujhhgtgfeyxiexzf getParentDialog() {
        WeakReference weakReference = this.f1013Ujhhgtgfeyxiexzf;
        if (weakReference == null) {
            return null;
        }
        return (Ujhhgtgfeyxiexzf) weakReference.get();
    }

    public int getRootPaddingBottom() {
        return this.f1029Ujhhgtgfeyxiexzf[3];
    }

    public int getRootPaddingLeft() {
        return this.f1029Ujhhgtgfeyxiexzf[0];
    }

    public int getRootPaddingRight() {
        return this.f1029Ujhhgtgfeyxiexzf[2];
    }

    public int getRootPaddingTop() {
        return this.f1029Ujhhgtgfeyxiexzf[1];
    }

    public float getSafeHeight() {
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.f1026Ujhhgtgfeyxiexzf;
        return (measuredHeight - rect.bottom) - rect.top;
    }

    public Rect getUnsafePlace() {
        return this.f1026Ujhhgtgfeyxiexzf;
    }

    public int getUseAreaHeight() {
        return getHeight() - getRootPaddingBottom();
    }

    public int getUseAreaWidth() {
        return getWidth() - getRootPaddingRight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        char c = 1;
        setBackPressedDispatcher(true);
        if (isInEditMode() || getParentDialog() == null || getParentDialog().m899Ujhhgtgfeyxiexzf() == null) {
            return;
        }
        C3052Ujhhgtgfeyxiexzf c3052Ujhhgtgfeyxiexzf = this.f1017Ujhhgtgfeyxiexzf;
        if (c3052Ujhhgtgfeyxiexzf != null) {
            int i = c3052Ujhhgtgfeyxiexzf.f9441Ujhhgtgfeyxiexzf;
            EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf = EnumC0044Ujhhgtgfeyxiexzf.f1058Ujhhgtgfeyxiexzf;
            switch (i) {
                case 0:
                    C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf = (C3639Ujhhgtgfeyxiexzf) c3052Ujhhgtgfeyxiexzf.f9442Ujhhgtgfeyxiexzf;
                    C3082Ujhhgtgfeyxiexzf c3082Ujhhgtgfeyxiexzf = (C3082Ujhhgtgfeyxiexzf) c3639Ujhhgtgfeyxiexzf.f11371Ujhhgtgfeyxiexzf;
                    c3082Ujhhgtgfeyxiexzf.f996Ujhhgtgfeyxiexzf = true;
                    c3082Ujhhgtgfeyxiexzf.m906feyxiexzfUjhhgtg(enumC0044Ujhhgtgfeyxiexzf);
                    try {
                        androidx.lifecycle.Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = new C3049Ujhhgtgfeyxiexzf().f9433Ujhhgtgfeyxiexzf;
                        if (ujhhgtgfeyxiexzf.f301Ujhhgtgfeyxiexzf != enumC0044Ujhhgtgfeyxiexzf) {
                            ujhhgtgfeyxiexzf.m99Ujhhgtgfeyxiexzf("setCurrentState");
                            ujhhgtgfeyxiexzf.m101Ujhhgtgfeyxiexzf(enumC0044Ujhhgtgfeyxiexzf);
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
                    C2579Ujhhgtgfeyxiexzf c2579Ujhhgtgfeyxiexzf = c3082Ujhhgtgfeyxiexzf.f992Ujhhgtgfeyxiexzf;
                    if (c2579Ujhhgtgfeyxiexzf != null) {
                        c2579Ujhhgtgfeyxiexzf.m3831Ujhhgtgfeyxiexzf(c3082Ujhhgtgfeyxiexzf);
                    }
                    ((MaxRelativeLayout) c3639Ujhhgtgfeyxiexzf.f11370Ujhhgtgfeyxiexzf).setVisibility(8);
                    break;
                default:
                    C0399Ujhhgtgfeyxiexzf c0399Ujhhgtgfeyxiexzf = (C0399Ujhhgtgfeyxiexzf) c3052Ujhhgtgfeyxiexzf.f9442Ujhhgtgfeyxiexzf;
                    C0400Ujhhgtgfeyxiexzf c0400Ujhhgtgfeyxiexzf = c0399Ujhhgtgfeyxiexzf.f2163Ujhhgtgfeyxiexzf;
                    c0400Ujhhgtgfeyxiexzf.f996Ujhhgtgfeyxiexzf = true;
                    c0400Ujhhgtgfeyxiexzf.m906feyxiexzfUjhhgtg(enumC0044Ujhhgtgfeyxiexzf);
                    C2579Ujhhgtgfeyxiexzf c2579Ujhhgtgfeyxiexzf2 = c0400Ujhhgtgfeyxiexzf.f992Ujhhgtgfeyxiexzf;
                    if (c2579Ujhhgtgfeyxiexzf2 != null) {
                        c2579Ujhhgtgfeyxiexzf2.m3831Ujhhgtgfeyxiexzf(c0400Ujhhgtgfeyxiexzf);
                    }
                    c0400Ujhhgtgfeyxiexzf.getClass();
                    C3049Ujhhgtgfeyxiexzf c3049Ujhhgtgfeyxiexzf = new C3049Ujhhgtgfeyxiexzf();
                    C0400Ujhhgtgfeyxiexzf c0400Ujhhgtgfeyxiexzf2 = c0400Ujhhgtgfeyxiexzf.f2166feyxiexzfUjhhgtg;
                    try {
                        androidx.lifecycle.Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf2 = c3049Ujhhgtgfeyxiexzf.f9433Ujhhgtgfeyxiexzf;
                        if (ujhhgtgfeyxiexzf2.f301Ujhhgtgfeyxiexzf != enumC0044Ujhhgtgfeyxiexzf) {
                            ujhhgtgfeyxiexzf2.m99Ujhhgtgfeyxiexzf("setCurrentState");
                            ujhhgtgfeyxiexzf2.m101Ujhhgtgfeyxiexzf(enumC0044Ujhhgtgfeyxiexzf);
                        }
                        break;
                    } catch (Exception unused2) {
                    }
                    AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf2 = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
                    C0400Ujhhgtgfeyxiexzf c0400Ujhhgtgfeyxiexzf3 = c0400Ujhhgtgfeyxiexzf.f2166feyxiexzfUjhhgtg;
                    if (c0400Ujhhgtgfeyxiexzf.f2167feyxiexzfUjhhgtg == null) {
                        c0400Ujhhgtgfeyxiexzf.f2167feyxiexzfUjhhgtg = new C3081Ujhhgtgfeyxiexzf(c == true ? 1 : 0, c0399Ujhhgtgfeyxiexzf);
                    }
                    c0400Ujhhgtgfeyxiexzf.f2167feyxiexzfUjhhgtg.m4548Ujhhgtgfeyxiexzf(c0400Ujhhgtgfeyxiexzf3);
                    c0400Ujhhgtgfeyxiexzf.f997Ujhhgtgfeyxiexzf.getClass();
                    if (c0400Ujhhgtgfeyxiexzf.f998Ujhhgtgfeyxiexzf) {
                        c0399Ujhhgtgfeyxiexzf.f2156Ujhhgtgfeyxiexzf.postDelayed(new RunnableC3012feyxiexzfUjhhgtg(11, c3052Ujhhgtgfeyxiexzf), 300L);
                    }
                    break;
            }
        }
        this.f1027Ujhhgtgfeyxiexzf = (getResources().getConfiguration().uiMode & 48) == 16;
        if (this.f1015Ujhhgtgfeyxiexzf) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1027Ujhhgtgfeyxiexzf == ((configuration.uiMode & 48) == 16) || AbstractC3177feyxiexzfUjhhgtg.f9826Ujhhgtgfeyxiexzf != 3 || getParentDialog() == null) {
            return;
        }
        getParentDialog().mo905feyxiexzfUjhhgtg();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C3052Ujhhgtgfeyxiexzf c3052Ujhhgtgfeyxiexzf = this.f1017Ujhhgtgfeyxiexzf;
        if (c3052Ujhhgtgfeyxiexzf != null) {
            int i = c3052Ujhhgtgfeyxiexzf.f9441Ujhhgtgfeyxiexzf;
            EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf = EnumC0044Ujhhgtgfeyxiexzf.f1056Ujhhgtgfeyxiexzf;
            switch (i) {
                case 0:
                    C3082Ujhhgtgfeyxiexzf c3082Ujhhgtgfeyxiexzf = (C3082Ujhhgtgfeyxiexzf) ((C3639Ujhhgtgfeyxiexzf) c3052Ujhhgtgfeyxiexzf.f9442Ujhhgtgfeyxiexzf).f11371Ujhhgtgfeyxiexzf;
                    c3082Ujhhgtgfeyxiexzf.f996Ujhhgtgfeyxiexzf = false;
                    try {
                        androidx.lifecycle.Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = new C3049Ujhhgtgfeyxiexzf().f9433Ujhhgtgfeyxiexzf;
                        if (ujhhgtgfeyxiexzf.f301Ujhhgtgfeyxiexzf != enumC0044Ujhhgtgfeyxiexzf) {
                            ujhhgtgfeyxiexzf.m99Ujhhgtgfeyxiexzf("setCurrentState");
                            ujhhgtgfeyxiexzf.m101Ujhhgtgfeyxiexzf(enumC0044Ujhhgtgfeyxiexzf);
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
                    c3082Ujhhgtgfeyxiexzf.m906feyxiexzfUjhhgtg(enumC0044Ujhhgtgfeyxiexzf);
                    c3082Ujhhgtgfeyxiexzf.f9527feyxiexzfUjhhgtg = null;
                    break;
                default:
                    C0400Ujhhgtgfeyxiexzf c0400Ujhhgtgfeyxiexzf = ((C0399Ujhhgtgfeyxiexzf) c3052Ujhhgtgfeyxiexzf.f9442Ujhhgtgfeyxiexzf).f2163Ujhhgtgfeyxiexzf;
                    c0400Ujhhgtgfeyxiexzf.f996Ujhhgtgfeyxiexzf = false;
                    C3049Ujhhgtgfeyxiexzf c3049Ujhhgtgfeyxiexzf = new C3049Ujhhgtgfeyxiexzf();
                    C0400Ujhhgtgfeyxiexzf c0400Ujhhgtgfeyxiexzf2 = c0400Ujhhgtgfeyxiexzf.f2166feyxiexzfUjhhgtg;
                    try {
                        androidx.lifecycle.Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf2 = c3049Ujhhgtgfeyxiexzf.f9433Ujhhgtgfeyxiexzf;
                        if (ujhhgtgfeyxiexzf2.f301Ujhhgtgfeyxiexzf != enumC0044Ujhhgtgfeyxiexzf) {
                            ujhhgtgfeyxiexzf2.m99Ujhhgtgfeyxiexzf("setCurrentState");
                            ujhhgtgfeyxiexzf2.m101Ujhhgtgfeyxiexzf(enumC0044Ujhhgtgfeyxiexzf);
                        }
                        break;
                    } catch (Exception unused2) {
                    }
                    AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf2 = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
                    C0400Ujhhgtgfeyxiexzf c0400Ujhhgtgfeyxiexzf3 = c0400Ujhhgtgfeyxiexzf.f2166feyxiexzfUjhhgtg;
                    c0400Ujhhgtgfeyxiexzf.m906feyxiexzfUjhhgtg(enumC0044Ujhhgtgfeyxiexzf);
                    c0400Ujhhgtgfeyxiexzf.getClass();
                    break;
            }
        }
        C3491Ujhhgtgfeyxiexzf c3491Ujhhgtgfeyxiexzf = this.f1019Ujhhgtgfeyxiexzf;
        if (c3491Ujhhgtgfeyxiexzf != null) {
            View viewM4977Ujhhgtgfeyxiexzf = c3491Ujhhgtgfeyxiexzf.m4977Ujhhgtgfeyxiexzf();
            if (viewM4977Ujhhgtgfeyxiexzf != null && c3491Ujhhgtgfeyxiexzf.f10846Ujhhgtgfeyxiexzf != null) {
                viewM4977Ujhhgtgfeyxiexzf.getViewTreeObserver().removeOnGlobalLayoutListener(c3491Ujhhgtgfeyxiexzf.f10846Ujhhgtgfeyxiexzf);
            }
            c3491Ujhhgtgfeyxiexzf.f10846Ujhhgtgfeyxiexzf = null;
            c3491Ujhhgtgfeyxiexzf.f10840Ujhhgtgfeyxiexzf = null;
            c3491Ujhhgtgfeyxiexzf.f10839Ujhhgtgfeyxiexzf = null;
            c3491Ujhhgtgfeyxiexzf.f10841Ujhhgtgfeyxiexzf = null;
        }
        setBackPressedDispatcher(false);
        this.f1019Ujhhgtgfeyxiexzf = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1021Ujhhgtgfeyxiexzf = true;
            this.f1022Ujhhgtgfeyxiexzf = motionEvent.getX();
            this.f1023Ujhhgtgfeyxiexzf = motionEvent.getY();
        } else if (action == 1 && this.f1021Ujhhgtgfeyxiexzf && findFocus() != this && getParentDialog() != null) {
            float f = (int) ((5.0f * getParentDialog().m900Ujhhgtgfeyxiexzf().getDisplayMetrics().density) + 0.5f);
            if (Math.abs(motionEvent.getX() - this.f1022Ujhhgtgfeyxiexzf) <= f && Math.abs(motionEvent.getY() - this.f1023Ujhhgtgfeyxiexzf) <= f) {
                callOnClick();
            }
        }
        getParentDialog();
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 2);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled()) {
            return super.performClick();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        WeakReference weakReference;
        if (getParentDialog() != null) {
            getParentDialog();
        }
        if (i == 130 && (weakReference = this.f1025Ujhhgtgfeyxiexzf) != null && weakReference.get() != null && this.f1025Ujhhgtgfeyxiexzf.get() != this) {
            return ((View) this.f1025Ujhhgtgfeyxiexzf.get()).requestFocus();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || viewFindFocus == this) {
            return super.requestFocus(i, rect);
        }
        viewFindFocus.requestFocus();
        return true;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        drawable.setAlpha((int) (this.f1028Ujhhgtgfeyxiexzf * 255.0f));
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        setBackground(new ColorDrawable(i));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 8 && getAlpha() == 0.0f) {
            setAlpha(0.01f);
        }
        super.setVisibility(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m908Ujhhgtgfeyxiexzf(float f) {
        this.f1028Ujhhgtgfeyxiexzf = f;
        if (getBackground() != null) {
            getBackground().mutate().setAlpha((int) (f * 255.0f));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m909Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf) {
        this.f1013Ujhhgtgfeyxiexzf = new WeakReference(ujhhgtgfeyxiexzf);
        if (ujhhgtgfeyxiexzf != null && ujhhgtgfeyxiexzf.f1004Ujhhgtgfeyxiexzf != 1) {
            setFitsSystemWindows(true);
        }
        if (this.f1026Ujhhgtgfeyxiexzf != null) {
            Objects.toString(getParentDialog());
            Rect rect = this.f1026Ujhhgtgfeyxiexzf;
            m910Ujhhgtgfeyxiexzf(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m910Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        Objects.toString(getParentDialog());
        AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
        getParentDialog();
        getParentDialog();
        if (findViewWithTag("DialogXSafetyArea") instanceof InterfaceC3161feyxiexzfUjhhgtg) {
            View viewFindViewWithTag = findViewWithTag("DialogXSafetyArea");
            if (!(viewFindViewWithTag instanceof InterfaceC3161feyxiexzfUjhhgtg)) {
                getParentDialog().getClass();
                throw new ClassCastException();
            }
            int dialogXSafetyMode = ((InterfaceC3161feyxiexzfUjhhgtg) viewFindViewWithTag).getDialogXSafetyMode();
            boolean z = (dialogXSafetyMode & 1) != 0;
            boolean z2 = (dialogXSafetyMode & 2) != 0;
            boolean z3 = (dialogXSafetyMode & 4) != 0;
            boolean z4 = (dialogXSafetyMode & 8) != 0;
            Objects.toString(viewFindViewWithTag);
            viewFindViewWithTag.setPadding(z2 ? i : 0, z ? i2 : 0, z4 ? i3 : 0, z3 ? i4 : 0);
            if (z) {
                i2 = 0;
            }
            if (z2) {
                i = 0;
            }
            if (z4) {
                i3 = 0;
            }
            if (z3) {
                i4 = 0;
            }
        }
        if (this.f1014Ujhhgtgfeyxiexzf) {
            setPadding(i, i2, i3, i4);
        }
    }
}
