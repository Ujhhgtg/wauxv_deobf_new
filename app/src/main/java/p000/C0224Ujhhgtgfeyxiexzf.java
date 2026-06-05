package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛴ能不能ᛱfeyxiexzfᛱ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0224Ujhhgtgfeyxiexzf<S> extends DialogInterfaceOnCancelListenerC3175feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final LinkedHashSet f1523Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final LinkedHashSet f1524Ujhhgtgfeyxiexzf;

    public C0224Ujhhgtgfeyxiexzf() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1523Ujhhgtgfeyxiexzf = new LinkedHashSet();
        this.f1524Ujhhgtgfeyxiexzf = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static boolean m1354Ujhhgtgfeyxiexzf(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C3052Ujhhgtgfeyxiexzf.m4526Ujhhgtgfeyxiexzf(context, R.attr.materialCalendarStyle, C0188Ujhhgtgfeyxiexzf.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC3175feyxiexzfUjhhgtg, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1523Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // p000.DialogInterfaceOnCancelListenerC3175feyxiexzfUjhhgtg, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1524Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}
