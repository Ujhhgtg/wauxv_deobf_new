package p000;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲇᛸᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2637 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8337;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8338;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f8339;

    public /* synthetic */ RunnableC2637(int i, int i2, Object obj) {
        this.f8337 = i2;
        this.f8339 = obj;
        this.f8338 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8337) {
            case 0:
                ((AbstractC1469) this.f8339).mo1426(this.f8338);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8339;
                View view = (View) sideSheetBehavior.f838.get();
                if (view != null) {
                    sideSheetBehavior.m833(view, this.f8338, false);
                }
                break;
        }
    }
}
