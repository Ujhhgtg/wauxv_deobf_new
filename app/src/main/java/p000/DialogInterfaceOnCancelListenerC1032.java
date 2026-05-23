package p000;

import android.content.DialogInterface;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᛸᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1032 extends AbstractComponentCallbacksC1406 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final DialogInterfaceOnDismissListenerC1031 f3774;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f3775;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f3776;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f3777;

    public DialogInterfaceOnCancelListenerC1032() {
        new RunnableC0141(5, this);
        this.f3774 = new DialogInterfaceOnDismissListenerC1031();
        this.f3775 = -1;
        new C0373(this);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f3776) {
            return;
        }
        if (C0575.m1982(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m2605(true, true);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2605(boolean z, boolean z2) {
        if (this.f3777) {
            return;
        }
        this.f3777 = true;
        this.f3776 = true;
        if (this.f3775 < 0) {
            C0362 c0362 = new C0362(m3120());
            C1411 c1411 = new C1411();
            c1411.f5079 = 3;
            c1411.f5080 = this;
            ((ArrayList) c0362.f1684).add(c1411);
            c1411.f5081 = 0;
            c1411.f5082 = 0;
            c1411.f5083 = 0;
            c1411.f5084 = 0;
            if (z) {
                c0362.m1473(true);
                return;
            } else {
                c0362.m1473(false);
                return;
            }
        }
        C0575 c0575M3120 = m3120();
        int i = this.f3775;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "Bad id: "));
        }
        if (!z) {
            
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (((ArrayList) c0575M3120.f2343)) {
            try {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3775 = -1;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
