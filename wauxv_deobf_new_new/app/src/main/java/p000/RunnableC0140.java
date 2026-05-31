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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲀᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0140 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1167;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f1168;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1169;

    public /* synthetic */ RunnableC0140(Object obj, int i, Object obj2) {
        this.f1167 = i;
        this.f1169 = obj;
        this.f1168 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1973 interfaceC1973;
        int i = 0;
        switch (this.f1167) {
            case 0:
                C0138 c0138 = (C0138) this.f1168;
                C0144 c0144 = (C0144) this.f1169;
                MenuC1975 menuC1975 = c0144.f1175;
                if (menuC1975 != null && (interfaceC1973 = menuC1975.f6516) != null) {
                    interfaceC1973.mo1259(menuC1975);
                }
                ActionMenuView actionMenuView = c0144.f1179;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (c0138.m3975()) {
                        c0144.f1190 = c0138;
                    } else if (c0138.f6566 != null) {
                        c0138.m3976(0, 0, false, false);
                        c0144.f1190 = c0138;
                    }
                }
                c0144.f1192 = null;
                return;
            case 1:
                C1681 c1681 = (C1681) this.f1168;
                Typeface typeface = (Typeface) this.f1169;
                AbstractC1469 abstractC1469 = (AbstractC1469) c1681.f5660;
                if (abstractC1469 != null) {
                    abstractC1469.mo1427(typeface);
                    return;
                }
                return;
            case 2:
                ThreadFactoryC1475 threadFactoryC1475 = (ThreadFactoryC1475) this.f1169;
                if (threadFactoryC1475.f5258) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f1168).run();
                    return;
                } catch (Throwable th) {
                    threadFactoryC1475.f5257.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 3:
                C1696 c1696 = (C1696) this.f1168;
                C1700 c1700 = (C1700) this.f1169;
                RecyclerView recyclerView = c1700.f5745;
                if (recyclerView == null || !recyclerView.f374 || c1696.f5716 || c1696.f5710.m4532() == -1) {
                    return;
                }
                AbstractC2542 itemAnimator = c1700.f5745.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.mo2692()) {
                    ArrayList arrayList = c1700.f5743;
                    int size = arrayList.size();
                    while (i < size) {
                        if (((C1696) arrayList.get(i)).f5717) {
                            i++;
                        }
                    }
                    c1700.f5740.getClass();
                    return;
                }
                c1700.f5745.post(this);
                return;
            case 4:
                break;
            case 5:
                ((C1384) this.f1168).accept(this.f1169);
                return;
            case 6:
                C3639 c3639 = ((SwipeDismissBehavior) this.f1169).f617;
                if (c3639 == null || !c3639.m5191()) {
                    return;
                }
                View view = (View) this.f1168;
                Field field = AbstractC3638.f11333;
                view.postOnAnimation(this);
                return;
            default:
                AbstractC2235.m4215((Activity) this.f1168, (View) this.f1169);
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f1168).run();
            } catch (Throwable th2) {
                AbstractC2236.m4233(C1189.f4324, th2);
            }
            try {
                Runnable runnableM3687 = ((C1804) this.f1169).m3687();
                if (runnableM3687 == null) {
                    return;
                }
                this.f1168 = runnableM3687;
                i++;
                if (i >= 16) {
                    C1804 c1804 = (C1804) this.f1169;
                    AbstractC0877 abstractC0877 = c1804.f5962;
                    try {
                        if (abstractC0877.mo2510(c1804)) {
                            C1804 c1805 = (C1804) this.f1169;
                            AbstractC2235.m4213(c1805.f5962, c1805, this);
                            return;
                        }
                    } catch (Throwable th3) {
                        throw new C1076(th3, abstractC0877, c1804);
                    }
                }
            } catch (Throwable th4) {
                C1804 c1806 = (C1804) this.f1169;
                synchronized (c1806.f5965) {
                    C1804.f5960.decrementAndGet(c1806);
                    throw th4;
                }
            }
        }
    }

    public /* synthetic */ RunnableC0140(Object obj, Object obj2, int i, boolean z) {
        this.f1167 = i;
        this.f1168 = obj;
        this.f1169 = obj2;
    }

    public RunnableC0140(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f1167 = 6;
        this.f1169 = swipeDismissBehavior;
        this.f1168 = view;
    }

    public RunnableC0140(C1700 c1700, C1696 c1696, int i) {
        this.f1167 = 3;
        this.f1169 = c1700;
        this.f1168 = c1696;
    }
}
