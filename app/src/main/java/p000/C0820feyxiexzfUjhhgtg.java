package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ要点脸ᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0820feyxiexzfUjhhgtg extends C2949feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0816feyxiexzfUjhhgtg f3238Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final WeakHashMap f3239Ujhhgtgfeyxiexzf = new WeakHashMap();

    public C0820feyxiexzfUjhhgtg(C0816feyxiexzfUjhhgtg c0816feyxiexzfUjhhgtg) {
        this.f3238Ujhhgtgfeyxiexzf = c0816feyxiexzfUjhhgtg;
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean mo2164Ujhhgtgfeyxiexzf(View view, AccessibilityEvent accessibilityEvent) {
        C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg = (C2949feyxiexzfUjhhgtg) this.f3239Ujhhgtgfeyxiexzf.get(view);
        return c2949feyxiexzfUjhhgtg != null ? c2949feyxiexzfUjhhgtg.mo2164Ujhhgtgfeyxiexzf(view, accessibilityEvent) : this.f9251Ujhhgtgfeyxiexzf.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2965Ujhhgtgfeyxiexzf mo2165Ujhhgtgfeyxiexzf(View view) {
        C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg = (C2949feyxiexzfUjhhgtg) this.f3239Ujhhgtgfeyxiexzf.get(view);
        return c2949feyxiexzfUjhhgtg != null ? c2949feyxiexzfUjhhgtg.mo2165Ujhhgtgfeyxiexzf(view) : super.mo2165Ujhhgtgfeyxiexzf(view);
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1258Ujhhgtgfeyxiexzf(View view, AccessibilityEvent accessibilityEvent) {
        C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg = (C2949feyxiexzfUjhhgtg) this.f3239Ujhhgtgfeyxiexzf.get(view);
        if (c2949feyxiexzfUjhhgtg != null) {
            c2949feyxiexzfUjhhgtg.mo1258Ujhhgtgfeyxiexzf(view, accessibilityEvent);
        } else {
            super.mo1258Ujhhgtgfeyxiexzf(view, accessibilityEvent);
        }
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo865Ujhhgtgfeyxiexzf(View view, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        AccessibilityNodeInfo accessibilityNodeInfo = c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
        C0816feyxiexzfUjhhgtg c0816feyxiexzfUjhhgtg = this.f3238Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = c0816feyxiexzfUjhhgtg.f3228Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView2 = c0816feyxiexzfUjhhgtg.f3228Ujhhgtgfeyxiexzf;
        boolean zM234feyxiexzfUjhhgtg = recyclerView.m234feyxiexzfUjhhgtg();
        View.AccessibilityDelegate accessibilityDelegate = this.f9251Ujhhgtgfeyxiexzf;
        if (zM234feyxiexzfUjhhgtg || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m2210Ujhhgtgfeyxiexzf(view, c2963feyxiexzfUjhhgtg);
        C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg = (C2949feyxiexzfUjhhgtg) this.f3239Ujhhgtgfeyxiexzf.get(view);
        if (c2949feyxiexzfUjhhgtg != null) {
            c2949feyxiexzfUjhhgtg.mo865Ujhhgtgfeyxiexzf(view, c2963feyxiexzfUjhhgtg);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void mo2166Ujhhgtgfeyxiexzf(View view, AccessibilityEvent accessibilityEvent) {
        C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg = (C2949feyxiexzfUjhhgtg) this.f3239Ujhhgtgfeyxiexzf.get(view);
        if (c2949feyxiexzfUjhhgtg != null) {
            c2949feyxiexzfUjhhgtg.mo2166Ujhhgtgfeyxiexzf(view, accessibilityEvent);
        } else {
            super.mo2166Ujhhgtgfeyxiexzf(view, accessibilityEvent);
        }
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean mo2167Ujhhgtgfeyxiexzf(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg = (C2949feyxiexzfUjhhgtg) this.f3239Ujhhgtgfeyxiexzf.get(viewGroup);
        return c2949feyxiexzfUjhhgtg != null ? c2949feyxiexzfUjhhgtg.mo2167Ujhhgtgfeyxiexzf(viewGroup, view, accessibilityEvent) : this.f9251Ujhhgtgfeyxiexzf.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final boolean mo866Ujhhgtgfeyxiexzf(View view, int i, Bundle bundle) {
        C0816feyxiexzfUjhhgtg c0816feyxiexzfUjhhgtg = this.f3238Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = c0816feyxiexzfUjhhgtg.f3228Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView2 = c0816feyxiexzfUjhhgtg.f3228Ujhhgtgfeyxiexzf;
        if (recyclerView.m234feyxiexzfUjhhgtg() || recyclerView2.getLayoutManager() == null) {
            return super.mo866Ujhhgtgfeyxiexzf(view, i, bundle);
        }
        C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg = (C2949feyxiexzfUjhhgtg) this.f3239Ujhhgtgfeyxiexzf.get(view);
        if (c2949feyxiexzfUjhhgtg != null) {
            if (c2949feyxiexzfUjhhgtg.mo866Ujhhgtgfeyxiexzf(view, i, bundle)) {
                return true;
            }
        } else if (super.mo866Ujhhgtgfeyxiexzf(view, i, bundle)) {
            return true;
        }
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = recyclerView2.getLayoutManager().f3261Ujhhgtgfeyxiexzf.f359Ujhhgtgfeyxiexzf;
        return false;
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void mo2168Ujhhgtgfeyxiexzf(View view, int i) {
        C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg = (C2949feyxiexzfUjhhgtg) this.f3239Ujhhgtgfeyxiexzf.get(view);
        if (c2949feyxiexzfUjhhgtg != null) {
            c2949feyxiexzfUjhhgtg.mo2168Ujhhgtgfeyxiexzf(view, i);
        } else {
            super.mo2168Ujhhgtgfeyxiexzf(view, i);
        }
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void mo2169Ujhhgtgfeyxiexzf(View view, AccessibilityEvent accessibilityEvent) {
        C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg = (C2949feyxiexzfUjhhgtg) this.f3239Ujhhgtgfeyxiexzf.get(view);
        if (c2949feyxiexzfUjhhgtg != null) {
            c2949feyxiexzfUjhhgtg.mo2169Ujhhgtgfeyxiexzf(view, accessibilityEvent);
        } else {
            super.mo2169Ujhhgtgfeyxiexzf(view, accessibilityEvent);
        }
    }
}
