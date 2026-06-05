package p000;

import android.content.DialogInterface;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛲᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC3175feyxiexzfUjhhgtg extends AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final DialogInterfaceOnDismissListenerC3276feyxiexzfUjhhgtg f9818Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f9819Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f9820Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f9821Ujhhgtgfeyxiexzf;

    public DialogInterfaceOnCancelListenerC3175feyxiexzfUjhhgtg() {
        new RunnableC3012feyxiexzfUjhhgtg(5, this);
        this.f9818Ujhhgtgfeyxiexzf = new DialogInterfaceOnDismissListenerC3276feyxiexzfUjhhgtg();
        this.f9819Ujhhgtgfeyxiexzf = -1;
        new C2466feyxiexzfUjhhgtg(this);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f9820Ujhhgtgfeyxiexzf) {
            return;
        }
        if (C2790feyxiexzfUjhhgtg.m4072Ujhhgtgfeyxiexzf(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m4676Ujhhgtgfeyxiexzf(true, true);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m4676Ujhhgtgfeyxiexzf(boolean z, boolean z2) {
        if (this.f9821Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f9821Ujhhgtgfeyxiexzf = true;
        this.f9820Ujhhgtgfeyxiexzf = true;
        if (this.f9819Ujhhgtgfeyxiexzf < 0) {
            C2450feyxiexzfUjhhgtg c2450feyxiexzfUjhhgtg = new C2450feyxiexzfUjhhgtg(m5083Ujhhgtgfeyxiexzf());
            C3562feyxiexzfUjhhgtg c3562feyxiexzfUjhhgtg = new C3562feyxiexzfUjhhgtg();
            c3562feyxiexzfUjhhgtg.f11064Ujhhgtgfeyxiexzf = 3;
            c3562feyxiexzfUjhhgtg.f11065Ujhhgtgfeyxiexzf = this;
            ((ArrayList) c2450feyxiexzfUjhhgtg.f7933Ujhhgtgfeyxiexzf).add(c3562feyxiexzfUjhhgtg);
            c3562feyxiexzfUjhhgtg.f11066Ujhhgtgfeyxiexzf = 0;
            c3562feyxiexzfUjhhgtg.f11067Ujhhgtgfeyxiexzf = 0;
            c3562feyxiexzfUjhhgtg.f11068Ujhhgtgfeyxiexzf = 0;
            c3562feyxiexzfUjhhgtg.f11069Ujhhgtgfeyxiexzf = 0;
            if (z) {
                c2450feyxiexzfUjhhgtg.m3691Ujhhgtgfeyxiexzf(true);
                return;
            } else {
                c2450feyxiexzfUjhhgtg.m3691Ujhhgtgfeyxiexzf(false);
                return;
            }
        }
        C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtgM5083Ujhhgtgfeyxiexzf = m5083Ujhhgtgfeyxiexzf();
        int i = this.f9819Ujhhgtgfeyxiexzf;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Bad id: "));
        }
        if (!z) {
            c2790feyxiexzfUjhhgtgM5083Ujhhgtgfeyxiexzf.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (((ArrayList) c2790feyxiexzfUjhhgtgM5083Ujhhgtgfeyxiexzf.f8834Ujhhgtgfeyxiexzf)) {
            try {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9819Ujhhgtgfeyxiexzf = -1;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
