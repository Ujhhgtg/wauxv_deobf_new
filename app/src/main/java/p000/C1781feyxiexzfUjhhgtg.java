package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛴᛱfeyxiexzfᛱ要点脸能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1781feyxiexzfUjhhgtg extends AbstractC2855feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public static Font m3110feyxiexzfUjhhgtg(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM3111feyxiexzfUjhhgtg = m3111feyxiexzfUjhhgtg(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM3111feyxiexzfUjhhgtg2 = m3111feyxiexzfUjhhgtg(fontStyle, font2.getStyle());
            if (iM3111feyxiexzfUjhhgtg2 < iM3111feyxiexzfUjhhgtg) {
                font = font2;
                iM3111feyxiexzfUjhhgtg = iM3111feyxiexzfUjhhgtg2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static int m3111feyxiexzfUjhhgtg(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p000.AbstractC2855feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public final Typeface mo3104Ujhhgtgfeyxiexzf(Context context, C3632Ujhhgtgfeyxiexzf c3632Ujhhgtgfeyxiexzf, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C3633feyxiexzfUjhhgtg c3633feyxiexzfUjhhgtg : c3632Ujhhgtgfeyxiexzf.f11349Ujhhgtgfeyxiexzf) {
                try {
                    Font fontBuild = new Font.Builder(resources, c3633feyxiexzfUjhhgtg.f11355Ujhhgtgfeyxiexzf).setWeight(c3633feyxiexzfUjhhgtg.f11351Ujhhgtgfeyxiexzf).setSlant(c3633feyxiexzfUjhhgtg.f11352Ujhhgtgfeyxiexzf ? 1 : 0).setTtcIndex(c3633feyxiexzfUjhhgtg.f11354Ujhhgtgfeyxiexzf).setFontVariationSettings(c3633feyxiexzfUjhhgtg.f11353Ujhhgtgfeyxiexzf).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m3110feyxiexzfUjhhgtg(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p000.AbstractC2855feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public final Typeface mo3105Ujhhgtgfeyxiexzf(Context context, C3635Ujhhgtgfeyxiexzf[] c3635UjhhgtgfeyxiexzfArr, int i) {
        try {
            FontFamily fontFamilyM3113feyxiexzfUjhhgtg = m3113feyxiexzfUjhhgtg(c3635UjhhgtgfeyxiexzfArr, context.getContentResolver());
            if (fontFamilyM3113feyxiexzfUjhhgtg == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM3113feyxiexzfUjhhgtg).setStyle(m3110feyxiexzfUjhhgtg(fontFamilyM3113feyxiexzfUjhhgtg, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p000.AbstractC2855feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final Typeface mo3112Ujhhgtgfeyxiexzf(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM3113feyxiexzfUjhhgtg = m3113feyxiexzfUjhhgtg((C3635Ujhhgtgfeyxiexzf[]) list.get(0), contentResolver);
            if (fontFamilyM3113feyxiexzfUjhhgtg == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM3113feyxiexzfUjhhgtg);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyM3113feyxiexzfUjhhgtg2 = m3113feyxiexzfUjhhgtg((C3635Ujhhgtgfeyxiexzf[]) list.get(i2), contentResolver);
                if (fontFamilyM3113feyxiexzfUjhhgtg2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM3113feyxiexzfUjhhgtg2);
                }
            }
            return customFallbackBuilder.setStyle(m3110feyxiexzfUjhhgtg(fontFamilyM3113feyxiexzfUjhhgtg, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p000.AbstractC2855feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ */
    public final Typeface mo3106feyxiexzfUjhhgtg(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final FontFamily m3113feyxiexzfUjhhgtg(C3635Ujhhgtgfeyxiexzf[] c3635UjhhgtgfeyxiexzfArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (C3635Ujhhgtgfeyxiexzf c3635Ujhhgtgfeyxiexzf : c3635UjhhgtgfeyxiexzfArr) {
            if (Objects.equals(c3635Ujhhgtgfeyxiexzf.f11360Ujhhgtgfeyxiexzf.getScheme(), "systemfont")) {
                fontBuild = mo3109feyxiexzfUjhhgtg(c3635Ujhhgtgfeyxiexzf);
            } else {
                try {
                    Uri uri = c3635Ujhhgtgfeyxiexzf.f11360Ujhhgtgfeyxiexzf;
                    String str = c3635Ujhhgtgfeyxiexzf.f11364Ujhhgtgfeyxiexzf;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c3635Ujhhgtgfeyxiexzf.f11362Ujhhgtgfeyxiexzf).setSlant(c3635Ujhhgtgfeyxiexzf.f11363Ujhhgtgfeyxiexzf ? 1 : 0).setTtcIndex(c3635Ujhhgtgfeyxiexzf.f11361Ujhhgtgfeyxiexzf);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ */
    public Font mo3109feyxiexzfUjhhgtg(C3635Ujhhgtgfeyxiexzf c3635Ujhhgtgfeyxiexzf) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
