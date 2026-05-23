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
import com.kongzue.dialogx.interfaces.AbstractC0027;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC1034;
import p000.AbstractC2202;
import p000.AbstractC2205;
import p000.AbstractC2468;
import p000.AbstractC3570;
import p000.AbstractC3578;
import p000.C0094;
import p000.C0637;
import p000.C1009;
import p000.C1035;
import p000.C1330;
import p000.C1331;
import p000.C1345;
import p000.C1348;
import p000.C1349;
import p000.C2544;
import p000.C3592;
import p000.InterfaceC0557;
import p000.InterfaceC1036;
import p000.InterfaceC1038;
import p000.InterfaceC2274;
import p000.InterfaceC2278;
import p000.InterfaceC2286;
import p000.ViewOnAttachStateChangeListenerC1346;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class DialogXBaseRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final /* synthetic */ int f932 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public WeakReference f933;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f934;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean f935;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean f936;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public AbstractC2202 f937;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public InterfaceC1036 f938;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C1349 f939;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean f940;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f941;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public float f942;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public float f943;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public C1035 f944;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public WeakReference f945;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public Rect f946;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f947;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public float f948;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final int[] f949;

    public DialogXBaseRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 1;
        this.f934 = true;
        this.f935 = true;
        this.f936 = true;
        this.f940 = false;
        this.f946 = new Rect();
        this.f947 = true;
        this.f949 = new int[4];
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            setForceDarkAllowed(false);
        }
        if (this.f940) {
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2468.f7874);
            this.f935 = typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f934 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            this.f936 = typedArrayObtainStyledAttributes.getBoolean(2, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f940 = true;
        }
        if (this.f935) {
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
        m763(0.0f);
        if (getParentDialog() != null && getParentDialog().f924 != 1) {
            setFitsSystemWindows(true);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setDefaultFocusHighlightEnabled(false);
        C0094 c0094 = new C0094(15, this);
        final C1349 c1349 = new C1349();
        c1349.f4826 = false;
        c1349.f4827 = this;
        c1349.f4828 = c0094;
        c1349.f4829 = getParentDialog();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c1349.f4827;
        Field field = AbstractC3578.f11184;
        int paddingStart = dialogXBaseRelativeLayout.getPaddingStart();
        int paddingTop = c1349.f4827.getPaddingTop();
        int paddingEnd = c1349.f4827.getPaddingEnd();
        int paddingBottom = c1349.f4827.getPaddingBottom();
        final C1348 c1348 = new C1348();
        c1348.f4822 = paddingStart;
        c1348.f4823 = paddingTop;
        c1348.f4824 = paddingEnd;
        c1348.f4825 = paddingBottom;
        AbstractC3570.m5151(c1349.f4827, new InterfaceC2274() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᛸᤞᲁᲀ
            @Override // p000.InterfaceC2274
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
            public final C3669 mo1108(View view, C3669 c3669) {
                C1349 c13410 = c1349;
                if (c13410.f4826) {
                    return c3669;
                }
                c13410.m3057(c3669, new C1348(c1348));
                return c3669;
            }
        });
        if (i2 >= 30) {
            AbstractC3578.m5179(c1349.f4827, new C1345(c1349, c1348));
        }
        if (c1349.f4827.isAttachedToWindow()) {
            c1349.f4827.requestApplyInsets();
        } else {
            c1349.f4827.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1346(c1349, i, c1348));
        }
        this.f939 = c1349;
    }

    private void setBackPressedDispatcher(boolean z) {
        if (z) {
            C1330 c1330 = new C1330(new C1331(new C1009(new C1009(new C0637(2, this), C3592.f11228, 1), C3592.f11229, 2), false, new C2544(29)));
            if (((InterfaceC2278) (!c1330.hasNext() ? null : c1330.next())) == null) {
                return;
            }
            this.f944 = new C1035(true);
            throw null;
        }
        C1035 c1035 = this.f944;
        if (c1035 != null) {
            Iterator it = ((CopyOnWriteArrayList) c1035.f5255).iterator();
            while (it.hasNext()) {
                ((InterfaceC0557) it.next()).cancel();
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
        if (!isAttachedToWindow() || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4 || !this.f936 || this.f938 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ((AbstractC0027) this.f933.get()).getClass();
        this.f938.mo1110();
        return true;
    }

    public C1349 getFitSystemBarUtils() {
        return this.f939;
    }

    public InterfaceC2286 getOnSafeInsetsChangeListener() {
        return null;
    }

    public AbstractC0027 getParentDialog() {
        WeakReference weakReference = this.f933;
        if (weakReference == null) {
            return null;
        }
        return (AbstractC0027) weakReference.get();
    }

    public int getRootPaddingBottom() {
        return this.f949[3];
    }

    public int getRootPaddingLeft() {
        return this.f949[0];
    }

    public int getRootPaddingRight() {
        return this.f949[2];
    }

    public int getRootPaddingTop() {
        return this.f949[1];
    }

    public float getSafeHeight() {
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.f946;
        return (measuredHeight - rect.bottom) - rect.top;
    }

    public Rect getUnsafePlace() {
        return this.f946;
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
        if (isInEditMode() || getParentDialog() == null || getParentDialog().m754() == null) {
            return;
        }
        AbstractC2202 abstractC2202 = this.f937;
        if (abstractC2202 != null) {
            abstractC2202.mo2435();
        }
        this.f947 = (getResources().getConfiguration().uiMode & 48) == 16;
        if (this.f935) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f947 == ((configuration.uiMode & 48) == 16) || AbstractC1034.f3782 != 3 || getParentDialog() == null) {
            return;
        }
        getParentDialog().mo760();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC2202 abstractC2202 = this.f937;
        if (abstractC2202 != null) {
            abstractC2202.mo2434();
        }
        C1349 c1349 = this.f939;
        if (c1349 != null) {
            View viewM3058 = c1349.m3058();
            if (viewM3058 != null && c1349.f4834 != null) {
                viewM3058.getViewTreeObserver().removeOnGlobalLayoutListener(c1349.f4834);
            }
            c1349.f4834 = null;
            c1349.f4828 = null;
            c1349.f4827 = null;
            c1349.f4829 = null;
        }
        setBackPressedDispatcher(false);
        this.f939 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f941 = true;
            this.f942 = motionEvent.getX();
            this.f943 = motionEvent.getY();
        } else if (action == 1 && this.f941 && findFocus() != this && getParentDialog() != null) {
            float f = (int) ((5.0f * getParentDialog().m755().getDisplayMetrics().density) + 0.5f);
            if (Math.abs(motionEvent.getX() - this.f942) <= f && Math.abs(motionEvent.getY() - this.f943) <= f) {
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
        if (i == 130 && (weakReference = this.f945) != null && weakReference.get() != null && this.f945.get() != this) {
            return ((View) this.f945.get()).requestFocus();
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
        drawable.setAlpha((int) (this.f948 * 255.0f));
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
    public final void m763(float f) {
        this.f948 = f;
        if (getBackground() != null) {
            getBackground().mutate().setAlpha((int) (f * 255.0f));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m764(AbstractC0027 abstractC0027) {
        this.f933 = new WeakReference(abstractC0027);
        if (abstractC0027 != null && abstractC0027.f924 != 1) {
            setFitsSystemWindows(true);
        }
        if (this.f946 != null) {
            Objects.toString(getParentDialog());
            Rect rect = this.f946;
            m765(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m765(int i, int i2, int i3, int i4) {
        Objects.toString(getParentDialog());
        AbstractC2205 abstractC2205 = AbstractC1034.f3778;
        getParentDialog();
        getParentDialog();
        if (findViewWithTag("DialogXSafetyArea") instanceof InterfaceC1038) {
            View viewFindViewWithTag = findViewWithTag("DialogXSafetyArea");
            if (!(viewFindViewWithTag instanceof InterfaceC1038)) {
                getParentDialog().getClass();
                throw new ClassCastException();
            }
            int dialogXSafetyMode = ((InterfaceC1038) viewFindViewWithTag).getDialogXSafetyMode();
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
        if (this.f934) {
            setPadding(i, i2, i3, i4);
        }
    }
}
