package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲈᛸᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1889 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f6238;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6239;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f6240;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Object f6241;

    public AbstractC1889() {
        if (C2102.f6931 == null) {
            C2102.f6931 = new C2102(26);
        }
    }

    public boolean hasNext() {
        return this.f6238 < ((C1890) this.f6241).f6248;
    }

    public void remove() {
        C1890 c1890 = (C1890) this.f6241;
        m3673();
        if (this.f6239 == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        c1890.m3682();
        c1890.m3688(this.f6239);
        this.f6239 = -1;
        this.f6240 = c1890.f6250;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int m3671(int i) {
        if (i < this.f6240) {
            return ((ByteBuffer) this.f6241).getShort(this.f6239 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m3672(ViewGroup viewGroup, AbstractC0027 abstractC0027) {
        if (m3676() == null || m3676().getParent() == viewGroup || viewGroup.getTag(-109) == m3676().toString()) {
            return;
        }
        if (m3676().getParent() != null) {
            ((ViewGroup) m3676().getParent()).removeView(m3676());
        }
        ViewGroup.LayoutParams layoutParams = m3676().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        viewGroup.addView(m3676(), layoutParams);
        mo3678(abstractC0027, m3676());
        View viewM3676 = m3676();
        if (abstractC0027.hashCode() == this.f6239 && viewM3676.hashCode() == this.f6240) {
            return;
        }
        this.f6239 = abstractC0027.hashCode();
        this.f6240 = viewM3676.hashCode();
        m3676();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public void m3673() {
        if (((C1890) this.f6241).f6250 != this.f6240) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public abstract Object mo3674(View view);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public abstract void mo3675(View view, Object obj);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public View m3676() {
        if (((View) this.f6241) == null) {
            this.f6241 = AbstractC1460.m3216(AbstractC0027.m740()).inflate(this.f6238, (ViewGroup) new RelativeLayout(AbstractC0027.m740()), false);
        }
        return (View) this.f6241;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void m3677() {
        while (true) {
            int i = this.f6238;
            C1890 c1890 = (C1890) this.f6241;
            if (i >= c1890.f6248 || c1890.f6245[i] >= 0) {
                return;
            } else {
                this.f6238 = i + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public abstract void mo3678(AbstractC0027 abstractC0027, View view);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void m3679(View view, Object obj) {
        Object tag;
        C0078 c0078;
        if (Build.VERSION.SDK_INT >= this.f6239) {
            mo3675(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f6239) {
            tag = mo3674(view);
        } else {
            tag = view.getTag(this.f6238);
            if (!((Class) this.f6241).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo3680(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM5168 = AbstractC3578.m5168(view);
            if (accessibilityDelegateM5168 == null) {
                c0078 = null;
            } else {
                c0078 = accessibilityDelegateM5168 instanceof C0077 ? ((C0077) accessibilityDelegateM5168).f1022 : new C0078(accessibilityDelegateM5168);
            }
            if (c0078 == null) {
                c0078 = new C0078();
            }
            AbstractC3578.m5177(view, c0078);
            view.setTag(this.f6238, obj);
            AbstractC3578.m5172(view, this.f6240);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public abstract boolean mo3680(Object obj, Object obj2);
}
