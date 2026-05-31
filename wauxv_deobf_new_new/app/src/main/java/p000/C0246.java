package p000;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᤝᲀᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0246 extends TextView {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0154 f1458;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0242 f1459;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0519 f1460;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0229 f1461;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f1462;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C0102 f1463;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public Future f1464;

    public C0246(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0229 getEmojiTextViewHelper() {
        if (this.f1461 == null) {
            this.f1461 = new C0229(this);
        }
        return this.f1461;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0154 c0154 = this.f1458;
        if (c0154 != null) {
            c0154.m1300();
        }
        C0242 c0242 = this.f1459;
        if (c0242 != null) {
            c0242.m1438();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC2972 ? ((ActionModeCallbackC2972) customSelectionActionModeCallback).f9529 : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0243 getSuperCaller() {
        if (this.f1463 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f1463 = new C0245(this);
            } else if (i >= 28) {
                this.f1463 = new C0244(this);
            } else {
                this.f1463 = new C0102(this, 3);
            }
        }
        return this.f1463;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0154 c0154 = this.f1458;
        if (c0154 != null) {
            return c0154.m1318();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0154 c0154 = this.f1458;
        if (c0154 != null) {
            return c0154.m1319();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1459.m1439();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1459.m1440();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f1464;
        if (future != null) {
            try {
                this.f1464 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0972.m2595(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0519 c0519;
        if (Build.VERSION.SDK_INT >= 28 || (c0519 = this.f1460) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0519.f2209;
        return textClassifier == null ? AbstractC0236.m1425((TextView) c0519.f2208) : textClassifier;
    }

    public C2438 getTextMetricsParamsCompat() {
        return AbstractC0972.m2595(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1459.getClass();
        C0242.m1436(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC2727.m4709(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0242 c0242 = this.f1459;
        if (c0242 != null) {
            c0242.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f1464;
        if (future != null) {
            try {
                this.f1464 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0972.m2595(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((AbstractC3528) getEmojiTextViewHelper().f1421.f1117).mo2911(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0154 c0154 = this.f1458;
        if (c0154 != null) {
            c0154.m1323();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0154 c0154 = this.f1458;
        if (c0154 != null) {
            c0154.m1324(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0242 c0242 = this.f1459;
        if (c0242 != null) {
            c0242.m1438();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0242 c0242 = this.f1459;
        if (c0242 != null) {
            c0242.m1438();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0242 c0242 = this.f1459;
        if (c0242 != null) {
            c0242.m1438();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0242 c0242 = this.f1459;
        if (c0242 != null) {
            c0242.m1438();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0972.m2613(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1401(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC3528) getEmojiTextViewHelper().f1421.f1117).mo2909(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1260(i);
        } else {
            AbstractC0972.m2603(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1251(i);
        } else {
            AbstractC0972.m2604(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC0972.m2605(this, i);
    }

    public void setPrecomputedText(AbstractC2439 abstractC2439) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0972.m2595(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0154 c0154 = this.f1458;
        if (c0154 != null) {
            c0154.m1332(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0154 c0154 = this.f1458;
        if (c0154 != null) {
            c0154.m1333(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0242 c0242 = this.f1459;
        c0242.m1443(colorStateList);
        c0242.m1438();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0242 c0242 = this.f1459;
        c0242.m1444(mode);
        c0242.m1438();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0242 c0242 = this.f1459;
        if (c0242 != null) {
            c0242.m1442(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0519 c0519;
        if (Build.VERSION.SDK_INT >= 28 || (c0519 = this.f1460) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0519.f2209 = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC2439> future) {
        this.f1464 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C2438 c2438) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c2438.f7790;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(c2438.f7789);
        setBreakStrategy(c2438.f7791);
        setHyphenationFrequency(c2438.f7792);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f1462) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC1586 abstractC1586 = AbstractC3516.f11089;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f1462 = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f1462 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC3460.m4988(context);
        this.f1462 = false;
        this.f1463 = null;
        AbstractC2977.m4979(this, getContext());
        C0154 c0154 = new C0154(this);
        this.f1458 = c0154;
        c0154.m1321(attributeSet, i);
        C0242 c0242 = new C0242(this);
        this.f1459 = c0242;
        c0242.m1441(attributeSet, i);
        c0242.m1438();
        C0519 c0519 = new C0519(4, false);
        c0519.f2208 = this;
        this.f1460 = c0519;
        getEmojiTextViewHelper().m1400(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().mo1263(i, f);
        } else if (i2 >= 34) {
            AbstractC0096.m1221(this, i, f);
        } else {
            AbstractC0972.m2605(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C1787.m3667(context, i) : null, i2 != 0 ? C1787.m3667(context, i2) : null, i3 != 0 ? C1787.m3667(context, i3) : null, i4 != 0 ? C1787.m3667(context, i4) : null);
        C0242 c0242 = this.f1459;
        if (c0242 != null) {
            c0242.m1438();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C1787.m3667(context, i) : null, i2 != 0 ? C1787.m3667(context, i2) : null, i3 != 0 ? C1787.m3667(context, i3) : null, i4 != 0 ? C1787.m3667(context, i4) : null);
        C0242 c0242 = this.f1459;
        if (c0242 != null) {
            c0242.m1438();
        }
    }
}
