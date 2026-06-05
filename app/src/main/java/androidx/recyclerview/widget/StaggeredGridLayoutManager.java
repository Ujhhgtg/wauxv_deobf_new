package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import p000.AbstractC0795feyxiexzfUjhhgtg;
import p000.AbstractC0822feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC2855feyxiexzfUjhhgtg;
import p000.AbstractC3387feyxiexzfUjhhgtg;
import p000.C0055Ujhhgtgfeyxiexzf;
import p000.C0069Ujhhgtgfeyxiexzf;
import p000.C0810feyxiexzfUjhhgtg;
import p000.C0823feyxiexzfUjhhgtg;
import p000.C0825feyxiexzfUjhhgtg;
import p000.C0831feyxiexzfUjhhgtg;
import p000.C1140feyxiexzfUjhhgtg;
import p000.C1141feyxiexzfUjhhgtg;
import p000.C1142feyxiexzfUjhhgtg;
import p000.C1143feyxiexzfUjhhgtg;
import p000.C2629Ujhhgtgfeyxiexzf;
import p000.C2962feyxiexzfUjhhgtg;
import p000.C2963feyxiexzfUjhhgtg;
import p000.C3434feyxiexzfUjhhgtg;
import p000.C3570Ujhhgtgfeyxiexzf;
import p000.InterfaceC0814feyxiexzfUjhhgtg;
import p000.RunnableC3012feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0822feyxiexzfUjhhgtg implements InterfaceC0814feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f433Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final C3434feyxiexzfUjhhgtg[] f434Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final AbstractC3387feyxiexzfUjhhgtg f435Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final AbstractC3387feyxiexzfUjhhgtg f436Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final int f437Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f438Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C0055Ujhhgtgfeyxiexzf f439Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f440Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final BitSet f442feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f445feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f446feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f447feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public boolean f448feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public C1142feyxiexzfUjhhgtg f449feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public int f450feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final Rect f451feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final C1141feyxiexzfUjhhgtg f452feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f453feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final boolean f454feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public int[] f455feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final RunnableC3012feyxiexzfUjhhgtg f456feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f441Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f443feyxiexzfUjhhgtg = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f444feyxiexzfUjhhgtg = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f433Ujhhgtgfeyxiexzf = -1;
        this.f440Ujhhgtgfeyxiexzf = false;
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(28, false);
        this.f445feyxiexzfUjhhgtg = c2629Ujhhgtgfeyxiexzf;
        this.f446feyxiexzfUjhhgtg = 2;
        this.f451feyxiexzfUjhhgtg = new Rect();
        this.f452feyxiexzfUjhhgtg = new C1141feyxiexzfUjhhgtg(this);
        this.f453feyxiexzfUjhhgtg = false;
        this.f454feyxiexzfUjhhgtg = true;
        this.f456feyxiexzfUjhhgtg = new RunnableC3012feyxiexzfUjhhgtg(15, this);
        C0823feyxiexzfUjhhgtg c0823feyxiexzfUjhhgtgM2197feyxiexzfUjhhgtg = AbstractC0822feyxiexzfUjhhgtg.m2197feyxiexzfUjhhgtg(context, attributeSet, i, i2);
        int i3 = c0823feyxiexzfUjhhgtgM2197feyxiexzfUjhhgtg.f3275Ujhhgtgfeyxiexzf;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo151Ujhhgtgfeyxiexzf(null);
        if (i3 != this.f437Ujhhgtgfeyxiexzf) {
            this.f437Ujhhgtgfeyxiexzf = i3;
            AbstractC3387feyxiexzfUjhhgtg abstractC3387feyxiexzfUjhhgtg = this.f435Ujhhgtgfeyxiexzf;
            this.f435Ujhhgtgfeyxiexzf = this.f436Ujhhgtgfeyxiexzf;
            this.f436Ujhhgtgfeyxiexzf = abstractC3387feyxiexzfUjhhgtg;
            m2216feyxiexzfUjhhgtg();
        }
        int i4 = c0823feyxiexzfUjhhgtgM2197feyxiexzfUjhhgtg.f3276Ujhhgtgfeyxiexzf;
        mo151Ujhhgtgfeyxiexzf(null);
        if (i4 != this.f433Ujhhgtgfeyxiexzf) {
            c2629Ujhhgtgfeyxiexzf.m3934Ujhhgtgfeyxiexzf();
            m2216feyxiexzfUjhhgtg();
            this.f433Ujhhgtgfeyxiexzf = i4;
            this.f442feyxiexzfUjhhgtg = new BitSet(this.f433Ujhhgtgfeyxiexzf);
            this.f434Ujhhgtgfeyxiexzf = new C3434feyxiexzfUjhhgtg[this.f433Ujhhgtgfeyxiexzf];
            for (int i5 = 0; i5 < this.f433Ujhhgtgfeyxiexzf; i5++) {
                this.f434Ujhhgtgfeyxiexzf[i5] = new C3434feyxiexzfUjhhgtg(this, i5);
            }
            m2216feyxiexzfUjhhgtg();
        }
        boolean z = c0823feyxiexzfUjhhgtgM2197feyxiexzfUjhhgtg.f3277Ujhhgtgfeyxiexzf;
        mo151Ujhhgtgfeyxiexzf(null);
        C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg = this.f449feyxiexzfUjhhgtg;
        if (c1142feyxiexzfUjhhgtg != null && c1142feyxiexzfUjhhgtg.f4323Ujhhgtgfeyxiexzf != z) {
            c1142feyxiexzfUjhhgtg.f4323Ujhhgtgfeyxiexzf = z;
        }
        this.f440Ujhhgtgfeyxiexzf = z;
        m2216feyxiexzfUjhhgtg();
        C0055Ujhhgtgfeyxiexzf c0055Ujhhgtgfeyxiexzf = new C0055Ujhhgtgfeyxiexzf();
        c0055Ujhhgtgfeyxiexzf.f1064Ujhhgtgfeyxiexzf = true;
        c0055Ujhhgtgfeyxiexzf.f1069Ujhhgtgfeyxiexzf = 0;
        c0055Ujhhgtgfeyxiexzf.f1070Ujhhgtgfeyxiexzf = 0;
        this.f439Ujhhgtgfeyxiexzf = c0055Ujhhgtgfeyxiexzf;
        this.f435Ujhhgtgfeyxiexzf = AbstractC3387feyxiexzfUjhhgtg.m4906Ujhhgtgfeyxiexzf(this, this.f437Ujhhgtgfeyxiexzf);
        this.f436Ujhhgtgfeyxiexzf = AbstractC3387feyxiexzfUjhhgtg.m4906Ujhhgtgfeyxiexzf(this, 1 - this.f437Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static int m262feyxiexzfUjhhgtg(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // p000.InterfaceC0814feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final PointF mo150Ujhhgtgfeyxiexzf(int i) {
        int i2 = -1;
        if (m2203Ujhhgtgfeyxiexzf() != 0) {
            if ((i < m274feyxiexzfUjhhgtg()) == this.f441Ujhhgtgfeyxiexzf) {
                i2 = 1;
            }
        } else if (this.f441Ujhhgtgfeyxiexzf) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f437Ujhhgtgfeyxiexzf == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo151Ujhhgtgfeyxiexzf(String str) {
        if (this.f449feyxiexzfUjhhgtg == null) {
            super.mo151Ujhhgtgfeyxiexzf(str);
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final boolean mo152Ujhhgtgfeyxiexzf() {
        return this.f437Ujhhgtgfeyxiexzf == 0;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final boolean mo153Ujhhgtgfeyxiexzf() {
        return this.f437Ujhhgtgfeyxiexzf == 1;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final boolean mo118Ujhhgtgfeyxiexzf(C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg) {
        return c0825feyxiexzfUjhhgtg instanceof C1140feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final void mo154Ujhhgtgfeyxiexzf(int i, int i2, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf) {
        C0055Ujhhgtgfeyxiexzf c0055Ujhhgtgfeyxiexzf;
        int iM4931Ujhhgtgfeyxiexzf;
        int iM4933Ujhhgtgfeyxiexzf;
        if (this.f437Ujhhgtgfeyxiexzf != 0) {
            i = i2;
        }
        if (m2203Ujhhgtgfeyxiexzf() == 0 || i == 0) {
            return;
        }
        m284feyxiexzfUjhhgtg(i, c0810feyxiexzfUjhhgtg);
        int[] iArr = this.f455feyxiexzfUjhhgtg;
        if (iArr == null || iArr.length < this.f433Ujhhgtgfeyxiexzf) {
            this.f455feyxiexzfUjhhgtg = new int[this.f433Ujhhgtgfeyxiexzf];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f433Ujhhgtgfeyxiexzf;
            c0055Ujhhgtgfeyxiexzf = this.f439Ujhhgtgfeyxiexzf;
            if (i3 >= i5) {
                break;
            }
            if (c0055Ujhhgtgfeyxiexzf.f1067Ujhhgtgfeyxiexzf == -1) {
                iM4931Ujhhgtgfeyxiexzf = c0055Ujhhgtgfeyxiexzf.f1069Ujhhgtgfeyxiexzf;
                iM4933Ujhhgtgfeyxiexzf = this.f434Ujhhgtgfeyxiexzf[i3].m4933Ujhhgtgfeyxiexzf(iM4931Ujhhgtgfeyxiexzf);
            } else {
                iM4931Ujhhgtgfeyxiexzf = this.f434Ujhhgtgfeyxiexzf[i3].m4931Ujhhgtgfeyxiexzf(c0055Ujhhgtgfeyxiexzf.f1070Ujhhgtgfeyxiexzf);
                iM4933Ujhhgtgfeyxiexzf = c0055Ujhhgtgfeyxiexzf.f1070Ujhhgtgfeyxiexzf;
            }
            int i6 = iM4931Ujhhgtgfeyxiexzf - iM4933Ujhhgtgfeyxiexzf;
            if (i6 >= 0) {
                this.f455feyxiexzfUjhhgtg[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f455feyxiexzfUjhhgtg, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c0055Ujhhgtgfeyxiexzf.f1066Ujhhgtgfeyxiexzf;
            if (i8 < 0 || i8 >= c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf()) {
                return;
            }
            c3570Ujhhgtgfeyxiexzf.m5105Ujhhgtgfeyxiexzf(c0055Ujhhgtgfeyxiexzf.f1066Ujhhgtgfeyxiexzf, this.f455feyxiexzfUjhhgtg[i7]);
            c0055Ujhhgtgfeyxiexzf.f1066Ujhhgtgfeyxiexzf += c0055Ujhhgtgfeyxiexzf.f1067Ujhhgtgfeyxiexzf;
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final int mo156Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (m2203Ujhhgtgfeyxiexzf() == 0) {
            return 0;
        }
        boolean z = !this.f454feyxiexzfUjhhgtg;
        return AbstractC2855feyxiexzfUjhhgtg.m4197Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg, this.f435Ujhhgtgfeyxiexzf, m271Ujhhgtgfeyxiexzf(z), m270feyxiexzfUjhhgtg(z), this, this.f454feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final int mo119Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m268feyxiexzfUjhhgtg(c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final int mo120Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (m2203Ujhhgtgfeyxiexzf() == 0) {
            return 0;
        }
        boolean z = !this.f454feyxiexzfUjhhgtg;
        return AbstractC2855feyxiexzfUjhhgtg.m4199Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg, this.f435Ujhhgtgfeyxiexzf, m271Ujhhgtgfeyxiexzf(z), m270feyxiexzfUjhhgtg(z), this, this.f454feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final int mo157Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (m2203Ujhhgtgfeyxiexzf() == 0) {
            return 0;
        }
        boolean z = !this.f454feyxiexzfUjhhgtg;
        return AbstractC2855feyxiexzfUjhhgtg.m4197Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg, this.f435Ujhhgtgfeyxiexzf, m271Ujhhgtgfeyxiexzf(z), m270feyxiexzfUjhhgtg(z), this, this.f454feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final int mo121Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m268feyxiexzfUjhhgtg(c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final int mo122Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (m2203Ujhhgtgfeyxiexzf() == 0) {
            return 0;
        }
        boolean z = !this.f454feyxiexzfUjhhgtg;
        return AbstractC2855feyxiexzfUjhhgtg.m4199Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg, this.f435Ujhhgtgfeyxiexzf, m271Ujhhgtgfeyxiexzf(z), m270feyxiexzfUjhhgtg(z), this, this.f454feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final C0825feyxiexzfUjhhgtg mo123Ujhhgtgfeyxiexzf() {
        return this.f437Ujhhgtgfeyxiexzf == 0 ? new C1140feyxiexzfUjhhgtg(-2, -1) : new C1140feyxiexzfUjhhgtg(-1, -2);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public final C0825feyxiexzfUjhhgtg mo124Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        return new C1140feyxiexzfUjhhgtg(context, attributeSet);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ */
    public final C0825feyxiexzfUjhhgtg mo125Ujhhgtgfeyxiexzf(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1140feyxiexzfUjhhgtg((ViewGroup.MarginLayoutParams) layoutParams) : new C1140feyxiexzfUjhhgtg(layoutParams);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ */
    public final int mo126Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (this.f437Ujhhgtgfeyxiexzf == 1) {
            return Math.min(this.f433Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf());
        }
        return -1;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ */
    public final int mo127feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (this.f437Ujhhgtgfeyxiexzf == 0) {
            return Math.min(this.f433Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf());
        }
        return -1;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ */
    public final boolean mo159feyxiexzfUjhhgtg() {
        return this.f446feyxiexzfUjhhgtg != 0;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ */
    public final boolean mo160feyxiexzfUjhhgtg() {
        return this.f440Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void mo263feyxiexzfUjhhgtg(int i) {
        super.mo263feyxiexzfUjhhgtg(i);
        for (int i2 = 0; i2 < this.f433Ujhhgtgfeyxiexzf; i2++) {
            C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg = this.f434Ujhhgtgfeyxiexzf[i2];
            int i3 = c3434feyxiexzfUjhhgtg.f10702Ujhhgtgfeyxiexzf;
            if (i3 != Integer.MIN_VALUE) {
                c3434feyxiexzfUjhhgtg.f10702Ujhhgtgfeyxiexzf = i3 + i;
            }
            int i4 = c3434feyxiexzfUjhhgtg.f10703Ujhhgtgfeyxiexzf;
            if (i4 != Integer.MIN_VALUE) {
                c3434feyxiexzfUjhhgtg.f10703Ujhhgtgfeyxiexzf = i4 + i;
            }
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void mo264feyxiexzfUjhhgtg(int i) {
        super.mo264feyxiexzfUjhhgtg(i);
        for (int i2 = 0; i2 < this.f433Ujhhgtgfeyxiexzf; i2++) {
            C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg = this.f434Ujhhgtgfeyxiexzf[i2];
            int i3 = c3434feyxiexzfUjhhgtg.f10702Ujhhgtgfeyxiexzf;
            if (i3 != Integer.MIN_VALUE) {
                c3434feyxiexzfUjhhgtg.f10702Ujhhgtgfeyxiexzf = i3 + i;
            }
            int i4 = c3434feyxiexzfUjhhgtg.f10703Ujhhgtgfeyxiexzf;
            if (i4 != Integer.MIN_VALUE) {
                c3434feyxiexzfUjhhgtg.f10703Ujhhgtgfeyxiexzf = i4 + i;
            }
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void mo265feyxiexzfUjhhgtg(AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg) {
        this.f445feyxiexzfUjhhgtg.m3934Ujhhgtgfeyxiexzf();
        for (int i = 0; i < this.f433Ujhhgtgfeyxiexzf; i++) {
            this.f434Ujhhgtgfeyxiexzf[i].m4926Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ */
    public final void mo161Ujhhgtgfeyxiexzf(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f456feyxiexzfUjhhgtg);
        }
        for (int i = 0; i < this.f433Ujhhgtgfeyxiexzf; i++) {
            this.f434Ujhhgtgfeyxiexzf[i].m4926Ujhhgtgfeyxiexzf();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048  */
    /* JADX WARN: Code duplicated, block: B:37:0x0053  */
    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ */
    public final View mo128Ujhhgtgfeyxiexzf(View view, int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        View viewM225feyxiexzfUjhhgtg;
        int i2;
        View viewM4932Ujhhgtgfeyxiexzf;
        if (m2203Ujhhgtgfeyxiexzf() != 0) {
            RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
            if (recyclerView == null || (viewM225feyxiexzfUjhhgtg = recyclerView.m225feyxiexzfUjhhgtg(view)) == null || ((ArrayList) this.f3260Ujhhgtgfeyxiexzf.f8836Ujhhgtgfeyxiexzf).contains(viewM225feyxiexzfUjhhgtg)) {
                viewM225feyxiexzfUjhhgtg = null;
            }
            if (viewM225feyxiexzfUjhhgtg != null) {
                m288feyxiexzfUjhhgtg();
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? this.f437Ujhhgtgfeyxiexzf == 0 : !(i != 130 || this.f437Ujhhgtgfeyxiexzf != 1)) {
                                    i2 = 1;
                                }
                            } else if (this.f437Ujhhgtgfeyxiexzf == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (this.f437Ujhhgtgfeyxiexzf == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (this.f437Ujhhgtgfeyxiexzf != 1 && m280Ujhhgtgfeyxiexzf()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (this.f437Ujhhgtgfeyxiexzf != 1 && m280Ujhhgtgfeyxiexzf()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) viewM225feyxiexzfUjhhgtg.getLayoutParams();
                    boolean z = c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf;
                    C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg = c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf;
                    int iM275Ujhhgtgfeyxiexzf = i2 == 1 ? m275Ujhhgtgfeyxiexzf() : m274feyxiexzfUjhhgtg();
                    m292feyxiexzfUjhhgtg(iM275Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg);
                    m290Ujhhgtgfeyxiexzf(i2);
                    C0055Ujhhgtgfeyxiexzf c0055Ujhhgtgfeyxiexzf = this.f439Ujhhgtgfeyxiexzf;
                    c0055Ujhhgtgfeyxiexzf.f1066Ujhhgtgfeyxiexzf = c0055Ujhhgtgfeyxiexzf.f1067Ujhhgtgfeyxiexzf + iM275Ujhhgtgfeyxiexzf;
                    c0055Ujhhgtgfeyxiexzf.f1065Ujhhgtgfeyxiexzf = (int) (this.f435Ujhhgtgfeyxiexzf.mo2984Ujhhgtgfeyxiexzf() * 0.33333334f);
                    c0055Ujhhgtgfeyxiexzf.f1071Ujhhgtgfeyxiexzf = true;
                    c0055Ujhhgtgfeyxiexzf.f1064Ujhhgtgfeyxiexzf = false;
                    m269Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0055Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg);
                    this.f447feyxiexzfUjhhgtg = this.f441Ujhhgtgfeyxiexzf;
                    if (!z && (viewM4932Ujhhgtgfeyxiexzf = c3434feyxiexzfUjhhgtg.m4932Ujhhgtgfeyxiexzf(iM275Ujhhgtgfeyxiexzf, i2)) != null && viewM4932Ujhhgtgfeyxiexzf != viewM225feyxiexzfUjhhgtg) {
                        return viewM4932Ujhhgtgfeyxiexzf;
                    }
                    if (m283feyxiexzfUjhhgtg(i2)) {
                        for (int i3 = this.f433Ujhhgtgfeyxiexzf - 1; i3 >= 0; i3--) {
                            View viewM4932Ujhhgtgfeyxiexzf2 = this.f434Ujhhgtgfeyxiexzf[i3].m4932Ujhhgtgfeyxiexzf(iM275Ujhhgtgfeyxiexzf, i2);
                            if (viewM4932Ujhhgtgfeyxiexzf2 != null && viewM4932Ujhhgtgfeyxiexzf2 != viewM225feyxiexzfUjhhgtg) {
                                return viewM4932Ujhhgtgfeyxiexzf2;
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < this.f433Ujhhgtgfeyxiexzf; i4++) {
                            View viewM4932Ujhhgtgfeyxiexzf3 = this.f434Ujhhgtgfeyxiexzf[i4].m4932Ujhhgtgfeyxiexzf(iM275Ujhhgtgfeyxiexzf, i2);
                            if (viewM4932Ujhhgtgfeyxiexzf3 != null && viewM4932Ujhhgtgfeyxiexzf3 != viewM225feyxiexzfUjhhgtg) {
                                return viewM4932Ujhhgtgfeyxiexzf3;
                            }
                        }
                    }
                    boolean z2 = (this.f440Ujhhgtgfeyxiexzf ^ true) == (i2 == -1);
                    if (!z) {
                        View viewMo158Ujhhgtgfeyxiexzf = mo158Ujhhgtgfeyxiexzf(z2 ? c3434feyxiexzfUjhhgtg.m4927Ujhhgtgfeyxiexzf() : c3434feyxiexzfUjhhgtg.m4928Ujhhgtgfeyxiexzf());
                        if (viewMo158Ujhhgtgfeyxiexzf != null && viewMo158Ujhhgtgfeyxiexzf != viewM225feyxiexzfUjhhgtg) {
                            return viewMo158Ujhhgtgfeyxiexzf;
                        }
                    }
                    if (m283feyxiexzfUjhhgtg(i2)) {
                        for (int i5 = this.f433Ujhhgtgfeyxiexzf - 1; i5 >= 0; i5--) {
                            if (i5 != c3434feyxiexzfUjhhgtg.f10705Ujhhgtgfeyxiexzf) {
                                View viewMo158Ujhhgtgfeyxiexzf2 = mo158Ujhhgtgfeyxiexzf(z2 ? this.f434Ujhhgtgfeyxiexzf[i5].m4927Ujhhgtgfeyxiexzf() : this.f434Ujhhgtgfeyxiexzf[i5].m4928Ujhhgtgfeyxiexzf());
                                if (viewMo158Ujhhgtgfeyxiexzf2 != null && viewMo158Ujhhgtgfeyxiexzf2 != viewM225feyxiexzfUjhhgtg) {
                                    return viewMo158Ujhhgtgfeyxiexzf2;
                                }
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < this.f433Ujhhgtgfeyxiexzf; i6++) {
                            View viewMo158Ujhhgtgfeyxiexzf3 = mo158Ujhhgtgfeyxiexzf(z2 ? this.f434Ujhhgtgfeyxiexzf[i6].m4927Ujhhgtgfeyxiexzf() : this.f434Ujhhgtgfeyxiexzf[i6].m4928Ujhhgtgfeyxiexzf());
                            if (viewMo158Ujhhgtgfeyxiexzf3 != null && viewMo158Ujhhgtgfeyxiexzf3 != viewM225feyxiexzfUjhhgtg) {
                                return viewMo158Ujhhgtgfeyxiexzf3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ */
    public final void mo162Ujhhgtgfeyxiexzf(AccessibilityEvent accessibilityEvent) {
        super.mo162Ujhhgtgfeyxiexzf(accessibilityEvent);
        if (m2203Ujhhgtgfeyxiexzf() > 0) {
            View viewM271Ujhhgtgfeyxiexzf = m271Ujhhgtgfeyxiexzf(false);
            View viewM270feyxiexzfUjhhgtg = m270feyxiexzfUjhhgtg(false);
            if (viewM271Ujhhgtgfeyxiexzf == null || viewM270feyxiexzfUjhhgtg == null) {
                return;
            }
            int iM2196feyxiexzfUjhhgtg = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewM271Ujhhgtgfeyxiexzf);
            int iM2196feyxiexzfUjhhgtg2 = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewM270feyxiexzfUjhhgtg);
            if (iM2196feyxiexzfUjhhgtg < iM2196feyxiexzfUjhhgtg2) {
                accessibilityEvent.setFromIndex(iM2196feyxiexzfUjhhgtg);
                accessibilityEvent.setToIndex(iM2196feyxiexzfUjhhgtg2);
            } else {
                accessibilityEvent.setFromIndex(iM2196feyxiexzfUjhhgtg2);
                accessibilityEvent.setToIndex(iM2196feyxiexzfUjhhgtg);
            }
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ */
    public final void mo129Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        super.mo129Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, c2963feyxiexzfUjhhgtg);
        c2963feyxiexzfUjhhgtg.m4439Ujhhgtgfeyxiexzf("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ */
    public final void mo130Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, View view, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1140feyxiexzfUjhhgtg)) {
            m2210Ujhhgtgfeyxiexzf(view, c2963feyxiexzfUjhhgtg);
            return;
        }
        C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) layoutParams;
        if (this.f437Ujhhgtgfeyxiexzf == 0) {
            C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg = c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf;
            c2963feyxiexzfUjhhgtg.m4440Ujhhgtgfeyxiexzf(C2962feyxiexzfUjhhgtg.m4429Ujhhgtgfeyxiexzf(c3434feyxiexzfUjhhgtg == null ? -1 : c3434feyxiexzfUjhhgtg.f10705Ujhhgtgfeyxiexzf, c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf ? this.f433Ujhhgtgfeyxiexzf : 1, -1, -1, false));
        } else {
            C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg2 = c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf;
            c2963feyxiexzfUjhhgtg.m4440Ujhhgtgfeyxiexzf(C2962feyxiexzfUjhhgtg.m4429Ujhhgtgfeyxiexzf(-1, -1, c3434feyxiexzfUjhhgtg2 == null ? -1 : c3434feyxiexzfUjhhgtg2.f10705Ujhhgtgfeyxiexzf, c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf ? this.f433Ujhhgtgfeyxiexzf : 1, false));
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ */
    public final void mo131feyxiexzfUjhhgtg(int i, int i2) {
        m278Ujhhgtgfeyxiexzf(i, i2, 1);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ */
    public final void mo132feyxiexzfUjhhgtg() {
        this.f445feyxiexzfUjhhgtg.m3934Ujhhgtgfeyxiexzf();
        m2216feyxiexzfUjhhgtg();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ */
    public final void mo133feyxiexzfUjhhgtg(int i, int i2) {
        m278Ujhhgtgfeyxiexzf(i, i2, 8);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ */
    public final void mo134feyxiexzfUjhhgtg(int i, int i2) {
        m278Ujhhgtgfeyxiexzf(i, i2, 2);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ */
    public final void mo135feyxiexzfUjhhgtg(int i, int i2) {
        m278Ujhhgtgfeyxiexzf(i, i2, 4);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ */
    public final void mo136feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        m282Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, true);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ */
    public final void mo137Ujhhgtgfeyxiexzf(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        this.f443feyxiexzfUjhhgtg = -1;
        this.f444feyxiexzfUjhhgtg = Integer.MIN_VALUE;
        this.f449feyxiexzfUjhhgtg = null;
        this.f452feyxiexzfUjhhgtg.m2607Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ */
    public final void mo163Ujhhgtgfeyxiexzf(Parcelable parcelable) {
        if (parcelable instanceof C1142feyxiexzfUjhhgtg) {
            C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg = (C1142feyxiexzfUjhhgtg) parcelable;
            this.f449feyxiexzfUjhhgtg = c1142feyxiexzfUjhhgtg;
            if (this.f443feyxiexzfUjhhgtg != -1) {
                c1142feyxiexzfUjhhgtg.f4316Ujhhgtgfeyxiexzf = -1;
                c1142feyxiexzfUjhhgtg.f4317Ujhhgtgfeyxiexzf = -1;
                c1142feyxiexzfUjhhgtg.f4319Ujhhgtgfeyxiexzf = null;
                c1142feyxiexzfUjhhgtg.f4318Ujhhgtgfeyxiexzf = 0;
                c1142feyxiexzfUjhhgtg.f4320Ujhhgtgfeyxiexzf = 0;
                c1142feyxiexzfUjhhgtg.f4321Ujhhgtgfeyxiexzf = null;
                c1142feyxiexzfUjhhgtg.f4322Ujhhgtgfeyxiexzf = null;
            }
            m2216feyxiexzfUjhhgtg();
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ */
    public final Parcelable mo164feyxiexzfUjhhgtg() {
        int iM4933Ujhhgtgfeyxiexzf;
        int iMo2983Ujhhgtgfeyxiexzf;
        int[] iArr;
        C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg = this.f449feyxiexzfUjhhgtg;
        if (c1142feyxiexzfUjhhgtg != null) {
            C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg2 = new C1142feyxiexzfUjhhgtg();
            c1142feyxiexzfUjhhgtg2.f4318Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg.f4318Ujhhgtgfeyxiexzf;
            c1142feyxiexzfUjhhgtg2.f4316Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg.f4316Ujhhgtgfeyxiexzf;
            c1142feyxiexzfUjhhgtg2.f4317Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg.f4317Ujhhgtgfeyxiexzf;
            c1142feyxiexzfUjhhgtg2.f4319Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg.f4319Ujhhgtgfeyxiexzf;
            c1142feyxiexzfUjhhgtg2.f4320Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg.f4320Ujhhgtgfeyxiexzf;
            c1142feyxiexzfUjhhgtg2.f4321Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg.f4321Ujhhgtgfeyxiexzf;
            c1142feyxiexzfUjhhgtg2.f4323Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg.f4323Ujhhgtgfeyxiexzf;
            c1142feyxiexzfUjhhgtg2.f4324Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg.f4324Ujhhgtgfeyxiexzf;
            c1142feyxiexzfUjhhgtg2.f4325Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg.f4325Ujhhgtgfeyxiexzf;
            c1142feyxiexzfUjhhgtg2.f4322Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg.f4322Ujhhgtgfeyxiexzf;
            return c1142feyxiexzfUjhhgtg2;
        }
        C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg3 = new C1142feyxiexzfUjhhgtg();
        c1142feyxiexzfUjhhgtg3.f4323Ujhhgtgfeyxiexzf = this.f440Ujhhgtgfeyxiexzf;
        c1142feyxiexzfUjhhgtg3.f4324Ujhhgtgfeyxiexzf = this.f447feyxiexzfUjhhgtg;
        c1142feyxiexzfUjhhgtg3.f4325Ujhhgtgfeyxiexzf = this.f448feyxiexzfUjhhgtg;
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = this.f445feyxiexzfUjhhgtg;
        if (c2629Ujhhgtgfeyxiexzf == null || (iArr = (int[]) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf) == null) {
            c1142feyxiexzfUjhhgtg3.f4320Ujhhgtgfeyxiexzf = 0;
        } else {
            c1142feyxiexzfUjhhgtg3.f4321Ujhhgtgfeyxiexzf = iArr;
            c1142feyxiexzfUjhhgtg3.f4320Ujhhgtgfeyxiexzf = iArr.length;
            c1142feyxiexzfUjhhgtg3.f4322Ujhhgtgfeyxiexzf = (ArrayList) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf;
        }
        if (m2203Ujhhgtgfeyxiexzf() <= 0) {
            c1142feyxiexzfUjhhgtg3.f4316Ujhhgtgfeyxiexzf = -1;
            c1142feyxiexzfUjhhgtg3.f4317Ujhhgtgfeyxiexzf = -1;
            c1142feyxiexzfUjhhgtg3.f4318Ujhhgtgfeyxiexzf = 0;
            return c1142feyxiexzfUjhhgtg3;
        }
        c1142feyxiexzfUjhhgtg3.f4316Ujhhgtgfeyxiexzf = this.f447feyxiexzfUjhhgtg ? m275Ujhhgtgfeyxiexzf() : m274feyxiexzfUjhhgtg();
        View viewM270feyxiexzfUjhhgtg = this.f441Ujhhgtgfeyxiexzf ? m270feyxiexzfUjhhgtg(true) : m271Ujhhgtgfeyxiexzf(true);
        c1142feyxiexzfUjhhgtg3.f4317Ujhhgtgfeyxiexzf = viewM270feyxiexzfUjhhgtg != null ? AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(viewM270feyxiexzfUjhhgtg) : -1;
        int i = this.f433Ujhhgtgfeyxiexzf;
        c1142feyxiexzfUjhhgtg3.f4318Ujhhgtgfeyxiexzf = i;
        c1142feyxiexzfUjhhgtg3.f4319Ujhhgtgfeyxiexzf = new int[i];
        for (int i2 = 0; i2 < this.f433Ujhhgtgfeyxiexzf; i2++) {
            if (this.f447feyxiexzfUjhhgtg) {
                iM4933Ujhhgtgfeyxiexzf = this.f434Ujhhgtgfeyxiexzf[i2].m4931Ujhhgtgfeyxiexzf(Integer.MIN_VALUE);
                if (iM4933Ujhhgtgfeyxiexzf != Integer.MIN_VALUE) {
                    iMo2983Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
                    iM4933Ujhhgtgfeyxiexzf -= iMo2983Ujhhgtgfeyxiexzf;
                }
            } else {
                iM4933Ujhhgtgfeyxiexzf = this.f434Ujhhgtgfeyxiexzf[i2].m4933Ujhhgtgfeyxiexzf(Integer.MIN_VALUE);
                if (iM4933Ujhhgtgfeyxiexzf != Integer.MIN_VALUE) {
                    iMo2983Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                    iM4933Ujhhgtgfeyxiexzf -= iMo2983Ujhhgtgfeyxiexzf;
                }
            }
            c1142feyxiexzfUjhhgtg3.f4319Ujhhgtgfeyxiexzf[i2] = iM4933Ujhhgtgfeyxiexzf;
        }
        return c1142feyxiexzfUjhhgtg3;
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void mo266feyxiexzfUjhhgtg(int i) {
        if (i == 0) {
            m267feyxiexzfUjhhgtg();
        }
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ */
    public final int mo139Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m289Ujhhgtgfeyxiexzf(i, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲ */
    public final void mo165Ujhhgtgfeyxiexzf(int i) {
        C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg = this.f449feyxiexzfUjhhgtg;
        if (c1142feyxiexzfUjhhgtg != null && c1142feyxiexzfUjhhgtg.f4316Ujhhgtgfeyxiexzf != i) {
            c1142feyxiexzfUjhhgtg.f4319Ujhhgtgfeyxiexzf = null;
            c1142feyxiexzfUjhhgtg.f4318Ujhhgtgfeyxiexzf = 0;
            c1142feyxiexzfUjhhgtg.f4316Ujhhgtgfeyxiexzf = -1;
            c1142feyxiexzfUjhhgtg.f4317Ujhhgtgfeyxiexzf = -1;
        }
        this.f443feyxiexzfUjhhgtg = i;
        this.f444feyxiexzfUjhhgtg = Integer.MIN_VALUE;
        m2216feyxiexzfUjhhgtg();
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ */
    public final int mo140Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        return m289Ujhhgtgfeyxiexzf(i, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ */
    public final void mo141Ujhhgtgfeyxiexzf(Rect rect, int i, int i2) {
        int iM2188Ujhhgtgfeyxiexzf;
        int iM2188Ujhhgtgfeyxiexzf2;
        int iM2207feyxiexzfUjhhgtg = m2207feyxiexzfUjhhgtg() + m2206feyxiexzfUjhhgtg();
        int iM2205feyxiexzfUjhhgtg = m2205feyxiexzfUjhhgtg() + m2208feyxiexzfUjhhgtg();
        int i3 = this.f437Ujhhgtgfeyxiexzf;
        int i4 = this.f433Ujhhgtgfeyxiexzf;
        if (i3 == 1) {
            int iHeight = rect.height() + iM2205feyxiexzfUjhhgtg;
            RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            iM2188Ujhhgtgfeyxiexzf2 = AbstractC0822feyxiexzfUjhhgtg.m2188Ujhhgtgfeyxiexzf(i2, iHeight, recyclerView.getMinimumHeight());
            iM2188Ujhhgtgfeyxiexzf = AbstractC0822feyxiexzfUjhhgtg.m2188Ujhhgtgfeyxiexzf(i, (this.f438Ujhhgtgfeyxiexzf * i4) + iM2207feyxiexzfUjhhgtg, this.f3261Ujhhgtgfeyxiexzf.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM2207feyxiexzfUjhhgtg;
            RecyclerView recyclerView2 = this.f3261Ujhhgtgfeyxiexzf;
            Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            iM2188Ujhhgtgfeyxiexzf = AbstractC0822feyxiexzfUjhhgtg.m2188Ujhhgtgfeyxiexzf(i, iWidth, recyclerView2.getMinimumWidth());
            iM2188Ujhhgtgfeyxiexzf2 = AbstractC0822feyxiexzfUjhhgtg.m2188Ujhhgtgfeyxiexzf(i2, (this.f438Ujhhgtgfeyxiexzf * i4) + iM2205feyxiexzfUjhhgtg, this.f3261Ujhhgtgfeyxiexzf.getMinimumHeight());
        }
        this.f3261Ujhhgtgfeyxiexzf.setMeasuredDimension(iM2188Ujhhgtgfeyxiexzf, iM2188Ujhhgtgfeyxiexzf2);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ */
    public final void mo167feyxiexzfUjhhgtg(RecyclerView recyclerView, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, int i) {
        C0069Ujhhgtgfeyxiexzf c0069Ujhhgtgfeyxiexzf = new C0069Ujhhgtgfeyxiexzf(recyclerView.getContext());
        c0069Ujhhgtgfeyxiexzf.f1088Ujhhgtgfeyxiexzf = i;
        m2223Ujhhgtgfeyxiexzf(c0069Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0822feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ */
    public final boolean mo142Ujhhgtgfeyxiexzf() {
        return this.f449feyxiexzfUjhhgtg == null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final boolean m267feyxiexzfUjhhgtg() {
        int iM274feyxiexzfUjhhgtg;
        int iM275Ujhhgtgfeyxiexzf;
        if (m2203Ujhhgtgfeyxiexzf() != 0 && this.f446feyxiexzfUjhhgtg != 0 && this.f3266Ujhhgtgfeyxiexzf) {
            if (this.f441Ujhhgtgfeyxiexzf) {
                iM274feyxiexzfUjhhgtg = m275Ujhhgtgfeyxiexzf();
                iM275Ujhhgtgfeyxiexzf = m274feyxiexzfUjhhgtg();
            } else {
                iM274feyxiexzfUjhhgtg = m274feyxiexzfUjhhgtg();
                iM275Ujhhgtgfeyxiexzf = m275Ujhhgtgfeyxiexzf();
            }
            C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = this.f445feyxiexzfUjhhgtg;
            if (iM274feyxiexzfUjhhgtg == 0 && m279Ujhhgtgfeyxiexzf() != null) {
                c2629Ujhhgtgfeyxiexzf.m3934Ujhhgtgfeyxiexzf();
                this.f3265Ujhhgtgfeyxiexzf = true;
                m2216feyxiexzfUjhhgtg();
                return true;
            }
            if (this.f453feyxiexzfUjhhgtg) {
                int i = this.f441Ujhhgtgfeyxiexzf ? -1 : 1;
                int i2 = iM275Ujhhgtgfeyxiexzf + 1;
                C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtgM3938Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf.m3938Ujhhgtgfeyxiexzf(iM274feyxiexzfUjhhgtg, i2, i);
                if (c1143feyxiexzfUjhhgtgM3938Ujhhgtgfeyxiexzf == null) {
                    this.f453feyxiexzfUjhhgtg = false;
                    c2629Ujhhgtgfeyxiexzf.m3936Ujhhgtgfeyxiexzf(i2);
                    return false;
                }
                C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtgM3938Ujhhgtgfeyxiexzf2 = c2629Ujhhgtgfeyxiexzf.m3938Ujhhgtgfeyxiexzf(iM274feyxiexzfUjhhgtg, c1143feyxiexzfUjhhgtgM3938Ujhhgtgfeyxiexzf.f4326Ujhhgtgfeyxiexzf, i * (-1));
                if (c1143feyxiexzfUjhhgtgM3938Ujhhgtgfeyxiexzf2 == null) {
                    c2629Ujhhgtgfeyxiexzf.m3936Ujhhgtgfeyxiexzf(c1143feyxiexzfUjhhgtgM3938Ujhhgtgfeyxiexzf.f4326Ujhhgtgfeyxiexzf);
                } else {
                    c2629Ujhhgtgfeyxiexzf.m3936Ujhhgtgfeyxiexzf(c1143feyxiexzfUjhhgtgM3938Ujhhgtgfeyxiexzf2.f4326Ujhhgtgfeyxiexzf + 1);
                }
                this.f3265Ujhhgtgfeyxiexzf = true;
                m2216feyxiexzfUjhhgtg();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int m268feyxiexzfUjhhgtg(C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (m2203Ujhhgtgfeyxiexzf() == 0) {
            return 0;
        }
        boolean z = !this.f454feyxiexzfUjhhgtg;
        return AbstractC2855feyxiexzfUjhhgtg.m4198Ujhhgtgfeyxiexzf(c0810feyxiexzfUjhhgtg, this.f435Ujhhgtgfeyxiexzf, m271Ujhhgtgfeyxiexzf(z), m270feyxiexzfUjhhgtg(z), this, this.f454feyxiexzfUjhhgtg, this.f441Ujhhgtgfeyxiexzf);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a9 A[LOOP:2: B:141:0x02a7->B:142:0x02a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c5 A[LOOP:3: B:147:0x02c3->B:148:0x02c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:159:0x0303  */
    /* JADX WARN: Code duplicated, block: B:161:0x0307  */
    /* JADX WARN: Code duplicated, block: B:162:0x030f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0327  */
    /* JADX WARN: Code duplicated, block: B:167:0x032b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0332  */
    /* JADX WARN: Code duplicated, block: B:172:0x033a  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m269Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0055Ujhhgtgfeyxiexzf c0055Ujhhgtgfeyxiexzf, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg;
        int i;
        int iM277Ujhhgtgfeyxiexzf;
        int iMo2975Ujhhgtgfeyxiexzf;
        int i2;
        int i3;
        int iMo2983Ujhhgtgfeyxiexzf;
        int iMo2975Ujhhgtgfeyxiexzf2;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg2 = c0831feyxiexzfUjhhgtg;
        int i8 = 0;
        int i9 = 1;
        this.f442feyxiexzfUjhhgtg.set(0, this.f433Ujhhgtgfeyxiexzf, true);
        C0055Ujhhgtgfeyxiexzf c0055Ujhhgtgfeyxiexzf2 = this.f439Ujhhgtgfeyxiexzf;
        int i10 = c0055Ujhhgtgfeyxiexzf2.f1072Ujhhgtgfeyxiexzf ? c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf == 1 ? c0055Ujhhgtgfeyxiexzf.f1070Ujhhgtgfeyxiexzf + c0055Ujhhgtgfeyxiexzf.f1065Ujhhgtgfeyxiexzf : c0055Ujhhgtgfeyxiexzf.f1069Ujhhgtgfeyxiexzf - c0055Ujhhgtgfeyxiexzf.f1065Ujhhgtgfeyxiexzf;
        m291feyxiexzfUjhhgtg(c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf, i10);
        int iMo2979Ujhhgtgfeyxiexzf = this.f441Ujhhgtgfeyxiexzf ? this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() : this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
        boolean z2 = false;
        while (true) {
            int i11 = c0055Ujhhgtgfeyxiexzf.f1066Ujhhgtgfeyxiexzf;
            if (i11 < 0 || i11 >= c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() || (!c0055Ujhhgtgfeyxiexzf2.f1072Ujhhgtgfeyxiexzf && this.f442feyxiexzfUjhhgtg.isEmpty())) {
                break;
            }
            View view = c0831feyxiexzfUjhhgtg2.m2239Ujhhgtgfeyxiexzf(c0055Ujhhgtgfeyxiexzf.f1066Ujhhgtgfeyxiexzf, Long.MAX_VALUE).f3241Ujhhgtgfeyxiexzf;
            c0055Ujhhgtgfeyxiexzf.f1066Ujhhgtgfeyxiexzf += c0055Ujhhgtgfeyxiexzf.f1067Ujhhgtgfeyxiexzf;
            C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) view.getLayoutParams();
            int iM2173Ujhhgtgfeyxiexzf = c1140feyxiexzfUjhhgtg.f3279Ujhhgtgfeyxiexzf.m2173Ujhhgtgfeyxiexzf();
            C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = this.f445feyxiexzfUjhhgtg;
            int[] iArr = (int[]) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf;
            int i12 = (iArr == null || iM2173Ujhhgtgfeyxiexzf >= iArr.length) ? -1 : iArr[iM2173Ujhhgtgfeyxiexzf];
            int i13 = i12 == -1 ? i9 : i8;
            if (i13 != 0) {
                if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                    c3434feyxiexzfUjhhgtg = this.f434Ujhhgtgfeyxiexzf[i8];
                } else {
                    if (m283feyxiexzfUjhhgtg(c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf)) {
                        i7 = this.f433Ujhhgtgfeyxiexzf - i9;
                        i6 = -1;
                        i5 = -1;
                    } else {
                        i5 = i9;
                        i6 = this.f433Ujhhgtgfeyxiexzf;
                        i7 = i8;
                    }
                    C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg2 = null;
                    if (c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf == i9) {
                        int iMo2983Ujhhgtgfeyxiexzf2 = this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                        int i14 = Integer.MAX_VALUE;
                        while (i7 != i6) {
                            C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg3 = this.f434Ujhhgtgfeyxiexzf[i7];
                            int i15 = i7;
                            int iM4931Ujhhgtgfeyxiexzf = c3434feyxiexzfUjhhgtg3.m4931Ujhhgtgfeyxiexzf(iMo2983Ujhhgtgfeyxiexzf2);
                            if (iM4931Ujhhgtgfeyxiexzf < i14) {
                                c3434feyxiexzfUjhhgtg2 = c3434feyxiexzfUjhhgtg3;
                                i14 = iM4931Ujhhgtgfeyxiexzf;
                            }
                            i7 = i15 + i5;
                        }
                    } else {
                        int iMo2979Ujhhgtgfeyxiexzf2 = this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
                        int i16 = Integer.MIN_VALUE;
                        while (i7 != i6) {
                            C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg4 = this.f434Ujhhgtgfeyxiexzf[i7];
                            int i17 = i7;
                            int iM4933Ujhhgtgfeyxiexzf = c3434feyxiexzfUjhhgtg4.m4933Ujhhgtgfeyxiexzf(iMo2979Ujhhgtgfeyxiexzf2);
                            if (iM4933Ujhhgtgfeyxiexzf > i16) {
                                i16 = iM4933Ujhhgtgfeyxiexzf;
                                c3434feyxiexzfUjhhgtg2 = c3434feyxiexzfUjhhgtg4;
                            }
                            i7 = i17 + i5;
                        }
                    }
                    c3434feyxiexzfUjhhgtg = c3434feyxiexzfUjhhgtg2;
                }
                c2629Ujhhgtgfeyxiexzf.m3935Ujhhgtgfeyxiexzf(iM2173Ujhhgtgfeyxiexzf);
                ((int[]) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf)[iM2173Ujhhgtgfeyxiexzf] = c3434feyxiexzfUjhhgtg.f10705Ujhhgtgfeyxiexzf;
            } else {
                c3434feyxiexzfUjhhgtg = this.f434Ujhhgtgfeyxiexzf[i12];
            }
            c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf = c3434feyxiexzfUjhhgtg;
            if (c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf == 1) {
                m2200Ujhhgtgfeyxiexzf(view, -1, false);
            } else {
                m2200Ujhhgtgfeyxiexzf(view, 0, false);
            }
            if (!c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                i = i13;
                if (this.f437Ujhhgtgfeyxiexzf == 1) {
                    m281Ujhhgtgfeyxiexzf(view, AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(this.f438Ujhhgtgfeyxiexzf, this.f3271Ujhhgtgfeyxiexzf, 0, ((ViewGroup.MarginLayoutParams) c1140feyxiexzfUjhhgtg).width, false), AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(this.f3274Ujhhgtgfeyxiexzf, this.f3272Ujhhgtgfeyxiexzf, m2205feyxiexzfUjhhgtg() + m2208feyxiexzfUjhhgtg(), ((ViewGroup.MarginLayoutParams) c1140feyxiexzfUjhhgtg).height, true));
                } else {
                    m281Ujhhgtgfeyxiexzf(view, AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(this.f3273Ujhhgtgfeyxiexzf, this.f3271Ujhhgtgfeyxiexzf, m2207feyxiexzfUjhhgtg() + m2206feyxiexzfUjhhgtg(), ((ViewGroup.MarginLayoutParams) c1140feyxiexzfUjhhgtg).width, true), AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(this.f438Ujhhgtgfeyxiexzf, this.f3272Ujhhgtgfeyxiexzf, 0, ((ViewGroup.MarginLayoutParams) c1140feyxiexzfUjhhgtg).height, false));
                }
            } else if (this.f437Ujhhgtgfeyxiexzf == 1) {
                i = i13;
                m281Ujhhgtgfeyxiexzf(view, this.f450feyxiexzfUjhhgtg, AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(this.f3274Ujhhgtgfeyxiexzf, this.f3272Ujhhgtgfeyxiexzf, m2205feyxiexzfUjhhgtg() + m2208feyxiexzfUjhhgtg(), ((ViewGroup.MarginLayoutParams) c1140feyxiexzfUjhhgtg).height, true));
            } else {
                i = i13;
                m281Ujhhgtgfeyxiexzf(view, AbstractC0822feyxiexzfUjhhgtg.m2189Ujhhgtgfeyxiexzf(this.f3273Ujhhgtgfeyxiexzf, this.f3271Ujhhgtgfeyxiexzf, m2207feyxiexzfUjhhgtg() + m2206feyxiexzfUjhhgtg(), ((ViewGroup.MarginLayoutParams) c1140feyxiexzfUjhhgtg).width, true), this.f450feyxiexzfUjhhgtg);
            }
            if (c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf == 1) {
                iMo2975Ujhhgtgfeyxiexzf = c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf ? m276feyxiexzfUjhhgtg(iMo2979Ujhhgtgfeyxiexzf) : c3434feyxiexzfUjhhgtg.m4931Ujhhgtgfeyxiexzf(iMo2979Ujhhgtgfeyxiexzf);
                iM277Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view) + iMo2975Ujhhgtgfeyxiexzf;
                if (i != 0 && c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                    C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtg = new C1143feyxiexzfUjhhgtg();
                    c1143feyxiexzfUjhhgtg.f4328Ujhhgtgfeyxiexzf = new int[this.f433Ujhhgtgfeyxiexzf];
                    for (int i18 = 0; i18 < this.f433Ujhhgtgfeyxiexzf; i18++) {
                        c1143feyxiexzfUjhhgtg.f4328Ujhhgtgfeyxiexzf[i18] = iMo2975Ujhhgtgfeyxiexzf - this.f434Ujhhgtgfeyxiexzf[i18].m4931Ujhhgtgfeyxiexzf(iMo2975Ujhhgtgfeyxiexzf);
                    }
                    c1143feyxiexzfUjhhgtg.f4327Ujhhgtgfeyxiexzf = -1;
                    c1143feyxiexzfUjhhgtg.f4326Ujhhgtgfeyxiexzf = iM2173Ujhhgtgfeyxiexzf;
                    c2629Ujhhgtgfeyxiexzf.m3933Ujhhgtgfeyxiexzf(c1143feyxiexzfUjhhgtg);
                }
            } else {
                iM277Ujhhgtgfeyxiexzf = c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf ? m277Ujhhgtgfeyxiexzf(iMo2979Ujhhgtgfeyxiexzf) : c3434feyxiexzfUjhhgtg.m4933Ujhhgtgfeyxiexzf(iMo2979Ujhhgtgfeyxiexzf);
                iMo2975Ujhhgtgfeyxiexzf = iM277Ujhhgtgfeyxiexzf - this.f435Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view);
                if (i != 0 && c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                    C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtg2 = new C1143feyxiexzfUjhhgtg();
                    c1143feyxiexzfUjhhgtg2.f4328Ujhhgtgfeyxiexzf = new int[this.f433Ujhhgtgfeyxiexzf];
                    for (int i19 = 0; i19 < this.f433Ujhhgtgfeyxiexzf; i19++) {
                        c1143feyxiexzfUjhhgtg2.f4328Ujhhgtgfeyxiexzf[i19] = this.f434Ujhhgtgfeyxiexzf[i19].m4933Ujhhgtgfeyxiexzf(iM277Ujhhgtgfeyxiexzf) - iM277Ujhhgtgfeyxiexzf;
                    }
                    c1143feyxiexzfUjhhgtg2.f4327Ujhhgtgfeyxiexzf = 1;
                    c1143feyxiexzfUjhhgtg2.f4326Ujhhgtgfeyxiexzf = iM2173Ujhhgtgfeyxiexzf;
                    c2629Ujhhgtgfeyxiexzf.m3933Ujhhgtgfeyxiexzf(c1143feyxiexzfUjhhgtg2);
                }
            }
            if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf && c0055Ujhhgtgfeyxiexzf.f1067Ujhhgtgfeyxiexzf == -1) {
                if (i != 0) {
                    i2 = 1;
                    this.f453feyxiexzfUjhhgtg = true;
                } else {
                    if (c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf != 1) {
                        int iM4933Ujhhgtgfeyxiexzf2 = this.f434Ujhhgtgfeyxiexzf[0].m4933Ujhhgtgfeyxiexzf(Integer.MIN_VALUE);
                        int i20 = 1;
                        while (true) {
                            if (i20 >= this.f433Ujhhgtgfeyxiexzf) {
                                z = true;
                                break;
                            }
                            if (this.f434Ujhhgtgfeyxiexzf[i20].m4933Ujhhgtgfeyxiexzf(Integer.MIN_VALUE) != iM4933Ujhhgtgfeyxiexzf2) {
                                z = false;
                                break;
                            }
                            i20++;
                        }
                    } else {
                        int iM4931Ujhhgtgfeyxiexzf2 = this.f434Ujhhgtgfeyxiexzf[0].m4931Ujhhgtgfeyxiexzf(Integer.MIN_VALUE);
                        int i21 = 1;
                        while (true) {
                            if (i21 >= this.f433Ujhhgtgfeyxiexzf) {
                                z = true;
                                break;
                            }
                            if (this.f434Ujhhgtgfeyxiexzf[i21].m4931Ujhhgtgfeyxiexzf(Integer.MIN_VALUE) != iM4931Ujhhgtgfeyxiexzf2) {
                                z = false;
                                break;
                            }
                            i21++;
                        }
                    }
                    i2 = 1;
                    if (!z) {
                        C1143feyxiexzfUjhhgtg c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf.m3939Ujhhgtgfeyxiexzf(iM2173Ujhhgtgfeyxiexzf);
                        if (c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf != null) {
                            c1143feyxiexzfUjhhgtgM3939Ujhhgtgfeyxiexzf.f4329Ujhhgtgfeyxiexzf = true;
                        }
                        this.f453feyxiexzfUjhhgtg = true;
                    }
                }
                if (c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf == i2) {
                    if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                        for (i4 = this.f433Ujhhgtgfeyxiexzf - i2; i4 >= 0; i4--) {
                            this.f434Ujhhgtgfeyxiexzf[i4].m4923Ujhhgtgfeyxiexzf(view);
                        }
                    } else {
                        c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.m4923Ujhhgtgfeyxiexzf(view);
                    }
                } else if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                    for (i3 = this.f433Ujhhgtgfeyxiexzf - 1; i3 >= 0; i3--) {
                        this.f434Ujhhgtgfeyxiexzf[i3].m4936Ujhhgtgfeyxiexzf(view);
                    }
                } else {
                    c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.m4936Ujhhgtgfeyxiexzf(view);
                }
                if (m280Ujhhgtgfeyxiexzf() || this.f437Ujhhgtgfeyxiexzf != 1) {
                    if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                        iMo2983Ujhhgtgfeyxiexzf = this.f436Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                    } else {
                        iMo2983Ujhhgtgfeyxiexzf = this.f436Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf() + (c3434feyxiexzfUjhhgtg.f10705Ujhhgtgfeyxiexzf * this.f438Ujhhgtgfeyxiexzf);
                    }
                    iMo2975Ujhhgtgfeyxiexzf2 = this.f436Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view) + iMo2983Ujhhgtgfeyxiexzf;
                } else {
                    iMo2975Ujhhgtgfeyxiexzf2 = c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf ? this.f436Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() : this.f436Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - (((this.f433Ujhhgtgfeyxiexzf - 1) - c3434feyxiexzfUjhhgtg.f10705Ujhhgtgfeyxiexzf) * this.f438Ujhhgtgfeyxiexzf);
                    iMo2983Ujhhgtgfeyxiexzf = iMo2975Ujhhgtgfeyxiexzf2 - this.f436Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view);
                }
                if (this.f437Ujhhgtgfeyxiexzf == 1) {
                    AbstractC0822feyxiexzfUjhhgtg.m2199feyxiexzfUjhhgtg(view, iMo2983Ujhhgtgfeyxiexzf, iMo2975Ujhhgtgfeyxiexzf, iMo2975Ujhhgtgfeyxiexzf2, iM277Ujhhgtgfeyxiexzf);
                } else {
                    AbstractC0822feyxiexzfUjhhgtg.m2199feyxiexzfUjhhgtg(view, iMo2975Ujhhgtgfeyxiexzf, iMo2983Ujhhgtgfeyxiexzf, iM277Ujhhgtgfeyxiexzf, iMo2975Ujhhgtgfeyxiexzf2);
                }
                if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                    m291feyxiexzfUjhhgtg(c0055Ujhhgtgfeyxiexzf2.f1068Ujhhgtgfeyxiexzf, i10);
                } else {
                    m293Ujhhgtgfeyxiexzf(c3434feyxiexzfUjhhgtg, c0055Ujhhgtgfeyxiexzf2.f1068Ujhhgtgfeyxiexzf, i10);
                }
                c0831feyxiexzfUjhhgtg2 = c0831feyxiexzfUjhhgtg;
                m285feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg2, c0055Ujhhgtgfeyxiexzf2);
                if (!c0055Ujhhgtgfeyxiexzf2.f1071Ujhhgtgfeyxiexzf && view.hasFocusable()) {
                    if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                        this.f442feyxiexzfUjhhgtg.clear();
                    } else {
                        this.f442feyxiexzfUjhhgtg.set(c3434feyxiexzfUjhhgtg.f10705Ujhhgtgfeyxiexzf, false);
                    }
                }
                i9 = 1;
                z2 = true;
                i8 = 0;
            } else {
                i2 = 1;
            }
            if (c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf == i2) {
                if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                    while (i4 >= 0) {
                        this.f434Ujhhgtgfeyxiexzf[i4].m4923Ujhhgtgfeyxiexzf(view);
                    }
                } else {
                    c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.m4923Ujhhgtgfeyxiexzf(view);
                }
            } else if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                while (i3 >= 0) {
                    this.f434Ujhhgtgfeyxiexzf[i3].m4936Ujhhgtgfeyxiexzf(view);
                }
            } else {
                c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.m4936Ujhhgtgfeyxiexzf(view);
            }
            if (m280Ujhhgtgfeyxiexzf()) {
                if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                    iMo2983Ujhhgtgfeyxiexzf = this.f436Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                } else {
                    iMo2983Ujhhgtgfeyxiexzf = this.f436Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf() + (c3434feyxiexzfUjhhgtg.f10705Ujhhgtgfeyxiexzf * this.f438Ujhhgtgfeyxiexzf);
                }
                iMo2975Ujhhgtgfeyxiexzf2 = this.f436Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view) + iMo2983Ujhhgtgfeyxiexzf;
            } else {
                if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                    iMo2983Ujhhgtgfeyxiexzf = this.f436Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                } else {
                    iMo2983Ujhhgtgfeyxiexzf = this.f436Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf() + (c3434feyxiexzfUjhhgtg.f10705Ujhhgtgfeyxiexzf * this.f438Ujhhgtgfeyxiexzf);
                }
                iMo2975Ujhhgtgfeyxiexzf2 = this.f436Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(view) + iMo2983Ujhhgtgfeyxiexzf;
            }
            if (this.f437Ujhhgtgfeyxiexzf == 1) {
                AbstractC0822feyxiexzfUjhhgtg.m2199feyxiexzfUjhhgtg(view, iMo2983Ujhhgtgfeyxiexzf, iMo2975Ujhhgtgfeyxiexzf, iMo2975Ujhhgtgfeyxiexzf2, iM277Ujhhgtgfeyxiexzf);
            } else {
                AbstractC0822feyxiexzfUjhhgtg.m2199feyxiexzfUjhhgtg(view, iMo2975Ujhhgtgfeyxiexzf, iMo2983Ujhhgtgfeyxiexzf, iM277Ujhhgtgfeyxiexzf, iMo2975Ujhhgtgfeyxiexzf2);
            }
            if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                m291feyxiexzfUjhhgtg(c0055Ujhhgtgfeyxiexzf2.f1068Ujhhgtgfeyxiexzf, i10);
            } else {
                m293Ujhhgtgfeyxiexzf(c3434feyxiexzfUjhhgtg, c0055Ujhhgtgfeyxiexzf2.f1068Ujhhgtgfeyxiexzf, i10);
            }
            c0831feyxiexzfUjhhgtg2 = c0831feyxiexzfUjhhgtg;
            m285feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg2, c0055Ujhhgtgfeyxiexzf2);
            if (!c0055Ujhhgtgfeyxiexzf2.f1071Ujhhgtgfeyxiexzf) {
            }
            i9 = 1;
            z2 = true;
            i8 = 0;
        }
        if (!z2) {
            m285feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg2, c0055Ujhhgtgfeyxiexzf2);
        }
        int iMo2983Ujhhgtgfeyxiexzf3 = c0055Ujhhgtgfeyxiexzf2.f1068Ujhhgtgfeyxiexzf == -1 ? this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf() - m277Ujhhgtgfeyxiexzf(this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf()) : m276feyxiexzfUjhhgtg(this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf()) - this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
        if (iMo2983Ujhhgtgfeyxiexzf3 > 0) {
            return Math.min(c0055Ujhhgtgfeyxiexzf.f1065Ujhhgtgfeyxiexzf, iMo2983Ujhhgtgfeyxiexzf3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final View m270feyxiexzfUjhhgtg(boolean z) {
        int iMo2983Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
        int iMo2979Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
        View view = null;
        for (int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf() - 1; iM2203Ujhhgtgfeyxiexzf >= 0; iM2203Ujhhgtgfeyxiexzf--) {
            View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(iM2203Ujhhgtgfeyxiexzf);
            int iMo2977Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
            int iMo2974Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
            if (iMo2974Ujhhgtgfeyxiexzf > iMo2983Ujhhgtgfeyxiexzf && iMo2977Ujhhgtgfeyxiexzf < iMo2979Ujhhgtgfeyxiexzf) {
                if (iMo2974Ujhhgtgfeyxiexzf <= iMo2979Ujhhgtgfeyxiexzf || !z) {
                    return viewM2202Ujhhgtgfeyxiexzf;
                }
                if (view == null) {
                    view = viewM2202Ujhhgtgfeyxiexzf;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final View m271Ujhhgtgfeyxiexzf(boolean z) {
        int iMo2983Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
        int iMo2979Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf();
        int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf();
        View view = null;
        for (int i = 0; i < iM2203Ujhhgtgfeyxiexzf; i++) {
            View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(i);
            int iMo2977Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
            if (this.f435Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf) > iMo2983Ujhhgtgfeyxiexzf && iMo2977Ujhhgtgfeyxiexzf < iMo2979Ujhhgtgfeyxiexzf) {
                if (iMo2977Ujhhgtgfeyxiexzf >= iMo2983Ujhhgtgfeyxiexzf || !z) {
                    return viewM2202Ujhhgtgfeyxiexzf;
                }
                if (view == null) {
                    view = viewM2202Ujhhgtgfeyxiexzf;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m272Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, boolean z) {
        int iMo2979Ujhhgtgfeyxiexzf;
        int iM276feyxiexzfUjhhgtg = m276feyxiexzfUjhhgtg(Integer.MIN_VALUE);
        if (iM276feyxiexzfUjhhgtg != Integer.MIN_VALUE && (iMo2979Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - iM276feyxiexzfUjhhgtg) > 0) {
            int i = iMo2979Ujhhgtgfeyxiexzf - (-m289Ujhhgtgfeyxiexzf(-iMo2979Ujhhgtgfeyxiexzf, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg));
            if (!z || i <= 0) {
                return;
            }
            this.f435Ujhhgtgfeyxiexzf.mo2987Ujhhgtgfeyxiexzf(i);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void m273feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, boolean z) {
        int iMo2983Ujhhgtgfeyxiexzf;
        int iM277Ujhhgtgfeyxiexzf = m277Ujhhgtgfeyxiexzf(Integer.MAX_VALUE);
        if (iM277Ujhhgtgfeyxiexzf != Integer.MAX_VALUE && (iMo2983Ujhhgtgfeyxiexzf = iM277Ujhhgtgfeyxiexzf - this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf()) > 0) {
            int iM289Ujhhgtgfeyxiexzf = iMo2983Ujhhgtgfeyxiexzf - m289Ujhhgtgfeyxiexzf(iMo2983Ujhhgtgfeyxiexzf, c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
            if (!z || iM289Ujhhgtgfeyxiexzf <= 0) {
                return;
            }
            this.f435Ujhhgtgfeyxiexzf.mo2987Ujhhgtgfeyxiexzf(-iM289Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int m274feyxiexzfUjhhgtg() {
        if (m2203Ujhhgtgfeyxiexzf() == 0) {
            return 0;
        }
        return AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(0));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m275Ujhhgtgfeyxiexzf() {
        int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf();
        if (iM2203Ujhhgtgfeyxiexzf == 0) {
            return 0;
        }
        return AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(iM2203Ujhhgtgfeyxiexzf - 1));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int m276feyxiexzfUjhhgtg(int i) {
        int iM4931Ujhhgtgfeyxiexzf = this.f434Ujhhgtgfeyxiexzf[0].m4931Ujhhgtgfeyxiexzf(i);
        for (int i2 = 1; i2 < this.f433Ujhhgtgfeyxiexzf; i2++) {
            int iM4931Ujhhgtgfeyxiexzf2 = this.f434Ujhhgtgfeyxiexzf[i2].m4931Ujhhgtgfeyxiexzf(i);
            if (iM4931Ujhhgtgfeyxiexzf2 > iM4931Ujhhgtgfeyxiexzf) {
                iM4931Ujhhgtgfeyxiexzf = iM4931Ujhhgtgfeyxiexzf2;
            }
        }
        return iM4931Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final int m277Ujhhgtgfeyxiexzf(int i) {
        int iM4933Ujhhgtgfeyxiexzf = this.f434Ujhhgtgfeyxiexzf[0].m4933Ujhhgtgfeyxiexzf(i);
        for (int i2 = 1; i2 < this.f433Ujhhgtgfeyxiexzf; i2++) {
            int iM4933Ujhhgtgfeyxiexzf2 = this.f434Ujhhgtgfeyxiexzf[i2].m4933Ujhhgtgfeyxiexzf(i);
            if (iM4933Ujhhgtgfeyxiexzf2 < iM4933Ujhhgtgfeyxiexzf) {
                iM4933Ujhhgtgfeyxiexzf = iM4933Ujhhgtgfeyxiexzf2;
            }
        }
        return iM4933Ujhhgtgfeyxiexzf;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void m278Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        int i4;
        int i5;
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf;
        int iM275Ujhhgtgfeyxiexzf;
        int iM275Ujhhgtgfeyxiexzf2 = this.f441Ujhhgtgfeyxiexzf ? m275Ujhhgtgfeyxiexzf() : m274feyxiexzfUjhhgtg();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            c2629Ujhhgtgfeyxiexzf = this.f445feyxiexzfUjhhgtg;
            c2629Ujhhgtgfeyxiexzf.m3945feyxiexzfUjhhgtg(i5);
            if (i3 != 1) {
                c2629Ujhhgtgfeyxiexzf.m3947feyxiexzfUjhhgtg(i, i2);
            } else if (i3 != 2) {
                c2629Ujhhgtgfeyxiexzf.m3948feyxiexzfUjhhgtg(i, i2);
            } else if (i3 == 8) {
                c2629Ujhhgtgfeyxiexzf.m3948feyxiexzfUjhhgtg(i, 1);
                c2629Ujhhgtgfeyxiexzf.m3947feyxiexzfUjhhgtg(i2, 1);
            }
            if (i4 <= iM275Ujhhgtgfeyxiexzf2) {
                return;
            }
            if (this.f441Ujhhgtgfeyxiexzf) {
                iM275Ujhhgtgfeyxiexzf = m274feyxiexzfUjhhgtg();
            } else {
                iM275Ujhhgtgfeyxiexzf = m275Ujhhgtgfeyxiexzf();
            }
            if (i5 <= iM275Ujhhgtgfeyxiexzf) {
                m2216feyxiexzfUjhhgtg();
            }
        }
        i4 = i + i2;
        i5 = i;
        c2629Ujhhgtgfeyxiexzf = this.f445feyxiexzfUjhhgtg;
        c2629Ujhhgtgfeyxiexzf.m3945feyxiexzfUjhhgtg(i5);
        if (i3 != 1) {
            c2629Ujhhgtgfeyxiexzf.m3947feyxiexzfUjhhgtg(i, i2);
        } else if (i3 != 2) {
            c2629Ujhhgtgfeyxiexzf.m3948feyxiexzfUjhhgtg(i, i2);
        } else if (i3 == 8) {
            c2629Ujhhgtgfeyxiexzf.m3948feyxiexzfUjhhgtg(i, 1);
            c2629Ujhhgtgfeyxiexzf.m3947feyxiexzfUjhhgtg(i2, 1);
        }
        if (i4 <= iM275Ujhhgtgfeyxiexzf2) {
            return;
        }
        if (this.f441Ujhhgtgfeyxiexzf) {
            iM275Ujhhgtgfeyxiexzf = m274feyxiexzfUjhhgtg();
        } else {
            iM275Ujhhgtgfeyxiexzf = m275Ujhhgtgfeyxiexzf();
        }
        if (i5 <= iM275Ujhhgtgfeyxiexzf) {
            m2216feyxiexzfUjhhgtg();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00fb A[SYNTHETIC] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final View m279Ujhhgtgfeyxiexzf() {
        int i;
        View viewM2202Ujhhgtgfeyxiexzf;
        int iMo2977Ujhhgtgfeyxiexzf;
        int iMo2977Ujhhgtgfeyxiexzf2;
        boolean z;
        boolean z2;
        boolean z3;
        int iMo2974Ujhhgtgfeyxiexzf;
        int iMo2974Ujhhgtgfeyxiexzf2;
        boolean z4;
        boolean z5;
        int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf();
        int i2 = iM2203Ujhhgtgfeyxiexzf - 1;
        BitSet bitSet = new BitSet(this.f433Ujhhgtgfeyxiexzf);
        bitSet.set(0, this.f433Ujhhgtgfeyxiexzf, true);
        byte b = (this.f437Ujhhgtgfeyxiexzf == 1 && m280Ujhhgtgfeyxiexzf()) ? (byte) 1 : (byte) -1;
        if (this.f441Ujhhgtgfeyxiexzf) {
            iM2203Ujhhgtgfeyxiexzf = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2 < iM2203Ujhhgtgfeyxiexzf ? 1 : -1;
        while (i2 != iM2203Ujhhgtgfeyxiexzf) {
            View viewM2202Ujhhgtgfeyxiexzf2 = m2202Ujhhgtgfeyxiexzf(i2);
            C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) viewM2202Ujhhgtgfeyxiexzf2.getLayoutParams();
            if (bitSet.get(c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.f10705Ujhhgtgfeyxiexzf)) {
                C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg = c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf;
                if (this.f441Ujhhgtgfeyxiexzf) {
                    int i4 = c3434feyxiexzfUjhhgtg.f10703Ujhhgtgfeyxiexzf;
                    if (i4 == Integer.MIN_VALUE) {
                        c3434feyxiexzfUjhhgtg.m4924Ujhhgtgfeyxiexzf();
                        i4 = c3434feyxiexzfUjhhgtg.f10703Ujhhgtgfeyxiexzf;
                    }
                    if (i4 < this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf()) {
                        ArrayList arrayList = (ArrayList) c3434feyxiexzfUjhhgtg.f10706Ujhhgtgfeyxiexzf;
                        z4 = ((C1140feyxiexzfUjhhgtg) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).f4308Ujhhgtgfeyxiexzf;
                        z5 = !z4;
                    } else {
                        z5 = false;
                    }
                } else {
                    int i5 = c3434feyxiexzfUjhhgtg.f10702Ujhhgtgfeyxiexzf;
                    if (i5 == Integer.MIN_VALUE) {
                        c3434feyxiexzfUjhhgtg.m4925Ujhhgtgfeyxiexzf();
                        i5 = c3434feyxiexzfUjhhgtg.f10702Ujhhgtgfeyxiexzf;
                    }
                    if (i5 > this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf()) {
                        z4 = ((C1140feyxiexzfUjhhgtg) ((View) ((ArrayList) c3434feyxiexzfUjhhgtg.f10706Ujhhgtgfeyxiexzf).get(0)).getLayoutParams()).f4308Ujhhgtgfeyxiexzf;
                        z5 = !z4;
                    } else {
                        z5 = false;
                    }
                }
                if (!z5) {
                    bitSet.clear(c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.f10705Ujhhgtgfeyxiexzf);
                    if (!c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf && (i = i2 + i3) != iM2203Ujhhgtgfeyxiexzf) {
                        viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(i);
                        if (this.f441Ujhhgtgfeyxiexzf) {
                            iMo2974Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf2);
                            iMo2974Ujhhgtgfeyxiexzf2 = this.f435Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
                            if (iMo2974Ujhhgtgfeyxiexzf >= iMo2974Ujhhgtgfeyxiexzf2) {
                                if (iMo2974Ujhhgtgfeyxiexzf == iMo2974Ujhhgtgfeyxiexzf2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    if (c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.f10705Ujhhgtgfeyxiexzf - ((C1140feyxiexzfUjhhgtg) viewM2202Ujhhgtgfeyxiexzf.getLayoutParams()).f4307Ujhhgtgfeyxiexzf.f10705Ujhhgtgfeyxiexzf < 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (b < 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z2 != z3) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            iMo2977Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf2);
                            iMo2977Ujhhgtgfeyxiexzf2 = this.f435Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
                            if (iMo2977Ujhhgtgfeyxiexzf <= iMo2977Ujhhgtgfeyxiexzf2) {
                                if (iMo2977Ujhhgtgfeyxiexzf == iMo2977Ujhhgtgfeyxiexzf2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    if (c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.f10705Ujhhgtgfeyxiexzf - ((C1140feyxiexzfUjhhgtg) viewM2202Ujhhgtgfeyxiexzf.getLayoutParams()).f4307Ujhhgtgfeyxiexzf.f10705Ujhhgtgfeyxiexzf < 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (b < 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z2 != z3) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    i2 += i3;
                }
            } else {
                if (!c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                    viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(i);
                    if (this.f441Ujhhgtgfeyxiexzf) {
                        iMo2974Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf2);
                        iMo2974Ujhhgtgfeyxiexzf2 = this.f435Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
                        if (iMo2974Ujhhgtgfeyxiexzf >= iMo2974Ujhhgtgfeyxiexzf2) {
                            if (iMo2974Ujhhgtgfeyxiexzf == iMo2974Ujhhgtgfeyxiexzf2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.f10705Ujhhgtgfeyxiexzf - ((C1140feyxiexzfUjhhgtg) viewM2202Ujhhgtgfeyxiexzf.getLayoutParams()).f4307Ujhhgtgfeyxiexzf.f10705Ujhhgtgfeyxiexzf < 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (b < 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2 != z3) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iMo2977Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf2);
                        iMo2977Ujhhgtgfeyxiexzf2 = this.f435Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
                        if (iMo2977Ujhhgtgfeyxiexzf <= iMo2977Ujhhgtgfeyxiexzf2) {
                            if (iMo2977Ujhhgtgfeyxiexzf == iMo2977Ujhhgtgfeyxiexzf2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.f10705Ujhhgtgfeyxiexzf - ((C1140feyxiexzfUjhhgtg) viewM2202Ujhhgtgfeyxiexzf.getLayoutParams()).f4307Ujhhgtgfeyxiexzf.f10705Ujhhgtgfeyxiexzf < 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (b < 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2 != z3) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i2 += i3;
            }
            return viewM2202Ujhhgtgfeyxiexzf2;
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m280Ujhhgtgfeyxiexzf() {
        return this.f3261Ujhhgtgfeyxiexzf.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m281Ujhhgtgfeyxiexzf(View view, int i, int i2) {
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        Rect rect = this.f451feyxiexzfUjhhgtg;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m233feyxiexzfUjhhgtg(view));
        }
        C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) view.getLayoutParams();
        int iM262feyxiexzfUjhhgtg = m262feyxiexzfUjhhgtg(i, ((ViewGroup.MarginLayoutParams) c1140feyxiexzfUjhhgtg).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1140feyxiexzfUjhhgtg).rightMargin + rect.right);
        int iM262feyxiexzfUjhhgtg2 = m262feyxiexzfUjhhgtg(i2, ((ViewGroup.MarginLayoutParams) c1140feyxiexzfUjhhgtg).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1140feyxiexzfUjhhgtg).bottomMargin + rect.bottom);
        if (m2221feyxiexzfUjhhgtg(view, iM262feyxiexzfUjhhgtg, iM262feyxiexzfUjhhgtg2, c1140feyxiexzfUjhhgtg)) {
            view.measure(iM262feyxiexzfUjhhgtg, iM262feyxiexzfUjhhgtg2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:262:0x042f  */
    /* JADX WARN: Code duplicated, block: B:273:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x01fc A[SYNTHETIC] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m282Ujhhgtgfeyxiexzf(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg, boolean z) {
        boolean z2;
        C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg;
        int iM2203Ujhhgtgfeyxiexzf;
        int i;
        int iM2196feyxiexzfUjhhgtg;
        int iM2196feyxiexzfUjhhgtg2;
        int iM2203Ujhhgtgfeyxiexzf2;
        int i2;
        boolean z3;
        C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg2 = this.f449feyxiexzfUjhhgtg;
        C1141feyxiexzfUjhhgtg c1141feyxiexzfUjhhgtg = this.f452feyxiexzfUjhhgtg;
        if (!(c1142feyxiexzfUjhhgtg2 == null && this.f443feyxiexzfUjhhgtg == -1) && c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf() == 0) {
            m2211feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg);
            c1141feyxiexzfUjhhgtg.m2607Ujhhgtgfeyxiexzf();
            return;
        }
        boolean z4 = c1141feyxiexzfUjhhgtg.f4313Ujhhgtgfeyxiexzf;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c1141feyxiexzfUjhhgtg.f4315Ujhhgtgfeyxiexzf;
        boolean z5 = (z4 && this.f443feyxiexzfUjhhgtg == -1 && this.f449feyxiexzfUjhhgtg == null) ? false : true;
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = this.f445feyxiexzfUjhhgtg;
        if (z5) {
            c1141feyxiexzfUjhhgtg.m2607Ujhhgtgfeyxiexzf();
            C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg3 = this.f449feyxiexzfUjhhgtg;
            if (c1142feyxiexzfUjhhgtg3 != null) {
                int i3 = c1142feyxiexzfUjhhgtg3.f4318Ujhhgtgfeyxiexzf;
                if (i3 > 0) {
                    if (i3 == this.f433Ujhhgtgfeyxiexzf) {
                        for (int i4 = 0; i4 < this.f433Ujhhgtgfeyxiexzf; i4++) {
                            this.f434Ujhhgtgfeyxiexzf[i4].m4926Ujhhgtgfeyxiexzf();
                            C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg4 = this.f449feyxiexzfUjhhgtg;
                            int iMo2979Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg4.f4319Ujhhgtgfeyxiexzf[i4];
                            if (iMo2979Ujhhgtgfeyxiexzf != Integer.MIN_VALUE) {
                                iMo2979Ujhhgtgfeyxiexzf += c1142feyxiexzfUjhhgtg4.f4324Ujhhgtgfeyxiexzf ? this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() : this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                            }
                            C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg = this.f434Ujhhgtgfeyxiexzf[i4];
                            c3434feyxiexzfUjhhgtg.f10702Ujhhgtgfeyxiexzf = iMo2979Ujhhgtgfeyxiexzf;
                            c3434feyxiexzfUjhhgtg.f10703Ujhhgtgfeyxiexzf = iMo2979Ujhhgtgfeyxiexzf;
                        }
                    } else {
                        c1142feyxiexzfUjhhgtg3.f4319Ujhhgtgfeyxiexzf = null;
                        c1142feyxiexzfUjhhgtg3.f4318Ujhhgtgfeyxiexzf = 0;
                        c1142feyxiexzfUjhhgtg3.f4320Ujhhgtgfeyxiexzf = 0;
                        c1142feyxiexzfUjhhgtg3.f4321Ujhhgtgfeyxiexzf = null;
                        c1142feyxiexzfUjhhgtg3.f4322Ujhhgtgfeyxiexzf = null;
                        c1142feyxiexzfUjhhgtg3.f4316Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg3.f4317Ujhhgtgfeyxiexzf;
                    }
                }
                C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg5 = this.f449feyxiexzfUjhhgtg;
                this.f448feyxiexzfUjhhgtg = c1142feyxiexzfUjhhgtg5.f4325Ujhhgtgfeyxiexzf;
                boolean z6 = c1142feyxiexzfUjhhgtg5.f4323Ujhhgtgfeyxiexzf;
                mo151Ujhhgtgfeyxiexzf(null);
                C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg6 = this.f449feyxiexzfUjhhgtg;
                if (c1142feyxiexzfUjhhgtg6 != null && c1142feyxiexzfUjhhgtg6.f4323Ujhhgtgfeyxiexzf != z6) {
                    c1142feyxiexzfUjhhgtg6.f4323Ujhhgtgfeyxiexzf = z6;
                }
                this.f440Ujhhgtgfeyxiexzf = z6;
                m2216feyxiexzfUjhhgtg();
                m288feyxiexzfUjhhgtg();
                C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg7 = this.f449feyxiexzfUjhhgtg;
                int i5 = c1142feyxiexzfUjhhgtg7.f4316Ujhhgtgfeyxiexzf;
                if (i5 != -1) {
                    this.f443feyxiexzfUjhhgtg = i5;
                    c1141feyxiexzfUjhhgtg.f4311Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg7.f4324Ujhhgtgfeyxiexzf;
                } else {
                    c1141feyxiexzfUjhhgtg.f4311Ujhhgtgfeyxiexzf = this.f441Ujhhgtgfeyxiexzf;
                }
                if (c1142feyxiexzfUjhhgtg7.f4320Ujhhgtgfeyxiexzf > 1) {
                    c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg7.f4321Ujhhgtgfeyxiexzf;
                    c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf = c1142feyxiexzfUjhhgtg7.f4322Ujhhgtgfeyxiexzf;
                }
            } else {
                m288feyxiexzfUjhhgtg();
                c1141feyxiexzfUjhhgtg.f4311Ujhhgtgfeyxiexzf = this.f441Ujhhgtgfeyxiexzf;
            }
            if (c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf || (i2 = this.f443feyxiexzfUjhhgtg) == -1) {
                if (this.f447feyxiexzfUjhhgtg) {
                    int iM2158Ujhhgtgfeyxiexzf = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf();
                    iM2203Ujhhgtgfeyxiexzf2 = m2203Ujhhgtgfeyxiexzf() - 1;
                    while (true) {
                        if (iM2203Ujhhgtgfeyxiexzf2 < 0) {
                            iM2196feyxiexzfUjhhgtg2 = 0;
                            break;
                        }
                        iM2196feyxiexzfUjhhgtg2 = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(iM2203Ujhhgtgfeyxiexzf2));
                        if (iM2196feyxiexzfUjhhgtg2 < 0 && iM2196feyxiexzfUjhhgtg2 < iM2158Ujhhgtgfeyxiexzf) {
                            break;
                        } else {
                            iM2203Ujhhgtgfeyxiexzf2--;
                        }
                    }
                } else {
                    int iM2158Ujhhgtgfeyxiexzf2 = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf();
                    iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf();
                    i = 0;
                    while (true) {
                        if (i >= iM2203Ujhhgtgfeyxiexzf) {
                            iM2196feyxiexzfUjhhgtg2 = 0;
                            break;
                        }
                        iM2196feyxiexzfUjhhgtg = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(i));
                        if (iM2196feyxiexzfUjhhgtg < 0 && iM2196feyxiexzfUjhhgtg < iM2158Ujhhgtgfeyxiexzf2) {
                            iM2196feyxiexzfUjhhgtg2 = iM2196feyxiexzfUjhhgtg;
                            break;
                        }
                        i++;
                    }
                }
                c1141feyxiexzfUjhhgtg.f4309Ujhhgtgfeyxiexzf = iM2196feyxiexzfUjhhgtg2;
                c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf()) {
                this.f443feyxiexzfUjhhgtg = -1;
                this.f444feyxiexzfUjhhgtg = Integer.MIN_VALUE;
                if (this.f447feyxiexzfUjhhgtg) {
                    int iM2158Ujhhgtgfeyxiexzf3 = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf();
                    iM2203Ujhhgtgfeyxiexzf2 = m2203Ujhhgtgfeyxiexzf() - 1;
                    while (true) {
                        if (iM2203Ujhhgtgfeyxiexzf2 < 0) {
                            iM2196feyxiexzfUjhhgtg2 = 0;
                            break;
                        } else {
                            iM2196feyxiexzfUjhhgtg2 = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(iM2203Ujhhgtgfeyxiexzf2));
                            if (iM2196feyxiexzfUjhhgtg2 < 0) {
                            }
                            iM2203Ujhhgtgfeyxiexzf2--;
                        }
                    }
                } else {
                    int iM2158Ujhhgtgfeyxiexzf4 = c0810feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf();
                    iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf();
                    i = 0;
                    while (true) {
                        if (i >= iM2203Ujhhgtgfeyxiexzf) {
                            iM2196feyxiexzfUjhhgtg2 = 0;
                            break;
                        } else {
                            iM2196feyxiexzfUjhhgtg = AbstractC0822feyxiexzfUjhhgtg.m2196feyxiexzfUjhhgtg(m2202Ujhhgtgfeyxiexzf(i));
                            if (iM2196feyxiexzfUjhhgtg < 0) {
                            }
                            i++;
                        }
                    }
                }
                c1141feyxiexzfUjhhgtg.f4309Ujhhgtgfeyxiexzf = iM2196feyxiexzfUjhhgtg2;
                c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
            } else {
                C1142feyxiexzfUjhhgtg c1142feyxiexzfUjhhgtg8 = this.f449feyxiexzfUjhhgtg;
                if (c1142feyxiexzfUjhhgtg8 == null || c1142feyxiexzfUjhhgtg8.f4316Ujhhgtgfeyxiexzf == -1 || c1142feyxiexzfUjhhgtg8.f4318Ujhhgtgfeyxiexzf < 1) {
                    View viewMo158Ujhhgtgfeyxiexzf = mo158Ujhhgtgfeyxiexzf(this.f443feyxiexzfUjhhgtg);
                    if (viewMo158Ujhhgtgfeyxiexzf != null) {
                        c1141feyxiexzfUjhhgtg.f4309Ujhhgtgfeyxiexzf = this.f441Ujhhgtgfeyxiexzf ? m275Ujhhgtgfeyxiexzf() : m274feyxiexzfUjhhgtg();
                        if (this.f444feyxiexzfUjhhgtg != Integer.MIN_VALUE) {
                            if (c1141feyxiexzfUjhhgtg.f4311Ujhhgtgfeyxiexzf) {
                                c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf = (this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - this.f444feyxiexzfUjhhgtg) - this.f435Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewMo158Ujhhgtgfeyxiexzf);
                            } else {
                                c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf = (this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf() + this.f444feyxiexzfUjhhgtg) - this.f435Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewMo158Ujhhgtgfeyxiexzf);
                            }
                        } else if (this.f435Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(viewMo158Ujhhgtgfeyxiexzf) > this.f435Ujhhgtgfeyxiexzf.mo2984Ujhhgtgfeyxiexzf()) {
                            c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf = c1141feyxiexzfUjhhgtg.f4311Ujhhgtgfeyxiexzf ? this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() : this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                        } else {
                            int iMo2977Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewMo158Ujhhgtgfeyxiexzf) - this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                            if (iMo2977Ujhhgtgfeyxiexzf < 0) {
                                c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf = -iMo2977Ujhhgtgfeyxiexzf;
                            } else {
                                int iMo2979Ujhhgtgfeyxiexzf2 = this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - this.f435Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewMo158Ujhhgtgfeyxiexzf);
                                if (iMo2979Ujhhgtgfeyxiexzf2 < 0) {
                                    c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf = iMo2979Ujhhgtgfeyxiexzf2;
                                } else {
                                    c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f443feyxiexzfUjhhgtg;
                        c1141feyxiexzfUjhhgtg.f4309Ujhhgtgfeyxiexzf = i6;
                        int i7 = this.f444feyxiexzfUjhhgtg;
                        if (i7 == Integer.MIN_VALUE) {
                            if (m2203Ujhhgtgfeyxiexzf() != 0) {
                                if ((i6 < m274feyxiexzfUjhhgtg()) != this.f441Ujhhgtgfeyxiexzf) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            } else if (this.f441Ujhhgtgfeyxiexzf) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c1141feyxiexzfUjhhgtg.f4311Ujhhgtgfeyxiexzf = z3;
                            c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf = z3 ? staggeredGridLayoutManager.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() : staggeredGridLayoutManager.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf();
                        } else if (c1141feyxiexzfUjhhgtg.f4311Ujhhgtgfeyxiexzf) {
                            c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf = staggeredGridLayoutManager.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() - i7;
                        } else {
                            c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf = staggeredGridLayoutManager.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf() + i7;
                        }
                        c1141feyxiexzfUjhhgtg.f4312Ujhhgtgfeyxiexzf = true;
                    }
                } else {
                    c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
                    c1141feyxiexzfUjhhgtg.f4309Ujhhgtgfeyxiexzf = this.f443feyxiexzfUjhhgtg;
                }
            }
            c1141feyxiexzfUjhhgtg.f4313Ujhhgtgfeyxiexzf = true;
        }
        if (this.f449feyxiexzfUjhhgtg == null && this.f443feyxiexzfUjhhgtg == -1 && (c1141feyxiexzfUjhhgtg.f4311Ujhhgtgfeyxiexzf != this.f447feyxiexzfUjhhgtg || m280Ujhhgtgfeyxiexzf() != this.f448feyxiexzfUjhhgtg)) {
            c2629Ujhhgtgfeyxiexzf.m3934Ujhhgtgfeyxiexzf();
            c1141feyxiexzfUjhhgtg.f4312Ujhhgtgfeyxiexzf = true;
        }
        if (m2203Ujhhgtgfeyxiexzf() > 0 && ((c1142feyxiexzfUjhhgtg = this.f449feyxiexzfUjhhgtg) == null || c1142feyxiexzfUjhhgtg.f4318Ujhhgtgfeyxiexzf < 1)) {
            if (c1141feyxiexzfUjhhgtg.f4312Ujhhgtgfeyxiexzf) {
                for (int i8 = 0; i8 < this.f433Ujhhgtgfeyxiexzf; i8++) {
                    this.f434Ujhhgtgfeyxiexzf[i8].m4926Ujhhgtgfeyxiexzf();
                    int i9 = c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf;
                    if (i9 != Integer.MIN_VALUE) {
                        C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg2 = this.f434Ujhhgtgfeyxiexzf[i8];
                        c3434feyxiexzfUjhhgtg2.f10702Ujhhgtgfeyxiexzf = i9;
                        c3434feyxiexzfUjhhgtg2.f10703Ujhhgtgfeyxiexzf = i9;
                    }
                }
            } else if (z5 || c1141feyxiexzfUjhhgtg.f4314Ujhhgtgfeyxiexzf == null) {
                for (int i10 = 0; i10 < this.f433Ujhhgtgfeyxiexzf; i10++) {
                    C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg3 = this.f434Ujhhgtgfeyxiexzf[i10];
                    boolean z7 = this.f441Ujhhgtgfeyxiexzf;
                    int i11 = c1141feyxiexzfUjhhgtg.f4310Ujhhgtgfeyxiexzf;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) c3434feyxiexzfUjhhgtg3.f10707Ujhhgtgfeyxiexzf;
                    int iM4931Ujhhgtgfeyxiexzf = z7 ? c3434feyxiexzfUjhhgtg3.m4931Ujhhgtgfeyxiexzf(Integer.MIN_VALUE) : c3434feyxiexzfUjhhgtg3.m4933Ujhhgtgfeyxiexzf(Integer.MIN_VALUE);
                    c3434feyxiexzfUjhhgtg3.m4926Ujhhgtgfeyxiexzf();
                    if (iM4931Ujhhgtgfeyxiexzf != Integer.MIN_VALUE && ((!z7 || iM4931Ujhhgtgfeyxiexzf >= staggeredGridLayoutManager2.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf()) && (z7 || iM4931Ujhhgtgfeyxiexzf <= staggeredGridLayoutManager2.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf()))) {
                        if (i11 != Integer.MIN_VALUE) {
                            iM4931Ujhhgtgfeyxiexzf += i11;
                        }
                        c3434feyxiexzfUjhhgtg3.f10703Ujhhgtgfeyxiexzf = iM4931Ujhhgtgfeyxiexzf;
                        c3434feyxiexzfUjhhgtg3.f10702Ujhhgtgfeyxiexzf = iM4931Ujhhgtgfeyxiexzf;
                    }
                }
                C3434feyxiexzfUjhhgtg[] c3434feyxiexzfUjhhgtgArr = this.f434Ujhhgtgfeyxiexzf;
                int length = c3434feyxiexzfUjhhgtgArr.length;
                int[] iArr = c1141feyxiexzfUjhhgtg.f4314Ujhhgtgfeyxiexzf;
                if (iArr == null || iArr.length < length) {
                    c1141feyxiexzfUjhhgtg.f4314Ujhhgtgfeyxiexzf = new int[staggeredGridLayoutManager.f434Ujhhgtgfeyxiexzf.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c1141feyxiexzfUjhhgtg.f4314Ujhhgtgfeyxiexzf[i12] = c3434feyxiexzfUjhhgtgArr[i12].m4933Ujhhgtgfeyxiexzf(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f433Ujhhgtgfeyxiexzf; i13++) {
                    C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg4 = this.f434Ujhhgtgfeyxiexzf[i13];
                    c3434feyxiexzfUjhhgtg4.m4926Ujhhgtgfeyxiexzf();
                    int i14 = c1141feyxiexzfUjhhgtg.f4314Ujhhgtgfeyxiexzf[i13];
                    c3434feyxiexzfUjhhgtg4.f10702Ujhhgtgfeyxiexzf = i14;
                    c3434feyxiexzfUjhhgtg4.f10703Ujhhgtgfeyxiexzf = i14;
                }
            }
        }
        m2201Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg);
        C0055Ujhhgtgfeyxiexzf c0055Ujhhgtgfeyxiexzf = this.f439Ujhhgtgfeyxiexzf;
        c0055Ujhhgtgfeyxiexzf.f1064Ujhhgtgfeyxiexzf = false;
        this.f453feyxiexzfUjhhgtg = false;
        int iMo2984Ujhhgtgfeyxiexzf = this.f436Ujhhgtgfeyxiexzf.mo2984Ujhhgtgfeyxiexzf();
        this.f438Ujhhgtgfeyxiexzf = iMo2984Ujhhgtgfeyxiexzf / this.f433Ujhhgtgfeyxiexzf;
        this.f450feyxiexzfUjhhgtg = View.MeasureSpec.makeMeasureSpec(iMo2984Ujhhgtgfeyxiexzf, this.f436Ujhhgtgfeyxiexzf.mo2981Ujhhgtgfeyxiexzf());
        m292feyxiexzfUjhhgtg(c1141feyxiexzfUjhhgtg.f4309Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg);
        if (c1141feyxiexzfUjhhgtg.f4311Ujhhgtgfeyxiexzf) {
            m290Ujhhgtgfeyxiexzf(-1);
            m269Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0055Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg);
            m290Ujhhgtgfeyxiexzf(1);
            c0055Ujhhgtgfeyxiexzf.f1066Ujhhgtgfeyxiexzf = c1141feyxiexzfUjhhgtg.f4309Ujhhgtgfeyxiexzf + c0055Ujhhgtgfeyxiexzf.f1067Ujhhgtgfeyxiexzf;
            m269Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0055Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg);
        } else {
            m290Ujhhgtgfeyxiexzf(1);
            m269Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0055Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg);
            m290Ujhhgtgfeyxiexzf(-1);
            c0055Ujhhgtgfeyxiexzf.f1066Ujhhgtgfeyxiexzf = c1141feyxiexzfUjhhgtg.f4309Ujhhgtgfeyxiexzf + c0055Ujhhgtgfeyxiexzf.f1067Ujhhgtgfeyxiexzf;
            m269Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0055Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg);
        }
        if (this.f436Ujhhgtgfeyxiexzf.mo2981Ujhhgtgfeyxiexzf() != 1073741824) {
            int iM2203Ujhhgtgfeyxiexzf3 = m2203Ujhhgtgfeyxiexzf();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < iM2203Ujhhgtgfeyxiexzf3; i15++) {
                View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(i15);
                float fMo2975Ujhhgtgfeyxiexzf = this.f436Ujhhgtgfeyxiexzf.mo2975Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf);
                if (fMo2975Ujhhgtgfeyxiexzf >= fMax) {
                    if (((C1140feyxiexzfUjhhgtg) viewM2202Ujhhgtgfeyxiexzf.getLayoutParams()).f4308Ujhhgtgfeyxiexzf) {
                        fMo2975Ujhhgtgfeyxiexzf = (fMo2975Ujhhgtgfeyxiexzf * 1.0f) / this.f433Ujhhgtgfeyxiexzf;
                    }
                    fMax = Math.max(fMax, fMo2975Ujhhgtgfeyxiexzf);
                }
            }
            int i16 = this.f438Ujhhgtgfeyxiexzf;
            int iRound = Math.round(fMax * this.f433Ujhhgtgfeyxiexzf);
            if (this.f436Ujhhgtgfeyxiexzf.mo2981Ujhhgtgfeyxiexzf() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f436Ujhhgtgfeyxiexzf.mo2984Ujhhgtgfeyxiexzf());
            }
            this.f438Ujhhgtgfeyxiexzf = iRound / this.f433Ujhhgtgfeyxiexzf;
            this.f450feyxiexzfUjhhgtg = View.MeasureSpec.makeMeasureSpec(iRound, this.f436Ujhhgtgfeyxiexzf.mo2981Ujhhgtgfeyxiexzf());
            if (this.f438Ujhhgtgfeyxiexzf != i16) {
                for (int i17 = 0; i17 < iM2203Ujhhgtgfeyxiexzf3; i17++) {
                    View viewM2202Ujhhgtgfeyxiexzf2 = m2202Ujhhgtgfeyxiexzf(i17);
                    C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) viewM2202Ujhhgtgfeyxiexzf2.getLayoutParams();
                    if (!c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                        if (m280Ujhhgtgfeyxiexzf() && this.f437Ujhhgtgfeyxiexzf == 1) {
                            int i18 = -((this.f433Ujhhgtgfeyxiexzf - 1) - c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.f10705Ujhhgtgfeyxiexzf);
                            viewM2202Ujhhgtgfeyxiexzf2.offsetLeftAndRight((this.f438Ujhhgtgfeyxiexzf * i18) - (i18 * i16));
                        } else {
                            int i19 = c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.f10705Ujhhgtgfeyxiexzf;
                            int i20 = this.f438Ujhhgtgfeyxiexzf * i19;
                            int i21 = i19 * i16;
                            if (this.f437Ujhhgtgfeyxiexzf == 1) {
                                viewM2202Ujhhgtgfeyxiexzf2.offsetLeftAndRight(i20 - i21);
                            } else {
                                viewM2202Ujhhgtgfeyxiexzf2.offsetTopAndBottom(i20 - i21);
                            }
                        }
                    }
                }
            }
        }
        if (m2203Ujhhgtgfeyxiexzf() > 0) {
            if (this.f441Ujhhgtgfeyxiexzf) {
                m272Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, true);
                m273feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, false);
            } else {
                m273feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, true);
                m272Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, false);
            }
        }
        if (z && !c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf && this.f446feyxiexzfUjhhgtg != 0 && m2203Ujhhgtgfeyxiexzf() > 0 && (this.f453feyxiexzfUjhhgtg || m279Ujhhgtgfeyxiexzf() != null)) {
            RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f456feyxiexzfUjhhgtg);
            }
            z2 = m267feyxiexzfUjhhgtg();
        }
        if (c0810feyxiexzfUjhhgtg.f3211Ujhhgtgfeyxiexzf) {
            c1141feyxiexzfUjhhgtg.m2607Ujhhgtgfeyxiexzf();
        }
        this.f447feyxiexzfUjhhgtg = c1141feyxiexzfUjhhgtg.f4311Ujhhgtgfeyxiexzf;
        this.f448feyxiexzfUjhhgtg = m280Ujhhgtgfeyxiexzf();
        if (z2) {
            c1141feyxiexzfUjhhgtg.m2607Ujhhgtgfeyxiexzf();
            m282Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg, false);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public final boolean m283feyxiexzfUjhhgtg(int i) {
        if (this.f437Ujhhgtgfeyxiexzf == 0) {
            return (i == -1) != this.f441Ujhhgtgfeyxiexzf;
        }
        return ((i == -1) == this.f441Ujhhgtgfeyxiexzf) == m280Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public final void m284feyxiexzfUjhhgtg(int i, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        int iM274feyxiexzfUjhhgtg;
        int i2;
        if (i > 0) {
            iM274feyxiexzfUjhhgtg = m275Ujhhgtgfeyxiexzf();
            i2 = 1;
        } else {
            iM274feyxiexzfUjhhgtg = m274feyxiexzfUjhhgtg();
            i2 = -1;
        }
        C0055Ujhhgtgfeyxiexzf c0055Ujhhgtgfeyxiexzf = this.f439Ujhhgtgfeyxiexzf;
        c0055Ujhhgtgfeyxiexzf.f1064Ujhhgtgfeyxiexzf = true;
        m292feyxiexzfUjhhgtg(iM274feyxiexzfUjhhgtg, c0810feyxiexzfUjhhgtg);
        m290Ujhhgtgfeyxiexzf(i2);
        c0055Ujhhgtgfeyxiexzf.f1066Ujhhgtgfeyxiexzf = iM274feyxiexzfUjhhgtg + c0055Ujhhgtgfeyxiexzf.f1067Ujhhgtgfeyxiexzf;
        c0055Ujhhgtgfeyxiexzf.f1065Ujhhgtgfeyxiexzf = Math.abs(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void m285feyxiexzfUjhhgtg(C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0055Ujhhgtgfeyxiexzf c0055Ujhhgtgfeyxiexzf) {
        int iMin;
        if (!c0055Ujhhgtgfeyxiexzf.f1064Ujhhgtgfeyxiexzf || c0055Ujhhgtgfeyxiexzf.f1072Ujhhgtgfeyxiexzf) {
            return;
        }
        if (c0055Ujhhgtgfeyxiexzf.f1065Ujhhgtgfeyxiexzf == 0) {
            if (c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf == -1) {
                m286feyxiexzfUjhhgtg(c0055Ujhhgtgfeyxiexzf.f1070Ujhhgtgfeyxiexzf, c0831feyxiexzfUjhhgtg);
                return;
            } else {
                m287feyxiexzfUjhhgtg(c0055Ujhhgtgfeyxiexzf.f1069Ujhhgtgfeyxiexzf, c0831feyxiexzfUjhhgtg);
                return;
            }
        }
        int i = 1;
        if (c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf == -1) {
            int i2 = c0055Ujhhgtgfeyxiexzf.f1069Ujhhgtgfeyxiexzf;
            int iM4933Ujhhgtgfeyxiexzf = this.f434Ujhhgtgfeyxiexzf[0].m4933Ujhhgtgfeyxiexzf(i2);
            while (i < this.f433Ujhhgtgfeyxiexzf) {
                int iM4933Ujhhgtgfeyxiexzf2 = this.f434Ujhhgtgfeyxiexzf[i].m4933Ujhhgtgfeyxiexzf(i2);
                if (iM4933Ujhhgtgfeyxiexzf2 > iM4933Ujhhgtgfeyxiexzf) {
                    iM4933Ujhhgtgfeyxiexzf = iM4933Ujhhgtgfeyxiexzf2;
                }
                i++;
            }
            int i3 = i2 - iM4933Ujhhgtgfeyxiexzf;
            m286feyxiexzfUjhhgtg(i3 < 0 ? c0055Ujhhgtgfeyxiexzf.f1070Ujhhgtgfeyxiexzf : c0055Ujhhgtgfeyxiexzf.f1070Ujhhgtgfeyxiexzf - Math.min(i3, c0055Ujhhgtgfeyxiexzf.f1065Ujhhgtgfeyxiexzf), c0831feyxiexzfUjhhgtg);
            return;
        }
        int i4 = c0055Ujhhgtgfeyxiexzf.f1070Ujhhgtgfeyxiexzf;
        int iM4931Ujhhgtgfeyxiexzf = this.f434Ujhhgtgfeyxiexzf[0].m4931Ujhhgtgfeyxiexzf(i4);
        while (i < this.f433Ujhhgtgfeyxiexzf) {
            int iM4931Ujhhgtgfeyxiexzf2 = this.f434Ujhhgtgfeyxiexzf[i].m4931Ujhhgtgfeyxiexzf(i4);
            if (iM4931Ujhhgtgfeyxiexzf2 < iM4931Ujhhgtgfeyxiexzf) {
                iM4931Ujhhgtgfeyxiexzf = iM4931Ujhhgtgfeyxiexzf2;
            }
            i++;
        }
        int i5 = iM4931Ujhhgtgfeyxiexzf - c0055Ujhhgtgfeyxiexzf.f1070Ujhhgtgfeyxiexzf;
        if (i5 < 0) {
            iMin = c0055Ujhhgtgfeyxiexzf.f1069Ujhhgtgfeyxiexzf;
        } else {
            iMin = Math.min(i5, c0055Ujhhgtgfeyxiexzf.f1065Ujhhgtgfeyxiexzf) + c0055Ujhhgtgfeyxiexzf.f1069Ujhhgtgfeyxiexzf;
        }
        m287feyxiexzfUjhhgtg(iMin, c0831feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m286feyxiexzfUjhhgtg(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg) {
        for (int iM2203Ujhhgtgfeyxiexzf = m2203Ujhhgtgfeyxiexzf() - 1; iM2203Ujhhgtgfeyxiexzf >= 0; iM2203Ujhhgtgfeyxiexzf--) {
            View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(iM2203Ujhhgtgfeyxiexzf);
            if (this.f435Ujhhgtgfeyxiexzf.mo2977Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf) < i || this.f435Ujhhgtgfeyxiexzf.mo2986Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf) < i) {
                return;
            }
            C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) viewM2202Ujhhgtgfeyxiexzf.getLayoutParams();
            if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                for (int i2 = 0; i2 < this.f433Ujhhgtgfeyxiexzf; i2++) {
                    if (((ArrayList) this.f434Ujhhgtgfeyxiexzf[i2].f10706Ujhhgtgfeyxiexzf).size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f433Ujhhgtgfeyxiexzf; i3++) {
                    this.f434Ujhhgtgfeyxiexzf[i3].m4934Ujhhgtgfeyxiexzf();
                }
            } else if (((ArrayList) c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.f10706Ujhhgtgfeyxiexzf).size() == 1) {
                return;
            } else {
                c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.m4934Ujhhgtgfeyxiexzf();
            }
            m2213Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf, c0831feyxiexzfUjhhgtg);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void m287feyxiexzfUjhhgtg(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg) {
        while (m2203Ujhhgtgfeyxiexzf() > 0) {
            View viewM2202Ujhhgtgfeyxiexzf = m2202Ujhhgtgfeyxiexzf(0);
            if (this.f435Ujhhgtgfeyxiexzf.mo2974Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf) > i || this.f435Ujhhgtgfeyxiexzf.mo2985Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf) > i) {
                return;
            }
            C1140feyxiexzfUjhhgtg c1140feyxiexzfUjhhgtg = (C1140feyxiexzfUjhhgtg) viewM2202Ujhhgtgfeyxiexzf.getLayoutParams();
            if (c1140feyxiexzfUjhhgtg.f4308Ujhhgtgfeyxiexzf) {
                for (int i2 = 0; i2 < this.f433Ujhhgtgfeyxiexzf; i2++) {
                    if (((ArrayList) this.f434Ujhhgtgfeyxiexzf[i2].f10706Ujhhgtgfeyxiexzf).size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f433Ujhhgtgfeyxiexzf; i3++) {
                    this.f434Ujhhgtgfeyxiexzf[i3].m4935Ujhhgtgfeyxiexzf();
                }
            } else if (((ArrayList) c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.f10706Ujhhgtgfeyxiexzf).size() == 1) {
                return;
            } else {
                c1140feyxiexzfUjhhgtg.f4307Ujhhgtgfeyxiexzf.m4935Ujhhgtgfeyxiexzf();
            }
            m2213Ujhhgtgfeyxiexzf(viewM2202Ujhhgtgfeyxiexzf, c0831feyxiexzfUjhhgtg);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m288feyxiexzfUjhhgtg() {
        if (this.f437Ujhhgtgfeyxiexzf == 1 || !m280Ujhhgtgfeyxiexzf()) {
            this.f441Ujhhgtgfeyxiexzf = this.f440Ujhhgtgfeyxiexzf;
        } else {
            this.f441Ujhhgtgfeyxiexzf = !this.f440Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int m289Ujhhgtgfeyxiexzf(int i, C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        if (m2203Ujhhgtgfeyxiexzf() == 0 || i == 0) {
            return 0;
        }
        m284feyxiexzfUjhhgtg(i, c0810feyxiexzfUjhhgtg);
        C0055Ujhhgtgfeyxiexzf c0055Ujhhgtgfeyxiexzf = this.f439Ujhhgtgfeyxiexzf;
        int iM269Ujhhgtgfeyxiexzf = m269Ujhhgtgfeyxiexzf(c0831feyxiexzfUjhhgtg, c0055Ujhhgtgfeyxiexzf, c0810feyxiexzfUjhhgtg);
        if (c0055Ujhhgtgfeyxiexzf.f1065Ujhhgtgfeyxiexzf >= iM269Ujhhgtgfeyxiexzf) {
            i = i < 0 ? -iM269Ujhhgtgfeyxiexzf : iM269Ujhhgtgfeyxiexzf;
        }
        this.f435Ujhhgtgfeyxiexzf.mo2987Ujhhgtgfeyxiexzf(-i);
        this.f447feyxiexzfUjhhgtg = this.f441Ujhhgtgfeyxiexzf;
        c0055Ujhhgtgfeyxiexzf.f1065Ujhhgtgfeyxiexzf = 0;
        m285feyxiexzfUjhhgtg(c0831feyxiexzfUjhhgtg, c0055Ujhhgtgfeyxiexzf);
        return i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m290Ujhhgtgfeyxiexzf(int i) {
        C0055Ujhhgtgfeyxiexzf c0055Ujhhgtgfeyxiexzf = this.f439Ujhhgtgfeyxiexzf;
        c0055Ujhhgtgfeyxiexzf.f1068Ujhhgtgfeyxiexzf = i;
        c0055Ujhhgtgfeyxiexzf.f1067Ujhhgtgfeyxiexzf = this.f441Ujhhgtgfeyxiexzf != (i == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void m291feyxiexzfUjhhgtg(int i, int i2) {
        for (int i3 = 0; i3 < this.f433Ujhhgtgfeyxiexzf; i3++) {
            if (!((ArrayList) this.f434Ujhhgtgfeyxiexzf[i3].f10706Ujhhgtgfeyxiexzf).isEmpty()) {
                m293Ujhhgtgfeyxiexzf(this.f434Ujhhgtgfeyxiexzf[i3], i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m292feyxiexzfUjhhgtg(int i, C0810feyxiexzfUjhhgtg c0810feyxiexzfUjhhgtg) {
        int iMo2984Ujhhgtgfeyxiexzf;
        int iMo2984Ujhhgtgfeyxiexzf2;
        int i2;
        C0055Ujhhgtgfeyxiexzf c0055Ujhhgtgfeyxiexzf = this.f439Ujhhgtgfeyxiexzf;
        boolean z = false;
        c0055Ujhhgtgfeyxiexzf.f1065Ujhhgtgfeyxiexzf = 0;
        c0055Ujhhgtgfeyxiexzf.f1066Ujhhgtgfeyxiexzf = i;
        C0069Ujhhgtgfeyxiexzf c0069Ujhhgtgfeyxiexzf = this.f3264Ujhhgtgfeyxiexzf;
        if (c0069Ujhhgtgfeyxiexzf == null || !c0069Ujhhgtgfeyxiexzf.f1092Ujhhgtgfeyxiexzf || (i2 = c0810feyxiexzfUjhhgtg.f3205Ujhhgtgfeyxiexzf) == -1) {
            iMo2984Ujhhgtgfeyxiexzf = 0;
            iMo2984Ujhhgtgfeyxiexzf2 = 0;
        } else {
            if (this.f441Ujhhgtgfeyxiexzf == (i2 < i)) {
                iMo2984Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2984Ujhhgtgfeyxiexzf();
                iMo2984Ujhhgtgfeyxiexzf2 = 0;
            } else {
                iMo2984Ujhhgtgfeyxiexzf2 = this.f435Ujhhgtgfeyxiexzf.mo2984Ujhhgtgfeyxiexzf();
                iMo2984Ujhhgtgfeyxiexzf = 0;
            }
        }
        RecyclerView recyclerView = this.f3261Ujhhgtgfeyxiexzf;
        if (recyclerView == null || !recyclerView.f364Ujhhgtgfeyxiexzf) {
            c0055Ujhhgtgfeyxiexzf.f1070Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2978Ujhhgtgfeyxiexzf() + iMo2984Ujhhgtgfeyxiexzf;
            c0055Ujhhgtgfeyxiexzf.f1069Ujhhgtgfeyxiexzf = -iMo2984Ujhhgtgfeyxiexzf2;
        } else {
            c0055Ujhhgtgfeyxiexzf.f1069Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2983Ujhhgtgfeyxiexzf() - iMo2984Ujhhgtgfeyxiexzf2;
            c0055Ujhhgtgfeyxiexzf.f1070Ujhhgtgfeyxiexzf = this.f435Ujhhgtgfeyxiexzf.mo2979Ujhhgtgfeyxiexzf() + iMo2984Ujhhgtgfeyxiexzf;
        }
        c0055Ujhhgtgfeyxiexzf.f1071Ujhhgtgfeyxiexzf = false;
        c0055Ujhhgtgfeyxiexzf.f1064Ujhhgtgfeyxiexzf = true;
        if (this.f435Ujhhgtgfeyxiexzf.mo2981Ujhhgtgfeyxiexzf() == 0 && this.f435Ujhhgtgfeyxiexzf.mo2978Ujhhgtgfeyxiexzf() == 0) {
            z = true;
        }
        c0055Ujhhgtgfeyxiexzf.f1072Ujhhgtgfeyxiexzf = z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m293Ujhhgtgfeyxiexzf(C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg, int i, int i2) {
        int i3 = c3434feyxiexzfUjhhgtg.f10704Ujhhgtgfeyxiexzf;
        int i4 = c3434feyxiexzfUjhhgtg.f10705Ujhhgtgfeyxiexzf;
        if (i == -1) {
            int i5 = c3434feyxiexzfUjhhgtg.f10702Ujhhgtgfeyxiexzf;
            if (i5 == Integer.MIN_VALUE) {
                c3434feyxiexzfUjhhgtg.m4925Ujhhgtgfeyxiexzf();
                i5 = c3434feyxiexzfUjhhgtg.f10702Ujhhgtgfeyxiexzf;
            }
            if (i5 + i3 <= i2) {
                this.f442feyxiexzfUjhhgtg.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c3434feyxiexzfUjhhgtg.f10703Ujhhgtgfeyxiexzf;
        if (i6 == Integer.MIN_VALUE) {
            c3434feyxiexzfUjhhgtg.m4924Ujhhgtgfeyxiexzf();
            i6 = c3434feyxiexzfUjhhgtg.f10703Ujhhgtgfeyxiexzf;
        }
        if (i6 - i3 >= i2) {
            this.f442feyxiexzfUjhhgtg.set(i4, false);
        }
    }
}
