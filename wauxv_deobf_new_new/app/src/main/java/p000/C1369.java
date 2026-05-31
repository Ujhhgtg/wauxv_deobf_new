package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᲁᛸᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1369 extends AbstractC2927 implements InterfaceC1602 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C1369 f4885;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2933 f4886;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C2933 f4887;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final List f4888;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f4889;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String f4890;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final String f4891;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C1322 f4892;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final C1322 f4893;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final Set f4894;

    static {
        AbstractC1471.m3394(-642338128919171L);
        AbstractC1471.m3394(-642381078592131L);
        AbstractC1471.m3394(-642424028265091L);
        AbstractC1471.m3394(-642466977938051L);
        String[] strArr = AbstractC1471.f5234;
        f4885 = new C1369("FloatActionButtonHook");
        f4886 = new C2933(new C0112(29));
        f4887 = new C2933(new C1356(0));
        f4888 = AbstractC0740.m2311(new C1363("设置", "ic_setting.png", true, "wauxv", 0, "openSetting"), new C1363("扫一扫", "ic_scan.png", true, "activity", 1, "com.tencent.mm.plugin.scanner.ui.BaseScanUI"), new C1363("朋友圈", "ic_timeline.png", true, "activity", 2, "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"), new C1363("视频号", "ic_finder.png", true, "activity", 3, "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI"), new C1363("收藏", "ic_favorite.png", true, "activity", 4, "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI"), new C1363("钱包", "ic_wallet.png", true, "activity", 5, "com.tencent.mm.plugin.mall.ui.MallIndexUIv2"), new C1363("清空未读", "ic_clear.png", true, "wauxv", 6, "clearUnreadCount"));
        f4889 = "界面";
        f4890 = "悬浮动作按钮";
        f4891 = "为主界面右下角添加一个悬浮动作按钮";
        f4892 = new C1322(20);
        f4893 = new C1322(21);
        f4894 = AbstractC0280.m1536(new String[]{"openSetting", "clearUnreadCount", "killProcess"});
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static List m3184() {
        Object c2641;
        File file = new File((String) f4886.getValue(), "menuItemsV2.json");
        boolean zExists = file.exists();
        List list = f4888;
        if (!zExists) {
            m3186(list);
            return list;
        }
        try {
            AbstractC1725 abstractC1725 = (AbstractC1725) f4887.getValue();
            String strM3146 = AbstractC1330.m3146(file);
            abstractC1725.getClass();
            c2641 = (List) abstractC1725.m3636(new C0268(C1363.Companion.serializer()), strM3146);
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        Object obj = list;
        if (C2642.m4616(c2641) == null) {
            obj = c2641;
        }
        return (List) obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public static boolean m3185(List list, C1359 c1359) {
        ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            arrayList.add(C1363.m3183((C1363) obj, i, false, 61));
            i = i2;
        }
        if (!m3186(arrayList)) {
            AbstractC2894.m4856(null, 3, "保存失败");
            return false;
        }
        list.clear();
        list.addAll(arrayList);
        c1359.m4462();
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public static boolean m3186(List list) {
        Object c2641;
        ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            arrayList.add(C1363.m3183((C1363) obj, i, false, 61));
            i = i2;
        }
        try {
            File file = new File((String) f4886.getValue(), "menuItemsV2.json");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            AbstractC1725 abstractC1725 = (AbstractC1725) f4887.getValue();
            abstractC1725.getClass();
            AbstractC1330.m3147(file, abstractC1725.m3637(new C0268(C1363.Companion.serializer()), arrayList));
            c2641 = C3554.UNIT;
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        return !(c2641 instanceof C2641);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public static void m3187(Context context, final C1363 c1363, final ArrayList arrayList, final C1359 c1359) {
        String str;
        String[] strArr = AbstractC1471.f5234;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.module_dialog_float_action_button_item_edit, (ViewGroup) null, false);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.moduleDialogEdtFabMenuTitle);
        final EditText editText2 = (EditText) viewInflate.findViewById(R.id.moduleDialogEdtFabMenuIcon);
        final EditText editText3 = (EditText) viewInflate.findViewById(R.id.moduleDialogEdtFabMenuType);
        final EditText editText4 = (EditText) viewInflate.findViewById(R.id.moduleDialogEdtFabMenuAction);
        final MaterialCheckBox materialCheckBox = (MaterialCheckBox) viewInflate.findViewById(R.id.moduleDialogCbFabMenuEnable);
        String str2 = c1363 != null ? c1363.f4874 : null;
        if (str2 == null) {
            str2 = "";
        }
        editText.setText(str2);
        String str3 = c1363 != null ? c1363.f4876 : null;
        if (str3 == null) {
            str3 = "";
        }
        editText2.setText(str3);
        if (c1363 == null || (str = c1363.f4877) == null) {
            str = "activity";
        }
        editText3.setText(str);
        String str4 = c1363 != null ? c1363.f4878 : null;
        if (str4 == null) {
            str4 = "";
        }
        editText4.setText(str4);
        materialCheckBox.setChecked(c1363 != null ? c1363.f4879 : true);
        C2037 c2037 = new C2037();
        c2037.f6779 = MagicFactory.get(c1363 == null ? -641139833043587L : -641161307880067L, strArr);
        c2037.f6781 = viewInflate;
        c2037.m4057("保存", new InterfaceC1422() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᛸᲁᤞᲀ
            @Override // p000.InterfaceC1422
            public final Object invoke() {
                String string;
                String string2;
                String string3;
                String string4;
                String[] strArr2 = AbstractC1471.f5234;
                Editable text = editText.getText();
                String string5 = (text == null || (string4 = text.toString()) == null) ? null : AbstractC2901.m4882(string4).toString();
                if (string5 == null) {
                    string5 = "";
                }
                String str5 = string5;
                Editable text2 = editText2.getText();
                String string6 = (text2 == null || (string3 = text2.toString()) == null) ? null : AbstractC2901.m4882(string3).toString();
                if (string6 == null) {
                    string6 = "";
                }
                String str6 = string6;
                Editable text3 = editText3.getText();
                String string7 = (text3 == null || (string2 = text3.toString()) == null) ? null : AbstractC2901.m4882(string2).toString();
                if (string7 == null) {
                    string7 = "";
                }
                String lowerCase = string7.toLowerCase(Locale.ROOT);
                "toLowerCase(...)";
                Editable text4 = editText4.getText();
                String string8 = (text4 == null || (string = text4.toString()) == null) ? null : AbstractC2901.m4882(string).toString();
                if (string8 == null) {
                    string8 = "";
                }
                String str7 = string8;
                boolean zIsChecked = materialCheckBox.isChecked();
                if (str5.length() == 0) {
                    AbstractC2894.m4856(null, 3, "菜单名称不能为空");
                } else if (!lowerCase.equals("activity") && !lowerCase.equals("wauxv")) {
                    AbstractC2894.m4856(null, 3, "类型仅支持 activity 或 wauxv");
                } else if (str7.length() == 0) {
                    AbstractC2894.m4856(null, 3, "动作值不能为空");
                } else if (!lowerCase.equals("wauxv") || C1369.f4894.contains(str7)) {
                    C1363 c1364 = c1363;
                    ArrayList arrayList2 = arrayList;
                    C1363 c1365 = new C1363(str5, str6, zIsChecked, lowerCase, c1364 != null ? c1364.f4875 : arrayList2.size(), str7);
                    if (c1364 == null) {
                        arrayList2.add(c1365);
                    } else {
                        Iterator it = arrayList2.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            }
                            if (((C1363) it.next()).f4875 == c1364.f4875) {
                                break;
                            }
                            i++;
                        }
                        if (i < 0) {
                            AbstractC2894.m4856(null, 3, "菜单项不存在");
                        } else {
                            arrayList2.set(i, c1365);
                        }
                    }
                    C1369.f4885.getClass();
                    C1369.m3185(arrayList2, c1359);
                } else {
                    AbstractC2894.m4856(null, 3, "wauxv 动作仅支持 openSetting、clearUnreadCount、killProcess");
                }
                return C3554.UNIT;
            }
        });
        AbstractC2844.m4788(c2037, null, 3);
    }

    @Override // p000.InterfaceC1602
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final void mo1799(Activity activity, ViewGroup viewGroup, Object obj) {
        if (mo3445()) {
            ViewParent parent = viewGroup.getParent();
            "null cannot be cast to non-null type android.view.ViewGroup";
            ViewGroup viewGroup2 = (ViewGroup) parent;
            f4885.getClass();
            List listM3184 = m3184();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM3184) {
                if (((C1363) obj2).f4879) {
                    arrayList.add(obj2);
                }
            }
            C0519 c0519 = new C0519(viewGroup2, AbstractC0739.m2300(arrayList, new C0179(11)), 12, false);
            Context context = viewGroup2.getContext();
            C1049 c1049 = new C1049(context);
            c1049.f2851 = true;
            c1049.f6622 = new C0348(27);
            c1049.f6623 = 40L;
            c1049.f6624 = 600L;
            c1049.f6625 = 600L;
            c1049.f6626 = -16777216;
            c1049.f6627 = -1;
            EnumC2434 enumC2434 = EnumC2434.f7780;
            c1049.f6631 = enumC2434;
            c1049.f6637 = new ArrayList();
            c1049.setupBaseViews(context);
            Resources.Theme theme = c1049.getContext().getTheme();
            int[] iArr = AbstractC2513.f7953;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
            try {
                c1049.f6623 = typedArrayObtainStyledAttributes.getInteger(3, 40);
                c1049.f6624 = typedArrayObtainStyledAttributes.getInteger(9, 600);
                c1049.f6625 = typedArrayObtainStyledAttributes.getInteger(1, 600);
                c1049.setOpenInterpolatorAnimator(AnimationUtils.loadInterpolator(c1049.getContext(), typedArrayObtainStyledAttributes.getResourceId(10, R.anim.default_menu_interpolator)));
                c1049.setCloseInterpolatorAnimator(AnimationUtils.loadInterpolator(c1049.getContext(), typedArrayObtainStyledAttributes.getResourceId(2, R.anim.default_menu_interpolator)));
                c1049.setMainButtonColor(typedArrayObtainStyledAttributes.getColor(5, -16777216));
                c1049.setMainButtonIconColor(typedArrayObtainStyledAttributes.getColor(7, -1));
                if (typedArrayObtainStyledAttributes.hasValue(6)) {
                    c1049.setMainButtonIcon(c1049.getResources().getDrawable(typedArrayObtainStyledAttributes.getResourceId(6, 0), null));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(11, 0);
                for (EnumC2434 enumC2435 : EnumC2434.values()) {
                    if (enumC2435.ordinal() == integer) {
                        enumC2434 = enumC2435;
                        break;
                    }
                }
                c1049.setPositionGravity(enumC2434);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = c1049.getContext().getTheme().obtainStyledAttributes(null, iArr, 0, 0);
                try {
                    int integer2 = typedArrayObtainStyledAttributes2.getInteger(4, 1);
                    EnumC1258 enumC1258 = EnumC1258.f4572;
                    if (integer2 != 0) {
                        enumC1258 = EnumC1258.f4573;
                    }
                    c1049.setExpandDirection(enumC1258);
                    c1049.f3822 = typedArrayObtainStyledAttributes2.getLayoutDimension(8, (int) c1049.getResources().getDimension(R.dimen.default_margin_between_menu_items));
                    typedArrayObtainStyledAttributes2.recycle();
                    c1049.setMainButtonColor(Color.parseColor((AbstractC2234.m4176(c1049.getContext()) ? C1364.f4880 : C1365.f4881).m2666()));
                    c1049.setMainButtonIcon(c1049.getContext().getDrawable(R.drawable.ic_float_button_icon_24dp));
                    c1049.setMainButtonIconColor(Color.parseColor((AbstractC2234.m4176(c1049.getContext()) ? C1366.f4882 : C1367.f4883).m2666()));
                    c1049.setDelayBetweenItemsAnimation(20L);
                    c1049.setOpenAnimationDuration(300L);
                    c1049.setCloseAnimationDuration(300L);
                    c1049.setMarginBetweenMenuItems((int) AbstractC2234.m4163(64, c1049.getContext()));
                    c1049.setPositionGravity(EnumC2434.f7784);
                    c1049.setAdapter(c0519);
                    c1049.setOnItemSelectedListener(new C1526(c1049, 1, c0519));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 8388693;
                    layoutParams.bottomMargin = (int) AbstractC2234.m4163(64, viewGroup2.getContext());
                    layoutParams.rightMargin = (int) AbstractC2234.m4163(8, viewGroup2.getContext());
                    viewGroup2.addView(c1049, layoutParams);
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f4891;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f4890;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f4889;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f4892;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public final InterfaceC1433 mo2142() {
        return f4893;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
