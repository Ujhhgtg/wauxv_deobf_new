package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import p000.InterfaceC2637;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class DialogScrollView extends NestedScrollView implements InterfaceC2637 {
    public DialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getScrollDistance() {
        return getScrollY();
    }
}
