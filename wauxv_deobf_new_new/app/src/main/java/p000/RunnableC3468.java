package p000;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᛸᲈᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3468 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f10913;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f10914;

    public /* synthetic */ RunnableC3468(Toolbar toolbar, int i) {
        this.f10913 = i;
        this.f10914 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10913) {
            case 0:
                C3472 c3472 = this.f10914.f184;
                MenuItemC1977 menuItemC1977 = c3472 == null ? null : c3472.f10918;
                if (menuItemC1977 != null) {
                    menuItemC1977.collapseActionView();
                }
                break;
            default:
                this.f10914.m43();
                break;
        }
    }
}
