package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ能不能ᛳᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0105Ujhhgtgfeyxiexzf extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view == null) {
            throw new NullPointerException(MagicFactory.get(4928346964954711434L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        outline.setRoundRect(0, 0, frameLayout.getWidth(), frameLayout.getHeight(), frameLayout.getHeight() / 2.0f);
    }
}
