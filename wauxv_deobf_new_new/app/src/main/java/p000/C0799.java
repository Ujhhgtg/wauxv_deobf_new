package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import de.robv.android.xposed.XposedBridge;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᤞᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0799 extends AbstractC2537 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public List f3165 = C1191.f4326;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0814 f3166;

    public C0799(C0814 c0814) {
        this.f3166 = c0814;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static void m2467(C0799 c0799, List list) {
        c0799.getClass();
        if (list == null) {
            list = C1191.f4326;
        }
        c0799.f3165 = list;
        c0799.m4462();
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo2124() {
        return this.f3165.size();
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final long mo2468(int i) {
        return i;
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2125(AbstractC2563 abstractC2563, int i) {
        if (abstractC2563 instanceof C2871) {
            C2135.m4076(((C2871) abstractC2563).f9173);
        } else {
            m2474(abstractC2563, AbstractC0739.m2292(i, this.f3165));
        }
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void mo2471(AbstractC2563 abstractC2563, int i, List list) {
        if (list.isEmpty()) {
            mo2125(abstractC2563, i);
        } else if (abstractC2563 instanceof C2871) {
            C2135.m4076(((C2871) abstractC2563).f9173);
        } else {
            m2474(abstractC2563, AbstractC0739.m2292(i, this.f3165));
        }
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final AbstractC2563 mo2126(ViewGroup viewGroup, int i) {
        return i == R.id.BaseQuickAdapter_empty_view ? new C2871(viewGroup) : new C2503(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_contact, viewGroup, false));
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void mo2473(AbstractC2563 abstractC2563) {
        int iM4533 = abstractC2563.m4533();
        if ((abstractC2563 instanceof C2871) || (iM4533 != -1 && iM4533 == R.id.BaseQuickAdapter_empty_view)) {
            View view = abstractC2563.f8157;
            if (view.getLayoutParams() instanceof C2863) {
                ((C2863) view.getLayoutParams()).f9105 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2474(AbstractC2563 abstractC2563, Object obj) {
        C2503 c2503 = (C2503) abstractC2563;
        C0800 c0800 = (C0800) obj;
        if (c0800 != null) {
            CheckBox checkBox = (CheckBox) c2503.m4446(R.id.itemContactCheckBoxSelect);
            checkBox.setChecked(c0800.f3170);
            checkBox.setOnCheckedChangeListener(new C0710(c0800, 1, this));
            c2503.f8157.setOnClickListener(new ViewOnClickListenerC0111(c2503, 3));
            C0332 c0332 = C0332.f1647;
            ImageView imageView = (ImageView) c2503.m4446(R.id.itemContactImageViewAvatar);
            String str = c0800.f3167;
            c0332.getClass();
            XposedBridge.invokeOriginalMethod(AbstractC0972.m2610(C0331.f1646), (Object) null, new Object[]{imageView, str, Float.valueOf(0.1f), Boolean.FALSE});
            ((TextView) c2503.m4446(R.id.itemContactTextViewName)).setText(c0800.f3168);
            ((TextView) c2503.m4446(R.id.itemContactTextViewDesc)).setText(c0800.f3169);
        }
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void mo2472() {
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int mo2469(int i) {
        return i;
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo2470(RecyclerView recyclerView) {
    }
}
