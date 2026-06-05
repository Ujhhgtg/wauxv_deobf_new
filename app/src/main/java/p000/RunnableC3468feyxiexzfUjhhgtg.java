package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.io.File;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛲ能不能ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3468feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10771Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f10772Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f10773Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC3468feyxiexzfUjhhgtg(Object obj, int i, Object obj2) {
        this.f10771Ujhhgtgfeyxiexzf = i;
        this.f10772Ujhhgtgfeyxiexzf = obj;
        this.f10773Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws C3198feyxiexzfUjhhgtg {
        switch (this.f10771Ujhhgtgfeyxiexzf) {
            case 0:
                SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf = (SharedPreferencesC3515Ujhhgtgfeyxiexzf) this.f10772Ujhhgtgfeyxiexzf;
                AbstractC0217Ujhhgtgfeyxiexzf.m1318Ujhhgtgfeyxiexzf(new File(sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10936Ujhhgtgfeyxiexzf + sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10937Ujhhgtgfeyxiexzf, (String) this.f10773Ujhhgtgfeyxiexzf));
                return;
            case 1:
                ((C2774Ujhhgtgfeyxiexzf) this.f10772Ujhhgtgfeyxiexzf).m4062Ujhhgtgfeyxiexzf((C0529Ujhhgtgfeyxiexzf) this.f10773Ujhhgtgfeyxiexzf);
                return;
            case 2:
                ExecutorC0079Ujhhgtgfeyxiexzf executorC0079Ujhhgtgfeyxiexzf = (ExecutorC0079Ujhhgtgfeyxiexzf) this.f10772Ujhhgtgfeyxiexzf;
                Runnable runnable = (Runnable) this.f10773Ujhhgtgfeyxiexzf;
                executorC0079Ujhhgtgfeyxiexzf.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0079Ujhhgtgfeyxiexzf.m1125Ujhhgtgfeyxiexzf();
                }
            case 3:
                ((AbstractC1791feyxiexzfUjhhgtg) this.f10772Ujhhgtgfeyxiexzf).mo3168feyxiexzfUjhhgtg((Typeface) this.f10773Ujhhgtgfeyxiexzf);
                return;
            default:
                EditText editText = (EditText) this.f10772Ujhhgtgfeyxiexzf;
                C1019feyxiexzfUjhhgtg c1019feyxiexzfUjhhgtg = (C1019feyxiexzfUjhhgtg) this.f10773Ujhhgtgfeyxiexzf;
                Context context = editText.getContext();
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                Object systemService = context.getSystemService(MagicFactory.get(4928451079256933770L, strArr));
                MagicFactory.get(4928451160861312394L, strArr);
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                EditText editText2 = c1019feyxiexzfUjhhgtg.f3994Ujhhgtgfeyxiexzf;
                if (editText2 == null) {
                    MagicFactory.get(4928454798698612106L, strArr);
                    editText2 = null;
                }
                inputMethodManager.showSoftInput(editText2, 0);
                return;
        }
    }
}
