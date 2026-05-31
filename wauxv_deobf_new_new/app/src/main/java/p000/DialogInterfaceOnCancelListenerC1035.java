package p000;

import android.content.DialogInterface;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᲈᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1035 extends AbstractComponentCallbacksC1414 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final DialogInterfaceOnDismissListenerC1034 f3781;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f3782;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f3783;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f3784;

    public DialogInterfaceOnCancelListenerC1035() {
        new RunnableC0149(this, 5);
        this.f3781 = new DialogInterfaceOnDismissListenerC1034();
        this.f3782 = -1;
        new C0348(this);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f3783) {
            return;
        }
        if (C0552.m2079(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m2729(true, true);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2729(boolean z, boolean z2) {
        if (this.f3784) {
            return;
        }
        this.f3784 = true;
        this.f3783 = true;
        if (this.f3782 < 0) {
            C0337 c0337 = new C0337(m3228());
            C1419 c1419 = new C1419();
            c1419.f5108 = 3;
            c1419.f5109 = this;
            ((ArrayList) c0337.f1655).add(c1419);
            c1419.f5110 = 0;
            c1419.f5111 = 0;
            c1419.f5112 = 0;
            c1419.f5113 = 0;
            if (z) {
                c0337.m1578(true);
                return;
            } else {
                c0337.m1578(false);
                return;
            }
        }
        C0552 c0552M3228 = m3228();
        int i = this.f3782;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "Bad id: "));
        }
        if (!z) {
            c0552M3228.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (((ArrayList) c0552M3228.f2305)) {
            try {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3782 = -1;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
