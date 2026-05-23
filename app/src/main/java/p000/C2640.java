package p000;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2640 {

    public final InterfaceC2639 f8532;

    public C2640(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f8532 = new C2638(nestedScrollView);
        } else {
            this.f8532 = new C2102(13);
        }
    }
}
