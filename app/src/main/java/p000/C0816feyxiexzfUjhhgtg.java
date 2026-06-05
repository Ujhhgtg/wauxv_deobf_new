package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0816feyxiexzfUjhhgtg extends C2949feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final RecyclerView f3228Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0820feyxiexzfUjhhgtg f3229Ujhhgtgfeyxiexzf;

    public C0816feyxiexzfUjhhgtg(RecyclerView recyclerView) {
        this.f3228Ujhhgtgfeyxiexzf = recyclerView;
        C0820feyxiexzfUjhhgtg c0820feyxiexzfUjhhgtg = this.f3229Ujhhgtgfeyxiexzf;
        if (c0820feyxiexzfUjhhgtg != null) {
            this.f3229Ujhhgtgfeyxiexzf = c0820feyxiexzfUjhhgtg;
        } else {
            this.f3229Ujhhgtgfeyxiexzf = new C0820feyxiexzfUjhhgtg(this);
        }
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1258Ujhhgtgfeyxiexzf(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1258Ujhhgtgfeyxiexzf(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f3228Ujhhgtgfeyxiexzf.m234feyxiexzfUjhhgtg()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo162Ujhhgtgfeyxiexzf(accessibilityEvent);
        }
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo865Ujhhgtgfeyxiexzf(View view, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        this.f9251Ujhhgtgfeyxiexzf.onInitializeAccessibilityNodeInfo(view, c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf);
        RecyclerView recyclerView = this.f3228Ujhhgtgfeyxiexzf;
        if (recyclerView.m234feyxiexzfUjhhgtg() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0822feyxiexzfUjhhgtg layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3261Ujhhgtgfeyxiexzf;
        layoutManager.mo129Ujhhgtgfeyxiexzf(recyclerView2.f359Ujhhgtgfeyxiexzf, recyclerView2.f412feyxiexzfUjhhgtg, c2963feyxiexzfUjhhgtg);
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final boolean mo866Ujhhgtgfeyxiexzf(View view, int i, Bundle bundle) {
        if (super.mo866Ujhhgtgfeyxiexzf(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f3228Ujhhgtgfeyxiexzf;
        if (recyclerView.m234feyxiexzfUjhhgtg() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().mo138Ujhhgtgfeyxiexzf(i, bundle);
    }
}
