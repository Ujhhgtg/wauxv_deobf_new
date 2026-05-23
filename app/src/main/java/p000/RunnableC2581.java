package p000;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᲇᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2581 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8184;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8185;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f8186;

    public /* synthetic */ RunnableC2581(int i, int i2, Object obj) {
        this.f8184 = i2;
        this.f8186 = obj;
        this.f8185 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8184) {
            case 0:
                ((AbstractC3681) this.f8186).mo1280(this.f8185);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8186;
                View view = (View) sideSheetBehavior.f772.get();
                if (view != null) {
                    sideSheetBehavior.m689(view, this.f8185, false);
                }
                break;
        }
    }
}
