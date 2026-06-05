package p000;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛴᛲ能不能ᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1058feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4111Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1058feyxiexzfUjhhgtg(int i) {
        this.f4111Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        MenuItem menuItem;
        Object c0919feyxiexzfUjhhgtg3;
        Object c0919feyxiexzfUjhhgtg4;
        Object c0919feyxiexzfUjhhgtg5;
        String str;
        Object c0919feyxiexzfUjhhgtg6;
        Object c0919feyxiexzfUjhhgtg7;
        Object c0919feyxiexzfUjhhgtg8;
        Object c0919feyxiexzfUjhhgtg9;
        int i = this.f4111Ujhhgtgfeyxiexzf;
        Class<Activity> cls = Activity.class;
        int i2 = 18;
        int i3 = 5;
        int i4 = 17;
        int i5 = 12;
        Class<String> cls2 = String.class;
        boolean z = true;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg);
                Class<String> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : String.class);
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928554308795893130L, strArr), MagicFactory.get(4928554390400271754L, strArr));
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1058feyxiexzfUjhhgtg(i3);
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1058feyxiexzfUjhhgtg(3);
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg2.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928315276686001546L, strArr2));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928315998240507274L, strArr2), MagicFactory.get(4928316105614689674L, strArr2), MagicFactory.get(4928315134952080778L, strArr2));
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                ContextMenu contextMenu = (ContextMenu) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
                for (InterfaceC0744Ujhhgtgfeyxiexzf interfaceC0744Ujhhgtgfeyxiexzf : C1213feyxiexzfUjhhgtg.f4519Ujhhgtgfeyxiexzf) {
                    try {
                        for (C1056feyxiexzfUjhhgtg c1056feyxiexzfUjhhgtg : interfaceC0744Ujhhgtgfeyxiexzf.mo2080Ujhhgtgfeyxiexzf()) {
                            contextMenu.add(R.id.MenuItem_Group, c1056feyxiexzfUjhhgtg.f4107Ujhhgtgfeyxiexzf, 0, c1056feyxiexzfUjhhgtg.f4108Ujhhgtgfeyxiexzf);
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        sb.append(MagicFactory.get(4928312729770395018L, strArr3));
                        sb.append(interfaceC0744Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0744Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : MagicFactory.get(4928312923043923338L, strArr3));
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb, MagicFactory.get(4928312884389217674L, strArr3), e, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg3.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928315749132404106L, strArr4));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928316612420830602L, strArr4), MagicFactory.get(4928315731952534922L, strArr4));
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                int i6 = 1;
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                MenuItem menuItem2 = (MenuItem) (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2);
                for (InterfaceC0744Ujhhgtgfeyxiexzf interfaceC0744Ujhhgtgfeyxiexzf2 : C1213feyxiexzfUjhhgtg.f4519Ujhhgtgfeyxiexzf) {
                    try {
                        int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0578Ujhhgtgfeyxiexzf2.m1849Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls);
                        Activity activity = (Activity) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf();
                        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0578Ujhhgtgfeyxiexzf2.m1849Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                        AbstractC2862feyxiexzfUjhhgtg.m4267feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1482Ujhhgtgfeyxiexzf, (EnumC0283Ujhhgtgfeyxiexzf[]) Arrays.copyOf(new EnumC0283Ujhhgtgfeyxiexzf[]{EnumC0283Ujhhgtgfeyxiexzf.FINAL}, i6));
                        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2);
                        String str2 = (String) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf();
                        C1060feyxiexzfUjhhgtg.f4118Ujhhgtgfeyxiexzf.getClass();
                        Object objM2549feyxiexzfUjhhgtg = C1060feyxiexzfUjhhgtg.m2549feyxiexzfUjhhgtg(str2);
                        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0578Ujhhgtgfeyxiexzf2.m1849Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                        menuItem = menuItem2;
                        try {
                            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f10724Ujhhgtgfeyxiexzf = MagicFactory.get(4928316286003316106L, strArr5);
                            Object objM4938Ujhhgtgfeyxiexzf = ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf();
                            for (C1056feyxiexzfUjhhgtg c1056feyxiexzfUjhhgtg2 : interfaceC0744Ujhhgtgfeyxiexzf2.mo2080Ujhhgtgfeyxiexzf()) {
                                if (menuItem.getItemId() == c1056feyxiexzfUjhhgtg2.f4107Ujhhgtgfeyxiexzf) {
                                    c1056feyxiexzfUjhhgtg2.f4109Ujhhgtgfeyxiexzf.mo1207Ujhhgtgfeyxiexzf(activity, objM2549feyxiexzfUjhhgtg, objM4938Ujhhgtgfeyxiexzf);
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            ArrayList arrayList2 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(MagicFactory.get(4928316492161746314L, strArr5));
                            sb2.append(interfaceC0744Ujhhgtgfeyxiexzf2 instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0744Ujhhgtgfeyxiexzf2).mo1479feyxiexzfUjhhgtg() : MagicFactory.get(4928316547996321162L, strArr5));
                            AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb2, MagicFactory.get(4928316509341615498L, strArr5), e, 12);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        menuItem = menuItem2;
                    }
                    menuItem2 = menuItem;
                    i6 = 1;
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                return AbstractC1225feyxiexzfUjhhgtg.m2704Ujhhgtgfeyxiexzf("'", (String) obj, '\'');
            case 8:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1058feyxiexzfUjhhgtg(10);
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                Object objM1849Ujhhgtgfeyxiexzf = ((C0578Ujhhgtgfeyxiexzf) obj).m1849Ujhhgtgfeyxiexzf();
                Activity activity2 = (Activity) (objM1849Ujhhgtgfeyxiexzf instanceof Activity ? objM1849Ujhhgtgfeyxiexzf : null);
                if (activity2 == null) {
                    Class<Activity> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : Activity.class).getName()).toString());
                }
                C1194feyxiexzfUjhhgtg c1194feyxiexzfUjhhgtg = C1194feyxiexzfUjhhgtg.f4487Ujhhgtgfeyxiexzf;
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                String str3 = MagicFactory.get(4928875628184208778L, strArr6);
                C1216feyxiexzfUjhhgtg c1216feyxiexzfUjhhgtg = new C1216feyxiexzfUjhhgtg(activity2, 0);
                c1194feyxiexzfUjhhgtg.getClass();
                int i8 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(activity2).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928877101357991306L, strArr6);
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m4863Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(MenuItem.OnMenuItemClickListener.class)}, 3));
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1306Ujhhgtgfeyxiexzf();
                ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(Integer.valueOf(R.id.MenuItem_Sns_LabelFilter), str3, new MenuItemOnMenuItemClickListenerC1217feyxiexzfUjhhgtg(0, c1216feyxiexzfUjhhgtg));
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg4 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg4);
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                C0394Ujhhgtgfeyxiexzf.m1652Ujhhgtgfeyxiexzf(c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2, MagicFactory.get(4928875615299306890L, strArr7));
                Class<Void> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Void.class));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1658feyxiexzfUjhhgtg(clsM5159Ujhhgtgfeyxiexzf3 != null ? clsM5159Ujhhgtgfeyxiexzf3 : Void.class);
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928875855817475466L, strArr7));
                c3452feyxiexzfUjhhgtg4.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1058feyxiexzfUjhhgtg(i5);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C1058feyxiexzfUjhhgtg(13));
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = (C0394Ujhhgtgfeyxiexzf) obj;
                Class<String> clsM5159Ujhhgtgfeyxiexzf4 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                cls2 = clsM5159Ujhhgtgfeyxiexzf4 != null ? clsM5159Ujhhgtgfeyxiexzf4 : String.class;
                Class<Integer> clsM5159Ujhhgtgfeyxiexzf5 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.class));
                c0394Ujhhgtgfeyxiexzf3.m1657Ujhhgtgfeyxiexzf(cls2, clsM5159Ujhhgtgfeyxiexzf5 != null ? clsM5159Ujhhgtgfeyxiexzf5 : Integer.class);
                C0300Ujhhgtgfeyxiexzf c0300Ujhhgtgfeyxiexzf = new C0300Ujhhgtgfeyxiexzf();
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf4 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf4.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928499423408817546L, strArr8), MagicFactory.get(4928499466358490506L, strArr8));
                c0300Ujhhgtgfeyxiexzf.m1528Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf4);
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf5 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf5.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928499668221953418L, strArr8), MagicFactory.get(4928499724056528266L, strArr8));
                c0300Ujhhgtgfeyxiexzf.m1528Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf5);
                c0394Ujhhgtgfeyxiexzf3.f2141Ujhhgtgfeyxiexzf = c0300Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1058feyxiexzfUjhhgtg(15);
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg5 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg5);
                Class<String> clsM5159Ujhhgtgfeyxiexzf6 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                if (clsM5159Ujhhgtgfeyxiexzf6 == null) {
                    clsM5159Ujhhgtgfeyxiexzf6 = cls2;
                }
                Class<String> clsM5159Ujhhgtgfeyxiexzf7 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3.m1657Ujhhgtgfeyxiexzf(clsM5159Ujhhgtgfeyxiexzf6, clsM5159Ujhhgtgfeyxiexzf7 != null ? clsM5159Ujhhgtgfeyxiexzf7 : String.class);
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928540693749564810L, strArr9), MagicFactory.get(4928540861253289354L, strArr9));
                c3452feyxiexzfUjhhgtg5.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C1058feyxiexzfUjhhgtg(i4);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928502880857490826L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                c3456feyxiexzfUjhhgtg.m4952Ujhhgtgfeyxiexzf(new C1058feyxiexzfUjhhgtg(i2));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928503361893827978L, strArr10), MagicFactory.get(4928503460678075786L, strArr10), MagicFactory.get(4928503542282454410L, strArr10), MagicFactory.get(4928503495037814154L, strArr10), MagicFactory.get(4928503568052258186L, strArr10), MagicFactory.get(4928503641066702218L, strArr10), MagicFactory.get(4928502605979583882L, strArr10), MagicFactory.get(4928502709058798986L, strArr10), MagicFactory.get(4928502782073243018L, strArr10), MagicFactory.get(4928502756303439242L, strArr10), MagicFactory.get(4928502855087687050L, strArr10), MagicFactory.get(4928502837907817866L, strArr10), MagicFactory.get(4928502928102131082L, strArr10));
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928879175827195274L, strArr11), MagicFactory.get(4928878102085371274L, strArr11));
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_sns_upload_app_info, null, false);
                int i9 = R.id.moduleDialogEdtSnsUploadAppInfoPhone;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtSnsUploadAppInfoPhone);
                if (textInputEditText != null) {
                    i9 = R.id.moduleDialogEdtSnsUploadAppInfoTextPlaceholders;
                    MaterialTextView materialTextView = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtSnsUploadAppInfoTextPlaceholders);
                    if (materialTextView != null) {
                        i9 = R.id.moduleDialogEdtSnsUploadAppInfoWindows;
                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtSnsUploadAppInfoWindows);
                        if (textInputEditText2 != null) {
                            i9 = R.id.moduleDialogInputSnsUploadAppInfoPhone;
                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputSnsUploadAppInfoPhone)) != null) {
                                i9 = R.id.moduleDialogInputSnsUploadAppInfoWindows;
                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputSnsUploadAppInfoWindows)) != null) {
                                    C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf = new C0328Ujhhgtgfeyxiexzf((LinearLayout) viewM2416Ujhhgtgfeyxiexzf, textInputEditText, materialTextView, textInputEditText2, 6);
                                    textInputEditText.setText(C1211feyxiexzfUjhhgtg.f4516Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                    textInputEditText2.setText(C1207feyxiexzfUjhhgtg.f4509Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                    materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MagicFactory.get(4928879008323470730L, strArr12));
                                    for (Map.Entry entry : C1206feyxiexzfUjhhgtg.f4504Ujhhgtgfeyxiexzf.entrySet()) {
                                        String str4 = (String) entry.getKey();
                                        C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg = (C1381feyxiexzfUjhhgtg) entry.getValue();
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append((CharSequence) ("[" + str4 + MagicFactory.get(4928879077042947466L, strArr12)));
                                        spannableStringBuilder.setSpan(new C2738Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf, c1381feyxiexzfUjhhgtg, 5), length, spannableStringBuilder.length() + (-1), 33);
                                        z = z;
                                    }
                                    materialTextView.setText(spannableStringBuilder);
                                    C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                                    C1206feyxiexzfUjhhgtg.f4503Ujhhgtgfeyxiexzf.getClass();
                                    c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C1206feyxiexzfUjhhgtg.f4506Ujhhgtgfeyxiexzf;
                                    c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = c0328Ujhhgtgfeyxiexzf.f1932Ujhhgtgfeyxiexzf;
                                    c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928879064158045578L, strArr12), new C0350Ujhhgtgfeyxiexzf(16, c0328Ujhhgtgfeyxiexzf));
                                    c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928879051273143690L, strArr12), new C0478Ujhhgtgfeyxiexzf(i2));
                                    C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                                    c0290Ujhhgtgfeyxiexzf.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                    return c1943Ujhhgtgfeyxiexzf;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928805079051404682L, strArr12).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i9)));
            case Opcodes.ILOAD /* 21 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1058feyxiexzfUjhhgtg(22);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C1058feyxiexzfUjhhgtg(19));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                C1952feyxiexzfUjhhgtg c1952feyxiexzfUjhhgtg = C1952feyxiexzfUjhhgtg.f6428Ujhhgtgfeyxiexzf;
                Object objM1849Ujhhgtgfeyxiexzf2 = c0578Ujhhgtgfeyxiexzf3.m1849Ujhhgtgfeyxiexzf();
                String strM4623Ujhhgtgfeyxiexzf = C1211feyxiexzfUjhhgtg.f4516Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf();
                c1952feyxiexzfUjhhgtg.getClass();
                C1952feyxiexzfUjhhgtg.m3294feyxiexzfUjhhgtg(objM1849Ujhhgtgfeyxiexzf2, strM4623Ujhhgtgfeyxiexzf);
                C1952feyxiexzfUjhhgtg.m3293feyxiexzfUjhhgtg(c0578Ujhhgtgfeyxiexzf3.m1849Ujhhgtgfeyxiexzf(), C1207feyxiexzfUjhhgtg.f4509Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                String[] strArr13 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928795569993811338L, strArr13), MagicFactory.get(4928794637985908106L, strArr13), MagicFactory.get(4928794659460744586L, strArr13), MagicFactory.get(4928794818374534538L, strArr13), MagicFactory.get(4928794977288324490L, strArr13));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                String[] strArr14 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_sns_upload_original_photo, null, false);
                int i10 = R.id.moduleDialogRbSnsUploadOriginalPhotoConvert;
                MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogRbSnsUploadOriginalPhotoConvert);
                if (materialRadioButton != null) {
                    i10 = R.id.moduleDialogRbSnsUploadOriginalPhotoCopy;
                    MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogRbSnsUploadOriginalPhotoCopy);
                    if (materialRadioButton2 != null) {
                        i10 = R.id.moduleDialogRgSnsUploadOriginalPhotoMode;
                        RadioGroup radioGroup = (RadioGroup) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogRgSnsUploadOriginalPhotoMode);
                        if (radioGroup != null) {
                            LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf2;
                            C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf = new C0701Ujhhgtgfeyxiexzf(linearLayout, materialRadioButton, materialRadioButton2, radioGroup, 3);
                            int iM4619Ujhhgtgfeyxiexzf = C1236feyxiexzfUjhhgtg.f4569Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf();
                            if (iM4619Ujhhgtgfeyxiexzf == EnumC1208feyxiexzfUjhhgtg.f4510Ujhhgtgfeyxiexzf.f4513Ujhhgtgfeyxiexzf) {
                                materialRadioButton.setChecked(true);
                            } else if (iM4619Ujhhgtgfeyxiexzf == EnumC1208feyxiexzfUjhhgtg.f4511Ujhhgtgfeyxiexzf.f4513Ujhhgtgfeyxiexzf) {
                                materialRadioButton2.setChecked(true);
                            }
                            C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                            C1237feyxiexzfUjhhgtg.f4570Ujhhgtgfeyxiexzf.getClass();
                            c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = C1237feyxiexzfUjhhgtg.f4572Ujhhgtgfeyxiexzf;
                            c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = linearLayout;
                            c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928795582878713226L, strArr14), new C0350Ujhhgtgfeyxiexzf(i4, c0701Ujhhgtgfeyxiexzf));
                            AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                            return c1943Ujhhgtgfeyxiexzf;
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928805216490358154L, strArr14).concat(viewM2416Ujhhgtgfeyxiexzf2.getResources().getResourceName(i10)));
            case 26:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1058feyxiexzfUjhhgtg(29);
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                if (C1236feyxiexzfUjhhgtg.f4569Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() == EnumC1208feyxiexzfUjhhgtg.f4510Ujhhgtgfeyxiexzf.f4513Ujhhgtgfeyxiexzf) {
                    c0578Ujhhgtgfeyxiexzf4.getClass();
                    try {
                        c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[0];
                        if (c0919feyxiexzfUjhhgtg3 == null) {
                            c0919feyxiexzfUjhhgtg3 = null;
                        }
                    } catch (Throwable th3) {
                        c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                    }
                    if (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                    String str5 = (String) c0919feyxiexzfUjhhgtg3;
                    String str6 = str5 == null ? "" : str5;
                    try {
                        c0919feyxiexzfUjhhgtg4 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[1];
                        if (c0919feyxiexzfUjhhgtg4 == null) {
                            c0919feyxiexzfUjhhgtg4 = null;
                        }
                    } catch (Throwable th4) {
                        c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th4);
                    }
                    if (c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg) {
                        c0919feyxiexzfUjhhgtg4 = null;
                    }
                    String str7 = (String) c0919feyxiexzfUjhhgtg4;
                    String str8 = str7 == null ? "" : str7;
                    try {
                        c0919feyxiexzfUjhhgtg5 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[2];
                        if (c0919feyxiexzfUjhhgtg5 == null) {
                            c0919feyxiexzfUjhhgtg5 = null;
                        }
                    } catch (Throwable th5) {
                        c0919feyxiexzfUjhhgtg5 = new C0919feyxiexzfUjhhgtg(th5);
                    }
                    if (c0919feyxiexzfUjhhgtg5 instanceof C0919feyxiexzfUjhhgtg) {
                        c0919feyxiexzfUjhhgtg5 = null;
                    }
                    String str9 = (String) c0919feyxiexzfUjhhgtg5;
                    str = str9 != null ? str9 : "";
                    C1205feyxiexzfUjhhgtg c1205feyxiexzfUjhhgtg = C1205feyxiexzfUjhhgtg.f4502Ujhhgtgfeyxiexzf;
                    String strConcat = str6.concat(str);
                    c1205feyxiexzfUjhhgtg.getClass();
                    Object objInvoke = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1204feyxiexzfUjhhgtg.f4501Ujhhgtgfeyxiexzf).invoke(null, str8, strConcat);
                    MagicFactory.get(4928554798422164874L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf);
                    Boolean bool = (Boolean) objInvoke;
                    bool.getClass();
                    c0578Ujhhgtgfeyxiexzf4.m1853Ujhhgtgfeyxiexzf(bool);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf5 = (C0578Ujhhgtgfeyxiexzf) obj;
                if (C1236feyxiexzfUjhhgtg.f4569Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() == EnumC1208feyxiexzfUjhhgtg.f4511Ujhhgtgfeyxiexzf.f4513Ujhhgtgfeyxiexzf) {
                    c0578Ujhhgtgfeyxiexzf5.getClass();
                    try {
                        c0919feyxiexzfUjhhgtg6 = c0578Ujhhgtgfeyxiexzf5.m1848Ujhhgtgfeyxiexzf()[0];
                        if (c0919feyxiexzfUjhhgtg6 == null) {
                            c0919feyxiexzfUjhhgtg6 = null;
                        }
                    } catch (Throwable th6) {
                        c0919feyxiexzfUjhhgtg6 = new C0919feyxiexzfUjhhgtg(th6);
                    }
                    if (c0919feyxiexzfUjhhgtg6 instanceof C0919feyxiexzfUjhhgtg) {
                        c0919feyxiexzfUjhhgtg6 = null;
                    }
                    String str10 = (String) c0919feyxiexzfUjhhgtg6;
                    String str11 = str10 == null ? "" : str10;
                    try {
                        c0919feyxiexzfUjhhgtg7 = c0578Ujhhgtgfeyxiexzf5.m1848Ujhhgtgfeyxiexzf()[1];
                        if (c0919feyxiexzfUjhhgtg7 == null) {
                            c0919feyxiexzfUjhhgtg7 = null;
                        }
                    } catch (Throwable th7) {
                        c0919feyxiexzfUjhhgtg7 = new C0919feyxiexzfUjhhgtg(th7);
                    }
                    if (c0919feyxiexzfUjhhgtg7 instanceof C0919feyxiexzfUjhhgtg) {
                        c0919feyxiexzfUjhhgtg7 = null;
                    }
                    String str12 = (String) c0919feyxiexzfUjhhgtg7;
                    String str13 = str12 == null ? "" : str12;
                    try {
                        c0919feyxiexzfUjhhgtg8 = c0578Ujhhgtgfeyxiexzf5.m1848Ujhhgtgfeyxiexzf()[2];
                        if (c0919feyxiexzfUjhhgtg8 == null) {
                            c0919feyxiexzfUjhhgtg8 = null;
                        }
                    } catch (Throwable th8) {
                        c0919feyxiexzfUjhhgtg8 = new C0919feyxiexzfUjhhgtg(th8);
                    }
                    if (c0919feyxiexzfUjhhgtg8 instanceof C0919feyxiexzfUjhhgtg) {
                        c0919feyxiexzfUjhhgtg8 = null;
                    }
                    String str14 = (String) c0919feyxiexzfUjhhgtg8;
                    str = str14 != null ? str14 : "";
                    try {
                        c0919feyxiexzfUjhhgtg9 = c0578Ujhhgtgfeyxiexzf5.m1848Ujhhgtgfeyxiexzf()[3];
                        if (c0919feyxiexzfUjhhgtg9 == null) {
                            c0919feyxiexzfUjhhgtg9 = null;
                        }
                    } catch (Throwable th9) {
                        c0919feyxiexzfUjhhgtg9 = new C0919feyxiexzfUjhhgtg(th9);
                    }
                    if (c0919feyxiexzfUjhhgtg9 instanceof C0919feyxiexzfUjhhgtg) {
                        c0919feyxiexzfUjhhgtg9 = null;
                    }
                    Boolean bool2 = (Boolean) c0919feyxiexzfUjhhgtg9;
                    if (bool2 != null ? bool2.booleanValue() : false) {
                        File file = new File(str13);
                        C1842Ujhhgtgfeyxiexzf c1842Ujhhgtgfeyxiexzf = C1842Ujhhgtgfeyxiexzf.f6181Ujhhgtgfeyxiexzf;
                        String strConcat2 = str11.concat(str);
                        c1842Ujhhgtgfeyxiexzf.getClass();
                        Object objInvoke2 = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1846Ujhhgtgfeyxiexzf.f6188Ujhhgtgfeyxiexzf).invoke(null, strConcat2, Boolean.TRUE);
                        MagicFactory.get(4928265936101705098L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf);
                        AbstractC3445Ujhhgtgfeyxiexzf.m4945feyxiexzfUjhhgtg(file, new File((String) objInvoke2));
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            default:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C1058feyxiexzfUjhhgtg(24));
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
