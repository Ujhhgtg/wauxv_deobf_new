package p000;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛱfeyxiexzfᛱᛴ要点脸ᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1756feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C2440feyxiexzfUjhhgtg f5897Ujhhgtgfeyxiexzf = new C2440feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final ThreadLocal f5898Ujhhgtgfeyxiexzf = new ThreadLocal();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final ArrayList f5899Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m3050Ujhhgtgfeyxiexzf(ViewGroup viewGroup, AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtg) {
        ArrayList arrayList = f5899Ujhhgtgfeyxiexzf;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC1747feyxiexzfUjhhgtg == null) {
            abstractC1747feyxiexzfUjhhgtg = f5897Ujhhgtgfeyxiexzf;
        }
        AbstractC1747feyxiexzfUjhhgtg abstractC1747feyxiexzfUjhhgtgClone = abstractC1747feyxiexzfUjhhgtg.clone();
        ArrayList arrayList2 = (ArrayList) m3051Ujhhgtgfeyxiexzf().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC1747feyxiexzfUjhhgtg) it.next()).mo3033Ujhhgtgfeyxiexzf(viewGroup);
            }
        }
        abstractC1747feyxiexzfUjhhgtgClone.m3019Ujhhgtgfeyxiexzf(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC1757feyxiexzfUjhhgtg viewTreeObserverOnPreDrawListenerC1757feyxiexzfUjhhgtg = new ViewTreeObserverOnPreDrawListenerC1757feyxiexzfUjhhgtg();
        viewTreeObserverOnPreDrawListenerC1757feyxiexzfUjhhgtg.f5900Ujhhgtgfeyxiexzf = abstractC1747feyxiexzfUjhhgtgClone;
        viewTreeObserverOnPreDrawListenerC1757feyxiexzfUjhhgtg.f5901Ujhhgtgfeyxiexzf = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1757feyxiexzfUjhhgtg);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1757feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C2412Ujhhgtgfeyxiexzf m3051Ujhhgtgfeyxiexzf() {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf;
        ThreadLocal threadLocal = f5898Ujhhgtgfeyxiexzf;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c2412Ujhhgtgfeyxiexzf = (C2412Ujhhgtgfeyxiexzf) weakReference.get()) != null) {
            return c2412Ujhhgtgfeyxiexzf;
        }
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf2 = new C2412Ujhhgtgfeyxiexzf(0);
        threadLocal.set(new WeakReference(c2412Ujhhgtgfeyxiexzf2));
        return c2412Ujhhgtgfeyxiexzf2;
    }
}
