package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3613Ujhhgtgfeyxiexzf extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0611Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C3613Ujhhgtgfeyxiexzf f11238Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f11239Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f11240Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final List f11241Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final String f11242Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final String f11243Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final String f11244Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C3464Ujhhgtgfeyxiexzf f11245Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final C3464Ujhhgtgfeyxiexzf f11246Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Set f11247Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928786735246083466L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928786692296410506L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928786786785691018L);
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928785781763343754L);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f11238Ujhhgtgfeyxiexzf = new C3613Ujhhgtgfeyxiexzf("FloatActionButtonHook");
        f11239Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C2975feyxiexzfUjhhgtg(28));
        f11240Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C2975feyxiexzfUjhhgtg(29));
        f11241Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(new C3485Ujhhgtgfeyxiexzf("设置", "ic_setting.png", true, "wauxv", 0, "openSetting"), new C3485Ujhhgtgfeyxiexzf("扫一扫", "ic_scan.png", true, "activity", 1, "com.tencent.mm.plugin.scanner.ui.BaseScanUI"), new C3485Ujhhgtgfeyxiexzf("朋友圈", "ic_timeline.png", true, "activity", 2, "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"), new C3485Ujhhgtgfeyxiexzf("视频号", "ic_finder.png", true, "activity", 3, "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI"), new C3485Ujhhgtgfeyxiexzf("收藏", "ic_favorite.png", true, "activity", 4, "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI"), new C3485Ujhhgtgfeyxiexzf("钱包", "ic_wallet.png", true, "activity", 5, "com.tencent.mm.plugin.mall.ui.MallIndexUIv2"), new C3485Ujhhgtgfeyxiexzf("清空未读", "ic_clear.png", true, "wauxv", 6, "clearUnreadCount"));
        f11242Ujhhgtgfeyxiexzf = "界面";
        f11243Ujhhgtgfeyxiexzf = "悬浮动作按钮";
        f11244Ujhhgtgfeyxiexzf = "为主界面右下角添加一个悬浮动作按钮";
        f11245Ujhhgtgfeyxiexzf = new C3464Ujhhgtgfeyxiexzf(22);
        f11246Ujhhgtgfeyxiexzf = new C3464Ujhhgtgfeyxiexzf(23);
        f11247Ujhhgtgfeyxiexzf = AbstractC2391Ujhhgtgfeyxiexzf.m3654feyxiexzfUjhhgtg(new String[]{"openSetting", "clearUnreadCount", "killProcess"});
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static List m5251feyxiexzfUjhhgtg() {
        Object c0919feyxiexzfUjhhgtg;
        File file = new File((String) f11239Ujhhgtgfeyxiexzf.getValue(), "menuItemsV2.json");
        boolean zExists = file.exists();
        List list = f11241Ujhhgtgfeyxiexzf;
        if (!zExists) {
            m5253feyxiexzfUjhhgtg(list);
            return list;
        }
        try {
            AbstractC0728Ujhhgtgfeyxiexzf abstractC0728Ujhhgtgfeyxiexzf = (AbstractC0728Ujhhgtgfeyxiexzf) f11240Ujhhgtgfeyxiexzf.getValue();
            String strM4946feyxiexzfUjhhgtg = AbstractC3445Ujhhgtgfeyxiexzf.m4946feyxiexzfUjhhgtg(file);
            abstractC0728Ujhhgtgfeyxiexzf.getClass();
            c0919feyxiexzfUjhhgtg = (List) abstractC0728Ujhhgtgfeyxiexzf.m2044Ujhhgtgfeyxiexzf(new C2379Ujhhgtgfeyxiexzf(C3485Ujhhgtgfeyxiexzf.Companion.serializer()), strM4946feyxiexzfUjhhgtg);
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        Object obj = list;
        if (C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg) == null) {
            obj = c0919feyxiexzfUjhhgtg;
        }
        return (List) obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static boolean m5252feyxiexzfUjhhgtg(List list, C3476feyxiexzfUjhhgtg c3476feyxiexzfUjhhgtg) {
        ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            arrayList.add(C3485Ujhhgtgfeyxiexzf.m4972Ujhhgtgfeyxiexzf((C3485Ujhhgtgfeyxiexzf) obj, i, false, 61));
            i = i2;
        }
        if (!m5253feyxiexzfUjhhgtg(arrayList)) {
            AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "保存失败");
            return false;
        }
        list.clear();
        list.addAll(arrayList);
        c3476feyxiexzfUjhhgtg.m2137Ujhhgtgfeyxiexzf();
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public static boolean m5253feyxiexzfUjhhgtg(List list) {
        Object c0919feyxiexzfUjhhgtg;
        ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            arrayList.add(C3485Ujhhgtgfeyxiexzf.m4972Ujhhgtgfeyxiexzf((C3485Ujhhgtgfeyxiexzf) obj, i, false, 61));
            i = i2;
        }
        try {
            File file = new File((String) f11239Ujhhgtgfeyxiexzf.getValue(), "menuItemsV2.json");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            AbstractC0728Ujhhgtgfeyxiexzf abstractC0728Ujhhgtgfeyxiexzf = (AbstractC0728Ujhhgtgfeyxiexzf) f11240Ujhhgtgfeyxiexzf.getValue();
            abstractC0728Ujhhgtgfeyxiexzf.getClass();
            AbstractC3445Ujhhgtgfeyxiexzf.m4947feyxiexzfUjhhgtg(file, abstractC0728Ujhhgtgfeyxiexzf.m2045Ujhhgtgfeyxiexzf(new C2379Ujhhgtgfeyxiexzf(C3485Ujhhgtgfeyxiexzf.Companion.serializer()), arrayList));
            c0919feyxiexzfUjhhgtg = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        return !(c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public static void m5254feyxiexzfUjhhgtg(Context context, final C3485Ujhhgtgfeyxiexzf c3485Ujhhgtgfeyxiexzf, final ArrayList arrayList, final C3476feyxiexzfUjhhgtg c3476feyxiexzfUjhhgtg) {
        String str;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        View viewInflate = AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(context).inflate(R.layout.module_dialog_float_action_button_item_edit, (ViewGroup) null, false);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.moduleDialogEdtFabMenuTitle);
        final EditText editText2 = (EditText) viewInflate.findViewById(R.id.moduleDialogEdtFabMenuIcon);
        final EditText editText3 = (EditText) viewInflate.findViewById(R.id.moduleDialogEdtFabMenuType);
        final EditText editText4 = (EditText) viewInflate.findViewById(R.id.moduleDialogEdtFabMenuAction);
        final MaterialCheckBox materialCheckBox = (MaterialCheckBox) viewInflate.findViewById(R.id.moduleDialogCbFabMenuEnable);
        String str2 = c3485Ujhhgtgfeyxiexzf != null ? c3485Ujhhgtgfeyxiexzf.f10820Ujhhgtgfeyxiexzf : null;
        if (str2 == null) {
            str2 = "";
        }
        editText.setText(str2);
        String str3 = c3485Ujhhgtgfeyxiexzf != null ? c3485Ujhhgtgfeyxiexzf.f10822Ujhhgtgfeyxiexzf : null;
        if (str3 == null) {
            str3 = "";
        }
        editText2.setText(str3);
        if (c3485Ujhhgtgfeyxiexzf == null || (str = c3485Ujhhgtgfeyxiexzf.f10823Ujhhgtgfeyxiexzf) == null) {
            str = "activity";
        }
        editText3.setText(str);
        String str4 = c3485Ujhhgtgfeyxiexzf != null ? c3485Ujhhgtgfeyxiexzf.f10824Ujhhgtgfeyxiexzf : null;
        if (str4 == null) {
            str4 = "";
        }
        editText4.setText(str4);
        materialCheckBox.setChecked(c3485Ujhhgtgfeyxiexzf != null ? c3485Ujhhgtgfeyxiexzf.f10825Ujhhgtgfeyxiexzf : true);
        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
        c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = MagicFactory.get(c3485Ujhhgtgfeyxiexzf == null ? 4928800852803585418L : 4928800968767702410L, strArr);
        c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = viewInflate;
        c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf("保存", new InterfaceC3545feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ能不能
            @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
            public final Object invoke() {
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                String string = AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(editText)).toString();
                if (string == null) {
                    string = "";
                }
                String str5 = string;
                String string2 = AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(editText2)).toString();
                if (string2 == null) {
                    string2 = "";
                }
                String str6 = string2;
                String string3 = AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(editText3)).toString();
                if (string3 == null) {
                    string3 = "";
                }
                String lowerCase = string3.toLowerCase(Locale.ROOT);
                "toLowerCase(...)";
                String string4 = AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(editText4)).toString();
                if (string4 == null) {
                    string4 = "";
                }
                String str7 = string4;
                boolean zIsChecked = materialCheckBox.isChecked();
                if (str5.length() == 0) {
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "菜单名称不能为空");
                } else if (!lowerCase.equals("activity") && !lowerCase.equals("wauxv")) {
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "类型仅支持 activity 或 wauxv");
                } else if (str7.length() == 0) {
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "动作值不能为空");
                } else if (!lowerCase.equals("wauxv") || C3613Ujhhgtgfeyxiexzf.f11247Ujhhgtgfeyxiexzf.contains(str7)) {
                    C3485Ujhhgtgfeyxiexzf c3485Ujhhgtgfeyxiexzf2 = c3485Ujhhgtgfeyxiexzf;
                    ArrayList arrayList2 = arrayList;
                    C3485Ujhhgtgfeyxiexzf c3485Ujhhgtgfeyxiexzf3 = new C3485Ujhhgtgfeyxiexzf(str5, str6, zIsChecked, lowerCase, c3485Ujhhgtgfeyxiexzf2 != null ? c3485Ujhhgtgfeyxiexzf2.f10821Ujhhgtgfeyxiexzf : arrayList2.size(), str7);
                    if (c3485Ujhhgtgfeyxiexzf2 == null) {
                        arrayList2.add(c3485Ujhhgtgfeyxiexzf3);
                    } else {
                        Iterator it = arrayList2.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            }
                            if (((C3485Ujhhgtgfeyxiexzf) it.next()).f10821Ujhhgtgfeyxiexzf == c3485Ujhhgtgfeyxiexzf2.f10821Ujhhgtgfeyxiexzf) {
                                break;
                            }
                            i++;
                        }
                        if (i < 0) {
                            AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "菜单项不存在");
                        } else {
                            arrayList2.set(i, c3485Ujhhgtgfeyxiexzf3);
                        }
                    }
                    C3613Ujhhgtgfeyxiexzf.f11238Ujhhgtgfeyxiexzf.getClass();
                    C3613Ujhhgtgfeyxiexzf.m5252feyxiexzfUjhhgtg(arrayList2, c3476feyxiexzfUjhhgtg);
                } else {
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "wauxv 动作仅支持 openSetting、clearUnreadCount、killProcess");
                }
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
            }
        });
        AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
    }

    @Override // p000.InterfaceC0611Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public final void mo1873Ujhhgtgfeyxiexzf(Activity activity, ViewGroup viewGroup, Object obj) {
        if (mo1424feyxiexzfUjhhgtg()) {
            ViewGroup viewGroupM4522Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4522Ujhhgtgfeyxiexzf(viewGroup);
            f11238Ujhhgtgfeyxiexzf.getClass();
            List listM5251feyxiexzfUjhhgtg = m5251feyxiexzfUjhhgtg();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM5251feyxiexzfUjhhgtg) {
                if (((C3485Ujhhgtgfeyxiexzf) obj2).f10825Ujhhgtgfeyxiexzf) {
                    arrayList.add(obj2);
                }
            }
            C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(viewGroupM4522Ujhhgtgfeyxiexzf, AbstractC2856feyxiexzfUjhhgtg.m4248feyxiexzfUjhhgtg(arrayList, new C2419Ujhhgtgfeyxiexzf(11)), 12, false);
            Context context = viewGroupM4522Ujhhgtgfeyxiexzf.getContext();
            C3164feyxiexzfUjhhgtg c3164feyxiexzfUjhhgtg = new C3164feyxiexzfUjhhgtg(context);
            c3164feyxiexzfUjhhgtg.f9161Ujhhgtgfeyxiexzf = true;
            c3164feyxiexzfUjhhgtg.f2096Ujhhgtgfeyxiexzf = new C2466feyxiexzfUjhhgtg(27);
            c3164feyxiexzfUjhhgtg.f2097Ujhhgtgfeyxiexzf = 40L;
            c3164feyxiexzfUjhhgtg.f2098Ujhhgtgfeyxiexzf = 600L;
            c3164feyxiexzfUjhhgtg.f2099Ujhhgtgfeyxiexzf = 600L;
            c3164feyxiexzfUjhhgtg.f2100Ujhhgtgfeyxiexzf = -16777216;
            c3164feyxiexzfUjhhgtg.f2101Ujhhgtgfeyxiexzf = -1;
            EnumC1443feyxiexzfUjhhgtg enumC1443feyxiexzfUjhhgtg = EnumC1443feyxiexzfUjhhgtg.f5048Ujhhgtgfeyxiexzf;
            c3164feyxiexzfUjhhgtg.f2105Ujhhgtgfeyxiexzf = enumC1443feyxiexzfUjhhgtg;
            c3164feyxiexzfUjhhgtg.f2111Ujhhgtgfeyxiexzf = new ArrayList();
            c3164feyxiexzfUjhhgtg.setupBaseViews(context);
            Resources.Theme theme = c3164feyxiexzfUjhhgtg.getContext().getTheme();
            int[] iArr = AbstractC0771feyxiexzfUjhhgtg.f3053Ujhhgtgfeyxiexzf;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
            try {
                c3164feyxiexzfUjhhgtg.f2097Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInteger(3, 40);
                c3164feyxiexzfUjhhgtg.f2098Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInteger(9, 600);
                c3164feyxiexzfUjhhgtg.f2099Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInteger(1, 600);
                c3164feyxiexzfUjhhgtg.setOpenInterpolatorAnimator(AnimationUtils.loadInterpolator(c3164feyxiexzfUjhhgtg.getContext(), typedArrayObtainStyledAttributes.getResourceId(10, R.anim.default_menu_interpolator)));
                c3164feyxiexzfUjhhgtg.setCloseInterpolatorAnimator(AnimationUtils.loadInterpolator(c3164feyxiexzfUjhhgtg.getContext(), typedArrayObtainStyledAttributes.getResourceId(2, R.anim.default_menu_interpolator)));
                c3164feyxiexzfUjhhgtg.setMainButtonColor(typedArrayObtainStyledAttributes.getColor(5, -16777216));
                c3164feyxiexzfUjhhgtg.setMainButtonIconColor(typedArrayObtainStyledAttributes.getColor(7, -1));
                if (typedArrayObtainStyledAttributes.hasValue(6)) {
                    c3164feyxiexzfUjhhgtg.setMainButtonIcon(c3164feyxiexzfUjhhgtg.getResources().getDrawable(typedArrayObtainStyledAttributes.getResourceId(6, 0), null));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(11, 0);
                for (EnumC1443feyxiexzfUjhhgtg enumC1443feyxiexzfUjhhgtg2 : EnumC1443feyxiexzfUjhhgtg.values()) {
                    if (enumC1443feyxiexzfUjhhgtg2.ordinal() == integer) {
                        enumC1443feyxiexzfUjhhgtg = enumC1443feyxiexzfUjhhgtg2;
                        break;
                    }
                }
                c3164feyxiexzfUjhhgtg.setPositionGravity(enumC1443feyxiexzfUjhhgtg);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = c3164feyxiexzfUjhhgtg.getContext().getTheme().obtainStyledAttributes(null, iArr, 0, 0);
                try {
                    int integer2 = typedArrayObtainStyledAttributes2.getInteger(4, 1);
                    EnumC3502feyxiexzfUjhhgtg enumC3502feyxiexzfUjhhgtg = EnumC3502feyxiexzfUjhhgtg.f10901Ujhhgtgfeyxiexzf;
                    if (integer2 != 0) {
                        enumC3502feyxiexzfUjhhgtg = EnumC3502feyxiexzfUjhhgtg.f10902Ujhhgtgfeyxiexzf;
                    }
                    c3164feyxiexzfUjhhgtg.setExpandDirection(enumC3502feyxiexzfUjhhgtg);
                    c3164feyxiexzfUjhhgtg.f9796feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes2.getLayoutDimension(8, (int) c3164feyxiexzfUjhhgtg.getResources().getDimension(R.dimen.default_margin_between_menu_items));
                    typedArrayObtainStyledAttributes2.recycle();
                    c3164feyxiexzfUjhhgtg.setMainButtonColor(Color.parseColor((AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(c3164feyxiexzfUjhhgtg.getContext()) ? C3486feyxiexzfUjhhgtg.f10826Ujhhgtgfeyxiexzf : C3482Ujhhgtgfeyxiexzf.f10817Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf()));
                    c3164feyxiexzfUjhhgtg.setMainButtonIcon(AbstractC0889feyxiexzfUjhhgtg.m2368Ujhhgtgfeyxiexzf(c3164feyxiexzfUjhhgtg.getContext(), R.drawable.ic_float_button_icon_24dp));
                    c3164feyxiexzfUjhhgtg.setMainButtonIconColor(Color.parseColor((AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(c3164feyxiexzfUjhhgtg.getContext()) ? C3481Ujhhgtgfeyxiexzf.f10816Ujhhgtgfeyxiexzf : C3484feyxiexzfUjhhgtg.f10819Ujhhgtgfeyxiexzf).m4623Ujhhgtgfeyxiexzf()));
                    c3164feyxiexzfUjhhgtg.setDelayBetweenItemsAnimation(20L);
                    c3164feyxiexzfUjhhgtg.setOpenAnimationDuration(300L);
                    c3164feyxiexzfUjhhgtg.setCloseAnimationDuration(300L);
                    c3164feyxiexzfUjhhgtg.setMarginBetweenMenuItems((int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(64, c3164feyxiexzfUjhhgtg.getContext()));
                    c3164feyxiexzfUjhhgtg.setPositionGravity(EnumC1443feyxiexzfUjhhgtg.f5052Ujhhgtgfeyxiexzf);
                    c3164feyxiexzfUjhhgtg.setAdapter(c2629Ujhhgtgfeyxiexzf);
                    c3164feyxiexzfUjhhgtg.setOnItemSelectedListener(new C0530Ujhhgtgfeyxiexzf(c3164feyxiexzfUjhhgtg, 1, c2629Ujhhgtgfeyxiexzf));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 8388693;
                    layoutParams.bottomMargin = (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(64, viewGroupM4522Ujhhgtgfeyxiexzf.getContext());
                    layoutParams.rightMargin = (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(8, viewGroupM4522Ujhhgtgfeyxiexzf.getContext());
                    viewGroupM4522Ujhhgtgfeyxiexzf.addView(c3164feyxiexzfUjhhgtg, layoutParams);
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

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f11244Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f11243Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f11242Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f11245Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo2873feyxiexzfUjhhgtg() {
        return f11246Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
