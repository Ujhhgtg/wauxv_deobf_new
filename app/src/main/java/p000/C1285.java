package p000;

import android.app.Activity;
import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import me.hd.wauxv.R;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᲁᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1285 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4696;

    public /* synthetic */ C1285(int i) {
        this.f4696 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        Object c2586;
        boolean zStartsWith;
        Object c2587;
        Object c2588;
        Object c2589;
        Object c25810;
        Object c25811;
        Object c25812;
        int i = this.f4696;
        int i2 = R.id.MenuItem_Group;
        Class cls = Integer.TYPE;
        int i3 = R.id.MenuItem_Fav_Forward;
        int i4 = 12;
        int i5 = 4;
        Unit unit = Unit.INSTANCE;
        switch (i) {
            case 0:
                ((C1020) obj).thisMethodMatcher = new C1285(5);
                return unit;
            case 1:
                ((C1020) obj).thisMethodMatcher = new C1285(4);
                return unit;
            case 2:
                C1563 c1563 = (C1563) obj;
                String[] strArr = AbstractC1574.f5469;
                LinkedHashSet<Object> linkedHashSet = C1290.f4704;
                
                try {
                    c2585 = c1563.m3267()[0];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                ContextMenu contextMenu = (ContextMenu) (c2585 instanceof C2585 ? null : c2585);
                if (AbstractC3471.m5079(WeChatVersions.f11528) || AbstractC3471.m5080(WeChatVersionsPlay.f11495)) {
                    int i6 = 0;
                    C1299 c1299M3490 = AbstractC0968.startFieldResolution(contextMenu).m3490();
                    c1299M3490.fieldType = AbstractC2519.classToKClass(Context.class);
                    AbstractC2207.m4098((Context) ((C1315) AbstractC0744.firstInList(c1299M3490.resolve())).m3024());
                    C2873 c2873 = new C2873(new C1286(contextMenu, 0));
                    for (Object obj2 : linkedHashSet) {
                        try {
                            for (C1287 c1287 : ((C2113) obj2).m3928()) {
                                C1982 c1982M3830 = ((C1982) c2873.getValue()).m3830();
                                c1982M3830.m3378(contextMenu);
                                try {
                                    Integer numValueOf = Integer.valueOf(R.id.MenuItem_Group);
                                    
                                    c1982M3830.m3831(numValueOf, Integer.valueOf(i3), 0, c1287.f4699, Integer.valueOf(R.drawable.ic_menu_forward_24dp));
                                    i3 = R.id.MenuItem_Fav_Forward;
                                } catch (Exception e) {
                                    e = e;
                                    ArrayList arrayList = C3678.f11549;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("onCreateMenuItems ");
                                    sb.append(true ? ((AbstractC2867) obj2).mo1128() : "LoadHook");
                                    AbstractC1194.m2792(sb, " Failed", e, 12);
                                    i3 = R.id.MenuItem_Fav_Forward;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        i3 = R.id.MenuItem_Fav_Forward;
                    }
                } else {
                    for (Object obj3 : linkedHashSet) {
                        try {
                            for (C1287 c1288 : ((C2113) obj3).m3928()) {
                                
                                contextMenu.add(R.id.MenuItem_Group, R.id.MenuItem_Fav_Forward, 0, c1288.f4699);
                            }
                        } catch (Exception e3) {
                            ArrayList arrayList2 = C3678.f11549;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("onCreateMenuItems ");
                            sb2.append(obj3 instanceof AbstractC2867 ? ((AbstractC2867) obj3).mo1128() : "LoadHook");
                            AbstractC1194.m2792(sb2, " Failed", e3, 12);
                        }
                    }
                }
                return unit;
            case 3:
                C1563 c1564 = (C1563) obj;
                String[] strArr2 = AbstractC1574.f5469;
                
                try {
                    c2586 = c1564.m3267()[0];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                MenuItem menuItem = (MenuItem) (c2586 instanceof C2585 ? null : c2586);
                int i7 = 0;
                C1299 c1299M4738 = AbstractC2784.m4738(c1564);
                c1299M4738.fieldType = AbstractC2519.classToKClass(cls);
                int iIntValue = ((Number) ((C1315) AbstractC0744.firstInList(c1299M4738.resolve())).m3024()).intValue();
                C1299 c1299M4739 = AbstractC2784.m4738(c1564);
                c1299M4739.fieldType = "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI";
                C1299 c1299M3491 = AbstractC0968.startFieldResolution((Activity) ((C1315) AbstractC0744.firstInList(c1299M4739.resolve())).m3024()).m3490();
                c1299M3491.f4726 = new C1285(6);
                Object item = ((BaseAdapter) ((C1315) AbstractC0744.firstInList(c1299M3491.resolve())).m3024()).getItem(iIntValue);
                for (Object obj4 : C1290.f4704) {
                    try {
                        for (C1287 c1289 : ((C2113) obj4).m3928()) {
                            int itemId = menuItem.getItemId();
                            
                            if (itemId == R.id.MenuItem_Fav_Forward) {
                                c1289.f4700.invoke(item);
                            }
                        }
                    } catch (Exception e4) {
                        ArrayList arrayList3 = C3678.f11549;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("onCreateMenuItems ");
                        sb3.append(obj4 instanceof AbstractC2867 ? ((AbstractC2867) obj4).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb3, " Failed", e4, 12);
                    }
                }
                return unit;
            case 4:
                C1333 c1333 = (C1333) obj;
                String[] strArr3 = AbstractC1574.f5469;
                c1333.m3053("com.tencent.mm.plugin.fav.ui");
                C1981 c1981 = new C1981(4);
                c1981.m3827("MicroMsg.FavoriteIndexUI", "onMMMenuItemSelected");
                c1333.f4794 = c1981;
                return unit;
            case 5:
                C1333 c1334 = (C1333) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1334.m3053("com.tencent.mm.plugin.fav.ui");
                C1981 c1982 = new C1981(4);
                c1982.m3827("MicroMsg.FavoriteIndexUI", (AbstractC3471.m5079(WeChatVersions.f11528) || AbstractC3471.m5080(WeChatVersionsPlay.f11495)) ? "[OnCreateContextMMMenu] pos = " : "onCreateContextMenu() pos:%s id:%s fav_id:%s");
                c1334.f4794 = c1982;
                return unit;
            case 6:
                zStartsWith = ((Class) obj).getName().startsWith("com.tencent.mm.plugin.fav.ui.adapter.");
                break;
            case 7:
                ((C1020) obj).thisMethodMatcher = new C1285(12);
                return unit;
            case 8:
                ((C1020) obj).thisMethodMatcher = new C1285(9);
                return unit;
            case 9:
                C1333 c1335 = (C1333) obj;
                String[] strArr5 = AbstractC1574.f5469;
                c1335.m3053("com.tencent.mm.plugin.fav.ui");
                C1981 c1983 = new C1981(4);
                c1983.m3827("MicroMsg.FavSearchManager", "onMMMenuItemSelected");
                c1335.f4794 = c1983;
                return unit;
            case 10:
                C1563 c1565 = (C1563) obj;
                
                try {
                    c2587 = c1565.m3267()[0];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                ContextMenu contextMenu2 = (ContextMenu) (c2587 instanceof C2585 ? null : c2587);
                int i8 = 0;
                C1299 c1299M3492 = AbstractC0968.startFieldResolution(contextMenu2).m3490();
                c1299M3492.fieldType = AbstractC2519.classToKClass(Context.class);
                AbstractC2207.m4098((Context) ((C1315) AbstractC0744.firstInList(c1299M3492.resolve())).m3024());
                C2873 c2874 = new C2873(new C1286(contextMenu2, 1));
                for (Object obj5 : C1294.f4710) {
                    try {
                        for (C1291 c1291 : ((C2112) obj5).m3927()) {
                            C1982 c1982M3831 = ((C1982) c2874.getValue()).m3830();
                            c1982M3831.m3378(contextMenu2);
                            Integer numValueOf2 = Integer.valueOf(i2);
                            
                            try {
                                c1982M3831.m3831(numValueOf2, Integer.valueOf(R.id.MenuItem_Fav_Forward), 0, c1291.f4705, Integer.valueOf(R.drawable.ic_menu_forward_24dp));
                                i2 = R.id.MenuItem_Group;
                            } catch (Exception e5) {
                                e = e5;
                                ArrayList arrayList4 = C3678.f11549;
                                StringBuilder sb4 = new StringBuilder();
                                String[] strArr6 = AbstractC1574.f5469;
                                sb4.append("onCreateMenuItems ");
                                sb4.append(true ? ((AbstractC2867) obj5).mo1128() : "LoadHook");
                                AbstractC1194.m2792(sb4, " Failed", e, 12);
                                i2 = R.id.MenuItem_Group;
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                    }
                    i2 = R.id.MenuItem_Group;
                }
                return unit;
            case 11:
                C1563 c1566 = (C1563) obj;
                String[] strArr7 = AbstractC1574.f5469;
                
                try {
                    c2588 = c1566.m3267()[0];
                    if (c2588 == null) {
                        c2588 = null;
                    }
                } catch (Throwable th4) {
                    c2588 = new C2585(th4);
                }
                MenuItem menuItem2 = (MenuItem) (c2588 instanceof C2585 ? null : c2588);
                int i9 = 0;
                C1299 c1299M47310 = AbstractC2784.m4738(c1566);
                c1299M47310.fieldType = AbstractC2519.classToKClass(cls);
                int iIntValue2 = ((Number) ((C1315) AbstractC0744.firstInList(c1299M47310.resolve())).m3024()).intValue();
                C1299 c1299M47311 = AbstractC2784.m4738(c1566);
                c1299M47311.f6370 = "d";
                C1299 c1299M3493 = AbstractC0968.startFieldResolution(((C1315) AbstractC0744.firstInList(c1299M47311.resolve())).m3023()).m3490();
                c1299M3493.f4726 = new C1285(13);
                Object item2 = ((BaseAdapter) ((C1315) AbstractC0744.firstInList(c1299M3493.resolve())).m3024()).getItem(iIntValue2);
                for (Object obj6 : C1294.f4710) {
                    try {
                        for (C1291 c1292 : ((C2112) obj6).m3927()) {
                            int itemId2 = menuItem2.getItemId();
                            
                            if (itemId2 == R.id.MenuItem_Fav_Forward) {
                                c1292.f4706.invoke(item2);
                            }
                        }
                    } catch (Exception e7) {
                        ArrayList arrayList5 = C3678.f11549;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("onCreateMenuItems ");
                        sb5.append(obj6 instanceof AbstractC2867 ? ((AbstractC2867) obj6).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb5, " Failed", e7, 12);
                    }
                }
                return unit;
            case 12 /* 12 */:
                C1333 c1336 = (C1333) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1336.m3053("com.tencent.mm.plugin.fav.ui");
                C1981 c1984 = new C1981(4);
                c1984.m3827("MicroMsg.FavSearchManager", "itemInfo exist detail but no note or record, error!");
                c1336.f4794 = c1984;
                return unit;
            case 13:
                zStartsWith = ((Class) obj).getName().startsWith("com.tencent.mm.plugin.fav.ui.adapter.");
                break;
            case 14 /* 14 */:
                String[] strArr9 = AbstractC1574.f5469;
                ((C0705) obj).m2127("VFS.VFSStrategy", "Found wrong moving file: ");
                return unit;
            case 15:
                C2011 c2011M3872 = C2011.m3872(LayoutInflater.from(((View) obj).getContext()));
                c2011M3872.f6708.setText(C1322.f4771.m2542());
                C2007 c2007 = new C2007();
                
                c2007.f6678 = C1323.f4775;
                c2007.f6680 = c2011M3872.f6707;
                String[] strArr10 = AbstractC1574.f5469;
                c2007.m3870("保存", new C1173(c2011M3872, 1));
                c2007.m3869("重置", new C0104(28));
                C2007.m3866(c2007, null, 3);
                c2007.m3868().m3791();
                return unit;
            case 16:
                C1020 c1020 = (C1020) obj;
                c1020.declaringClassMatcher = new C1285(17);
                c1020.thisMethodMatcher = new C1285(18);
                return unit;
            case 17 /* 17 */:
                ((C1332) obj).m3050(new C1285(14));
                return unit;
            case 18 /* 18 */:
                C1333 c1337 = (C1333) obj;
                
                C1981 c1985 = new C1981(4);
                C1981.m3819(c1985);
                Class<String> cls2 = String.class;
                Class<String> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                if (clsM2183 == null) {
                    clsM2183 = String.class;
                }
                Class<String> clsM4740 = AbstractC2784.m4740(c1985, clsM2183, String.class);
                c1985.paramTypes(clsM4740 != null ? clsM4740 : String.class);
                c1337.f4794 = c1985;
                return unit;
            case 19:
                C1563 c1567 = (C1563) obj;
                
                try {
                    c2589 = c1567.m3267()[0];
                    if (c2589 == null) {
                        c2589 = null;
                    }
                } catch (Throwable th5) {
                    c2589 = new C2585(th5);
                }
                String str = (String) (c2589 instanceof C2585 ? null : c2589);
                if (str == null) {
                    str = "";
                }
                if (str.equals("attachment")) {
                    c1567.m3272(C1322.f4771.m2542());
                }
                return unit;
            case 20:
                ((C1020) obj).thisMethodMatcher = new C1285(22);
                return unit;
            case 21 /* 21 */:
                C1020 c1021 = (C1020) obj;
                c1021.declaringClassMatcher = new C1285(24);
                c1021.thisMethodMatcher = new C1285(25);
                return unit;
            case 22 /* 22 */:
                C1333 c1338 = (C1333) obj;
                String[] strArr11 = AbstractC1574.f5469;
                c1338.m3053("com.tencent.mm.plugin.finder.feed");
                C1981 c1986 = new C1981(4);
                c1986.m3827("feed", "menu", "sheet", "holder", "KEY_FINDER_SELF_FLAG");
                c1338.f4794 = c1986;
                return unit;
            case 23 /* 23 */:
                C1563 c1568 = (C1563) obj;
                String[] strArr12 = AbstractC1574.f5469;
                
                try {
                    c25810 = c1568.m3267()[0];
                    if (c25810 == null) {
                        c25810 = null;
                    }
                } catch (Throwable th6) {
                    c25810 = new C2585(th6);
                }
                Object obj7 = c25810 instanceof C2585 ? null : c25810;
                try {
                    c25811 = c1568.m3267()[1];
                    if (c25811 == null) {
                        c25811 = null;
                    }
                } catch (Throwable th7) {
                    c25811 = new C2585(th7);
                }
                MenuItem menuItem3 = (MenuItem) (c25811 instanceof C2585 ? null : c25811);
                int i10 = 0;
                C1299 c1299M3494 = AbstractC0968.startFieldResolution(obj7).m3490();
                c1299M3494.fieldType = "com.tencent.mm.plugin.finder.storage.FinderItem";
                Object objM3023 = ((C1315) AbstractC2784.m4741(c1299M3494)).m3023();
                MethodResolver c1973M3492 = AbstractC0968.startFieldResolution(objM3023).m3492();
                c1973M3492.f6370 = "getMediaType";
                int iIntValue3 = ((Number) ((C1982) AbstractC0744.firstInList(c1973M3492.m3799())).invoke(new Object[0])).intValue();
                MethodResolver c1973M3493 = AbstractC0968.startFieldResolution(objM3023).m3492();
                c1973M3493.f6370 = "getMediaList";
                List list = (List) ((C1982) AbstractC0744.firstInList(c1973M3493.m3799())).invoke(new Object[0]);
                ArrayList arrayList6 = new ArrayList(AbstractC0746.m2214(list, 10));
                for (Object obj8 : list) {
                    int i11 = 0;
                    MethodResolver c1973M3494 = AbstractC0968.startFieldResolution(obj8).m3492();
                    c1973M3494.f6370 = "toJSON";
                    arrayList6.add((JSONObject) ((C1982) AbstractC2784.m4742(c1973M3494)).invoke(new Object[0]));
                }
                for (Object obj9 : C1337.f4802) {
                    try {
                        for (C1334 c1339 : ((C3613) obj9).m5219()) {
                            if (menuItem3.getItemId() == c1339.f4795) {
                                c1339.f4798.mo1196(Integer.valueOf(iIntValue3), arrayList6);
                            }
                        }
                    } catch (Exception e8) {
                        ArrayList arrayList7 = C3678.f11549;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("onCreateMenuItems ");
                        sb6.append(obj9 instanceof AbstractC2867 ? ((AbstractC2867) obj9).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb6, " Failed", e8, 12);
                    }
                }
                return unit;
            case 24 /* 24 */:
                C1332 c1332 = (C1332) obj;
                String[] strArr13 = AbstractC1574.f5469;
                c1332.m3051("com.tencent.mm.plugin.finder.feed");
                C0705 c0705 = new C0705(4);
                c0705.m2127("Finder.FinderLoaderFeedUIContract.Presenter", "getMoreMenuItemSelectedListener feed ");
                c1332.f4791 = c0705;
                return unit;
            case 25 /* 25 */:
                ((C1333) obj).m3052(new C1285(27));
                return unit;
            case 26:
                C1563 c1569 = (C1563) obj;
                
                try {
                    c25812 = c1569.m3267()[1];
                    if (c25812 == null) {
                        c25812 = null;
                    }
                } catch (Throwable th8) {
                    c25812 = new C2585(th8);
                }
                ContextMenu contextMenu3 = (ContextMenu) (c25812 instanceof C2585 ? null : c25812);
                int i12 = 0;
                C1299 c1299M3495 = AbstractC0968.startFieldResolution(contextMenu3).m3490();
                c1299M3495.fieldType = AbstractC2519.classToKClass(Context.class);
                AbstractC2207.m4098((Context) ((C1315) AbstractC0744.firstInList(c1299M3495.resolve())).m3024());
                C2873 c2875 = new C2873(new C1286(contextMenu3, 2));
                for (Object obj10 : C1337.f4802) {
                    try {
                        for (C1334 c13310 : ((C3613) obj10).m5219()) {
                            C1982 c1982M3832 = ((C1982) c2875.getValue()).m3830();
                            c1982M3832.m3378(contextMenu3);
                            c1982M3832.m3831(Integer.valueOf(c13310.f4795), c13310.f4796, Integer.valueOf(c13310.f4797));
                        }
                    } catch (Exception e9) {
                        ArrayList arrayList8 = C3678.f11549;
                        StringBuilder sb7 = new StringBuilder();
                        String[] strArr14 = AbstractC1574.f5469;
                        sb7.append("onCreateMenuItems ");
                        sb7.append(obj10 instanceof AbstractC2867 ? ((AbstractC2867) obj10).mo1128() : "LoadHook");
                        AbstractC1194.m2792(sb7, " Failed", e9, 12);
                    }
                }
                return unit;
            case 27:
                ((C1981) obj).m3827("getMoreMenuItemSelectedListener feed ");
                return unit;
            case 28:
                ((C1020) obj).thisMethodMatcher = new C1338(1);
                return unit;
            default:
                ((C1020) obj).thisMethodMatcher = new C1338(0);
                return unit;
        }
        return Boolean.valueOf(zStartsWith);
    }
}
