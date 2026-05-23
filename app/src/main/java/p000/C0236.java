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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0236 extends TextView {

    public final C0146 f1384;

    public final C0232 f1385;

    public final C0542 f1386;

    public C0219 f1387;

    public boolean f1388;

    public C0094 f1389;

    public Future f1390;

    public C0236(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private C0219 getEmojiTextViewHelper() {
        if (this.f1387 == null) {
            this.f1387 = new C0219(this);
        }
        return this.f1387;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0146 c0146 = this.f1384;
        if (c0146 != null) {
            c0146.m1154();
        }
        C0232 c0232 = this.f1385;
        if (c0232 != null) {
            c0232.m1292();
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
        return customSelectionActionModeCallback instanceof ActionModeCallbackC2913 ? ((ActionModeCallbackC2913) customSelectionActionModeCallback).f9362 : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0233 getSuperCaller() {
        if (this.f1389 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f1389 = new C0235(this);
            } else if (i >= 28) {
                this.f1389 = new C0234(this);
            } else {
                this.f1389 = new C0094(3, this);
            }
        }
        return this.f1389;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0146 c0146 = this.f1384;
        if (c0146 != null) {
            return c0146.m1172();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0146 c0146 = this.f1384;
        if (c0146 != null) {
            return c0146.m1173();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1385.m1293();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1385.m1294();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f1390;
        if (future != null) {
            try {
                this.f1390 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC3453.m4998(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0542 c0542;
        if (Build.VERSION.SDK_INT >= 28 || (c0542 = this.f1386) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0542.f2253;
        return textClassifier == null ? AbstractC0226.m1279((TextView) c0542.f2252) : textClassifier;
    }

    public C2385 getTextMetricsParamsCompat() {
        return AbstractC3453.m4998(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        
        C0232.m1290(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC3453.m5006(editorInfo, inputConnectionOnCreateInputConnection, this);
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
        C0232 c0232 = this.f1385;
        if (c0232 != null) {
            
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f1390;
        if (future != null) {
            try {
                this.f1390 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC3453.m4998(this);
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
        ((AbstractC1460) getEmojiTextViewHelper().f1347.f1049).mo2767(z);
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
        C0146 c0146 = this.f1384;
        if (c0146 != null) {
            c0146.m1177();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0146 c0146 = this.f1384;
        if (c0146 != null) {
            c0146.m1178(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0232 c0232 = this.f1385;
        if (c0232 != null) {
            c0232.m1292();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0232 c0232 = this.f1385;
        if (c0232 != null) {
            c0232.m1292();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0232 c0232 = this.f1385;
        if (c0232 != null) {
            c0232.m1292();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0232 c0232 = this.f1385;
        if (c0232 != null) {
            c0232.m1292();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3453.m5014(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1255(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC1460) getEmojiTextViewHelper().f1347.f1049).mo2765(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1114(i);
        } else {
            AbstractC3453.m5007(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1105(i);
        } else {
            AbstractC3453.m5008(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC3453.m5009(this, i);
    }

    public void setPrecomputedText(AbstractC2386 abstractC2386) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC3453.m4998(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0146 c0146 = this.f1384;
        if (c0146 != null) {
            c0146.m1186(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0146 c0146 = this.f1384;
        if (c0146 != null) {
            c0146.m1187(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0232 c0232 = this.f1385;
        c0232.m1297(colorStateList);
        c0232.m1292();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0232 c0232 = this.f1385;
        c0232.m1298(mode);
        c0232.m1292();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0232 c0232 = this.f1385;
        if (c0232 != null) {
            c0232.m1296(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0542 c0542;
        if (Build.VERSION.SDK_INT >= 28 || (c0542 = this.f1386) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0542.f2253 = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC2386> future) {
        this.f1390 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C2385 c2385) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c2385.f7646;
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
            } else if (false) {
                i = 6;
            } else if (false) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(c2385.f7645);
        setBreakStrategy(c2385.f7647);
        setHyphenationFrequency(c2385.f7648);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f1388) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC1459 abstractC1459 = AbstractC3460.f10933;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f1388 = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f1388 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0236(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC3401.m4926(context);
        this.f1388 = false;
        this.f1389 = null;
        AbstractC2918.m4917(this, getContext());
        C0146 c0146 = new C0146(this);
        this.f1384 = c0146;
        c0146.m1175(attributeSet, i);
        C0232 c0232 = new C0232(this);
        this.f1385 = c0232;
        c0232.m1295(attributeSet, i);
        c0232.m1292();
        C0542 c0542 = new C0542(4, false);
        c0542.f2252 = this;
        this.f1386 = c0542;
        getEmojiTextViewHelper().m1254(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().mo1117(i, f);
        } else if (false) {
            AbstractC0088.m1076(this, i, f);
        } else {
            AbstractC3453.m5009(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC3471.m5076(context, i) : null, i2 != 0 ? AbstractC3471.m5076(context, i2) : null, i3 != 0 ? AbstractC3471.m5076(context, i3) : null, i4 != 0 ? AbstractC3471.m5076(context, i4) : null);
        C0232 c0232 = this.f1385;
        if (c0232 != null) {
            c0232.m1292();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC3471.m5076(context, i) : null, i2 != 0 ? AbstractC3471.m5076(context, i2) : null, i3 != 0 ? AbstractC3471.m5076(context, i3) : null, i4 != 0 ? AbstractC3471.m5076(context, i4) : null);
        C0232 c0232 = this.f1385;
        if (c0232 != null) {
            c0232.m1292();
        }
    }
}
