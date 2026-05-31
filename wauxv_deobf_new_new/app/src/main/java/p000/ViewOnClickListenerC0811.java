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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᤞᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0811 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3181;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f3182;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f3183;

    public /* synthetic */ ViewOnClickListenerC0811(Object obj, int i, Object obj2) {
        this.f3181 = i;
        this.f3183 = obj;
        this.f3182 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0815 c0815;
        String[] strArr;
        boolean zM4363;
        MaterialTextView materialTextView;
        C2947 c2947;
        ModuleRecyclerView moduleRecyclerView;
        C2950 c2950;
        int i = this.f3181;
        ModuleRecyclerView moduleRecyclerView2 = null;
        Object obj = this.f3182;
        Object obj2 = this.f3183;
        int i2 = 1;
        switch (i) {
            case 0:
                C0814 c0814 = (C0814) obj;
                if (((Boolean) ((InterfaceC1433) obj2).invoke(c0814)).booleanValue()) {
                    return;
                }
                ((C1993) c0814.f3189.getValue()).m3983();
                return;
            case 1:
                InterfaceC1437 interfaceC1437 = (InterfaceC1437) obj2;
                C0814 c0816 = (C0814) obj;
                C0815 c0817 = c0816.f3188;
                if (c0817 == null) {
                    "info";
                    c0815 = null;
                } else {
                    c0815 = c0817;
                }
                if (((Boolean) interfaceC1437.mo1342(c0815.m2484(), c0816)).booleanValue()) {
                    return;
                }
                ((C1993) c0816.f3189.getValue()).m3983();
                return;
            case 2:
                C2400 c2400 = (C2400) obj2;
                C2735 c2735 = (C2735) obj;
                String[] strArr2 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622(view, R.layout.module_dialog_plugin_readme, null, false);
                MaterialTextView materialTextView2 = (MaterialTextView) AbstractC1272.m3098(viewM4622, R.id.moduleDialogTvPluginReadme);
                if (materialTextView2 == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(R.id.moduleDialogTvPluginReadme)));
                }
                LinearLayout linearLayout = (LinearLayout) viewM4622;
                Context context = materialTextView2.getContext();
                ArrayList<C0869> arrayList = new ArrayList(3);
                TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
                arrayList.add(new C0869());
                arrayList.add(new C0869(c2735));
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                HashSet hashSet = new HashSet(3);
                for (C0869 c0869 : arrayList) {
                    if (!arrayList2.contains(c0869)) {
                        if (hashSet.contains(c0869)) {
                            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
                        }
                        hashSet.add(c0869);
                        c0869.getClass();
                        hashSet.remove(c0869);
                        if (!arrayList2.contains(c0869)) {
                            if (C0869.class.isAssignableFrom(c0869.getClass())) {
                                arrayList2.add(0, c0869);
                            } else {
                                arrayList2.add(c0869);
                            }
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                LinkedHashSet linkedHashSet = C1093.f3920;
                float f = context.getResources().getDisplayMetrics().density;
                C1928 c1928 = new C1928();
                c1928.f6353 = (int) ((8 * f) + 0.5f);
                c1928.f6350 = (int) ((24 * f) + 0.5f);
                int i3 = (int) ((4 * f) + 0.5f);
                c1928.f6351 = i3;
                int i4 = (int) ((1 * f) + 0.5f);
                c1928.f6352 = i4;
                c1928.f6354 = i4;
                c1928.f6355 = i3;
                C1215 c1215 = new C1215();
                C0967 c0967 = new C0967(4);
                C0967 c0968 = new C0967(3);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C0869 c08610 = (C0869) it.next();
                    c08610.getClass();
                    ArrayList arrayList6 = arrayList2;
                    switch (c08610.f3304) {
                        case 1:
                            c1215.f4377 = new C0441((C2735) c08610.f3305);
                            break;
                    }
                    ArrayList arrayList7 = arrayList5;
                    LinkedHashSet linkedHashSet2 = linkedHashSet;
                    String[] strArr3 = strArr2;
                    LinearLayout linearLayout2 = linearLayout;
                    TextView.BufferType bufferType2 = bufferType;
                    MaterialTextView materialTextView3 = materialTextView2;
                    switch (c08610.f3304) {
                        case 0:
                            c0967.m2570(C2960.class, new C0868(c08610));
                            c0967.m2570(C2910.class, new C0867(6));
                            c0967.m2570(C1185.class, new C0867(7));
                            c0967.m2570(C0406.class, new C0867(8));
                            c0967.m2570(C0728.class, new C0867(9));
                            c0967.m2570(C1296.class, new C0867(10));
                            c0967.m2570(C1639.class, new C0867(11));
                            c0967.m2570(C1618.class, new C0867(12));
                            c0967.m2570(C0489.class, new C0867(14));
                            c0967.m2570(C2337.class, new C0867(14));
                            c0967.m2570(C1838.class, new C0867(13));
                            c0967.m2570(C2976.class, new C0867(0));
                            c0967.m2570(C1535.class, new C0867(1));
                            c0967.m2570(C2843.class, new C0867(2));
                            c0967.m2570(C1530.class, new C0867(3));
                            c0967.m2570(C2362.class, new C0867(4));
                            c0967.m2570(C1816.class, new C0867(5));
                            break;
                    }
                    switch (c08610.f3304) {
                        case 0:
                            C0410 c0410 = new C0410(1);
                            c0968.m2571(C2910.class, new C0410(7));
                            c0968.m2571(C1185.class, new C0410(3));
                            c0968.m2571(C0406.class, new C0410(0));
                            c0968.m2571(C0728.class, new C0410(2));
                            c0968.m2571(C1296.class, c0410);
                            c0968.m2571(C1639.class, c0410);
                            c0968.m2571(C1838.class, new C0410(6));
                            c0968.m2571(C1535.class, new C0410(4));
                            c0968.m2571(C1816.class, new C0410(5));
                            c0968.m2571(C2976.class, new C0410(8));
                            break;
                    }
                    arrayList2 = arrayList6;
                    it = it;
                    arrayList5 = arrayList7;
                    linkedHashSet = linkedHashSet2;
                    strArr2 = strArr3;
                    linearLayout = linearLayout2;
                    bufferType = bufferType2;
                    materialTextView2 = materialTextView3;
                    c2400 = c2400;
                }
                String[] strArr4 = strArr2;
                ArrayList arrayList8 = arrayList2;
                C2400 c2401 = c2400;
                LinearLayout linearLayout3 = linearLayout;
                MaterialTextView materialTextView4 = materialTextView2;
                TextView.BufferType bufferType3 = bufferType;
                ArrayList arrayList9 = arrayList5;
                LinkedHashSet linkedHashSet3 = linkedHashSet;
                C1928 c1929 = new C1928();
                c1929.f6350 = c1928.f6350;
                c1929.f6351 = c1928.f6351;
                c1929.f6352 = c1928.f6352;
                c1929.f6353 = c1928.f6353;
                c1929.f6354 = c1928.f6354;
                c1929.f6355 = c1928.f6355;
                C1477 c1477 = new C1477(Collections.unmodifiableMap(c0968.f3505));
                c1215.f4374 = c1929;
                c1215.f4380 = c1477;
                if (((C1139) c1215.f4375) == null) {
                    c1215.f4375 = new C1139();
                }
                if (((C2135) c1215.f4376) == null) {
                    c1215.f4376 = new C2135(19);
                }
                if (((InterfaceC1819) c1215.f4377) == null) {
                    c1215.f4377 = new C1224(22);
                }
                if (((C1224) c1215.f4378) == null) {
                    c1215.f4378 = new C1224(18);
                }
                if (((C1224) c1215.f4379) == null) {
                    c1215.f4379 = new C1224(19);
                }
                C1927 c1927 = new C1927(c1215);
                LinkedHashSet linkedHashSet4 = C1093.f3920;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(arrayList3);
                Iterator it2 = linkedHashSet3.iterator();
                while (it2.hasNext()) {
                    arrayList10.add(C1093.f3921.get((Class) it2.next()));
                }
                C2135 c2135 = new C2135(6);
                new C1654(new C0519(arrayList4, 16, Collections.EMPTY_MAP));
                List listUnmodifiableList = Collections.unmodifiableList(arrayList8);
                String str = (String) c2401.f7689.getValue();
                Iterator it3 = listUnmodifiableList.iterator();
                while (it3.hasNext()) {
                    ((C0869) it3.next()).getClass();
                }
                if (str == null) {
                    throw new NullPointerException("input must not be null");
                }
                C1093 c1093 = new C1093(arrayList10, c2135, arrayList4);
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
                            c1093.m2784(str.substring(i5));
                        }
                        c1093.m2781(c1093.f3935);
                        C0519 c0519 = new C0519(c1093.f3932, 16, c1093.f3934);
                        c1093.f3931.getClass();
                        C1654 c1654 = new C1654(c0519);
                        Iterator it4 = c1093.f3936.iterator();
                        while (it4.hasNext()) {
                            ((AbstractC0061) it4.next()).mo1066(c1654);
                        }
                        C1580 c1580 = (C1580) c1093.f3933.f3919;
                        Iterator it5 = arrayList9.iterator();
                        if (it5.hasNext()) {
                            throw AbstractC1095.m2792(it5);
                        }
                        Iterator it6 = listUnmodifiableList.iterator();
                        while (it6.hasNext()) {
                            ((C0869) it6.next()).getClass();
                        }
                        C2136 c2136 = new C2136(c1927, new C0967(6), new C2852(), Collections.unmodifiableMap(c0967.f3505), new C0348(4));
                        c2136.m4106(c1580);
                        Iterator it7 = listUnmodifiableList.iterator();
                        while (it7.hasNext()) {
                            ((C0869) it7.next()).getClass();
                        }
                        C2852 c2852 = (C2852) c2136.f7061;
                        C2850 c2850 = new C2850(c2852.f9076);
                        for (C2849 c2849 : c2852.f9077) {
                            c2850.setSpan(c2849.f9070, c2849.f9071, c2849.f9072, c2849.f9073);
                        }
                        Iterator it8 = listUnmodifiableList.iterator();
                        while (it8.hasNext()) {
                            switch (((C0869) it8.next()).f3304) {
                                case 0:
                                    C2338[] c2338Arr = (C2338[]) c2850.getSpans(0, c2850.length(), C2338.class);
                                    if (c2338Arr != null) {
                                        TextPaint paint = materialTextView4.getPaint();
                                        for (C2338 c2338 : c2338Arr) {
                                            c2338.f7547 = (int) (paint.measureText(c2338.f7545) + 0.5f);
                                        }
                                    }
                                    C2974[] c2974Arr = (C2974[]) c2850.getSpans(0, c2850.length(), C2974.class);
                                    if (c2974Arr != null) {
                                        for (C2974 c2974 : c2974Arr) {
                                            c2850.removeSpan(c2974);
                                        }
                                    }
                                    C2974 c2975 = new C2974();
                                    materialTextView = materialTextView4;
                                    new WeakReference(materialTextView);
                                    c2850.setSpan(c2975, 0, c2850.length(), 18);
                                    break;
                                default:
                                    materialTextView = materialTextView4;
                                    break;
                            }
                            materialTextView4 = materialTextView;
                        }
                        TextView textView = materialTextView4;
                        textView.setText(c2850, bufferType3);
                        Iterator it9 = listUnmodifiableList.iterator();
                        while (it9.hasNext()) {
                            switch (((C0869) it9.next()).f3304) {
                                case 0:
                                    if (textView.getMovementMethod() == null) {
                                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                                    }
                                    break;
                            }
                        }
                        C2037 c2037 = new C2037();
                        c2037.f6781 = linearLayout3;
                        C2037.m4054(c2037, null, 3);
                        C2426 c2426 = (C2426) AbstractC2419.f7753.get(c2401.f7684);
                        if (c2426 != null) {
                            strArr = strArr4;
                            zM4363 = c2426.m4363("openSettings");
                        } else {
                            strArr = strArr4;
                            C2426 c2426M4356 = AbstractC2419.m4356(c2401);
                            zM4363 = c2426M4356 != null && c2426M4356.m4363("openSettings");
                        }
                        if (zM4363) {
                            c2037.m4056("设置", new C2399(c2401, 6));
                        }
                        c2037.m4055().m3985();
                        return;
                    }
                    c1093.m2784(str.substring(i5, i6));
                    i5 = i6 + 1;
                    if (i5 < str.length() && str.charAt(i6) == '\r') {
                        if (str.charAt(i5) == '\n') {
                            i5 = i6 + 2;
                        }
                    }
                }
                break;
            default:
                C2735 c2736 = (C2735) obj2;
                C2730 c2730 = (C2730) obj;
                c2736.m4717();
                int i7 = c2730.f8753;
                int i8 = c2730.f8755;
                String[] strArr5 = AbstractC1471.f5234;
                ModuleTabLayout moduleTabLayout = c2736.f8768;
                if (moduleTabLayout == null) {
                    "tabLayout";
                    moduleTabLayout = null;
                }
                if (i7 >= 0) {
                    if (i7 < moduleTabLayout.getTabCount()) {
                        c2947 = (C2947) moduleTabLayout.f9434.get(i7);
                    }
                    if (c2947 != null) {
                        c2950 = c2947.f9416;
                        if (c2950 != null) {
                            throw new IllegalArgumentException("Tab not attached to a TabLayout");
                        }
                        c2950.m4958(c2947);
                    }
                    moduleRecyclerView = c2736.f8773;
                    if (moduleRecyclerView == null) {
                        "recyclerView";
                        moduleRecyclerView = null;
                    }
                    if (moduleRecyclerView.isLaidOut() || moduleRecyclerView.isLayoutRequested()) {
                        moduleRecyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2731(c2736, i8));
                        return;
                    }
                    ModuleRecyclerView moduleRecyclerView3 = c2736.f8773;
                    if (moduleRecyclerView3 == null) {
                        "recyclerView";
                    } else {
                        moduleRecyclerView2 = moduleRecyclerView3;
                    }
                    if (moduleRecyclerView2.m228(i8) != null) {
                        moduleRecyclerView2.postDelayed(new RunnableC1020(moduleRecyclerView2, i8, c2736, i2), 150L);
                        return;
                    }
                    C2733 c2733 = new C2733(c2736, i8);
                    if (moduleRecyclerView2.f413 == null) {
                        moduleRecyclerView2.f413 = new ArrayList();
                    }
                    moduleRecyclerView2.f413.add(c2733);
                    moduleRecyclerView2.m256(i8);
                    return;
                }
                moduleTabLayout.getClass();
                c2947 = null;
                if (c2947 != null) {
                    c2950 = c2947.f9416;
                    if (c2950 != null) {
                        throw new IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                    c2950.m4958(c2947);
                }
                moduleRecyclerView = c2736.f8773;
                if (moduleRecyclerView == null) {
                    "recyclerView";
                    moduleRecyclerView = null;
                }
                if (moduleRecyclerView.isLaidOut()) {
                }
                moduleRecyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2731(c2736, i8));
                return;
        }
    }
}
