package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᛸᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3580 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final LinkedHashMap f11211 = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᲇᲈᤝᤞ] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final View m5197(View view, String str, int... iArr) {
        ?? c2585;
        Integer num;
        boolean zM4836 = AbstractC2841.m4836(str);
        LinkedHashMap linkedHashMap = f11211;
        if (!zM4836 && (num = (Integer) linkedHashMap.get(str)) != null) {
            return view.findViewById(num.intValue());
        }
        try {
            int length = iArr.length;
            int i = 0;
            c2585 = view;
            while (i < length) {
                int i2 = iArr[i];
                if (!(c2585 instanceof ViewGroup) || i2 < 0 || i2 >= ((ViewGroup) c2585).getChildCount()) {
                    break;
                }
                i++;
                c2585 = ((ViewGroup) c2585).getChildAt(i2);
            }
            if (!AbstractC2841.m4836(str) && !AbstractC2207.m4087(c2585, view)) {
                linkedHashMap.put(str, Integer.valueOf(c2585.getId()));
            }
            if (c2585 == 0) {
                c2585 = 0;
            }
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        return (View) (c2585 instanceof C2585 ? 0 : c2585);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static View m5198(ViewGroup viewGroup, int[] iArr) {
        return m5197(viewGroup, "", iArr);
    }
}
