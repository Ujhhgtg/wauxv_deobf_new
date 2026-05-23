package p000;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3410 implements Runnable {

    public final /* synthetic */ int f10752;

    public final /* synthetic */ Toolbar f10753;

    public /* synthetic */ RunnableC3410(Toolbar toolbar, int i) {
        this.f10752 = i;
        this.f10753 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10752) {
            case 0:
                C3414 c3414 = this.f10753.f184;
                MenuItemC1946 menuItemC1946 = c3414 == null ? null : c3414.f10757;
                if (menuItemC1946 != null) {
                    menuItemC1946.collapseActionView();
                }
                break;
            default:
                this.f10753.m43();
                break;
        }
    }
}
