package p000;

import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC3727Ujhhgtgfeyxiexzf implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f11789Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f11790Ujhhgtgfeyxiexzf;

    public ViewTreeObserverOnPreDrawListenerC3727Ujhhgtgfeyxiexzf(C2302feyxiexzfUjhhgtg c2302feyxiexzfUjhhgtg) {
        this.f11790Ujhhgtgfeyxiexzf = new WeakReference(c2302feyxiexzfUjhhgtg);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        switch (this.f11789Ujhhgtgfeyxiexzf) {
            case 0:
                ((CoordinatorLayout) this.f11790Ujhhgtgfeyxiexzf).m70Ujhhgtgfeyxiexzf(0);
                break;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C2302feyxiexzfUjhhgtg c2302feyxiexzfUjhhgtg = (C2302feyxiexzfUjhhgtg) ((WeakReference) this.f11790Ujhhgtgfeyxiexzf).get();
                if (c2302feyxiexzfUjhhgtg != null) {
                    ArrayList arrayList = c2302feyxiexzfUjhhgtg.f7536Ujhhgtgfeyxiexzf;
                    ImageView imageView = c2302feyxiexzfUjhhgtg.f7535Ujhhgtgfeyxiexzf;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        int iM3508Ujhhgtgfeyxiexzf = c2302feyxiexzfUjhhgtg.m3508Ujhhgtgfeyxiexzf(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        int iM3508Ujhhgtgfeyxiexzf2 = c2302feyxiexzfUjhhgtg.m3508Ujhhgtgfeyxiexzf(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iM3508Ujhhgtgfeyxiexzf > 0 || iM3508Ujhhgtgfeyxiexzf == Integer.MIN_VALUE) {
                            if (iM3508Ujhhgtgfeyxiexzf2 > 0 || iM3508Ujhhgtgfeyxiexzf2 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((C1046feyxiexzfUjhhgtg) ((InterfaceC1037feyxiexzfUjhhgtg) it.next())).m2547Ujhhgtgfeyxiexzf(iM3508Ujhhgtgfeyxiexzf, iM3508Ujhhgtgfeyxiexzf2);
                                }
                                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(c2302feyxiexzfUjhhgtg.f7537Ujhhgtgfeyxiexzf);
                                }
                                c2302feyxiexzfUjhhgtg.f7537Ujhhgtgfeyxiexzf = null;
                                arrayList.clear();
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC3727Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout) {
        this.f11790Ujhhgtgfeyxiexzf = coordinatorLayout;
    }
}
