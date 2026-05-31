package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲈᛸᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0984 implements InterfaceC0774 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Context f3608;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2618 f3609;

    public C0984(Context context, C2618 c2618) {
        this.f3608 = context.getApplicationContext();
        this.f3609 = c2618;
    }

    @Override // p000.InterfaceC1798
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final void mo1728() {
        C2773 c2773M4752 = C2773.m4752(this.f3608);
        C2618 c2618 = this.f3609;
        synchronized (c2773M4752) {
            ((HashSet) c2773M4752.f8924).remove(c2618);
            if (c2773M4752.f8922 && ((HashSet) c2773M4752.f8924).isEmpty()) {
                C1072 c1072 = (C1072) c2773M4752.f8923;
                ((ConnectivityManager) ((C1216) c1072.f3868).get()).unregisterNetworkCallback((C2772) c1072.f3869);
                c2773M4752.f8922 = false;
            }
        }
    }

    @Override // p000.InterfaceC1798
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1732() {
        C2773 c2773M4752 = C2773.m4752(this.f3608);
        C2618 c2618 = this.f3609;
        synchronized (c2773M4752) {
            ((HashSet) c2773M4752.f8924).add(c2618);
            c2773M4752.m4754();
        }
    }

    @Override // p000.InterfaceC1798
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo1726() {
    }
}
