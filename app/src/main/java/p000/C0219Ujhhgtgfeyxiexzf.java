package p000;

import android.app.Activity;
import android.content.Intent;
import java.util.Collection;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛴᛳ能不能ᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0219Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1496Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ String f1497Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f1498Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f1499Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ Object f1500Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0219Ujhhgtgfeyxiexzf(Activity activity, String str, String str2, String str3) {
        this.f1498Ujhhgtgfeyxiexzf = activity;
        this.f1497Ujhhgtgfeyxiexzf = str;
        this.f1499Ujhhgtgfeyxiexzf = str2;
        this.f1500Ujhhgtgfeyxiexzf = str3;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        int i = this.f1496Ujhhgtgfeyxiexzf;
        Object obj2 = this.f1500Ujhhgtgfeyxiexzf;
        Object obj3 = this.f1499Ujhhgtgfeyxiexzf;
        String str = this.f1497Ujhhgtgfeyxiexzf;
        Object obj4 = this.f1498Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg = (InterfaceC3553feyxiexzfUjhhgtg) obj3;
                C0216Ujhhgtgfeyxiexzf c0216Ujhhgtgfeyxiexzf = (C0216Ujhhgtgfeyxiexzf) obj2;
                if ((obj4 instanceof Collection) && ((Collection) obj4).isEmpty()) {
                    obj4 = null;
                }
                boolean z = true;
                if (obj4 != null) {
                    boolean zBooleanValue = ((Boolean) interfaceC3553feyxiexzfUjhhgtg.mo1179Ujhhgtgfeyxiexzf(obj4, obj)).booleanValue();
                    if (c0216Ujhhgtgfeyxiexzf.f1489Ujhhgtgfeyxiexzf != 3 && AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(C0147Ujhhgtgfeyxiexzf.f1307Ujhhgtgfeyxiexzf) <= 0) {
                        String strM3174Ujhhgtgfeyxiexzf = C1843Ujhhgtgfeyxiexzf.m3174Ujhhgtgfeyxiexzf(obj4);
                        String strM2681feyxiexzfUjhhgtg = strM3174Ujhhgtgfeyxiexzf != null ? AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(strM3174Ujhhgtgfeyxiexzf.toString(), " (Kotlin reflection is not available)", "") : null;
                        String strM2681feyxiexzfUjhhgtg2 = obj != null ? AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(obj.toString(), " (Kotlin reflection is not available)", "") : null;
                        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = C0147Ujhhgtgfeyxiexzf.f1304Ujhhgtgfeyxiexzf;
                        String str2 = "[FILTER] [" + (zBooleanValue ? "HIT" : "MISS") + "] " + str + ": " + strM2681feyxiexzfUjhhgtg + " [RESOLVED] " + strM2681feyxiexzfUjhhgtg2;
                        if (AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(C0147Ujhhgtgfeyxiexzf.f1307Ujhhgtgfeyxiexzf) <= AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(1)) {
                            C0147Ujhhgtgfeyxiexzf.f1306Ujhhgtgfeyxiexzf.mo1191Ujhhgtgfeyxiexzf(str2);
                        }
                    }
                    z = zBooleanValue;
                }
                return Boolean.valueOf(z);
            default:
                Activity activity = (Activity) obj4;
                Intent intent = new Intent();
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                intent.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                intent.putExtra("Ksnsupload_type", 14);
                intent.putExtra("KSightPath", str);
                intent.putExtra("KSightThumbPath", (String) obj3);
                intent.putExtra("Kdescription", (String) obj2);
                activity.startActivity(intent);
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        }
    }

    public /* synthetic */ C0219Ujhhgtgfeyxiexzf(Object obj, InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg, C0216Ujhhgtgfeyxiexzf c0216Ujhhgtgfeyxiexzf, String str) {
        this.f1498Ujhhgtgfeyxiexzf = obj;
        this.f1499Ujhhgtgfeyxiexzf = interfaceC3553feyxiexzfUjhhgtg;
        this.f1500Ujhhgtgfeyxiexzf = c0216Ujhhgtgfeyxiexzf;
        this.f1497Ujhhgtgfeyxiexzf = str;
    }
}
