package p000;

import android.view.View;
import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleRecyclerView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ要点脸ᛴᛱUjhhgtgᛱᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1110feyxiexzfUjhhgtg implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C1019feyxiexzfUjhhgtg f4205Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f4206Ujhhgtgfeyxiexzf;

    public ViewOnLayoutChangeListenerC1110feyxiexzfUjhhgtg(C1019feyxiexzfUjhhgtg c1019feyxiexzfUjhhgtg, int i) {
        this.f4205Ujhhgtgfeyxiexzf = c1019feyxiexzfUjhhgtg;
        this.f4206Ujhhgtgfeyxiexzf = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        C1019feyxiexzfUjhhgtg c1019feyxiexzfUjhhgtg = this.f4205Ujhhgtgfeyxiexzf;
        ModuleRecyclerView moduleRecyclerView = c1019feyxiexzfUjhhgtg.f3996Ujhhgtgfeyxiexzf;
        if (moduleRecyclerView == null) {
            "recyclerView";
            moduleRecyclerView = null;
        }
        int i9 = this.f4206Ujhhgtgfeyxiexzf;
        if (moduleRecyclerView.m228feyxiexzfUjhhgtg(i9) != null) {
            moduleRecyclerView.postDelayed(new RunnableC3262feyxiexzfUjhhgtg(moduleRecyclerView, i9, c1019feyxiexzfUjhhgtg, 1), 150L);
            return;
        }
        C1112feyxiexzfUjhhgtg c1112feyxiexzfUjhhgtg = new C1112feyxiexzfUjhhgtg(c1019feyxiexzfUjhhgtg, i9);
        if (moduleRecyclerView.f414feyxiexzfUjhhgtg == null) {
            moduleRecyclerView.f414feyxiexzfUjhhgtg = new ArrayList();
        }
        moduleRecyclerView.f414feyxiexzfUjhhgtg.add(c1112feyxiexzfUjhhgtg);
        moduleRecyclerView.m256Ujhhgtgfeyxiexzf(i9);
    }
}
