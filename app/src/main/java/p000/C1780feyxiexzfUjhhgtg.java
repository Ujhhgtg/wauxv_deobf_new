package p000;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛴᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1780feyxiexzfUjhhgtg extends C1781feyxiexzfUjhhgtg {
    @Override // p000.C1781feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final Font mo3109feyxiexzfUjhhgtg(C3635Ujhhgtgfeyxiexzf c3635Ujhhgtgfeyxiexzf) {
        Font fontM3096Ujhhgtgfeyxiexzf;
        Uri uri = c3635Ujhhgtgfeyxiexzf.f11360Ujhhgtgfeyxiexzf;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = c3635Ujhhgtgfeyxiexzf.f11364Ujhhgtgfeyxiexzf;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontM3096Ujhhgtgfeyxiexzf = AbstractC1771Ujhhgtgfeyxiexzf.m3096Ujhhgtgfeyxiexzf(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontM3096Ujhhgtgfeyxiexzf;
                }
                try {
                    return new Font.Builder(fontM3096Ujhhgtgfeyxiexzf).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
