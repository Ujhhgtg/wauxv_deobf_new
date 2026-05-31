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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᲀᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0228 extends EditText implements InterfaceC2317 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0154 f1414;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0242 f1415;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0519 f1416;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2973 f1417;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0519 f1418;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C0227 f1419;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0228(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC3460.m4988(context);
        AbstractC2977.m4979(this, getContext());
        C0154 c0154 = new C0154(this);
        this.f1414 = c0154;
        c0154.m1321(attributeSet, R.attr.editTextStyle);
        C0242 c0242 = new C0242(this);
        this.f1415 = c0242;
        c0242.m1441(attributeSet, R.attr.editTextStyle);
        c0242.m1438();
        C0519 c0519 = new C0519(4, false);
        c0519.f2208 = this;
        this.f1416 = c0519;
        this.f1417 = new C2973();
        C0519 c05110 = new C0519(this, 3);
        this.f1418 = c05110;
        c05110.m1990(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM1984 = c05110.m1984(keyListener);
        if (keyListenerM1984 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM1984);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C0227 getSuperCaller() {
        if (this.f1419 == null) {
            this.f1419 = new C0227(this);
        }
        return this.f1419;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0154 c0154 = this.f1414;
        if (c0154 != null) {
            c0154.m1300();
        }
        C0242 c0242 = this.f1415;
        if (c0242 != null) {
            c0242.m1438();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC2972 ? ((ActionModeCallbackC2972) customSelectionActionModeCallback).f9529 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0154 c0154 = this.f1414;
        if (c0154 != null) {
            return c0154.m1318();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0154 c0154 = this.f1414;
        if (c0154 != null) {
            return c0154.m1319();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1415.m1439();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1415.m1440();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0519 c0519;
        if (Build.VERSION.SDK_INT >= 28 || (c0519 = this.f1416) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0519.f2209;
        return textClassifier == null ? AbstractC0236.m1425((TextView) c0519.f2208) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM5177;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1415.getClass();
        C0242.m1436(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC2727.m4709(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrM5177 = AbstractC3638.m5177(this)) != null) {
            editorInfo.contentMimeTypes = strArrM5177;
            inputConnectionOnCreateInputConnection = new C1656(inputConnectionOnCreateInputConnection, new C0441(this));
        }
        return this.f1418.m1993(inputConnectionOnCreateInputConnection, editorInfo);
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
        boolean zM1423 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC3638.m5177(this) != null) {
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
                zM1423 = AbstractC0235.m1423(dragEvent, this, activity);
            }
        }
        if (zM1423) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C0834 c0834;
        InterfaceC0833 interfaceC0833;
        int i2;
        C0102 c0102;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || AbstractC3638.m5177(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                c0102 = new C0102(primaryClip, 1);
            } else {
                c0834 = new C0834();
                c0834.f3238 = primaryClip;
                c0834.f3239 = 1;
            }
            if (i == 16908322) {
                interfaceC0833 = c0834;
                interfaceC0833 = c0102;
                i2 = 0;
            } else {
                interfaceC0833 = c0834;
                interfaceC0833 = c0102;
                i2 = 1;
            }
            interfaceC0833.mo1250(i2);
            AbstractC3638.m5179(this, interfaceC0833.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0154 c0154 = this.f1414;
        if (c0154 != null) {
            c0154.m1323();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0154 c0154 = this.f1414;
        if (c0154 != null) {
            c0154.m1324(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0242 c0242 = this.f1415;
        if (c0242 != null) {
            c0242.m1438();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0242 c0242 = this.f1415;
        if (c0242 != null) {
            c0242.m1438();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0972.m2613(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1418.m2010(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1418.m1984(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0154 c0154 = this.f1414;
        if (c0154 != null) {
            c0154.m1332(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0154 c0154 = this.f1414;
        if (c0154 != null) {
            c0154.m1333(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0242 c0242 = this.f1415;
        c0242.m1443(colorStateList);
        c0242.m1438();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0242 c0242 = this.f1415;
        c0242.m1444(mode);
        c0242.m1438();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0242 c0242 = this.f1415;
        if (c0242 != null) {
            c0242.m1442(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0519 c0519;
        if (Build.VERSION.SDK_INT >= 28 || (c0519 = this.f1416) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0519.f2209 = textClassifier;
        }
    }

    @Override // p000.InterfaceC2317
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0836 mo1399(C0836 c0836) {
        this.f1417.getClass();
        return C2973.m4978(this, c0836);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
