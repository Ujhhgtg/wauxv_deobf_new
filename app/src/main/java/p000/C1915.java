package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1915<S> extends DialogInterfaceOnCancelListenerC1032 {

    public final LinkedHashSet f6312;

    public final LinkedHashSet f6313;

    public C1915() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f6312 = new LinkedHashSet();
        this.f6313 = new LinkedHashSet();
    }

    public static boolean m3707(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC2207.m4111(context, R.attr.materialCalendarStyle, C1910.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC1032, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f6312.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // p000.DialogInterfaceOnCancelListenerC1032, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f6313.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}
