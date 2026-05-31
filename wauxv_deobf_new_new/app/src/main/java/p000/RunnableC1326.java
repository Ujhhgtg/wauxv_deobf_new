package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.io.File;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᛸᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1326 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4778;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f4779;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4780;

    public /* synthetic */ RunnableC1326(Object obj, int i, Object obj2) {
        this.f4778 = i;
        this.f4779 = obj;
        this.f4780 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws C1076 {
        switch (this.f4778) {
            case 0:
                SharedPreferencesC1271 sharedPreferencesC1271 = (SharedPreferencesC1271) this.f4779;
                AbstractC3744.m5332(new File(sharedPreferencesC1271.f4607 + sharedPreferencesC1271.f4608, (String) this.f4780));
                return;
            case 1:
                ((C0535) this.f4779).m2049((C1527) this.f4780);
                return;
            case 2:
                ExecutorC1803 executorC1803 = (ExecutorC1803) this.f4779;
                Runnable runnable = (Runnable) this.f4780;
                executorC1803.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC1803.m3686();
                }
            case 3:
                ((AbstractC1469) this.f4779).mo1427((Typeface) this.f4780);
                return;
            default:
                EditText editText = (EditText) this.f4779;
                C2735 c2735 = (C2735) this.f4780;
                Context context = editText.getContext();
                String[] strArr = AbstractC1471.f5234;
                Object systemService = context.getSystemService("input_method");
                "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                EditText editText2 = c2735.f8771;
                if (editText2 == null) {
                    "edtSearchInput";
                    editText2 = null;
                }
                inputMethodManager.showSoftInput(editText2, 0);
                return;
        }
    }
}
