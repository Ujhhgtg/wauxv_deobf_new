package p000;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1723Ujhhgtgfeyxiexzf implements InterfaceC3010feyxiexzfUjhhgtg, InterfaceC0360Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f5781Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1723Ujhhgtgfeyxiexzf(Toolbar toolbar) {
        this.f5781Ujhhgtgfeyxiexzf = toolbar;
    }

    @Override // p000.InterfaceC0360Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public boolean mo1571Ujhhgtgfeyxiexzf(MenuItem menuItem) {
        return false;
    }

    @Override // p000.InterfaceC0360Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public void mo1572Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf) {
        C3001Ujhhgtgfeyxiexzf c3001Ujhhgtgfeyxiexzf;
        Toolbar toolbar = this.f5781Ujhhgtgfeyxiexzf;
        C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf = toolbar.f149Ujhhgtgfeyxiexzf.f83Ujhhgtgfeyxiexzf;
        if (c3007Ujhhgtgfeyxiexzf == null || (c3001Ujhhgtgfeyxiexzf = c3007Ujhhgtgfeyxiexzf.f9349Ujhhgtgfeyxiexzf) == null || !c3001Ujhhgtgfeyxiexzf.m1576Ujhhgtgfeyxiexzf()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f181feyxiexzfUjhhgtg.f2944Ujhhgtgfeyxiexzf).iterator();
            if (it.hasNext()) {
                ((AbstractC3560feyxiexzfUjhhgtg) it.next()).getClass();
                throw null;
            }
        }
    }
}
