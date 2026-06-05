package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲ要点脸ᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2359Ujhhgtgfeyxiexzf extends AutoCompleteTextView {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final int[] f7684Ujhhgtgfeyxiexzf = {R.attr.popupBackground};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3017Ujhhgtgfeyxiexzf f7685Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2353Ujhhgtgfeyxiexzf f7686Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f7687Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2359Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, me.hd.wauxv.R.attr.autoCompleteTextViewStyle);
        AbstractC1745Ujhhgtgfeyxiexzf.m3004Ujhhgtgfeyxiexzf(context);
        AbstractC2008feyxiexzfUjhhgtg.m3348Ujhhgtgfeyxiexzf(this, getContext());
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3592Ujhhgtgfeyxiexzf(getContext(), attributeSet, f7684Ujhhgtgfeyxiexzf, me.hd.wauxv.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf).hasValue(0)) {
            setDropDownBackgroundDrawable(c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(0));
        }
        c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = new C3017Ujhhgtgfeyxiexzf(this);
        this.f7685Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf;
        c3017Ujhhgtgfeyxiexzf.m4485feyxiexzfUjhhgtg(attributeSet, me.hd.wauxv.R.attr.autoCompleteTextViewStyle);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = new C2353Ujhhgtgfeyxiexzf(this);
        this.f7686Ujhhgtgfeyxiexzf = c2353Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3562Ujhhgtgfeyxiexzf(attributeSet, me.hd.wauxv.R.attr.autoCompleteTextViewStyle);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(this, 3);
        this.f7687Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf;
        c2629Ujhhgtgfeyxiexzf.m3946feyxiexzfUjhhgtg(attributeSet, me.hd.wauxv.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM3940Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf.m3940Ujhhgtgfeyxiexzf(keyListener);
        if (keyListenerM3940Ujhhgtgfeyxiexzf == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM3940Ujhhgtgfeyxiexzf);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7685Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4464Ujhhgtgfeyxiexzf();
        }
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7686Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC1976Ujhhgtgfeyxiexzf ? ((ActionModeCallbackC1976Ujhhgtgfeyxiexzf) customSelectionActionModeCallback).f6482Ujhhgtgfeyxiexzf : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7685Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            return c3017Ujhhgtgfeyxiexzf.m4482Ujhhgtgfeyxiexzf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7685Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            return c3017Ujhhgtgfeyxiexzf.m4483Ujhhgtgfeyxiexzf();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7686Ujhhgtgfeyxiexzf.m3560Ujhhgtgfeyxiexzf();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7686Ujhhgtgfeyxiexzf.m3561Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1264feyxiexzfUjhhgtg.m2799Ujhhgtgfeyxiexzf(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f7687Ujhhgtgfeyxiexzf.m3949feyxiexzfUjhhgtg(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7685Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4487feyxiexzfUjhhgtg();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7685Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4488feyxiexzfUjhhgtg(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7686Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7686Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1265feyxiexzfUjhhgtg.m2841Ujhhgtgfeyxiexzf(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f7687Ujhhgtgfeyxiexzf.m3966feyxiexzfUjhhgtg(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f7687Ujhhgtgfeyxiexzf.m3940Ujhhgtgfeyxiexzf(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7685Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4496feyxiexzfUjhhgtg(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7685Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4497feyxiexzfUjhhgtg(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7686Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3564Ujhhgtgfeyxiexzf(colorStateList);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7686Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3565Ujhhgtgfeyxiexzf(mode);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7686Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3563Ujhhgtgfeyxiexzf(context, i);
        }
    }
}
