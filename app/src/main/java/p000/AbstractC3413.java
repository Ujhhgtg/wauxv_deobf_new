package p000;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3413 {
    public static OnBackInvokedDispatcher m4928(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback m4929(final Runnable runnable) {
        return new OnBackInvokedCallback() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᤝᲀᲈᤞ
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                runnable.run();
            }
        };
    }

    public static void m4930(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void m4931(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
