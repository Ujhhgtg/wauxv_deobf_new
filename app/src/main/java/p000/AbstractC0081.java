package p000;

import android.graphics.Typeface;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0081 {
    public static /* synthetic */ Typeface.CustomFallbackBuilder m1001(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable m1002(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ FontFamily.Builder m1006(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ void m1011() {
    }

    public static /* bridge */ /* synthetic */ boolean m1020(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* synthetic */ void m1024() {
    }
}
