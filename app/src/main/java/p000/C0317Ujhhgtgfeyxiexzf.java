package p000;

import android.database.Cursor;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛲᛴ要点脸ᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0317Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1874Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0317Ujhhgtgfeyxiexzf(int i) {
        this.f1874Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        int i = this.f1874Ujhhgtgfeyxiexzf;
        Class<View.OnClickListener> cls = View.OnClickListener.class;
        int i2 = 29;
        int i3 = 14;
        int i4 = 26;
        int i5 = 25;
        int i6 = 27;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C3426feyxiexzfUjhhgtg c3426feyxiexzfUjhhgtg = (C3426feyxiexzfUjhhgtg) obj;
                c3426feyxiexzfUjhhgtg.getClass();
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                Class<View.OnClickListener> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                C2812Ujhhgtgfeyxiexzf.m4139Ujhhgtgfeyxiexzf(c2812Ujhhgtgfeyxiexzf, (clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : View.OnClickListener.class).getName());
                c3426feyxiexzfUjhhgtg.f10690Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                C3426feyxiexzfUjhhgtg c3426feyxiexzfUjhhgtg2 = (C3426feyxiexzfUjhhgtg) obj;
                c3426feyxiexzfUjhhgtg2.getClass();
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf2 = new C2812Ujhhgtgfeyxiexzf();
                Class<View.OnClickListener> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                C2812Ujhhgtgfeyxiexzf.m4139Ujhhgtgfeyxiexzf(c2812Ujhhgtgfeyxiexzf2, (clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : View.OnClickListener.class).getName());
                c3426feyxiexzfUjhhgtg2.f10690Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(6);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(7);
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg2 = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg2.f10255Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(4);
                c3265feyxiexzfUjhhgtg2.f10256Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(5);
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928311900841706890L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf3 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf3.m4141Ujhhgtgfeyxiexzf(new C0176Ujhhgtgfeyxiexzf(i4));
                c2812Ujhhgtgfeyxiexzf3.m4142Ujhhgtgfeyxiexzf(new C0176Ujhhgtgfeyxiexzf(i6));
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg);
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928311853597066634L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg2 = (C3456feyxiexzfUjhhgtg) obj;
                c3456feyxiexzfUjhhgtg2.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928325984039470474L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf4 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf4.m4141Ujhhgtgfeyxiexzf(new C0176Ujhhgtgfeyxiexzf(28));
                c2812Ujhhgtgfeyxiexzf4.m4142Ujhhgtgfeyxiexzf(new C0176Ujhhgtgfeyxiexzf(i2));
                c3456feyxiexzfUjhhgtg2.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf4;
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg2);
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928325911025026442L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
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
                int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(View.class);
                View view = (View) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.f10725Ujhhgtgfeyxiexzf = new C0176Ujhhgtgfeyxiexzf(i5);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg((View.OnClickListener) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928325588902479242L, strArr);
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf()).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(List.class);
                List list = (List) ((C0393Ujhhgtgfeyxiexzf) AbstractC3317feyxiexzfUjhhgtg.m4794Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new MsgInfoBean(it.next()));
                }
                for (InterfaceC0612Ujhhgtgfeyxiexzf interfaceC0612Ujhhgtgfeyxiexzf : C0348Ujhhgtgfeyxiexzf.f1990Ujhhgtgfeyxiexzf) {
                    try {
                        for (C0313Ujhhgtgfeyxiexzf c0313Ujhhgtgfeyxiexzf : interfaceC0612Ujhhgtgfeyxiexzf.mo1538Ujhhgtgfeyxiexzf(arrayList)) {
                            if (menuItem.getItemId() == c0313Ujhhgtgfeyxiexzf.f1866Ujhhgtgfeyxiexzf) {
                                c0313Ujhhgtgfeyxiexzf.f1868Ujhhgtgfeyxiexzf.mo1179Ujhhgtgfeyxiexzf(view.getContext(), arrayList);
                            }
                        }
                    } catch (Exception e) {
                        ArrayList arrayList2 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb = new StringBuilder();
                        sb.append(MagicFactory.get(4928325580312544650L, strArr));
                        sb.append(interfaceC0612Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0612Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : MagicFactory.get(4928325773586072970L, strArr));
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb, MagicFactory.get(4928325734931367306L, strArr), e, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_msg_bg_bubble, null, false);
                int i8 = R.id.moduleDialogEdtMsgBgBubbleLeftBubble;
                if (((TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtMsgBgBubbleLeftBubble)) != null) {
                    i8 = R.id.moduleDialogEdtMsgBgBubbleLeftDarkBubbleColor;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtMsgBgBubbleLeftDarkBubbleColor);
                    if (textInputEditText != null) {
                        i8 = R.id.moduleDialogEdtMsgBgBubbleLeftLightBubbleColor;
                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtMsgBgBubbleLeftLightBubbleColor);
                        if (textInputEditText2 != null) {
                            i8 = R.id.moduleDialogEdtMsgBgBubbleRightBubble;
                            if (((TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtMsgBgBubbleRightBubble)) != null) {
                                i8 = R.id.moduleDialogEdtMsgBgBubbleRightDarkBubbleColor;
                                TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtMsgBgBubbleRightDarkBubbleColor);
                                if (textInputEditText3 != null) {
                                    i8 = R.id.moduleDialogEdtMsgBgBubbleRightLightBubbleColor;
                                    TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtMsgBgBubbleRightLightBubbleColor);
                                    if (textInputEditText4 != null) {
                                        i8 = R.id.moduleDialogInputMsgBgBubbleLeftBubble;
                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputMsgBgBubbleLeftBubble)) != null) {
                                            i8 = R.id.moduleDialogInputMsgBgBubbleLeftDarkBubbleColor;
                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputMsgBgBubbleLeftDarkBubbleColor)) != null) {
                                                i8 = R.id.moduleDialogInputMsgBgBubbleLeftLightBubbleColor;
                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputMsgBgBubbleLeftLightBubbleColor)) != null) {
                                                    i8 = R.id.moduleDialogInputMsgBgBubbleRightBubble;
                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputMsgBgBubbleRightBubble)) != null) {
                                                        i8 = R.id.moduleDialogInputMsgBgBubbleRightDarkBubbleColor;
                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputMsgBgBubbleRightDarkBubbleColor)) != null) {
                                                            i8 = R.id.moduleDialogInputMsgBgBubbleRightLightBubbleColor;
                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputMsgBgBubbleRightLightBubbleColor)) != null) {
                                                                LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                                                                C0327Ujhhgtgfeyxiexzf c0327Ujhhgtgfeyxiexzf = new C0327Ujhhgtgfeyxiexzf(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, 1);
                                                                textInputEditText2.setText(C0352Ujhhgtgfeyxiexzf.f1995Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                textInputEditText4.setText(C0334Ujhhgtgfeyxiexzf.f1960Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                textInputEditText.setText(C0349Ujhhgtgfeyxiexzf.f1991Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                textInputEditText3.setText(C0351Ujhhgtgfeyxiexzf.f1994Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                                                                C0333Ujhhgtgfeyxiexzf.f1951Ujhhgtgfeyxiexzf.getClass();
                                                                c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C0333Ujhhgtgfeyxiexzf.f1957Ujhhgtgfeyxiexzf;
                                                                c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                                                                c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928356482602239370L, strArr2), new C0350Ujhhgtgfeyxiexzf(0, c0327Ujhhgtgfeyxiexzf));
                                                                c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928356469717337482L, strArr2), new C3471Ujhhgtgfeyxiexzf(27));
                                                                C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                                                                c0290Ujhhgtgfeyxiexzf.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
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
                throw new NullPointerException(MagicFactory.get(4928803017467102602L, strArr2).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i8)));
            case 10:
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_msg_bg_color, null, false);
                int i9 = R.id.moduleDialogEdtMsgBgColorLeftDarkBgColor;
                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtMsgBgColorLeftDarkBgColor);
                if (textInputEditText5 != null) {
                    i9 = R.id.moduleDialogEdtMsgBgColorLeftDarkStrokeColor;
                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtMsgBgColorLeftDarkStrokeColor);
                    if (textInputEditText6 != null) {
                        i9 = R.id.moduleDialogEdtMsgBgColorLeftLightBgColor;
                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtMsgBgColorLeftLightBgColor);
                        if (textInputEditText7 != null) {
                            i9 = R.id.moduleDialogEdtMsgBgColorLeftLightStrokeColor;
                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtMsgBgColorLeftLightStrokeColor);
                            if (textInputEditText8 != null) {
                                i9 = R.id.moduleDialogEdtMsgBgColorRightDarkBgColor;
                                TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtMsgBgColorRightDarkBgColor);
                                if (textInputEditText9 != null) {
                                    i9 = R.id.moduleDialogEdtMsgBgColorRightDarkStrokeColor;
                                    TextInputEditText textInputEditText10 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtMsgBgColorRightDarkStrokeColor);
                                    if (textInputEditText10 != null) {
                                        i9 = R.id.moduleDialogEdtMsgBgColorRightLightBgColor;
                                        TextInputEditText textInputEditText11 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtMsgBgColorRightLightBgColor);
                                        if (textInputEditText11 != null) {
                                            i9 = R.id.moduleDialogEdtMsgBgColorRightLightStrokeColor;
                                            TextInputEditText textInputEditText12 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtMsgBgColorRightLightStrokeColor);
                                            if (textInputEditText12 != null) {
                                                i9 = R.id.moduleDialogInputMsgBgColorLeftDarkBgColor;
                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputMsgBgColorLeftDarkBgColor)) != null) {
                                                    i9 = R.id.moduleDialogInputMsgBgColorLeftDarkStrokeColor;
                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputMsgBgColorLeftDarkStrokeColor)) != null) {
                                                        i9 = R.id.moduleDialogInputMsgBgColorLeftLightBgColor;
                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputMsgBgColorLeftLightBgColor)) != null) {
                                                            i9 = R.id.moduleDialogInputMsgBgColorLeftLightStrokeColor;
                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputMsgBgColorLeftLightStrokeColor)) != null) {
                                                                i9 = R.id.moduleDialogInputMsgBgColorRightDarkBgColor;
                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputMsgBgColorRightDarkBgColor)) != null) {
                                                                    i9 = R.id.moduleDialogInputMsgBgColorRightDarkStrokeColor;
                                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputMsgBgColorRightDarkStrokeColor)) != null) {
                                                                        i9 = R.id.moduleDialogInputMsgBgColorRightLightBgColor;
                                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputMsgBgColorRightLightBgColor)) != null) {
                                                                            i9 = R.id.moduleDialogInputMsgBgColorRightLightStrokeColor;
                                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputMsgBgColorRightLightStrokeColor)) != null) {
                                                                                LinearLayout linearLayout2 = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf2;
                                                                                C0329Ujhhgtgfeyxiexzf c0329Ujhhgtgfeyxiexzf = new C0329Ujhhgtgfeyxiexzf(linearLayout2, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10, textInputEditText11, textInputEditText12, 1);
                                                                                textInputEditText7.setText(C0331Ujhhgtgfeyxiexzf.f1949Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText8.setText(C0332Ujhhgtgfeyxiexzf.f1950Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText11.setText(C0342Ujhhgtgfeyxiexzf.f1972Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText12.setText(C0341Ujhhgtgfeyxiexzf.f1971Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText5.setText(C0336Ujhhgtgfeyxiexzf.f1962Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText6.setText(C0335Ujhhgtgfeyxiexzf.f1961Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText9.setText(C0340Ujhhgtgfeyxiexzf.f1970Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText10.setText(C0339Ujhhgtgfeyxiexzf.f1969Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                                                                                C0337Ujhhgtgfeyxiexzf.f1963Ujhhgtgfeyxiexzf.getClass();
                                                                                c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = C0337Ujhhgtgfeyxiexzf.f1965Ujhhgtgfeyxiexzf;
                                                                                c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = linearLayout2;
                                                                                c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928359012337976714L, strArr3), new C0350Ujhhgtgfeyxiexzf(1, c0329Ujhhgtgfeyxiexzf));
                                                                                c0290Ujhhgtgfeyxiexzf2.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928358999453074826L, strArr3), new C3471Ujhhgtgfeyxiexzf(28));
                                                                                C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                                                                                c0290Ujhhgtgfeyxiexzf2.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
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
                throw new NullPointerException(MagicFactory.get(4928803154906056074L, strArr3).concat(viewM2416Ujhhgtgfeyxiexzf2.getResources().getResourceName(i9)));
            case 11:
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf3 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_msg_format, null, false);
                int i10 = R.id.moduleDialogEdtMsgFormatTextFormat;
                TextInputEditText textInputEditText13 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogEdtMsgFormatTextFormat);
                if (textInputEditText13 != null) {
                    i10 = R.id.moduleDialogEdtMsgFormatTextPlaceholders;
                    MaterialTextView materialTextView = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogEdtMsgFormatTextPlaceholders);
                    if (materialTextView != null) {
                        i10 = R.id.moduleDialogEdtMsgFormatTimeFormat;
                        TextInputEditText textInputEditText14 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogEdtMsgFormatTimeFormat);
                        if (textInputEditText14 != null) {
                            i10 = R.id.moduleDialogInputMsgFormatTextFormat;
                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogInputMsgFormatTextFormat)) != null) {
                                i10 = R.id.moduleDialogInputMsgFormatTimeFormat;
                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf3, R.id.moduleDialogInputMsgFormatTimeFormat)) != null) {
                                    C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf = new C0328Ujhhgtgfeyxiexzf((LinearLayout) viewM2416Ujhhgtgfeyxiexzf3, textInputEditText13, materialTextView, textInputEditText14, 3);
                                    textInputEditText13.setText(C0494Ujhhgtgfeyxiexzf.f2413Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                    textInputEditText14.setText(C0495Ujhhgtgfeyxiexzf.f2414Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                    materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MagicFactory.get(4928414593509754250L, strArr4));
                                    for (String str : C0496Ujhhgtgfeyxiexzf.f2416Ujhhgtgfeyxiexzf) {
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append((CharSequence) (str + ' '));
                                        spannableStringBuilder.setSpan(new C2738Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf, str, 1), length, spannableStringBuilder.length() - 1, 33);
                                    }
                                    materialTextView.setText(spannableStringBuilder);
                                    C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf3 = new C0290Ujhhgtgfeyxiexzf();
                                    C0496Ujhhgtgfeyxiexzf.f2415Ujhhgtgfeyxiexzf.getClass();
                                    c0290Ujhhgtgfeyxiexzf3.f1721Ujhhgtgfeyxiexzf = C0496Ujhhgtgfeyxiexzf.f2418Ujhhgtgfeyxiexzf;
                                    c0290Ujhhgtgfeyxiexzf3.f1723Ujhhgtgfeyxiexzf = c0328Ujhhgtgfeyxiexzf.f1932Ujhhgtgfeyxiexzf;
                                    c0290Ujhhgtgfeyxiexzf3.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928413562717603210L, strArr4), new C0350Ujhhgtgfeyxiexzf(2, c0328Ujhhgtgfeyxiexzf));
                                    c0290Ujhhgtgfeyxiexzf3.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928413549832701322L, strArr4), new C3471Ujhhgtgfeyxiexzf(29));
                                    C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf3, null, 3);
                                    c0290Ujhhgtgfeyxiexzf3.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                    return c1943Ujhhgtgfeyxiexzf;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928803292345009546L, strArr4).concat(viewM2416Ujhhgtgfeyxiexzf3.getResources().getResourceName(i10)));
            case Opcodes.FCONST_1 /* 12 */:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg3 = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg3.f10255Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(13);
                c3265feyxiexzfUjhhgtg3.f10256Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(i3);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg3 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg3.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928413919199888778L, strArr5));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf5 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf5.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928413536947799434L, strArr5), MagicFactory.get(4928413786055902602L, strArr5));
                c3456feyxiexzfUjhhgtg3.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf5;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg3);
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3.m1656Ujhhgtgfeyxiexzf(new C0682Ujhhgtgfeyxiexzf(12, 14, 1));
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(16);
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg4 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg4.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928229278555833738L, strArr6));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf6 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf6.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928229025152763274L, strArr6), MagicFactory.get(4928229227016226186L, strArr6));
                c3456feyxiexzfUjhhgtg4.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf6;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                for (InterfaceC0608Ujhhgtgfeyxiexzf interfaceC0608Ujhhgtgfeyxiexzf : C0480Ujhhgtgfeyxiexzf.f2394Ujhhgtgfeyxiexzf) {
                    try {
                        interfaceC0608Ujhhgtgfeyxiexzf.mo1537Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf2.m1849Ujhhgtgfeyxiexzf());
                    } catch (Exception e2) {
                        ArrayList arrayList3 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb2 = new StringBuilder();
                        String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        sb2.append(MagicFactory.get(4928312240144123274L, strArr7));
                        sb2.append(interfaceC0608Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0608Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : MagicFactory.get(4928312192899483018L, strArr7));
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb2, MagicFactory.get(4928312291683730826L, strArr7), e2, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(19);
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg4 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg4.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928311741927916938L, strArr8));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928311432690271626L, strArr8), MagicFactory.get(4928311604488963466L, strArr8));
                c3452feyxiexzfUjhhgtg4.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf3.getClass();
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf3.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                MsgInfoBean msgInfoBean = new MsgInfoBean(c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2);
                for (InterfaceC0607Ujhhgtgfeyxiexzf interfaceC0607Ujhhgtgfeyxiexzf : C0475Ujhhgtgfeyxiexzf.f2388Ujhhgtgfeyxiexzf) {
                    try {
                        interfaceC0607Ujhhgtgfeyxiexzf.mo1872Ujhhgtgfeyxiexzf(msgInfoBean);
                    } catch (Exception e3) {
                        ArrayList arrayList4 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(MagicFactory.get(4928311411215435146L, strArr9));
                        sb3.append(interfaceC0607Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0607Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : MagicFactory.get(4928311368265762186L, strArr9));
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb3, MagicFactory.get(4928311467050009994L, strArr9), e3, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf4 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_msg_info, null, false);
                int i11 = R.id.moduleDialogCbMsgInfoTextClickInfo;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogCbMsgInfoTextClickInfo);
                if (materialCheckBox != null) {
                    i11 = R.id.moduleDialogCbMsgInfoTextContentStyle;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogCbMsgInfoTextContentStyle);
                    if (materialCheckBox2 != null) {
                        i11 = R.id.moduleDialogEdtMsgInfoDarkBgColor;
                        TextInputEditText textInputEditText15 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogEdtMsgInfoDarkBgColor);
                        if (textInputEditText15 != null) {
                            i11 = R.id.moduleDialogEdtMsgInfoDarkTextColor;
                            TextInputEditText textInputEditText16 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogEdtMsgInfoDarkTextColor);
                            if (textInputEditText16 != null) {
                                i11 = R.id.moduleDialogEdtMsgInfoFont;
                                TextInputEditText textInputEditText17 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogEdtMsgInfoFont);
                                if (textInputEditText17 != null) {
                                    i11 = R.id.moduleDialogEdtMsgInfoLeftMargin;
                                    TextInputEditText textInputEditText18 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogEdtMsgInfoLeftMargin);
                                    if (textInputEditText18 != null) {
                                        i11 = R.id.moduleDialogEdtMsgInfoLightBgColor;
                                        TextInputEditText textInputEditText19 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogEdtMsgInfoLightBgColor);
                                        if (textInputEditText19 != null) {
                                            i11 = R.id.moduleDialogEdtMsgInfoLightTextColor;
                                            TextInputEditText textInputEditText20 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogEdtMsgInfoLightTextColor);
                                            if (textInputEditText20 != null) {
                                                i11 = R.id.moduleDialogEdtMsgInfoRightMargin;
                                                TextInputEditText textInputEditText21 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogEdtMsgInfoRightMargin);
                                                if (textInputEditText21 != null) {
                                                    i11 = R.id.moduleDialogEdtMsgInfoTextFormat;
                                                    TextInputEditText textInputEditText22 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogEdtMsgInfoTextFormat);
                                                    if (textInputEditText22 != null) {
                                                        i11 = R.id.moduleDialogEdtMsgInfoTextPlaceholders;
                                                        MaterialTextView materialTextView2 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogEdtMsgInfoTextPlaceholders);
                                                        if (materialTextView2 != null) {
                                                            i11 = R.id.moduleDialogEdtMsgInfoTimeFormat;
                                                            TextInputEditText textInputEditText23 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogEdtMsgInfoTimeFormat);
                                                            if (textInputEditText23 != null) {
                                                                i11 = R.id.moduleDialogInputMsgInfoDarkBgColor;
                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogInputMsgInfoDarkBgColor)) != null) {
                                                                    i11 = R.id.moduleDialogInputMsgInfoDarkTextColor;
                                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogInputMsgInfoDarkTextColor)) != null) {
                                                                        i11 = R.id.moduleDialogInputMsgInfoFont;
                                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogInputMsgInfoFont)) != null) {
                                                                            i11 = R.id.moduleDialogInputMsgInfoLeftMargin;
                                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogInputMsgInfoLeftMargin)) != null) {
                                                                                i11 = R.id.moduleDialogInputMsgInfoLightBgColor;
                                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogInputMsgInfoLightBgColor)) != null) {
                                                                                    i11 = R.id.moduleDialogInputMsgInfoLightTextColor;
                                                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogInputMsgInfoLightTextColor)) != null) {
                                                                                        i11 = R.id.moduleDialogInputMsgInfoRightMargin;
                                                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogInputMsgInfoRightMargin)) != null) {
                                                                                            i11 = R.id.moduleDialogInputMsgInfoTextFormat;
                                                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogInputMsgInfoTextFormat)) != null) {
                                                                                                i11 = R.id.moduleDialogInputMsgInfoTimeFormat;
                                                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf4, R.id.moduleDialogInputMsgInfoTimeFormat)) != null) {
                                                                                                    C0312Ujhhgtgfeyxiexzf c0312Ujhhgtgfeyxiexzf = new C0312Ujhhgtgfeyxiexzf((LinearLayout) viewM2416Ujhhgtgfeyxiexzf4, materialCheckBox, materialCheckBox2, textInputEditText15, textInputEditText16, textInputEditText17, textInputEditText18, textInputEditText19, textInputEditText20, textInputEditText21, textInputEditText22, materialTextView2, textInputEditText23);
                                                                                                    textInputEditText19.setText(C0481Ujhhgtgfeyxiexzf.f2395Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                    textInputEditText20.setText(C0484Ujhhgtgfeyxiexzf.f2398Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                    textInputEditText15.setText(C0477Ujhhgtgfeyxiexzf.f2390Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                    textInputEditText16.setText(C0485Ujhhgtgfeyxiexzf.f2399Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                    textInputEditText22.setText(C0488Ujhhgtgfeyxiexzf.f2402Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                    textInputEditText23.setText(C0487Ujhhgtgfeyxiexzf.f2401Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                                    textInputEditText18.setText(String.valueOf(C0482Ujhhgtgfeyxiexzf.f2396Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
                                                                                                    textInputEditText21.setText(String.valueOf(C0483Ujhhgtgfeyxiexzf.f2397Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
                                                                                                    textInputEditText17.setText(String.valueOf(C0486Ujhhgtgfeyxiexzf.f2400Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
                                                                                                    materialCheckBox.setChecked(C0491Ujhhgtgfeyxiexzf.f2410Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                                                                                                    materialCheckBox2.setChecked(C0492Ujhhgtgfeyxiexzf.f2411Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                                                                                                    materialTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                                                                                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MagicFactory.get(4928401566873945482L, strArr10));
                                                                                                    for (String str2 : C0490Ujhhgtgfeyxiexzf.f2405Ujhhgtgfeyxiexzf) {
                                                                                                        int length2 = spannableStringBuilder2.length();
                                                                                                        spannableStringBuilder2.append((CharSequence) (str2 + ' '));
                                                                                                        spannableStringBuilder2.setSpan(new C2738Ujhhgtgfeyxiexzf(c0312Ujhhgtgfeyxiexzf, str2, 2), length2, spannableStringBuilder2.length() + (-1), 33);
                                                                                                    }
                                                                                                    materialTextView2.setText(spannableStringBuilder2);
                                                                                                    C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf4 = new C0290Ujhhgtgfeyxiexzf();
                                                                                                    C0490Ujhhgtgfeyxiexzf.f2404Ujhhgtgfeyxiexzf.getClass();
                                                                                                    c0290Ujhhgtgfeyxiexzf4.f1721Ujhhgtgfeyxiexzf = C0490Ujhhgtgfeyxiexzf.f2407Ujhhgtgfeyxiexzf;
                                                                                                    c0290Ujhhgtgfeyxiexzf4.f1723Ujhhgtgfeyxiexzf = c0312Ujhhgtgfeyxiexzf.f1854Ujhhgtgfeyxiexzf;
                                                                                                    c0290Ujhhgtgfeyxiexzf4.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928401635593422218L, strArr10), new C0350Ujhhgtgfeyxiexzf(3, c0312Ujhhgtgfeyxiexzf));
                                                                                                    c0290Ujhhgtgfeyxiexzf4.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928401622708520330L, strArr10), new C0478Ujhhgtgfeyxiexzf(0));
                                                                                                    C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf4, null, 3);
                                                                                                    c0290Ujhhgtgfeyxiexzf4.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
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
                throw new NullPointerException(MagicFactory.get(4928806728318846346L, strArr10).concat(viewM2416Ujhhgtgfeyxiexzf4.getResources().getResourceName(i11)));
            case Opcodes.LLOAD /* 22 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(i4);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(i6);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0317Ujhhgtgfeyxiexzf(i5);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg5 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf4 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg5);
                C0519Ujhhgtgfeyxiexzf.f2467Ujhhgtgfeyxiexzf.getClass();
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf4.m1654Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0489Ujhhgtgfeyxiexzf.f2403Ujhhgtgfeyxiexzf));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf4.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928556370380195210L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                c3452feyxiexzfUjhhgtg5.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf4;
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg5 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg5.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928556181401634186L, strArr11));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf7 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf7.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928552569334138250L, strArr11), MagicFactory.get(4928556039667713418L, strArr11));
                c3456feyxiexzfUjhhgtg5.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf7;
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg6 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf5 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg6);
                C0519Ujhhgtgfeyxiexzf.f2467Ujhhgtgfeyxiexzf.getClass();
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf5.m1654Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0489Ujhhgtgfeyxiexzf.f2403Ujhhgtgfeyxiexzf));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf5.m1656Ujhhgtgfeyxiexzf(new C0682Ujhhgtgfeyxiexzf(2, 3, 1));
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf5.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928556220056339850L, strArr12), MagicFactory.get(4928556297365751178L, strArr12), MagicFactory.get(4928556400444966282L, strArr12));
                c3452feyxiexzfUjhhgtg6.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf5;
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                ArrayList arrayList5 = new ArrayList();
                String[] strArr13 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                Cursor cursorM4894Ujhhgtgfeyxiexzf = C3382feyxiexzfUjhhgtg.m4894Ujhhgtgfeyxiexzf(MagicFactory.get(4928845288535229834L, strArr13));
                if (cursorM4894Ujhhgtgfeyxiexzf != null) {
                    while (cursorM4894Ujhhgtgfeyxiexzf.moveToNext()) {
                        try {
                            arrayList5.add(cursorM4894Ujhhgtgfeyxiexzf.getString(0));
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursorM4894Ujhhgtgfeyxiexzf, th3);
                                throw th4;
                            }
                        }
                    }
                    cursorM4894Ujhhgtgfeyxiexzf.close();
                }
                C3722Ujhhgtgfeyxiexzf c3722Ujhhgtgfeyxiexzf = C3722Ujhhgtgfeyxiexzf.f11772Ujhhgtgfeyxiexzf;
                String[] strArr14 = (String[]) arrayList5.toArray(new String[0]);
                String str3 = MagicFactory.get(4928845413089281418L, strArr13);
                c3722Ujhhgtgfeyxiexzf.getClass();
                C3722Ujhhgtgfeyxiexzf.m5385feyxiexzfUjhhgtg(str3, strArr14);
                return c1943Ujhhgtgfeyxiexzf;
            default:
                ArrayList arrayList6 = new ArrayList();
                String[] strArr15 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                Cursor cursorM4894Ujhhgtgfeyxiexzf2 = C3382feyxiexzfUjhhgtg.m4894Ujhhgtgfeyxiexzf(MagicFactory.get(4928846070219277706L, strArr15));
                if (cursorM4894Ujhhgtgfeyxiexzf2 != null) {
                    while (cursorM4894Ujhhgtgfeyxiexzf2.moveToNext()) {
                        try {
                            arrayList6.add(cursorM4894Ujhhgtgfeyxiexzf2.getString(0));
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursorM4894Ujhhgtgfeyxiexzf2, th5);
                                throw th6;
                            }
                        }
                    }
                    cursorM4894Ujhhgtgfeyxiexzf2.close();
                }
                C3722Ujhhgtgfeyxiexzf c3722Ujhhgtgfeyxiexzf2 = C3722Ujhhgtgfeyxiexzf.f11772Ujhhgtgfeyxiexzf;
                String[] strArr16 = (String[]) arrayList6.toArray(new String[0]);
                String str4 = MagicFactory.get(4928845095261701514L, strArr15);
                c3722Ujhhgtgfeyxiexzf2.getClass();
                C3722Ujhhgtgfeyxiexzf.m5385feyxiexzfUjhhgtg(str4, strArr16);
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
