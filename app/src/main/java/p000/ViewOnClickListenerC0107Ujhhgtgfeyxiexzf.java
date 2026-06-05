package p000;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ能不能要点脸ᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0107Ujhhgtgfeyxiexzf implements View.OnClickListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1225Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f1226Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ FrameLayout f1227Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewOnClickListenerC0107Ujhhgtgfeyxiexzf(FrameLayout frameLayout, int i, int i2) {
        this.f1225Ujhhgtgfeyxiexzf = i2;
        this.f1227Ujhhgtgfeyxiexzf = frameLayout;
        this.f1226Ujhhgtgfeyxiexzf = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1225Ujhhgtgfeyxiexzf) {
            case 0:
                ((C0113Ujhhgtgfeyxiexzf) this.f1227Ujhhgtgfeyxiexzf).setSelectedTabIndex(this.f1226Ujhhgtgfeyxiexzf);
                break;
            default:
                InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg = ((AbstractC0384Ujhhgtgfeyxiexzf) this.f1227Ujhhgtgfeyxiexzf).f2106Ujhhgtgfeyxiexzf;
                if (interfaceC3549feyxiexzfUjhhgtg != null) {
                    interfaceC3549feyxiexzfUjhhgtg.invoke(Integer.valueOf(this.f1226Ujhhgtgfeyxiexzf));
                }
                break;
        }
    }
}
