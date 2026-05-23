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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᤝᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0218 extends EditText implements InterfaceC2285 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0146 f1340;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0232 f1341;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0542 f1342;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2914 f1343;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0542 f1344;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0217 f1345;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0218(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC3401.m4926(context);
        AbstractC2918.m4917(this, getContext());
        C0146 c0146 = new C0146(this);
        this.f1340 = c0146;
        c0146.m1175(attributeSet, R.attr.editTextStyle);
        C0232 c0232 = new C0232(this);
        this.f1341 = c0232;
        c0232.m1295(attributeSet, R.attr.editTextStyle);
        c0232.m1292();
        C0542 c0542 = new C0542(4, false);
        c0542.f2252 = this;
        this.f1342 = c0542;
        this.f1343 = new C2914();
        C0542 c0543 = new C0542(this, 3);
        this.f1344 = c0543;
        c0543.m1896(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM1890 = c0543.m1890(keyListener);
        if (keyListenerM1890 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM1890);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C0217 getSuperCaller() {
        if (this.f1345 == null) {
            this.f1345 = new C0217(this);
        }
        return this.f1345;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0146 c0146 = this.f1340;
        if (c0146 != null) {
            c0146.m1154();
        }
        C0232 c0232 = this.f1341;
        if (c0232 != null) {
            c0232.m1292();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC2913 ? ((ActionModeCallbackC2913) customSelectionActionModeCallback).f9362 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0146 c0146 = this.f1340;
        if (c0146 != null) {
            return c0146.m1172();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0146 c0146 = this.f1340;
        if (c0146 != null) {
            return c0146.m1173();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1341.m1293();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1341.m1294();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0542 c0542;
        if (Build.VERSION.SDK_INT >= 28 || (c0542 = this.f1342) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0542.f2253;
        return textClassifier == null ? AbstractC0226.m1279((TextView) c0542.f2252) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM5171;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1341.getClass();
        C0232.m1290(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC3453.m5006(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrM5171 = AbstractC3578.m5171(this)) != null) {
            editorInfo.contentMimeTypes = strArrM5171;
            inputConnectionOnCreateInputConnection = new C1642(inputConnectionOnCreateInputConnection, new C0466(this));
        }
        return this.f1344.m1899(inputConnectionOnCreateInputConnection, editorInfo);
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
        boolean zM1277 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC3578.m5171(this) != null) {
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
                zM1277 = AbstractC0225.m1277(dragEvent, this, activity);
            }
        }
        if (zM1277) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C0835 c0835;
        InterfaceC0834 interfaceC0834;
        int i2;
        C0094 c0094;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || AbstractC3578.m5171(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                c0094 = new C0094(primaryClip, 1);
            } else {
                c0835 = new C0835();
                c0835.f3231 = primaryClip;
                c0835.f3232 = 1;
            }
            if (i == 16908322) {
                interfaceC0834 = c0835;
                interfaceC0834 = c0094;
                i2 = 0;
            } else {
                interfaceC0834 = c0835;
                interfaceC0834 = c0094;
                i2 = 1;
            }
            interfaceC0834.mo1104(i2);
            AbstractC3578.m5173(this, interfaceC0834.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0146 c0146 = this.f1340;
        if (c0146 != null) {
            c0146.m1177();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0146 c0146 = this.f1340;
        if (c0146 != null) {
            c0146.m1178(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0232 c0232 = this.f1341;
        if (c0232 != null) {
            c0232.m1292();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0232 c0232 = this.f1341;
        if (c0232 != null) {
            c0232.m1292();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3453.m5014(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1344.m1916(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1344.m1890(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0146 c0146 = this.f1340;
        if (c0146 != null) {
            c0146.m1186(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0146 c0146 = this.f1340;
        if (c0146 != null) {
            c0146.m1187(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0232 c0232 = this.f1341;
        c0232.m1297(colorStateList);
        c0232.m1292();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0232 c0232 = this.f1341;
        c0232.m1298(mode);
        c0232.m1292();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0232 c0232 = this.f1341;
        if (c0232 != null) {
            c0232.m1296(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0542 c0542;
        if (Build.VERSION.SDK_INT >= 28 || (c0542 = this.f1342) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0542.f2253 = textClassifier;
        }
    }

    @Override // p000.InterfaceC2285
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0837 mo1253(C0837 c0837) {
        this.f1343.getClass();
        return C2914.m4916(this, c0837);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
