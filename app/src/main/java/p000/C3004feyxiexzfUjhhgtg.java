package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3004feyxiexzfUjhhgtg extends C2343Ujhhgtgfeyxiexzf implements InterfaceC3008Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C3007Ujhhgtgfeyxiexzf f9329Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3004feyxiexzfUjhhgtg(C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f9329Ujhhgtgfeyxiexzf = c3007Ujhhgtgfeyxiexzf;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC1763feyxiexzfUjhhgtg.m3059Ujhhgtgfeyxiexzf(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC2999feyxiexzfUjhhgtg(this, this));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f9329Ujhhgtgfeyxiexzf.m4458Ujhhgtgfeyxiexzf();
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

    @Override // p000.InterfaceC3008Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo1Ujhhgtgfeyxiexzf() {
        return false;
    }

    @Override // p000.InterfaceC3008Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final boolean mo3Ujhhgtgfeyxiexzf() {
        return false;
    }
}
