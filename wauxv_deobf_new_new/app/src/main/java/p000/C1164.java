package p000;

import android.app.Activity;
import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᲀᛸᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1164 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4286;

    public /* synthetic */ C1164(int i) {
        this.f4286 = i;
    }

    /* JADX WARN: Code duplicated, block: B:255:0x088a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        boolean z;
        Object c2641;
        Object c2642;
        Object c2643;
        Object c2644;
        boolean zStartsWith;
        Object c2645;
        Object c2646;
        int i = this.f4286;
        Class<String> cls = String.class;
        int i2 = R.id.MenuItem_Group;
        int i3 = 26;
        Class cls2 = Integer.TYPE;
        int i4 = 3;
        int i5 = R.id.MenuItem_Fav_Forward;
        int i6 = 12;
        int i7 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                ((C1334) obj).m3153(new C1164(1 == true ? 1 : 0));
                return c3554;
            case 1:
                String[] strArr = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.emoji.EmojiInfoStorage", "md5 is null or invalue. md5:%s");
                return c3554;
            case 2:
                ((C1023) obj).f3739 = new C1164(i4);
                return c3554;
            case 3:
                ((C1334) obj).m3153(new C1164(5));
                return c3554;
            case 4:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Class<String> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                if (AbstractC1469.m3322(obj2, clsM4232 != null ? clsM4232 : String.class)) {
                    Object obj3 = list.get(1);
                    C1163.f4285.getClass();
                    if (AbstractC1469.m3322(obj3, AbstractC0972.m2610(C1162.f4284).getDeclaringClass())) {
                        Object obj4 = list.get(2);
                        C2092.f6978.getClass();
                        z = AbstractC1469.m3322(obj4, AbstractC0972.m2608(C2091.f6977));
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                String[] strArr2 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: context is null");
                return c3554;
            case 6:
                C2041 c2041M4059 = C2041.m4059(LayoutInflater.from(((View) obj).getContext()));
                c2041M4059.f6811.setText(C1176.f4303.m2666());
                C2037 c2037 = new C2037();
                C1177.f4304.getClass();
                c2037.f6779 = C1177.f4307;
                c2037.f6781 = c2041M4059.f6810;
                String[] strArr3 = AbstractC1471.f5234;
                c2037.m4057("保存", new C1175(c2041M4059, 0));
                c2037.m4056("重置", new C0112(26));
                C2037.m4053(c2037, null, 3);
                c2037.m4055().m3985();
                return c3554;
            case 7:
                ((C1023) obj).f3739 = new C1164(8);
                return c3554;
            case 8:
                C1334 c1334 = (C1334) obj;
                String[] strArr4 = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.storage");
                C0700 c0700 = new C0700();
                c0700.m2220("MicroMsg.emoji.EmojiStorageMgr", "EmojiStorageMgr: %s");
                c1334.f4791 = c0700;
                return c3554;
            case 9:
                ((C1023) obj).f3740 = new C1164(11);
                return c3554;
            case 10:
                C1574 c1574 = (C1574) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[0];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                String str = (String) c2641;
                try {
                    c2642 = c1574.m3447()[1];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                for (InterfaceC1595 interfaceC1595 : C1262.f4591) {
                    try {
                        if (((C0615) interfaceC1595).mo3445() && AbstractC1469.m3322(str, "clicfg_conv_mvvm_list")) {
                            c1574.m3452("0");
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C3741.f11709;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onGetExptConfig ");
                        sb.append(interfaceC1595 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1595).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb, " Failed", e, 12);
                    }
                }
                return c3554;
            case 11:
                ((C1335) obj).m3155(new C1164(i6));
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                C2012 c2012 = (C2012) obj;
                Class<String> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                if (clsM4233 == null) {
                    clsM4233 = cls;
                }
                Class<String> clsM4774 = AbstractC2844.m4774(c2012, clsM4233, cls);
                if (clsM4774 == null) {
                    clsM4774 = cls;
                }
                Class<String> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                cls = clsM4234 != null ? clsM4234 : String.class;
                Class<Boolean> clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(Boolean.class));
                c2012.m4017(clsM4774, cls, clsM4235 != null ? clsM4235 : Boolean.class);
                String[] strArr6 = AbstractC1471.f5234;
                c2012.m4021("MicroMsg.ExptService", "Fail to query value, return default value '%s' instead.");
                return c3554;
            case 13:
                ((C1023) obj).f3740 = new C1164(18);
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                ((C1023) obj).f3740 = new C1164(17);
                return c3554;
            case 15:
                C1574 c1575 = (C1574) obj;
                String[] strArr7 = AbstractC1471.f5234;
                LinkedHashSet<InterfaceC1596> linkedHashSet = C1291.f4703;
                c1575.getClass();
                try {
                    c2643 = c1575.m3447()[0];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                ContextMenu contextMenu = (ContextMenu) (c2643 instanceof C2641 ? null : c2643);
                if (AbstractC0972.m2596(EnumC3737.f11677) || AbstractC0972.m2597(EnumC3734.f11644)) {
                    int i8 = AbstractC1768.f5906;
                    C1300 c1300M3558 = AbstractC2727.m4713(contextMenu).m3558();
                    c1300M3558.f4724 = AbstractC2574.m4549(Context.class);
                    AbstractC2902.m4896((Context) ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3127());
                    C2933 c2933 = new C2933(new C1287(contextMenu, i7));
                    for (InterfaceC1596 interfaceC1596 : linkedHashSet) {
                        try {
                            for (C1288 c1288 : ((C2146) interfaceC1596).m4112()) {
                                C2013 c2013M4024 = ((C2013) c2933.getValue()).m4024();
                                c2013M4024.m3542(contextMenu);
                                try {
                                    Integer numValueOf = Integer.valueOf(R.id.MenuItem_Group);
                                    c1288.getClass();
                                    c2013M4024.m4025(numValueOf, Integer.valueOf(i5), 0, c1288.f4698, Integer.valueOf(R.drawable.ic_menu_forward_24dp));
                                    i5 = R.id.MenuItem_Fav_Forward;
                                } catch (Exception e2) {
                                    e = e2;
                                    ArrayList arrayList2 = C3741.f11709;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("onCreateMenuItems ");
                                    sb2.append(interfaceC1596 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1596).mo1274() : "LoadHook");
                                    AbstractC1095.m2808(sb2, " Failed", e, 12);
                                    i5 = R.id.MenuItem_Fav_Forward;
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                        i5 = R.id.MenuItem_Fav_Forward;
                    }
                } else {
                    for (InterfaceC1596 interfaceC1597 : linkedHashSet) {
                        try {
                            for (C1288 c1289 : ((C2146) interfaceC1597).m4112()) {
                                c1289.getClass();
                                contextMenu.add(R.id.MenuItem_Group, R.id.MenuItem_Fav_Forward, 0, c1289.f4698);
                            }
                        } catch (Exception e4) {
                            ArrayList arrayList3 = C3741.f11709;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onCreateMenuItems ");
                            sb3.append(interfaceC1597 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1597).mo1274() : "LoadHook");
                            AbstractC1095.m2808(sb3, " Failed", e4, 12);
                        }
                    }
                }
                return c3554;
            case 16:
                C1574 c1576 = (C1574) obj;
                String[] strArr8 = AbstractC1471.f5234;
                c1576.getClass();
                try {
                    c2644 = c1576.m3447()[0];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                MenuItem menuItem = (MenuItem) (c2644 instanceof C2641 ? null : c2644);
                int i9 = AbstractC1768.f5906;
                C1300 c1300M4772 = AbstractC2844.m4772(c1576);
                c1300M4772.f4724 = AbstractC2574.m4549(cls2);
                int iIntValue = ((Number) ((C1316) AbstractC0739.m2290(c1300M4772.m3117())).m3127()).intValue();
                C1300 c1300M4773 = AbstractC2844.m4772(c1576);
                c1300M4773.f4724 = "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI";
                C1300 c1300M3559 = AbstractC2727.m4713((Activity) ((C1316) AbstractC0739.m2290(c1300M4773.m3117())).m3127()).m3558();
                c1300M3559.f4725 = new C1164(19);
                Object item = ((BaseAdapter) ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3127()).getItem(iIntValue);
                for (InterfaceC1596 interfaceC1598 : C1291.f4703) {
                    try {
                        for (C1288 c12810 : ((C2146) interfaceC1598).m4112()) {
                            int itemId = menuItem.getItemId();
                            c12810.getClass();
                            if (itemId == R.id.MenuItem_Fav_Forward) {
                                c12810.f4699.invoke(item);
                            }
                        }
                    } catch (Exception e5) {
                        ArrayList arrayList4 = C3741.f11709;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("onCreateMenuItems ");
                        sb4.append(interfaceC1598 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1598).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb4, " Failed", e5, 12);
                    }
                }
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1335 c1335 = (C1335) obj;
                String[] strArr9 = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.plugin.fav.ui");
                C2012 c2013 = new C2012();
                c2013.m4021("MicroMsg.FavoriteIndexUI", "onMMMenuItemSelected");
                c1335.f4794 = c2013;
                return c3554;
            case Opcodes.LDC /* 18 */:
                C1335 c1336 = (C1335) obj;
                String[] strArr10 = AbstractC1471.f5234;
                c1336.m3156("com.tencent.mm.plugin.fav.ui");
                C2012 c2014 = new C2012();
                c2014.m4021("MicroMsg.FavoriteIndexUI", (AbstractC0972.m2596(EnumC3737.f11677) || AbstractC0972.m2597(EnumC3734.f11644)) ? "[OnCreateContextMMMenu] pos = " : "onCreateContextMenu() pos:%s id:%s fav_id:%s");
                c1336.f4794 = c2014;
                return c3554;
            case 19:
                zStartsWith = ((Class) obj).getName().startsWith("com.tencent.mm.plugin.fav.ui.adapter.");
                break;
            case 20:
                ((C1023) obj).f3740 = new C1164(25);
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                ((C1023) obj).f3740 = new C1164(22);
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                C1335 c1337 = (C1335) obj;
                String[] strArr11 = AbstractC1471.f5234;
                c1337.m3156("com.tencent.mm.plugin.fav.ui");
                C2012 c2015 = new C2012();
                c2015.m4021("MicroMsg.FavSearchManager", "onMMMenuItemSelected");
                c1337.f4794 = c2015;
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                C1574 c1577 = (C1574) obj;
                c1577.getClass();
                try {
                    c2645 = c1577.m3447()[0];
                    if (c2645 == null) {
                        c2645 = null;
                    }
                } catch (Throwable th5) {
                    c2645 = new C2641(th5);
                }
                ContextMenu contextMenu2 = (ContextMenu) (c2645 instanceof C2641 ? null : c2645);
                int i10 = AbstractC1768.f5906;
                C1300 c1300M35510 = AbstractC2727.m4713(contextMenu2).m3558();
                c1300M35510.f4724 = AbstractC2574.m4549(Context.class);
                AbstractC2902.m4896((Context) ((C1316) AbstractC0739.m2290(c1300M35510.m3117())).m3127());
                C2933 c2934 = new C2933(new C1287(contextMenu2, 1 == true ? 1 : 0));
                for (InterfaceC1597 interfaceC1599 : C1295.f4709) {
                    try {
                        for (C1292 c1292 : ((C2145) interfaceC1599).m4111()) {
                            C2013 c2013M4025 = ((C2013) c2934.getValue()).m4024();
                            c2013M4025.m3542(contextMenu2);
                            Integer numValueOf2 = Integer.valueOf(i2);
                            c1292.getClass();
                            try {
                                c2013M4025.m4025(numValueOf2, Integer.valueOf(R.id.MenuItem_Fav_Forward), 0, c1292.f4704, Integer.valueOf(R.drawable.ic_menu_forward_24dp));
                                i2 = R.id.MenuItem_Group;
                            } catch (Exception e6) {
                                e = e6;
                                ArrayList arrayList5 = C3741.f11709;
                                StringBuilder sb5 = new StringBuilder();
                                String[] strArr12 = AbstractC1471.f5234;
                                sb5.append("onCreateMenuItems ");
                                sb5.append(interfaceC1599 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC1599).mo1274() : "LoadHook");
                                AbstractC1095.m2808(sb5, " Failed", e, 12);
                                i2 = R.id.MenuItem_Group;
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                    }
                    i2 = R.id.MenuItem_Group;
                }
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                C1574 c1578 = (C1574) obj;
                String[] strArr13 = AbstractC1471.f5234;
                c1578.getClass();
                try {
                    c2646 = c1578.m3447()[0];
                    if (c2646 == null) {
                        c2646 = null;
                    }
                } catch (Throwable th6) {
                    c2646 = new C2641(th6);
                }
                MenuItem menuItem2 = (MenuItem) (c2646 instanceof C2641 ? null : c2646);
                int i11 = AbstractC1768.f5906;
                C1300 c1300M4774 = AbstractC2844.m4772(c1578);
                c1300M4774.f4724 = AbstractC2574.m4549(cls2);
                int iIntValue2 = ((Number) ((C1316) AbstractC0739.m2290(c1300M4774.m3117())).m3127()).intValue();
                C1300 c1300M4775 = AbstractC2844.m4772(c1578);
                c1300M4775.f6475 = "d";
                C1300 c1300M35511 = AbstractC2727.m4713(((C1316) AbstractC0739.m2290(c1300M4775.m3117())).m3126()).m3558();
                c1300M35511.f4725 = new C1164(i3);
                Object item2 = ((BaseAdapter) ((C1316) AbstractC0739.m2290(c1300M35511.m3117())).m3127()).getItem(iIntValue2);
                for (InterfaceC1597 interfaceC15910 : C1295.f4709) {
                    try {
                        for (C1292 c1293 : ((C2145) interfaceC15910).m4111()) {
                            int itemId2 = menuItem2.getItemId();
                            c1293.getClass();
                            if (itemId2 == R.id.MenuItem_Fav_Forward) {
                                c1293.f4705.invoke(item2);
                            }
                        }
                    } catch (Exception e8) {
                        ArrayList arrayList6 = C3741.f11709;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("onCreateMenuItems ");
                        sb6.append(interfaceC15910 instanceof AbstractC2927 ? ((AbstractC2927) interfaceC15910).mo1274() : "LoadHook");
                        AbstractC1095.m2808(sb6, " Failed", e8, 12);
                    }
                }
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                C1335 c1338 = (C1335) obj;
                String[] strArr14 = AbstractC1471.f5234;
                c1338.m3156("com.tencent.mm.plugin.fav.ui");
                C2012 c2016 = new C2012();
                c2016.m4021("MicroMsg.FavSearchManager", "itemInfo exist detail but no note or record, error!");
                c1338.f4794 = c2016;
                return c3554;
            case 26:
                zStartsWith = ((Class) obj).getName().startsWith("com.tencent.mm.plugin.fav.ui.adapter.");
                break;
            case 27:
                String[] strArr15 = AbstractC1471.f5234;
                ((C0700) obj).m2220("VFS.VFSStrategy", "Found wrong moving file: ");
                return c3554;
            case 28:
                C2041 c2041M40510 = C2041.m4059(LayoutInflater.from(((View) obj).getContext()));
                c2041M40510.f6811.setText(C1324.f4771.m2666());
                C2037 c2038 = new C2037();
                C1325.f4772.getClass();
                c2038.f6779 = C1325.f4775;
                c2038.f6781 = c2041M40510.f6810;
                String[] strArr16 = AbstractC1471.f5234;
                c2038.m4057("保存", new C1175(c2041M40510, 1));
                c2038.m4056("重置", new C0112(28));
                C2037.m4053(c2038, null, 3);
                c2038.m4055().m3985();
                return c3554;
            default:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C1322(i7);
                c1023.f3740 = new C1322(1 == true ? 1 : 0);
                return c3554;
        }
        return Boolean.valueOf(zStartsWith);
    }
}
