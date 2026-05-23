package p000;

import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleRecyclerView;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0812 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3174;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f3175;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f3176;

    public /* synthetic */ ViewOnClickListenerC0812(Object obj, int i, Object obj2) {
        this.f3174 = i;
        this.f3176 = obj;
        this.f3175 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0816 c0816;
        MaterialTextView materialTextView;
        C2888 c2888;
        ModuleRecyclerView moduleRecyclerView;
        C2891 c2891;
        int i = this.f3174;
        ModuleRecyclerView moduleRecyclerView2 = null;
        Object obj = this.f3175;
        Object obj2 = this.f3176;
        int i2 = 1;
        switch (i) {
            case 0:
                C0815 c0815 = (C0815) obj;
                if (((Boolean) ((InterfaceC1425) obj2).invoke(c0815)).booleanValue()) {
                    return;
                }
                c0815.m2362().m3789();
                return;
            case 1:
                InterfaceC1429 interfaceC1429 = (InterfaceC1429) obj2;
                C0815 c0817 = (C0815) obj;
                C0816 c0818 = c0817.f3181;
                if (c0818 == null) {
                    "info";
                    c0816 = null;
                } else {
                    c0816 = c0818;
                }
                if (((Boolean) interfaceC1429.mo1196(c0816.m2368(), c0817)).booleanValue()) {
                    return;
                }
                c0817.m2362().m3789();
                return;
            case 2:
                C2355 c2355 = (C2355) obj2;
                C2675 c2675 = (C2675) obj;
                String[] strArr = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676(view, R.layout.module_dialog_plugin_readme, null, false);
                MaterialTextView materialTextView2 = (MaterialTextView) AbstractC3681.m5325(viewM4676, R.id.moduleDialogTvPluginReadme);
                if (materialTextView2 == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(R.id.moduleDialogTvPluginReadme)));
                }
                LinearLayout linearLayout = (LinearLayout) viewM4676;
                Context context = materialTextView2.getContext();
                ArrayList<C0870> arrayList = new ArrayList(3);
                TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
                arrayList.add(new C0870());
                arrayList.add(new C0870(c2675));
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                HashSet hashSet = new HashSet(3);
                for (C0870 c0870 : arrayList) {
                    if (!arrayList2.contains(c0870)) {
                        if (hashSet.contains(c0870)) {
                            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
                        }
                        hashSet.add(c0870);
                        c0870.getClass();
                        hashSet.remove(c0870);
                        if (!arrayList2.contains(c0870)) {
                            if (C0870.class.isAssignableFrom(c0870.getClass())) {
                                arrayList2.add(0, c0870);
                            } else {
                                arrayList2.add(c0870);
                            }
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                LinkedHashSet linkedHashSet = C1088.f3909;
                float f = context.getResources().getDisplayMetrics().density;
                C1901 c1901 = new C1901();
                c1901.f6274 = (int) ((8 * f) + 0.5f);
                c1901.f6271 = (int) ((24 * f) + 0.5f);
                int i3 = (int) ((4 * f) + 0.5f);
                c1901.f6272 = i3;
                int i4 = (int) ((1 * f) + 0.5f);
                c1901.f6273 = i4;
                c1901.f6275 = i4;
                c1901.f6276 = i3;
                C1214 c1214 = new C1214();
                C0963 c0963 = new C0963(4);
                C0963 c0964 = new C0963(3);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C0870 c0871 = (C0870) it.next();
                    c0871.getClass();
                    ArrayList arrayList6 = arrayList2;
                    switch (c0871.f3297) {
                        case 1:
                            c1214.f4380 = new C0466((C2675) c0871.f3298);
                            break;
                    }
                    ArrayList arrayList7 = arrayList5;
                    LinkedHashSet linkedHashSet2 = linkedHashSet;
                    String[] strArr2 = strArr;
                    LinearLayout linearLayout2 = linearLayout;
                    TextView.BufferType bufferType2 = bufferType;
                    MaterialTextView materialTextView3 = materialTextView2;
                    switch (c0871.f3297) {
                        case 0:
                            c0963.m2451(C2901.class, new C0869(c0871));
                            c0963.m2451(C2850.class, new C0868(6));
                            c0963.m2451(C1183.class, new C0868(7));
                            c0963.m2451(C0431.class, new C0868(8));
                            c0963.m2451(C0733.class, new C0868(9));
                            c0963.m2451(C1295.class, new C0868(10));
                            c0963.m2451(C1626.class, new C0868(11));
                            c0963.m2451(C1605.class, new C0868(12));
                            c0963.m2451(C0512.class, new C0868(14));
                            c0963.m2451(C2304.class, new C0868(14));
                            c0963.m2451(C1811.class, new C0868(13));
                            c0963.m2451(C2917.class, new C0868(0));
                            c0963.m2451(C1523.class, new C0868(1));
                            c0963.m2451(C2783.class, new C0868(2));
                            c0963.m2451(C1518.class, new C0868(3));
                            c0963.m2451(C2322.class, new C0868(4));
                            c0963.m2451(C1793.class, new C0868(5));
                            break;
                    }
                    switch (c0871.f3297) {
                        case 0:
                            C0435 c0435 = new C0435(1);
                            c0964.m2452(C2850.class, new C0435(7));
                            c0964.m2452(C1183.class, new C0435(3));
                            c0964.m2452(C0431.class, new C0435(0));
                            c0964.m2452(C0733.class, new C0435(2));
                            c0964.m2452(C1295.class, c0435);
                            c0964.m2452(C1626.class, c0435);
                            c0964.m2452(C1811.class, new C0435(6));
                            c0964.m2452(C1523.class, new C0435(4));
                            c0964.m2452(C1793.class, new C0435(5));
                            c0964.m2452(C2917.class, new C0435(8));
                            break;
                    }
                    arrayList2 = arrayList6;
                    it = it;
                    arrayList5 = arrayList7;
                    linkedHashSet = linkedHashSet2;
                    strArr = strArr2;
                    linearLayout = linearLayout2;
                    bufferType = bufferType2;
                    materialTextView2 = materialTextView3;
                    c2355 = c2355;
                }
                String[] strArr3 = strArr;
                ArrayList arrayList8 = arrayList2;
                C2355 c2356 = c2355;
                LinearLayout linearLayout3 = linearLayout;
                MaterialTextView materialTextView4 = materialTextView2;
                TextView.BufferType bufferType3 = bufferType;
                ArrayList arrayList9 = arrayList5;
                LinkedHashSet linkedHashSet3 = linkedHashSet;
                C1901 c1902 = new C1901();
                c1902.f6271 = c1901.f6271;
                c1902.f6272 = c1901.f6272;
                c1902.f6273 = c1901.f6273;
                c1902.f6274 = c1901.f6274;
                c1902.f6275 = c1901.f6275;
                c1902.f6276 = c1901.f6276;
                C1466 c1466 = new C1466(Collections.unmodifiableMap(c0964.f3488));
                c1214.f4377 = c1902;
                c1214.f4383 = c1466;
                if (((C1133) c1214.f4378) == null) {
                    c1214.f4378 = new C1133();
                }
                if (((C2102) c1214.f4379) == null) {
                    c1214.f4379 = new C2102(19);
                }
                if (((InterfaceC1796) c1214.f4380) == null) {
                    c1214.f4380 = new C1227(22);
                }
                if (((C1227) c1214.f4381) == null) {
                    c1214.f4381 = new C1227(17);
                }
                if (((C1227) c1214.f4382) == null) {
                    c1214.f4382 = new C1227(18);
                }
                C1676 c1676 = new C1676(c1214);
                LinkedHashSet linkedHashSet4 = C1088.f3909;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(arrayList3);
                Iterator it2 = linkedHashSet3.iterator();
                while (it2.hasNext()) {
                    arrayList10.add(C1088.f3910.get((Class) it2.next()));
                }
                C2102 c2102 = new C2102(6);
                new C1640(new C0542(arrayList4, 15, Collections.EMPTY_MAP));
                List listUnmodifiableList = Collections.unmodifiableList(arrayList8);
                String str = (String) c2356.f7559.getValue();
                Iterator it3 = listUnmodifiableList.iterator();
                while (it3.hasNext()) {
                    ((C0870) it3.next()).getClass();
                }
                if (str == null) {
                    throw new NullPointerException("input must not be null");
                }
                C1088 c1088 = new C1088(arrayList10, c2102, arrayList4);
                int i5 = 0;
                while (true) {
                    int length = str.length();
                    int i6 = i5;
                    while (true) {
                        if (i6 < length) {
                            char cCharAt = str.charAt(i6);
                            if (cCharAt != '\n' && cCharAt != '\r') {
                                i6++;
                            }
                        } else {
                            i6 = -1;
                        }
                    }
                    if (i6 == -1) {
                        if (str.length() > 0 && (i5 == 0 || i5 < str.length())) {
                            c1088.m2658(str.substring(i5));
                        }
                        c1088.m2655(c1088.f3924);
                        C0542 c0542 = new C0542(c1088.f3921, 15, c1088.f3923);
                        c1088.f3920.getClass();
                        C1640 c1640 = new C1640(c0542);
                        Iterator it4 = c1088.f3925.iterator();
                        while (it4.hasNext()) {
                            ((AbstractC0054) it4.next()).mo922(c1640);
                        }
                        C1569 c1569 = (C1569) c1088.f3922.f3908;
                        Iterator it5 = arrayList9.iterator();
                        if (it5.hasNext()) {
                            throw AbstractC1194.m2777(it5);
                        }
                        Iterator it6 = listUnmodifiableList.iterator();
                        while (it6.hasNext()) {
                            ((C0870) it6.next()).getClass();
                        }
                        C2103 c2103 = new C2103(c1676, new C0963(6), new C2792(), Collections.unmodifiableMap(c0963.f3488), new C0373(4));
                        c2103.m3922(c1569);
                        Iterator it7 = listUnmodifiableList.iterator();
                        while (it7.hasNext()) {
                            ((C0870) it7.next()).getClass();
                        }
                        C2792 c2792 = (C2792) c2103.f6937;
                        C2790 c2790 = new C2790(c2792.f8914);
                        for (C2789 c2789 : c2792.f8915) {
                            c2790.setSpan(c2789.f8908, c2789.f8909, c2789.f8910, c2789.f8911);
                        }
                        Iterator it8 = listUnmodifiableList.iterator();
                        while (it8.hasNext()) {
                            switch (((C0870) it8.next()).f3297) {
                                case 0:
                                    C2305[] c2305Arr = (C2305[]) c2790.getSpans(0, c2790.length(), C2305.class);
                                    if (c2305Arr != null) {
                                        TextPaint paint = materialTextView4.getPaint();
                                        for (C2305 c2305 : c2305Arr) {
                                            c2305.f7425 = (int) (paint.measureText(c2305.f7423) + 0.5f);
                                        }
                                    }
                                    C2915[] c2915Arr = (C2915[]) c2790.getSpans(0, c2790.length(), C2915.class);
                                    if (c2915Arr != null) {
                                        for (C2915 c2915 : c2915Arr) {
                                            c2790.removeSpan(c2915);
                                        }
                                    }
                                    C2915 c2916 = new C2915();
                                    materialTextView = materialTextView4;
                                    new WeakReference(materialTextView);
                                    c2790.setSpan(c2916, 0, c2790.length(), 18);
                                    break;
                                default:
                                    materialTextView = materialTextView4;
                                    break;
                            }
                            materialTextView4 = materialTextView;
                        }
                        TextView textView = materialTextView4;
                        textView.setText(c2790, bufferType3);
                        Iterator it9 = listUnmodifiableList.iterator();
                        while (it9.hasNext()) {
                            switch (((C0870) it9.next()).f3297) {
                                case 0:
                                    if (textView.getMovementMethod() == null) {
                                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                                    }
                                    break;
                            }
                        }
                        C2007 c2007 = new C2007();
                        c2007.f6680 = linearLayout3;
                        C2007.m3867(c2007, null, 3);
                        c2007.m3869("设置", new C2354(c2356, 6));
                        c2007.m3868().m3791();
                        return;
                    }
                    c1088.m2658(str.substring(i5, i6));
                    i5 = i6 + 1;
                    if (i5 < str.length() && str.charAt(i6) == '\r') {
                        if (str.charAt(i5) == '\n') {
                            i5 = i6 + 2;
                        }
                    }
                }
                break;
            default:
                C2675 c2676 = (C2675) obj2;
                C2669 c2669 = (C2669) obj;
                c2676.m4683();
                int i7 = c2669.f8594;
                int i8 = c2669.f8596;
                String[] strArr4 = AbstractC1574.f5469;
                ModuleTabLayout moduleTabLayout = c2676.f8610;
                if (moduleTabLayout == null) {
                    "tabLayout";
                    moduleTabLayout = null;
                }
                if (i7 >= 0) {
                    if (i7 < moduleTabLayout.getTabCount()) {
                        c2888 = (C2888) moduleTabLayout.f9267.get(i7);
                    }
                    if (c2888 != null) {
                        c2891 = c2888.f9249;
                        if (c2891 != null) {
                            throw new IllegalArgumentException("Tab not attached to a TabLayout");
                        }
                        c2891.m4896(c2888);
                    }
                    moduleRecyclerView = c2676.f8615;
                    if (moduleRecyclerView == null) {
                        "recyclerView";
                        moduleRecyclerView = null;
                    }
                    if (moduleRecyclerView.isLaidOut() || moduleRecyclerView.isLayoutRequested()) {
                        moduleRecyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2671(c2676, i8));
                        return;
                    }
                    ModuleRecyclerView moduleRecyclerView3 = c2676.f8615;
                    if (moduleRecyclerView3 == null) {
                        "recyclerView";
                    } else {
                        moduleRecyclerView2 = moduleRecyclerView3;
                    }
                    if (moduleRecyclerView2.m228(i8) != null) {
                        moduleRecyclerView2.postDelayed(new RunnableC1017(moduleRecyclerView2, i8, c2676, i2), 150L);
                        return;
                    }
                    C2673 c2673 = new C2673(c2676, i8);
                    if (moduleRecyclerView2.f413 == null) {
                        moduleRecyclerView2.f413 = new ArrayList();
                    }
                    moduleRecyclerView2.f413.add(c2673);
                    moduleRecyclerView2.m256(i8);
                    return;
                }
                moduleTabLayout.getClass();
                c2888 = null;
                if (c2888 != null) {
                    c2891 = c2888.f9249;
                    if (c2891 != null) {
                        throw new IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                    c2891.m4896(c2888);
                }
                moduleRecyclerView = c2676.f8615;
                if (moduleRecyclerView == null) {
                    "recyclerView";
                    moduleRecyclerView = null;
                }
                if (moduleRecyclerView.isLaidOut()) {
                }
                moduleRecyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2671(c2676, i8));
                return;
        }
    }
}
