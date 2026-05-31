package p000;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XModuleResources;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲈᤝᤞᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3753 extends Resources {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ int f11754 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final XModuleResources f11755;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3753(XModuleResources xModuleResources) {
        Object c2641;
        Object c2642;
        Object c2643;
        try {
            c2641 = xModuleResources.getAssets();
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        AssetManager assetManager = (AssetManager) (c2641 instanceof C2641 ? null : c2641);
        try {
            c2642 = xModuleResources.getDisplayMetrics();
        } catch (Throwable th2) {
            c2642 = new C2641(th2);
        }
        DisplayMetrics displayMetrics = (DisplayMetrics) (c2642 instanceof C2641 ? null : c2642);
        try {
            c2643 = xModuleResources.getConfiguration();
        } catch (Throwable th3) {
            c2643 = new C2641(th3);
        }
        super(assetManager, displayMetrics, (Configuration) (c2643 instanceof C2641 ? null : c2643));
        this.f11755 = xModuleResources;
    }

    public final String toString() {
        return "YukiModuleResources by " + this.f11755;
    }
}
