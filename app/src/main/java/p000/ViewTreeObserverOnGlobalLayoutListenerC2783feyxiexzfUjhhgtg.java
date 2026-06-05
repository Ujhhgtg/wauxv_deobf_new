package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2783feyxiexzfUjhhgtg implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8792Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0365Ujhhgtgfeyxiexzf f8793Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2783feyxiexzfUjhhgtg(AbstractC0365Ujhhgtgfeyxiexzf abstractC0365Ujhhgtgfeyxiexzf, int i) {
        this.f8792Ujhhgtgfeyxiexzf = i;
        this.f8793Ujhhgtgfeyxiexzf = abstractC0365Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f8792Ujhhgtgfeyxiexzf) {
            case 0:
                ViewOnKeyListenerC2787feyxiexzfUjhhgtg viewOnKeyListenerC2787feyxiexzfUjhhgtg = (ViewOnKeyListenerC2787feyxiexzfUjhhgtg) this.f8793Ujhhgtgfeyxiexzf;
                ArrayList arrayList = viewOnKeyListenerC2787feyxiexzfUjhhgtg.f8810Ujhhgtgfeyxiexzf;
                if (viewOnKeyListenerC2787feyxiexzfUjhhgtg.mo1415Ujhhgtgfeyxiexzf() && arrayList.size() > 0 && !((C2786Ujhhgtgfeyxiexzf) arrayList.get(0)).f8801Ujhhgtgfeyxiexzf.f1607Ujhhgtgfeyxiexzf) {
                    View view = viewOnKeyListenerC2787feyxiexzfUjhhgtg.f8817Ujhhgtgfeyxiexzf;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C2786Ujhhgtgfeyxiexzf) it.next()).f8801Ujhhgtgfeyxiexzf.mo1416Ujhhgtgfeyxiexzf();
                        }
                    } else {
                        viewOnKeyListenerC2787feyxiexzfUjhhgtg.dismiss();
                    }
                    break;
                }
                break;
            default:
                ViewOnKeyListenerC1124feyxiexzfUjhhgtg viewOnKeyListenerC1124feyxiexzfUjhhgtg = (ViewOnKeyListenerC1124feyxiexzfUjhhgtg) this.f8793Ujhhgtgfeyxiexzf;
                C0371Ujhhgtgfeyxiexzf c0371Ujhhgtgfeyxiexzf = viewOnKeyListenerC1124feyxiexzfUjhhgtg.f4242Ujhhgtgfeyxiexzf;
                if (viewOnKeyListenerC1124feyxiexzfUjhhgtg.mo1415Ujhhgtgfeyxiexzf() && !c0371Ujhhgtgfeyxiexzf.f1607Ujhhgtgfeyxiexzf) {
                    View view2 = viewOnKeyListenerC1124feyxiexzfUjhhgtg.f4247Ujhhgtgfeyxiexzf;
                    if (view2 != null && view2.isShown()) {
                        c0371Ujhhgtgfeyxiexzf.mo1416Ujhhgtgfeyxiexzf();
                    } else {
                        viewOnKeyListenerC1124feyxiexzfUjhhgtg.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
