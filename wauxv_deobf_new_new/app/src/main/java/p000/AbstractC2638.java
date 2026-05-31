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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲇᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2638 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final ThreadLocal f8340 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final WeakHashMap f8341 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final Object f8342 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Typeface m4614(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m4615(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static Typeface m4615(Context context, int i, TypedValue typedValue, int i2, AbstractC1469 abstractC1469, boolean z, boolean z2) throws Exception {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM5070 = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            C1317 c1317 = AbstractC3516.f11090;
            Typeface typeface = (Typeface) c1317.m3136(AbstractC3516.m5071(resources, i, string, i3, i2));
            if (typeface != null) {
                if (abstractC1469 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1326(abstractC1469, 3, typeface));
                }
                typefaceM5070 = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC1387 interfaceC1387M3480 = AbstractC1586.m3480(resources.getXml(i), resources);
                        if (interfaceC1387M3480 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC1469 != null) {
                                abstractC1469.m3357(-3);
                            }
                        } else {
                            typefaceM5070 = AbstractC3516.m5070(context, interfaceC1387M3480, resources, i, string, typedValue.assetCookie, i2, abstractC1469, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceMo3494 = AbstractC3516.f11089.mo3494(context, resources, i, string, i2);
                        if (typefaceMo3494 != null) {
                            c1317.m3143(AbstractC3516.m5071(resources, i, string, i4, i2), typefaceMo3494);
                        }
                        if (abstractC1469 != null) {
                            if (typefaceMo3494 != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC1326(abstractC1469, 3, typefaceMo3494));
                            } else {
                                abstractC1469.m3357(-3);
                            }
                        }
                        typefaceM5070 = typefaceMo3494;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (abstractC1469 != null) {
                        abstractC1469.m3357(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (abstractC1469 != null) {
                        abstractC1469.m3357(-3);
                    }
                }
            }
        } else if (abstractC1469 != null) {
            abstractC1469.m3357(-3);
        }
        if (typefaceM5070 != null || abstractC1469 != null || z2) {
            return typefaceM5070;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
