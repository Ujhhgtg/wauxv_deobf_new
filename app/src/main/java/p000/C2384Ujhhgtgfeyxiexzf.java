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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛳ要点脸ᛱfeyxiexzfᛱᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2384Ujhhgtgfeyxiexzf extends TextView {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3017Ujhhgtgfeyxiexzf f7758Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2353Ujhhgtgfeyxiexzf f7759Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f7760Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C2342Ujhhgtgfeyxiexzf f7761Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f7762Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public C2965Ujhhgtgfeyxiexzf f7763Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public Future f7764Ujhhgtgfeyxiexzf;

    public C2384Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C2342Ujhhgtgfeyxiexzf getEmojiTextViewHelper() {
        if (this.f7761Ujhhgtgfeyxiexzf == null) {
            this.f7761Ujhhgtgfeyxiexzf = new C2342Ujhhgtgfeyxiexzf(this);
        }
        return this.f7761Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7758Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4464Ujhhgtgfeyxiexzf();
        }
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7759Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
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
        return customSelectionActionModeCallback instanceof ActionModeCallbackC1976Ujhhgtgfeyxiexzf ? ((ActionModeCallbackC1976Ujhhgtgfeyxiexzf) customSelectionActionModeCallback).f6482Ujhhgtgfeyxiexzf : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC2356Ujhhgtgfeyxiexzf getSuperCaller() {
        if (this.f7763Ujhhgtgfeyxiexzf == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f7763Ujhhgtgfeyxiexzf = new C2383Ujhhgtgfeyxiexzf(this);
            } else if (i >= 28) {
                this.f7763Ujhhgtgfeyxiexzf = new C2355Ujhhgtgfeyxiexzf(this);
            } else {
                this.f7763Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(3, this);
            }
        }
        return this.f7763Ujhhgtgfeyxiexzf;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7758Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            return c3017Ujhhgtgfeyxiexzf.m4482Ujhhgtgfeyxiexzf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7758Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            return c3017Ujhhgtgfeyxiexzf.m4483Ujhhgtgfeyxiexzf();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7759Ujhhgtgfeyxiexzf.m3560Ujhhgtgfeyxiexzf();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7759Ujhhgtgfeyxiexzf.m3561Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f7764Ujhhgtgfeyxiexzf;
        if (future != null) {
            try {
                this.f7764Ujhhgtgfeyxiexzf = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC1265feyxiexzfUjhhgtg.m2829Ujhhgtgfeyxiexzf(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf;
        if (Build.VERSION.SDK_INT >= 28 || (c2629Ujhhgtgfeyxiexzf = this.f7760Ujhhgtgfeyxiexzf) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf;
        return textClassifier == null ? AbstractC2347Ujhhgtgfeyxiexzf.m3553Ujhhgtgfeyxiexzf((TextView) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf) : textClassifier;
    }

    public C1447feyxiexzfUjhhgtg getTextMetricsParamsCompat() {
        return AbstractC1265feyxiexzfUjhhgtg.m2829Ujhhgtgfeyxiexzf(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f7759Ujhhgtgfeyxiexzf.getClass();
        C2353Ujhhgtgfeyxiexzf.m3557Ujhhgtgfeyxiexzf(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC1264feyxiexzfUjhhgtg.m2799Ujhhgtgfeyxiexzf(editorInfo, inputConnectionOnCreateInputConnection, this);
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
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7759Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f7764Ujhhgtgfeyxiexzf;
        if (future != null) {
            try {
                this.f7764Ujhhgtgfeyxiexzf = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC1265feyxiexzfUjhhgtg.m2829Ujhhgtgfeyxiexzf(this);
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
        ((AbstractC1246feyxiexzfUjhhgtg) getEmojiTextViewHelper().f7644Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).mo2777Ujhhgtgfeyxiexzf(z);
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
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7758Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4487feyxiexzfUjhhgtg();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7758Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4488feyxiexzfUjhhgtg(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7759Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7759Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7759Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7759Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1265feyxiexzfUjhhgtg.m2841Ujhhgtgfeyxiexzf(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m3533Ujhhgtgfeyxiexzf(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC1246feyxiexzfUjhhgtg) getEmojiTextViewHelper().f7644Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).mo2775Ujhhgtgfeyxiexzf(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo3569Ujhhgtgfeyxiexzf(i);
        } else {
            AbstractC1265feyxiexzfUjhhgtg.m2835Ujhhgtgfeyxiexzf(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo3568Ujhhgtgfeyxiexzf(i);
        } else {
            AbstractC1265feyxiexzfUjhhgtg.m2836Ujhhgtgfeyxiexzf(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC1265feyxiexzfUjhhgtg.m2837Ujhhgtgfeyxiexzf(this, i);
    }

    public void setPrecomputedText(AbstractC1446feyxiexzfUjhhgtg abstractC1446feyxiexzfUjhhgtg) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC1265feyxiexzfUjhhgtg.m2829Ujhhgtgfeyxiexzf(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7758Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4496feyxiexzfUjhhgtg(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7758Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4497feyxiexzfUjhhgtg(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7759Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3564Ujhhgtgfeyxiexzf(colorStateList);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7759Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3565Ujhhgtgfeyxiexzf(mode);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7759Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3563Ujhhgtgfeyxiexzf(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf;
        if (Build.VERSION.SDK_INT >= 28 || (c2629Ujhhgtgfeyxiexzf = this.f7760Ujhhgtgfeyxiexzf) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC1446feyxiexzfUjhhgtg> future) {
        this.f7764Ujhhgtgfeyxiexzf = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C1447feyxiexzfUjhhgtg c1447feyxiexzfUjhhgtg) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c1447feyxiexzfUjhhgtg.f5056Ujhhgtgfeyxiexzf;
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
        getPaint().set(c1447feyxiexzfUjhhgtg.f5055Ujhhgtgfeyxiexzf);
        setBreakStrategy(c1447feyxiexzfUjhhgtg.f5057Ujhhgtgfeyxiexzf);
        setHyphenationFrequency(c1447feyxiexzfUjhhgtg.f5058Ujhhgtgfeyxiexzf);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f7762Ujhhgtgfeyxiexzf) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC2855feyxiexzfUjhhgtg abstractC2855feyxiexzfUjhhgtg = AbstractC1771Ujhhgtgfeyxiexzf.f5944Ujhhgtgfeyxiexzf;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f7762Ujhhgtgfeyxiexzf = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f7762Ujhhgtgfeyxiexzf = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2384Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1745Ujhhgtgfeyxiexzf.m3004Ujhhgtgfeyxiexzf(context);
        this.f7762Ujhhgtgfeyxiexzf = false;
        this.f7763Ujhhgtgfeyxiexzf = null;
        AbstractC2008feyxiexzfUjhhgtg.m3348Ujhhgtgfeyxiexzf(this, getContext());
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = new C3017Ujhhgtgfeyxiexzf(this);
        this.f7758Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf;
        c3017Ujhhgtgfeyxiexzf.m4485feyxiexzfUjhhgtg(attributeSet, i);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = new C2353Ujhhgtgfeyxiexzf(this);
        this.f7759Ujhhgtgfeyxiexzf = c2353Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3562Ujhhgtgfeyxiexzf(attributeSet, i);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(4, false);
        c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf = this;
        this.f7760Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf;
        getEmojiTextViewHelper().m3532Ujhhgtgfeyxiexzf(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().mo3570Ujhhgtgfeyxiexzf(i, f);
        } else if (i2 >= 34) {
            AbstractC2959feyxiexzfUjhhgtg.m4419Ujhhgtgfeyxiexzf(this, i, f);
        } else {
            AbstractC1265feyxiexzfUjhhgtg.m2837Ujhhgtgfeyxiexzf(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context, i) : null, i2 != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context, i2) : null, i3 != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context, i3) : null, i4 != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context, i4) : null);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7759Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context, i) : null, i2 != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context, i2) : null, i3 != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context, i3) : null, i4 != 0 ? AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context, i4) : null);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7759Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }
}
