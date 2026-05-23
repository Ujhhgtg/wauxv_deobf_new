package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0133 extends C0222 implements InterfaceC0137 {

    public final /* synthetic */ C0136 f1102;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0133(C0136 c0136, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f1102 = c0136;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC3419.m4935(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC0128(this, this));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f1102.m1146();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }

    @Override // p000.InterfaceC0137
    public final boolean mo1() {
        return false;
    }

    @Override // p000.InterfaceC0137
    public final boolean mo3() {
        return false;
    }
}
