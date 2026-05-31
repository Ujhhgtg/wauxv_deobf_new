package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᤝᤞᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3640 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final LinkedHashMap f11360 = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲇᲈᤝᛸ] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final View m5203(View view, String str, int... iArr) {
        ?? c2641;
        Integer num;
        boolean zM4869 = AbstractC2901.m4869(str);
        LinkedHashMap linkedHashMap = f11360;
        if (!zM4869 && (num = (Integer) linkedHashMap.get(str)) != null) {
            return view.findViewById(num.intValue());
        }
        try {
            int length = iArr.length;
            int i = 0;
            c2641 = view;
            while (i < length) {
                int i2 = iArr[i];
                if (!(c2641 instanceof ViewGroup) || i2 < 0 || i2 >= ((ViewGroup) c2641).getChildCount()) {
                    break;
                }
                i++;
                c2641 = ((ViewGroup) c2641).getChildAt(i2);
            }
            if (!AbstractC2901.m4869(str) && !AbstractC1469.m3322(c2641, view)) {
                linkedHashMap.put(str, Integer.valueOf(c2641.getId()));
            }
            if (c2641 == 0) {
                c2641 = 0;
            }
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        return (View) (c2641 instanceof C2641 ? 0 : c2641);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static View m5204(ViewGroup viewGroup, int[] iArr) {
        return m5203(viewGroup, "", iArr);
    }
}
