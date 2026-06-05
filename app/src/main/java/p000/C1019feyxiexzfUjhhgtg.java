package p000;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleRecyclerView;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ能不能要点脸ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1019feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Context f3986Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f3988Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public LinearLayout f3990Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public ModuleTabLayout f3991Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public ImageView f3992Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public LinearLayout f3993Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public EditText f3994Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ImageView f3995Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public ModuleRecyclerView f3996Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2065feyxiexzfUjhhgtg f3987Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C0350Ujhhgtgfeyxiexzf(14, this));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2065feyxiexzfUjhhgtg f3989Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C0478Ujhhgtgfeyxiexzf(14));

    public C1019feyxiexzfUjhhgtg(Context context) {
        this.f3986Ujhhgtgfeyxiexzf = context;
        AbstractC3590Ujhhgtgfeyxiexzf.m5133Ujhhgtgfeyxiexzf(context);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2515Ujhhgtgfeyxiexzf() {
        this.f3988Ujhhgtgfeyxiexzf = false;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        Object systemService = this.f3986Ujhhgtgfeyxiexzf.getSystemService(MagicFactory.get(4928467576226317706L, strArr));
        MagicFactory.get(4928467657830696330L, strArr);
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        EditText editText = this.f3994Ujhhgtgfeyxiexzf;
        ModuleRecyclerView moduleRecyclerView = null;
        if (editText == null) {
            MagicFactory.get(4928466897621484938L, strArr);
            editText = null;
        }
        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        EditText editText2 = this.f3994Ujhhgtgfeyxiexzf;
        if (editText2 == null) {
            MagicFactory.get(4928466970635928970L, strArr);
            editText2 = null;
        }
        editText2.getText().clear();
        editText2.clearFocus();
        LinearLayout linearLayout = this.f3993Ujhhgtgfeyxiexzf;
        if (linearLayout == null) {
            MagicFactory.get(4928467043650373002L, strArr);
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.f3990Ujhhgtgfeyxiexzf;
        if (linearLayout2 == null) {
            MagicFactory.get(4928467129549718922L, strArr);
            linearLayout2 = null;
        }
        linearLayout2.setVisibility(0);
        ModuleRecyclerView moduleRecyclerView2 = this.f3996Ujhhgtgfeyxiexzf;
        if (moduleRecyclerView2 == null) {
            MagicFactory.get(4928467090895013258L, strArr);
        } else {
            moduleRecyclerView = moduleRecyclerView2;
        }
        moduleRecyclerView.requestFocus();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final List m2516Ujhhgtgfeyxiexzf(int i) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        int i2 = 10;
        int i3 = 2;
        int i4 = 1;
        if (i != 1) {
            if (i == 2) {
                C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = AbstractC3104Ujhhgtgfeyxiexzf.f9650Ujhhgtgfeyxiexzf;
                return AbstractC3104Ujhhgtgfeyxiexzf.m4630Ujhhgtgfeyxiexzf(Boolean.TRUE);
            }
            int i5 = 3;
            if (i != 3) {
                C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg2 = AbstractC3104Ujhhgtgfeyxiexzf.f9650Ujhhgtgfeyxiexzf;
                return AbstractC3104Ujhhgtgfeyxiexzf.m4630Ujhhgtgfeyxiexzf(Boolean.FALSE);
            }
            C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = new C0094Ujhhgtgfeyxiexzf(10);
            C2508feyxiexzfUjhhgtg c2508feyxiexzfUjhhgtg = new C2508feyxiexzfUjhhgtg(MagicFactory.get(4928466442354951562L, strArr));
            AbstractC2485feyxiexzfUjhhgtg[] abstractC2485feyxiexzfUjhhgtgArr = {new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928466395110311306L, strArr), MagicFactory.get(4928466472419722634L, strArr), null)};
            c0094Ujhhgtgfeyxiexzf.add(c2508feyxiexzfUjhhgtg);
            AbstractC2862feyxiexzfUjhhgtg.m4267feyxiexzfUjhhgtg(c0094Ujhhgtgfeyxiexzf, abstractC2485feyxiexzfUjhhgtgArr);
            C2508feyxiexzfUjhhgtg c2508feyxiexzfUjhhgtg2 = new C2508feyxiexzfUjhhgtg(MagicFactory.get(4928466459534820746L, strArr));
            C2507feyxiexzfUjhhgtg c2507feyxiexzfUjhhgtg = new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928466584088872330L, strArr), MagicFactory.get(4928466562614035850L, strArr), new ViewOnClickListenerC1383feyxiexzfUjhhgtg(i5));
            C2507feyxiexzfUjhhgtg c2507feyxiexzfUjhhgtg2 = new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928466588383839626L, strArr), AbstractC2280feyxiexzfUjhhgtg.f7475Ujhhgtgfeyxiexzf, new ViewOnClickListenerC1383feyxiexzfUjhhgtg(4));
            String str = MagicFactory.get(4928466704347956618L, strArr);
            C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
            AbstractC2485feyxiexzfUjhhgtg[] abstractC2485feyxiexzfUjhhgtgArr2 = {c2507feyxiexzfUjhhgtg, c2507feyxiexzfUjhhgtg2, new C2507feyxiexzfUjhhgtg(str, C0580Ujhhgtgfeyxiexzf.m1860Ujhhgtgfeyxiexzf(), new ViewOnClickListenerC1383feyxiexzfUjhhgtg(5))};
            c0094Ujhhgtgfeyxiexzf.add(c2508feyxiexzfUjhhgtg2);
            AbstractC2862feyxiexzfUjhhgtg.m4267feyxiexzfUjhhgtg(c0094Ujhhgtgfeyxiexzf, abstractC2485feyxiexzfUjhhgtgArr2);
            C2508feyxiexzfUjhhgtg c2508feyxiexzfUjhhgtg3 = new C2508feyxiexzfUjhhgtg(MagicFactory.get(4928466682873120138L, strArr));
            AbstractC2485feyxiexzfUjhhgtg[] abstractC2485feyxiexzfUjhhgtgArr3 = {new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928466669988218250L, strArr), MagicFactory.get(4928466734412727690L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 9)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928466798837237130L, strArr), MagicFactory.get(4928452578200520074L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, i2))};
            c0094Ujhhgtgfeyxiexzf.add(c2508feyxiexzfUjhhgtg3);
            AbstractC2862feyxiexzfUjhhgtg.m4267feyxiexzfUjhhgtg(c0094Ujhhgtgfeyxiexzf, abstractC2485feyxiexzfUjhhgtgArr3);
            C2508feyxiexzfUjhhgtg c2508feyxiexzfUjhhgtg4 = new C2508feyxiexzfUjhhgtg(MagicFactory.get(4928452655509931402L, strArr));
            AbstractC2485feyxiexzfUjhhgtg[] abstractC2485feyxiexzfUjhhgtgArr4 = {new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928452642625029514L, strArr), MagicFactory.get(4928452840193525130L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 11)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928452805833786762L, strArr), MagicFactory.get(4928452865963328906L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 12))};
            c0094Ujhhgtgfeyxiexzf.add(c2508feyxiexzfUjhhgtg4);
            AbstractC2862feyxiexzfUjhhgtg.m4267feyxiexzfUjhhgtg(c0094Ujhhgtgfeyxiexzf, abstractC2485feyxiexzfUjhhgtgArr4);
            C2508feyxiexzfUjhhgtg c2508feyxiexzfUjhhgtg5 = new C2508feyxiexzfUjhhgtg(MagicFactory.get(4928452969042544010L, strArr));
            AbstractC2485feyxiexzfUjhhgtg[] abstractC2485feyxiexzfUjhhgtgArr5 = {new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928452956157642122L, strArr), MagicFactory.get(4928453042056988042L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 13)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928452990517380490L, strArr), MagicFactory.get(4928453093596595594L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 14)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928452079984313738L, strArr), MagicFactory.get(4928452019854771594L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 15)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928452097164182922L, strArr), MagicFactory.get(4928452204538365322L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 0)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928452161588692362L, strArr), MagicFactory.get(4928452268962874762L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, i4)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928452359157187978L, strArr), MagicFactory.get(4928452324797449610L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, i3)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928452427876664714L, strArr), MagicFactory.get(4928452380632024458L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 3)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928452492301174154L, strArr), MagicFactory.get(4928452457941435786L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 4)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928452556725683594L, strArr), MagicFactory.get(4928452513776010634L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 5)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928451521638565258L, strArr), MagicFactory.get(4928451478688892298L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 6)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928451568883205514L, strArr), MagicFactory.get(4928451671962420618L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 7)), new C2507feyxiexzfUjhhgtg(MagicFactory.get(4928451637602682250L, strArr), MagicFactory.get(4928451616127845770L, strArr), new ViewOnClickListenerC1114feyxiexzfUjhhgtg(this, 8))};
            c0094Ujhhgtgfeyxiexzf.add(c2508feyxiexzfUjhhgtg5);
            AbstractC2862feyxiexzfUjhhgtg.m4267feyxiexzfUjhhgtg(c0094Ujhhgtgfeyxiexzf, abstractC2485feyxiexzfUjhhgtgArr5);
            return AbstractC1245feyxiexzfUjhhgtg.m2746Ujhhgtgfeyxiexzf(c0094Ujhhgtgfeyxiexzf);
        }
        List<C1414feyxiexzfUjhhgtg> listM4248feyxiexzfUjhhgtg = AbstractC2856feyxiexzfUjhhgtg.m4248feyxiexzfUjhhgtg(AbstractC1453feyxiexzfUjhhgtg.m2961Ujhhgtgfeyxiexzf(), new C2419Ujhhgtgfeyxiexzf(19));
        C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf2 = new C0094Ujhhgtgfeyxiexzf(10);
        List listSingletonList = Collections.singletonList(C1420feyxiexzfUjhhgtg.f4989Ujhhgtgfeyxiexzf);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listSingletonList) {
            ((C1420feyxiexzfUjhhgtg) obj).getClass();
            String str2 = C1420feyxiexzfUjhhgtg.f4990Ujhhgtgfeyxiexzf;
            Object arrayList = linkedHashMap.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str2, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            List<C1420feyxiexzfUjhhgtg> list = (List) entry.getValue();
            C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf3 = new C0094Ujhhgtgfeyxiexzf(list.size() + 1);
            c0094Ujhhgtgfeyxiexzf3.add(new C2508feyxiexzfUjhhgtg(AbstractC1152feyxiexzfUjhhgtg.m2640Ujhhgtgfeyxiexzf(str3, MagicFactory.get(4928467361477952906L, strArr))));
            for (C1420feyxiexzfUjhhgtg c1420feyxiexzfUjhhgtg : list) {
                c1420feyxiexzfUjhhgtg.getClass();
                String str4 = C1420feyxiexzfUjhhgtg.f4991Ujhhgtgfeyxiexzf;
                String str5 = C1420feyxiexzfUjhhgtg.f4992Ujhhgtgfeyxiexzf;
                C1388feyxiexzfUjhhgtg c1388feyxiexzfUjhhgtg = C1420feyxiexzfUjhhgtg.f4993Ujhhgtgfeyxiexzf;
                c0094Ujhhgtgfeyxiexzf3.add(new C2486feyxiexzfUjhhgtg(str4, str5, c1420feyxiexzfUjhhgtg, c1388feyxiexzfUjhhgtg != null ? new ViewOnClickListenerC3076Ujhhgtgfeyxiexzf(c1388feyxiexzfUjhhgtg, 1) : null, null));
            }
            AbstractC2862feyxiexzfUjhhgtg.m4266feyxiexzfUjhhgtg(c0094Ujhhgtgfeyxiexzf2, AbstractC1245feyxiexzfUjhhgtg.m2746Ujhhgtgfeyxiexzf(c0094Ujhhgtgfeyxiexzf3));
        }
        AbstractC2856feyxiexzfUjhhgtg.m4253feyxiexzfUjhhgtg(c0094Ujhhgtgfeyxiexzf2);
        c0094Ujhhgtgfeyxiexzf2.add(new C2508feyxiexzfUjhhgtg(MagicFactory.get(4928467352888018314L, strArr) + listM4248feyxiexzfUjhhgtg.size() + ')'));
        for (C1414feyxiexzfUjhhgtg c1414feyxiexzfUjhhgtg : listM4248feyxiexzfUjhhgtg) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) c1414feyxiexzfUjhhgtg.f4969Ujhhgtgfeyxiexzf.getValue());
            sb.append('(');
            c0094Ujhhgtgfeyxiexzf2.add(new C2489feyxiexzfUjhhgtg(AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, (String) c1414feyxiexzfUjhhgtg.f4971Ujhhgtgfeyxiexzf.getValue(), ')'), MagicFactory.get(4928466365045540234L, strArr) + ((String) c1414feyxiexzfUjhhgtg.f4970Ujhhgtgfeyxiexzf.getValue()) + MagicFactory.get(4928466343570703754L, strArr) + ((String) c1414feyxiexzfUjhhgtg.f4972Ujhhgtgfeyxiexzf.getValue()), c1414feyxiexzfUjhhgtg, new ViewOnClickListenerC3674feyxiexzfUjhhgtg(c1414feyxiexzfUjhhgtg, i3, this)));
        }
        return AbstractC1245feyxiexzfUjhhgtg.m2746Ujhhgtgfeyxiexzf(c0094Ujhhgtgfeyxiexzf2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1905feyxiexzfUjhhgtg m2517Ujhhgtgfeyxiexzf() {
        return (C1905feyxiexzfUjhhgtg) this.f3989Ujhhgtgfeyxiexzf.getValue();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m2518Ujhhgtgfeyxiexzf() {
        C3082Ujhhgtgfeyxiexzf c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg = C3082Ujhhgtgfeyxiexzf.m4549feyxiexzfUjhhgtg();
        Context context = this.f3986Ujhhgtgfeyxiexzf;
        c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.f1001Ujhhgtgfeyxiexzf = (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.9d);
        if (c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.f9527feyxiexzfUjhhgtg != null) {
            Ujhhgtgfeyxiexzf.m890feyxiexzfUjhhgtg(new RunnableC3050Ujhhgtgfeyxiexzf(c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg, 0));
        }
        c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.f9531feyxiexzfUjhhgtg = AbstractC2857Ujhhgtgfeyxiexzf.m4262Ujhhgtgfeyxiexzf(context.getColor(R.color.md_theme_surface), 240);
        if (c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.f9527feyxiexzfUjhhgtg != null) {
            Ujhhgtgfeyxiexzf.m890feyxiexzfUjhhgtg(new RunnableC3050Ujhhgtgfeyxiexzf(c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg, 0));
        }
        c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.f9525feyxiexzfUjhhgtg = new C1018feyxiexzfUjhhgtg(this);
        if (c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.f9527feyxiexzfUjhhgtg != null) {
            Ujhhgtgfeyxiexzf.m890feyxiexzfUjhhgtg(new RunnableC3050Ujhhgtgfeyxiexzf(c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg, 0));
        }
        c3082UjhhgtgfeyxiexzfM4549feyxiexzfUjhhgtg.m4550feyxiexzfUjhhgtg();
    }
}
