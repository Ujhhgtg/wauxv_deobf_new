package p000;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleRecyclerView;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᤝᲇᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2675 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f8605;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f8607;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public LinearLayout f8609;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public ModuleTabLayout f8610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public ImageView f8611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public LinearLayout f8612;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public EditText f8613;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ImageView f8614;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ModuleRecyclerView f8615;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2873 f8606 = new C2873(new C2042(13, this));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2873 f8608 = new C2873(new C2083(11));

    public C2675(Context context) {
        this.f8605 = context;
        AbstractC2207.m4098(context);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4683() {
        this.f8607 = false;
        String[] strArr = AbstractC1574.f5469;
        Object systemService = this.f8605.getSystemService("input_method");
        "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        EditText editText = this.f8613;
        ModuleRecyclerView moduleRecyclerView = null;
        if (editText == null) {
            "edtSearchInput";
            editText = null;
        }
        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        EditText editText2 = this.f8613;
        if (editText2 == null) {
            "edtSearchInput";
            editText2 = null;
        }
        editText2.getText().clear();
        editText2.clearFocus();
        LinearLayout linearLayout = this.f8612;
        if (linearLayout == null) {
            "llSearchRow";
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.f8609;
        if (linearLayout2 == null) {
            "llTabRow";
            linearLayout2 = null;
        }
        linearLayout2.setVisibility(0);
        ModuleRecyclerView moduleRecyclerView2 = this.f8615;
        if (moduleRecyclerView2 == null) {
            "recyclerView";
        } else {
            moduleRecyclerView = moduleRecyclerView2;
        }
        moduleRecyclerView.requestFocus();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List m4684(int i) {
        String[] strArr = AbstractC1574.f5469;
        int i2 = 12;
        int i3 = 2;
        int i4 = 10;
        int i5 = 1;
        if (i != 1) {
            if (i == 2) {
                C2873 c2873 = AbstractC0960.f3486;
                return AbstractC0960.m2450(Boolean.TRUE);
            }
            int i6 = 3;
            if (i != 3) {
                C2873 c2874 = AbstractC0960.f3486;
                return AbstractC0960.m2450(Boolean.FALSE);
            }
            C1809 c1809 = new C1809(10);
            C0395 c0395 = new C0395("WAuxiliary");
            AbstractC0399[] abstractC0399Arr = {new C0394("愿每个人都被这世界温柔以待", ":)", null)};
            c1809.add(c0395);
            AbstractC0750.m2218(c1809, abstractC0399Arr);
            C0395 c0396 = new C0395("版本");
            C0394 c0394 = new C0394("模块版本", "1.2.7.r1356.3e63484(1356)", new ViewOnClickListenerC2317(i6));
            C0394 c0397 = new C0394("编译时间", AbstractC3691.f11600, new ViewOnClickListenerC2317(4));
            String str = "宿主版本";
            C1565.f5440.getClass();
            AbstractC0399[] abstractC0399Arr2 = {c0394, c0397, new C0394(str, C1565.m3281(), new ViewOnClickListenerC2317(5))};
            c1809.add(c0396);
            AbstractC0750.m2218(c1809, abstractC0399Arr2);
            C0395 c0398 = new C0395("群组");
            AbstractC0399[] abstractC0399Arr3 = {new C0394("Telegram Channel", "Hd_WAuxiliary_CI", new ViewOnClickListenerC2666(this, 9)), new C0394("Telegram Group", "Hd_WAuxiliary", new ViewOnClickListenerC2666(this, i4))};
            c1809.add(c0398);
            AbstractC0750.m2218(c1809, abstractC0399Arr3);
            C0395 c0399 = new C0395("源码");
            AbstractC0399[] abstractC0399Arr4 = {new C0394("WAuxiliary_Public", "HdShare", new ViewOnClickListenerC2666(this, 11)), new C0394("WAuxiliary_Plugin", "HdShare", new ViewOnClickListenerC2666(this, i2))};
            c1809.add(c0399);
            AbstractC0750.m2218(c1809, abstractC0399Arr4);
            C0395 c03910 = new C0395("致谢");
            AbstractC0399[] abstractC0399Arr5 = {new C0394("YukiHookAPI", "HighCapable", new ViewOnClickListenerC2666(this, 13)), new C0394("KavaRef", "HighCapable", new ViewOnClickListenerC2666(this, 14)), new C0394("BetterAndroid", "BetterAndroid", new ViewOnClickListenerC2666(this, 15)), new C0394("DexKit", "LuckyPray", new ViewOnClickListenerC2666(this, 0)), new C0394("FastKv", "BillyWei01", new ViewOnClickListenerC2666(this, i5)), new C0394("DialogX", "kongzue", new ViewOnClickListenerC2666(this, i3)), new C0394("QAuxiliary", "cinit", new ViewOnClickListenerC2666(this, 3)), new C0394("TimTool", "suzhelan", new ViewOnClickListenerC2666(this, 4)), new C0394("TSBattery", "fankes", new ViewOnClickListenerC2666(this, 5)), new C0394("QQCleaner", "KitsunePie", new ViewOnClickListenerC2666(this, 6)), new C0394("LSPosed", "LSPosed", new ViewOnClickListenerC2666(this, 7)), new C0394("Icon", "MaiTungTM", new ViewOnClickListenerC2666(this, 8))};
            c1809.add(c03910);
            AbstractC0750.m2218(c1809, abstractC0399Arr5);
            return AbstractC1459.m3173(c1809);
        }
        List<C2355> listM2201 = AbstractC0744.m2201(AbstractC2371.m4340(), new C0171(12));
        C1809 c18010 = new C1809(10);
        List listSingletonList = Collections.singletonList(C2361.f7579);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listSingletonList) {
            ((C2361) obj).getClass();
            String str2 = C2361.f7580;
            Object arrayList = linkedHashMap.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str2, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            List<C2361> list = (List) entry.getValue();
            List listSingletonList2 = Collections.singletonList(new C0395(str3));
            ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(list, 10));
            for (C2361 c2361 : list) {
                c2361.getClass();
                String str4 = C2361.f7581;
                String str5 = C2361.f7582;
                C2316 c2316 = C2361.f7583;
                arrayList2.add(new C0398(str4, str5, c2361, c2316 != null ? new ViewOnClickListenerC0958(c2316, 1) : null));
            }
            AbstractC0750.m2217(c18010, AbstractC0744.m2198(listSingletonList2, arrayList2));
        }
        AbstractC0744.m2206(c18010);
        c18010.add(new C0395("本地插件(" + listM2201.size() + ')'));
        for (C2355 c2355 : listM2201) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) c2355.f7555.getValue());
            sb.append('(');
            c18010.add(new C0396(AbstractC1194.m2786(sb, (String) c2355.f7557.getValue(), ')'), "作者: " + ((String) c2355.f7556.getValue()) + " | 更新于: " + ((String) c2355.f7558.getValue()), c2355, new ViewOnClickListenerC0812(c2355, i3, this)));
        }
        return AbstractC1459.m3173(c18010);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3563 m4685() {
        return (C3563) this.f8608.getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4686() {
        C0943 c0943 = new C0943();
        c0943.f3447 = c0943;
        c0943.f3449 = R.anim.anim_dialogx_default_enter;
        c0943.f3450 = R.anim.anim_dialogx_default_exit;
        c0943.f3451 = 1;
        c0943.f3452 = 0;
        c0943.f3453 = true;
        c0943.f3455 = -1;
        c0943.f3456 = -1;
        Context context = this.f8605;
        c0943.f3452 = context.getColor(R.color.md_theme_surface);
        if (c0943.f3448 != null) {
            AbstractC0027.m745(new RunnableC0936(c0943, 0));
        }
        c0943.f921 = (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.9d);
        if (c0943.f3448 != null) {
            AbstractC0027.m745(new RunnableC0936(c0943, 0));
        }
        c0943.f3446 = new C2674(this);
        if (c0943.f3448 != null) {
            AbstractC0027.m745(new RunnableC0936(c0943, 0));
        }
        c0943.m748();
        if (c0943.m753() != null) {
            AbstractC0027.m746(c0943.m753());
            return;
        }
        View viewM749 = c0943.m749(c0943.m752(c0943.m759()) != 0 ? c0943.m752(c0943.m759()) : R.layout.layout_dialogx_custom);
        c0943.f3448 = new C0662(c0943, viewM749);
        if (viewM749 != null) {
            viewM749.setTag(c0943);
        }
        AbstractC0027.m746(viewM749);
    }
}
