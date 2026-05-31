package p000;

import android.content.Context;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲈᲁᲀᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0653 extends AbstractC2927 implements InterfaceC1587, InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0653 f2528;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f2529;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2530;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f2531;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C0635 f2532;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final boolean f2533;

    static {
        String[] strArr = AbstractC1471.f5234;
        f2528 = new C0653("ChatToolbarHook");
        f2529 = "界面";
        f2530 = "聊天工具栏";
        f2531 = "聊天输入框顶部显示工具栏，可能串台";
        f2532 = new C0635(18);
        f2533 = true;
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C0647.f2520, dexKitBridge, new C0635(19));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        C3752 c3752M4301 = C2342.m4301(this, Collections.singletonList(AbstractC0972.m2610(C0647.f2520)));
        C0635 c0635 = new C0635(20);
        C0653 c0653 = f2528;
        c0653.m3444(c3752M4301, c0635);
        c0653.m3443(c3752M4301, new C0635(21));
        c3752M4301.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f2531;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f2530;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f2529;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f2532;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final boolean mo1277() {
        return f2533;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m2151(FrameLayout frameLayout) {
        int iM3308;
        String[] strArr = AbstractC1471.f5234;
        if (mo3445()) {
            C0656.f2539.getClass();
            C1576.f5470.getClass();
            if (C1576.m3460()) {
                iM3308 = C0655.f2538.m2662();
            } else {
                iM3308 = AbstractC1468.m3308(AbstractC0972.m2596(EnumC3737.f11678) ? "bl9" : "b4u");
            }
            LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(iM3308);
            if (linearLayout != null) {
                ViewParent parent = linearLayout.getParent();
                "null cannot be cast to non-null type android.widget.LinearLayout";
                LinearLayout linearLayout2 = (LinearLayout) parent;
                if (linearLayout2.findViewWithTag("ChatToolbar") == null) {
                    AbstractC2902.m4896(linearLayout2.getContext());
                    Context context = linearLayout2.getContext();
                    f2528.getClass();
                    C0649 c0649 = new C0649();
                    RecyclerView recyclerView = new RecyclerView(context, null);
                    recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    recyclerView.setTag("ChatToolbar");
                    recyclerView.setLayoutManager(new LinearLayoutManager(0));
                    recyclerView.setPadding((int) AbstractC2234.m4163(8, context), (int) AbstractC2234.m4163(8, context), (int) AbstractC2234.m4163(8, context), (int) AbstractC2234.m4163(8, context));
                    recyclerView.setFadingEdgeLength((int) AbstractC2234.m4163(10, context));
                    recyclerView.setHorizontalFadingEdgeEnabled(true);
                    recyclerView.setHorizontalScrollBarEnabled(false);
                    recyclerView.setOverScrollMode(2);
                    recyclerView.setAdapter(c0649);
                    new C1700(new C0602(c0649, recyclerView, c0649.f2524)).m3579(recyclerView);
                    linearLayout2.addView(recyclerView, 0);
                }
            }
        }
    }
}
