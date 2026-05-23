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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᲇᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final ThreadLocal f8187 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final WeakHashMap f8188 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final Object f8189 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Typeface m4592(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m4593(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static Typeface m4593(Context context, int i, TypedValue typedValue, int i2, AbstractC3681 abstractC3681, boolean z, boolean z2) throws Exception {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM5045 = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            C1316 c1316 = AbstractC3460.f10934;
            Typeface typeface = (Typeface) c1316.m3033(AbstractC3460.m5046(resources, i, string, i3, i2));
            if (typeface != null) {
                if (abstractC3681 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1324(abstractC3681, 3, typeface));
                }
                typefaceM5045 = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC1379 interfaceC1379M5084 = AbstractC3471.m5084(resources.getXml(i), resources);
                        if (interfaceC1379M5084 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC3681 != null) {
                                abstractC3681.m5342(-3);
                            }
                        } else {
                            typefaceM5045 = AbstractC3460.m5045(context, interfaceC1379M5084, resources, i, string, typedValue.assetCookie, i2, abstractC3681, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceMo3203 = AbstractC3460.f10933.mo3203(context, resources, i, string, i2);
                        if (typefaceMo3203 != null) {
                            c1316.m3040(AbstractC3460.m5046(resources, i, string, i4, i2), typefaceMo3203);
                        }
                        if (abstractC3681 != null) {
                            if (typefaceMo3203 != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC1324(abstractC3681, 3, typefaceMo3203));
                            } else {
                                abstractC3681.m5342(-3);
                            }
                        }
                        typefaceM5045 = typefaceMo3203;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (abstractC3681 != null) {
                        abstractC3681.m5342(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (abstractC3681 != null) {
                        abstractC3681.m5342(-3);
                    }
                }
            }
        } else if (abstractC3681 != null) {
            abstractC3681.m5342(-3);
        }
        if (typefaceM5045 != null || abstractC3681 != null || z2) {
            return typefaceM5045;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
