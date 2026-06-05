package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.umeng.analytics.pro.r;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC0795feyxiexzfUjhhgtg;
import p000.AbstractC0821feyxiexzfUjhhgtg;
import p000.AbstractC0822feyxiexzfUjhhgtg;
import p000.AbstractC2855feyxiexzfUjhhgtg;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3387feyxiexzfUjhhgtg;
import p000.C0069Ujhhgtgfeyxiexzf;
import p000.C0070Ujhhgtgfeyxiexzf;
import p000.C0085Ujhhgtgfeyxiexzf;
import p000.C0087Ujhhgtgfeyxiexzf;
import p000.C0088Ujhhgtgfeyxiexzf;
import p000.C0810feyxiexzfUjhhgtg;
import p000.C0823feyxiexzfUjhhgtg;
import p000.C0825feyxiexzfUjhhgtg;
import p000.C0831feyxiexzfUjhhgtg;
import p000.C2956feyxiexzfUjhhgtg;
import p000.C2963feyxiexzfUjhhgtg;
import p000.C3570Ujhhgtgfeyxiexzf;
import p000.InterfaceC0814feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0822feyxiexzfUjhhgtg implements InterfaceC0814feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f333Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public C0087Ujhhgtgfeyxiexzf f334Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public AbstractC3387feyxiexzfUjhhgtg f335Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public boolean f336Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final boolean f337Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f338Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f339Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final boolean f340Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f341Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f342feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public C0070Ujhhgtgfeyxiexzf f343feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0085Ujhhgtgfeyxiexzf f344feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0088Ujhhgtgfeyxiexzf f345feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f346feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int[] f347feyxiexzfUjhhgtg;

    public LinearLayoutManager(int i) {
        this.f333Ujhhgtgfeyxiexzf = 1;
        this.f337Ujhhgtgfeyxiexzf = false;
        this.f338Ujhhgtgfeyxiexzf = false;
        this.f339Ujhhgtgfeyxiexzf = false;
        this.f340Ujhhgtgfeyxiexzf = true;
        this.f341Ujhhgtgfeyxiexzf = -1;
        this.f342feyxiexzfUjhhgtg = Integer.MIN_VALUE;
        this.f343feyxiexzfUjhhgtg = null;
        this.f344feyxiexzfUjhhgtg = new C0085Ujhhgtgfeyxiexzf();
        this.f345feyxiexzfUjhhgtg = new C0088Ujhhgtgfeyxiexzf();
        this.f346feyxiexzfUjhhgtg = 2;
        this.f347feyxiexzfUjhhgtg = new int[2];
        m191feyxiexzfUjhhgtg(i);
        mo151Ujhhgtgfeyxiexzf(null);
        if (this.f337Ujhhgtgfeyxiexzf) {
            this.f337Ujhhgtgfeyxiexzf = false;
            m2216feyxiexzfUjhhgtg();
        }
    }

    @Override // p000.InterfaceC0814feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final PointF mo150Ujhhgtgfeyxiexzf(int i) {
        if (m2203Ujhhgtgfeyxiexzf() == 0) {
            return null;
        }
        int i2 = (i < AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(0))) != this.f338Ujhhgtgfeyxiexzf ? -1 : 1;
        return this.f333Ujhhgtgfeyxiexzf == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void mo151Ujhhgtgfeyxiexzf(String str) {
        if (this.f343feyxiexzfUjhhgtg == null) {
            super.mo151Ujhhgtgfeyxiexzf(str);
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean mo152Ujhhgtgfeyxiexzf() {
        return this.f333Ujhhgtgfeyxiexzf == 0;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean mo153Ujhhgtgfeyxiexzf() {
        return this.f333Ujhhgtgfeyxiexzf == 1;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void mo154Ujhhgtgfeyxiexzf(int i, int i2, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf) {
        if (this.f333Ujhhgtgfeyxiexzf != 0) {
            i = i2;
        }
        if (m2203Ujhhgtgfeyxiexzf() == 0 || i == 0) {
            return;
        }
        m173feyxiexzfUjhhgtg();
        m192Ujhhgtgfeyxiexzf(i > 0 ? 1 : -1, Math.abs(i), true, c0810feyxiexzfUjhhgtg);
        mo143feyxiexzfUjhhgtg(c0810feyxiexzfUjhhgtg, this.f334Ujhhgtgfeyxiexzf, c3570Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void mo155Ujhhgtgfeyxiexzf(int i, C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf) {
        boolean z;
        int i2;
        C0070Ujhhgtgfeyxiexzf c0070Ujhhgtgfeyxiexzf = this.f343feyxiexzfUjhhgtg;
        if (c0070Ujhhgtgfeyxiexzf == null || (i2 = c0070Ujhhgtgfeyxiexzf.f1104Ujhhgtgfeyxiexzf) < 0) {
            m188feyxiexzfUjhhgtg();
            z = this.f338Ujhhgtgfeyxiexzf;
            i2 = this.f341Ujhhgtgfeyxiexzf;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c0070Ujhhgtgfeyxiexzf.f1106Ujhhgtgfeyxiexzf;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f346feyxiexzfUjhhgtg && i2 >= 0 && i2 < i; i4++) {
            c3570Ujhhgtgfeyxiexzf.m5105Ujhhgtgfeyxiexzf(i2, 0);
            i2 += i3;
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int mo156Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m169Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public int mo119Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m170feyxiexzfUjhhgtg(c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public int mo120Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m171Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final int mo157Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m169Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public int mo121Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m170feyxiexzfUjhhgtg(c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public int mo122Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m171Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final View mo158Ujhhgtgfeyxiexzf(int i) {
        int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf();
        if (iM2203Ujhhgtgfeyxiexzf == 0) {
            return null;
        }
        int iM2196feyxiexzfUjhhgtg = i - AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(0));
        if (iM2196feyxiexzfUjhhgtg >= 0 && iM2196feyxiexzfUjhhgtg < iM2203Ujhhgtgfeyxiexzf) {
            View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(iM2196feyxiexzfUjhhgtg);
            if (AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewM2202Ujhhgtgfeyxiexzf) == i) {
                return viewM2202Ujhhgtgfeyxiexzf;
            }
        }
        return super.mo158Ujhhgtgfeyxiexzf(i);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public C0825feyxiexzfUjhhgtg mo123Ujhhgtgfeyxiexzf() {
        return new C0825feyxiexzfUjhhgtg(-2, -2);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final boolean mo159feyxiexzfUjhhgtg() {
        return true;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final boolean mo160feyxiexzfUjhhgtg() {
        return this.f337Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ */
    public View mo128Ujhhgtgfeyxiexzf(View view, int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        int iM172Ujhhgtgfeyxiexzf;
        View viewM179Ujhhgtgfeyxiexzf;
        m188feyxiexzfUjhhgtg();
        if (m2203Ujhhgtgfeyxiexzf() != 0 && (iM172Ujhhgtgfeyxiexzf = m172Ujhhgtgfeyxiexzf(i)) != Integer.MIN_VALUE) {
            m173feyxiexzfUjhhgtg();
            m192Ujhhgtgfeyxiexzf(iM172Ujhhgtgfeyxiexzf, (int) (this.f335Ujhhgtgfeyxiexzf.mo2984Ujhhgtgfeyxiexzf() * 0.33333334f), false, c0810feyxiexzfUjhhgtg);
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf = this.f334Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf.f1186Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
            c0087Ujhhgtgfeyxiexzf.f1180Ujhhgtgfeyxiexzf = false;
            m174feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0087Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg, true);
            if (iM172Ujhhgtgfeyxiexzf == -1) {
                viewM179Ujhhgtgfeyxiexzf = this.f338Ujhhgtgfeyxiexzf ? m179Ujhhgtgfeyxiexzf(m2203Ujhhgtgfeyxiexzf() - 1, -1) : m179Ujhhgtgfeyxiexzf(0, m2203Ujhhgtgfeyxiexzf());
            } else {
                viewM179Ujhhgtgfeyxiexzf = this.f338Ujhhgtgfeyxiexzf ? m179Ujhhgtgfeyxiexzf(0, m2203Ujhhgtgfeyxiexzf()) : m179Ujhhgtgfeyxiexzf(m2203Ujhhgtgfeyxiexzf() - 1, -1);
            }
            View viewM184feyxiexzfUjhhgtg = iM172Ujhhgtgfeyxiexzf == -1 ? m184feyxiexzfUjhhgtg() : m183feyxiexzfUjhhgtg();
            if (!viewM184feyxiexzfUjhhgtg.hasFocusable()) {
                return viewM179Ujhhgtgfeyxiexzf;
            }
            if (viewM179Ujhhgtgfeyxiexzf != null) {
                return viewM184feyxiexzfUjhhgtg;
            }
        }
        return null;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void mo162Ujhhgtgfeyxiexzf(AccessibilityEvent accessibilityEvent) {
        super.mo162Ujhhgtgfeyxiexzf(accessibilityEvent);
        if (m2203Ujhhgtgfeyxiexzf() > 0) {
            accessibilityEvent.setFromIndex(mo177Ujhhgtgfeyxiexzf());
            accessibilityEvent.setToIndex(mo178Ujhhgtgfeyxiexzf());
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ */
    public void mo129Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        super.mo129Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, c2963feyxiexzfUjhhgtg);
        AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg = this.f3261Ujhhgtgfeyxiexzf.f369Ujhhgtgfeyxiexzf;
        if (abstractC0795feyxiexzfUjhhgtg == null || abstractC0795feyxiexzfUjhhgtg.mo2134Ujhhgtgfeyxiexzf() <= 0) {
            return;
        }
        c2963feyxiexzfUjhhgtg.m4433Ujhhgtgfeyxiexzf(C2956feyxiexzfUjhhgtg.f9260Ujhhgtgfeyxiexzf);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0217  */
    /* JADX WARN: Code duplicated, block: B:126:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x021e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x0223  */
    /* JADX WARN: Code duplicated, block: B:133:0x0227  */
    /* JADX WARN: Code duplicated, block: B:135:0x022b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0232  */
    /* JADX WARN: Code duplicated, block: B:138:0x0238  */
    /* JADX WARN: Code duplicated, block: B:95:0x0194  */
    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ */
    public void mo136feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        View focusedChild;
        int iM2158Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewMo144Ujhhgtgfeyxiexzf;
        int iMo2977Ujhhgtgfeyxiexzf;
        int iMo2974Ujhhgtgfeyxiexzf;
        int iMo2983Ujhhgtgfeyxiexzf;
        int iMo2979Ujhhgtgfeyxiexzf;
        boolean z3;
        boolean z4;
        C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg;
        int i;
        int iMo2977Ujhhgtgfeyxiexzf2;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int iM181Ujhhgtgfeyxiexzf;
        int i6;
        View viewMo158Ujhhgtgfeyxiexzf;
        int iMo2977Ujhhgtgfeyxiexzf3;
        int iMo2979Ujhhgtgfeyxiexzf2;
        int i7;
        int i8 = -1;
        if (!(this.f343feyxiexzfUjhhgtg == null && this.f341Ujhhgtgfeyxiexzf == -1) && c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() == 0) {
            m2211feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg);
            return;
        }
        C0070Ujhhgtgfeyxiexzf c0070Ujhhgtgfeyxiexzf = this.f343feyxiexzfUjhhgtg;
        if (c0070Ujhhgtgfeyxiexzf != null && (i7 = c0070Ujhhgtgfeyxiexzf.f1104Ujhhgtgfeyxiexzf) >= 0) {
            this.f341Ujhhgtgfeyxiexzf = i7;
        }
        m173feyxiexzfUjhhgtg();
        this.f334Ujhhgtgfeyxiexzf.f1180Ujhhgtgfeyxiexzf = false;
        m188feyxiexzfUjhhgtg();
        RecyclerView recyclerView2 = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f3260Ujhhgtgfeyxiexzf.f8836Ujhhgtgfeyxiexzf).contains(focusedChild)) {
            focusedChild = null;
        }
        C0085Ujhhgtgfeyxiexzf c0085Ujhhgtgfeyxiexzf = this.f344feyxiexzfUjhhgtg;
        if (!c0085Ujhhgtgfeyxiexzf.f1164Ujhhgtgfeyxiexzf || this.f341Ujhhgtgfeyxiexzf != -1 || this.f343feyxiexzfUjhhgtg != null) {
            c0085Ujhhgtgfeyxiexzf.m1135Ujhhgtgfeyxiexzf();
            c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf = this.f338Ujhhgtgfeyxiexzf ^ this.f339Ujhhgtgfeyxiexzf;
            if (c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf || (i = this.f341Ujhhgtgfeyxiexzf) == -1) {
                if (m2203Ujhhgtgfeyxiexzf() != 0) {
                    recyclerView = this.f3261Ujhhgtgfeyxiexzf;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f3260Ujhhgtgfeyxiexzf.f8836Ujhhgtgfeyxiexzf).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) focusedChild2.getLayoutParams();
                        if (!c0825feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2179Ujhhgtgfeyxiexzf() || c0825feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2173Ujhhgtgfeyxiexzf() < 0 || c0825feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2173Ujhhgtgfeyxiexzf() >= c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf()) {
                            z = this.f336Ujhhgtgfeyxiexzf;
                            z2 = this.f339Ujhhgtgfeyxiexzf;
                            if (z == z2 || (viewMo144Ujhhgtgfeyxiexzf = mo144Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf, z2)) == null) {
                                c0085Ujhhgtgfeyxiexzf.m1132Ujhhgtgfeyxiexzf();
                                if (this.f339Ujhhgtgfeyxiexzf) {
                                    iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() - 1;
                                } else {
                                    iM2158Ujhhgtgfeyxiexzf = 0;
                                }
                                c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf = iM2158Ujhhgtgfeyxiexzf;
                            } else {
                                c0085Ujhhgtgfeyxiexzf.m1133Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf, AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewMo144Ujhhgtgfeyxiexzf));
                                if (!c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf && mo142Ujhhgtgfeyxiexzf()) {
                                    iMo2977Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf);
                                    iMo2974Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf);
                                    iMo2983Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                                    iMo2979Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
                                    if (iMo2974Ujhhgtgfeyxiexzf <= iMo2983Ujhhgtgfeyxiexzf || iMo2977Ujhhgtgfeyxiexzf >= iMo2983Ujhhgtgfeyxiexzf) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (iMo2977Ujhhgtgfeyxiexzf >= iMo2979Ujhhgtgfeyxiexzf || iMo2974Ujhhgtgfeyxiexzf <= iMo2979Ujhhgtgfeyxiexzf) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z3 || z4) {
                                        if (c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf) {
                                            iMo2983Ujhhgtgfeyxiexzf = iMo2979Ujhhgtgfeyxiexzf;
                                        }
                                        c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf;
                                    }
                                }
                            }
                        } else {
                            c0085Ujhhgtgfeyxiexzf.m1134Ujhhgtgfeyxiexzf(focusedChild2, AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(focusedChild2));
                        }
                    } else {
                        z = this.f336Ujhhgtgfeyxiexzf;
                        z2 = this.f339Ujhhgtgfeyxiexzf;
                        if (z == z2) {
                            c0085Ujhhgtgfeyxiexzf.m1132Ujhhgtgfeyxiexzf();
                            if (this.f339Ujhhgtgfeyxiexzf) {
                                iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() - 1;
                            } else {
                                iM2158Ujhhgtgfeyxiexzf = 0;
                            }
                            c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf = iM2158Ujhhgtgfeyxiexzf;
                        } else {
                            c0085Ujhhgtgfeyxiexzf.m1133Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf, AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewMo144Ujhhgtgfeyxiexzf));
                            if (!c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
                                iMo2977Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf);
                                iMo2974Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf);
                                iMo2983Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                                iMo2979Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
                                if (iMo2974Ujhhgtgfeyxiexzf <= iMo2983Ujhhgtgfeyxiexzf) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iMo2977Ujhhgtgfeyxiexzf >= iMo2979Ujhhgtgfeyxiexzf) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf) {
                                        iMo2983Ujhhgtgfeyxiexzf = iMo2979Ujhhgtgfeyxiexzf;
                                    }
                                    c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf;
                                } else {
                                    if (c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf) {
                                        iMo2983Ujhhgtgfeyxiexzf = iMo2979Ujhhgtgfeyxiexzf;
                                    }
                                    c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf;
                                }
                            }
                        }
                    }
                } else {
                    c0085Ujhhgtgfeyxiexzf.m1132Ujhhgtgfeyxiexzf();
                    if (this.f339Ujhhgtgfeyxiexzf) {
                        iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() - 1;
                    } else {
                        iM2158Ujhhgtgfeyxiexzf = 0;
                    }
                    c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf = iM2158Ujhhgtgfeyxiexzf;
                }
            } else if (i < 0 || i >= c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf()) {
                this.f341Ujhhgtgfeyxiexzf = -1;
                this.f342feyxiexzfUjhhgtg = Integer.MIN_VALUE;
                if (m2203Ujhhgtgfeyxiexzf() != 0) {
                    recyclerView = this.f3261Ujhhgtgfeyxiexzf;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) focusedChild2.getLayoutParams();
                        if (c0825feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2179Ujhhgtgfeyxiexzf()) {
                            z = this.f336Ujhhgtgfeyxiexzf;
                            z2 = this.f339Ujhhgtgfeyxiexzf;
                            if (z == z2) {
                                c0085Ujhhgtgfeyxiexzf.m1132Ujhhgtgfeyxiexzf();
                                if (this.f339Ujhhgtgfeyxiexzf) {
                                    iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() - 1;
                                } else {
                                    iM2158Ujhhgtgfeyxiexzf = 0;
                                }
                                c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf = iM2158Ujhhgtgfeyxiexzf;
                            } else {
                                c0085Ujhhgtgfeyxiexzf.m1133Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf, AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewMo144Ujhhgtgfeyxiexzf));
                                if (!c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
                                    iMo2977Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf);
                                    iMo2974Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf);
                                    iMo2983Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                                    iMo2979Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
                                    if (iMo2974Ujhhgtgfeyxiexzf <= iMo2983Ujhhgtgfeyxiexzf) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (iMo2977Ujhhgtgfeyxiexzf >= iMo2979Ujhhgtgfeyxiexzf) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z3) {
                                        if (c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf) {
                                            iMo2983Ujhhgtgfeyxiexzf = iMo2979Ujhhgtgfeyxiexzf;
                                        }
                                        c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf;
                                    } else {
                                        if (c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf) {
                                            iMo2983Ujhhgtgfeyxiexzf = iMo2979Ujhhgtgfeyxiexzf;
                                        }
                                        c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf;
                                    }
                                }
                            }
                        } else {
                            z = this.f336Ujhhgtgfeyxiexzf;
                            z2 = this.f339Ujhhgtgfeyxiexzf;
                            if (z == z2) {
                                c0085Ujhhgtgfeyxiexzf.m1132Ujhhgtgfeyxiexzf();
                                if (this.f339Ujhhgtgfeyxiexzf) {
                                    iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() - 1;
                                } else {
                                    iM2158Ujhhgtgfeyxiexzf = 0;
                                }
                                c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf = iM2158Ujhhgtgfeyxiexzf;
                            } else {
                                c0085Ujhhgtgfeyxiexzf.m1133Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf, AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewMo144Ujhhgtgfeyxiexzf));
                                if (!c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
                                    iMo2977Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf);
                                    iMo2974Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf);
                                    iMo2983Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                                    iMo2979Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
                                    if (iMo2974Ujhhgtgfeyxiexzf <= iMo2983Ujhhgtgfeyxiexzf) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (iMo2977Ujhhgtgfeyxiexzf >= iMo2979Ujhhgtgfeyxiexzf) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z3) {
                                        if (c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf) {
                                            iMo2983Ujhhgtgfeyxiexzf = iMo2979Ujhhgtgfeyxiexzf;
                                        }
                                        c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf;
                                    } else {
                                        if (c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf) {
                                            iMo2983Ujhhgtgfeyxiexzf = iMo2979Ujhhgtgfeyxiexzf;
                                        }
                                        c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.f336Ujhhgtgfeyxiexzf;
                        z2 = this.f339Ujhhgtgfeyxiexzf;
                        if (z == z2) {
                            c0085Ujhhgtgfeyxiexzf.m1132Ujhhgtgfeyxiexzf();
                            if (this.f339Ujhhgtgfeyxiexzf) {
                                iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() - 1;
                            } else {
                                iM2158Ujhhgtgfeyxiexzf = 0;
                            }
                            c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf = iM2158Ujhhgtgfeyxiexzf;
                        } else {
                            c0085Ujhhgtgfeyxiexzf.m1133Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf, AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewMo144Ujhhgtgfeyxiexzf));
                            if (!c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
                                iMo2977Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf);
                                iMo2974Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewMo144Ujhhgtgfeyxiexzf);
                                iMo2983Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                                iMo2979Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
                                if (iMo2974Ujhhgtgfeyxiexzf <= iMo2983Ujhhgtgfeyxiexzf) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iMo2977Ujhhgtgfeyxiexzf >= iMo2979Ujhhgtgfeyxiexzf) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf) {
                                        iMo2983Ujhhgtgfeyxiexzf = iMo2979Ujhhgtgfeyxiexzf;
                                    }
                                    c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf;
                                } else {
                                    if (c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf) {
                                        iMo2983Ujhhgtgfeyxiexzf = iMo2979Ujhhgtgfeyxiexzf;
                                    }
                                    c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf;
                                }
                            }
                        }
                    }
                } else {
                    c0085Ujhhgtgfeyxiexzf.m1132Ujhhgtgfeyxiexzf();
                    if (this.f339Ujhhgtgfeyxiexzf) {
                        iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() - 1;
                    } else {
                        iM2158Ujhhgtgfeyxiexzf = 0;
                    }
                    c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf = iM2158Ujhhgtgfeyxiexzf;
                }
            } else {
                int i9 = this.f341Ujhhgtgfeyxiexzf;
                c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf = i9;
                C0070Ujhhgtgfeyxiexzf c0070Ujhhgtgfeyxiexzf2 = this.f343feyxiexzfUjhhgtg;
                if (c0070Ujhhgtgfeyxiexzf2 != null && c0070Ujhhgtgfeyxiexzf2.f1104Ujhhgtgfeyxiexzf >= 0) {
                    boolean z5 = c0070Ujhhgtgfeyxiexzf2.f1106Ujhhgtgfeyxiexzf;
                    c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf = z5;
                    if (z5) {
                        c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - this.f343feyxiexzfUjhhgtg.f1105Ujhhgtgfeyxiexzf;
                    } else {
                        c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf() + this.f343feyxiexzfUjhhgtg.f1105Ujhhgtgfeyxiexzf;
                    }
                } else if (this.f342feyxiexzfUjhhgtg == Integer.MIN_VALUE) {
                    View viewMo158Ujhhgtgfeyxiexzf2 = mo158Ujhhgtgfeyxiexzf(i9);
                    if (viewMo158Ujhhgtgfeyxiexzf2 == null) {
                        if (m2203Ujhhgtgfeyxiexzf() > 0) {
                            c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf = (this.f341Ujhhgtgfeyxiexzf < AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(0))) == this.f338Ujhhgtgfeyxiexzf;
                        }
                        c0085Ujhhgtgfeyxiexzf.m1132Ujhhgtgfeyxiexzf();
                    } else if (this.f335Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(viewMo158Ujhhgtgfeyxiexzf2) > this.f335Ujhhgtgfeyxiexzf.mo2984Ujhhgtgfeyxiexzf()) {
                        c0085Ujhhgtgfeyxiexzf.m1132Ujhhgtgfeyxiexzf();
                    } else if (this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewMo158Ujhhgtgfeyxiexzf2) - this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf() < 0) {
                        c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                        c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf = false;
                    } else if (this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewMo158Ujhhgtgfeyxiexzf2) < 0) {
                        c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
                        c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf = true;
                    } else {
                        if (c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf) {
                            int iMo2974Ujhhgtgfeyxiexzf2 = this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewMo158Ujhhgtgfeyxiexzf2);
                            AbstractC3387feyxiexzfUjhhgtg abstractC3387feyxiexzfUjhhgtg = this.f335Ujhhgtgfeyxiexzf;
                            iMo2977Ujhhgtgfeyxiexzf2 = (Integer.MIN_VALUE == abstractC3387feyxiexzfUjhhgtg.f10586Ujhhgtgfeyxiexzf ? 0 : abstractC3387feyxiexzfUjhhgtg.mo2984Ujhhgtgfeyxiexzf() - abstractC3387feyxiexzfUjhhgtg.f10586Ujhhgtgfeyxiexzf) + iMo2974Ujhhgtgfeyxiexzf2;
                        } else {
                            iMo2977Ujhhgtgfeyxiexzf2 = this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewMo158Ujhhgtgfeyxiexzf2);
                        }
                        c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = iMo2977Ujhhgtgfeyxiexzf2;
                    }
                } else {
                    boolean z6 = this.f338Ujhhgtgfeyxiexzf;
                    c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf = z6;
                    if (z6) {
                        c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - this.f342feyxiexzfUjhhgtg;
                    } else {
                        c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf() + this.f342feyxiexzfUjhhgtg;
                    }
                }
            }
            c0085Ujhhgtgfeyxiexzf.f1164Ujhhgtgfeyxiexzf = true;
        } else if (focusedChild != null && (this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(focusedChild) >= this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() || this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(focusedChild) <= this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf())) {
            c0085Ujhhgtgfeyxiexzf.m1134Ujhhgtgfeyxiexzf(focusedChild, AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(focusedChild));
        }
        C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf = this.f334Ujhhgtgfeyxiexzf;
        c0087Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf = c0087Ujhhgtgfeyxiexzf.f1189Ujhhgtgfeyxiexzf >= 0 ? 1 : -1;
        int[] iArr = this.f347feyxiexzfUjhhgtg;
        iArr[0] = 0;
        iArr[1] = 0;
        m168feyxiexzfUjhhgtg(c0810feyxiexzfUjhhgtg, iArr);
        int iMo2983Ujhhgtgfeyxiexzf2 = this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf() + Math.max(0, iArr[0]);
        int iMo2980Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2980Ujhhgtgfeyxiexzf() + Math.max(0, iArr[1]);
        if (c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf && (i6 = this.f341Ujhhgtgfeyxiexzf) != -1 && this.f342feyxiexzfUjhhgtg != Integer.MIN_VALUE && (viewMo158Ujhhgtgfeyxiexzf = mo158Ujhhgtgfeyxiexzf(i6)) != null) {
            if (this.f338Ujhhgtgfeyxiexzf) {
                iMo2979Ujhhgtgfeyxiexzf2 = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewMo158Ujhhgtgfeyxiexzf);
                iMo2977Ujhhgtgfeyxiexzf3 = this.f342feyxiexzfUjhhgtg;
            } else {
                iMo2977Ujhhgtgfeyxiexzf3 = this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewMo158Ujhhgtgfeyxiexzf) - this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                iMo2979Ujhhgtgfeyxiexzf2 = this.f342feyxiexzfUjhhgtg;
            }
            int i10 = iMo2979Ujhhgtgfeyxiexzf2 - iMo2977Ujhhgtgfeyxiexzf3;
            if (i10 > 0) {
                iMo2983Ujhhgtgfeyxiexzf2 += i10;
            } else {
                iMo2980Ujhhgtgfeyxiexzf -= i10;
            }
        }
        if (!c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf ? !this.f338Ujhhgtgfeyxiexzf : this.f338Ujhhgtgfeyxiexzf) {
            i8 = 1;
        }
        mo146feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, c0085Ujhhgtgfeyxiexzf, i8);
        m2201Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg);
        this.f334Ujhhgtgfeyxiexzf.f1191Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2981Ujhhgtgfeyxiexzf() == 0 && this.f335Ujhhgtgfeyxiexzf.mo2978Ujhhgtgfeyxiexzf() == 0;
        this.f334Ujhhgtgfeyxiexzf.getClass();
        this.f334Ujhhgtgfeyxiexzf.f1188Ujhhgtgfeyxiexzf = 0;
        if (c0085Ujhhgtgfeyxiexzf.f1163Ujhhgtgfeyxiexzf) {
            m194feyxiexzfUjhhgtg(c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf, c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf);
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf2 = this.f334Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf2.f1187Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf2;
            m174feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0087Ujhhgtgfeyxiexzf2, c0810feyxiexzfUjhhgtg, false);
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf3 = this.f334Ujhhgtgfeyxiexzf;
            i3 = c0087Ujhhgtgfeyxiexzf3.f1181Ujhhgtgfeyxiexzf;
            int i11 = c0087Ujhhgtgfeyxiexzf3.f1183Ujhhgtgfeyxiexzf;
            int i12 = c0087Ujhhgtgfeyxiexzf3.f1182Ujhhgtgfeyxiexzf;
            if (i12 > 0) {
                iMo2980Ujhhgtgfeyxiexzf += i12;
            }
            m193feyxiexzfUjhhgtg(c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf, c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf);
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf4 = this.f334Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf4.f1187Ujhhgtgfeyxiexzf = iMo2980Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf4.f1183Ujhhgtgfeyxiexzf += c0087Ujhhgtgfeyxiexzf4.f1184Ujhhgtgfeyxiexzf;
            m174feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0087Ujhhgtgfeyxiexzf4, c0810feyxiexzfUjhhgtg, false);
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf5 = this.f334Ujhhgtgfeyxiexzf;
            i2 = c0087Ujhhgtgfeyxiexzf5.f1181Ujhhgtgfeyxiexzf;
            int i13 = c0087Ujhhgtgfeyxiexzf5.f1182Ujhhgtgfeyxiexzf;
            if (i13 > 0) {
                m194feyxiexzfUjhhgtg(i11, i3);
                C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf6 = this.f334Ujhhgtgfeyxiexzf;
                c0087Ujhhgtgfeyxiexzf6.f1187Ujhhgtgfeyxiexzf = i13;
                m174feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0087Ujhhgtgfeyxiexzf6, c0810feyxiexzfUjhhgtg, false);
                i3 = this.f334Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf;
            }
        } else {
            m193feyxiexzfUjhhgtg(c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf, c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf);
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf7 = this.f334Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf7.f1187Ujhhgtgfeyxiexzf = iMo2980Ujhhgtgfeyxiexzf;
            m174feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0087Ujhhgtgfeyxiexzf7, c0810feyxiexzfUjhhgtg, false);
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf8 = this.f334Ujhhgtgfeyxiexzf;
            i2 = c0087Ujhhgtgfeyxiexzf8.f1181Ujhhgtgfeyxiexzf;
            int i14 = c0087Ujhhgtgfeyxiexzf8.f1183Ujhhgtgfeyxiexzf;
            int i15 = c0087Ujhhgtgfeyxiexzf8.f1182Ujhhgtgfeyxiexzf;
            if (i15 > 0) {
                iMo2983Ujhhgtgfeyxiexzf2 += i15;
            }
            m194feyxiexzfUjhhgtg(c0085Ujhhgtgfeyxiexzf.f1161Ujhhgtgfeyxiexzf, c0085Ujhhgtgfeyxiexzf.f1162Ujhhgtgfeyxiexzf);
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf9 = this.f334Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf9.f1187Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf2;
            c0087Ujhhgtgfeyxiexzf9.f1183Ujhhgtgfeyxiexzf += c0087Ujhhgtgfeyxiexzf9.f1184Ujhhgtgfeyxiexzf;
            m174feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0087Ujhhgtgfeyxiexzf9, c0810feyxiexzfUjhhgtg, false);
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf10 = this.f334Ujhhgtgfeyxiexzf;
            int i16 = c0087Ujhhgtgfeyxiexzf10.f1181Ujhhgtgfeyxiexzf;
            int i17 = c0087Ujhhgtgfeyxiexzf10.f1182Ujhhgtgfeyxiexzf;
            if (i17 > 0) {
                m193feyxiexzfUjhhgtg(i14, i2);
                C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf11 = this.f334Ujhhgtgfeyxiexzf;
                c0087Ujhhgtgfeyxiexzf11.f1187Ujhhgtgfeyxiexzf = i17;
                m174feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0087Ujhhgtgfeyxiexzf11, c0810feyxiexzfUjhhgtg, false);
                i2 = this.f334Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf;
            }
            i3 = i16;
        }
        if (m2203Ujhhgtgfeyxiexzf() > 0) {
            if (this.f338Ujhhgtgfeyxiexzf ^ this.f339Ujhhgtgfeyxiexzf) {
                int iM181Ujhhgtgfeyxiexzf2 = m181Ujhhgtgfeyxiexzf(i2, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, true);
                i4 = i3 + iM181Ujhhgtgfeyxiexzf2;
                i5 = i2 + iM181Ujhhgtgfeyxiexzf2;
                iM181Ujhhgtgfeyxiexzf = m182feyxiexzfUjhhgtg(i4, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, false);
            } else {
                int iM182feyxiexzfUjhhgtg = m182feyxiexzfUjhhgtg(i3, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, true);
                i4 = i3 + iM182feyxiexzfUjhhgtg;
                i5 = i2 + iM182feyxiexzfUjhhgtg;
                iM181Ujhhgtgfeyxiexzf = m181Ujhhgtgfeyxiexzf(i5, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, false);
            }
            i3 = i4 + iM181Ujhhgtgfeyxiexzf;
            i2 = i5 + iM181Ujhhgtgfeyxiexzf;
        }
        if (c0810feyxiexzfUjhhgtg.f3215Ujhhgtgfeyxiexzf && m2203Ujhhgtgfeyxiexzf() != 0 && !c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf && mo142Ujhhgtgfeyxiexzf()) {
            List list2 = c0831feyxiexzfUjhhgtg.f3295Ujhhgtgfeyxiexzf;
            int size = list2.size();
            int iM2196feyxiexzfUjhhgtg = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(0));
            int iMo2975Ujhhgtgfeyxiexzf = 0;
            int iMo2975Ujhhgtgfeyxiexzf2 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = (AbstractC0821feyxiexzfUjhhgtg) list2.get(i18);
                boolean zM2179Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf();
                View view = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
                if (!zM2179Ujhhgtgfeyxiexzf) {
                    if ((abstractC0821feyxiexzfUjhhgtg.m2173Ujhhgtgfeyxiexzf() < iM2196feyxiexzfUjhhgtg) != this.f338Ujhhgtgfeyxiexzf) {
                        iMo2975Ujhhgtgfeyxiexzf += this.f335Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view);
                    } else {
                        iMo2975Ujhhgtgfeyxiexzf2 += this.f335Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view);
                    }
                }
            }
            this.f334Ujhhgtgfeyxiexzf.f1190Ujhhgtgfeyxiexzf = list2;
            if (iMo2975Ujhhgtgfeyxiexzf > 0) {
                m194feyxiexzfUjhhgtg(AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m184feyxiexzfUjhhgtg()), i3);
                C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf12 = this.f334Ujhhgtgfeyxiexzf;
                c0087Ujhhgtgfeyxiexzf12.f1187Ujhhgtgfeyxiexzf = iMo2975Ujhhgtgfeyxiexzf;
                c0087Ujhhgtgfeyxiexzf12.f1182Ujhhgtgfeyxiexzf = 0;
                c0087Ujhhgtgfeyxiexzf12.m1139Ujhhgtgfeyxiexzf(null);
                m174feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, this.f334Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg, false);
            }
            if (iMo2975Ujhhgtgfeyxiexzf2 > 0) {
                m193feyxiexzfUjhhgtg(AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m183feyxiexzfUjhhgtg()), i2);
                C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf13 = this.f334Ujhhgtgfeyxiexzf;
                c0087Ujhhgtgfeyxiexzf13.f1187Ujhhgtgfeyxiexzf = iMo2975Ujhhgtgfeyxiexzf2;
                c0087Ujhhgtgfeyxiexzf13.f1182Ujhhgtgfeyxiexzf = 0;
                list = null;
                c0087Ujhhgtgfeyxiexzf13.m1139Ujhhgtgfeyxiexzf(null);
                m174feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, this.f334Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg, false);
            } else {
                list = null;
            }
            this.f334Ujhhgtgfeyxiexzf.f1190Ujhhgtgfeyxiexzf = list;
        }
        if (c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
            c0085Ujhhgtgfeyxiexzf.m1135Ujhhgtgfeyxiexzf();
        } else {
            AbstractC3387feyxiexzfUjhhgtg abstractC3387feyxiexzfUjhhgtg2 = this.f335Ujhhgtgfeyxiexzf;
            abstractC3387feyxiexzfUjhhgtg2.f10586Ujhhgtgfeyxiexzf = abstractC3387feyxiexzfUjhhgtg2.mo2984Ujhhgtgfeyxiexzf();
        }
        this.f336Ujhhgtgfeyxiexzf = this.f339Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ */
    public void mo137Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        this.f343feyxiexzfUjhhgtg = null;
        this.f341Ujhhgtgfeyxiexzf = -1;
        this.f342feyxiexzfUjhhgtg = Integer.MIN_VALUE;
        this.f344feyxiexzfUjhhgtg.m1135Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo163Ujhhgtgfeyxiexzf(Parcelable parcelable) {
        if (parcelable instanceof C0070Ujhhgtgfeyxiexzf) {
            C0070Ujhhgtgfeyxiexzf c0070Ujhhgtgfeyxiexzf = (C0070Ujhhgtgfeyxiexzf) parcelable;
            this.f343feyxiexzfUjhhgtg = c0070Ujhhgtgfeyxiexzf;
            if (this.f341Ujhhgtgfeyxiexzf != -1) {
                c0070Ujhhgtgfeyxiexzf.f1104Ujhhgtgfeyxiexzf = -1;
            }
            m2216feyxiexzfUjhhgtg();
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final Parcelable mo164feyxiexzfUjhhgtg() {
        C0070Ujhhgtgfeyxiexzf c0070Ujhhgtgfeyxiexzf = this.f343feyxiexzfUjhhgtg;
        if (c0070Ujhhgtgfeyxiexzf != null) {
            C0070Ujhhgtgfeyxiexzf c0070Ujhhgtgfeyxiexzf2 = new C0070Ujhhgtgfeyxiexzf();
            c0070Ujhhgtgfeyxiexzf2.f1104Ujhhgtgfeyxiexzf = c0070Ujhhgtgfeyxiexzf.f1104Ujhhgtgfeyxiexzf;
            c0070Ujhhgtgfeyxiexzf2.f1105Ujhhgtgfeyxiexzf = c0070Ujhhgtgfeyxiexzf.f1105Ujhhgtgfeyxiexzf;
            c0070Ujhhgtgfeyxiexzf2.f1106Ujhhgtgfeyxiexzf = c0070Ujhhgtgfeyxiexzf.f1106Ujhhgtgfeyxiexzf;
            return c0070Ujhhgtgfeyxiexzf2;
        }
        C0070Ujhhgtgfeyxiexzf c0070Ujhhgtgfeyxiexzf3 = new C0070Ujhhgtgfeyxiexzf();
        if (m2203Ujhhgtgfeyxiexzf() <= 0) {
            c0070Ujhhgtgfeyxiexzf3.f1104Ujhhgtgfeyxiexzf = -1;
            return c0070Ujhhgtgfeyxiexzf3;
        }
        m173feyxiexzfUjhhgtg();
        boolean z = this.f336Ujhhgtgfeyxiexzf ^ this.f338Ujhhgtgfeyxiexzf;
        c0070Ujhhgtgfeyxiexzf3.f1106Ujhhgtgfeyxiexzf = z;
        if (z) {
            View viewM183feyxiexzfUjhhgtg = m183feyxiexzfUjhhgtg();
            c0070Ujhhgtgfeyxiexzf3.f1105Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM183feyxiexzfUjhhgtg);
            c0070Ujhhgtgfeyxiexzf3.f1104Ujhhgtgfeyxiexzf = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewM183feyxiexzfUjhhgtg);
            return c0070Ujhhgtgfeyxiexzf3;
        }
        View viewM184feyxiexzfUjhhgtg = m184feyxiexzfUjhhgtg();
        c0070Ujhhgtgfeyxiexzf3.f1104Ujhhgtgfeyxiexzf = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewM184feyxiexzfUjhhgtg);
        c0070Ujhhgtgfeyxiexzf3.f1105Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM184feyxiexzfUjhhgtg) - this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
        return c0070Ujhhgtgfeyxiexzf3;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ */
    public boolean mo138Ujhhgtgfeyxiexzf(int i, Bundle bundle) {
        int iMin;
        if (super.mo138Ujhhgtgfeyxiexzf(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.f333Ujhhgtgfeyxiexzf == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
                iMin = Math.min(i2, mo127feyxiexzfUjhhgtg(recyclerView.f359Ujhhgtgfeyxiexzf, recyclerView.f412feyxiexzfUjhhgtg) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f3261Ujhhgtgfeyxiexzf;
                iMin = Math.min(i3, mo126Ujhhgtgfeyxiexzf(recyclerView2.f359Ujhhgtgfeyxiexzf, recyclerView2.f412feyxiexzfUjhhgtg) - 1);
            }
            if (iMin >= 0) {
                mo190Ujhhgtgfeyxiexzf(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ */
    public int mo139Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (this.f333Ujhhgtgfeyxiexzf == 1) {
            return 0;
        }
        return m189feyxiexzfUjhhgtg(i, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public void mo165Ujhhgtgfeyxiexzf(int i) {
        this.f341Ujhhgtgfeyxiexzf = i;
        this.f342feyxiexzfUjhhgtg = Integer.MIN_VALUE;
        C0070Ujhhgtgfeyxiexzf c0070Ujhhgtgfeyxiexzf = this.f343feyxiexzfUjhhgtg;
        if (c0070Ujhhgtgfeyxiexzf != null) {
            c0070Ujhhgtgfeyxiexzf.f1104Ujhhgtgfeyxiexzf = -1;
        }
        m2216feyxiexzfUjhhgtg();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ */
    public int mo140Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (this.f333Ujhhgtgfeyxiexzf == 0) {
            return 0;
        }
        return m189feyxiexzfUjhhgtg(i, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final boolean mo166feyxiexzfUjhhgtg() {
        if (this.f3272Ujhhgtgfeyxiexzf != 1073741824 && this.f3271Ujhhgtgfeyxiexzf != 1073741824) {
            int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf();
            for (int i = 0; i < iM2203Ujhhgtgfeyxiexzf; i++) {
                ViewGroup.LayoutParams layoutParams = m2202Ujhhgtgfeyxiexzf(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public void mo167feyxiexzfUjhhgtg(RecyclerView recyclerView, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, int i) {
        C0069Ujhhgtgfeyxiexzf c0069Ujhhgtgfeyxiexzf = new C0069Ujhhgtgfeyxiexzf(recyclerView.getContext());
        c0069Ujhhgtgfeyxiexzf.f1088Ujhhgtgfeyxiexzf = i;
        m2223Ujhhgtgfeyxiexzf(c0069Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ */
    public boolean mo142Ujhhgtgfeyxiexzf() {
        return this.f343feyxiexzfUjhhgtg == null && this.f336Ujhhgtgfeyxiexzf == this.f339Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public void m168feyxiexzfUjhhgtg(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, int[] iArr) {
        int i;
        int iMo2984Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.f3205Ujhhgtgfeyxiexzf != -1 ? this.f335Ujhhgtgfeyxiexzf.mo2984Ujhhgtgfeyxiexzf() : 0;
        if (this.f334Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf == -1) {
            i = 0;
        } else {
            i = iMo2984Ujhhgtgfeyxiexzf;
            iMo2984Ujhhgtgfeyxiexzf = 0;
        }
        iArr[0] = iMo2984Ujhhgtgfeyxiexzf;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ */
    public void mo143feyxiexzfUjhhgtg(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf, C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf) {
        int i = c0087Ujhhgtgfeyxiexzf.f1183Ujhhgtgfeyxiexzf;
        if (i < 0 || i >= c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf()) {
            return;
        }
        c3570Ujhhgtgfeyxiexzf.m5105Ujhhgtgfeyxiexzf(i, Math.max(0, c0087Ujhhgtgfeyxiexzf.f1186Ujhhgtgfeyxiexzf));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m169Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (m2203Ujhhgtgfeyxiexzf() == 0) {
            return 0;
        }
        m173feyxiexzfUjhhgtg();
        AbstractC3387feyxiexzfUjhhgtg abstractC3387feyxiexzfUjhhgtg = this.f335Ujhhgtgfeyxiexzf;
        boolean z = !this.f340Ujhhgtgfeyxiexzf;
        return AbstractC2855feyxiexzfUjhhgtg.m4197Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg, abstractC3387feyxiexzfUjhhgtg, m176feyxiexzfUjhhgtg(z), m175Ujhhgtgfeyxiexzf(z), this, this.f340Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int m170feyxiexzfUjhhgtg(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (m2203Ujhhgtgfeyxiexzf() == 0) {
            return 0;
        }
        m173feyxiexzfUjhhgtg();
        AbstractC3387feyxiexzfUjhhgtg abstractC3387feyxiexzfUjhhgtg = this.f335Ujhhgtgfeyxiexzf;
        boolean z = !this.f340Ujhhgtgfeyxiexzf;
        return AbstractC2855feyxiexzfUjhhgtg.m4198Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg, abstractC3387feyxiexzfUjhhgtg, m176feyxiexzfUjhhgtg(z), m175Ujhhgtgfeyxiexzf(z), this, this.f340Ujhhgtgfeyxiexzf, this.f338Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int m171Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (m2203Ujhhgtgfeyxiexzf() == 0) {
            return 0;
        }
        m173feyxiexzfUjhhgtg();
        AbstractC3387feyxiexzfUjhhgtg abstractC3387feyxiexzfUjhhgtg = this.f335Ujhhgtgfeyxiexzf;
        boolean z = !this.f340Ujhhgtgfeyxiexzf;
        return AbstractC2855feyxiexzfUjhhgtg.m4199Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg, abstractC3387feyxiexzfUjhhgtg, m176feyxiexzfUjhhgtg(z), m175Ujhhgtgfeyxiexzf(z), this, this.f340Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m172Ujhhgtgfeyxiexzf(int i) {
        if (i == 1) {
            return (this.f333Ujhhgtgfeyxiexzf != 1 && m185feyxiexzfUjhhgtg()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f333Ujhhgtgfeyxiexzf != 1 && m185feyxiexzfUjhhgtg()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f333Ujhhgtgfeyxiexzf == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f333Ujhhgtgfeyxiexzf == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.f333Ujhhgtgfeyxiexzf == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f333Ujhhgtgfeyxiexzf == 0 ? 1 : Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void m173feyxiexzfUjhhgtg() {
        if (this.f334Ujhhgtgfeyxiexzf == null) {
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf = new C0087Ujhhgtgfeyxiexzf();
            c0087Ujhhgtgfeyxiexzf.f1180Ujhhgtgfeyxiexzf = true;
            c0087Ujhhgtgfeyxiexzf.f1187Ujhhgtgfeyxiexzf = 0;
            c0087Ujhhgtgfeyxiexzf.f1188Ujhhgtgfeyxiexzf = 0;
            c0087Ujhhgtgfeyxiexzf.f1190Ujhhgtgfeyxiexzf = null;
            this.f334Ujhhgtgfeyxiexzf = c0087Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int m174feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, boolean z) {
        int i;
        int i2 = c0087Ujhhgtgfeyxiexzf.f1182Ujhhgtgfeyxiexzf;
        int i3 = c0087Ujhhgtgfeyxiexzf.f1186Ujhhgtgfeyxiexzf;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0087Ujhhgtgfeyxiexzf.f1186Ujhhgtgfeyxiexzf = i3 + i2;
            }
            m186Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0087Ujhhgtgfeyxiexzf);
        }
        int i4 = c0087Ujhhgtgfeyxiexzf.f1182Ujhhgtgfeyxiexzf + c0087Ujhhgtgfeyxiexzf.f1187Ujhhgtgfeyxiexzf;
        while (true) {
            if ((!c0087Ujhhgtgfeyxiexzf.f1191Ujhhgtgfeyxiexzf && i4 <= 0) || (i = c0087Ujhhgtgfeyxiexzf.f1183Ujhhgtgfeyxiexzf) < 0 || i >= c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf()) {
                break;
            }
            C0088Ujhhgtgfeyxiexzf c0088Ujhhgtgfeyxiexzf = this.f345feyxiexzfUjhhgtg;
            c0088Ujhhgtgfeyxiexzf.f1192Ujhhgtgfeyxiexzf = 0;
            c0088Ujhhgtgfeyxiexzf.f1193Ujhhgtgfeyxiexzf = false;
            c0088Ujhhgtgfeyxiexzf.f1194Ujhhgtgfeyxiexzf = false;
            c0088Ujhhgtgfeyxiexzf.f1195Ujhhgtgfeyxiexzf = false;
            mo145feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, c0087Ujhhgtgfeyxiexzf, c0088Ujhhgtgfeyxiexzf);
            if (!c0088Ujhhgtgfeyxiexzf.f1193Ujhhgtgfeyxiexzf) {
                int i5 = c0087Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf;
                int i6 = c0088Ujhhgtgfeyxiexzf.f1192Ujhhgtgfeyxiexzf;
                c0087Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf = (c0087Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf * i6) + i5;
                if (!c0088Ujhhgtgfeyxiexzf.f1194Ujhhgtgfeyxiexzf || c0087Ujhhgtgfeyxiexzf.f1190Ujhhgtgfeyxiexzf != null || !c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
                    c0087Ujhhgtgfeyxiexzf.f1182Ujhhgtgfeyxiexzf -= i6;
                    i4 -= i6;
                }
                int i7 = c0087Ujhhgtgfeyxiexzf.f1186Ujhhgtgfeyxiexzf;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0087Ujhhgtgfeyxiexzf.f1186Ujhhgtgfeyxiexzf = i8;
                    int i9 = c0087Ujhhgtgfeyxiexzf.f1182Ujhhgtgfeyxiexzf;
                    if (i9 < 0) {
                        c0087Ujhhgtgfeyxiexzf.f1186Ujhhgtgfeyxiexzf = i8 + i9;
                    }
                    m186Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0087Ujhhgtgfeyxiexzf);
                }
                if (z && c0088Ujhhgtgfeyxiexzf.f1195Ujhhgtgfeyxiexzf) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0087Ujhhgtgfeyxiexzf.f1182Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final View m175Ujhhgtgfeyxiexzf(boolean z) {
        return this.f338Ujhhgtgfeyxiexzf ? m180Ujhhgtgfeyxiexzf(0, m2203Ujhhgtgfeyxiexzf(), z) : m180Ujhhgtgfeyxiexzf(m2203Ujhhgtgfeyxiexzf() - 1, -1, z);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final View m176feyxiexzfUjhhgtg(boolean z) {
        return this.f338Ujhhgtgfeyxiexzf ? m180Ujhhgtgfeyxiexzf(m2203Ujhhgtgfeyxiexzf() - 1, -1, z) : m180Ujhhgtgfeyxiexzf(0, m2203Ujhhgtgfeyxiexzf(), z);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public int mo177Ujhhgtgfeyxiexzf() {
        View viewM180Ujhhgtgfeyxiexzf = m180Ujhhgtgfeyxiexzf(0, m2203Ujhhgtgfeyxiexzf(), false);
        if (viewM180Ujhhgtgfeyxiexzf == null) {
            return -1;
        }
        return AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewM180Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public int mo178Ujhhgtgfeyxiexzf() {
        View viewM180Ujhhgtgfeyxiexzf = m180Ujhhgtgfeyxiexzf(m2203Ujhhgtgfeyxiexzf() - 1, -1, false);
        if (viewM180Ujhhgtgfeyxiexzf == null) {
            return -1;
        }
        return AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewM180Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final View m179Ujhhgtgfeyxiexzf(int i, int i2) {
        int i3;
        int i4;
        m173feyxiexzfUjhhgtg();
        if (i2 <= i && i2 >= i) {
            return m2202Ujhhgtgfeyxiexzf(i);
        }
        if (this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(m2202Ujhhgtgfeyxiexzf(i)) < this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = r.a.a;
        }
        return this.f333Ujhhgtgfeyxiexzf == 0 ? this.f3262Ujhhgtgfeyxiexzf.m3370Ujhhgtgfeyxiexzf(i, i2, i3, i4) : this.f3263Ujhhgtgfeyxiexzf.m3370Ujhhgtgfeyxiexzf(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final View m180Ujhhgtgfeyxiexzf(int i, int i2, boolean z) {
        m173feyxiexzfUjhhgtg();
        int i3 = z ? 24579 : 320;
        return this.f333Ujhhgtgfeyxiexzf == 0 ? this.f3262Ujhhgtgfeyxiexzf.m3370Ujhhgtgfeyxiexzf(i, i2, i3, 320) : this.f3263Ujhhgtgfeyxiexzf.m3370Ujhhgtgfeyxiexzf(i, i2, i3, 320);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲ */
    public View mo144Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, boolean z, boolean z2) {
        int i;
        int iM2203Ujhhgtgfeyxiexzf;
        int i2;
        m173feyxiexzfUjhhgtg();
        int iM2203Ujhhgtgfeyxiexzf2 = m2203Ujhhgtgfeyxiexzf();
        if (z2) {
            iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM2203Ujhhgtgfeyxiexzf2;
            iM2203Ujhhgtgfeyxiexzf = 0;
            i2 = 1;
        }
        int iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf();
        int iMo2983Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
        int iMo2979Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM2203Ujhhgtgfeyxiexzf != i) {
            View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(iM2203Ujhhgtgfeyxiexzf);
            int iM2196feyxiexzfUjhhgtg = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewM2202Ujhhgtgfeyxiexzf);
            int iMo2977Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
            int iMo2974Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
            if (iM2196feyxiexzfUjhhgtg >= 0 && iM2196feyxiexzfUjhhgtg < iM2158Ujhhgtgfeyxiexzf) {
                if (!((C0825feyxiexzfUjhhgtg) viewM2202Ujhhgtgfeyxiexzf.getLayoutParams()).f3279Ujhhgtgfeyxiexzf.m2179Ujhhgtgfeyxiexzf()) {
                    boolean z3 = iMo2974Ujhhgtgfeyxiexzf <= iMo2983Ujhhgtgfeyxiexzf && iMo2977Ujhhgtgfeyxiexzf < iMo2983Ujhhgtgfeyxiexzf;
                    boolean z4 = iMo2977Ujhhgtgfeyxiexzf >= iMo2979Ujhhgtgfeyxiexzf && iMo2974Ujhhgtgfeyxiexzf > iMo2979Ujhhgtgfeyxiexzf;
                    if (!z3 && !z4) {
                        return viewM2202Ujhhgtgfeyxiexzf;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewM2202Ujhhgtgfeyxiexzf;
                        } else if (view == null) {
                            view = viewM2202Ujhhgtgfeyxiexzf;
                        }
                    } else if (z3) {
                        view2 = viewM2202Ujhhgtgfeyxiexzf;
                    } else if (view == null) {
                        view = viewM2202Ujhhgtgfeyxiexzf;
                    }
                } else if (view3 == null) {
                    view3 = viewM2202Ujhhgtgfeyxiexzf;
                }
            }
            iM2203Ujhhgtgfeyxiexzf += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m181Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, boolean z) {
        int iMo2979Ujhhgtgfeyxiexzf;
        int iMo2979Ujhhgtgfeyxiexzf2 = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - i;
        if (iMo2979Ujhhgtgfeyxiexzf2 <= 0) {
            return 0;
        }
        int i2 = -m189feyxiexzfUjhhgtg(-iMo2979Ujhhgtgfeyxiexzf2, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
        int i3 = i + i2;
        if (!z || (iMo2979Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - i3) <= 0) {
            return i2;
        }
        this.f335Ujhhgtgfeyxiexzf.mo2987Ujhhgtgfeyxiexzf(iMo2979Ujhhgtgfeyxiexzf);
        return iMo2979Ujhhgtgfeyxiexzf + i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public final int m182feyxiexzfUjhhgtg(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, boolean z) {
        int iMo2983Ujhhgtgfeyxiexzf;
        int iMo2983Ujhhgtgfeyxiexzf2 = i - this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
        if (iMo2983Ujhhgtgfeyxiexzf2 <= 0) {
            return 0;
        }
        int i2 = -m189feyxiexzfUjhhgtg(iMo2983Ujhhgtgfeyxiexzf2, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
        int i3 = i + i2;
        if (!z || (iMo2983Ujhhgtgfeyxiexzf = i3 - this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf()) <= 0) {
            return i2;
        }
        this.f335Ujhhgtgfeyxiexzf.mo2987Ujhhgtgfeyxiexzf(-iMo2983Ujhhgtgfeyxiexzf);
        return i2 - iMo2983Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public final View m183feyxiexzfUjhhgtg() {
        return m2202Ujhhgtgfeyxiexzf(this.f338Ujhhgtgfeyxiexzf ? 0 : m2203Ujhhgtgfeyxiexzf() - 1);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final View m184feyxiexzfUjhhgtg() {
        return m2202Ujhhgtgfeyxiexzf(this.f338Ujhhgtgfeyxiexzf ? m2203Ujhhgtgfeyxiexzf() - 1 : 0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final boolean m185feyxiexzfUjhhgtg() {
        return this.f3261Ujhhgtgfeyxiexzf.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲ */
    public void mo145feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf, C0088Ujhhgtgfeyxiexzf c0088Ujhhgtgfeyxiexzf) {
        int iM2206feyxiexzfUjhhgtg;
        int i;
        int i2;
        int iMo2976Ujhhgtgfeyxiexzf;
        View viewM1140Ujhhgtgfeyxiexzf = c0087Ujhhgtgfeyxiexzf.m1140Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg);
        if (viewM1140Ujhhgtgfeyxiexzf == null) {
            c0088Ujhhgtgfeyxiexzf.f1193Ujhhgtgfeyxiexzf = true;
            return;
        }
        C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg = (C0825feyxiexzfUjhhgtg) viewM1140Ujhhgtgfeyxiexzf.getLayoutParams();
        if (c0087Ujhhgtgfeyxiexzf.f1190Ujhhgtgfeyxiexzf == null) {
            if (this.f338Ujhhgtgfeyxiexzf == (c0087Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf == -1)) {
                m2200Ujhhgtgfeyxiexzf(viewM1140Ujhhgtgfeyxiexzf, -1, false);
            } else {
                m2200Ujhhgtgfeyxiexzf(viewM1140Ujhhgtgfeyxiexzf, 0, false);
            }
        } else {
            if (this.f338Ujhhgtgfeyxiexzf == (c0087Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf == -1)) {
                m2200Ujhhgtgfeyxiexzf(viewM1140Ujhhgtgfeyxiexzf, -1, true);
            } else {
                m2200Ujhhgtgfeyxiexzf(viewM1140Ujhhgtgfeyxiexzf, 0, true);
            }
        }
        C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg2 = (C0825feyxiexzfUjhhgtg) viewM1140Ujhhgtgfeyxiexzf.getLayoutParams();
        Rect rectM233feyxiexzfUjhhgtg = this.f3261Ujhhgtgfeyxiexzf.m233feyxiexzfUjhhgtg(viewM1140Ujhhgtgfeyxiexzf);
        int i3 = rectM233feyxiexzfUjhhgtg.left + rectM233feyxiexzfUjhhgtg.right;
        int i4 = rectM233feyxiexzfUjhhgtg.top + rectM233feyxiexzfUjhhgtg.bottom;
        int iM2189Ujhhgtgfeyxiexzf = AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(this.f3273Ujhhgtgfeyxiexzf, this.f3271Ujhhgtgfeyxiexzf, m2207feyxiexzfUjhhgtg() + m2206feyxiexzfUjhhgtg() + ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg2).leftMargin + ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg2).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg2).width, mo152Ujhhgtgfeyxiexzf());
        int iM2189Ujhhgtgfeyxiexzf2 = AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(this.f3274Ujhhgtgfeyxiexzf, this.f3272Ujhhgtgfeyxiexzf, m2205feyxiexzfUjhhgtg() + m2208feyxiexzfUjhhgtg() + ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg2).topMargin + ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg2).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg2).height, mo153Ujhhgtgfeyxiexzf());
        if (m2221feyxiexzfUjhhgtg(viewM1140Ujhhgtgfeyxiexzf, iM2189Ujhhgtgfeyxiexzf, iM2189Ujhhgtgfeyxiexzf2, c0825feyxiexzfUjhhgtg2)) {
            viewM1140Ujhhgtgfeyxiexzf.measure(iM2189Ujhhgtgfeyxiexzf, iM2189Ujhhgtgfeyxiexzf2);
        }
        c0088Ujhhgtgfeyxiexzf.f1192Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(viewM1140Ujhhgtgfeyxiexzf);
        if (this.f333Ujhhgtgfeyxiexzf == 1) {
            if (m185feyxiexzfUjhhgtg()) {
                iMo2976Ujhhgtgfeyxiexzf = this.f3273Ujhhgtgfeyxiexzf - m2207feyxiexzfUjhhgtg();
                iM2206feyxiexzfUjhhgtg = iMo2976Ujhhgtgfeyxiexzf - this.f335Ujhhgtgfeyxiexzf.mo2976Ujhhgtgfeyxiexzf(viewM1140Ujhhgtgfeyxiexzf);
            } else {
                iM2206feyxiexzfUjhhgtg = m2206feyxiexzfUjhhgtg();
                iMo2976Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2976Ujhhgtgfeyxiexzf(viewM1140Ujhhgtgfeyxiexzf) + iM2206feyxiexzfUjhhgtg;
            }
            if (c0087Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf == -1) {
                i = c0087Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf;
                i2 = i - c0088Ujhhgtgfeyxiexzf.f1192Ujhhgtgfeyxiexzf;
            } else {
                i2 = c0087Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf;
                i = c0088Ujhhgtgfeyxiexzf.f1192Ujhhgtgfeyxiexzf + i2;
            }
        } else {
            int iM2208feyxiexzfUjhhgtg = m2208feyxiexzfUjhhgtg();
            int iMo2976Ujhhgtgfeyxiexzf2 = this.f335Ujhhgtgfeyxiexzf.mo2976Ujhhgtgfeyxiexzf(viewM1140Ujhhgtgfeyxiexzf) + iM2208feyxiexzfUjhhgtg;
            if (c0087Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf == -1) {
                int i5 = c0087Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf;
                int i6 = i5 - c0088Ujhhgtgfeyxiexzf.f1192Ujhhgtgfeyxiexzf;
                iMo2976Ujhhgtgfeyxiexzf = i5;
                i = iMo2976Ujhhgtgfeyxiexzf2;
                iM2206feyxiexzfUjhhgtg = i6;
                i2 = iM2208feyxiexzfUjhhgtg;
            } else {
                int i7 = c0087Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf;
                int i8 = c0088Ujhhgtgfeyxiexzf.f1192Ujhhgtgfeyxiexzf + i7;
                iM2206feyxiexzfUjhhgtg = i7;
                i = iMo2976Ujhhgtgfeyxiexzf2;
                i2 = iM2208feyxiexzfUjhhgtg;
                iMo2976Ujhhgtgfeyxiexzf = i8;
            }
        }
        AbstractC0822feyxiexzfUjhhgtg.m2199feyxiexzfUjhhgtg(viewM1140Ujhhgtgfeyxiexzf, iM2206feyxiexzfUjhhgtg, i2, iMo2976Ujhhgtgfeyxiexzf, i);
        if (c0825feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2179Ujhhgtgfeyxiexzf() || c0825feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2182Ujhhgtgfeyxiexzf()) {
            c0088Ujhhgtgfeyxiexzf.f1194Ujhhgtgfeyxiexzf = true;
        }
        c0088Ujhhgtgfeyxiexzf.f1195Ujhhgtgfeyxiexzf = viewM1140Ujhhgtgfeyxiexzf.hasFocusable();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m186Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf) {
        if (!c0087Ujhhgtgfeyxiexzf.f1180Ujhhgtgfeyxiexzf || c0087Ujhhgtgfeyxiexzf.f1191Ujhhgtgfeyxiexzf) {
            return;
        }
        int i = c0087Ujhhgtgfeyxiexzf.f1186Ujhhgtgfeyxiexzf;
        int i2 = c0087Ujhhgtgfeyxiexzf.f1188Ujhhgtgfeyxiexzf;
        if (c0087Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf == -1) {
            int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf();
            if (i < 0) {
                return;
            }
            int iMo2978Ujhhgtgfeyxiexzf = (this.f335Ujhhgtgfeyxiexzf.mo2978Ujhhgtgfeyxiexzf() - i) + i2;
            if (this.f338Ujhhgtgfeyxiexzf) {
                for (int i3 = 0; i3 < iM2203Ujhhgtgfeyxiexzf; i3++) {
                    View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(i3);
                    if (this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf) < iMo2978Ujhhgtgfeyxiexzf || this.f335Ujhhgtgfeyxiexzf.mo2986Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf) < iMo2978Ujhhgtgfeyxiexzf) {
                        m187Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM2203Ujhhgtgfeyxiexzf - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM2202Ujhhgtgfeyxiexzf2 = m2202Ujhhgtgfeyxiexzf(i5);
                if (this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf2) < iMo2978Ujhhgtgfeyxiexzf || this.f335Ujhhgtgfeyxiexzf.mo2986Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf2) < iMo2978Ujhhgtgfeyxiexzf) {
                    m187Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM2203Ujhhgtgfeyxiexzf2 = m2203Ujhhgtgfeyxiexzf();
        if (!this.f338Ujhhgtgfeyxiexzf) {
            for (int i7 = 0; i7 < iM2203Ujhhgtgfeyxiexzf2; i7++) {
                View viewM2202Ujhhgtgfeyxiexzf3 = m2202Ujhhgtgfeyxiexzf(i7);
                if (this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf3) > i6 || this.f335Ujhhgtgfeyxiexzf.mo2985Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf3) > i6) {
                    m187Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM2203Ujhhgtgfeyxiexzf2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM2202Ujhhgtgfeyxiexzf4 = m2202Ujhhgtgfeyxiexzf(i9);
            if (this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf4) > i6 || this.f335Ujhhgtgfeyxiexzf.mo2985Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf4) > i6) {
                m187Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m187Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m2214feyxiexzfUjhhgtg(i, c0831feyxiexzfUjhhgtg);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m2214feyxiexzfUjhhgtg(i3, c0831feyxiexzfUjhhgtg);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void m188feyxiexzfUjhhgtg() {
        if (this.f333Ujhhgtgfeyxiexzf == 1 || !m185feyxiexzfUjhhgtg()) {
            this.f338Ujhhgtgfeyxiexzf = this.f337Ujhhgtgfeyxiexzf;
        } else {
            this.f338Ujhhgtgfeyxiexzf = !this.f337Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int m189feyxiexzfUjhhgtg(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (m2203Ujhhgtgfeyxiexzf() != 0 && i != 0) {
            m173feyxiexzfUjhhgtg();
            this.f334Ujhhgtgfeyxiexzf.f1180Ujhhgtgfeyxiexzf = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m192Ujhhgtgfeyxiexzf(i2, iAbs, true, c0810feyxiexzfUjhhgtg);
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf = this.f334Ujhhgtgfeyxiexzf;
            int iM174feyxiexzfUjhhgtg = m174feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0087Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg, false) + c0087Ujhhgtgfeyxiexzf.f1186Ujhhgtgfeyxiexzf;
            if (iM174feyxiexzfUjhhgtg >= 0) {
                if (iAbs > iM174feyxiexzfUjhhgtg) {
                    i = i2 * iM174feyxiexzfUjhhgtg;
                }
                this.f335Ujhhgtgfeyxiexzf.mo2987Ujhhgtgfeyxiexzf(-i);
                this.f334Ujhhgtgfeyxiexzf.f1189Ujhhgtgfeyxiexzf = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void mo190Ujhhgtgfeyxiexzf(int i, int i2) {
        this.f341Ujhhgtgfeyxiexzf = i;
        this.f342feyxiexzfUjhhgtg = i2;
        C0070Ujhhgtgfeyxiexzf c0070Ujhhgtgfeyxiexzf = this.f343feyxiexzfUjhhgtg;
        if (c0070Ujhhgtgfeyxiexzf != null) {
            c0070Ujhhgtgfeyxiexzf.f1104Ujhhgtgfeyxiexzf = -1;
        }
        m2216feyxiexzfUjhhgtg();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m191feyxiexzfUjhhgtg(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "invalid orientation:"));
        }
        mo151Ujhhgtgfeyxiexzf(null);
        if (i != this.f333Ujhhgtgfeyxiexzf || this.f335Ujhhgtgfeyxiexzf == null) {
            AbstractC3387feyxiexzfUjhhgtg abstractC3387feyxiexzfUjhhgtgM4906Ujhhgtgfeyxiexzf = AbstractC3387feyxiexzfUjhhgtg.m4906Ujhhgtgfeyxiexzf(this, i);
            this.f335Ujhhgtgfeyxiexzf = abstractC3387feyxiexzfUjhhgtgM4906Ujhhgtgfeyxiexzf;
            this.f344feyxiexzfUjhhgtg.f1160Ujhhgtgfeyxiexzf = abstractC3387feyxiexzfUjhhgtgM4906Ujhhgtgfeyxiexzf;
            this.f333Ujhhgtgfeyxiexzf = i;
            m2216feyxiexzfUjhhgtg();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ */
    public void mo147Ujhhgtgfeyxiexzf(boolean z) {
        mo151Ujhhgtgfeyxiexzf(null);
        if (this.f339Ujhhgtgfeyxiexzf == z) {
            return;
        }
        this.f339Ujhhgtgfeyxiexzf = z;
        m2216feyxiexzfUjhhgtg();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m192Ujhhgtgfeyxiexzf(int i, int i2, boolean z, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        int iMo2983Ujhhgtgfeyxiexzf;
        this.f334Ujhhgtgfeyxiexzf.f1191Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2981Ujhhgtgfeyxiexzf() == 0 && this.f335Ujhhgtgfeyxiexzf.mo2978Ujhhgtgfeyxiexzf() == 0;
        this.f334Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf = i;
        int[] iArr = this.f347feyxiexzfUjhhgtg;
        iArr[0] = 0;
        iArr[1] = 0;
        m168feyxiexzfUjhhgtg(c0810feyxiexzfUjhhgtg, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf = this.f334Ujhhgtgfeyxiexzf;
        int i3 = z2 ? iMax2 : iMax;
        c0087Ujhhgtgfeyxiexzf.f1187Ujhhgtgfeyxiexzf = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c0087Ujhhgtgfeyxiexzf.f1188Ujhhgtgfeyxiexzf = iMax;
        if (z2) {
            c0087Ujhhgtgfeyxiexzf.f1187Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2980Ujhhgtgfeyxiexzf() + i3;
            View viewM183feyxiexzfUjhhgtg = m183feyxiexzfUjhhgtg();
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf2 = this.f334Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf2.f1184Ujhhgtgfeyxiexzf = this.f338Ujhhgtgfeyxiexzf ? -1 : 1;
            int iM2196feyxiexzfUjhhgtg = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewM183feyxiexzfUjhhgtg);
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf3 = this.f334Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf2.f1183Ujhhgtgfeyxiexzf = iM2196feyxiexzfUjhhgtg + c0087Ujhhgtgfeyxiexzf3.f1184Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf3.f1181Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM183feyxiexzfUjhhgtg);
            iMo2983Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM183feyxiexzfUjhhgtg) - this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
        } else {
            View viewM184feyxiexzfUjhhgtg = m184feyxiexzfUjhhgtg();
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf4 = this.f334Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf4.f1187Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf() + c0087Ujhhgtgfeyxiexzf4.f1187Ujhhgtgfeyxiexzf;
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf5 = this.f334Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf5.f1184Ujhhgtgfeyxiexzf = this.f338Ujhhgtgfeyxiexzf ? 1 : -1;
            int iM2196feyxiexzfUjhhgtg2 = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewM184feyxiexzfUjhhgtg);
            C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf6 = this.f334Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf5.f1183Ujhhgtgfeyxiexzf = iM2196feyxiexzfUjhhgtg2 + c0087Ujhhgtgfeyxiexzf6.f1184Ujhhgtgfeyxiexzf;
            c0087Ujhhgtgfeyxiexzf6.f1181Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM184feyxiexzfUjhhgtg);
            iMo2983Ujhhgtgfeyxiexzf = (-this.f335Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM184feyxiexzfUjhhgtg)) + this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
        }
        C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf7 = this.f334Ujhhgtgfeyxiexzf;
        c0087Ujhhgtgfeyxiexzf7.f1182Ujhhgtgfeyxiexzf = i2;
        if (z) {
            c0087Ujhhgtgfeyxiexzf7.f1182Ujhhgtgfeyxiexzf = i2 - iMo2983Ujhhgtgfeyxiexzf;
        }
        c0087Ujhhgtgfeyxiexzf7.f1186Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void m193feyxiexzfUjhhgtg(int i, int i2) {
        this.f334Ujhhgtgfeyxiexzf.f1182Ujhhgtgfeyxiexzf = this.f335Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - i2;
        C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf = this.f334Ujhhgtgfeyxiexzf;
        c0087Ujhhgtgfeyxiexzf.f1184Ujhhgtgfeyxiexzf = this.f338Ujhhgtgfeyxiexzf ? -1 : 1;
        c0087Ujhhgtgfeyxiexzf.f1183Ujhhgtgfeyxiexzf = i;
        c0087Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf = 1;
        c0087Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf = i2;
        c0087Ujhhgtgfeyxiexzf.f1186Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m194feyxiexzfUjhhgtg(int i, int i2) {
        this.f334Ujhhgtgfeyxiexzf.f1182Ujhhgtgfeyxiexzf = i2 - this.f335Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
        C0087Ujhhgtgfeyxiexzf c0087Ujhhgtgfeyxiexzf = this.f334Ujhhgtgfeyxiexzf;
        c0087Ujhhgtgfeyxiexzf.f1183Ujhhgtgfeyxiexzf = i;
        c0087Ujhhgtgfeyxiexzf.f1184Ujhhgtgfeyxiexzf = this.f338Ujhhgtgfeyxiexzf ? 1 : -1;
        c0087Ujhhgtgfeyxiexzf.f1185Ujhhgtgfeyxiexzf = -1;
        c0087Ujhhgtgfeyxiexzf.f1181Ujhhgtgfeyxiexzf = i2;
        c0087Ujhhgtgfeyxiexzf.f1186Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f333Ujhhgtgfeyxiexzf = 1;
        this.f337Ujhhgtgfeyxiexzf = false;
        this.f338Ujhhgtgfeyxiexzf = false;
        this.f339Ujhhgtgfeyxiexzf = false;
        this.f340Ujhhgtgfeyxiexzf = true;
        this.f341Ujhhgtgfeyxiexzf = -1;
        this.f342feyxiexzfUjhhgtg = Integer.MIN_VALUE;
        this.f343feyxiexzfUjhhgtg = null;
        this.f344feyxiexzfUjhhgtg = new C0085Ujhhgtgfeyxiexzf();
        this.f345feyxiexzfUjhhgtg = new C0088Ujhhgtgfeyxiexzf();
        this.f346feyxiexzfUjhhgtg = 2;
        this.f347feyxiexzfUjhhgtg = new int[2];
        C0823feyxiexzfUjhhgtg c0823feyxiexzfUjhhgtgM2197feyxiexzfUjhhgtg = AbstractC0822feyxiexzfUjhhgtg.m2197feyxiexzfUjhhgtg(context, attributeSet, i, i2);
        m191feyxiexzfUjhhgtg(c0823feyxiexzfUjhhgtgM2197feyxiexzfUjhhgtg.f3275Ujhhgtgfeyxiexzf);
        boolean z = c0823feyxiexzfUjhhgtgM2197feyxiexzfUjhhgtg.f3277Ujhhgtgfeyxiexzf;
        mo151Ujhhgtgfeyxiexzf(null);
        if (z != this.f337Ujhhgtgfeyxiexzf) {
            this.f337Ujhhgtgfeyxiexzf = z;
            m2216feyxiexzfUjhhgtg();
        }
        mo147Ujhhgtgfeyxiexzf(c0823feyxiexzfUjhhgtgM2197feyxiexzfUjhhgtg.f3278Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public void mo161Ujhhgtgfeyxiexzf(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱ */
    public void mo146feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C0085Ujhhgtgfeyxiexzf c0085Ujhhgtgfeyxiexzf, int i) {
    }
}
