package p000;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᤞᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0615 extends AbstractC2927 implements InterfaceC1594, InterfaceC1614, InterfaceC1595 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0615 f2456;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final LinkedHashMap f2457;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2458;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f2459;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f2460;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C0581 f2461;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C0581 f2462;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final boolean f2463;

    static {
        AbstractC1471.m3394(-654505771268739L);
        AbstractC1471.m3394(-654548720941699L);
        AbstractC1471.m3394(-654591670614659L);
        AbstractC1471.m3394(-654634620287619L);
        AbstractC1471.m3394(-654677569960579L);
        AbstractC1471.m3394(-654720519633539L);
        AbstractC1471.m3394(-654763469306499L);
        AbstractC1471.m3394(-654806418979459L);
        String[] strArr = AbstractC1471.f5234;
        f2456 = new C0615("ChatGroupTabHook");
        f2457 = new LinkedHashMap();
        f2458 = "界面";
        f2459 = "聊天分组标签";
        f2460 = "添加分组顶部标签栏，顶部栏无法固定";
        f2461 = new C0581(13);
        f2462 = new C0581(14);
        f2463 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static void m2136(C2950 c2950) {
        c2950.setTabMode(2);
        c2950.setTabGravity(1);
        c2950.setTabRippleColor(AbstractC0738.m2266(0));
        c2950.setInlineLabel(true);
        if (AbstractC2234.m4176(c2950.getContext())) {
            c2950.setBackgroundColor(Color.parseColor(C0611.f2451.m2666()));
            c2950.setSelectedTabIndicatorColor(Color.parseColor(C0604.f2444.m2666()));
            c2950.setTabTextColors(C2950.m4949(Color.parseColor(C0606.f2446.m2666()), Color.parseColor(C0608.f2448.m2666())));
        } else {
            c2950.setBackgroundColor(Color.parseColor(C0612.f2452.m2666()));
            c2950.setSelectedTabIndicatorColor(Color.parseColor(C0605.f2445.m2666()));
            c2950.setTabTextColors(C2950.m4949(Color.parseColor(C0607.f2447.m2666()), Color.parseColor(C0609.f2449.m2666())));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public static void m2137(final C2045 c2045, final List list, final C0601 c0601) {
        String[] strArr = AbstractC1471.f5234;
        ChipGroup chipGroup = c2045.f6836;
        chipGroup.removeAllViews();
        ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String lowerCase = ((C1496) it.next()).f5292.toLowerCase(Locale.ROOT);
            "toLowerCase(...)";
            arrayList.add(lowerCase);
        }
        Set setM2308 = AbstractC0739.m2308(arrayList);
        C1498.f5308.getClass();
        List list2 = C1498.f5311;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (((C1496) obj).m3421() != EnumC1497.f5303) {
                arrayList2.add(obj);
            }
        }
        ArrayList<C1496> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            String lowerCase2 = ((C1496) obj2).f5292.toLowerCase(Locale.ROOT);
            "toLowerCase(...)";
            if (!setM2308.contains(lowerCase2)) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            Chip chip = new Chip(chipGroup.getContext(), null);
            chip.setText("已全部添加");
            chip.setEnabled(false);
            chipGroup.addView(chip);
            return;
        }
        for (final C1496 c1496 : arrayList3) {
            Chip chip2 = new Chip(chipGroup.getContext(), null);
            chip2.setText(c1496.f5294);
            chip2.setClickable(true);
            chip2.setCheckable(false);
            chip2.setOnClickListener(new View.OnClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᤞᲈᲁᤝ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List list3 = list;
                    list3.add(C1496.m3419(c1496, list3.size(), null, 29));
                    C0615.f2456.getClass();
                    if (C0615.m2138(list3)) {
                        C0601 c0602 = c0601;
                        c0602.m2127(list3);
                        C0615.m2137(c2045, list3, c0602);
                    } else {
                        if (list3.isEmpty()) {
                            return;
                        }
                        list3.remove(AbstractC0740.m2310(list3));
                    }
                }
            });
            chipGroup.addView(chip2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public static boolean m2138(List list) {
        ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            arrayList.add(C1496.m3419((C1496) obj, i, null, 29));
            i = i2;
        }
        C1498.f5308.getClass();
        boolean zM3424 = C1498.m3424(arrayList);
        if (!zM3424) {
            AbstractC2894.m4856(null, 3, "保存失败");
            return zM3424;
        }
        list.clear();
        list.addAll(arrayList);
        C0610 c0610 = C0610.f2450;
        int iM2662 = c0610.m2662();
        int size = arrayList.size() - 1;
        c0610.m2669(AbstractC3744.m5328(iM2662, size >= 0 ? size : 0));
        m2139();
        return zM3424;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public static void m2139() {
        for (C0598 c0598 : AbstractC0739.m2305(f2457.values())) {
            C2950 c2950 = c0598.f2430;
            C0310 c0310 = c0598.f2431;
            f2456.getClass();
            m2136(c2950);
            m2140(c0598.f2430, c0310);
            c0310.invoke();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public static void m2140(final C2950 c2950, C0310 c0310) {
        c2950.m4957();
        C1498.f5308.getClass();
        List listM3422 = C1498.m3422();
        if (listM3422.isEmpty()) {
            return;
        }
        C0610 c0610 = C0610.f2450;
        int iM5328 = AbstractC3744.m5328(c0610.m2662(), AbstractC0740.m2310(listM3422));
        c0610.m2669(iM5328);
        final int i = 0;
        for (Object obj : listM3422) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            final C1496 c1496 = (C1496) obj;
            C2947 c2947M4956 = c2950.m4956();
            String str = c1496.f5294;
            if (TextUtils.isEmpty(c2947M4956.f9413) && !TextUtils.isEmpty(str)) {
                c2947M4956.f9417.setContentDescription(str);
            }
            c2947M4956.f9412 = str;
            C2949 c2949 = c2947M4956.f9417;
            if (c2949 != null) {
                c2949.m4945();
            }
            c2950.m4950(c2947M4956, i == iM5328);
            final C0310 c0311 = new C0310(c0310, 1, c2950);
            f2456.getClass();
            if (AbstractC2909.m4916(c1496.f5292, EnumC1497.f5303.f5306)) {
                c2950.post(new Runnable() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᲁᤝᤞᲈ
                    @Override // java.lang.Runnable
                    public final void run() {
                        View childAt;
                        View childAt2 = c2950.getChildAt(0);
                        ViewGroup viewGroup = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
                        if (viewGroup == null || (childAt = viewGroup.getChildAt(i)) == null) {
                            return;
                        }
                        final C1496 c1497 = c1496;
                        final C0310 c0312 = c0311;
                        childAt.setOnLongClickListener(new View.OnLongClickListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᲁᤞᲈᤝ
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                C0114 c0114 = new C0114(c0312, 9);
                                C1496 c1498 = c1497;
                                if (!AbstractC2909.m4916(c1498.f5292, EnumC1497.f5303.f5306)) {
                                    return true;
                                }
                                C1787.m3673(C1515.f5343, new C1526(c1498, 3, c0114));
                                return true;
                            }
                        });
                    }
                });
            }
            i = i2;
        }
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C0603.f2443, dexKitBridge, new C0581(15));
    }

    @Override // p000.InterfaceC1614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void mo2141(C1574 c1574, String str) {
        if (mo3445()) {
            String[] strArr = AbstractC1471.f5234;
            int i = 1;
            if (str.startsWith("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, hasTodo, hbMarkRed, remitMarkRed, parentRef from rconversation where ")) {
                C1498.f5308.getClass();
                C1496 c1496 = (C1496) AbstractC0739.m2292(C0610.f2450.m2662(), C1498.m3422());
                if ((c1496 == null && (c1496 = (C1496) AbstractC0739.m2291(C1498.m3422())) == null) || AbstractC2909.m4916(c1496.f5292, EnumC1497.f5298.f5306)) {
                    return;
                }
                c1574.getClass();
                new C0383(i, 6, c1574).m1714("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, hasTodo, hbMarkRed, remitMarkRed, parentRef from rconversation " + c1496.m3420());
            }
            if (str.startsWith("select unReadCount, status, isSend, conversationTime, username, content, msgType,flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, editingQuoteMsgId, hasTodo, hbMarkRed, remitMarkRed, hasSpecialFollow, parentRef from rconversation where ")) {
                C1498.f5308.getClass();
                C1496 c1497 = (C1496) AbstractC0739.m2292(C0610.f2450.m2662(), C1498.m3422());
                if ((c1497 == null && (c1497 = (C1496) AbstractC0739.m2291(C1498.m3422())) == null) || AbstractC2909.m4916(c1497.f5292, EnumC1497.f5298.f5306)) {
                    return;
                }
                c1574.getClass();
                new C0383(i, 6, c1574).m1714("select unReadCount, status, isSend, conversationTime, username, content, msgType,flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, editingQuoteMsgId, hasTodo, hbMarkRed, remitMarkRed, hasSpecialFollow, parentRef from rconversation " + c1497.m3420());
            }
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C0603.f2443));
        C0615 c0615 = f2456;
        C3752 c3752M4301 = C2342.m4301(c0615, listSingletonList);
        c0615.m3443(c3752M4301, new C0581(17));
        c3752M4301.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f2460;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f2459;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f2458;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f2461;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final InterfaceC1433 mo2142() {
        return f2462;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final boolean mo1277() {
        return f2463;
    }
}
