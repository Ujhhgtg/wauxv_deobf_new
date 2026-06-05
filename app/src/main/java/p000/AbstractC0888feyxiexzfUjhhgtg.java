package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0888feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final ThreadLocal f3430Ujhhgtgfeyxiexzf = new ThreadLocal();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final WeakHashMap f3431Ujhhgtgfeyxiexzf = new WeakHashMap(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final Object f3432Ujhhgtgfeyxiexzf = new Object();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static Typeface m2366Ujhhgtgfeyxiexzf(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m2367Ujhhgtgfeyxiexzf(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static Typeface m2367Ujhhgtgfeyxiexzf(Context context, int i, TypedValue typedValue, int i2, AbstractC1791feyxiexzfUjhhgtg abstractC1791feyxiexzfUjhhgtg, boolean z, boolean z2) throws Exception {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM3093Ujhhgtgfeyxiexzf = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg = AbstractC1771Ujhhgtgfeyxiexzf.f5945Ujhhgtgfeyxiexzf;
            Typeface typeface = (Typeface) c3434feyxiexzfUjhhgtg.m4930Ujhhgtgfeyxiexzf(AbstractC1771Ujhhgtgfeyxiexzf.m3094Ujhhgtgfeyxiexzf(resources, i, string, i3, i2));
            if (typeface != null) {
                if (abstractC1791feyxiexzfUjhhgtg != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC3468feyxiexzfUjhhgtg(abstractC1791feyxiexzfUjhhgtg, 3, typeface));
                }
                typefaceM3093Ujhhgtgfeyxiexzf = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC3631Ujhhgtgfeyxiexzf interfaceC3631UjhhgtgfeyxiexzfM5224Ujhhgtgfeyxiexzf = AbstractC3611Ujhhgtgfeyxiexzf.m5224Ujhhgtgfeyxiexzf(resources.getXml(i), resources);
                        if (interfaceC3631UjhhgtgfeyxiexzfM5224Ujhhgtgfeyxiexzf == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC1791feyxiexzfUjhhgtg != null) {
                                abstractC1791feyxiexzfUjhhgtg.m3161Ujhhgtgfeyxiexzf(-3);
                            }
                        } else {
                            typefaceM3093Ujhhgtgfeyxiexzf = AbstractC1771Ujhhgtgfeyxiexzf.m3093Ujhhgtgfeyxiexzf(context, interfaceC3631UjhhgtgfeyxiexzfM5224Ujhhgtgfeyxiexzf, resources, i, string, typedValue.assetCookie, i2, abstractC1791feyxiexzfUjhhgtg, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceMo3106feyxiexzfUjhhgtg = AbstractC1771Ujhhgtgfeyxiexzf.f5944Ujhhgtgfeyxiexzf.mo3106feyxiexzfUjhhgtg(context, resources, i, string, i2);
                        if (typefaceMo3106feyxiexzfUjhhgtg != null) {
                            c3434feyxiexzfUjhhgtg.m4937Ujhhgtgfeyxiexzf(AbstractC1771Ujhhgtgfeyxiexzf.m3094Ujhhgtgfeyxiexzf(resources, i, string, i4, i2), typefaceMo3106feyxiexzfUjhhgtg);
                        }
                        if (abstractC1791feyxiexzfUjhhgtg != null) {
                            if (typefaceMo3106feyxiexzfUjhhgtg != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC3468feyxiexzfUjhhgtg(abstractC1791feyxiexzfUjhhgtg, 3, typefaceMo3106feyxiexzfUjhhgtg));
                            } else {
                                abstractC1791feyxiexzfUjhhgtg.m3161Ujhhgtgfeyxiexzf(-3);
                            }
                        }
                        typefaceM3093Ujhhgtgfeyxiexzf = typefaceMo3106feyxiexzfUjhhgtg;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (abstractC1791feyxiexzfUjhhgtg != null) {
                        abstractC1791feyxiexzfUjhhgtg.m3161Ujhhgtgfeyxiexzf(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (abstractC1791feyxiexzfUjhhgtg != null) {
                        abstractC1791feyxiexzfUjhhgtg.m3161Ujhhgtgfeyxiexzf(-3);
                    }
                }
            }
        } else if (abstractC1791feyxiexzfUjhhgtg != null) {
            abstractC1791feyxiexzfUjhhgtg.m3161Ujhhgtgfeyxiexzf(-3);
        }
        if (typefaceM3093Ujhhgtgfeyxiexzf != null || abstractC1791feyxiexzfUjhhgtg != null || z2) {
            return typefaceM3093Ujhhgtgfeyxiexzf;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
