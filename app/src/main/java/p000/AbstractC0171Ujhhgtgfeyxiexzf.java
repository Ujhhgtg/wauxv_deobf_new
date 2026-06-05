package p000;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ能不能ᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0171Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f1355Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f1356Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f1357Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Object f1358Ujhhgtgfeyxiexzf;

    public AbstractC0171Ujhhgtgfeyxiexzf() {
        if (C0420Ujhhgtgfeyxiexzf.f2256Ujhhgtgfeyxiexzf == null) {
            C0420Ujhhgtgfeyxiexzf.f2256Ujhhgtgfeyxiexzf = new C0420Ujhhgtgfeyxiexzf(26);
        }
    }

    public boolean hasNext() {
        return this.f1355Ujhhgtgfeyxiexzf < ((C0174Ujhhgtgfeyxiexzf) this.f1358Ujhhgtgfeyxiexzf).f1370Ujhhgtgfeyxiexzf;
    }

    public void remove() {
        C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = (C0174Ujhhgtgfeyxiexzf) this.f1358Ujhhgtgfeyxiexzf;
        m1225Ujhhgtgfeyxiexzf();
        if (this.f1356Ujhhgtgfeyxiexzf == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        c0174Ujhhgtgfeyxiexzf.m1237Ujhhgtgfeyxiexzf();
        c0174Ujhhgtgfeyxiexzf.m1243Ujhhgtgfeyxiexzf(this.f1356Ujhhgtgfeyxiexzf);
        this.f1356Ujhhgtgfeyxiexzf = -1;
        this.f1357Ujhhgtgfeyxiexzf = c0174Ujhhgtgfeyxiexzf.f1372Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int m1223Ujhhgtgfeyxiexzf(int i) {
        if (i < this.f1357Ujhhgtgfeyxiexzf) {
            return ((ByteBuffer) this.f1358Ujhhgtgfeyxiexzf).getShort(this.f1356Ujhhgtgfeyxiexzf + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public void m1224Ujhhgtgfeyxiexzf(ViewGroup viewGroup, Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf) {
        if (m1228Ujhhgtgfeyxiexzf() == null || m1228Ujhhgtgfeyxiexzf().getParent() == viewGroup || viewGroup.getTag(-109) == m1228Ujhhgtgfeyxiexzf().toString()) {
            return;
        }
        if (m1228Ujhhgtgfeyxiexzf().getParent() != null) {
            ((ViewGroup) m1228Ujhhgtgfeyxiexzf().getParent()).removeView(m1228Ujhhgtgfeyxiexzf());
        }
        ViewGroup.LayoutParams layoutParams = m1228Ujhhgtgfeyxiexzf().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        viewGroup.addView(m1228Ujhhgtgfeyxiexzf(), layoutParams);
        mo1230Ujhhgtgfeyxiexzf(ujhhgtgfeyxiexzf, m1228Ujhhgtgfeyxiexzf());
        View viewM1228Ujhhgtgfeyxiexzf = m1228Ujhhgtgfeyxiexzf();
        if (ujhhgtgfeyxiexzf.hashCode() == this.f1356Ujhhgtgfeyxiexzf && viewM1228Ujhhgtgfeyxiexzf.hashCode() == this.f1357Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f1356Ujhhgtgfeyxiexzf = ujhhgtgfeyxiexzf.hashCode();
        this.f1357Ujhhgtgfeyxiexzf = viewM1228Ujhhgtgfeyxiexzf.hashCode();
        m1228Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m1225Ujhhgtgfeyxiexzf() {
        if (((C0174Ujhhgtgfeyxiexzf) this.f1358Ujhhgtgfeyxiexzf).f1372Ujhhgtgfeyxiexzf != this.f1357Ujhhgtgfeyxiexzf) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public abstract Object mo1226Ujhhgtgfeyxiexzf(View view);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public abstract void mo1227Ujhhgtgfeyxiexzf(View view, Object obj);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public View m1228Ujhhgtgfeyxiexzf() {
        if (((View) this.f1358Ujhhgtgfeyxiexzf) == null) {
            this.f1358Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1328Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf.m885Ujhhgtgfeyxiexzf()).inflate(this.f1355Ujhhgtgfeyxiexzf, (ViewGroup) new RelativeLayout(Ujhhgtgfeyxiexzf.m885Ujhhgtgfeyxiexzf()), false);
        }
        return (View) this.f1358Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public void m1229Ujhhgtgfeyxiexzf() {
        while (true) {
            int i = this.f1355Ujhhgtgfeyxiexzf;
            C0174Ujhhgtgfeyxiexzf c0174Ujhhgtgfeyxiexzf = (C0174Ujhhgtgfeyxiexzf) this.f1358Ujhhgtgfeyxiexzf;
            if (i >= c0174Ujhhgtgfeyxiexzf.f1370Ujhhgtgfeyxiexzf || c0174Ujhhgtgfeyxiexzf.f1367Ujhhgtgfeyxiexzf[i] >= 0) {
                return;
            } else {
                this.f1355Ujhhgtgfeyxiexzf = i + 1;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public abstract void mo1230Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf, View view);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void m1231Ujhhgtgfeyxiexzf(View view, Object obj) {
        Object tag;
        C2949feyxiexzfUjhhgtg c2949feyxiexzfUjhhgtg;
        if (Build.VERSION.SDK_INT >= this.f1356Ujhhgtgfeyxiexzf) {
            mo1227Ujhhgtgfeyxiexzf(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f1356Ujhhgtgfeyxiexzf) {
            tag = mo1226Ujhhgtgfeyxiexzf(view);
        } else {
            tag = view.getTag(this.f1355Ujhhgtgfeyxiexzf);
            if (!((Class) this.f1358Ujhhgtgfeyxiexzf).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo1232Ujhhgtgfeyxiexzf(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM3256Ujhhgtgfeyxiexzf = AbstractC1901feyxiexzfUjhhgtg.m3256Ujhhgtgfeyxiexzf(view);
            if (accessibilityDelegateM3256Ujhhgtgfeyxiexzf == null) {
                c2949feyxiexzfUjhhgtg = null;
            } else {
                c2949feyxiexzfUjhhgtg = accessibilityDelegateM3256Ujhhgtgfeyxiexzf instanceof C2948feyxiexzfUjhhgtg ? ((C2948feyxiexzfUjhhgtg) accessibilityDelegateM3256Ujhhgtgfeyxiexzf).f9249Ujhhgtgfeyxiexzf : new C2949feyxiexzfUjhhgtg(accessibilityDelegateM3256Ujhhgtgfeyxiexzf);
            }
            if (c2949feyxiexzfUjhhgtg == null) {
                c2949feyxiexzfUjhhgtg = new C2949feyxiexzfUjhhgtg();
            }
            AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(view, c2949feyxiexzfUjhhgtg);
            view.setTag(this.f1355Ujhhgtgfeyxiexzf, obj);
            AbstractC1901feyxiexzfUjhhgtg.m3260Ujhhgtgfeyxiexzf(view, this.f1357Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public abstract boolean mo1232Ujhhgtgfeyxiexzf(Object obj, Object obj2);

    public AbstractC0171Ujhhgtgfeyxiexzf(int i) {
        if (Ujhhgtgfeyxiexzf.m885Ujhhgtgfeyxiexzf() == null) {
            AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
            Log.e(">>>", "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki");
        } else {
            this.f1355Ujhhgtgfeyxiexzf = i;
            this.f1358Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1328Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf.m885Ujhhgtgfeyxiexzf()).inflate(i, (ViewGroup) new RelativeLayout(Ujhhgtgfeyxiexzf.m885Ujhhgtgfeyxiexzf()), false);
        }
    }
}
