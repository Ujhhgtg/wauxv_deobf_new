package me.hd.wauxv.ui.setting.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p000.AbstractC2467;
import p000.AbstractC3471;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ModuleTabItem extends View {

    public final CharSequence f972;

    public final Drawable f973;

    public final int f974;

    public ModuleTabItem(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2467.f7867);
        this.f972 = typedArrayObtainStyledAttributes.getText(2);
        this.f973 = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC3471.m5076(context, resourceId);
        this.f974 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
