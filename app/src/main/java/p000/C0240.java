package p000;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0240 {

    public int f1391 = 0;

    public float f1392 = -1.0f;

    public float f1393 = -1.0f;

    public float f1394 = -1.0f;

    public int[] f1395 = new int[0];

    public boolean f1396 = false;

    public final TextView f1397;

    public final Context f1398;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public C0240(TextView textView) {
        this.f1397 = textView;
        this.f1398 = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new C0238();
        } else {
            new C0237();
        }
    }

    public static int[] m1303(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean m1304() {
        return !(this.f1397 instanceof AbstractC0218);
    }
}
