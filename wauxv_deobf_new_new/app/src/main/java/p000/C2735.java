package p000;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleRecyclerView;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᲁᤞᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2735 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f8763;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f8765;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public LinearLayout f8767;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public ModuleTabLayout f8768;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public ImageView f8769;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public LinearLayout f8770;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public EditText f8771;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ImageView f8772;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ModuleRecyclerView f8773;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2933 f8764 = new C2933(new C2070(this, 14));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2933 f8766 = new C2933(new C2096(13));

    public C2735(Context context) {
        this.f8763 = context;
        AbstractC2902.m4896(context);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4717() {
        this.f8765 = false;
        String[] strArr = AbstractC1471.f5234;
        Object systemService = this.f8763.getSystemService("input_method");
        "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        EditText editText = this.f8771;
        ModuleRecyclerView moduleRecyclerView = null;
        if (editText == null) {
            "edtSearchInput";
            editText = null;
        }
        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        EditText editText2 = this.f8771;
        if (editText2 == null) {
            "edtSearchInput";
            editText2 = null;
        }
        editText2.getText().clear();
        editText2.clearFocus();
        LinearLayout linearLayout = this.f8770;
        if (linearLayout == null) {
            "llSearchRow";
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.f8767;
        if (linearLayout2 == null) {
            "llTabRow";
            linearLayout2 = null;
        }
        linearLayout2.setVisibility(0);
        ModuleRecyclerView moduleRecyclerView2 = this.f8773;
        if (moduleRecyclerView2 == null) {
            "recyclerView";
        } else {
            moduleRecyclerView = moduleRecyclerView2;
        }
        moduleRecyclerView.requestFocus();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List m4718(int i) {
        String[] strArr = AbstractC1471.f5234;
        int i2 = 10;
        int i3 = 2;
        int i4 = 1;
        if (i != 1) {
            if (i == 2) {
                C2933 c2933 = AbstractC0964.f3503;
                return AbstractC0964.m2569(Boolean.TRUE);
            }
            int i5 = 3;
            if (i != 3) {
                C2933 c2934 = AbstractC0964.f3503;
                return AbstractC0964.m2569(Boolean.FALSE);
            }
            C1836 c1836 = new C1836(10);
            C0370 c0370 = new C0370("WAuxiliary");
            AbstractC0374[] abstractC0374Arr = {new C0369("愿每个人都被这世界温柔以待", ":)", null)};
            c1836.add(c0370);
            AbstractC0745.m2317(c1836, abstractC0374Arr);
            C0370 c0371 = new C0370("版本");
            C0369 c0369 = new C0369("模块版本", "1.2.7.r1405.70100cc(1405)", new ViewOnClickListenerC2350(i5));
            C0369 c03610 = new C0369("编译时间", AbstractC3754.f11757, new ViewOnClickListenerC2350(4));
            String str = "宿主版本";
            C1576.f5470.getClass();
            AbstractC0374[] abstractC0374Arr2 = {c0369, c03610, new C0369(str, C1576.m3461(), new ViewOnClickListenerC2350(5))};
            c1836.add(c0371);
            AbstractC0745.m2317(c1836, abstractC0374Arr2);
            C0370 c0372 = new C0370("群组");
            AbstractC0374[] abstractC0374Arr3 = {new C0369("Telegram Channel", "Hd_WAuxiliary_CI", new ViewOnClickListenerC2728(this, 9)), new C0369("Telegram Group", "Hd_WAuxiliary", new ViewOnClickListenerC2728(this, i2))};
            c1836.add(c0372);
            AbstractC0745.m2317(c1836, abstractC0374Arr3);
            C0370 c0373 = new C0370("源码");
            AbstractC0374[] abstractC0374Arr4 = {new C0369("WAuxiliary_Public", "HdShare", new ViewOnClickListenerC2728(this, 11)), new C0369("WAuxiliary_Plugin", "HdShare", new ViewOnClickListenerC2728(this, 12))};
            c1836.add(c0373);
            AbstractC0745.m2317(c1836, abstractC0374Arr4);
            C0370 c0374 = new C0370("致谢");
            AbstractC0374[] abstractC0374Arr5 = {new C0369("YukiHookAPI", "HighCapable", new ViewOnClickListenerC2728(this, 13)), new C0369("KavaRef", "HighCapable", new ViewOnClickListenerC2728(this, 14)), new C0369("BetterAndroid", "BetterAndroid", new ViewOnClickListenerC2728(this, 15)), new C0369("DexKit", "LuckyPray", new ViewOnClickListenerC2728(this, 0)), new C0369("FastKv", "BillyWei01", new ViewOnClickListenerC2728(this, i4)), new C0369("DialogX", "kongzue", new ViewOnClickListenerC2728(this, i3)), new C0369("QAuxiliary", "cinit", new ViewOnClickListenerC2728(this, 3)), new C0369("TimTool", "suzhelan", new ViewOnClickListenerC2728(this, 4)), new C0369("TSBattery", "fankes", new ViewOnClickListenerC2728(this, 5)), new C0369("QQCleaner", "KitsunePie", new ViewOnClickListenerC2728(this, 6)), new C0369("LSPosed", "LSPosed", new ViewOnClickListenerC2728(this, 7)), new C0369("Icon", "MaiTungTM", new ViewOnClickListenerC2728(this, 8))};
            c1836.add(c0374);
            AbstractC0745.m2317(c1836, abstractC0374Arr5);
            return AbstractC3744.m5324(c1836);
        }
        List<C2400> listM2300 = AbstractC0739.m2300(AbstractC2419.m4353(), new C0179(19));
        C1836 c1837 = new C1836(10);
        List listSingletonList = Collections.singletonList(C2406.f7709);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listSingletonList) {
            ((C2406) obj).getClass();
            String str2 = C2406.f7710;
            Object arrayList = linkedHashMap.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str2, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            List<C2406> list = (List) entry.getValue();
            C1836 c1838 = new C1836(list.size() + 1);
            c1838.add(new C0370(AbstractC2901.m4878(str3, "/")));
            for (C2406 c2406 : list) {
                c2406.getClass();
                String str4 = C2406.f7711;
                String str5 = C2406.f7712;
                C2382 c2382 = C2406.f7713;
                c1838.add(new C0373(str4, str5, c2406, c2382 != null ? new ViewOnClickListenerC0961(c2382, 1) : null, null));
            }
            AbstractC0745.m2316(c1837, AbstractC3744.m5324(c1838));
        }
        AbstractC0739.m2305(c1837);
        c1837.add(new C0370("本地插件(" + listM2300.size() + ')'));
        for (C2400 c2400 : listM2300) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) c2400.f7685.getValue());
            sb.append('(');
            c1837.add(new C0371(AbstractC1095.m2801(sb, (String) c2400.f7687.getValue(), ')'), "作者: " + ((String) c2400.f7686.getValue()) + " | 更新于: " + ((String) c2400.f7688.getValue()), c2400, new ViewOnClickListenerC0811(c2400, i3, this)));
        }
        return AbstractC3744.m5324(c1837);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3622 m4719() {
        return (C3622) this.f8766.getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4720() {
        C0942 c0942M2555 = C0942.m2555();
        Context context = this.f8763;
        c0942M2555.f987 = (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.9d);
        if (c0942M2555.f3455 != null) {
            AbstractC0034.m889(new RunnableC0935(c0942M2555, 0));
        }
        c0942M2555.f3459 = AbstractC0747.m2326(context.getColor(R.color.md_theme_surface), 240);
        if (c0942M2555.f3455 != null) {
            AbstractC0034.m889(new RunnableC0935(c0942M2555, 0));
        }
        c0942M2555.f3453 = new C2734(this);
        if (c0942M2555.f3455 != null) {
            AbstractC0034.m889(new RunnableC0935(c0942M2555, 0));
        }
        c0942M2555.m2556();
    }
}
