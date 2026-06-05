package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱUjhhgtgᛱ要点脸ᛳᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2819Ujhhgtgfeyxiexzf extends ViewOutlineProvider {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8971Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f8972Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2819Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f8971Ujhhgtgfeyxiexzf = i;
        this.f8972Ujhhgtgfeyxiexzf = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f8971Ujhhgtgfeyxiexzf) {
            case 0:
                C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = ((Chip) this.f8972Ujhhgtgfeyxiexzf).f758Ujhhgtgfeyxiexzf;
                if (c2802Ujhhgtgfeyxiexzf == null) {
                    outline.setAlpha(0.0f);
                } else {
                    c2802Ujhhgtgfeyxiexzf.getOutline(outline);
                }
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C0399Ujhhgtgfeyxiexzf) this.f8972Ujhhgtgfeyxiexzf).f2163Ujhhgtgfeyxiexzf.f2175feyxiexzfUjhhgtg);
                break;
        }
    }
}
