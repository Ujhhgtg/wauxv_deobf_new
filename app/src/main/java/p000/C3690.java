package p000;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XModuleResources;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3690 extends Resources {

    public static final /* synthetic */ int f11597 = 0;

    public final XModuleResources f11598;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3690(XModuleResources xModuleResources) {
        Object c2585;
        Object c2586;
        Object c2587;
        try {
            c2585 = xModuleResources.getAssets();
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        AssetManager assetManager = (AssetManager) (c2585 instanceof C2585 ? null : c2585);
        try {
            c2586 = xModuleResources.getDisplayMetrics();
        } catch (Throwable th2) {
            c2586 = new C2585(th2);
        }
        DisplayMetrics displayMetrics = (DisplayMetrics) (c2586 instanceof C2585 ? null : c2586);
        try {
            c2587 = xModuleResources.getConfiguration();
        } catch (Throwable th3) {
            c2587 = new C2585(th3);
        }
        super(assetManager, displayMetrics, (Configuration) (c2587 instanceof C2585 ? null : c2587));
        this.f11598 = xModuleResources;
    }

    public final String toString() {
        return "YukiModuleResources by " + this.f11598;
    }
}
