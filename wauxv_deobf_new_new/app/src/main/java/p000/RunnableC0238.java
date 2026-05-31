package p000;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᲇᲈᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0238 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1439 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1440;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ View f1441;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1442;

    public RunnableC0238(TextView textView, Typeface typeface, int i) {
        this.f1441 = textView;
        this.f1442 = typeface;
        this.f1440 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1439) {
            case 0:
                ((TextView) this.f1441).setTypeface((Typeface) this.f1442, this.f1440);
                break;
            default:
                ((BottomSheetBehavior) this.f1442).m795(this.f1441, this.f1440, false);
                break;
        }
    }

    public RunnableC0238(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f1442 = bottomSheetBehavior;
        this.f1441 = view;
        this.f1440 = i;
    }
}
