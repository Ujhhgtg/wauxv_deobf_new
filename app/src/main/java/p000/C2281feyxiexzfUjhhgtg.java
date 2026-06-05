package p000;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XModuleResources;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2281feyxiexzfUjhhgtg extends Resources {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final /* synthetic */ int f7476Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final XModuleResources f7477Ujhhgtgfeyxiexzf;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2281feyxiexzfUjhhgtg(XModuleResources xModuleResources) {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        try {
            c0919feyxiexzfUjhhgtg = xModuleResources.getAssets();
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        AssetManager assetManager = (AssetManager) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
        try {
            c0919feyxiexzfUjhhgtg2 = xModuleResources.getDisplayMetrics();
        } catch (Throwable th2) {
            c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
        }
        DisplayMetrics displayMetrics = (DisplayMetrics) (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2);
        try {
            c0919feyxiexzfUjhhgtg3 = xModuleResources.getConfiguration();
        } catch (Throwable th3) {
            c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
        }
        super(assetManager, displayMetrics, (Configuration) (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg3));
        this.f7477Ujhhgtgfeyxiexzf = xModuleResources;
    }

    public final String toString() {
        return "YukiModuleResources by " + this.f7477Ujhhgtgfeyxiexzf;
    }
}
