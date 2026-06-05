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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3003feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9326Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f9327Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f9328Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC3003feyxiexzfUjhhgtg(Object obj, int i, Object obj2) {
        this.f9326Ujhhgtgfeyxiexzf = i;
        this.f9328Ujhhgtgfeyxiexzf = obj;
        this.f9327Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0360Ujhhgtgfeyxiexzf interfaceC0360Ujhhgtgfeyxiexzf;
        int i = 0;
        switch (this.f9326Ujhhgtgfeyxiexzf) {
            case 0:
                C3001Ujhhgtgfeyxiexzf c3001Ujhhgtgfeyxiexzf = (C3001Ujhhgtgfeyxiexzf) this.f9327Ujhhgtgfeyxiexzf;
                C3007Ujhhgtgfeyxiexzf c3007Ujhhgtgfeyxiexzf = (C3007Ujhhgtgfeyxiexzf) this.f9328Ujhhgtgfeyxiexzf;
                MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = c3007Ujhhgtgfeyxiexzf.f9334Ujhhgtgfeyxiexzf;
                if (menuC0355Ujhhgtgfeyxiexzf != null && (interfaceC0360Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf.f2008Ujhhgtgfeyxiexzf) != null) {
                    interfaceC0360Ujhhgtgfeyxiexzf.mo1572Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf);
                }
                ActionMenuView actionMenuView = c3007Ujhhgtgfeyxiexzf.f9338Ujhhgtgfeyxiexzf;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (c3001Ujhhgtgfeyxiexzf.m1576Ujhhgtgfeyxiexzf()) {
                        c3007Ujhhgtgfeyxiexzf.f9349Ujhhgtgfeyxiexzf = c3001Ujhhgtgfeyxiexzf;
                    } else if (c3001Ujhhgtgfeyxiexzf.f2062Ujhhgtgfeyxiexzf != null) {
                        c3001Ujhhgtgfeyxiexzf.m1578Ujhhgtgfeyxiexzf(0, 0, false, false);
                        c3007Ujhhgtgfeyxiexzf.f9349Ujhhgtgfeyxiexzf = c3001Ujhhgtgfeyxiexzf;
                    }
                }
                c3007Ujhhgtgfeyxiexzf.f9351Ujhhgtgfeyxiexzf = null;
                return;
            case 1:
                C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = (C0709Ujhhgtgfeyxiexzf) this.f9327Ujhhgtgfeyxiexzf;
                Typeface typeface = (Typeface) this.f9328Ujhhgtgfeyxiexzf;
                AbstractC1791feyxiexzfUjhhgtg abstractC1791feyxiexzfUjhhgtg = (AbstractC1791feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf;
                if (abstractC1791feyxiexzfUjhhgtg != null) {
                    abstractC1791feyxiexzfUjhhgtg.mo3168feyxiexzfUjhhgtg(typeface);
                    return;
                }
                return;
            case 2:
                ThreadFactoryC3599feyxiexzfUjhhgtg threadFactoryC3599feyxiexzfUjhhgtg = (ThreadFactoryC3599feyxiexzfUjhhgtg) this.f9328Ujhhgtgfeyxiexzf;
                if (threadFactoryC3599feyxiexzfUjhhgtg.f11207Ujhhgtgfeyxiexzf) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f9327Ujhhgtgfeyxiexzf).run();
                    return;
                } catch (Throwable th) {
                    threadFactoryC3599feyxiexzfUjhhgtg.f11206Ujhhgtgfeyxiexzf.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 3:
                C0697Ujhhgtgfeyxiexzf c0697Ujhhgtgfeyxiexzf = (C0697Ujhhgtgfeyxiexzf) this.f9327Ujhhgtgfeyxiexzf;
                C0708Ujhhgtgfeyxiexzf c0708Ujhhgtgfeyxiexzf = (C0708Ujhhgtgfeyxiexzf) this.f9328Ujhhgtgfeyxiexzf;
                RecyclerView recyclerView = c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf;
                if (recyclerView == null || !recyclerView.f375Ujhhgtgfeyxiexzf || c0697Ujhhgtgfeyxiexzf.f2863Ujhhgtgfeyxiexzf || c0697Ujhhgtgfeyxiexzf.f2857Ujhhgtgfeyxiexzf.m2171Ujhhgtgfeyxiexzf() == -1) {
                    return;
                }
                AbstractC0793feyxiexzfUjhhgtg itemAnimator = c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.mo2129Ujhhgtgfeyxiexzf()) {
                    ArrayList arrayList = c0708Ujhhgtgfeyxiexzf.f2931Ujhhgtgfeyxiexzf;
                    int size = arrayList.size();
                    while (i < size) {
                        if (((C0697Ujhhgtgfeyxiexzf) arrayList.get(i)).f2864Ujhhgtgfeyxiexzf) {
                            i++;
                        }
                    }
                    c0708Ujhhgtgfeyxiexzf.f2928Ujhhgtgfeyxiexzf.getClass();
                    return;
                }
                c0708Ujhhgtgfeyxiexzf.f2933Ujhhgtgfeyxiexzf.post(this);
                return;
            case 4:
                break;
            case 5:
                ((C3628feyxiexzfUjhhgtg) this.f9327Ujhhgtgfeyxiexzf).accept(this.f9328Ujhhgtgfeyxiexzf);
                return;
            case 6:
                C1900feyxiexzfUjhhgtg c1900feyxiexzfUjhhgtg = ((SwipeDismissBehavior) this.f9328Ujhhgtgfeyxiexzf).f631Ujhhgtgfeyxiexzf;
                if (c1900feyxiexzfUjhhgtg == null || !c1900feyxiexzfUjhhgtg.m3243Ujhhgtgfeyxiexzf()) {
                    return;
                }
                View view = (View) this.f9327Ujhhgtgfeyxiexzf;
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                view.postOnAnimation(this);
                return;
            default:
                AbstractC3516feyxiexzfUjhhgtg.m5073feyxiexzfUjhhgtg((Activity) this.f9327Ujhhgtgfeyxiexzf, (View) this.f9328Ujhhgtgfeyxiexzf);
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f9327Ujhhgtgfeyxiexzf).run();
            } catch (Throwable th2) {
                AbstractC0615Ujhhgtgfeyxiexzf.m1884Ujhhgtgfeyxiexzf(C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf, th2);
            }
            try {
                Runnable runnableM1130feyxiexzfUjhhgtg = ((C0082Ujhhgtgfeyxiexzf) this.f9328Ujhhgtgfeyxiexzf).m1130feyxiexzfUjhhgtg();
                if (runnableM1130feyxiexzfUjhhgtg == null) {
                    return;
                }
                this.f9327Ujhhgtgfeyxiexzf = runnableM1130feyxiexzfUjhhgtg;
                i++;
                if (i >= 16) {
                    C0082Ujhhgtgfeyxiexzf c0082Ujhhgtgfeyxiexzf = (C0082Ujhhgtgfeyxiexzf) this.f9328Ujhhgtgfeyxiexzf;
                    AbstractC3740feyxiexzfUjhhgtg abstractC3740feyxiexzfUjhhgtg = c0082Ujhhgtgfeyxiexzf.f1154Ujhhgtgfeyxiexzf;
                    try {
                        if (abstractC3740feyxiexzfUjhhgtg.mo1826feyxiexzfUjhhgtg(c0082Ujhhgtgfeyxiexzf)) {
                            C0082Ujhhgtgfeyxiexzf c0082Ujhhgtgfeyxiexzf2 = (C0082Ujhhgtgfeyxiexzf) this.f9328Ujhhgtgfeyxiexzf;
                            AbstractC1264feyxiexzfUjhhgtg.m2806Ujhhgtgfeyxiexzf(c0082Ujhhgtgfeyxiexzf2.f1154Ujhhgtgfeyxiexzf, c0082Ujhhgtgfeyxiexzf2, this);
                            return;
                        }
                    } catch (Throwable th3) {
                        throw new C3198feyxiexzfUjhhgtg(th3, abstractC3740feyxiexzfUjhhgtg, c0082Ujhhgtgfeyxiexzf);
                    }
                }
            } catch (Throwable th4) {
                C0082Ujhhgtgfeyxiexzf c0082Ujhhgtgfeyxiexzf3 = (C0082Ujhhgtgfeyxiexzf) this.f9328Ujhhgtgfeyxiexzf;
                synchronized (c0082Ujhhgtgfeyxiexzf3.f1157Ujhhgtgfeyxiexzf) {
                    C0082Ujhhgtgfeyxiexzf.f1152Ujhhgtgfeyxiexzf.decrementAndGet(c0082Ujhhgtgfeyxiexzf3);
                    throw th4;
                }
            }
        }
    }

    public /* synthetic */ RunnableC3003feyxiexzfUjhhgtg(Object obj, Object obj2, int i, boolean z) {
        this.f9326Ujhhgtgfeyxiexzf = i;
        this.f9327Ujhhgtgfeyxiexzf = obj;
        this.f9328Ujhhgtgfeyxiexzf = obj2;
    }

    public RunnableC3003feyxiexzfUjhhgtg(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f9326Ujhhgtgfeyxiexzf = 6;
        this.f9328Ujhhgtgfeyxiexzf = swipeDismissBehavior;
        this.f9327Ujhhgtgfeyxiexzf = view;
    }

    public RunnableC3003feyxiexzfUjhhgtg(C0708Ujhhgtgfeyxiexzf c0708Ujhhgtgfeyxiexzf, C0697Ujhhgtgfeyxiexzf c0697Ujhhgtgfeyxiexzf, int i) {
        this.f9326Ujhhgtgfeyxiexzf = 3;
        this.f9328Ujhhgtgfeyxiexzf = c0708Ujhhgtgfeyxiexzf;
        this.f9327Ujhhgtgfeyxiexzf = c0697Ujhhgtgfeyxiexzf;
    }
}
