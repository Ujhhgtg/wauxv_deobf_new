package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import me.hd.wauxv.R;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0663 extends AbstractC2867 implements InterfaceC1575, InterfaceC1582 {

    public static final C0663 f2533;

    public static final String f2534;

    public static final String f2535;

    public static final String f2536;

    public static final C0645 f2537;

    public static final boolean f2538;

    public static final ArrayList f2539;

    public static C0658 f2540;

    static {
        String[] strArr = AbstractC1574.f5469;
        f2533 = new C0663("ChatToolbarHook");
        f2534 = "界面";
        f2535 = "聊天工具栏";
        f2536 = "聊天输入框顶部显示工具栏，可能串台";
        f2537 = new C0645(9);
        f2538 = true;
        f2539 = new ArrayList();
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0656.f2518, dexKitBridge, new C0645(10));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        C3689 c3689M4172 = C2309.createHook(this, Collections.singletonList(AbstractC1574.dexToMethod(C0656.f2518)));
        C0645 c0645 = new C0645(11);
        C0663 c0663 = f2533;
        c0663.hookBefore(c3689M4172, c0645);
        c0663.m3262(c3689M4172, new C0645(12));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f2536;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f2535;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f2534;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f2537;
    }

    @Override // p000.AbstractC2867
    public final boolean mo1131() {
        return f2538;
    }

    public final void m2061(FrameLayout frameLayout) {
        String[] strArr = AbstractC1574.f5469;
        if (mo3264()) {
            
            
            LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C1565.m3280() ? C0665.f2545.m2538() : AbstractC0968.m2475(AbstractC3471.m5079(WeChatVersions.f11529) ? "bl9" : "b4u"));
            if (linearLayout != null) {
                ViewParent parent = linearLayout.getParent();
                LinearLayout linearLayout2 = (LinearLayout) parent;
                if (linearLayout2.findViewWithTag("ChatToolbar") == null) {
                    AbstractC2207.m4098(linearLayout2.getContext());
                    Context context = linearLayout2.getContext();
                    
                    C0658 c0658 = f2540;
                    ArrayList arrayList = f2539;
                    if (c0658 == null) {
                        c0658 = new C0658(arrayList);
                        f2540 = c0658;
                    }
                    RecyclerView recyclerView = new RecyclerView(context, null);
                    recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    recyclerView.setTag("ChatToolbar");
                    recyclerView.setLayoutManager(new LinearLayoutManager(0));
                    recyclerView.setPadding((int) AbstractC3681.m5322(8, context), (int) AbstractC3681.m5322(8, context), (int) AbstractC3681.m5322(8, context), (int) AbstractC3681.m5322(8, context));
                    recyclerView.setFadingEdgeLength((int) AbstractC3681.m5322(10, context));
                    recyclerView.setHorizontalFadingEdgeEnabled(true);
                    recyclerView.setHorizontalScrollBarEnabled(false);
                    recyclerView.setOverScrollMode(2);
                    recyclerView.setAdapter(c0658);
                    C1682 c1682 = new C1682(new C0662(c0658, recyclerView, arrayList));
                    RecyclerView recyclerView2 = c1682.f5702;
                    if (recyclerView2 != recyclerView) {
                        C1678 c1678 = c1682.f5710;
                        if (recyclerView2 != null) {
                            recyclerView2.m249(c1682);
                            RecyclerView recyclerView3 = c1682.f5702;
                            recyclerView3.f372.remove(c1678);
                            if (recyclerView3.f373 == c1678) {
                                recyclerView3.f373 = null;
                            }
                            ArrayList arrayList2 = c1682.f5702.f384;
                            if (arrayList2 != null) {
                                arrayList2.remove(c1682);
                            }
                            ArrayList arrayList3 = c1682.f5700;
                            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                                C1679 c1679 = (C1679) arrayList3.get(0);
                                c1679.f5672.cancel();
                                AbstractC2508 abstractC2508 = c1679.f5670;
                                
                                C0662.m2043(abstractC2508);
                            }
                            arrayList3.clear();
                            c1682.f5707 = null;
                            VelocityTracker velocityTracker = c1682.f5704;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                c1682.f5704 = null;
                            }
                            C1681 c1681 = c1682.f5709;
                            if (c1681 != null) {
                                c1681.f5683 = false;
                                c1682.f5709 = null;
                            }
                            if (c1682.f5708 != null) {
                                c1682.f5708 = null;
                            }
                        }
                        c1682.f5702 = recyclerView;
                        Resources resources = recyclerView.getResources();
                        c1682.f5690 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                        c1682.f5691 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                        c1682.f5701 = ViewConfiguration.get(c1682.f5702.getContext()).getScaledTouchSlop();
                        c1682.f5702.m206(c1682);
                        c1682.f5702.f372.add(c1678);
                        RecyclerView recyclerView4 = c1682.f5702;
                        if (recyclerView4.f384 == null) {
                            recyclerView4.f384 = new ArrayList();
                        }
                        recyclerView4.f384.add(c1682);
                        c1682.f5709 = new C1681(c1682);
                        c1682.f5708 = new GestureDetector(c1682.f5702.getContext(), c1682.f5709);
                    }
                    linearLayout2.addView(recyclerView, 0);
                }
            }
        }
    }
}
