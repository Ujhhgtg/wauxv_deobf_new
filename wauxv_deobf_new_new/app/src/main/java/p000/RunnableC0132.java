package p000;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0132 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1151;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ActionBarOverlayLayout f1152;

    public /* synthetic */ RunnableC0132(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f1151 = i;
        this.f1152 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1151) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1152;
                actionBarOverlayLayout.m17();
                actionBarOverlayLayout.f73 = actionBarOverlayLayout.f56.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f74);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1152;
                actionBarOverlayLayout2.m17();
                actionBarOverlayLayout2.f73 = actionBarOverlayLayout2.f56.animate().translationY(-actionBarOverlayLayout2.f56.getHeight()).setListener(actionBarOverlayLayout2.f74);
                break;
        }
    }
}
