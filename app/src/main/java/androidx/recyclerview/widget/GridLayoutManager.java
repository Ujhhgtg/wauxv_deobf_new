package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import p000.AbstractC0624Ujhhgtgfeyxiexzf;
import p000.AbstractC0795feyxiexzfUjhhgtg;
import p000.AbstractC0821feyxiexzfUjhhgtg;
import p000.AbstractC0822feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.C0085Ujhhgtgfeyxiexzf;
import p000.C0087Ujhhgtgfeyxiexzf;
import p000.C0088Ujhhgtgfeyxiexzf;
import p000.C0622Ujhhgtgfeyxiexzf;
import p000.C0623Ujhhgtgfeyxiexzf;
import p000.C0810feyxiexzfUjhhgtg;
import p000.C0825feyxiexzfUjhhgtg;
import p000.C0831feyxiexzfUjhhgtg;
import p000.C2956feyxiexzfUjhhgtg;
import p000.C2962feyxiexzfUjhhgtg;
import p000.C2963feyxiexzfUjhhgtg;
import p000.C3570Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final Set f321feyxiexzfUjhhgtg = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, Integer.valueOf(Opcodes.IXOR))));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public boolean f322feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public int f323feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public int[] f324feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public View[] f325feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final SparseIntArray f326feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final SparseIntArray f327feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public AbstractC0624Ujhhgtgfeyxiexzf f328feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final Rect f329feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public int f330feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public int f331feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public int f332feyxiexzfUjhhgtg;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f322feyxiexzfUjhhgtg = false;
        this.f323feyxiexzfUjhhgtg = -1;
        this.f326feyxiexzfUjhhgtg = new SparseIntArray();
        this.f327feyxiexzfUjhhgtg = new SparseIntArray();
        this.f328feyxiexzfUjhhgtg = new C0622Ujhhgtgfeyxiexzf();
        this.f329feyxiexzfUjhhgtg = new Rect();
        this.f330feyxiexzfUjhhgtg = -1;
        this.f331feyxiexzfUjhhgtg = -1;
        this.f332feyxiexzfUjhhgtg = -1;
        m116Ujhhgtgfeyxiexzf(AbstractC0822feyxiexzfUjhhgtg.m2197feyxiexzfUjhhgtg(context, attributeSet, i, i2).f3276Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m107Ujhhgtgfeyxiexzf(int i) {
        if (this.f333Ujhhgtgfeyxiexzf == 0) {
            RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
            return m112Ujhhgtgfeyxiexzf(i, recyclerView.f359Ujhhgtgfeyxiexzf, recyclerView.f412feyxiexzfUjhhgtg);
        }
        RecyclerView recyclerView2 = this.f3261Ujhhgtgfeyxiexzf;
        return m113Ujhhgtgfeyxiexzf(i, recyclerView2.f359Ujhhgtgfeyxiexzf, recyclerView2.f412feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m108Ujhhgtgfeyxiexzf(int i) {
        if (this.f333Ujhhgtgfeyxiexzf == 1) {
            RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
            return m112Ujhhgtgfeyxiexzf(i, recyclerView.f359Ujhhgtgfeyxiexzf, recyclerView.f412feyxiexzfUjhhgtg);
        }
        RecyclerView recyclerView2 = this.f3261Ujhhgtgfeyxiexzf;
        return m113Ujhhgtgfeyxiexzf(i, recyclerView2.f359Ujhhgtgfeyxiexzf, recyclerView2.f412feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final HashSet m109Ujhhgtgfeyxiexzf(int i) {
        return m110Ujhhgtgfeyxiexzf(m108Ujhhgtgfeyxiexzf(i), i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final HashSet m110Ujhhgtgfeyxiexzf(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        int iM114Ujhhgtgfeyxiexzf = m114Ujhhgtgfeyxiexzf(i2, recyclerView.f359Ujhhgtgfeyxiexzf, recyclerView.f412feyxiexzfUjhhgtg);
        for (int i3 = i; i3 < i + iM114Ujhhgtgfeyxiexzf; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m111Ujhhgtgfeyxiexzf(int i, int i2) {
        if (this.f333Ujhhgtgfeyxiexzf != 1 || !m185feyxiexzfUjhhgtg()) {
            int[] iArr = this.f324feyxiexzfUjhhgtg;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f324feyxiexzfUjhhgtg;
        int i3 = this.f323feyxiexzfUjhhgtg;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int m112Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (!c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
            return this.f328feyxiexzfUjhhgtg.m1901Ujhhgtgfeyxiexzf(i, this.f323feyxiexzfUjhhgtg);
        }
        int iM2230Ujhhgtgfeyxiexzf = c0831feyxiexzfUjhhgtg.m2230Ujhhgtgfeyxiexzf(i);
        if (iM2230Ujhhgtgfeyxiexzf != -1) {
            return this.f328feyxiexzfUjhhgtg.m1901Ujhhgtgfeyxiexzf(iM2230Ujhhgtgfeyxiexzf, this.f323feyxiexzfUjhhgtg);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int m113Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (!c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
            return this.f328feyxiexzfUjhhgtg.mo1899Ujhhgtgfeyxiexzf(i, this.f323feyxiexzfUjhhgtg);
        }
        int i2 = this.f327feyxiexzfUjhhgtg.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM2230Ujhhgtgfeyxiexzf = c0831feyxiexzfUjhhgtg.m2230Ujhhgtgfeyxiexzf(i);
        if (iM2230Ujhhgtgfeyxiexzf != -1) {
            return this.f328feyxiexzfUjhhgtg.mo1899Ujhhgtgfeyxiexzf(iM2230Ujhhgtgfeyxiexzf, this.f323feyxiexzfUjhhgtg);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int m114Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (!c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
            return this.f328feyxiexzfUjhhgtg.mo1900Ujhhgtgfeyxiexzf(i);
        }
        int i2 = this.f326feyxiexzfUjhhgtg.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM2230Ujhhgtgfeyxiexzf = c0831feyxiexzfUjhhgtg.m2230Ujhhgtgfeyxiexzf(i);
        if (iM2230Ujhhgtgfeyxiexzf != -1) {
            return this.f328feyxiexzfUjhhgtg.mo1900Ujhhgtgfeyxiexzf(iM2230Ujhhgtgfeyxiexzf);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m115Ujhhgtgfeyxiexzf(View view, int i, boolean z) {
        int iM2189Ujhhgtgfeyxiexzf;
        int iM2189Ujhhgtgfeyxiexzf2;
        C0623Ujhhgtgfeyxiexzf c0623Ujhhgtgfeyxiexzf = (C0623Ujhhgtgfeyxiexzf) view.getLayoutParams();
        Rect rect = c0623Ujhhgtgfeyxiexzf.f3280Ujhhgtgfeyxiexzf;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf).topMargin + ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf).leftMargin + ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf).rightMargin;
        int iM111Ujhhgtgfeyxiexzf = m111Ujhhgtgfeyxiexzf(c0623Ujhhgtgfeyxiexzf.f2651Ujhhgtgfeyxiexzf, c0623Ujhhgtgfeyxiexzf.f2652Ujhhgtgfeyxiexzf);
        if (this.f333Ujhhgtgfeyxiexzf == 1) {
            iM2189Ujhhgtgfeyxiexzf2 = AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(iM111Ujhhgtgfeyxiexzf, i, i3, ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf).width, false);
            iM2189Ujhhgtgfeyxiexzf = AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(this.f335Ujhhgtgfeyxiexzf.mo2984Ujhhgtgfeyxiexzf(), this.f3272Ujhhgtgfeyxiexzf, i2, ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf).height, true);
        } else {
            int iM2189Ujhhgtgfeyxiexzf3 = AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(iM111Ujhhgtgfeyxiexzf, i, i2, ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf).height, false);
            int iM2189Ujhhgtgfeyxiexzf4 = AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(this.f335Ujhhgtgfeyxiexzf.mo2984Ujhhgtgfeyxiexzf(), this.f3271Ujhhgtgfeyxiexzf, i3, ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf).width, true);
            iM2189Ujhhgtgfeyxiexzf = iM2189Ujhhgtgfeyxiexzf3;
            iM2189Ujhhgtgfeyxiexzf2 = iM2189Ujhhgtgfeyxiexzf4;
        }
        C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) view.getLayoutParams();
        if (z ? m2222feyxiexzfUjhhgtg(view, iM2189Ujhhgtgfeyxiexzf2, iM2189Ujhhgtgfeyxiexzf, c0825feyxiexzfUjhhgtg) : m2221feyxiexzfUjhhgtg(view, iM2189Ujhhgtgfeyxiexzf2, iM2189Ujhhgtgfeyxiexzf, c0825feyxiexzfUjhhgtg)) {
            view.measure(iM2189Ujhhgtgfeyxiexzf2, iM2189Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m116Ujhhgtgfeyxiexzf(int i) {
        if (i == this.f323feyxiexzfUjhhgtg) {
            return;
        }
        this.f322feyxiexzfUjhhgtg = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Span count should be at least 1. Provided "));
        }
        this.f323feyxiexzfUjhhgtg = i;
        this.f328feyxiexzfUjhhgtg.m1902Ujhhgtgfeyxiexzf();
        m2216feyxiexzfUjhhgtg();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱ要点脸ᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m117Ujhhgtgfeyxiexzf() {
        int iM2205feyxiexzfUjhhgtg;
        int iM2208feyxiexzfUjhhgtg;
        if (this.f333Ujhhgtgfeyxiexzf == 1) {
            iM2205feyxiexzfUjhhgtg = this.f3273Ujhhgtgfeyxiexzf - m2207feyxiexzfUjhhgtg();
            iM2208feyxiexzfUjhhgtg = m2206feyxiexzfUjhhgtg();
        } else {
            iM2205feyxiexzfUjhhgtg = this.f3274Ujhhgtgfeyxiexzf - m2205feyxiexzfUjhhgtg();
            iM2208feyxiexzfUjhhgtg = m2208feyxiexzfUjhhgtg();
        }
        m148Ujhhgtgfeyxiexzf(iM2205feyxiexzfUjhhgtg - iM2208feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean mo118Ujhhgtgfeyxiexzf(C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg) {
        return c0825feyxiexzfUjhhgtg instanceof C0623Ujhhgtgfeyxiexzf;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int mo119Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m170feyxiexzfUjhhgtg(c0810feyxiexzfUjhhgtg);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int mo120Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m171Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final int mo121Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m170feyxiexzfUjhhgtg(c0810feyxiexzfUjhhgtg);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int mo122Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m171Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C0825feyxiexzfUjhhgtg mo123Ujhhgtgfeyxiexzf() {
        return this.f333Ujhhgtgfeyxiexzf == 0 ? new C0623Ujhhgtgfeyxiexzf(-2, -1) : new C0623Ujhhgtgfeyxiexzf(-1, -2);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final C0825feyxiexzfUjhhgtg mo124Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        C0623Ujhhgtgfeyxiexzf c0623Ujhhgtgfeyxiexzf = new C0623Ujhhgtgfeyxiexzf(context, attributeSet);
        c0623Ujhhgtgfeyxiexzf.f2651Ujhhgtgfeyxiexzf = -1;
        c0623Ujhhgtgfeyxiexzf.f2652Ujhhgtgfeyxiexzf = 0;
        return c0623Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final C0825feyxiexzfUjhhgtg mo125Ujhhgtgfeyxiexzf(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0623Ujhhgtgfeyxiexzf c0623Ujhhgtgfeyxiexzf = new C0623Ujhhgtgfeyxiexzf((ViewGroup.MarginLayoutParams) layoutParams);
            c0623Ujhhgtgfeyxiexzf.f2651Ujhhgtgfeyxiexzf = -1;
            c0623Ujhhgtgfeyxiexzf.f2652Ujhhgtgfeyxiexzf = 0;
            return c0623Ujhhgtgfeyxiexzf;
        }
        C0623Ujhhgtgfeyxiexzf c0623Ujhhgtgfeyxiexzf2 = new C0623Ujhhgtgfeyxiexzf(layoutParams);
        c0623Ujhhgtgfeyxiexzf2.f2651Ujhhgtgfeyxiexzf = -1;
        c0623Ujhhgtgfeyxiexzf2.f2652Ujhhgtgfeyxiexzf = 0;
        return c0623Ujhhgtgfeyxiexzf2;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int mo126Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (this.f333Ujhhgtgfeyxiexzf == 1) {
            return Math.min(this.f323feyxiexzfUjhhgtg, m2204feyxiexzfUjhhgtg());
        }
        if (c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() < 1) {
            return 0;
        }
        return m112Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() - 1, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg) + 1;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final int mo127feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (this.f333Ujhhgtgfeyxiexzf == 0) {
            return Math.min(this.f323feyxiexzfUjhhgtg, m2204feyxiexzfUjhhgtg());
        }
        if (c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() < 1) {
            return 0;
        }
        return m112Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() - 1, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo128Ujhhgtgfeyxiexzf(View view, int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        View viewM225feyxiexzfUjhhgtg;
        int iM2203Ujhhgtgfeyxiexzf;
        int i2;
        int iM2203Ujhhgtgfeyxiexzf2;
        View view2;
        View view3;
        int i3;
        int i4;
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg2 = c0831feyxiexzfUjhhgtg;
        C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg2 = c0810feyxiexzfUjhhgtg;
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView == null || (viewM225feyxiexzfUjhhgtg = recyclerView.m225feyxiexzfUjhhgtg(view)) == null || ((ArrayList) this.f3260Ujhhgtgfeyxiexzf.f8836Ujhhgtgfeyxiexzf).contains(viewM225feyxiexzfUjhhgtg)) {
            viewM225feyxiexzfUjhhgtg = null;
        }
        if (viewM225feyxiexzfUjhhgtg != null) {
            C0623Ujhhgtgfeyxiexzf c0623Ujhhgtgfeyxiexzf = (C0623Ujhhgtgfeyxiexzf) viewM225feyxiexzfUjhhgtg.getLayoutParams();
            int i5 = c0623Ujhhgtgfeyxiexzf.f2651Ujhhgtgfeyxiexzf;
            int i6 = c0623Ujhhgtgfeyxiexzf.f2652Ujhhgtgfeyxiexzf + i5;
            if (super.mo128Ujhhgtgfeyxiexzf(view, i, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg) != null) {
                if ((m172Ujhhgtgfeyxiexzf(i) == 1) != this.f338Ujhhgtgfeyxiexzf) {
                    iM2203Ujhhgtgfeyxiexzf2 = m2203Ujhhgtgfeyxiexzf() - 1;
                    iM2203Ujhhgtgfeyxiexzf = -1;
                    i2 = -1;
                } else {
                    iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf();
                    i2 = 1;
                    iM2203Ujhhgtgfeyxiexzf2 = 0;
                }
                boolean z = this.f333Ujhhgtgfeyxiexzf == 1 && m185feyxiexzfUjhhgtg();
                int iM112Ujhhgtgfeyxiexzf = m112Ujhhgtgfeyxiexzf(iM2203Ujhhgtgfeyxiexzf2, c0831feyxiexzfUjhhgtg2, c0810feyxiexzfUjhhgtg2);
                View view4 = null;
                int i7 = -1;
                int i8 = -1;
                int iMin = 0;
                int i9 = iM2203Ujhhgtgfeyxiexzf2;
                int iMin2 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i9 == iM2203Ujhhgtgfeyxiexzf) {
                        break;
                    }
                    int iM112Ujhhgtgfeyxiexzf2 = m112Ujhhgtgfeyxiexzf(i9, c0831feyxiexzfUjhhgtg2, c0810feyxiexzfUjhhgtg2);
                    View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(i9);
                    if (viewM2202Ujhhgtgfeyxiexzf == viewM225feyxiexzfUjhhgtg) {
                        break;
                    }
                    if (!viewM2202Ujhhgtgfeyxiexzf.hasFocusable() || iM112Ujhhgtgfeyxiexzf2 == iM112Ujhhgtgfeyxiexzf) {
                        C0623Ujhhgtgfeyxiexzf c0623Ujhhgtgfeyxiexzf2 = (C0623Ujhhgtgfeyxiexzf) viewM2202Ujhhgtgfeyxiexzf.getLayoutParams();
                        int i10 = c0623Ujhhgtgfeyxiexzf2.f2651Ujhhgtgfeyxiexzf;
                        view3 = viewM225feyxiexzfUjhhgtg;
                        int i11 = c0623Ujhhgtgfeyxiexzf2.f2652Ujhhgtgfeyxiexzf + i10;
                        if (viewM2202Ujhhgtgfeyxiexzf.hasFocusable() && i10 == i5 && i11 == i6) {
                            return viewM2202Ujhhgtgfeyxiexzf;
                        }
                        if (!(viewM2202Ujhhgtgfeyxiexzf.hasFocusable() && view4 == null) && (viewM2202Ujhhgtgfeyxiexzf.hasFocusable() || view2 != null)) {
                            i3 = iM2203Ujhhgtgfeyxiexzf;
                            int iMin3 = Math.min(i11, i6) - Math.max(i10, i5);
                            if (viewM2202Ujhhgtgfeyxiexzf.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i4 = iMin;
                                }
                                i4 = iMin;
                            } else if (view4 == null) {
                                i4 = iMin;
                                if (!this.f3262Ujhhgtgfeyxiexzf.m3371Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf) || !this.f3263Ujhhgtgfeyxiexzf.m3371Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z == (i10 > i7)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i4 = iMin;
                            }
                            i9 += i2;
                            c0831feyxiexzfUjhhgtg2 = c0831feyxiexzfUjhhgtg;
                            c0810feyxiexzfUjhhgtg2 = c0810feyxiexzfUjhhgtg;
                            viewM225feyxiexzfUjhhgtg = view3;
                            iM2203Ujhhgtgfeyxiexzf = i3;
                        } else {
                            i4 = iMin;
                            i3 = iM2203Ujhhgtgfeyxiexzf;
                        }
                        if (viewM2202Ujhhgtgfeyxiexzf.hasFocusable()) {
                            int i12 = c0623Ujhhgtgfeyxiexzf2.f2651Ujhhgtgfeyxiexzf;
                            iMin = Math.min(i11, i6) - Math.max(i10, i5);
                            view4 = viewM2202Ujhhgtgfeyxiexzf;
                            i8 = i12;
                            view5 = view2;
                        } else {
                            int i13 = c0623Ujhhgtgfeyxiexzf2.f2651Ujhhgtgfeyxiexzf;
                            view5 = viewM2202Ujhhgtgfeyxiexzf;
                            i7 = i13;
                            iMin = i4;
                            iMin2 = Math.min(i11, i6) - Math.max(i10, i5);
                        }
                        i9 += i2;
                        c0831feyxiexzfUjhhgtg2 = c0831feyxiexzfUjhhgtg;
                        c0810feyxiexzfUjhhgtg2 = c0810feyxiexzfUjhhgtg;
                        viewM225feyxiexzfUjhhgtg = view3;
                        iM2203Ujhhgtgfeyxiexzf = i3;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = viewM225feyxiexzfUjhhgtg;
                        i4 = iMin;
                        i3 = iM2203Ujhhgtgfeyxiexzf;
                    }
                    view5 = view2;
                    iMin = i4;
                    i9 += i2;
                    c0831feyxiexzfUjhhgtg2 = c0831feyxiexzfUjhhgtg;
                    c0810feyxiexzfUjhhgtg2 = c0810feyxiexzfUjhhgtg;
                    viewM225feyxiexzfUjhhgtg = view3;
                    iM2203Ujhhgtgfeyxiexzf = i3;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo129Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        super.mo129Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, c2963feyxiexzfUjhhgtg);
        c2963feyxiexzfUjhhgtg.m4439Ujhhgtgfeyxiexzf(GridView.class.getName());
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg = this.f3261Ujhhgtgfeyxiexzf.f369Ujhhgtgfeyxiexzf;
        if (abstractC0795feyxiexzfUjhhgtg == null || abstractC0795feyxiexzfUjhhgtg.mo2134Ujhhgtgfeyxiexzf() <= 1) {
            return;
        }
        c2963feyxiexzfUjhhgtg.m4433Ujhhgtgfeyxiexzf(C2956feyxiexzfUjhhgtg.f9264Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void mo130Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, View view, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0623Ujhhgtgfeyxiexzf)) {
            m2210Ujhhgtgfeyxiexzf(view, c2963feyxiexzfUjhhgtg);
            return;
        }
        C0623Ujhhgtgfeyxiexzf c0623Ujhhgtgfeyxiexzf = (C0623Ujhhgtgfeyxiexzf) layoutParams;
        int iM112Ujhhgtgfeyxiexzf = m112Ujhhgtgfeyxiexzf(c0623Ujhhgtgfeyxiexzf.f3279Ujhhgtgfeyxiexzf.m2173Ujhhgtgfeyxiexzf(), c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
        if (this.f333Ujhhgtgfeyxiexzf == 0) {
            c2963feyxiexzfUjhhgtg.m4440Ujhhgtgfeyxiexzf(C2962feyxiexzfUjhhgtg.m4429Ujhhgtgfeyxiexzf(c0623Ujhhgtgfeyxiexzf.f2651Ujhhgtgfeyxiexzf, c0623Ujhhgtgfeyxiexzf.f2652Ujhhgtgfeyxiexzf, iM112Ujhhgtgfeyxiexzf, 1, false));
        } else {
            c2963feyxiexzfUjhhgtg.m4440Ujhhgtgfeyxiexzf(C2962feyxiexzfUjhhgtg.m4429Ujhhgtgfeyxiexzf(iM112Ujhhgtgfeyxiexzf, 1, c0623Ujhhgtgfeyxiexzf.f2651Ujhhgtgfeyxiexzf, c0623Ujhhgtgfeyxiexzf.f2652Ujhhgtgfeyxiexzf, false));
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public final void mo131feyxiexzfUjhhgtg(int i, int i2) {
        this.f328feyxiexzfUjhhgtg.m1902Ujhhgtgfeyxiexzf();
        ((SparseIntArray) this.f328feyxiexzfUjhhgtg.f2654Ujhhgtgfeyxiexzf).clear();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final void mo132feyxiexzfUjhhgtg() {
        this.f328feyxiexzfUjhhgtg.m1902Ujhhgtgfeyxiexzf();
        ((SparseIntArray) this.f328feyxiexzfUjhhgtg.f2654Ujhhgtgfeyxiexzf).clear();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final void mo133feyxiexzfUjhhgtg(int i, int i2) {
        this.f328feyxiexzfUjhhgtg.m1902Ujhhgtgfeyxiexzf();
        ((SparseIntArray) this.f328feyxiexzfUjhhgtg.f2654Ujhhgtgfeyxiexzf).clear();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void mo134feyxiexzfUjhhgtg(int i, int i2) {
        this.f328feyxiexzfUjhhgtg.m1902Ujhhgtgfeyxiexzf();
        ((SparseIntArray) this.f328feyxiexzfUjhhgtg.f2654Ujhhgtgfeyxiexzf).clear();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void mo135feyxiexzfUjhhgtg(int i, int i2) {
        this.f328feyxiexzfUjhhgtg.m1902Ujhhgtgfeyxiexzf();
        ((SparseIntArray) this.f328feyxiexzfUjhhgtg.f2654Ujhhgtgfeyxiexzf).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void mo136feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        boolean z = c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf;
        SparseIntArray sparseIntArray = this.f327feyxiexzfUjhhgtg;
        SparseIntArray sparseIntArray2 = this.f326feyxiexzfUjhhgtg;
        if (z) {
            int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf();
            for (int i = 0; i < iM2203Ujhhgtgfeyxiexzf; i++) {
                C0623Ujhhgtgfeyxiexzf c0623Ujhhgtgfeyxiexzf = (C0623Ujhhgtgfeyxiexzf) m2202Ujhhgtgfeyxiexzf(i).getLayoutParams();
                int iM2173Ujhhgtgfeyxiexzf = c0623Ujhhgtgfeyxiexzf.f3279Ujhhgtgfeyxiexzf.m2173Ujhhgtgfeyxiexzf();
                sparseIntArray2.put(iM2173Ujhhgtgfeyxiexzf, c0623Ujhhgtgfeyxiexzf.f2652Ujhhgtgfeyxiexzf);
                sparseIntArray.put(iM2173Ujhhgtgfeyxiexzf, c0623Ujhhgtgfeyxiexzf.f2651Ujhhgtgfeyxiexzf);
            }
        }
        super.mo136feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void mo137Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        View viewMo158Ujhhgtgfeyxiexzf;
        super.mo137Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg);
        this.f322feyxiexzfUjhhgtg = false;
        int i = this.f330feyxiexzfUjhhgtg;
        if (i == -1 || (viewMo158Ujhhgtgfeyxiexzf = mo158Ujhhgtgfeyxiexzf(i)) == null) {
            return;
        }
        viewMo158Ujhhgtgfeyxiexzf.sendAccessibilityEvent(67108864);
        this.f330feyxiexzfUjhhgtg = -1;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x019e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a6 A[EDGE_INSN: B:122:0x01a6->B:166:0x0279 BREAK  A[LOOP:2: B:126:0x01b6->B:135:0x01df, LOOP_LABEL: LOOP:2: B:126:0x01b6->B:135:0x01df]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d7 A[LOOP:3: B:129:0x01c4->B:134:0x01d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:142:0x0210  */
    /* JADX WARN: Code duplicated, block: B:143:0x0212  */
    /* JADX WARN: Code duplicated, block: B:145:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0224  */
    /* JADX WARN: Code duplicated, block: B:153:0x0232  */
    /* JADX WARN: Code duplicated, block: B:156:0x0240  */
    /* JADX WARN: Code duplicated, block: B:163:0x025f  */
    /* JADX WARN: Code duplicated, block: B:167:0x027b  */
    /* JADX WARN: Code duplicated, block: B:206:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[LOOP:4: B:137:0x01ea->B:211:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[LOOP:7: B:161:0x0259->B:221:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean mo138Ujhhgtgfeyxiexzf(int i, Bundle bundle) {
        View viewM2202Ujhhgtgfeyxiexzf;
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == C2956feyxiexzfUjhhgtg.f9264Ujhhgtgfeyxiexzf.m4404Ujhhgtgfeyxiexzf() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= m2203Ujhhgtgfeyxiexzf()) {
                    viewM2202Ujhhgtgfeyxiexzf = null;
                    break;
                }
                if (m2202Ujhhgtgfeyxiexzf(i5).isAccessibilityFocused()) {
                    viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(i5);
                    break;
                }
                i5++;
            }
            if (viewM2202Ujhhgtgfeyxiexzf != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (f321feyxiexzfUjhhgtg.contains(Integer.valueOf(i6)) && (abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg = this.f3261Ujhhgtgfeyxiexzf.m232feyxiexzfUjhhgtg(viewM2202Ujhhgtgfeyxiexzf)) != null) {
                    int iM2171Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtgM232feyxiexzfUjhhgtg.m2171Ujhhgtgfeyxiexzf();
                    int iM108Ujhhgtgfeyxiexzf = m108Ujhhgtgfeyxiexzf(iM2171Ujhhgtgfeyxiexzf);
                    int iM107Ujhhgtgfeyxiexzf = m107Ujhhgtgfeyxiexzf(iM2171Ujhhgtgfeyxiexzf);
                    if (iM108Ujhhgtgfeyxiexzf >= 0 && iM107Ujhhgtgfeyxiexzf >= 0) {
                        if (!m109Ujhhgtgfeyxiexzf(iM2171Ujhhgtgfeyxiexzf).contains(Integer.valueOf(this.f331feyxiexzfUjhhgtg)) || !m110Ujhhgtgfeyxiexzf(m107Ujhhgtgfeyxiexzf(iM2171Ujhhgtgfeyxiexzf), iM2171Ujhhgtgfeyxiexzf).contains(Integer.valueOf(this.f332feyxiexzfUjhhgtg))) {
                            this.f331feyxiexzfUjhhgtg = iM108Ujhhgtgfeyxiexzf;
                            this.f332feyxiexzfUjhhgtg = iM107Ujhhgtgfeyxiexzf;
                        }
                        int i7 = this.f331feyxiexzfUjhhgtg;
                        if (i7 == -1) {
                            i7 = iM108Ujhhgtgfeyxiexzf;
                        }
                        int i8 = this.f332feyxiexzfUjhhgtg;
                        if (i8 != -1) {
                            iM107Ujhhgtgfeyxiexzf = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = iM2171Ujhhgtgfeyxiexzf - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iM108Ujhhgtgfeyxiexzf2 = m108Ujhhgtgfeyxiexzf(iIntValue);
                                    int iM107Ujhhgtgfeyxiexzf2 = m107Ujhhgtgfeyxiexzf(iIntValue);
                                    if (iM108Ujhhgtgfeyxiexzf2 >= 0 && iM107Ujhhgtgfeyxiexzf2 >= 0) {
                                        if (this.f333Ujhhgtgfeyxiexzf != 1) {
                                            if (m109Ujhhgtgfeyxiexzf(iIntValue).contains(Integer.valueOf(i7)) && iM107Ujhhgtgfeyxiexzf2 < iM107Ujhhgtgfeyxiexzf) {
                                                this.f332feyxiexzfUjhhgtg = iM107Ujhhgtgfeyxiexzf2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iM108Ujhhgtgfeyxiexzf2 == i7 && iM107Ujhhgtgfeyxiexzf2 < iM107Ujhhgtgfeyxiexzf) || iM108Ujhhgtgfeyxiexzf2 < i7) {
                                                this.f331feyxiexzfUjhhgtg = iM108Ujhhgtgfeyxiexzf2;
                                                this.f332feyxiexzfUjhhgtg = iM107Ujhhgtgfeyxiexzf2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM108Ujhhgtgfeyxiexzf < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m2204feyxiexzfUjhhgtg()) {
                                                    it2 = m109Ujhhgtgfeyxiexzf(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM108Ujhhgtgfeyxiexzf) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f331feyxiexzfUjhhgtg = iIntValue2;
                                                                this.f332feyxiexzfUjhhgtg = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM108Ujhhgtgfeyxiexzf < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m2204feyxiexzfUjhhgtg()) {
                                                it4 = m109Ujhhgtgfeyxiexzf(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM108Ujhhgtgfeyxiexzf) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f331feyxiexzfUjhhgtg = iIntValue3;
                                                            this.f332feyxiexzfUjhhgtg = m107Ujhhgtgfeyxiexzf(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                mo165Ujhhgtgfeyxiexzf(iIntValue);
                                this.f330feyxiexzfUjhhgtg = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = iM2171Ujhhgtgfeyxiexzf - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iM108Ujhhgtgfeyxiexzf3 = m108Ujhhgtgfeyxiexzf(iIntValue);
                                    int iM107Ujhhgtgfeyxiexzf3 = m107Ujhhgtgfeyxiexzf(iIntValue);
                                    if (iM108Ujhhgtgfeyxiexzf3 >= 0 && iM107Ujhhgtgfeyxiexzf3 >= 0) {
                                        if (this.f333Ujhhgtgfeyxiexzf != 1) {
                                            if (iM108Ujhhgtgfeyxiexzf3 < i7 && iM107Ujhhgtgfeyxiexzf3 == iM107Ujhhgtgfeyxiexzf) {
                                                this.f331feyxiexzfUjhhgtg = ((Integer) Collections.max(m109Ujhhgtgfeyxiexzf(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iM108Ujhhgtgfeyxiexzf3 < i7 && m110Ujhhgtgfeyxiexzf(m107Ujhhgtgfeyxiexzf(iIntValue), iIntValue).contains(Integer.valueOf(iM107Ujhhgtgfeyxiexzf))) {
                                                this.f331feyxiexzfUjhhgtg = iM108Ujhhgtgfeyxiexzf3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM108Ujhhgtgfeyxiexzf < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m2204feyxiexzfUjhhgtg()) {
                                                    it2 = m109Ujhhgtgfeyxiexzf(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM108Ujhhgtgfeyxiexzf) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f331feyxiexzfUjhhgtg = iIntValue2;
                                                                this.f332feyxiexzfUjhhgtg = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM108Ujhhgtgfeyxiexzf < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m2204feyxiexzfUjhhgtg()) {
                                                it4 = m109Ujhhgtgfeyxiexzf(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM108Ujhhgtgfeyxiexzf) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f331feyxiexzfUjhhgtg = iIntValue3;
                                                            this.f332feyxiexzfUjhhgtg = m107Ujhhgtgfeyxiexzf(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                mo165Ujhhgtgfeyxiexzf(iIntValue);
                                this.f330feyxiexzfUjhhgtg = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = iM2171Ujhhgtgfeyxiexzf + 1;
                            while (true) {
                                if (iIntValue < m2204feyxiexzfUjhhgtg()) {
                                    int iM108Ujhhgtgfeyxiexzf4 = m108Ujhhgtgfeyxiexzf(iIntValue);
                                    int iM107Ujhhgtgfeyxiexzf4 = m107Ujhhgtgfeyxiexzf(iIntValue);
                                    if (iM108Ujhhgtgfeyxiexzf4 >= 0 && iM107Ujhhgtgfeyxiexzf4 >= 0) {
                                        if (this.f333Ujhhgtgfeyxiexzf != 1) {
                                            if (iM107Ujhhgtgfeyxiexzf4 > iM107Ujhhgtgfeyxiexzf && m109Ujhhgtgfeyxiexzf(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.f332feyxiexzfUjhhgtg = iM107Ujhhgtgfeyxiexzf4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iM108Ujhhgtgfeyxiexzf4 == i7 && iM107Ujhhgtgfeyxiexzf4 > iM107Ujhhgtgfeyxiexzf) || iM108Ujhhgtgfeyxiexzf4 > i7) {
                                                this.f331feyxiexzfUjhhgtg = iM108Ujhhgtgfeyxiexzf4;
                                                this.f332feyxiexzfUjhhgtg = iM107Ujhhgtgfeyxiexzf4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM108Ujhhgtgfeyxiexzf < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < m2204feyxiexzfUjhhgtg()) {
                                                    it2 = m109Ujhhgtgfeyxiexzf(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iM108Ujhhgtgfeyxiexzf) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f331feyxiexzfUjhhgtg = iIntValue2;
                                                                this.f332feyxiexzfUjhhgtg = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iM108Ujhhgtgfeyxiexzf < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < m2204feyxiexzfUjhhgtg()) {
                                                it4 = m109Ujhhgtgfeyxiexzf(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iM108Ujhhgtgfeyxiexzf) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f331feyxiexzfUjhhgtg = iIntValue3;
                                                            this.f332feyxiexzfUjhhgtg = m107Ujhhgtgfeyxiexzf(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                mo165Ujhhgtgfeyxiexzf(iIntValue);
                                this.f330feyxiexzfUjhhgtg = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = iM2171Ujhhgtgfeyxiexzf + 1;
                            while (true) {
                                if (iIntValue < m2204feyxiexzfUjhhgtg()) {
                                    int iM108Ujhhgtgfeyxiexzf5 = m108Ujhhgtgfeyxiexzf(iIntValue);
                                    int iM107Ujhhgtgfeyxiexzf5 = m107Ujhhgtgfeyxiexzf(iIntValue);
                                    if (iM108Ujhhgtgfeyxiexzf5 >= 0 && iM107Ujhhgtgfeyxiexzf5 >= 0) {
                                        if (this.f333Ujhhgtgfeyxiexzf != 1) {
                                            if (iM108Ujhhgtgfeyxiexzf5 > i7 && iM107Ujhhgtgfeyxiexzf5 == iM107Ujhhgtgfeyxiexzf) {
                                                this.f331feyxiexzfUjhhgtg = m108Ujhhgtgfeyxiexzf(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iM108Ujhhgtgfeyxiexzf5 > i7 && (iM107Ujhhgtgfeyxiexzf5 == iM107Ujhhgtgfeyxiexzf || m110Ujhhgtgfeyxiexzf(m107Ujhhgtgfeyxiexzf(iIntValue), iIntValue).contains(Integer.valueOf(iM107Ujhhgtgfeyxiexzf)))) {
                                                this.f331feyxiexzfUjhhgtg = iM108Ujhhgtgfeyxiexzf5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.f333Ujhhgtgfeyxiexzf) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iM108Ujhhgtgfeyxiexzf < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < m2204feyxiexzfUjhhgtg()) {
                                                it2 = m109Ujhhgtgfeyxiexzf(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iM108Ujhhgtgfeyxiexzf) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.f331feyxiexzfUjhhgtg = iIntValue2;
                                                            this.f332feyxiexzfUjhhgtg = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iM108Ujhhgtgfeyxiexzf < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < m2204feyxiexzfUjhhgtg()) {
                                            it4 = m109Ujhhgtgfeyxiexzf(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iM108Ujhhgtgfeyxiexzf) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.f331feyxiexzfUjhhgtg = iIntValue3;
                                                        this.f332feyxiexzfUjhhgtg = m107Ujhhgtgfeyxiexzf(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                mo165Ujhhgtgfeyxiexzf(iIntValue);
                                this.f330feyxiexzfUjhhgtg = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.mo138Ujhhgtgfeyxiexzf(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iMo2134Ujhhgtgfeyxiexzf = this.f3261Ujhhgtgfeyxiexzf.f369Ujhhgtgfeyxiexzf.mo2134Ujhhgtgfeyxiexzf();
                int i11 = 0;
                while (true) {
                    if (i11 >= iMo2134Ujhhgtgfeyxiexzf) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
                    int iM113Ujhhgtgfeyxiexzf = m113Ujhhgtgfeyxiexzf(i11, recyclerView.f359Ujhhgtgfeyxiexzf, recyclerView.f412feyxiexzfUjhhgtg);
                    RecyclerView recyclerView2 = this.f3261Ujhhgtgfeyxiexzf;
                    int iM112Ujhhgtgfeyxiexzf = m112Ujhhgtgfeyxiexzf(i11, recyclerView2.f359Ujhhgtgfeyxiexzf, recyclerView2.f412feyxiexzfUjhhgtg);
                    if (this.f333Ujhhgtgfeyxiexzf != 1) {
                        if (iM113Ujhhgtgfeyxiexzf == i9 && iM112Ujhhgtgfeyxiexzf == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iM113Ujhhgtgfeyxiexzf == i10 && iM112Ujhhgtgfeyxiexzf == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    mo190Ujhhgtgfeyxiexzf(i11, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final int mo139Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        m117Ujhhgtgfeyxiexzf();
        m149feyxiexzfUjhhgtg();
        return super.mo139Ujhhgtgfeyxiexzf(i, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int mo140Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        m117Ujhhgtgfeyxiexzf();
        m149feyxiexzfUjhhgtg();
        return super.mo140Ujhhgtgfeyxiexzf(i, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo141Ujhhgtgfeyxiexzf(Rect rect, int i, int i2) {
        int iM2188Ujhhgtgfeyxiexzf;
        int iM2188Ujhhgtgfeyxiexzf2;
        if (this.f324feyxiexzfUjhhgtg == null) {
            super.mo141Ujhhgtgfeyxiexzf(rect, i, i2);
        }
        int iM2207feyxiexzfUjhhgtg = m2207feyxiexzfUjhhgtg() + m2206feyxiexzfUjhhgtg();
        int iM2205feyxiexzfUjhhgtg = m2205feyxiexzfUjhhgtg() + m2208feyxiexzfUjhhgtg();
        if (this.f333Ujhhgtgfeyxiexzf == 1) {
            int iHeight = rect.height() + iM2205feyxiexzfUjhhgtg;
            RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            iM2188Ujhhgtgfeyxiexzf2 = AbstractC0822feyxiexzfUjhhgtg.m2188Ujhhgtgfeyxiexzf(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f324feyxiexzfUjhhgtg;
            iM2188Ujhhgtgfeyxiexzf = AbstractC0822feyxiexzfUjhhgtg.m2188Ujhhgtgfeyxiexzf(i, iArr[iArr.length - 1] + iM2207feyxiexzfUjhhgtg, this.f3261Ujhhgtgfeyxiexzf.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM2207feyxiexzfUjhhgtg;
            RecyclerView recyclerView2 = this.f3261Ujhhgtgfeyxiexzf;
            Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            iM2188Ujhhgtgfeyxiexzf = AbstractC0822feyxiexzfUjhhgtg.m2188Ujhhgtgfeyxiexzf(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f324feyxiexzfUjhhgtg;
            iM2188Ujhhgtgfeyxiexzf2 = AbstractC0822feyxiexzfUjhhgtg.m2188Ujhhgtgfeyxiexzf(i2, iArr2[iArr2.length - 1] + iM2205feyxiexzfUjhhgtg, this.f3261Ujhhgtgfeyxiexzf.getMinimumHeight());
        }
        this.f3261Ujhhgtgfeyxiexzf.setMeasuredDimension(iM2188Ujhhgtgfeyxiexzf, iM2188Ujhhgtgfeyxiexzf2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean mo142Ujhhgtgfeyxiexzf() {
        return this.f343feyxiexzfUjhhgtg == null && !this.f322feyxiexzfUjhhgtg;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void mo143feyxiexzfUjhhgtg(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf, C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf) {
        int i;
        int iMo1900Ujhhgtgfeyxiexzf = this.f323feyxiexzfUjhhgtg;
        for (int i2 = 0; i2 < this.f323feyxiexzfUjhhgtg && (i = c0087Ujhhgtgfeyxiexzf.f1183Ujhhgtgfeyxiexzf) >= 0 && i < c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() && iMo1900Ujhhgtgfeyxiexzf > 0; i2++) {
            int i3 = c0087Ujhhgtgfeyxiexzf.f1183Ujhhgtgfeyxiexzf;
            c3570Ujhhgtgfeyxiexzf.m5105Ujhhgtgfeyxiexzf(i3, Math.max(0, c0087Ujhhgtgfeyxiexzf.f1186Ujhhgtgfeyxiexzf));
            iMo1900Ujhhgtgfeyxiexzf -= this.f328feyxiexzfUjhhgtg.mo1900Ujhhgtgfeyxiexzf(i3);
            c0087Ujhhgtgfeyxiexzf.f1183Ujhhgtgfeyxiexzf += c0087Ujhhgtgfeyxiexzf.f1184Ujhhgtgfeyxiexzf;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final View mo144Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, boolean z, boolean z2) {
        int i;
        int iM2203Ujhhgtgfeyxiexzf;
        int iM2203Ujhhgtgfeyxiexzf2 = m2203Ujhhgtgfeyxiexzf();
        int i2 = 1;
        if (z2) {
            iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM2203Ujhhgtgfeyxiexzf2;
            iM2203Ujhhgtgfeyxiexzf = 0;
        }
        int iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf();
        m173feyxiexzfUjhhgtg();
        int iMo2983Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
        int iMo2979Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
        View view = null;
        View view2 = null;
        while (iM2203Ujhhgtgfeyxiexzf != i) {
            View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(iM2203Ujhhgtgfeyxiexzf);
            int iM2196feyxiexzfUjhhgtg = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewM2202Ujhhgtgfeyxiexzf);
            if (iM2196feyxiexzfUjhhgtg >= 0 && iM2196feyxiexzfUjhhgtg < iM2158Ujhhgtgfeyxiexzf && m113Ujhhgtgfeyxiexzf(iM2196feyxiexzfUjhhgtg, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg) == 0) {
                if (((C0825feyxiexzfUjhhgtg) viewM2202Ujhhgtgfeyxiexzf.getLayoutParams()).f3279Ujhhgtgfeyxiexzf.m2179Ujhhgtgfeyxiexzf()) {
                    if (view2 == null) {
                        view2 = viewM2202Ujhhgtgfeyxiexzf;
                    }
                } else {
                    if (this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf) < iMo2979Ujhhgtgfeyxiexzf && this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf) >= iMo2983Ujhhgtgfeyxiexzf) {
                        return viewM2202Ujhhgtgfeyxiexzf;
                    }
                    if (view == null) {
                        view = viewM2202Ujhhgtgfeyxiexzf;
                    }
                }
            }
            iM2203Ujhhgtgfeyxiexzf += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void mo145feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf, C0088Ujhhgtgfeyxiexzf c0088Ujhhgtgfeyxiexzf) {
        int i;
        int i2;
        int i3;
        int iMo2976Ujhhgtgfeyxiexzf;
        int iM2206feyxiexzfUjhhgtg;
        int iMo2976Ujhhgtgfeyxiexzf2;
        int iM2189Ujhhgtgfeyxiexzf;
        int iM2189Ujhhgtgfeyxiexzf2;
        ?? r12;
        int i4;
        View viewM1140Ujhhgtgfeyxiexzf;
        int iMo2982Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2982Ujhhgtgfeyxiexzf();
        boolean z = iMo2982Ujhhgtgfeyxiexzf != 1073741824;
        int i5 = m2203Ujhhgtgfeyxiexzf() > 0 ? this.f324feyxiexzfUjhhgtg[this.f323feyxiexzfUjhhgtg] : 0;
        if (z) {
            m117Ujhhgtgfeyxiexzf();
        }
        boolean z2 = c0087Ujhhgtgfeyxiexzf.f1184Ujhhgtgfeyxiexzf == 1;
        int iM113Ujhhgtgfeyxiexzf = this.f323feyxiexzfUjhhgtg;
        if (!z2) {
            iM113Ujhhgtgfeyxiexzf = m113Ujhhgtgfeyxiexzf(c0087Ujhhgtgfeyxiexzf.f1183Ujhhgtgfeyxiexzf, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg) + m114Ujhhgtgfeyxiexzf(c0087Ujhhgtgfeyxiexzf.f1183Ujhhgtgfeyxiexzf, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
        }
        int i6 = 0;
        while (i6 < this.f323feyxiexzfUjhhgtg && (i4 = c0087Ujhhgtgfeyxiexzf.f1183Ujhhgtgfeyxiexzf) >= 0 && i4 < c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() && iM113Ujhhgtgfeyxiexzf > 0) {
            int i7 = c0087Ujhhgtgfeyxiexzf.f1183Ujhhgtgfeyxiexzf;
            int iM114Ujhhgtgfeyxiexzf = m114Ujhhgtgfeyxiexzf(i7, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
            if (iM114Ujhhgtgfeyxiexzf > this.f323feyxiexzfUjhhgtg) {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i7);
                sb.append(" requires ");
                sb.append(iM114Ujhhgtgfeyxiexzf);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2705Ujhhgtgfeyxiexzf(sb, this.f323feyxiexzfUjhhgtg, " spans."));
            }
            iM113Ujhhgtgfeyxiexzf -= iM114Ujhhgtgfeyxiexzf;
            if (iM113Ujhhgtgfeyxiexzf < 0 || (viewM1140Ujhhgtgfeyxiexzf = c0087Ujhhgtgfeyxiexzf.m1140Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg)) == null) {
                break;
            }
            this.f325feyxiexzfUjhhgtg[i6] = viewM1140Ujhhgtgfeyxiexzf;
            i6++;
        }
        if (i6 == 0) {
            c0088Ujhhgtgfeyxiexzf.f1193Ujhhgtgfeyxiexzf = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.f325feyxiexzfUjhhgtg[i];
            C0623Ujhhgtgfeyxiexzf c0623Ujhhgtgfeyxiexzf = (C0623Ujhhgtgfeyxiexzf) view.getLayoutParams();
            int iM114Ujhhgtgfeyxiexzf2 = m114Ujhhgtgfeyxiexzf(AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(view), c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
            c0623Ujhhgtgfeyxiexzf.f2652Ujhhgtgfeyxiexzf = iM114Ujhhgtgfeyxiexzf2;
            c0623Ujhhgtgfeyxiexzf.f2651Ujhhgtgfeyxiexzf = i8;
            i8 += iM114Ujhhgtgfeyxiexzf2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f325feyxiexzfUjhhgtg[i10];
            if (c0087Ujhhgtgfeyxiexzf.f1190Ujhhgtgfeyxiexzf != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    m2200Ujhhgtgfeyxiexzf(view2, -1, true);
                } else {
                    m2200Ujhhgtgfeyxiexzf(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                m2200Ujhhgtgfeyxiexzf(view2, -1, false);
            } else {
                r12 = 0;
                m2200Ujhhgtgfeyxiexzf(view2, 0, false);
            }
            RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
            Rect rect = this.f329feyxiexzfUjhhgtg;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.m233feyxiexzfUjhhgtg(view2));
            }
            m115Ujhhgtgfeyxiexzf(view2, iMo2982Ujhhgtgfeyxiexzf, r12);
            int iMo2975Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view2);
            if (iMo2975Ujhhgtgfeyxiexzf > i9) {
                i9 = iMo2975Ujhhgtgfeyxiexzf;
            }
            float fMo2976Ujhhgtgfeyxiexzf = (this.f335Ujhhgtgfeyxiexzf.mo2976Ujhhgtgfeyxiexzf(view2) * 1.0f) / ((C0623Ujhhgtgfeyxiexzf) view2.getLayoutParams()).f2652Ujhhgtgfeyxiexzf;
            if (fMo2976Ujhhgtgfeyxiexzf > f) {
                f = fMo2976Ujhhgtgfeyxiexzf;
            }
        }
        if (z) {
            m148Ujhhgtgfeyxiexzf(Math.max(Math.round(f * this.f323feyxiexzfUjhhgtg), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f325feyxiexzfUjhhgtg[i11];
                m115Ujhhgtgfeyxiexzf(view3, 1073741824, true);
                int iMo2975Ujhhgtgfeyxiexzf2 = this.f335Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view3);
                if (iMo2975Ujhhgtgfeyxiexzf2 > i9) {
                    i9 = iMo2975Ujhhgtgfeyxiexzf2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f325feyxiexzfUjhhgtg[i12];
            if (this.f335Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view4) != i9) {
                C0623Ujhhgtgfeyxiexzf c0623Ujhhgtgfeyxiexzf2 = (C0623Ujhhgtgfeyxiexzf) view4.getLayoutParams();
                Rect rect2 = c0623Ujhhgtgfeyxiexzf2.f3280Ujhhgtgfeyxiexzf;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf2).topMargin + ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf2).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf2).leftMargin + ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf2).rightMargin;
                int iM111Ujhhgtgfeyxiexzf = m111Ujhhgtgfeyxiexzf(c0623Ujhhgtgfeyxiexzf2.f2651Ujhhgtgfeyxiexzf, c0623Ujhhgtgfeyxiexzf2.f2652Ujhhgtgfeyxiexzf);
                if (this.f333Ujhhgtgfeyxiexzf == 1) {
                    iM2189Ujhhgtgfeyxiexzf2 = AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(iM111Ujhhgtgfeyxiexzf, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf2).width, false);
                    iM2189Ujhhgtgfeyxiexzf = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iM2189Ujhhgtgfeyxiexzf = AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(iM111Ujhhgtgfeyxiexzf, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c0623Ujhhgtgfeyxiexzf2).height, false);
                    iM2189Ujhhgtgfeyxiexzf2 = iMakeMeasureSpec;
                }
                if (m2222feyxiexzfUjhhgtg(view4, iM2189Ujhhgtgfeyxiexzf2, iM2189Ujhhgtgfeyxiexzf, (C0825feyxiexzfUjhhgtg) view4.getLayoutParams())) {
                    view4.measure(iM2189Ujhhgtgfeyxiexzf2, iM2189Ujhhgtgfeyxiexzf);
                }
            }
        }
        int iM2208feyxiexzfUjhhgtg = 0;
        c0088Ujhhgtgfeyxiexzf.f1192Ujhhgtgfeyxiexzf = i9;
        if (this.f333Ujhhgtgfeyxiexzf != 1) {
            if (c0087Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf == -1) {
                int i15 = c0087Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf;
                iM2206feyxiexzfUjhhgtg = i15 - i9;
                iMo2976Ujhhgtgfeyxiexzf = i15;
            } else {
                int i16 = c0087Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf;
                iMo2976Ujhhgtgfeyxiexzf = i16 + i9;
                iM2206feyxiexzfUjhhgtg = i16;
            }
            iMo2976Ujhhgtgfeyxiexzf2 = iM2208feyxiexzfUjhhgtg;
        } else if (c0087Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf == -1) {
            iMo2976Ujhhgtgfeyxiexzf2 = c0087Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf;
            iM2208feyxiexzfUjhhgtg = iMo2976Ujhhgtgfeyxiexzf2 - i9;
            iM2206feyxiexzfUjhhgtg = 0;
            iMo2976Ujhhgtgfeyxiexzf = 0;
        } else {
            int i17 = c0087Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf;
            iMo2976Ujhhgtgfeyxiexzf = 0;
            iM2208feyxiexzfUjhhgtg = i17;
            iMo2976Ujhhgtgfeyxiexzf2 = i17 + i9;
            iM2206feyxiexzfUjhhgtg = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.f325feyxiexzfUjhhgtg[i18];
            C0623Ujhhgtgfeyxiexzf c0623Ujhhgtgfeyxiexzf3 = (C0623Ujhhgtgfeyxiexzf) view5.getLayoutParams();
            if (this.f333Ujhhgtgfeyxiexzf != 1) {
                iM2208feyxiexzfUjhhgtg = m2208feyxiexzfUjhhgtg() + this.f324feyxiexzfUjhhgtg[c0623Ujhhgtgfeyxiexzf3.f2651Ujhhgtgfeyxiexzf];
                iMo2976Ujhhgtgfeyxiexzf2 = this.f335Ujhhgtgfeyxiexzf.mo2976Ujhhgtgfeyxiexzf(view5) + iM2208feyxiexzfUjhhgtg;
            } else if (m185feyxiexzfUjhhgtg()) {
                int iM2206feyxiexzfUjhhgtg2 = m2206feyxiexzfUjhhgtg() + this.f324feyxiexzfUjhhgtg[this.f323feyxiexzfUjhhgtg - c0623Ujhhgtgfeyxiexzf3.f2651Ujhhgtgfeyxiexzf];
                iMo2976Ujhhgtgfeyxiexzf = iM2206feyxiexzfUjhhgtg2;
                iM2206feyxiexzfUjhhgtg = iM2206feyxiexzfUjhhgtg2 - this.f335Ujhhgtgfeyxiexzf.mo2976Ujhhgtgfeyxiexzf(view5);
            } else {
                iM2206feyxiexzfUjhhgtg = m2206feyxiexzfUjhhgtg() + this.f324feyxiexzfUjhhgtg[c0623Ujhhgtgfeyxiexzf3.f2651Ujhhgtgfeyxiexzf];
                iMo2976Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2976Ujhhgtgfeyxiexzf(view5) + iM2206feyxiexzfUjhhgtg;
            }
            AbstractC0822feyxiexzfUjhhgtg.m2199feyxiexzfUjhhgtg(view5, iM2206feyxiexzfUjhhgtg, iM2208feyxiexzfUjhhgtg, iMo2976Ujhhgtgfeyxiexzf, iMo2976Ujhhgtgfeyxiexzf2);
            if (c0623Ujhhgtgfeyxiexzf3.f3279Ujhhgtgfeyxiexzf.m2179Ujhhgtgfeyxiexzf() || c0623Ujhhgtgfeyxiexzf3.f3279Ujhhgtgfeyxiexzf.m2182Ujhhgtgfeyxiexzf()) {
                c0088Ujhhgtgfeyxiexzf.f1194Ujhhgtgfeyxiexzf = true;
            }
            c0088Ujhhgtgfeyxiexzf.f1195Ujhhgtgfeyxiexzf = view5.hasFocusable() | c0088Ujhhgtgfeyxiexzf.f1195Ujhhgtgfeyxiexzf;
        }
        Arrays.fill(this.f325feyxiexzfUjhhgtg, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void mo146feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C0085Ujhhgtgfeyxiexzf c0085Ujhhgtgfeyxiexzf, int i) {
        m117Ujhhgtgfeyxiexzf();
        if (c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() > 0 && !c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
            boolean z = i == 1;
            int iM113Ujhhgtgfeyxiexzf = m113Ujhhgtgfeyxiexzf(c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
            if (z) {
                while (iM113Ujhhgtgfeyxiexzf > 0) {
                    int i2 = c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf = i3;
                    iM113Ujhhgtgfeyxiexzf = m113Ujhhgtgfeyxiexzf(i3, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
                }
            } else {
                int iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() - 1;
                int i4 = c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf;
                while (i4 < iM2158Ujhhgtgfeyxiexzf) {
                    int i5 = i4 + 1;
                    int iM113Ujhhgtgfeyxiexzf2 = m113Ujhhgtgfeyxiexzf(i5, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
                    if (iM113Ujhhgtgfeyxiexzf2 <= iM113Ujhhgtgfeyxiexzf) {
                        break;
                    }
                    i4 = i5;
                    iM113Ujhhgtgfeyxiexzf = iM113Ujhhgtgfeyxiexzf2;
                }
                c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf = i4;
            }
        }
        m149feyxiexzfUjhhgtg();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void mo147Ujhhgtgfeyxiexzf(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo147Ujhhgtgfeyxiexzf(false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛳᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m148Ujhhgtgfeyxiexzf(int i) {
        int i2;
        int[] iArr = this.f324feyxiexzfUjhhgtg;
        int i3 = this.f323feyxiexzfUjhhgtg;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f324feyxiexzfUjhhgtg = iArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛳᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m149feyxiexzfUjhhgtg() {
        View[] viewArr = this.f325feyxiexzfUjhhgtg;
        if (viewArr == null || viewArr.length != this.f323feyxiexzfUjhhgtg) {
            this.f325feyxiexzfUjhhgtg = new View[this.f323feyxiexzfUjhhgtg];
        }
    }

    public GridLayoutManager() {
        super(1);
        this.f322feyxiexzfUjhhgtg = false;
        this.f323feyxiexzfUjhhgtg = -1;
        this.f326feyxiexzfUjhhgtg = new SparseIntArray();
        this.f327feyxiexzfUjhhgtg = new SparseIntArray();
        this.f328feyxiexzfUjhhgtg = new C0622Ujhhgtgfeyxiexzf();
        this.f329feyxiexzfUjhhgtg = new Rect();
        this.f330feyxiexzfUjhhgtg = -1;
        this.f331feyxiexzfUjhhgtg = -1;
        this.f332feyxiexzfUjhhgtg = -1;
        m116Ujhhgtgfeyxiexzf(2);
    }
}
