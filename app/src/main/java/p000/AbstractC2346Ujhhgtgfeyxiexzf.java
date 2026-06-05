package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ要点脸ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2346Ujhhgtgfeyxiexzf extends EditText implements InterfaceC1330feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3017Ujhhgtgfeyxiexzf f7652Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2353Ujhhgtgfeyxiexzf f7653Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f7654Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C2004feyxiexzfUjhhgtg f7655Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f7656Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public C2345Ujhhgtgfeyxiexzf f7657Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2346Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC1745Ujhhgtgfeyxiexzf.m3004Ujhhgtgfeyxiexzf(context);
        AbstractC2008feyxiexzfUjhhgtg.m3348Ujhhgtgfeyxiexzf(this, getContext());
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = new C3017Ujhhgtgfeyxiexzf(this);
        this.f7652Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf;
        c3017Ujhhgtgfeyxiexzf.m4485feyxiexzfUjhhgtg(attributeSet, R.attr.editTextStyle);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = new C2353Ujhhgtgfeyxiexzf(this);
        this.f7653Ujhhgtgfeyxiexzf = c2353Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3562Ujhhgtgfeyxiexzf(attributeSet, R.attr.editTextStyle);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(4, false);
        c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf = this;
        this.f7654Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf;
        this.f7655Ujhhgtgfeyxiexzf = new C2004feyxiexzfUjhhgtg();
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf2 = new C2629Ujhhgtgfeyxiexzf(this, 3);
        this.f7656Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf2;
        c2629Ujhhgtgfeyxiexzf2.m3946feyxiexzfUjhhgtg(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM3940Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf2.m3940Ujhhgtgfeyxiexzf(keyListener);
        if (keyListenerM3940Ujhhgtgfeyxiexzf == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM3940Ujhhgtgfeyxiexzf);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C2345Ujhhgtgfeyxiexzf getSuperCaller() {
        if (this.f7657Ujhhgtgfeyxiexzf == null) {
            this.f7657Ujhhgtgfeyxiexzf = new C2345Ujhhgtgfeyxiexzf(this);
        }
        return this.f7657Ujhhgtgfeyxiexzf;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7652Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4464Ujhhgtgfeyxiexzf();
        }
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7653Ujhhgtgfeyxiexzf;
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
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7652Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            return c3017Ujhhgtgfeyxiexzf.m4482Ujhhgtgfeyxiexzf();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7652Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            return c3017Ujhhgtgfeyxiexzf.m4483Ujhhgtgfeyxiexzf();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7653Ujhhgtgfeyxiexzf.m3560Ujhhgtgfeyxiexzf();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7653Ujhhgtgfeyxiexzf.m3561Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf;
        if (Build.VERSION.SDK_INT >= 28 || (c2629Ujhhgtgfeyxiexzf = this.f7654Ujhhgtgfeyxiexzf) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf;
        return textClassifier == null ? AbstractC2347Ujhhgtgfeyxiexzf.m3553Ujhhgtgfeyxiexzf((TextView) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM3259Ujhhgtgfeyxiexzf;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f7653Ujhhgtgfeyxiexzf.getClass();
        C2353Ujhhgtgfeyxiexzf.m3557Ujhhgtgfeyxiexzf(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC1264feyxiexzfUjhhgtg.m2799Ujhhgtgfeyxiexzf(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrM3259Ujhhgtgfeyxiexzf = AbstractC1901feyxiexzfUjhhgtg.m3259Ujhhgtgfeyxiexzf(this)) != null) {
            editorInfo.contentMimeTypes = strArrM3259Ujhhgtgfeyxiexzf;
            inputConnectionOnCreateInputConnection = new C0657Ujhhgtgfeyxiexzf(inputConnectionOnCreateInputConnection, new C2579Ujhhgtgfeyxiexzf(this));
        }
        return this.f7656Ujhhgtgfeyxiexzf.m3949feyxiexzfUjhhgtg(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM3554Ujhhgtgfeyxiexzf = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC1901feyxiexzfUjhhgtg.m3259Ujhhgtgfeyxiexzf(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM3554Ujhhgtgfeyxiexzf = AbstractC2348Ujhhgtgfeyxiexzf.m3554Ujhhgtgfeyxiexzf(dragEvent, this, activity);
            }
        }
        if (zM3554Ujhhgtgfeyxiexzf) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C3697Ujhhgtgfeyxiexzf c3697Ujhhgtgfeyxiexzf;
        InterfaceC3696feyxiexzfUjhhgtg interfaceC3696feyxiexzfUjhhgtg;
        int i2;
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || AbstractC1901feyxiexzfUjhhgtg.m3259Ujhhgtgfeyxiexzf(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(primaryClip, 1);
            } else {
                c3697Ujhhgtgfeyxiexzf = new C3697Ujhhgtgfeyxiexzf();
                c3697Ujhhgtgfeyxiexzf.f11728Ujhhgtgfeyxiexzf = primaryClip;
                c3697Ujhhgtgfeyxiexzf.f11729Ujhhgtgfeyxiexzf = 1;
            }
            if (i == 16908322) {
                interfaceC3696feyxiexzfUjhhgtg = c3697Ujhhgtgfeyxiexzf;
                interfaceC3696feyxiexzfUjhhgtg = c2965Ujhhgtgfeyxiexzf;
                i2 = 0;
            } else {
                interfaceC3696feyxiexzfUjhhgtg = c3697Ujhhgtgfeyxiexzf;
                interfaceC3696feyxiexzfUjhhgtg = c2965Ujhhgtgfeyxiexzf;
                i2 = 1;
            }
            interfaceC3696feyxiexzfUjhhgtg.mo4443Ujhhgtgfeyxiexzf(i2);
            AbstractC1901feyxiexzfUjhhgtg.m3261Ujhhgtgfeyxiexzf(this, interfaceC3696feyxiexzfUjhhgtg.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7652Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4487feyxiexzfUjhhgtg();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7652Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4488feyxiexzfUjhhgtg(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7653Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7653Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1265feyxiexzfUjhhgtg.m2841Ujhhgtgfeyxiexzf(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f7656Ujhhgtgfeyxiexzf.m3966feyxiexzfUjhhgtg(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f7656Ujhhgtgfeyxiexzf.m3940Ujhhgtgfeyxiexzf(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7652Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4496feyxiexzfUjhhgtg(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = this.f7652Ujhhgtgfeyxiexzf;
        if (c3017Ujhhgtgfeyxiexzf != null) {
            c3017Ujhhgtgfeyxiexzf.m4497feyxiexzfUjhhgtg(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7653Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3564Ujhhgtgfeyxiexzf(colorStateList);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7653Ujhhgtgfeyxiexzf;
        c2353Ujhhgtgfeyxiexzf.m3565Ujhhgtgfeyxiexzf(mode);
        c2353Ujhhgtgfeyxiexzf.m3559Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2353Ujhhgtgfeyxiexzf c2353Ujhhgtgfeyxiexzf = this.f7653Ujhhgtgfeyxiexzf;
        if (c2353Ujhhgtgfeyxiexzf != null) {
            c2353Ujhhgtgfeyxiexzf.m3563Ujhhgtgfeyxiexzf(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf;
        if (Build.VERSION.SDK_INT >= 28 || (c2629Ujhhgtgfeyxiexzf = this.f7654Ujhhgtgfeyxiexzf) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf = textClassifier;
        }
    }

    @Override // p000.InterfaceC1330feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final C3699feyxiexzfUjhhgtg mo2855Ujhhgtgfeyxiexzf(C3699feyxiexzfUjhhgtg c3699feyxiexzfUjhhgtg) {
        this.f7655Ujhhgtgfeyxiexzf.getClass();
        return C2004feyxiexzfUjhhgtg.m3347Ujhhgtgfeyxiexzf(this, c3699feyxiexzfUjhhgtg);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
