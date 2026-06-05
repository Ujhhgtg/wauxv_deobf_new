package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ能不能ᛳᛱfeyxiexzfᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0241Ujhhgtgfeyxiexzf implements View.OnClickListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1571Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ View f1572Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewOnClickListenerC0241Ujhhgtgfeyxiexzf(View view, int i) {
        this.f1571Ujhhgtgfeyxiexzf = i;
        this.f1572Ujhhgtgfeyxiexzf = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1571Ujhhgtgfeyxiexzf) {
            case 0:
                Activity activityM5177Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5177Ujhhgtgfeyxiexzf();
                Context context = this.f1572Ujhhgtgfeyxiexzf.getContext();
                C0277Ujhhgtgfeyxiexzf.f1689Ujhhgtgfeyxiexzf.getClass();
                C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = C0277Ujhhgtgfeyxiexzf.f1692Ujhhgtgfeyxiexzf;
                InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf = C0277Ujhhgtgfeyxiexzf.f1690Ujhhgtgfeyxiexzf[0];
                Intent intent = new Intent(context, (Class<?>) c2366Ujhhgtgfeyxiexzf.m3605Ujhhgtgfeyxiexzf());
                intent.putExtra("map_view_type", 8);
                activityM5177Ujhhgtgfeyxiexzf.startActivityForResult(intent, 6);
                break;
            default:
                AbstractC3612feyxiexzfUjhhgtg.m5242Ujhhgtgfeyxiexzf(this.f1572Ujhhgtgfeyxiexzf.getContext(), "https://hdshare.github.io/WAuxiliary_Plugin/");
                break;
        }
    }
}
