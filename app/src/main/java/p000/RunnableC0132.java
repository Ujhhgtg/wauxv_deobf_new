package p000;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0132 implements Runnable {

    public final /* synthetic */ int f1099;

    public Object f1100;

    public final /* synthetic */ Object f1101;

    public /* synthetic */ RunnableC0132(Object obj, int i, Object obj2) {
        this.f1099 = i;
        this.f1101 = obj;
        this.f1100 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1942 interfaceC1942;
        int i = 0;
        switch (this.f1099) {
            case 0:
                C0130 c0130 = (C0130) this.f1100;
                C0136 c0136 = (C0136) this.f1101;
                MenuC1944 menuC1944 = c0136.f1107;
                if (menuC1944 != null && (interfaceC1942 = menuC1944.f6411) != null) {
                    interfaceC1942.mo1113(menuC1944);
                }
                ActionMenuView actionMenuView = c0136.f1111;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (c0130.m3781()) {
                        c0136.f1122 = c0130;
                    } else if (c0130.f6461 != null) {
                        c0130.m3782(0, 0, false, false);
                        c0136.f1122 = c0130;
                    }
                }
                c0136.f1124 = null;
                return;
            case 1:
                C1744 c1744 = (C1744) this.f1100;
                Typeface typeface = (Typeface) this.f1101;
                AbstractC3681 abstractC3681 = (AbstractC3681) c1744.f5843;
                if (abstractC3681 != null) {
                    abstractC3681.mo1281(typeface);
                    return;
                }
                return;
            case 2:
                ThreadFactoryC1464 threadFactoryC1464 = (ThreadFactoryC1464) this.f1101;
                if (threadFactoryC1464.f5226) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f1100).run();
                    return;
                } catch (Throwable th) {
                    
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 3:
                C1679 c1679 = (C1679) this.f1100;
                C1682 c1682 = (C1682) this.f1101;
                RecyclerView recyclerView = c1682.f5702;
                if (recyclerView == null || !recyclerView.f374 || c1679.f5676 || c1679.f5670.m4510() == -1) {
                    return;
                }
                AbstractC2487 itemAnimator = c1682.f5702.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.mo2568()) {
                    ArrayList arrayList = c1682.f5700;
                    int size = arrayList.size();
                    while (i < size) {
                        if (((C1679) arrayList.get(i)).f5677) {
                            i++;
                        }
                    }
                    
                    return;
                }
                c1682.f5702.post(this);
                return;
            case 4:
                break;
            case 5:
                ((C1376) this.f1100).accept(this.f1101);
                return;
            case 6:
                C3579 c3579 = ((SwipeDismissBehavior) this.f1101).f565;
                if (c3579 == null || !c3579.m5185()) {
                    return;
                }
                View view = (View) this.f1100;
                Field field = AbstractC3578.f11184;
                view.postOnAnimation(this);
                return;
            default:
                AbstractC1574.m3312((Activity) this.f1100, (View) this.f1101);
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f1100).run();
            } catch (Throwable th2) {
                AbstractC3681.m5328(C1187.f4327, th2);
            }
            try {
                Runnable runnableM3515 = ((C1781) this.f1101).m3515();
                if (runnableM3515 == null) {
                    return;
                }
                this.f1100 = runnableM3515;
                i++;
                if (i >= 16) {
                    C1781 c1781 = (C1781) this.f1101;
                    AbstractC0878 abstractC0878 = c1781.f5906;
                    try {
                        if (abstractC0878.mo2393(c1781)) {
                            C1781 c1782 = (C1781) this.f1101;
                            AbstractC2203.m4039(c1782.f5906, c1782, this);
                            return;
                        }
                    } catch (Throwable th3) {
                        throw new C1071(th3, abstractC0878, c1781);
                    }
                }
            } catch (Throwable th4) {
                C1781 c1783 = (C1781) this.f1101;
                synchronized (c1783.f5909) {
                    C1781.f5904.decrementAndGet(c1783);
                    throw th4;
                }
            }
        }
    }

    public /* synthetic */ RunnableC0132(Object obj, Object obj2, int i, boolean z) {
        this.f1099 = i;
        this.f1100 = obj;
        this.f1101 = obj2;
    }

    public RunnableC0132(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f1099 = 6;
        this.f1101 = swipeDismissBehavior;
        this.f1100 = view;
    }

    public RunnableC0132(C1682 c1682, C1679 c1679, int i) {
        this.f1099 = 3;
        this.f1101 = c1682;
        this.f1100 = c1679;
    }
}
