package p000;

import android.app.Activity;
import android.content.Intent;
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸能不能ᛲᛱUjhhgtgᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1465feyxiexzfUjhhgtg implements InterfaceC2463feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m2971Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf, String str) {
        Activity activityM5177Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5177Ujhhgtgfeyxiexzf();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (str.endsWith(MagicFactory.get(4928844571275691402L, strArr))) {
            Intent intent = new Intent();
            intent.setClassName(activityM5177Ujhhgtgfeyxiexzf, MagicFactory.get(4928209740749604234L, strArr));
            intent.putExtra(MagicFactory.get(4928209972677838218L, strArr), str);
            activityM5177Ujhhgtgfeyxiexzf.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent();
        intent2.setClassName(activityM5177Ujhhgtgfeyxiexzf, MagicFactory.get(4928210548203455882L, strArr));
        intent2.putExtra(MagicFactory.get(4928209659145225610L, strArr), str);
        activityM5177Ujhhgtgfeyxiexzf.startActivity(intent2);
    }
}
