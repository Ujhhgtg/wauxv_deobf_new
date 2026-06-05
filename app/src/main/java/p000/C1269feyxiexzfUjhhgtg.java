package p000;

import android.content.ContentValues;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛲᛱUjhhgtgᛱᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1269feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4644Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1269feyxiexzfUjhhgtg(int i) {
        this.f4644Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x02b1  */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        Object c0919feyxiexzfUjhhgtg;
        boolean zIsInterface;
        Object c0919feyxiexzfUjhhgtg2;
        C1385feyxiexzfUjhhgtg c1385feyxiexzfUjhhgtg;
        int i = this.f4644Ujhhgtgfeyxiexzf;
        int i2 = 8;
        int i3 = 7;
        int i4 = 2;
        int i5 = 10;
        Class<Integer> cls = Integer.class;
        int i6 = 3;
        int i7 = 1;
        Object obj2 = null;
        int i8 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928310182854788490L, strArr));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928310964538836362L, strArr), MagicFactory.get(4928311136337528202L, strArr));
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
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
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                MsgInfoBean msgInfoBean = new MsgInfoBean(c0919feyxiexzfUjhhgtg);
                for (Object obj3 : C1276feyxiexzfUjhhgtg.f4661Ujhhgtgfeyxiexzf) {
                    try {
                        if (((C2434Ujhhgtgfeyxiexzf) obj3).mo1424feyxiexzfUjhhgtg() && msgInfoBean.isNotifyAll() && C2433Ujhhgtgfeyxiexzf.f7872Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf().contains(msgInfoBean.getTalker())) {
                            c0578Ujhhgtgfeyxiexzf.m1853Ujhhgtgfeyxiexzf(null);
                        }
                    } catch (Exception e) {
                        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        sb.append(MagicFactory.get(4928310818509948298L, strArr2));
                        sb.append(obj3 instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) obj3).mo1479feyxiexzfUjhhgtg() : MagicFactory.get(4928310900114326922L, strArr2));
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb, MagicFactory.get(4928310998898574730L, strArr2), e, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1269feyxiexzfUjhhgtg(i6);
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg2.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928541621462500746L, strArr3));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928541368059430282L, strArr3), MagicFactory.get(4928541557037991306L, strArr3));
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                int i9 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf2);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = C2724feyxiexzfUjhhgtg.f8678Ujhhgtgfeyxiexzf.m4033feyxiexzfUjhhgtg();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg((FrameLayout) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f10725Ujhhgtgfeyxiexzf = new C1269feyxiexzfUjhhgtg(5);
                Object obj4 = null;
                boolean z = false;
                for (Object obj5 : c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf()) {
                    Object objM4938Ujhhgtgfeyxiexzf = ((C3438feyxiexzfUjhhgtg) obj5).m4938Ujhhgtgfeyxiexzf();
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(objM4938Ujhhgtgfeyxiexzf != null ? objM4938Ujhhgtgfeyxiexzf.getClass().getSimpleName() : null, MagicFactory.get(4928541965059884426L, strArr4))) {
                        if (z) {
                            throw new IllegalArgumentException(MagicFactory.get(4928542038074328458L, strArr4));
                        }
                        obj4 = obj5;
                        z = true;
                    }
                }
                if (!z) {
                    throw new NoSuchElementException(MagicFactory.get(4928541127541261706L, strArr4));
                }
                FrameLayout frameLayout = (FrameLayout) ((C3438feyxiexzfUjhhgtg) obj4).m4939Ujhhgtgfeyxiexzf();
                int i10 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(frameLayout).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928541303634920842L, strArr4);
                String string = ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1650Ujhhgtgfeyxiexzf(new Object[0]).toString();
                if (string.length() > 0) {
                    ArrayList arrayListM2962Ujhhgtgfeyxiexzf = AbstractC1453feyxiexzfUjhhgtg.m2962Ujhhgtgfeyxiexzf();
                    ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayListM2962Ujhhgtgfeyxiexzf, 10));
                    Iterator it = arrayListM2962Ujhhgtgfeyxiexzf.iterator();
                    while (it.hasNext()) {
                        C1435feyxiexzfUjhhgtg c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf = AbstractC1453feyxiexzfUjhhgtg.m2963Ujhhgtgfeyxiexzf((C1414feyxiexzfUjhhgtg) it.next());
                        arrayList2.add(Boolean.valueOf(c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf != null && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c1435feyxiexzfUjhhgtgM2963Ujhhgtgfeyxiexzf.m2928Ujhhgtgfeyxiexzf(MagicFactory.get(4928463633446339978L, strArr4), string), Boolean.TRUE)));
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (((Boolean) it2.next()).booleanValue()) {
                                int i11 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(frameLayout).m2024Ujhhgtgfeyxiexzf();
                                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928541406714135946L, strArr4);
                                ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(MagicFactory.get(4928541372354397578L, strArr4));
                                c0578Ujhhgtgfeyxiexzf2.m1853Ujhhgtgfeyxiexzf(null);
                            }
                        }
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                zIsInterface = ((Class) obj).isInterface();
                break;
            case 6:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1269feyxiexzfUjhhgtg(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                int i12 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0578Ujhhgtgfeyxiexzf3.m1849Ujhhgtgfeyxiexzf()).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE);
                int iIntValue = ((Number) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3)).m1650Ujhhgtgfeyxiexzf(new Object[0])).intValue();
                Object objM1850Ujhhgtgfeyxiexzf = c0578Ujhhgtgfeyxiexzf3.m1850Ujhhgtgfeyxiexzf();
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                MagicFactory.get(4928310573696812426L, strArr5);
                byte[] bArr = (byte[]) objM1850Ujhhgtgfeyxiexzf;
                for (Object obj6 : C1462feyxiexzfUjhhgtg.f5081Ujhhgtgfeyxiexzf) {
                    try {
                        ((C2833feyxiexzfUjhhgtg) obj6).m4158feyxiexzfUjhhgtg(c0578Ujhhgtgfeyxiexzf3, iIntValue, bArr);
                    } catch (Exception e2) {
                        ArrayList arrayList3 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(MagicFactory.get(4928314052620322186L, strArr5));
                        sb2.append(obj6 instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) obj6).mo1479feyxiexzfUjhhgtg() : MagicFactory.get(4928314134224700810L, strArr5));
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb2, MagicFactory.get(4928314233008948618L, strArr5), e2, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg3);
                Class<byte[]> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(byte[].class));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1658feyxiexzfUjhhgtg(clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : byte[].class);
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928314198649210250L, strArr6), MagicFactory.get(4928314366152934794L, strArr6));
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_open_info, null, false);
                int i13 = R.id.moduleDialogEdtOpenInfoId;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtOpenInfoId);
                if (textInputEditText != null) {
                    i13 = R.id.moduleDialogInputOpenInfoId;
                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputOpenInfoId)) != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                        C0319Ujhhgtgfeyxiexzf c0319Ujhhgtgfeyxiexzf = new C0319Ujhhgtgfeyxiexzf(linearLayout, textInputEditText, i3);
                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                        C1466feyxiexzfUjhhgtg.f5096Ujhhgtgfeyxiexzf.getClass();
                        c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C1466feyxiexzfUjhhgtg.f5098Ujhhgtgfeyxiexzf;
                        c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                        c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928844584160593290L, strArr7), new C0350Ujhhgtgfeyxiexzf(i2, c0319Ujhhgtgfeyxiexzf));
                        AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928807003196753290L, strArr7).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i13)));
            case 10:
                Class cls2 = (Class) obj;
                Class<Boolean> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Boolean.class));
                zIsInterface = !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : Boolean.class);
                break;
            case 11:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1269feyxiexzfUjhhgtg(18);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1269feyxiexzfUjhhgtg(20);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1269feyxiexzfUjhhgtg(21);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C0311Ujhhgtgfeyxiexzf c0311Ujhhgtgfeyxiexzf = (C0311Ujhhgtgfeyxiexzf) obj;
                C1369feyxiexzfUjhhgtg.f4850Ujhhgtgfeyxiexzf.getClass();
                ArrayList arrayList4 = new ArrayList(C1369feyxiexzfUjhhgtg.m2870feyxiexzfUjhhgtg());
                C2823feyxiexzfUjhhgtg c2823feyxiexzfUjhhgtg = new C2823feyxiexzfUjhhgtg(arrayList4, new C1382feyxiexzfUjhhgtg(arrayList4, i8));
                RecyclerView recyclerView = c0311Ujhhgtgfeyxiexzf.f1853Ujhhgtgfeyxiexzf;
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setAdapter(c2823feyxiexzfUjhhgtg);
                recyclerView.setItemAnimator(null);
                new C0708Ujhhgtgfeyxiexzf(new C2718feyxiexzfUjhhgtg(c2823feyxiexzfUjhhgtg, arrayList4, new C1382feyxiexzfUjhhgtg(arrayList4, 1), i4)).m2001Ujhhgtgfeyxiexzf(c0311Ujhhgtgfeyxiexzf.f1853Ujhhgtgfeyxiexzf);
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                C0134Ujhhgtgfeyxiexzf c0134Ujhhgtgfeyxiexzf = (C0134Ujhhgtgfeyxiexzf) obj;
                c0134Ujhhgtgfeyxiexzf.f1286Ujhhgtgfeyxiexzf = true;
                c0134Ujhhgtgfeyxiexzf.f1285Ujhhgtgfeyxiexzf = true;
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                Object objM1850Ujhhgtgfeyxiexzf2 = ((C0578Ujhhgtgfeyxiexzf) obj).m1850Ujhhgtgfeyxiexzf();
                if ((objM1850Ujhhgtgfeyxiexzf2 instanceof List) && (!(objM1850Ujhhgtgfeyxiexzf2 instanceof InterfaceC0140Ujhhgtgfeyxiexzf) || (objM1850Ujhhgtgfeyxiexzf2 instanceof InterfaceC0139Ujhhgtgfeyxiexzf))) {
                    obj2 = objM1850Ujhhgtgfeyxiexzf2;
                }
                List list = (List) obj2;
                Iterator it3 = new C0929feyxiexzfUjhhgtg(C1369feyxiexzfUjhhgtg.f4853Ujhhgtgfeyxiexzf).iterator();
                while (true) {
                    ListIterator listIterator = ((C0928feyxiexzfUjhhgtg) it3).f3757Ujhhgtgfeyxiexzf;
                    if (!listIterator.hasPrevious()) {
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                    C1385feyxiexzfUjhhgtg c1385feyxiexzfUjhhgtg2 = (C1385feyxiexzfUjhhgtg) listIterator.previous();
                    ContentValues contentValues = new ContentValues();
                    int i14 = i7;
                    contentValues.put(MagicFactory.get(4928406772374308234L, strArr8), MagicFactory.get(4928406841093784970L, strArr8));
                    contentValues.put(MagicFactory.get(4928405943445620106L, strArr8), MagicFactory.get(4928406029344966026L, strArr8));
                    contentValues.put(MagicFactory.get(4928406231208428938L, strArr8), c1385feyxiexzfUjhhgtg2.f4880Ujhhgtgfeyxiexzf.f4845Ujhhgtgfeyxiexzf);
                    contentValues.put(MagicFactory.get(4928406192553723274L, strArr8), Integer.valueOf(i14));
                    contentValues.put(MagicFactory.get(4928406282748036490L, strArr8), MagicFactory.get(4928403396530013578L, strArr8) + c1385feyxiexzfUjhhgtg2.f4880Ujhhgtgfeyxiexzf.f4844Ujhhgtgfeyxiexzf);
                    contentValues.put(MagicFactory.get(4928406377237317002L, strArr8), (Integer) 7);
                    contentValues.put(MagicFactory.get(4928406347172545930L, strArr8), (Integer) 2);
                    Object objM4168Ujhhgtgfeyxiexzf = AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf(MagicFactory.get(4928230425312101770L, strArr8)), new Object[0]);
                    int i15 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4168Ujhhgtgfeyxiexzf).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928229540548838794L, strArr8);
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m4863Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(ContentValues.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Boolean.TYPE)}, 2));
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m1306Ujhhgtgfeyxiexzf();
                    ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(contentValues, Boolean.TRUE);
                    list = list;
                    list.add(0, objM4168Ujhhgtgfeyxiexzf);
                    i7 = i14;
                }
                break;
            case Opcodes.SIPUSH /* 17 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf4.getClass();
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg2 = null;
                }
                int i16 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0919feyxiexzfUjhhgtg2);
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5.m1636Ujhhgtgfeyxiexzf(EnumC0283Ujhhgtgfeyxiexzf.FINAL);
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5.f2122feyxiexzfUjhhgtg = new C1269feyxiexzfUjhhgtg(i5);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5)).m1649Ujhhgtgfeyxiexzf(new Object[0])).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f10724Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf(MagicFactory.get(4928230425312101770L, strArr9));
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928406325697709450L, strArr9);
                String str = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3)).m4939Ujhhgtgfeyxiexzf();
                for (Object obj7 : C1369feyxiexzfUjhhgtg.f4853Ujhhgtgfeyxiexzf) {
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(MagicFactory.get(4928403396530013578L, strArr9) + ((C1385feyxiexzfUjhhgtg) obj7).f4880Ujhhgtgfeyxiexzf.f4844Ujhhgtgfeyxiexzf, str)) {
                        obj2 = obj7;
                        c1385feyxiexzfUjhhgtg = (C1385feyxiexzfUjhhgtg) obj2;
                        if (c1385feyxiexzfUjhhgtg != null) {
                            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf6 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf6.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(List.class);
                            ((List) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf6)).m1650Ujhhgtgfeyxiexzf(new Object[0])).addAll(c1385feyxiexzfUjhhgtg.f4881Ujhhgtgfeyxiexzf);
                        }
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                }
                c1385feyxiexzfUjhhgtg = (C1385feyxiexzfUjhhgtg) obj2;
                if (c1385feyxiexzfUjhhgtg != null) {
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf7 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf7.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(List.class);
                    ((List) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf7)).m1650Ujhhgtgfeyxiexzf(new Object[0])).addAll(c1385feyxiexzfUjhhgtg.f4881Ujhhgtgfeyxiexzf);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C1269feyxiexzfUjhhgtg(22));
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = (C0394Ujhhgtgfeyxiexzf) obj;
                c0394Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928404848228959626L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                C1269feyxiexzfUjhhgtg c1269feyxiexzfUjhhgtg = new C1269feyxiexzfUjhhgtg(23);
                C0300Ujhhgtgfeyxiexzf c0300Ujhhgtgfeyxiexzf = new C0300Ujhhgtgfeyxiexzf();
                c1269feyxiexzfUjhhgtg.invoke(c0300Ujhhgtgfeyxiexzf);
                c0394Ujhhgtgfeyxiexzf3.f2140Ujhhgtgfeyxiexzf = c0300Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg4 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg4);
                Class<ArrayList> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(ArrayList.class));
                Class<Integer> clsM2695Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2695Ujhhgtgfeyxiexzf(c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2, clsM5159Ujhhgtgfeyxiexzf3 != null ? clsM5159Ujhhgtgfeyxiexzf3 : ArrayList.class, cls);
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1657Ujhhgtgfeyxiexzf(clsM2695Ujhhgtgfeyxiexzf != null ? clsM2695Ujhhgtgfeyxiexzf : Integer.class);
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928405496769021322L, strArr10), MagicFactory.get(4928405750172091786L, strArr10));
                c3452feyxiexzfUjhhgtg4.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C1269feyxiexzfUjhhgtg(19));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf4 = (C0394Ujhhgtgfeyxiexzf) obj;
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                Class clsM2792Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf(MagicFactory.get(4928405294905558410L, strArr11));
                Class<Integer> clsM5159Ujhhgtgfeyxiexzf4 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                if (clsM5159Ujhhgtgfeyxiexzf4 == null) {
                    clsM5159Ujhhgtgfeyxiexzf4 = cls;
                }
                Class<String> clsM5159Ujhhgtgfeyxiexzf5 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class));
                Class cls3 = clsM5159Ujhhgtgfeyxiexzf5 != null ? clsM5159Ujhhgtgfeyxiexzf5 : String.class;
                Class<Integer> clsM5159Ujhhgtgfeyxiexzf6 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                c0394Ujhhgtgfeyxiexzf4.m1657Ujhhgtgfeyxiexzf(clsM2792Ujhhgtgfeyxiexzf, clsM5159Ujhhgtgfeyxiexzf4, cls3, clsM5159Ujhhgtgfeyxiexzf6 != null ? clsM5159Ujhhgtgfeyxiexzf6 : Integer.class);
                c0394Ujhhgtgfeyxiexzf4.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928405440934446474L, strArr11), MagicFactory.get(4928405535423726986L, strArr11));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                ((C0300Ujhhgtgfeyxiexzf) obj).m1529Ujhhgtgfeyxiexzf(new C1269feyxiexzfUjhhgtg(24));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928405775941895562L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                View viewM2416Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_panel_emoji, null, false);
                int i17 = R.id.moduleDialogBtnPanelEmojiClearGroup;
                MaterialButton materialButton = (MaterialButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogBtnPanelEmojiClearGroup);
                if (materialButton != null) {
                    i17 = R.id.moduleDialogBtnPanelEmojiCopyPath;
                    MaterialButton materialButton2 = (MaterialButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogBtnPanelEmojiCopyPath);
                    if (materialButton2 != null) {
                        materialButton2.setOnClickListener(new ViewOnClickListenerC1383feyxiexzfUjhhgtg(i8));
                        materialButton.setOnClickListener(new ViewOnClickListenerC1383feyxiexzfUjhhgtg(i7));
                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                        C1369feyxiexzfUjhhgtg.f4850Ujhhgtgfeyxiexzf.getClass();
                        c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = C1369feyxiexzfUjhhgtg.f4855Ujhhgtgfeyxiexzf;
                        c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf2;
                        C0290Ujhhgtgfeyxiexzf.m1499Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                        AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928807140635706762L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf).concat(viewM2416Ujhhgtgfeyxiexzf2.getResources().getResourceName(i17)));
            case 26:
                C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = new C0416Ujhhgtgfeyxiexzf(((View) obj).getContext(), C1373feyxiexzfUjhhgtg.f4866Ujhhgtgfeyxiexzf);
                C1369feyxiexzfUjhhgtg.f4850Ujhhgtgfeyxiexzf.getClass();
                c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf = C1369feyxiexzfUjhhgtg.f4855Ujhhgtgfeyxiexzf;
                c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf = new C1269feyxiexzfUjhhgtg(14);
                c0416Ujhhgtgfeyxiexzf.m1712Ujhhgtgfeyxiexzf().m4550feyxiexzfUjhhgtg();
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C1269feyxiexzfUjhhgtg(28);
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C1269feyxiexzfUjhhgtg(29));
                return c1943Ujhhgtgfeyxiexzf;
            default:
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928510448589866378L, strArr12), MagicFactory.get(4928510616093590922L, strArr12));
                return c1943Ujhhgtgfeyxiexzf;
        }
        return Boolean.valueOf(zIsInterface);
    }
}
