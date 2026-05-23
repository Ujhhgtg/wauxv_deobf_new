package p000;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.Iterator;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0807 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3169;

    public /* synthetic */ C0807(int i) {
        this.f3169 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        Object c2586;
        Object c2587;
        Object c2588;
        Object c2589;
        Object c25810;
        Object c25811;
        Object c25812;
        Object c25813;
        int i = this.f3169;
        Class<String> cls = String.class;
        Class<Activity> cls2 = Activity.class;
        int i2 = 3;
        Class<Boolean> cls3 = Boolean.class;
        int i3 = 4;
        C3497 c3497 = C3497.f10997;
        switch (i) {
            case 0:
                ((C1020) obj).f3733 = new C0807(i3);
                return c3497;
            case 1:
                ((C1020) obj).f3733 = new C0807(i2);
                return c3497;
            case 2:
                ((C1020) obj).f3733 = new C0807(5);
                return c3497;
            case 3:
                C1333 c1333 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1333);
                c1981M4739.m3820(C0811.f3173.m2361());
                String[] strArr = AbstractC1574.f5469;
                c1981M4739.m3827("MicroMsg.Label.ContactLabelStorage", "getAllContactLable time:%s count:%s stack:%s", "select * from ContactLabel where isTemporary = 0  order by createTime ASC ");
                c1333.f4794 = c1981M4739;
                return c3497;
            case 4:
                C1333 c1334 = (C1333) obj;
                String[] strArr2 = AbstractC1574.f5469;
                c1334.m3053(MagicFactory.get(-382110355421876L, strArr2));
                C1981 c1981 = new C1981(4);
                c1981.m3827(MagicFactory.get(-381801117776564L, strArr2), MagicFactory.get(-381951441631924L, strArr2));
                c1334.f4794 = c1981;
                return c3497;
            case 5:
                C1333 c1335 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1335);
                c1981M47310.m3820(C0811.f3173.m2361());
                String[] strArr3 = AbstractC1574.f5469;
                c1981M47310.m3827(MagicFactory.get(-382874859600564L, strArr3), MagicFactory.get(-383025183455924L, strArr3));
                c1335.f4794 = c1981M47310;
                return c3497;
            case 6:
                return Boolean.FALSE;
            case 7:
                ((C1020) obj).f3732 = new C0807(10);
                return c3497;
            case 8:
                ((C1020) obj).f3733 = new C0807(9);
                return c3497;
            case 9:
                ((C1333) obj).m3052(new C0807(11));
                return c3497;
            case 10:
                C1332 c1332 = (C1332) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1332.m3051(MagicFactory.get(-383725263125172L, strArr4));
                C0705 c0705 = new C0705(4);
                c0705.m2127(MagicFactory.get(-383583529204404L, strArr4));
                c1332.f4791 = c0705;
                return c3497;
            case 11:
                C1981 c1982 = (C1981) obj;
                C0819.f3207.getClass();
                c1982.m3820(AbstractC1574.m3313(C0817.f3205));
                Class<String> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
                cls = clsM2183 != null ? clsM2183 : String.class;
                Class<Boolean> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls3));
                c1982.m3823(cls, clsM2184 != null ? clsM2184 : Boolean.class);
                c1982.m3827("[get]username = %s");
                return c3497;
            case Opcodes.FCONST_1 /* 12 */:
                String[] strArr5 = AbstractC1574.f5469;
                Object objM3268 = ((C1563) obj).m3268();
                Activity activity = (Activity) (objM3268 instanceof Activity ? objM3268 : null);
                if (activity == null) {
                    Class<Activity> clsM2185 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2185 != null ? clsM2185 : Activity.class).getName()).toString());
                }
                int i4 = AbstractC1745.f5844;
                C1973 c1973M3492 = AbstractC0968.m2484(activity).m3492();
                c1973M3492.f6370 = MagicFactory.get(-45294725102260L, strArr5);
                BaseAdapter baseAdapter = (BaseAdapter) ((C1982) AbstractC2784.m4742(c1973M3492)).m3832(new Object[0]);
                for (InterfaceC1579 interfaceC1579 : C0821.f3213) {
                    try {
                        for (C0820 c0820 : interfaceC1579.mo3336(activity)) {
                            AbstractC1574.m3288(baseAdapter, c0820.f3209, c0820.f3210);
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C3678.f11549;
                        StringBuilder sb = new StringBuilder();
                        sb.append(MagicFactory.get(-45380624448180L, strArr5));
                        sb.append(interfaceC1579 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1579).mo1128() : MagicFactory.get(-45432164055732L, strArr5));
                        AbstractC1194.m2792(sb, MagicFactory.get(-45470818761396L, strArr5), e, 12);
                    }
                }
                return c3497;
            case 13:
                C1563 c1563 = (C1563) obj;
                Object objM3269 = c1563.m3268();
                if (!(objM3269 instanceof Activity)) {
                    objM3269 = null;
                }
                Activity activity2 = (Activity) objM3269;
                if (activity2 == null) {
                    Class<Activity> clsM2186 = AbstractC0743.m2183(AbstractC2519.m4527(cls2));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2186 != null ? clsM2186 : Activity.class).getName()).toString());
                }
                try {
                    c2585 = c1563.m3267()[1];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                Object obj2 = c2585 instanceof C2585 ? null : c2585;
                int i5 = AbstractC1745.f5844;
                C1299 c1299M3490 = AbstractC0968.m2484(obj2).m3490();
                c1299M3490.f4725 = AbstractC2519.m4527(cls);
                c1299M3490.m3732();
                Iterator it = c1299M3490.m3014().iterator();
                while (it.hasNext()) {
                    String str = (String) ((C1315) it.next()).m3024();
                    if (str != null) {
                        for (InterfaceC1579 interfaceC15710 : C0821.f3213) {
                            try {
                                for (C0820 c0821 : interfaceC15710.mo3336(activity2)) {
                                    if (str.equals(c0821.f3208)) {
                                        c0821.f3211.invoke(activity2);
                                        c1563.m3271();
                                    }
                                }
                            } catch (Exception e2) {
                                ArrayList arrayList2 = C3678.f11549;
                                StringBuilder sb2 = new StringBuilder();
                                String[] strArr6 = AbstractC1574.f5469;
                                sb2.append(MagicFactory.get(-45505178499764L, strArr6));
                                sb2.append(interfaceC15710 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC15710).mo1128() : MagicFactory.get(-45556718107316L, strArr6));
                                AbstractC1194.m2792(sb2, MagicFactory.get(-45595372812980L, strArr6), e2, 12);
                            }
                        }
                    }
                }
                return c3497;
            case Opcodes.DCONST_0 /* 14 */:
                ((C1020) obj).f3733 = new C0807(15);
                return c3497;
            case 15:
                ((C1333) obj).m3052(new C0807(17));
                return c3497;
            case 16:
                C1563 c1564 = (C1563) obj;
                c1564.getClass();
                try {
                    c2586 = c1564.m3267()[0];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                if (c2586 instanceof C2585) {
                    c2586 = null;
                }
                try {
                    c2587 = c1564.m3267()[1];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                if (c2587 instanceof C2585) {
                    c2587 = null;
                }
                CharSequence charSequence = (CharSequence) c2587;
                try {
                    c2588 = c1564.m3267()[2];
                    if (c2588 == null) {
                        c2588 = null;
                    }
                } catch (Throwable th4) {
                    c2588 = new C2585(th4);
                }
                if (c2588 instanceof C2585) {
                    c2588 = null;
                }
                try {
                    c2589 = c1564.m3267()[3];
                    if (c2589 == null) {
                        c2589 = null;
                    }
                } catch (Throwable th5) {
                    c2589 = new C2585(th5);
                }
                if (c2589 instanceof C2585) {
                    c2589 = null;
                }
                try {
                    c25810 = c1564.m3267()[4];
                    if (c25810 == null) {
                        c25810 = null;
                    }
                } catch (Throwable th6) {
                    c25810 = new C2585(th6);
                }
                Boolean bool = (Boolean) (c25810 instanceof C2585 ? null : c25810);
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                for (Object obj3 : C0840.f3241) {
                    try {
                        ((C0209) obj3).m1239(c1564, charSequence, zBooleanValue);
                    } catch (Exception e3) {
                        ArrayList arrayList3 = C3678.f11549;
                        StringBuilder sb3 = new StringBuilder();
                        String[] strArr7 = AbstractC1574.f5469;
                        sb3.append(MagicFactory.get(-45840185948852L, strArr7));
                        sb3.append(obj3 instanceof AbstractC2867 ? ((AbstractC2867) obj3).mo1128() : MagicFactory.get(-45973329935028L, strArr7));
                        AbstractC1194.m2792(sb3, MagicFactory.get(-46011984640692L, strArr7), e3, 12);
                    }
                }
                return c3497;
            case Opcodes.SIPUSH /* 17 */:
                C1981 c1983 = (C1981) obj;
                Class<MenuItem> clsM2187 = AbstractC0743.m2183(AbstractC2519.m4527(MenuItem.class));
                Class cls4 = clsM2187 != null ? clsM2187 : MenuItem.class;
                Class<Integer> cls5 = Integer.class;
                Class<Integer> clsM4740 = AbstractC2784.m4740(c1983, cls4, cls5);
                if (clsM4740 == null) {
                    clsM4740 = cls5;
                }
                Class<CharSequence> clsM2188 = AbstractC0743.m2183(AbstractC2519.m4527(CharSequence.class));
                Class cls6 = clsM2188 != null ? clsM2188 : CharSequence.class;
                Class<Integer> clsM2189 = AbstractC0743.m2183(AbstractC2519.m4527(cls5));
                if (clsM2189 == null) {
                    clsM2189 = cls5;
                }
                Class<Integer> clsM21810 = AbstractC0743.m2183(AbstractC2519.m4527(cls5));
                cls5 = clsM21810 != null ? clsM21810 : Integer.class;
                Class<Boolean> clsM21811 = AbstractC0743.m2183(AbstractC2519.m4527(cls3));
                c1983.m3823(clsM4740, cls6, clsM2189, cls5, clsM21811 != null ? clsM21811 : Boolean.class);
                return c3497;
            case Opcodes.LDC /* 18 */:
                ((C1020) obj).f3733 = new C0807(19);
                return c3497;
            case 19:
                C1333 c1336 = (C1333) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1336.m3053(MagicFactory.get(-117587614628532L, strArr8));
                C1981 c1984 = new C1981(4);
                c1984.m3827(MagicFactory.get(-117394341100212L, strArr8), MagicFactory.get(-117488830380724L, strArr8));
                c1336.f4794 = c1984;
                return c3497;
            case 20:
                ((C1020) obj).f3733 = new C0807(21);
                return c3497;
            case Opcodes.ILOAD /* 21 */:
                C1333 c1337 = (C1333) obj;
                String[] strArr9 = AbstractC1574.f5469;
                c1337.m3053(MagicFactory.get(-85426899516084L, strArr9));
                C1981 c1985 = new C1981(4);
                c1985.m3827(MagicFactory.get(-85173496445620L, strArr9), MagicFactory.get(-85255100824244L, strArr9), MagicFactory.get(-85310935399092L, strArr9));
                c1337.f4794 = c1985;
                return c3497;
            case Opcodes.LLOAD /* 22 */:
                ((C1020) obj).f3733 = new C0807(27);
                return c3497;
            case Opcodes.FLOAD /* 23 */:
                ((C1020) obj).f3733 = new C0807(24);
                return c3497;
            case Opcodes.DLOAD /* 24 */:
                C1333 c1338 = (C1333) obj;
                c1338.m3053("com.tencent.mm.ui.conversation");
                c1338.m3052(new C0807(28));
                return c3497;
            case Opcodes.ALOAD /* 25 */:
                C1563 c1565 = (C1563) obj;
                c1565.getClass();
                try {
                    c25811 = c1565.m3267()[0];
                    if (c25811 == null) {
                        c25811 = null;
                    }
                } catch (Throwable th7) {
                    c25811 = new C2585(th7);
                }
                MenuItem menuItem = (MenuItem) (c25811 instanceof C2585 ? null : c25811);
                int i6 = AbstractC1745.f5844;
                C1299 c1299M4738 = AbstractC2784.m4738(c1565);
                c1299M4738.f4725 = AbstractC1574.m3315(C0850.f3264).getDeclaringClass();
                C1299 c1299M3491 = AbstractC0968.m2484(((C1315) AbstractC0744.m2191(c1299M4738.m3014())).m3023()).m3490();
                C0847.f3254.getClass();
                c1299M3491.f4725 = AbstractC1574.m3315(C0846.f3253).getDeclaringClass();
                ConversationBean conversationBean = new ConversationBean(((C1315) AbstractC0744.m2191(c1299M3491.m3014())).m3023());
                for (InterfaceC1581 interfaceC1581 : C0852.f3267) {
                    try {
                        for (C0849 c0849 : interfaceC1581.mo3337(conversationBean)) {
                            if (menuItem.getItemId() == c0849.f3261) {
                                c0849.f3263.invoke(conversationBean);
                            }
                        }
                    } catch (Exception e4) {
                        ArrayList arrayList4 = C3678.f11549;
                        StringBuilder sb4 = new StringBuilder();
                        String[] strArr10 = AbstractC1574.f5469;
                        sb4.append(MagicFactory.get(-46553150519988L, strArr10));
                        sb4.append(interfaceC1581 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1581).mo1128() : MagicFactory.get(-46634754898612L, strArr10));
                        AbstractC1194.m2792(sb4, MagicFactory.get(-46673409604276L, strArr10), e4, 12);
                    }
                }
                return c3497;
            case 26:
                C1563 c1566 = (C1563) obj;
                c1566.getClass();
                try {
                    c25812 = c1566.m3267()[0];
                    if (c25812 == null) {
                        c25812 = null;
                    }
                } catch (Throwable th8) {
                    c25812 = new C2585(th8);
                }
                if (c25812 instanceof C2585) {
                    c25812 = null;
                }
                ContextMenu contextMenu = (ContextMenu) c25812;
                try {
                    c25813 = c1566.m3267()[2];
                    if (c25813 == null) {
                        c25813 = null;
                    }
                } catch (Throwable th9) {
                    c25813 = new C2585(th9);
                }
                AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) (c25813 instanceof C2585 ? null : c25813);
                int i7 = AbstractC1745.f5844;
                C1299 c1299M4739 = AbstractC2784.m4738(c1566);
                C0847.f3254.getClass();
                c1299M4739.f4725 = AbstractC1574.m3315(C0846.f3253).getDeclaringClass();
                ConversationBean conversationBean2 = new ConversationBean(((C1315) AbstractC0744.m2191(c1299M4739.m3014())).m3023());
                for (InterfaceC1581 interfaceC1582 : C0852.f3267) {
                    try {
                        for (C0849 c08410 : interfaceC1582.mo3337(conversationBean2)) {
                            contextMenu.add(adapterContextMenuInfo.position, c08410.f3261, 0, c08410.f3262);
                        }
                    } catch (Exception e5) {
                        ArrayList arrayList5 = C3678.f11549;
                        StringBuilder sb5 = new StringBuilder();
                        String[] strArr11 = AbstractC1574.f5469;
                        sb5.append(MagicFactory.get(-46398531697332L, strArr11));
                        sb5.append(interfaceC1582 instanceof AbstractC2867 ? ((AbstractC2867) interfaceC1582).mo1128() : MagicFactory.get(-46480136075956L, strArr11));
                        AbstractC1194.m2792(sb5, MagicFactory.get(-46518790781620L, strArr11), e5, 12);
                    }
                }
                return c3497;
            case 27:
                C1333 c1339 = (C1333) obj;
                c1339.m3053("com.tencent.mm.ui.conversation");
                c1339.m3052(new C0807(29));
                return c3497;
            case 28:
                C1981 c1986 = (C1981) obj;
                String[] strArr12 = AbstractC1574.f5469;
                c1986.m3826(MagicFactory.get(-47656957115060L, strArr12));
                c1986.m3827(MagicFactory.get(-47747151428276L, strArr12));
                return c3497;
            default:
                C1981 c1987 = (C1981) obj;
                String[] strArr13 = AbstractC1574.f5469;
                c1987.m3826(MagicFactory.get(-46707769342644L, strArr13));
                if (AbstractC3471.m5079(EnumC3677.f11541) || AbstractC3471.m5080(EnumC3674.f11505)) {
                    c1987.m3827(MagicFactory.get(-46793668688564L, strArr13), MagicFactory.get(-46961172413108L, strArr13));
                } else {
                    c1987.m3827(MagicFactory.get(-47167330843316L, strArr13), MagicFactory.get(-47317654698676L, strArr13));
                }
                return c3497;
        }
    }
}
