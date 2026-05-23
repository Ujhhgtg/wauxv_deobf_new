package p000;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᲇᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0228 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1365 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1366;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ View f1367;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f1368;

    public RunnableC0228(TextView textView, Typeface typeface, int i) {
        this.f1367 = textView;
        this.f1368 = typeface;
        this.f1366 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1365) {
            case 0:
                ((TextView) this.f1367).setTypeface((Typeface) this.f1368, this.f1366);
                break;
            default:
                ((BottomSheetBehavior) this.f1368).m652(this.f1367, this.f1366, false);
                break;
        }
    }

    public RunnableC0228(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f1368 = bottomSheetBehavior;
        this.f1367 = view;
        this.f1366 = i;
    }
}
