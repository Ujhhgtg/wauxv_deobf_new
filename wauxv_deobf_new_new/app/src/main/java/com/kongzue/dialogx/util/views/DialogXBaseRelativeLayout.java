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
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC1037;
import p000.AbstractC1467;
import p000.AbstractC1469;
import p000.AbstractC2522;
import p000.AbstractC3630;
import p000.AbstractC3638;
import p000.C0102;
import p000.C0630;
import p000.C1012;
import p000.C1038;
import p000.C1332;
import p000.C1333;
import p000.C1345;
import p000.C1348;
import p000.C1349;
import p000.C2423;
import p000.C2657;
import p000.C3652;
import p000.InterfaceC0534;
import p000.InterfaceC1039;
import p000.InterfaceC1041;
import p000.InterfaceC2310;
import p000.InterfaceC2319;
import p000.ViewOnAttachStateChangeListenerC1346;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class DialogXBaseRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f998 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public WeakReference f999;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f1000;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean f1001;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean f1002;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public AbstractC1467 f1003;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public InterfaceC1039 f1004;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C1349 f1005;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean f1006;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f1007;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public float f1008;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public float f1009;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C1038 f1010;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public WeakReference f1011;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public Rect f1012;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f1013;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public float f1014;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final int[] f1015;

    public DialogXBaseRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 1;
        this.f1000 = true;
        this.f1001 = true;
        this.f1002 = true;
        this.f1006 = false;
        this.f1012 = new Rect();
        this.f1013 = true;
        this.f1015 = new int[4];
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            setForceDarkAllowed(false);
        }
        if (this.f1006) {
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2522.f8024);
            this.f1001 = typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f1000 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            this.f1002 = typedArrayObtainStyledAttributes.getBoolean(2, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f1006 = true;
        }
        if (this.f1001) {
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
        m907(0.0f);
        if (getParentDialog() != null && getParentDialog().f990 != 1) {
            setFitsSystemWindows(true);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setDefaultFocusHighlightEnabled(false);
        C0102 c0102 = new C0102(this, 16);
        C1349 c1349 = new C1349();
        c1349.f4823 = false;
        c1349.f4824 = this;
        c1349.f4825 = c0102;
        c1349.f4826 = getParentDialog();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c1349.f4824;
        Field field = AbstractC3638.f11333;
        int paddingStart = dialogXBaseRelativeLayout.getPaddingStart();
        int paddingTop = c1349.f4824.getPaddingTop();
        int paddingEnd = c1349.f4824.getPaddingEnd();
        int paddingBottom = c1349.f4824.getPaddingBottom();
        C1348 c1348 = new C1348();
        c1348.f4819 = paddingStart;
        c1348.f4820 = paddingTop;
        c1348.f4821 = paddingEnd;
        c1348.f4822 = paddingBottom;
        AbstractC3630.m5157(c1349.f4824, new C2423(c1349, 3, c1348));
        if (i2 >= 30) {
            AbstractC3638.m5185(c1349.f4824, new C1345(c1349, c1348));
        }
        if (c1349.f4824.isAttachedToWindow()) {
            c1349.f4824.requestApplyInsets();
        } else {
            c1349.f4824.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1346(c1349, i, c1348));
        }
        this.f1005 = c1349;
    }

    private void setBackPressedDispatcher(boolean z) {
        if (z) {
            C1332 c1332 = new C1332(new C1333(new C1012(new C1012(new C0630(this, 2), C3652.f11377, 1), C3652.f11378, 2), false, new C2657(21)));
            if (((InterfaceC2310) (!c1332.hasNext() ? null : c1332.next())) == null) {
                return;
            }
            this.f1010 = new C1038(true);
            throw null;
        }
        C1038 c1038 = this.f1010;
        if (c1038 != null) {
            Iterator it = ((CopyOnWriteArrayList) c1038.f5287).iterator();
            while (it.hasNext()) {
                ((InterfaceC0534) it.next()).cancel();
            }
        }
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
        if (!isAttachedToWindow() || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4 || !this.f1002 || this.f1004 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ((AbstractC0034) this.f999.get()).getClass();
        this.f1004.mo1256();
        return true;
    }

    public C1349 getFitSystemBarUtils() {
        return this.f1005;
    }

    public InterfaceC2319 getOnSafeInsetsChangeListener() {
        return null;
    }

    public AbstractC0034 getParentDialog() {
        WeakReference weakReference = this.f999;
        if (weakReference == null) {
            return null;
        }
        return (AbstractC0034) weakReference.get();
    }

    public int getRootPaddingBottom() {
        return this.f1015[3];
    }

    public int getRootPaddingLeft() {
        return this.f1015[0];
    }

    public int getRootPaddingRight() {
        return this.f1015[2];
    }

    public int getRootPaddingTop() {
        return this.f1015[1];
    }

    public float getSafeHeight() {
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.f1012;
        return (measuredHeight - rect.bottom) - rect.top;
    }

    public Rect getUnsafePlace() {
        return this.f1012;
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
        setBackPressedDispatcher(true);
        if (isInEditMode() || getParentDialog() == null || getParentDialog().m898() == null) {
            return;
        }
        AbstractC1467 abstractC1467 = this.f1003;
        if (abstractC1467 != null) {
            abstractC1467.mo2552();
        }
        this.f1013 = (getResources().getConfiguration().uiMode & 48) == 16;
        if (this.f1001) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1013 == ((configuration.uiMode & 48) == 16) || AbstractC1037.f3789 != 3 || getParentDialog() == null) {
            return;
        }
        getParentDialog().mo904();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC1467 abstractC1467 = this.f1003;
        if (abstractC1467 != null) {
            abstractC1467.mo2551();
        }
        C1349 c1349 = this.f1005;
        if (c1349 != null) {
            View viewM3161 = c1349.m3161();
            if (viewM3161 != null && c1349.f4831 != null) {
                viewM3161.getViewTreeObserver().removeOnGlobalLayoutListener(c1349.f4831);
            }
            c1349.f4831 = null;
            c1349.f4825 = null;
            c1349.f4824 = null;
            c1349.f4826 = null;
        }
        setBackPressedDispatcher(false);
        this.f1005 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1007 = true;
            this.f1008 = motionEvent.getX();
            this.f1009 = motionEvent.getY();
        } else if (action == 1 && this.f1007 && findFocus() != this && getParentDialog() != null) {
            float f = (int) ((5.0f * getParentDialog().m899().getDisplayMetrics().density) + 0.5f);
            if (Math.abs(motionEvent.getX() - this.f1008) <= f && Math.abs(motionEvent.getY() - this.f1009) <= f) {
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
        if (i == 130 && (weakReference = this.f1011) != null && weakReference.get() != null && this.f1011.get() != this) {
            return ((View) this.f1011.get()).requestFocus();
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
        drawable.setAlpha((int) (this.f1014 * 255.0f));
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m907(float f) {
        this.f1014 = f;
        if (getBackground() != null) {
            getBackground().mutate().setAlpha((int) (f * 255.0f));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m908(AbstractC0034 abstractC0034) {
        this.f999 = new WeakReference(abstractC0034);
        if (abstractC0034 != null && abstractC0034.f990 != 1) {
            setFitsSystemWindows(true);
        }
        if (this.f1012 != null) {
            Objects.toString(getParentDialog());
            Rect rect = this.f1012;
            m909(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m909(int i, int i2, int i3, int i4) {
        Objects.toString(getParentDialog());
        AbstractC1469 abstractC1469 = AbstractC1037.f3785;
        getParentDialog();
        getParentDialog();
        if (findViewWithTag("DialogXSafetyArea") instanceof InterfaceC1041) {
            View viewFindViewWithTag = findViewWithTag("DialogXSafetyArea");
            if (!(viewFindViewWithTag instanceof InterfaceC1041)) {
                getParentDialog().getClass();
                throw new ClassCastException();
            }
            int dialogXSafetyMode = ((InterfaceC1041) viewFindViewWithTag).getDialogXSafetyMode();
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
        if (this.f1000) {
            setPadding(i, i2, i3, i4);
        }
    }
}
