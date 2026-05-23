package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.io.File;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1324 implements Runnable {

    public final /* synthetic */ int f4778;

    public final /* synthetic */ Object f4779;

    public final /* synthetic */ Object f4780;

    public /* synthetic */ RunnableC1324(Object obj, int i, Object obj2) {
        this.f4778 = i;
        this.f4779 = obj;
        this.f4780 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws C1071 {
        switch (this.f4778) {
            case 0:
                SharedPreferencesC1269 sharedPreferencesC1269 = (SharedPreferencesC1269) this.f4779;
                AbstractC2209.m4125(new File(sharedPreferencesC1269.f4608 + sharedPreferencesC1269.f4609, (String) this.f4780));
                return;
            case 1:
                ((C0558) this.f4779).m1954((C1515) this.f4780);
                return;
            case 2:
                ExecutorC1780 executorC1780 = (ExecutorC1780) this.f4779;
                Runnable runnable = (Runnable) this.f4780;
                
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC1780.m3514();
                }
            case 3:
                ((AbstractC3681) this.f4779).mo1281((Typeface) this.f4780);
                return;
            default:
                EditText editText = (EditText) this.f4779;
                C2675 c2675 = (C2675) this.f4780;
                Context context = editText.getContext();
                String[] strArr = AbstractC1574.f5469;
                Object systemService = context.getSystemService("input_method");
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                EditText editText2 = c2675.f8613;
                if (editText2 == null) {
                    "edtSearchInput";
                    editText2 = null;
                }
                inputMethodManager.showSoftInput(editText2, 0);
                return;
        }
    }
}
