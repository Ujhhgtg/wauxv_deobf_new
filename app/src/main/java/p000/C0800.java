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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲁᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0800 extends AbstractC2482 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public List f3158 = C1189.f4329;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0815 f3159;

    public C0800(C0815 c0815) {
        this.f3159 = c0815;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static void m2351(C0800 c0800, List list) {
        c0800.getClass();
        if (list == null) {
            list = C1189.f4329;
        }
        c0800.f3158 = list;
        c0800.m4441();
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo2040() {
        return this.f3158.size();
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final long mo2352(int i) {
        return i;
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2041(AbstractC2508 abstractC2508, int i) {
        if (abstractC2508 instanceof C2811) {
            C2102.m3893(((C2811) abstractC2508).f9011);
        } else {
            m2358(abstractC2508, AbstractC0744.m2193(i, this.f3158));
        }
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void mo2355(AbstractC2508 abstractC2508, int i, List list) {
        if (list.isEmpty()) {
            mo2041(abstractC2508, i);
        } else if (abstractC2508 instanceof C2811) {
            C2102.m3893(((C2811) abstractC2508).f9011);
        } else {
            m2358(abstractC2508, AbstractC0744.m2193(i, this.f3158));
        }
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final AbstractC2508 mo2042(ViewGroup viewGroup, int i) {
        return i == R.id.BaseQuickAdapter_empty_view ? new C2811(viewGroup) : new C2452(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_contact, viewGroup, false));
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void mo2357(AbstractC2508 abstractC2508) {
        if ((abstractC2508 instanceof C2811) || abstractC2508.m4511() == R.id.BaseQuickAdapter_empty_view) {
            View view = abstractC2508.f8006;
            if (view.getLayoutParams() instanceof C2804) {
                ((C2804) view.getLayoutParams()).f8944 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2358(AbstractC2508 abstractC2508, Object obj) {
        C2452 c2452 = (C2452) abstractC2508;
        C0801 c0801 = (C0801) obj;
        if (c0801 != null) {
            CheckBox checkBox = (CheckBox) c2452.m4425(R.id.itemContactCheckBoxSelect);
            checkBox.setChecked(c0801.f3163);
            checkBox.setOnCheckedChangeListener(new C0715(c0801, 1, this));
            c2452.f8006.setOnClickListener(new ViewOnClickListenerC0103(3, c2452));
            C0321 c0321 = C0321.f1572;
            ImageView imageView = (ImageView) c2452.m4425(R.id.itemContactImageViewAvatar);
            String str = c0801.f3160;
            c0321.getClass();
            XposedBridge.invokeOriginalMethod(AbstractC1574.m3315(C0320.f1571), (Object) null, new Object[]{imageView, str, Float.valueOf(0.1f), Boolean.FALSE});
            ((TextView) c2452.m4425(R.id.itemContactTextViewName)).setText(c0801.f3161);
            ((TextView) c2452.m4425(R.id.itemContactTextViewDesc)).setText(c0801.f3162);
        }
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void mo2356() {
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int mo2353(int i) {
        return i;
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo2354(RecyclerView recyclerView) {
    }
}
