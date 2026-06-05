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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2726Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0598Ujhhgtgfeyxiexzf, InterfaceC0745Ujhhgtgfeyxiexzf, InterfaceC0597Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C2726Ujhhgtgfeyxiexzf f8680Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final LinkedHashMap f8681Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f8682Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f8683Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final String f8684Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final C2692Ujhhgtgfeyxiexzf f8685Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C2692Ujhhgtgfeyxiexzf f8686Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final boolean f8687Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928779103089198474L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928779060139525514L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928782453163689354L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928782547652969866L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928782504703296906L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928782599192577418L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928782693681857930L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928782650732184970L);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f8680Ujhhgtgfeyxiexzf = new C2726Ujhhgtgfeyxiexzf("ChatGroupTabHook");
        f8681Ujhhgtgfeyxiexzf = new LinkedHashMap();
        f8682Ujhhgtgfeyxiexzf = "界面";
        f8683Ujhhgtgfeyxiexzf = "聊天分组标签";
        f8684Ujhhgtgfeyxiexzf = "添加分组顶部标签栏，顶部栏无法固定";
        f8685Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(11);
        f8686Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(12);
        f8687Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static void m4034feyxiexzfUjhhgtg(C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf) {
        c1981Ujhhgtgfeyxiexzf.setTabMode(2);
        c1981Ujhhgtgfeyxiexzf.setTabGravity(1);
        c1981Ujhhgtgfeyxiexzf.setTabRippleColor(AbstractC1252feyxiexzfUjhhgtg.m2782Ujhhgtgfeyxiexzf(0));
        c1981Ujhhgtgfeyxiexzf.setInlineLabel(true);
        if (AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(c1981Ujhhgtgfeyxiexzf.getContext())) {
            c1981Ujhhgtgfeyxiexzf.setBackgroundColor(Color.parseColor(C2747Ujhhgtgfeyxiexzf.f8718Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()));
            c1981Ujhhgtgfeyxiexzf.setSelectedTabIndicatorColor(Color.parseColor(C2713feyxiexzfUjhhgtg.f8656Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()));
            c1981Ujhhgtgfeyxiexzf.setTabTextColors(C1981Ujhhgtgfeyxiexzf.m3318Ujhhgtgfeyxiexzf(Color.parseColor(C2715feyxiexzfUjhhgtg.f8658Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()), Color.parseColor(C2744Ujhhgtgfeyxiexzf.f8715Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf())));
        } else {
            c1981Ujhhgtgfeyxiexzf.setBackgroundColor(Color.parseColor(C2748feyxiexzfUjhhgtg.f8719Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()));
            c1981Ujhhgtgfeyxiexzf.setSelectedTabIndicatorColor(Color.parseColor(C2716feyxiexzfUjhhgtg.f8659Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()));
            c1981Ujhhgtgfeyxiexzf.setTabTextColors(C1981Ujhhgtgfeyxiexzf.m3318Ujhhgtgfeyxiexzf(Color.parseColor(C2743Ujhhgtgfeyxiexzf.f8714Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf()), Color.parseColor(C2745feyxiexzfUjhhgtg.f8716Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf())));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static void m4035feyxiexzfUjhhgtg(final C0330Ujhhgtgfeyxiexzf c0330Ujhhgtgfeyxiexzf, final List list, final C2717feyxiexzfUjhhgtg c2717feyxiexzfUjhhgtg) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        ChipGroup chipGroup = c0330Ujhhgtgfeyxiexzf.f1947Ujhhgtgfeyxiexzf;
        chipGroup.removeAllViews();
        ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String lowerCase = ((C0627Ujhhgtgfeyxiexzf) it.next()).f2657Ujhhgtgfeyxiexzf.toLowerCase(Locale.ROOT);
            "toLowerCase(...)";
            arrayList.add(lowerCase);
        }
        Set setM4256Ujhhgtgfeyxiexzf = AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(arrayList);
        C0629Ujhhgtgfeyxiexzf.f2673Ujhhgtgfeyxiexzf.getClass();
        List list2 = C0629Ujhhgtgfeyxiexzf.f2676Ujhhgtgfeyxiexzf;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (((C0627Ujhhgtgfeyxiexzf) obj).m1905Ujhhgtgfeyxiexzf() != EnumC0628Ujhhgtgfeyxiexzf.f2668Ujhhgtgfeyxiexzf) {
                arrayList2.add(obj);
            }
        }
        ArrayList<C0627Ujhhgtgfeyxiexzf> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            String lowerCase2 = ((C0627Ujhhgtgfeyxiexzf) obj2).f2657Ujhhgtgfeyxiexzf.toLowerCase(Locale.ROOT);
            "toLowerCase(...)";
            if (!setM4256Ujhhgtgfeyxiexzf.contains(lowerCase2)) {
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
        for (final C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf : arrayList3) {
            Chip chip2 = new Chip(chipGroup.getContext(), null);
            chip2.setText(c0627Ujhhgtgfeyxiexzf.f2659Ujhhgtgfeyxiexzf);
            chip2.setClickable(true);
            chip2.setCheckable(false);
            chip2.setOnClickListener(new View.OnClickListener() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ要点脸ᛲ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List list3 = list;
                    list3.add(C0627Ujhhgtgfeyxiexzf.m1903Ujhhgtgfeyxiexzf(c0627Ujhhgtgfeyxiexzf, list3.size(), null, 29));
                    C2726Ujhhgtgfeyxiexzf.f8680Ujhhgtgfeyxiexzf.getClass();
                    if (C2726Ujhhgtgfeyxiexzf.m4036feyxiexzfUjhhgtg(list3)) {
                        C2717feyxiexzfUjhhgtg c2717feyxiexzfUjhhgtg2 = c2717feyxiexzfUjhhgtg;
                        c2717feyxiexzfUjhhgtg2.m4032Ujhhgtgfeyxiexzf(list3);
                        C2726Ujhhgtgfeyxiexzf.m4035feyxiexzfUjhhgtg(c0330Ujhhgtgfeyxiexzf, list3, c2717feyxiexzfUjhhgtg2);
                    } else {
                        if (list3.isEmpty()) {
                            return;
                        }
                        list3.remove(AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(list3));
                    }
                }
            });
            chipGroup.addView(chip2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public static boolean m4036feyxiexzfUjhhgtg(List list) {
        ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            arrayList.add(C0627Ujhhgtgfeyxiexzf.m1903Ujhhgtgfeyxiexzf((C0627Ujhhgtgfeyxiexzf) obj, i, null, 29));
            i = i2;
        }
        C0629Ujhhgtgfeyxiexzf.f2673Ujhhgtgfeyxiexzf.getClass();
        boolean zM1908Ujhhgtgfeyxiexzf = C0629Ujhhgtgfeyxiexzf.m1908Ujhhgtgfeyxiexzf(arrayList);
        if (!zM1908Ujhhgtgfeyxiexzf) {
            AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "保存失败");
            return zM1908Ujhhgtgfeyxiexzf;
        }
        list.clear();
        list.addAll(arrayList);
        C2746feyxiexzfUjhhgtg c2746feyxiexzfUjhhgtg = C2746feyxiexzfUjhhgtg.f8717Ujhhgtgfeyxiexzf;
        int iM4619Ujhhgtgfeyxiexzf = c2746feyxiexzfUjhhgtg.m4619Ujhhgtgfeyxiexzf();
        int size = arrayList.size() - 1;
        c2746feyxiexzfUjhhgtg.m4626Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2794Ujhhgtgfeyxiexzf(iM4619Ujhhgtgfeyxiexzf, size >= 0 ? size : 0));
        m4037feyxiexzfUjhhgtg();
        return zM1908Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public static void m4037feyxiexzfUjhhgtg() {
        for (C2707feyxiexzfUjhhgtg c2707feyxiexzfUjhhgtg : AbstractC2856feyxiexzfUjhhgtg.m4253feyxiexzfUjhhgtg(f8681Ujhhgtgfeyxiexzf.values())) {
            C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = c2707feyxiexzfUjhhgtg.f8640Ujhhgtgfeyxiexzf;
            C2550feyxiexzfUjhhgtg c2550feyxiexzfUjhhgtg = c2707feyxiexzfUjhhgtg.f8641Ujhhgtgfeyxiexzf;
            f8680Ujhhgtgfeyxiexzf.getClass();
            m4034feyxiexzfUjhhgtg(c1981Ujhhgtgfeyxiexzf);
            m4038feyxiexzfUjhhgtg(c2707feyxiexzfUjhhgtg.f8640Ujhhgtgfeyxiexzf, c2550feyxiexzfUjhhgtg);
            c2550feyxiexzfUjhhgtg.invoke();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static void m4038feyxiexzfUjhhgtg(final C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf, C2550feyxiexzfUjhhgtg c2550feyxiexzfUjhhgtg) {
        c1981Ujhhgtgfeyxiexzf.m3326Ujhhgtgfeyxiexzf();
        C0629Ujhhgtgfeyxiexzf.f2673Ujhhgtgfeyxiexzf.getClass();
        List listM1906Ujhhgtgfeyxiexzf = C0629Ujhhgtgfeyxiexzf.m1906Ujhhgtgfeyxiexzf();
        if (listM1906Ujhhgtgfeyxiexzf.isEmpty()) {
            return;
        }
        C2746feyxiexzfUjhhgtg c2746feyxiexzfUjhhgtg = C2746feyxiexzfUjhhgtg.f8717Ujhhgtgfeyxiexzf;
        int iM2794Ujhhgtgfeyxiexzf = AbstractC1264feyxiexzfUjhhgtg.m2794Ujhhgtgfeyxiexzf(c2746feyxiexzfUjhhgtg.m4619Ujhhgtgfeyxiexzf(), AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(listM1906Ujhhgtgfeyxiexzf));
        c2746feyxiexzfUjhhgtg.m4626Ujhhgtgfeyxiexzf(iM2794Ujhhgtgfeyxiexzf);
        final int i = 0;
        for (Object obj : listM1906Ujhhgtgfeyxiexzf) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            final C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf = (C0627Ujhhgtgfeyxiexzf) obj;
            C2080Ujhhgtgfeyxiexzf c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf = c1981Ujhhgtgfeyxiexzf.m3325Ujhhgtgfeyxiexzf();
            String str = c0627Ujhhgtgfeyxiexzf.f2659Ujhhgtgfeyxiexzf;
            if (TextUtils.isEmpty(c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6828Ujhhgtgfeyxiexzf) && !TextUtils.isEmpty(str)) {
                c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6832Ujhhgtgfeyxiexzf.setContentDescription(str);
            }
            c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6827Ujhhgtgfeyxiexzf = str;
            C1980Ujhhgtgfeyxiexzf c1980Ujhhgtgfeyxiexzf = c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf.f6832Ujhhgtgfeyxiexzf;
            if (c1980Ujhhgtgfeyxiexzf != null) {
                c1980Ujhhgtgfeyxiexzf.m3314Ujhhgtgfeyxiexzf();
            }
            c1981Ujhhgtgfeyxiexzf.m3319Ujhhgtgfeyxiexzf(c2080UjhhgtgfeyxiexzfM3325Ujhhgtgfeyxiexzf, i == iM2794Ujhhgtgfeyxiexzf);
            final C2550feyxiexzfUjhhgtg c2550feyxiexzfUjhhgtg2 = new C2550feyxiexzfUjhhgtg(c2550feyxiexzfUjhhgtg, 1, c1981Ujhhgtgfeyxiexzf);
            f8680Ujhhgtgfeyxiexzf.getClass();
            if (AbstractC1192feyxiexzfUjhhgtg.m2679feyxiexzfUjhhgtg(c0627Ujhhgtgfeyxiexzf.f2657Ujhhgtgfeyxiexzf, EnumC0628Ujhhgtgfeyxiexzf.f2668Ujhhgtgfeyxiexzf.f2671Ujhhgtgfeyxiexzf)) {
                c1981Ujhhgtgfeyxiexzf.post(new Runnable() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲ要点脸
                    @Override // java.lang.Runnable
                    public final void run() {
                        View childAt = c1981Ujhhgtgfeyxiexzf.getChildAt(0);
                        if (!(childAt instanceof ViewGroup)) {
                            childAt = null;
                        }
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        if (viewGroup == null) {
                            return;
                        }
                        View viewM4513Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4513Ujhhgtgfeyxiexzf(viewGroup, i);
                        final C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf2 = c0627Ujhhgtgfeyxiexzf;
                        final C2550feyxiexzfUjhhgtg c2550feyxiexzfUjhhgtg3 = c2550feyxiexzfUjhhgtg2;
                        viewM4513Ujhhgtgfeyxiexzf.setOnLongClickListener(new View.OnLongClickListener() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ要点脸ᛴ
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                C2977Ujhhgtgfeyxiexzf c2977Ujhhgtgfeyxiexzf = new C2977Ujhhgtgfeyxiexzf(9, c2550feyxiexzfUjhhgtg3);
                                C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf3 = c0627Ujhhgtgfeyxiexzf2;
                                if (!AbstractC1192feyxiexzfUjhhgtg.m2679feyxiexzfUjhhgtg(c0627Ujhhgtgfeyxiexzf3.f2657Ujhhgtgfeyxiexzf, EnumC0628Ujhhgtgfeyxiexzf.f2668Ujhhgtgfeyxiexzf.f2671Ujhhgtgfeyxiexzf)) {
                                    return true;
                                }
                                AbstractC0615Ujhhgtgfeyxiexzf.m1889Ujhhgtgfeyxiexzf(C0544Ujhhgtgfeyxiexzf.f2532Ujhhgtgfeyxiexzf, new C0530Ujhhgtgfeyxiexzf(c0627Ujhhgtgfeyxiexzf3, 3, c2977Ujhhgtgfeyxiexzf));
                                return true;
                            }
                        });
                    }
                });
            }
            i = i2;
        }
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C2714feyxiexzfUjhhgtg.f8657Ujhhgtgfeyxiexzf, dexKitBridge, new C2692Ujhhgtgfeyxiexzf(13));
    }

    @Override // p000.InterfaceC0597Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final void mo1870Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str) {
        if (mo1424feyxiexzfUjhhgtg()) {
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, "clicfg_conv_mvvm_list")) {
                c0578Ujhhgtgfeyxiexzf.m1853Ujhhgtgfeyxiexzf("0");
            }
        }
    }

    @Override // p000.InterfaceC0745Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo2083Ujhhgtgfeyxiexzf(C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf, String str) {
        if (mo1424feyxiexzfUjhhgtg()) {
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            int i = 1;
            if (str.startsWith("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, hasTodo, hbMarkRed, remitMarkRed, parentRef from rconversation where ")) {
                C0629Ujhhgtgfeyxiexzf.f2673Ujhhgtgfeyxiexzf.getClass();
                C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf = (C0627Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4240feyxiexzfUjhhgtg(C2746feyxiexzfUjhhgtg.f8717Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf(), C0629Ujhhgtgfeyxiexzf.m1906Ujhhgtgfeyxiexzf());
                if ((c0627Ujhhgtgfeyxiexzf == null && (c0627Ujhhgtgfeyxiexzf = (C0627Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(C0629Ujhhgtgfeyxiexzf.m1906Ujhhgtgfeyxiexzf())) == null) || AbstractC1192feyxiexzfUjhhgtg.m2679feyxiexzfUjhhgtg(c0627Ujhhgtgfeyxiexzf.f2657Ujhhgtgfeyxiexzf, EnumC0628Ujhhgtgfeyxiexzf.f2663Ujhhgtgfeyxiexzf.f2671Ujhhgtgfeyxiexzf)) {
                    return;
                }
                c0578Ujhhgtgfeyxiexzf.getClass();
                new C2501feyxiexzfUjhhgtg(i, 6, c0578Ujhhgtgfeyxiexzf).m3786Ujhhgtgfeyxiexzf("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, hasTodo, hbMarkRed, remitMarkRed, parentRef from rconversation " + c0627Ujhhgtgfeyxiexzf.m1904Ujhhgtgfeyxiexzf());
            }
            if (str.startsWith("select unReadCount, status, isSend, conversationTime, username, content, msgType,flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, editingQuoteMsgId, hasTodo, hbMarkRed, remitMarkRed, hasSpecialFollow, parentRef from rconversation where ")) {
                C0629Ujhhgtgfeyxiexzf.f2673Ujhhgtgfeyxiexzf.getClass();
                C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf2 = (C0627Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4240feyxiexzfUjhhgtg(C2746feyxiexzfUjhhgtg.f8717Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf(), C0629Ujhhgtgfeyxiexzf.m1906Ujhhgtgfeyxiexzf());
                if ((c0627Ujhhgtgfeyxiexzf2 == null && (c0627Ujhhgtgfeyxiexzf2 = (C0627Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(C0629Ujhhgtgfeyxiexzf.m1906Ujhhgtgfeyxiexzf())) == null) || AbstractC1192feyxiexzfUjhhgtg.m2679feyxiexzfUjhhgtg(c0627Ujhhgtgfeyxiexzf2.f2657Ujhhgtgfeyxiexzf, EnumC0628Ujhhgtgfeyxiexzf.f2663Ujhhgtgfeyxiexzf.f2671Ujhhgtgfeyxiexzf)) {
                    return;
                }
                c0578Ujhhgtgfeyxiexzf.getClass();
                new C2501feyxiexzfUjhhgtg(i, 6, c0578Ujhhgtgfeyxiexzf).m3786Ujhhgtgfeyxiexzf("select unReadCount, status, isSend, conversationTime, username, content, msgType,flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, editingQuoteMsgId, hasTodo, hbMarkRed, remitMarkRed, hasSpecialFollow, parentRef from rconversation " + c0627Ujhhgtgfeyxiexzf2.m1904Ujhhgtgfeyxiexzf());
            }
        }
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
        List listSingletonList = Collections.singletonList(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C2714feyxiexzfUjhhgtg.f8657Ujhhgtgfeyxiexzf));
        C2726Ujhhgtgfeyxiexzf c2726Ujhhgtgfeyxiexzf = f8680Ujhhgtgfeyxiexzf;
        C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf = C1477feyxiexzfUjhhgtg.m2994Ujhhgtgfeyxiexzf(c2726Ujhhgtgfeyxiexzf, listSingletonList);
        c2726Ujhhgtgfeyxiexzf.m1844feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf, new C2692Ujhhgtgfeyxiexzf(15));
        c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f8684Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f8683Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f8682Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f8685Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo2873feyxiexzfUjhhgtg() {
        return f8686Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ */
    public final boolean mo1482feyxiexzfUjhhgtg() {
        return f8687Ujhhgtgfeyxiexzf;
    }
}
