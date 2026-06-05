package p000;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3711Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f11758Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3711Ujhhgtgfeyxiexzf(int i) {
        this.f11758Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x02d5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        boolean z;
        Object c0919feyxiexzfUjhhgtg4;
        int i = this.f11758Ujhhgtgfeyxiexzf;
        int i2 = 5;
        int i3 = 6;
        int i4 = 15;
        Object obj2 = null;
        boolean z2 = false;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3711Ujhhgtgfeyxiexzf(1);
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928332907526751626L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                c3452feyxiexzfUjhhgtg.m4950Ujhhgtgfeyxiexzf(new C3711Ujhhgtgfeyxiexzf(i2));
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
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
                MenuItem menuItem = (MenuItem) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
                int i5 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3713Ujhhgtgfeyxiexzf.f11762Ujhhgtgfeyxiexzf).getDeclaringClass();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                C3709Ujhhgtgfeyxiexzf.f11751Ujhhgtgfeyxiexzf.getClass();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3708feyxiexzfUjhhgtg.f11750Ujhhgtgfeyxiexzf).getDeclaringClass();
                ConversationBean conversationBean = new ConversationBean(((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf());
                for (InterfaceC0595Ujhhgtgfeyxiexzf interfaceC0595Ujhhgtgfeyxiexzf : C3715feyxiexzfUjhhgtg.f11765Ujhhgtgfeyxiexzf) {
                    try {
                        for (C3712Ujhhgtgfeyxiexzf c3712Ujhhgtgfeyxiexzf : interfaceC0595Ujhhgtgfeyxiexzf.mo1869Ujhhgtgfeyxiexzf(conversationBean)) {
                            if (menuItem.getItemId() == c3712Ujhhgtgfeyxiexzf.f11759Ujhhgtgfeyxiexzf) {
                                c3712Ujhhgtgfeyxiexzf.f11761Ujhhgtgfeyxiexzf.invoke(conversationBean);
                            }
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        sb.append(MagicFactory.get(4928330364906112394L, strArr));
                        sb.append(interfaceC0595Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0595Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : MagicFactory.get(4928330420740687242L, strArr));
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb, MagicFactory.get(4928330519524935050L, strArr), e, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg2 = null;
                }
                ContextMenu contextMenu = (ContextMenu) c0919feyxiexzfUjhhgtg2;
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[2];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg3);
                int i6 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf2);
                C3709Ujhhgtgfeyxiexzf.f11751Ujhhgtgfeyxiexzf.getClass();
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.f10724Ujhhgtgfeyxiexzf = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3708feyxiexzfUjhhgtg.f11750Ujhhgtgfeyxiexzf).getDeclaringClass();
                ConversationBean conversationBean2 = new ConversationBean(((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf());
                for (InterfaceC0595Ujhhgtgfeyxiexzf interfaceC0595Ujhhgtgfeyxiexzf2 : C3715feyxiexzfUjhhgtg.f11765Ujhhgtgfeyxiexzf) {
                    try {
                        for (C3712Ujhhgtgfeyxiexzf c3712Ujhhgtgfeyxiexzf2 : interfaceC0595Ujhhgtgfeyxiexzf2.mo1869Ujhhgtgfeyxiexzf(conversationBean2)) {
                            contextMenu.add(adapterContextMenuInfo.position, c3712Ujhhgtgfeyxiexzf2.f11759Ujhhgtgfeyxiexzf, 0, c3712Ujhhgtgfeyxiexzf2.f11760Ujhhgtgfeyxiexzf);
                        }
                    } catch (Exception e2) {
                        ArrayList arrayList2 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb2 = new StringBuilder();
                        String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        sb2.append(MagicFactory.get(4928330244647028106L, strArr2));
                        sb2.append(interfaceC0595Ujhhgtgfeyxiexzf2 instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0595Ujhhgtgfeyxiexzf2).mo1479feyxiexzfUjhhgtg() : MagicFactory.get(4928330300481602954L, strArr2));
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb2, MagicFactory.get(4928330261826897290L, strArr2), e2, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                c3452feyxiexzfUjhhgtg2.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928333517412107658L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                c3452feyxiexzfUjhhgtg2.m4950Ujhhgtgfeyxiexzf(new C3711Ujhhgtgfeyxiexzf(i3));
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = (C0394Ujhhgtgfeyxiexzf) obj;
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394Ujhhgtgfeyxiexzf.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928333659146028426L, strArr3));
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928333706390668682L, strArr3));
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = (C0394Ujhhgtgfeyxiexzf) obj;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394Ujhhgtgfeyxiexzf2.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928330485165196682L, strArr4));
                if (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7382Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7360Ujhhgtgfeyxiexzf)) {
                    c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928333835239687562L, strArr4), MagicFactory.get(4928334080052823434L, strArr4));
                } else {
                    c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928334286211253642L, strArr4), MagicFactory.get(4928333311253677450L, strArr4));
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3711Ujhhgtgfeyxiexzf(8);
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg3);
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                C0394Ujhhgtgfeyxiexzf.m1652Ujhhgtgfeyxiexzf(c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf, MagicFactory.get(4928261615364605322L, strArr5));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928260704831538570L, strArr5));
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C3711Ujhhgtgfeyxiexzf(16);
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3711Ujhhgtgfeyxiexzf(14);
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3711Ujhhgtgfeyxiexzf(i4);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3711Ujhhgtgfeyxiexzf(13);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg4 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg4);
                C3722Ujhhgtgfeyxiexzf.f11772Ujhhgtgfeyxiexzf.getClass();
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1654Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C3718feyxiexzfUjhhgtg.f11768Ujhhgtgfeyxiexzf));
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928550224281994634L, strArr6), MagicFactory.get(4928550374605849994L, strArr6));
                c3452feyxiexzfUjhhgtg4.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg5 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg5);
                C3722Ujhhgtgfeyxiexzf.f11772Ujhhgtgfeyxiexzf.getClass();
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3.m1654Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C3718feyxiexzfUjhhgtg.f11768Ujhhgtgfeyxiexzf));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928550915771729290L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                c3452feyxiexzfUjhhgtg5.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C3711Ujhhgtgfeyxiexzf(17));
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928550877117023626L, strArr7));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928550748268004746L, strArr7));
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = (C0394Ujhhgtgfeyxiexzf) obj;
                C3722Ujhhgtgfeyxiexzf.f11772Ujhhgtgfeyxiexzf.getClass();
                c0394Ujhhgtgfeyxiexzf3.m1654Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C3718feyxiexzfUjhhgtg.f11768Ujhhgtgfeyxiexzf));
                c0394Ujhhgtgfeyxiexzf3.m1656Ujhhgtgfeyxiexzf(new C0682Ujhhgtgfeyxiexzf(2, 4, 1));
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394Ujhhgtgfeyxiexzf3.m1663feyxiexzfUjhhgtg(MagicFactory.get(4928549988058793354L, strArr8), MagicFactory.get(4928549953699054986L, strArr8), MagicFactory.get(4928550031008466314L, strArr8), MagicFactory.get(4928550142677616010L, strArr8), MagicFactory.get(4928550099727943050L, strArr8));
                String str = MagicFactory.get(4928550215692060042L, strArr8);
                List arrayList3 = c0394Ujhhgtgfeyxiexzf3.f2138Ujhhgtgfeyxiexzf;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                c0394Ujhhgtgfeyxiexzf3.f2138Ujhhgtgfeyxiexzf = arrayList3;
                arrayList3.add(new C1155feyxiexzfUjhhgtg(str, 5, false));
                String str2 = MagicFactory.get(4928550284411536778L, strArr8);
                List arrayList4 = c0394Ujhhgtgfeyxiexzf3.f2138Ujhhgtgfeyxiexzf;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                c0394Ujhhgtgfeyxiexzf3.f2138Ujhhgtgfeyxiexzf = arrayList4;
                arrayList4.add(new C1155feyxiexzfUjhhgtg(str2, 5, false));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C3711Ujhhgtgfeyxiexzf(20);
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                C1136feyxiexzfUjhhgtg.f4301Ujhhgtgfeyxiexzf.getClass();
                Class cls = (Class) AbstractC2391Ujhhgtgfeyxiexzf.m3649feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C1137feyxiexzfUjhhgtg.f4302Ujhhgtgfeyxiexzf).getInterfaces());
                ConcurrentHashMap concurrentHashMap = AbstractC2842feyxiexzfUjhhgtg.f9028Ujhhgtgfeyxiexzf;
                return Boolean.valueOf(cls.isAssignableFrom((Class) obj));
            case 20:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C3711Ujhhgtgfeyxiexzf(21));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928206008423024010L, strArr9), MagicFactory.get(4928206193106617738L, strArr9));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3711Ujhhgtgfeyxiexzf(23);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg6 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg6.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928230906348438922L, strArr10));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf4 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf4.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928230781794387338L, strArr10));
                c3452feyxiexzfUjhhgtg6.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf4;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_custom_balance, null, false);
                int i7 = R.id.moduleDialogEdtCustomBalanceMax1;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtCustomBalanceMax1);
                if (textInputEditText != null) {
                    i7 = R.id.moduleDialogEdtCustomBalanceMax2;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtCustomBalanceMax2);
                    if (textInputEditText2 != null) {
                        i7 = R.id.moduleDialogEdtCustomBalanceMax3;
                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtCustomBalanceMax3);
                        if (textInputEditText3 != null) {
                            i7 = R.id.moduleDialogEdtCustomBalanceMin1;
                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtCustomBalanceMin1);
                            if (textInputEditText4 != null) {
                                i7 = R.id.moduleDialogEdtCustomBalanceMin2;
                                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtCustomBalanceMin2);
                                if (textInputEditText5 != null) {
                                    i7 = R.id.moduleDialogEdtCustomBalanceMin3;
                                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtCustomBalanceMin3);
                                    if (textInputEditText6 != null) {
                                        i7 = R.id.moduleDialogEdtCustomBalanceValue1;
                                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtCustomBalanceValue1);
                                        if (textInputEditText7 != null) {
                                            i7 = R.id.moduleDialogEdtCustomBalanceValue2;
                                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtCustomBalanceValue2);
                                            if (textInputEditText8 != null) {
                                                i7 = R.id.moduleDialogEdtCustomBalanceValue3;
                                                TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtCustomBalanceValue3);
                                                if (textInputEditText9 != null) {
                                                    i7 = R.id.moduleDialogInputCustomBalanceMax1;
                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputCustomBalanceMax1)) != null) {
                                                        i7 = R.id.moduleDialogInputCustomBalanceMax2;
                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputCustomBalanceMax2)) != null) {
                                                            i7 = R.id.moduleDialogInputCustomBalanceMax3;
                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputCustomBalanceMax3)) != null) {
                                                                i7 = R.id.moduleDialogInputCustomBalanceMin1;
                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputCustomBalanceMin1)) != null) {
                                                                    i7 = R.id.moduleDialogInputCustomBalanceMin2;
                                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputCustomBalanceMin2)) != null) {
                                                                        i7 = R.id.moduleDialogInputCustomBalanceMin3;
                                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputCustomBalanceMin3)) != null) {
                                                                            i7 = R.id.moduleDialogInputCustomBalanceValue1;
                                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputCustomBalanceValue1)) != null) {
                                                                                i7 = R.id.moduleDialogInputCustomBalanceValue2;
                                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputCustomBalanceValue2)) != null) {
                                                                                    i7 = R.id.moduleDialogInputCustomBalanceValue3;
                                                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputCustomBalanceValue3)) != null) {
                                                                                        i7 = R.id.moduleDialogRbCustomBalanceMathAdd;
                                                                                        MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogRbCustomBalanceMathAdd);
                                                                                        if (materialRadioButton != null) {
                                                                                            i7 = R.id.moduleDialogRbCustomBalanceMathDefault;
                                                                                            MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogRbCustomBalanceMathDefault);
                                                                                            if (materialRadioButton2 != null) {
                                                                                                i7 = R.id.moduleDialogRbCustomBalanceMathSub;
                                                                                                MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogRbCustomBalanceMathSub);
                                                                                                if (materialRadioButton3 != null) {
                                                                                                    i7 = R.id.moduleDialogRgCustomBalanceMath;
                                                                                                    RadioGroup radioGroup = (RadioGroup) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogRgCustomBalanceMath);
                                                                                                    if (radioGroup != null) {
                                                                                                        LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                                                                                                        C0325Ujhhgtgfeyxiexzf c0325Ujhhgtgfeyxiexzf = new C0325Ujhhgtgfeyxiexzf(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, materialRadioButton, materialRadioButton2, materialRadioButton3, radioGroup);
                                                                                                        int iM4619Ujhhgtgfeyxiexzf = C3041Ujhhgtgfeyxiexzf.f9421Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf();
                                                                                                        if (iM4619Ujhhgtgfeyxiexzf == EnumC3060Ujhhgtgfeyxiexzf.f9477Ujhhgtgfeyxiexzf.f9482Ujhhgtgfeyxiexzf) {
                                                                                                            materialRadioButton3.setChecked(true);
                                                                                                        } else if (iM4619Ujhhgtgfeyxiexzf == EnumC3060Ujhhgtgfeyxiexzf.f9478Ujhhgtgfeyxiexzf.f9482Ujhhgtgfeyxiexzf) {
                                                                                                            materialRadioButton2.setChecked(true);
                                                                                                        } else if (iM4619Ujhhgtgfeyxiexzf == EnumC3060Ujhhgtgfeyxiexzf.f9479Ujhhgtgfeyxiexzf.f9482Ujhhgtgfeyxiexzf) {
                                                                                                            materialRadioButton.setChecked(true);
                                                                                                        }
                                                                                                        textInputEditText4.setText(AbstractC3612feyxiexzfUjhhgtg.m5235Ujhhgtgfeyxiexzf(Float.valueOf(C3040Ujhhgtgfeyxiexzf.f9420Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf())));
                                                                                                        textInputEditText7.setText(AbstractC3612feyxiexzfUjhhgtg.m5235Ujhhgtgfeyxiexzf(Float.valueOf(C3048Ujhhgtgfeyxiexzf.f9432Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf())));
                                                                                                        textInputEditText.setText(AbstractC3612feyxiexzfUjhhgtg.m5235Ujhhgtgfeyxiexzf(Float.valueOf(C3042Ujhhgtgfeyxiexzf.f9422Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf())));
                                                                                                        textInputEditText5.setText(AbstractC3612feyxiexzfUjhhgtg.m5235Ujhhgtgfeyxiexzf(Float.valueOf(C3039Ujhhgtgfeyxiexzf.f9419Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf())));
                                                                                                        textInputEditText8.setText(AbstractC3612feyxiexzfUjhhgtg.m5235Ujhhgtgfeyxiexzf(Float.valueOf(C3044Ujhhgtgfeyxiexzf.f9424Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf())));
                                                                                                        textInputEditText2.setText(AbstractC3612feyxiexzfUjhhgtg.m5235Ujhhgtgfeyxiexzf(Float.valueOf(C3038Ujhhgtgfeyxiexzf.f9418Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf())));
                                                                                                        textInputEditText6.setText(AbstractC3612feyxiexzfUjhhgtg.m5235Ujhhgtgfeyxiexzf(Float.valueOf(C3047Ujhhgtgfeyxiexzf.f9431Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf())));
                                                                                                        textInputEditText9.setText(AbstractC3612feyxiexzfUjhhgtg.m5235Ujhhgtgfeyxiexzf(Float.valueOf(C3043Ujhhgtgfeyxiexzf.f9423Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf())));
                                                                                                        textInputEditText3.setText(AbstractC3612feyxiexzfUjhhgtg.m5235Ujhhgtgfeyxiexzf(Float.valueOf(C3037Ujhhgtgfeyxiexzf.f9417Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf())));
                                                                                                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                                                                                                        C3046Ujhhgtgfeyxiexzf.f9426Ujhhgtgfeyxiexzf.getClass();
                                                                                                        c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C3046Ujhhgtgfeyxiexzf.f9428Ujhhgtgfeyxiexzf;
                                                                                                        c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                                                                                                        c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928368731848967562L, strArr11), new C2977Ujhhgtgfeyxiexzf(14, c0325Ujhhgtgfeyxiexzf));
                                                                                                        AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                                                                                                        return c1943Ujhhgtgfeyxiexzf;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928819235263612298L, strArr11).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i7)));
            case Opcodes.ALOAD /* 25 */:
                List list = (List) obj;
                Object obj3 = list.get(0);
                Class<String> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class));
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj3, clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : String.class)) {
                    Object obj4 = list.get(1);
                    Class<Boolean> cls2 = Boolean.class;
                    Class<Boolean> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                    if (clsM5159Ujhhgtgfeyxiexzf2 == null) {
                        clsM5159Ujhhgtgfeyxiexzf2 = cls2;
                    }
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj4, clsM5159Ujhhgtgfeyxiexzf2)) {
                        Object obj5 = list.get(2);
                        Class<Boolean> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                        z = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj5, clsM5159Ujhhgtgfeyxiexzf3 != null ? clsM5159Ujhhgtgfeyxiexzf3 : Boolean.class);
                    }
                }
                return Boolean.valueOf(z);
            case 26:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf3.getClass();
                try {
                    c0919feyxiexzfUjhhgtg4 = c0578Ujhhgtgfeyxiexzf3.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg4 == null) {
                        c0919feyxiexzfUjhhgtg4 = null;
                    }
                } catch (Throwable th4) {
                    c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th4);
                }
                String str3 = (String) (c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg4);
                if (str3 == null) {
                    str3 = "";
                }
                float f = Float.parseFloat(str3);
                C3369feyxiexzfUjhhgtg c3369feyxiexzfUjhhgtg = EnumC3060Ujhhgtgfeyxiexzf.f9481Ujhhgtgfeyxiexzf;
                c3369feyxiexzfUjhhgtg.getClass();
                C2930Ujhhgtgfeyxiexzf c2930Ujhhgtgfeyxiexzf = new C2930Ujhhgtgfeyxiexzf(0, c3369feyxiexzfUjhhgtg);
                while (c2930Ujhhgtgfeyxiexzf.hasNext()) {
                    EnumC3060Ujhhgtgfeyxiexzf enumC3060Ujhhgtgfeyxiexzf = (EnumC3060Ujhhgtgfeyxiexzf) c2930Ujhhgtgfeyxiexzf.next();
                    if (enumC3060Ujhhgtgfeyxiexzf.f9482Ujhhgtgfeyxiexzf == C3041Ujhhgtgfeyxiexzf.f9421Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()) {
                        for (C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg : AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(new C1381feyxiexzfUjhhgtg(new C2863Ujhhgtgfeyxiexzf(C3040Ujhhgtgfeyxiexzf.f9420Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf(), C3042Ujhhgtgfeyxiexzf.f9422Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()), Float.valueOf(C3048Ujhhgtgfeyxiexzf.f9432Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf())), new C1381feyxiexzfUjhhgtg(new C2863Ujhhgtgfeyxiexzf(C3039Ujhhgtgfeyxiexzf.f9419Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf(), C3038Ujhhgtgfeyxiexzf.f9418Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()), Float.valueOf(C3044Ujhhgtgfeyxiexzf.f9424Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf())), new C1381feyxiexzfUjhhgtg(new C2863Ujhhgtgfeyxiexzf(C3047Ujhhgtgfeyxiexzf.f9431Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf(), C3037Ujhhgtgfeyxiexzf.f9417Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()), Float.valueOf(C3043Ujhhgtgfeyxiexzf.f9423Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf())))) {
                            InterfaceC2864Ujhhgtgfeyxiexzf interfaceC2864Ujhhgtgfeyxiexzf = (InterfaceC2864Ujhhgtgfeyxiexzf) c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf;
                            float fFloatValue = ((Number) c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf).floatValue();
                            C2863Ujhhgtgfeyxiexzf c2863Ujhhgtgfeyxiexzf = (C2863Ujhhgtgfeyxiexzf) interfaceC2864Ujhhgtgfeyxiexzf;
                            c2863Ujhhgtgfeyxiexzf.getClass();
                            if (f >= c2863Ujhhgtgfeyxiexzf.f9122Ujhhgtgfeyxiexzf && f <= c2863Ujhhgtgfeyxiexzf.f9123Ujhhgtgfeyxiexzf) {
                                int iOrdinal = enumC3060Ujhhgtgfeyxiexzf.ordinal();
                                if (iOrdinal == 0) {
                                    fFloatValue = f - fFloatValue;
                                } else if (iOrdinal == 2) {
                                    fFloatValue += f;
                                }
                                new C2501feyxiexzfUjhhgtg(0, 6, c0578Ujhhgtgfeyxiexzf3).m3786Ujhhgtgfeyxiexzf(AbstractC3612feyxiexzfUjhhgtg.m5235Ujhhgtgfeyxiexzf(Float.valueOf(fFloatValue)));
                                return c1943Ujhhgtgfeyxiexzf;
                            }
                        }
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                }
                throw new NoSuchElementException(MagicFactory.get(4928368856403019146L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
            case 27:
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_custom_contact_count, null, false);
                int i8 = R.id.moduleDialogEdtCustomFriendCount;
                TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtCustomFriendCount);
                if (textInputEditText10 != null) {
                    i8 = R.id.moduleDialogEdtCustomGroupCount;
                    TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtCustomGroupCount);
                    if (textInputEditText11 != null) {
                        i8 = R.id.moduleDialogEdtMsgInfoTextPlaceholders;
                        if (((MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtMsgInfoTextPlaceholders)) != null) {
                            i8 = R.id.moduleDialogInputCustomFriendCount;
                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputCustomFriendCount)) != null) {
                                i8 = R.id.moduleDialogInputCustomGroupCount;
                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputCustomGroupCount)) != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf2;
                                    C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf = new C0328Ujhhgtgfeyxiexzf(linearLayout2, textInputEditText10, textInputEditText11, 0);
                                    textInputEditText10.setText(String.valueOf(C3045Ujhhgtgfeyxiexzf.f9425Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
                                    textInputEditText11.setText(String.valueOf(C3053Ujhhgtgfeyxiexzf.f9443Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
                                    C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                                    C3054Ujhhgtgfeyxiexzf.f9444Ujhhgtgfeyxiexzf.getClass();
                                    c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = C3054Ujhhgtgfeyxiexzf.f9446Ujhhgtgfeyxiexzf;
                                    c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = linearLayout2;
                                    c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928367580797732234L, strArr12), new C2977Ujhhgtgfeyxiexzf(15, c0328Ujhhgtgfeyxiexzf));
                                    AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                                    return c1943Ujhhgtgfeyxiexzf;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928818273190937994L, strArr12).concat(viewM2416Ujhhgtgfeyxiexzf2.getResources().getResourceName(i8)));
            case 28:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr13 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                int i9 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf4);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE);
                for (Object obj6 : c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf()) {
                    int iIntValue = ((Number) ((C3438feyxiexzfUjhhgtg) obj6).m4939Ujhhgtgfeyxiexzf()).intValue();
                    if (1 <= iIntValue && iIntValue < 3) {
                        if (z2) {
                            throw new IllegalArgumentException(MagicFactory.get(4928367567912830346L, strArr13));
                        }
                        obj2 = obj6;
                        z2 = true;
                    }
                }
                if (!z2) {
                    throw new NoSuchElementException(MagicFactory.get(4928367894330344842L, strArr13));
                }
                int iM4619Ujhhgtgfeyxiexzf2 = (((Number) ((C3438feyxiexzfUjhhgtg) obj2).m4939Ujhhgtgfeyxiexzf()).intValue() == 1 ? C3045Ujhhgtgfeyxiexzf.f9425Ujhhgtgfeyxiexzf : C3053Ujhhgtgfeyxiexzf.f9443Ujhhgtgfeyxiexzf).m4619Ujhhgtgfeyxiexzf();
                if (iM4619Ujhhgtgfeyxiexzf2 != 0) {
                    int i10 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0578Ujhhgtgfeyxiexzf4.m1849Ujhhgtgfeyxiexzf()).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928371368958887306L, strArr13);
                    ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(Integer.valueOf(iM4619Ujhhgtgfeyxiexzf2));
                }
                return c1943Ujhhgtgfeyxiexzf;
            default:
                String[] strArr14 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928385233113318794L, strArr14), MagicFactory.get(4928385396322076042L, strArr14));
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
