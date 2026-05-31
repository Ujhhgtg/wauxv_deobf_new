package p000;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᲇᛸᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1915 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f6312;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f6313;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6314;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f6315;

    public AbstractC1915() {
        if (C2135.f7055 == null) {
            C2135.f7055 = new C2135(26);
        }
    }

    public boolean hasNext() {
        return this.f6312 < ((C1916) this.f6315).f6322;
    }

    public void remove() {
        C1916 c1916 = (C1916) this.f6315;
        m3851();
        if (this.f6313 == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        c1916.m3861();
        c1916.m3867(this.f6313);
        this.f6313 = -1;
        this.f6314 = c1916.f6324;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int m3849(int i) {
        if (i < this.f6314) {
            return ((ByteBuffer) this.f6315).getShort(this.f6313 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m3850(ViewGroup viewGroup, AbstractC0034 abstractC0034) {
        if (m3854() == null || m3854().getParent() == viewGroup || viewGroup.getTag(-109) == m3854().toString()) {
            return;
        }
        if (m3854().getParent() != null) {
            ((ViewGroup) m3854().getParent()).removeView(m3854());
        }
        ViewGroup.LayoutParams layoutParams = m3854().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        viewGroup.addView(m3854(), layoutParams);
        mo3856(abstractC0034, m3854());
        View viewM3854 = m3854();
        if (abstractC0034.hashCode() == this.f6313 && viewM3854.hashCode() == this.f6314) {
            return;
        }
        this.f6313 = abstractC0034.hashCode();
        this.f6314 = viewM3854.hashCode();
        m3854();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m3851() {
        if (((C1916) this.f6315).f6324 != this.f6314) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public abstract Object mo3852(View view);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public abstract void mo3853(View view, Object obj);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public View m3854() {
        if (((View) this.f6315) == null) {
            this.f6315 = AbstractC2902.m4890(AbstractC0034.m884()).inflate(this.f6312, (ViewGroup) new RelativeLayout(AbstractC0034.m884()), false);
        }
        return (View) this.f6315;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public void m3855() {
        while (true) {
            int i = this.f6312;
            C1916 c1916 = (C1916) this.f6315;
            if (i >= c1916.f6322 || c1916.f6319[i] >= 0) {
                return;
            } else {
                this.f6312 = i + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public abstract void mo3856(AbstractC0034 abstractC0034, View view);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void m3857(View view, Object obj) {
        Object tag;
        C0086 c0086;
        if (Build.VERSION.SDK_INT >= this.f6313) {
            mo3853(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f6313) {
            tag = mo3852(view);
        } else {
            tag = view.getTag(this.f6312);
            if (!((Class) this.f6315).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo3858(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM5174 = AbstractC3638.m5174(view);
            if (accessibilityDelegateM5174 == null) {
                c0086 = null;
            } else {
                c0086 = accessibilityDelegateM5174 instanceof C0085 ? ((C0085) accessibilityDelegateM5174).f1090 : new C0086(accessibilityDelegateM5174);
            }
            if (c0086 == null) {
                c0086 = new C0086();
            }
            AbstractC3638.m5183(view, c0086);
            view.setTag(this.f6312, obj);
            AbstractC3638.m5178(view, this.f6314);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public abstract boolean mo3858(Object obj, Object obj2);

    public AbstractC1915(int i) {
        if (AbstractC0034.m884() == null) {
            AbstractC1469 abstractC1469 = AbstractC1037.f3785;
            Log.e(">>>", "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki");
        } else {
            this.f6312 = i;
            this.f6315 = AbstractC2902.m4890(AbstractC0034.m884()).inflate(i, (ViewGroup) new RelativeLayout(AbstractC0034.m884()), false);
        }
    }
}
