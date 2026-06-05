package p000;

import android.app.Activity;
import android.content.Context;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3278Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10298Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3278Ujhhgtgfeyxiexzf(int i) {
        this.f10298Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Code duplicated, block: B:246:0x07fb  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        boolean z;
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        Object c0919feyxiexzfUjhhgtg4;
        boolean zStartsWith;
        Object c0919feyxiexzfUjhhgtg5;
        Object c0919feyxiexzfUjhhgtg6;
        int i = this.f10298Ujhhgtgfeyxiexzf;
        int i2 = 2;
        int i3 = 3;
        Class<String> cls = String.class;
        int i4 = R.id.MenuItem_Group;
        Class cls2 = Integer.TYPE;
        int i5 = R.id.MenuItem_Fav_Forward;
        int i6 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg);
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                C0394Ujhhgtgfeyxiexzf.m1652Ujhhgtgfeyxiexzf(c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf, "com.tencent.mm.storage.emotion.EmojiInfo");
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg("save emoji thumb error");
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C3278Ujhhgtgfeyxiexzf(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C3278Ujhhgtgfeyxiexzf(i3));
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.emoji.EmojiInfoStorage", "md5 is null or invalue. md5:%s");
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C3278Ujhhgtgfeyxiexzf(5);
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C3278Ujhhgtgfeyxiexzf(7));
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Class<String> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj2, clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : String.class)) {
                    Object obj3 = list.get(1);
                    C3280Ujhhgtgfeyxiexzf.f10300Ujhhgtgfeyxiexzf.getClass();
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj3, AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3277Ujhhgtgfeyxiexzf.f10297Ujhhgtgfeyxiexzf).getDeclaringClass())) {
                        Object obj4 = list.get(2);
                        C0479Ujhhgtgfeyxiexzf.f2392Ujhhgtgfeyxiexzf.getClass();
                        z = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj4, AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0498Ujhhgtgfeyxiexzf.f2425Ujhhgtgfeyxiexzf));
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: context is null");
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C0319Ujhhgtgfeyxiexzf c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf = C0319Ujhhgtgfeyxiexzf.m1533Ujhhgtgfeyxiexzf(AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(((View) obj).getContext()));
                c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf.f1877Ujhhgtgfeyxiexzf.setText(C3292Ujhhgtgfeyxiexzf.f10329Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                C3291Ujhhgtgfeyxiexzf.f10323Ujhhgtgfeyxiexzf.getClass();
                c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C3291Ujhhgtgfeyxiexzf.f10326Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf.f1876Ujhhgtgfeyxiexzf;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf("保存", new C3289Ujhhgtgfeyxiexzf(c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf, 0));
                c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf("重置", new C2975feyxiexzfUjhhgtg(25));
                C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                c0290Ujhhgtgfeyxiexzf.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C3278Ujhhgtgfeyxiexzf(10);
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf("com.tencent.mm.storage");
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf("MicroMsg.emoji.EmojiStorageMgr", "EmojiStorageMgr: %s");
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3278Ujhhgtgfeyxiexzf(13);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                String str = (String) c0919feyxiexzfUjhhgtg;
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                for (InterfaceC0597Ujhhgtgfeyxiexzf interfaceC0597Ujhhgtgfeyxiexzf : C3506Ujhhgtgfeyxiexzf.f10920Ujhhgtgfeyxiexzf) {
                    try {
                        interfaceC0597Ujhhgtgfeyxiexzf.mo1870Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf, str);
                    } catch (Exception e) {
                        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onGetExptConfig ");
                        sb.append(interfaceC0597Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0597Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : "LoadHook");
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb, " Failed", e, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C3278Ujhhgtgfeyxiexzf(14));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = (C0394Ujhhgtgfeyxiexzf) obj;
                Class<String> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                if (clsM5159Ujhhgtgfeyxiexzf2 == null) {
                    clsM5159Ujhhgtgfeyxiexzf2 = cls;
                }
                Class<String> clsM2695Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2695Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf, clsM5159Ujhhgtgfeyxiexzf2, cls);
                if (clsM2695Ujhhgtgfeyxiexzf == null) {
                    clsM2695Ujhhgtgfeyxiexzf = cls;
                }
                Class<String> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                cls = clsM5159Ujhhgtgfeyxiexzf3 != null ? clsM5159Ujhhgtgfeyxiexzf3 : String.class;
                Class<Boolean> clsM5159Ujhhgtgfeyxiexzf4 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Boolean.class));
                c0394Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(clsM2695Ujhhgtgfeyxiexzf, cls, clsM5159Ujhhgtgfeyxiexzf4 != null ? clsM5159Ujhhgtgfeyxiexzf4 : Boolean.class);
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg("MicroMsg.ExptService", "Fail to query value, return default value '%s' instead.");
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3278Ujhhgtgfeyxiexzf(20);
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3278Ujhhgtgfeyxiexzf(19);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                LinkedHashSet<InterfaceC0605Ujhhgtgfeyxiexzf> linkedHashSet = C3413Ujhhgtgfeyxiexzf.f10636Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                ContextMenu contextMenu = (ContextMenu) (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg3);
                if (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7371Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7350Ujhhgtgfeyxiexzf)) {
                    int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(contextMenu).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Context.class);
                    AbstractC3590Ujhhgtgfeyxiexzf.m5133Ujhhgtgfeyxiexzf((Context) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf());
                    C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = new C2065feyxiexzfUjhhgtg(new C3404Ujhhgtgfeyxiexzf(contextMenu, i6));
                    for (InterfaceC0605Ujhhgtgfeyxiexzf interfaceC0605Ujhhgtgfeyxiexzf : linkedHashSet) {
                        try {
                            for (C3403Ujhhgtgfeyxiexzf c3403Ujhhgtgfeyxiexzf : ((C0406Ujhhgtgfeyxiexzf) interfaceC0605Ujhhgtgfeyxiexzf).m1686Ujhhgtgfeyxiexzf()) {
                                C0393Ujhhgtgfeyxiexzf c0393UjhhgtgfeyxiexzfM1648Ujhhgtgfeyxiexzf = ((C0393Ujhhgtgfeyxiexzf) c2065feyxiexzfUjhhgtg.getValue()).m1648Ujhhgtgfeyxiexzf();
                                c0393UjhhgtgfeyxiexzfM1648Ujhhgtgfeyxiexzf.m1940Ujhhgtgfeyxiexzf(contextMenu);
                                try {
                                    Integer numValueOf = Integer.valueOf(R.id.MenuItem_Group);
                                    c3403Ujhhgtgfeyxiexzf.getClass();
                                    c0393UjhhgtgfeyxiexzfM1648Ujhhgtgfeyxiexzf.m1649Ujhhgtgfeyxiexzf(numValueOf, Integer.valueOf(i5), 0, c3403Ujhhgtgfeyxiexzf.f10612Ujhhgtgfeyxiexzf, Integer.valueOf(R.drawable.ic_menu_forward_24dp));
                                    i5 = R.id.MenuItem_Fav_Forward;
                                } catch (Exception e2) {
                                    e = e2;
                                    ArrayList arrayList2 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("onCreateMenuItems ");
                                    sb2.append(interfaceC0605Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0605Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : "LoadHook");
                                    AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb2, " Failed", e, 12);
                                    i5 = R.id.MenuItem_Fav_Forward;
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                        i5 = R.id.MenuItem_Fav_Forward;
                    }
                } else {
                    for (InterfaceC0605Ujhhgtgfeyxiexzf interfaceC0605Ujhhgtgfeyxiexzf2 : linkedHashSet) {
                        try {
                            for (C3403Ujhhgtgfeyxiexzf c3403Ujhhgtgfeyxiexzf2 : ((C0406Ujhhgtgfeyxiexzf) interfaceC0605Ujhhgtgfeyxiexzf2).m1686Ujhhgtgfeyxiexzf()) {
                                c3403Ujhhgtgfeyxiexzf2.getClass();
                                contextMenu.add(R.id.MenuItem_Group, R.id.MenuItem_Fav_Forward, 0, c3403Ujhhgtgfeyxiexzf2.f10612Ujhhgtgfeyxiexzf);
                            }
                        } catch (Exception e4) {
                            ArrayList arrayList3 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onCreateMenuItems ");
                            sb3.append(interfaceC0605Ujhhgtgfeyxiexzf2 instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0605Ujhhgtgfeyxiexzf2).mo1479feyxiexzfUjhhgtg() : "LoadHook");
                            AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb3, " Failed", e4, 12);
                        }
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf3.getClass();
                try {
                    c0919feyxiexzfUjhhgtg4 = c0578Ujhhgtgfeyxiexzf3.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg4 == null) {
                        c0919feyxiexzfUjhhgtg4 = null;
                    }
                } catch (Throwable th4) {
                    c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th4);
                }
                MenuItem menuItem = (MenuItem) (c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg4);
                int i8 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf3);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2);
                int iIntValue = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).intValue();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf3);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.f10724Ujhhgtgfeyxiexzf = "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI";
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg((Activity) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f10725Ujhhgtgfeyxiexzf = new C3278Ujhhgtgfeyxiexzf(21);
                Object item = ((BaseAdapter) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).getItem(iIntValue);
                for (InterfaceC0605Ujhhgtgfeyxiexzf interfaceC0605Ujhhgtgfeyxiexzf3 : C3413Ujhhgtgfeyxiexzf.f10636Ujhhgtgfeyxiexzf) {
                    try {
                        for (C3403Ujhhgtgfeyxiexzf c3403Ujhhgtgfeyxiexzf3 : ((C0406Ujhhgtgfeyxiexzf) interfaceC0605Ujhhgtgfeyxiexzf3).m1686Ujhhgtgfeyxiexzf()) {
                            int itemId = menuItem.getItemId();
                            c3403Ujhhgtgfeyxiexzf3.getClass();
                            if (itemId == R.id.MenuItem_Fav_Forward) {
                                c3403Ujhhgtgfeyxiexzf3.f10613Ujhhgtgfeyxiexzf.invoke(item);
                            }
                        }
                    } catch (Exception e5) {
                        ArrayList arrayList4 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("onCreateMenuItems ");
                        sb4.append(interfaceC0605Ujhhgtgfeyxiexzf3 instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0605Ujhhgtgfeyxiexzf3).mo1479feyxiexzfUjhhgtg() : "LoadHook");
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb4, " Failed", e5, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg2.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.fav.ui");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg("MicroMsg.FavoriteIndexUI", "onMMMenuItemSelected");
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg3.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.fav.ui");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg("MicroMsg.FavoriteIndexUI", (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7371Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7350Ujhhgtgfeyxiexzf)) ? "[OnCreateContextMMMenu] pos = " : "onCreateContextMenu() pos:%s id:%s fav_id:%s");
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                zStartsWith = ((Class) obj).getName().startsWith("com.tencent.mm.plugin.fav.ui.adapter.");
                break;
            case Opcodes.LLOAD /* 22 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3278Ujhhgtgfeyxiexzf(27);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3278Ujhhgtgfeyxiexzf(24);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg4 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg4.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.fav.ui");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf4 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf4.m1661feyxiexzfUjhhgtg("MicroMsg.FavSearchManager", "onMMMenuItemSelected");
                c3452feyxiexzfUjhhgtg4.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf4;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf4.getClass();
                try {
                    c0919feyxiexzfUjhhgtg5 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg5 == null) {
                        c0919feyxiexzfUjhhgtg5 = null;
                    }
                } catch (Throwable th5) {
                    c0919feyxiexzfUjhhgtg5 = new C0919feyxiexzfUjhhgtg(th5);
                }
                ContextMenu contextMenu2 = (ContextMenu) (c0919feyxiexzfUjhhgtg5 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg5);
                int i9 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(contextMenu2).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Context.class);
                AbstractC3590Ujhhgtgfeyxiexzf.m5133Ujhhgtgfeyxiexzf((Context) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf());
                C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg2 = new C2065feyxiexzfUjhhgtg(new C3404Ujhhgtgfeyxiexzf(contextMenu2, 1 == true ? 1 : 0));
                for (InterfaceC0606Ujhhgtgfeyxiexzf interfaceC0606Ujhhgtgfeyxiexzf : C3412Ujhhgtgfeyxiexzf.f10634Ujhhgtgfeyxiexzf) {
                    try {
                        for (C3414Ujhhgtgfeyxiexzf c3414Ujhhgtgfeyxiexzf : ((C0423Ujhhgtgfeyxiexzf) interfaceC0606Ujhhgtgfeyxiexzf).m1746Ujhhgtgfeyxiexzf()) {
                            C0393Ujhhgtgfeyxiexzf c0393UjhhgtgfeyxiexzfM1648Ujhhgtgfeyxiexzf2 = ((C0393Ujhhgtgfeyxiexzf) c2065feyxiexzfUjhhgtg2.getValue()).m1648Ujhhgtgfeyxiexzf();
                            c0393UjhhgtgfeyxiexzfM1648Ujhhgtgfeyxiexzf2.m1940Ujhhgtgfeyxiexzf(contextMenu2);
                            Integer numValueOf2 = Integer.valueOf(i4);
                            c3414Ujhhgtgfeyxiexzf.getClass();
                            try {
                                c0393UjhhgtgfeyxiexzfM1648Ujhhgtgfeyxiexzf2.m1649Ujhhgtgfeyxiexzf(numValueOf2, Integer.valueOf(R.id.MenuItem_Fav_Forward), 0, c3414Ujhhgtgfeyxiexzf.f10637Ujhhgtgfeyxiexzf, Integer.valueOf(R.drawable.ic_menu_forward_24dp));
                                i4 = R.id.MenuItem_Group;
                            } catch (Exception e6) {
                                e = e6;
                                ArrayList arrayList5 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                                StringBuilder sb5 = new StringBuilder();
                                String[] strArr13 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                                sb5.append("onCreateMenuItems ");
                                sb5.append(interfaceC0606Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0606Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : "LoadHook");
                                AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb5, " Failed", e, 12);
                                i4 = R.id.MenuItem_Group;
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                    }
                    i4 = R.id.MenuItem_Group;
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf5 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr14 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf5.getClass();
                try {
                    c0919feyxiexzfUjhhgtg6 = c0578Ujhhgtgfeyxiexzf5.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg6 == null) {
                        c0919feyxiexzfUjhhgtg6 = null;
                    }
                } catch (Throwable th6) {
                    c0919feyxiexzfUjhhgtg6 = new C0919feyxiexzfUjhhgtg(th6);
                }
                MenuItem menuItem2 = (MenuItem) (c0919feyxiexzfUjhhgtg6 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg6);
                int i10 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf5);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2);
                int iIntValue2 = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).intValue();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf4 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf5);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "d";
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf4.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f10725Ujhhgtgfeyxiexzf = new C3278Ujhhgtgfeyxiexzf(28);
                Object item2 = ((BaseAdapter) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).getItem(iIntValue2);
                for (InterfaceC0606Ujhhgtgfeyxiexzf interfaceC0606Ujhhgtgfeyxiexzf2 : C3412Ujhhgtgfeyxiexzf.f10634Ujhhgtgfeyxiexzf) {
                    try {
                        for (C3414Ujhhgtgfeyxiexzf c3414Ujhhgtgfeyxiexzf2 : ((C0423Ujhhgtgfeyxiexzf) interfaceC0606Ujhhgtgfeyxiexzf2).m1746Ujhhgtgfeyxiexzf()) {
                            int itemId2 = menuItem2.getItemId();
                            c3414Ujhhgtgfeyxiexzf2.getClass();
                            if (itemId2 == R.id.MenuItem_Fav_Forward) {
                                c3414Ujhhgtgfeyxiexzf2.f10638Ujhhgtgfeyxiexzf.invoke(item2);
                            }
                        }
                    } catch (Exception e8) {
                        ArrayList arrayList6 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("onCreateMenuItems ");
                        sb6.append(interfaceC0606Ujhhgtgfeyxiexzf2 instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0606Ujhhgtgfeyxiexzf2).mo1479feyxiexzfUjhhgtg() : "LoadHook");
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb6, " Failed", e8, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg5 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr15 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg5.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.fav.ui");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf5 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf5.m1661feyxiexzfUjhhgtg("MicroMsg.FavSearchManager", "itemInfo exist detail but no note or record, error!");
                c3452feyxiexzfUjhhgtg5.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf5;
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                zStartsWith = ((Class) obj).getName().startsWith("com.tencent.mm.plugin.fav.ui.adapter.");
                break;
            default:
                String[] strArr16 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("VFS.VFSStrategy", "Found wrong moving file: ");
                return c1943Ujhhgtgfeyxiexzf;
        }
        return Boolean.valueOf(zStartsWith);
    }
}
