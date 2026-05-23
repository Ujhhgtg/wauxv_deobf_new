package p000;

import android.view.ViewGroup;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3582 {
    public static int m5199(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void m5200(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }
}
