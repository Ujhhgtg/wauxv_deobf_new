package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱᛴᛲ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2692Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8589Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2692Ujhhgtgfeyxiexzf(int i) {
        this.f8589Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        boolean zM4512Ujhhgtgfeyxiexzf;
        C2717feyxiexzfUjhhgtg c2717feyxiexzfUjhhgtg;
        C2717feyxiexzfUjhhgtg c2717feyxiexzfUjhhgtg2;
        C2717feyxiexzfUjhhgtg c2717feyxiexzfUjhhgtg3;
        boolean zIsAssignableFrom;
        Object c0919feyxiexzfUjhhgtg3;
        Object c0919feyxiexzfUjhhgtg4;
        Object c0919feyxiexzfUjhhgtg5;
        Object objM1649Ujhhgtgfeyxiexzf;
        Object c0919feyxiexzfUjhhgtg6;
        int i = this.f8589Ujhhgtgfeyxiexzf;
        int i2 = 8;
        int i3 = 2;
        boolean zBooleanValue = true;
        C2717feyxiexzfUjhhgtg c2717feyxiexzfUjhhgtg4 = null;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2692Ujhhgtgfeyxiexzf(4));
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.fav.ui");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf.m1660feyxiexzfUjhhgtg("onItemClick");
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg("onItemClick", (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7370Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7350Ujhhgtgfeyxiexzf)) ? "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC$initOnItemClickListener$1" : "com/tencent/mm/plugin/fav/ui/FavSearchUI$10");
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1851Ujhhgtgfeyxiexzf();
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                View view = (View) c0919feyxiexzfUjhhgtg;
                Object tag = view.getTag();
                int i4 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(tag).m2021Ujhhgtgfeyxiexzf();
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "a";
                Object objM4938Ujhhgtgfeyxiexzf = ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4938Ujhhgtgfeyxiexzf();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "d";
                Object objM4938Ujhhgtgfeyxiexzf2 = ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf();
                if (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7370Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7350Ujhhgtgfeyxiexzf)) {
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4938Ujhhgtgfeyxiexzf2).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "w";
                    zBooleanValue = ((Boolean) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).booleanValue();
                } else {
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4938Ujhhgtgfeyxiexzf2).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "d";
                    if (((Number) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).intValue() != 1) {
                        zBooleanValue = false;
                    }
                }
                if (zBooleanValue) {
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4938Ujhhgtgfeyxiexzf).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "field_type";
                    if (((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4)).m4939Ujhhgtgfeyxiexzf()).intValue() == 3) {
                        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4938Ujhhgtgfeyxiexzf).m2021Ujhhgtgfeyxiexzf();
                        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5.f1479Ujhhgtgfeyxiexzf = "field_favProto";
                        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5)).m4938Ujhhgtgfeyxiexzf()).m2024Ujhhgtgfeyxiexzf();
                        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "getData";
                        byte[] bArr = (byte[]) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                        C0858feyxiexzfUjhhgtg c0858feyxiexzfUjhhgtg = C0858feyxiexzfUjhhgtg.f3350Ujhhgtgfeyxiexzf;
                        c0858feyxiexzfUjhhgtg.getClass();
                        final C3407Ujhhgtgfeyxiexzf c3407Ujhhgtgfeyxiexzf = ((C3408Ujhhgtgfeyxiexzf) c0858feyxiexzfUjhhgtg.m2263Ujhhgtgfeyxiexzf(C3408Ujhhgtgfeyxiexzf.Companion.serializer(), bArr)).f10625Ujhhgtgfeyxiexzf;
                        final String string = c3407Ujhhgtgfeyxiexzf.f10623Ujhhgtgfeyxiexzf;
                        String str = c3407Ujhhgtgfeyxiexzf.f10622Ujhhgtgfeyxiexzf;
                        if (string == null) {
                            String strM5237Ujhhgtgfeyxiexzf = AbstractC3612feyxiexzfUjhhgtg.m5237Ujhhgtgfeyxiexzf();
                            String strValueOf = String.valueOf(str.hashCode() & 255);
                            StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(strM5237Ujhhgtgfeyxiexzf);
                            sbM2707Ujhhgtgfeyxiexzf.append("/favorite/");
                            sbM2707Ujhhgtgfeyxiexzf.append(strValueOf);
                            sbM2707Ujhhgtgfeyxiexzf.append('/');
                            sbM2707Ujhhgtgfeyxiexzf.append(str);
                            sbM2707Ujhhgtgfeyxiexzf.append('.');
                            sbM2707Ujhhgtgfeyxiexzf.append(c3407Ujhhgtgfeyxiexzf.f10619Ujhhgtgfeyxiexzf);
                            string = sbM2707Ujhhgtgfeyxiexzf.toString();
                        }
                        if (new File(string).exists()) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                            builder.setTitle("提示");
                            builder.setMessage("是否发送收藏语音");
                            String str2 = "发送";
                            final Object[] objArr = null == true ? 1 : 0;
                            builder.setPositiveButton(str2, new DialogInterface.OnClickListener() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ要点脸
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) throws IllegalAccessException, IOException, InvocationTargetException {
                                    switch (objArr) {
                                        case 0:
                                            C1983Ujhhgtgfeyxiexzf.f6549Ujhhgtgfeyxiexzf.getClass();
                                            C0452Ujhhgtgfeyxiexzf.m1783Ujhhgtgfeyxiexzf(c3407Ujhhgtgfeyxiexzf.f10618Ujhhgtgfeyxiexzf, C1983Ujhhgtgfeyxiexzf.f6550Ujhhgtgfeyxiexzf, string);
                                            AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "已发送");
                                            break;
                                        default:
                                            C1983Ujhhgtgfeyxiexzf.f6549Ujhhgtgfeyxiexzf.getClass();
                                            C0452Ujhhgtgfeyxiexzf.m1783Ujhhgtgfeyxiexzf(c3407Ujhhgtgfeyxiexzf.f10618Ujhhgtgfeyxiexzf, C1983Ujhhgtgfeyxiexzf.f6550Ujhhgtgfeyxiexzf, string);
                                            AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "已发送");
                                            break;
                                    }
                                }
                            });
                            builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                            builder.show();
                        } else {
                            AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "获取语音路径失败, 请尝试播放后重发");
                        }
                        c0578Ujhhgtgfeyxiexzf.m1853Ujhhgtgfeyxiexzf(null);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("MicroMsg.FavSendFilter", "[FAV_ITEM_TYPE_VOICE] canFilterVoice = true, back");
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg2 = null;
                }
                View view2 = (View) c0919feyxiexzfUjhhgtg2;
                Object tag2 = view2.getTag();
                int i5 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(tag2).m2021Ujhhgtgfeyxiexzf();
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6.f1479Ujhhgtgfeyxiexzf = "a";
                Object objM4938Ujhhgtgfeyxiexzf3 = ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6)).m4938Ujhhgtgfeyxiexzf();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf7 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4938Ujhhgtgfeyxiexzf3).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf7.f1479Ujhhgtgfeyxiexzf = "field_type";
                if (((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf7)).m4939Ujhhgtgfeyxiexzf()).intValue() == 3) {
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf8 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4938Ujhhgtgfeyxiexzf3).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf8.f1479Ujhhgtgfeyxiexzf = "field_favProto";
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf8)).m4938Ujhhgtgfeyxiexzf()).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "getData";
                    byte[] bArr2 = (byte[]) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                    C0858feyxiexzfUjhhgtg c0858feyxiexzfUjhhgtg2 = C0858feyxiexzfUjhhgtg.f3350Ujhhgtgfeyxiexzf;
                    c0858feyxiexzfUjhhgtg2.getClass();
                    final C3407Ujhhgtgfeyxiexzf c3407Ujhhgtgfeyxiexzf2 = ((C3408Ujhhgtgfeyxiexzf) c0858feyxiexzfUjhhgtg2.m2263Ujhhgtgfeyxiexzf(C3408Ujhhgtgfeyxiexzf.Companion.serializer(), bArr2)).f10625Ujhhgtgfeyxiexzf;
                    final String string2 = c3407Ujhhgtgfeyxiexzf2.f10623Ujhhgtgfeyxiexzf;
                    String str3 = c3407Ujhhgtgfeyxiexzf2.f10622Ujhhgtgfeyxiexzf;
                    if (string2 == null) {
                        String strM5237Ujhhgtgfeyxiexzf2 = AbstractC3612feyxiexzfUjhhgtg.m5237Ujhhgtgfeyxiexzf();
                        String strValueOf2 = String.valueOf(str3.hashCode() & 255);
                        StringBuilder sbM2707Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(strM5237Ujhhgtgfeyxiexzf2);
                        sbM2707Ujhhgtgfeyxiexzf2.append("/favorite/");
                        sbM2707Ujhhgtgfeyxiexzf2.append(strValueOf2);
                        sbM2707Ujhhgtgfeyxiexzf2.append('/');
                        sbM2707Ujhhgtgfeyxiexzf2.append(str3);
                        sbM2707Ujhhgtgfeyxiexzf2.append('.');
                        sbM2707Ujhhgtgfeyxiexzf2.append(c3407Ujhhgtgfeyxiexzf2.f10619Ujhhgtgfeyxiexzf);
                        string2 = sbM2707Ujhhgtgfeyxiexzf2.toString();
                    }
                    if (new File(string2).exists()) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(view2.getContext());
                        builder2.setTitle("提示");
                        builder2.setMessage("是否发送收藏语音");
                        String str4 = "发送";
                        final char c = 1 == true ? 1 : 0;
                        builder2.setPositiveButton(str4, new DialogInterface.OnClickListener() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ要点脸
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i6) throws IllegalAccessException, IOException, InvocationTargetException {
                                switch (c) {
                                    case 0:
                                        C1983Ujhhgtgfeyxiexzf.f6549Ujhhgtgfeyxiexzf.getClass();
                                        C0452Ujhhgtgfeyxiexzf.m1783Ujhhgtgfeyxiexzf(c3407Ujhhgtgfeyxiexzf2.f10618Ujhhgtgfeyxiexzf, C1983Ujhhgtgfeyxiexzf.f6550Ujhhgtgfeyxiexzf, string2);
                                        AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "已发送");
                                        break;
                                    default:
                                        C1983Ujhhgtgfeyxiexzf.f6549Ujhhgtgfeyxiexzf.getClass();
                                        C0452Ujhhgtgfeyxiexzf.m1783Ujhhgtgfeyxiexzf(c3407Ujhhgtgfeyxiexzf2.f10618Ujhhgtgfeyxiexzf, C1983Ujhhgtgfeyxiexzf.f6550Ujhhgtgfeyxiexzf, string2);
                                        AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "已发送");
                                        break;
                                }
                            }
                        });
                        builder2.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                        builder2.show();
                    } else {
                        AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, "获取语音路径失败, 请尝试播放后重发");
                    }
                    c0578Ujhhgtgfeyxiexzf2.m1853Ujhhgtgfeyxiexzf(null);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(7);
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2692Ujhhgtgfeyxiexzf(i2));
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = (C0394Ujhhgtgfeyxiexzf) obj;
                c0394Ujhhgtgfeyxiexzf2.m1654Ujhhgtgfeyxiexzf(C2724feyxiexzfUjhhgtg.f8678Ujhhgtgfeyxiexzf.m4033feyxiexzfUjhhgtg());
                Class<Boolean> cls = Boolean.class;
                Class<Boolean> clsM2695Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2695Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf2, Void.TYPE, cls);
                if (clsM2695Ujhhgtgfeyxiexzf == null) {
                    clsM2695Ujhhgtgfeyxiexzf = cls;
                }
                Class<Boolean> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                c0394Ujhhgtgfeyxiexzf2.m1657Ujhhgtgfeyxiexzf(clsM2695Ujhhgtgfeyxiexzf, clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : Boolean.class);
                C0300Ujhhgtgfeyxiexzf c0300Ujhhgtgfeyxiexzf = new C0300Ujhhgtgfeyxiexzf();
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = new C0394Ujhhgtgfeyxiexzf();
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg("MicroMsg.ChatFooter", "this is a quote msg");
                c0300Ujhhgtgfeyxiexzf.m1528Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf3);
                c0394Ujhhgtgfeyxiexzf2.f2141Ujhhgtgfeyxiexzf = c0300Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                Object obj2 = ((List) obj).get(0);
                C0479Ujhhgtgfeyxiexzf.f2392Ujhhgtgfeyxiexzf.getClass();
                zM4512Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj2, AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0498Ujhhgtgfeyxiexzf.f2425Ujhhgtgfeyxiexzf));
                break;
            case 10:
                Object objM1849Ujhhgtgfeyxiexzf = ((C0578Ujhhgtgfeyxiexzf) obj).m1849Ujhhgtgfeyxiexzf();
                FrameLayout frameLayout = (FrameLayout) (objM1849Ujhhgtgfeyxiexzf instanceof FrameLayout ? objM1849Ujhhgtgfeyxiexzf : null);
                if (frameLayout == null) {
                    Class<FrameLayout> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(FrameLayout.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : FrameLayout.class).getName()).toString());
                }
                for (InterfaceC0616Ujhhgtgfeyxiexzf interfaceC0616Ujhhgtgfeyxiexzf : C2705feyxiexzfUjhhgtg.f8635Ujhhgtgfeyxiexzf) {
                    try {
                        ((C2764feyxiexzfUjhhgtg) interfaceC0616Ujhhgtgfeyxiexzf).m4047feyxiexzfUjhhgtg(frameLayout);
                    } catch (Exception e) {
                        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb = new StringBuilder();
                        String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        sb.append("onInit ");
                        sb.append(interfaceC0616Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0616Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : "LoadHook");
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb, " Failed", e, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_chat_group_tab, null, false);
                int i6 = R.id.moduleDialogEdtChatGroupTabIndicatorDarkColor;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtChatGroupTabIndicatorDarkColor);
                if (textInputEditText != null) {
                    i6 = R.id.moduleDialogEdtChatGroupTabIndicatorLightColor;
                    TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtChatGroupTabIndicatorLightColor);
                    if (textInputEditText2 != null) {
                        i6 = R.id.moduleDialogEdtChatGroupTabNormalDarkColor;
                        TextInputEditText textInputEditText3 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtChatGroupTabNormalDarkColor);
                        if (textInputEditText3 != null) {
                            i6 = R.id.moduleDialogEdtChatGroupTabNormalLightColor;
                            TextInputEditText textInputEditText4 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtChatGroupTabNormalLightColor);
                            if (textInputEditText4 != null) {
                                i6 = R.id.moduleDialogEdtChatGroupTabSelectedDarkColor;
                                TextInputEditText textInputEditText5 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtChatGroupTabSelectedDarkColor);
                                if (textInputEditText5 != null) {
                                    i6 = R.id.moduleDialogEdtChatGroupTabSelectedLightColor;
                                    TextInputEditText textInputEditText6 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtChatGroupTabSelectedLightColor);
                                    if (textInputEditText6 != null) {
                                        i6 = R.id.moduleDialogEdtChatGroupTabTabDarkColor;
                                        TextInputEditText textInputEditText7 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtChatGroupTabTabDarkColor);
                                        if (textInputEditText7 != null) {
                                            i6 = R.id.moduleDialogEdtChatGroupTabTabLightColor;
                                            TextInputEditText textInputEditText8 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtChatGroupTabTabLightColor);
                                            if (textInputEditText8 != null) {
                                                i6 = R.id.moduleDialogInputChatGroupTabIndicatorDarkColor;
                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputChatGroupTabIndicatorDarkColor)) != null) {
                                                    i6 = R.id.moduleDialogInputChatGroupTabIndicatorLightColor;
                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputChatGroupTabIndicatorLightColor)) != null) {
                                                        i6 = R.id.moduleDialogInputChatGroupTabNormalDarkColor;
                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputChatGroupTabNormalDarkColor)) != null) {
                                                            i6 = R.id.moduleDialogInputChatGroupTabNormalLightColor;
                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputChatGroupTabNormalLightColor)) != null) {
                                                                i6 = R.id.moduleDialogInputChatGroupTabSelectedDarkColor;
                                                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputChatGroupTabSelectedDarkColor)) != null) {
                                                                    i6 = R.id.moduleDialogInputChatGroupTabSelectedLightColor;
                                                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputChatGroupTabSelectedLightColor)) != null) {
                                                                        i6 = R.id.moduleDialogInputChatGroupTabTabDarkColor;
                                                                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputChatGroupTabTabDarkColor)) != null) {
                                                                            i6 = R.id.moduleDialogInputChatGroupTabTabLightColor;
                                                                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputChatGroupTabTabLightColor)) != null) {
                                                                                LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                                                                                C0329Ujhhgtgfeyxiexzf c0329Ujhhgtgfeyxiexzf = new C0329Ujhhgtgfeyxiexzf(linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, 0);
                                                                                textInputEditText8.setText(C2748feyxiexzfUjhhgtg.f8719Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText2.setText(C2716feyxiexzfUjhhgtg.f8659Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText4.setText(C2743Ujhhgtgfeyxiexzf.f8714Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText6.setText(C2745feyxiexzfUjhhgtg.f8716Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText7.setText(C2747Ujhhgtgfeyxiexzf.f8718Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText.setText(C2713feyxiexzfUjhhgtg.f8656Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText3.setText(C2715feyxiexzfUjhhgtg.f8658Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                textInputEditText5.setText(C2744Ujhhgtgfeyxiexzf.f8715Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                                                                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                                                                                C2726Ujhhgtgfeyxiexzf.f8680Ujhhgtgfeyxiexzf.getClass();
                                                                                c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C2726Ujhhgtgfeyxiexzf.f8683Ujhhgtgfeyxiexzf;
                                                                                c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                                                                                c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf("保存", new C2977Ujhhgtgfeyxiexzf(8, c0329Ujhhgtgfeyxiexzf));
                                                                                c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf("重置", new C2975feyxiexzfUjhhgtg(17));
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
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i6)));
            case Opcodes.FCONST_1 /* 12 */:
                Context context = ((View) obj).getContext();
                C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = new C0416Ujhhgtgfeyxiexzf(context, C2730Ujhhgtgfeyxiexzf.f8692Ujhhgtgfeyxiexzf);
                C2726Ujhhgtgfeyxiexzf.f8680Ujhhgtgfeyxiexzf.getClass();
                c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf = C2726Ujhhgtgfeyxiexzf.f8683Ujhhgtgfeyxiexzf;
                c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(context);
                c0416Ujhhgtgfeyxiexzf.m1712Ujhhgtgfeyxiexzf().m4550feyxiexzfUjhhgtg();
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(16);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C0330Ujhhgtgfeyxiexzf c0330Ujhhgtgfeyxiexzf = (C0330Ujhhgtgfeyxiexzf) obj;
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                C0629Ujhhgtgfeyxiexzf.f2673Ujhhgtgfeyxiexzf.getClass();
                List listM1907Ujhhgtgfeyxiexzf = C0629Ujhhgtgfeyxiexzf.m1907Ujhhgtgfeyxiexzf();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : listM1907Ujhhgtgfeyxiexzf) {
                    if (((C0627Ujhhgtgfeyxiexzf) obj3).f2660Ujhhgtgfeyxiexzf) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC2856feyxiexzfUjhhgtg.m4248feyxiexzfUjhhgtg(arrayList2, new C2419Ujhhgtgfeyxiexzf(2)));
                C0976feyxiexzfUjhhgtg c0976feyxiexzfUjhhgtg = new C0976feyxiexzfUjhhgtg();
                c0976feyxiexzfUjhhgtg.f3870Ujhhgtgfeyxiexzf = new C2717feyxiexzfUjhhgtg(new C2702feyxiexzfUjhhgtg(arrayList3, c0976feyxiexzfUjhhgtg, c0330Ujhhgtgfeyxiexzf, 0), new C2702feyxiexzfUjhhgtg(arrayList3, c0976feyxiexzfUjhhgtg, c0330Ujhhgtgfeyxiexzf, 1));
                RecyclerView recyclerView = c0330Ujhhgtgfeyxiexzf.f1948Ujhhgtgfeyxiexzf;
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                Object obj4 = c0976feyxiexzfUjhhgtg.f3870Ujhhgtgfeyxiexzf;
                if (obj4 == null) {
                    "adapter";
                    c2717feyxiexzfUjhhgtg = null;
                } else {
                    c2717feyxiexzfUjhhgtg = (C2717feyxiexzfUjhhgtg) obj4;
                }
                recyclerView.setAdapter(c2717feyxiexzfUjhhgtg);
                recyclerView.setItemAnimator(null);
                Object obj5 = c0976feyxiexzfUjhhgtg.f3870Ujhhgtgfeyxiexzf;
                if (obj5 == null) {
                    "adapter";
                    c2717feyxiexzfUjhhgtg2 = null;
                } else {
                    c2717feyxiexzfUjhhgtg2 = (C2717feyxiexzfUjhhgtg) obj5;
                }
                c2717feyxiexzfUjhhgtg2.m4032Ujhhgtgfeyxiexzf(arrayList3);
                C2726Ujhhgtgfeyxiexzf c2726Ujhhgtgfeyxiexzf = C2726Ujhhgtgfeyxiexzf.f8680Ujhhgtgfeyxiexzf;
                Object obj6 = c0976feyxiexzfUjhhgtg.f3870Ujhhgtgfeyxiexzf;
                if (obj6 == null) {
                    "adapter";
                    c2717feyxiexzfUjhhgtg3 = null;
                } else {
                    c2717feyxiexzfUjhhgtg3 = (C2717feyxiexzfUjhhgtg) obj6;
                }
                c2726Ujhhgtgfeyxiexzf.getClass();
                C2726Ujhhgtgfeyxiexzf.m4035feyxiexzfUjhhgtg(c0330Ujhhgtgfeyxiexzf, arrayList3, c2717feyxiexzfUjhhgtg3);
                c0330Ujhhgtgfeyxiexzf.f1946Ujhhgtgfeyxiexzf.setOnClickListener(new ViewOnClickListenerC2701feyxiexzfUjhhgtg(c0330Ujhhgtgfeyxiexzf, c0976feyxiexzfUjhhgtg, arrayList3));
                Object obj7 = c0976feyxiexzfUjhhgtg.f3870Ujhhgtgfeyxiexzf;
                if (obj7 == null) {
                    "adapter";
                } else {
                    c2717feyxiexzfUjhhgtg4 = (C2717feyxiexzfUjhhgtg) obj7;
                }
                new C0708Ujhhgtgfeyxiexzf(new C2718feyxiexzfUjhhgtg(c2717feyxiexzfUjhhgtg4, arrayList3, new C2706feyxiexzfUjhhgtg(arrayList3, c0976feyxiexzfUjhhgtg, c0330Ujhhgtgfeyxiexzf, i3), null == true ? 1 : 0)).m2001Ujhhgtgfeyxiexzf(c0330Ujhhgtgfeyxiexzf.f1948Ujhhgtgfeyxiexzf);
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf3);
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.f10724Ujhhgtgfeyxiexzf = "com.tencent.mm.ui.conversation.ConversationListView";
                ListView listView = (ListView) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf3);
                AbstractC2862feyxiexzfUjhhgtg.m4267feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3.f1482Ujhhgtgfeyxiexzf, (EnumC0283Ujhhgtgfeyxiexzf[]) Arrays.copyOf(new EnumC0283Ujhhgtgfeyxiexzf[]{EnumC0283Ujhhgtgfeyxiexzf.FINAL}, 1));
                Object obj8 = null;
                Object[] objArr2 = false;
                for (Object obj9 : c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf()) {
                    Object objM4938Ujhhgtgfeyxiexzf4 = ((C3438feyxiexzfUjhhgtg) obj9).m4938Ujhhgtgfeyxiexzf();
                    if (objM4938Ujhhgtgfeyxiexzf4 == null) {
                        zIsAssignableFrom = false;
                    } else {
                        C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(objM4938Ujhhgtgfeyxiexzf4.getClass());
                        C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf2 = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(BaseAdapter.class);
                        ConcurrentHashMap concurrentHashMap = AbstractC2842feyxiexzfUjhhgtg.f9028Ujhhgtgfeyxiexzf;
                        zIsAssignableFrom = c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf2.mo2998Ujhhgtgfeyxiexzf().isAssignableFrom(c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf.mo2998Ujhhgtgfeyxiexzf());
                    }
                    if (zIsAssignableFrom) {
                        if (objArr2 == true) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        obj8 = obj9;
                        objArr2 = true;
                    }
                }
                if (objArr2 != true) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                C2550feyxiexzfUjhhgtg c2550feyxiexzfUjhhgtg = new C2550feyxiexzfUjhhgtg((BaseAdapter) ((C3438feyxiexzfUjhhgtg) obj8).m4939Ujhhgtgfeyxiexzf(), 2, listView);
                C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = new C1981Ujhhgtgfeyxiexzf(AbstractC3377Ujhhgtgfeyxiexzf.m4880Ujhhgtgfeyxiexzf(AbstractC3590Ujhhgtgfeyxiexzf.m5119Ujhhgtgfeyxiexzf(listView.getContext())), null, R.attr.tabStyle);
                c1981Ujhhgtgfeyxiexzf.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                C2726Ujhhgtgfeyxiexzf.f8680Ujhhgtgfeyxiexzf.getClass();
                C2726Ujhhgtgfeyxiexzf.m4034feyxiexzfUjhhgtg(c1981Ujhhgtgfeyxiexzf);
                C2729Ujhhgtgfeyxiexzf c2729Ujhhgtgfeyxiexzf = new C2729Ujhhgtgfeyxiexzf(0, c2550feyxiexzfUjhhgtg);
                ArrayList arrayList4 = c1981Ujhhgtgfeyxiexzf.f6542feyxiexzfUjhhgtg;
                if (!arrayList4.contains(c2729Ujhhgtgfeyxiexzf)) {
                    arrayList4.add(c2729Ujhhgtgfeyxiexzf);
                }
                C2726Ujhhgtgfeyxiexzf.m4038feyxiexzfUjhhgtg(c1981Ujhhgtgfeyxiexzf, c2550feyxiexzfUjhhgtg);
                C2726Ujhhgtgfeyxiexzf.f8681Ujhhgtgfeyxiexzf.put(Integer.valueOf(System.identityHashCode(c1981Ujhhgtgfeyxiexzf)), new C2707feyxiexzfUjhhgtg(c1981Ujhhgtgfeyxiexzf, c2550feyxiexzfUjhhgtg));
                c1981Ujhhgtgfeyxiexzf.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg(1, c1981Ujhhgtgfeyxiexzf));
                listView.addHeaderView(c1981Ujhhgtgfeyxiexzf);
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg2);
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                C0394Ujhhgtgfeyxiexzf.m1652Ujhhgtgfeyxiexzf(c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf, "com.tencent.mm.ui.conversation.MainUI");
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg("MicroMsg.MainUI", "onTabCreate, %d");
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C2740feyxiexzfUjhhgtg c2740feyxiexzfUjhhgtg = C2740feyxiexzfUjhhgtg.f8706Ujhhgtgfeyxiexzf;
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_chat_input_hint, null, false);
                int i8 = R.id.moduleDialogCbChatInputHintHandleSendCount;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogCbChatInputHintHandleSendCount);
                if (materialCheckBox != null) {
                    i8 = R.id.moduleDialogEdtChatInputHintTip;
                    TextInputEditText textInputEditText9 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtChatInputHintTip);
                    if (textInputEditText9 != null) {
                        i8 = R.id.moduleDialogInputChatInputHintTip;
                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputChatInputHintTip)) != null) {
                            i8 = R.id.moduleDialogTvChatInputHintPreview;
                            MaterialTextView materialTextView = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogTvChatInputHintPreview);
                            if (materialTextView != null) {
                                i8 = R.id.moduleDialogTvChatInputHintTextPlaceholders;
                                MaterialTextView materialTextView2 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogTvChatInputHintTextPlaceholders);
                                if (materialTextView2 != null) {
                                    C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf = new C0701Ujhhgtgfeyxiexzf((LinearLayout) viewM2416Ujhhgtgfeyxiexzf2, materialCheckBox, textInputEditText9, materialTextView, materialTextView2);
                                    C2732feyxiexzfUjhhgtg c2732feyxiexzfUjhhgtg = C2732feyxiexzfUjhhgtg.f8694Ujhhgtgfeyxiexzf;
                                    String strM4623Ujhhgtgfeyxiexzf = c2732feyxiexzfUjhhgtg.m4623Ujhhgtgfeyxiexzf();
                                    c2740feyxiexzfUjhhgtg.getClass();
                                    materialTextView.setText(C2740feyxiexzfUjhhgtg.m4046feyxiexzfUjhhgtg(strM4623Ujhhgtgfeyxiexzf));
                                    textInputEditText9.setText(c2732feyxiexzfUjhhgtg.m4623Ujhhgtgfeyxiexzf());
                                    textInputEditText9.addTextChangedListener(new C2737Ujhhgtgfeyxiexzf(null == true ? 1 : 0, c0701Ujhhgtgfeyxiexzf));
                                    materialCheckBox.setChecked(C2736feyxiexzfUjhhgtg.f8698Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                                    materialTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击占位符自动添加以下字段:\n");
                                    for (String str5 : C2740feyxiexzfUjhhgtg.f8707Ujhhgtgfeyxiexzf) {
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append((CharSequence) (str5 + ' '));
                                        spannableStringBuilder.setSpan(new C2738Ujhhgtgfeyxiexzf(c0701Ujhhgtgfeyxiexzf, str5, 0), length, spannableStringBuilder.length() - 1, 33);
                                    }
                                    materialTextView2.setText(spannableStringBuilder);
                                    C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                                    c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = C2740feyxiexzfUjhhgtg.f8709Ujhhgtgfeyxiexzf;
                                    c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = c0701Ujhhgtgfeyxiexzf.f2875Ujhhgtgfeyxiexzf;
                                    c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf("保存", new C2977Ujhhgtgfeyxiexzf(10, c0701Ujhhgtgfeyxiexzf));
                                    c0290Ujhhgtgfeyxiexzf2.m1501Ujhhgtgfeyxiexzf("重置", new C2975feyxiexzfUjhhgtg(18));
                                    C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                                    c0290Ujhhgtgfeyxiexzf2.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                    return c1943Ujhhgtgfeyxiexzf;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM2416Ujhhgtgfeyxiexzf2.getResources().getResourceName(i8)));
            case Opcodes.LDC /* 18 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(19);
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg3);
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1654Ujhhgtgfeyxiexzf(C2724feyxiexzfUjhhgtg.f8678Ujhhgtgfeyxiexzf.m4033feyxiexzfUjhhgtg());
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg("MicroMsg.ChatFooter", "canSend true ! sendBtn is visible");
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf4.getClass();
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                Boolean bool = (Boolean) (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg3);
                if (!(bool != null ? bool.booleanValue() : false)) {
                    int i9 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0578Ujhhgtgfeyxiexzf4.m1849Ujhhgtgfeyxiexzf()).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "setHint";
                    C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.m1635Ujhhgtgfeyxiexzf());
                    C2740feyxiexzfUjhhgtg c2740feyxiexzfUjhhgtg2 = C2740feyxiexzfUjhhgtg.f8706Ujhhgtgfeyxiexzf;
                    String strM4623Ujhhgtgfeyxiexzf2 = C2732feyxiexzfUjhhgtg.f8694Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf();
                    c2740feyxiexzfUjhhgtg2.getClass();
                    c0393Ujhhgtgfeyxiexzf.m1649Ujhhgtgfeyxiexzf(C2740feyxiexzfUjhhgtg.m4046feyxiexzfUjhhgtg(strM4623Ujhhgtgfeyxiexzf2));
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(26);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(25);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf5 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf5.getClass();
                try {
                    c0919feyxiexzfUjhhgtg4 = c0578Ujhhgtgfeyxiexzf5.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg4 == null) {
                        c0919feyxiexzfUjhhgtg4 = null;
                    }
                } catch (Throwable th4) {
                    c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th4);
                }
                Object obj10 = c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg4;
                int i10 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf9 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj10).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf9.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Context.class);
                AbstractC3590Ujhhgtgfeyxiexzf.m5133Ujhhgtgfeyxiexzf((Context) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf9.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf());
                C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = new C2065feyxiexzfUjhhgtg(new C2739feyxiexzfUjhhgtg(null == true ? 1 : 0, obj10));
                try {
                    c0919feyxiexzfUjhhgtg5 = c0578Ujhhgtgfeyxiexzf5.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg5 == null) {
                        c0919feyxiexzfUjhhgtg5 = null;
                    }
                } catch (Throwable th5) {
                    c0919feyxiexzfUjhhgtg5 = new C0919feyxiexzfUjhhgtg(th5);
                }
                Object tag3 = ((View) (c0919feyxiexzfUjhhgtg5 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg5)).getTag();
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(tag3).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE);
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m4862Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m1306Ujhhgtgfeyxiexzf();
                Integer num = (Integer) ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m1635Ujhhgtgfeyxiexzf())).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                if (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7386Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7366Ujhhgtgfeyxiexzf)) {
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(tag3).m2024Ujhhgtgfeyxiexzf();
                    C0479Ujhhgtgfeyxiexzf.f2392Ujhhgtgfeyxiexzf.getClass();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5.f2121feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0498Ujhhgtgfeyxiexzf.f2425Ujhhgtgfeyxiexzf);
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5.f10481Ujhhgtgfeyxiexzf = 0;
                    objM1649Ujhhgtgfeyxiexzf = ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5)).m1649Ujhhgtgfeyxiexzf(new Object[0]);
                } else {
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf10 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(tag3).m2021Ujhhgtgfeyxiexzf();
                    C0479Ujhhgtgfeyxiexzf.f2392Ujhhgtgfeyxiexzf.getClass();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf10.f10724Ujhhgtgfeyxiexzf = AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0498Ujhhgtgfeyxiexzf.f2425Ujhhgtgfeyxiexzf);
                    objM1649Ujhhgtgfeyxiexzf = ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf10)).m4938Ujhhgtgfeyxiexzf();
                }
                MsgInfoBean msgInfoBean = new MsgInfoBean(objM1649Ujhhgtgfeyxiexzf);
                for (InterfaceC0617Ujhhgtgfeyxiexzf interfaceC0617Ujhhgtgfeyxiexzf : C2770feyxiexzfUjhhgtg.f8767Ujhhgtgfeyxiexzf) {
                    try {
                        for (C2767Ujhhgtgfeyxiexzf c2767Ujhhgtgfeyxiexzf : interfaceC0617Ujhhgtgfeyxiexzf.mo1791Ujhhgtgfeyxiexzf(msgInfoBean)) {
                            C0393Ujhhgtgfeyxiexzf c0393UjhhgtgfeyxiexzfM1648Ujhhgtgfeyxiexzf = ((C0393Ujhhgtgfeyxiexzf) c2065feyxiexzfUjhhgtg.getValue()).m1648Ujhhgtgfeyxiexzf();
                            c0393UjhhgtgfeyxiexzfM1648Ujhhgtgfeyxiexzf.m1940Ujhhgtgfeyxiexzf(obj10);
                            c0393UjhhgtgfeyxiexzfM1648Ujhhgtgfeyxiexzf.m1649Ujhhgtgfeyxiexzf(num, Integer.valueOf(c2767Ujhhgtgfeyxiexzf.f8760Ujhhgtgfeyxiexzf), 0, c2767Ujhhgtgfeyxiexzf.f8761Ujhhgtgfeyxiexzf, Integer.valueOf(c2767Ujhhgtgfeyxiexzf.f8762Ujhhgtgfeyxiexzf));
                        }
                    } catch (Exception e2) {
                        ArrayList arrayList5 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb2 = new StringBuilder();
                        String[] strArr13 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        sb2.append("onCreateMenuItems ");
                        sb2.append(interfaceC0617Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0617Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : "LoadHook");
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb2, " Failed", e2, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf6 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr14 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                int i11 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf4 = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf6);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf4.f10725Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(27);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf11 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg((View.OnLongClickListener) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf4.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                C2905Ujhhgtgfeyxiexzf.f9184Ujhhgtgfeyxiexzf.getClass();
                C2904feyxiexzfUjhhgtg c2904feyxiexzfUjhhgtg = C2904feyxiexzfUjhhgtg.f9183Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf11.f10724Ujhhgtgfeyxiexzf = AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(c2904feyxiexzfUjhhgtg);
                Object objM4938Ujhhgtgfeyxiexzf5 = ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf11)).m4938Ujhhgtgfeyxiexzf();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf12 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4938Ujhhgtgfeyxiexzf5).m2021Ujhhgtgfeyxiexzf();
                C2323Ujhhgtgfeyxiexzf.f7591Ujhhgtgfeyxiexzf.getClass();
                C2324Ujhhgtgfeyxiexzf c2324Ujhhgtgfeyxiexzf = C2324Ujhhgtgfeyxiexzf.f7592Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf12.f10724Ujhhgtgfeyxiexzf = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(c2324Ujhhgtgfeyxiexzf).getDeclaringClass();
                Object objM4938Ujhhgtgfeyxiexzf6 = ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf12.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf();
                C2911Ujhhgtgfeyxiexzf.f9190Ujhhgtgfeyxiexzf.getClass();
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf13 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(c2324Ujhhgtgfeyxiexzf).invoke(objM4938Ujhhgtgfeyxiexzf6, (Class) AbstractC2391Ujhhgtgfeyxiexzf.m3649feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C2910feyxiexzfUjhhgtg.f9189Ujhhgtgfeyxiexzf).getInterfaces()))).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf13.f10724Ujhhgtgfeyxiexzf = AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(c2904feyxiexzfUjhhgtg);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf14 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf13)).m4938Ujhhgtgfeyxiexzf()).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf14.f10724Ujhhgtgfeyxiexzf = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(c2324Ujhhgtgfeyxiexzf).getDeclaringClass();
                Object objM4938Ujhhgtgfeyxiexzf7 = ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf14.m4942Ujhhgtgfeyxiexzf())).m4938Ujhhgtgfeyxiexzf();
                C2907feyxiexzfUjhhgtg.f9186Ujhhgtgfeyxiexzf.getClass();
                Object objInvoke = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(c2324Ujhhgtgfeyxiexzf).invoke(objM4938Ujhhgtgfeyxiexzf7, (Class) AbstractC2391Ujhhgtgfeyxiexzf.m3649feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C2906Ujhhgtgfeyxiexzf.f9185Ujhhgtgfeyxiexzf).getInterfaces()));
                try {
                    c0919feyxiexzfUjhhgtg6 = c0578Ujhhgtgfeyxiexzf6.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg6 == null) {
                        c0919feyxiexzfUjhhgtg6 = null;
                    }
                } catch (Throwable th6) {
                    c0919feyxiexzfUjhhgtg6 = new C0919feyxiexzfUjhhgtg(th6);
                }
                MenuItem menuItem = (MenuItem) (c0919feyxiexzfUjhhgtg6 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg6);
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf6 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objInvoke).m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf6.f1479Ujhhgtgfeyxiexzf = "getItem";
                MsgInfoBean msgInfoBean2 = new MsgInfoBean(((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf6.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(Integer.valueOf(menuItem.getGroupId())));
                for (InterfaceC0617Ujhhgtgfeyxiexzf interfaceC0617Ujhhgtgfeyxiexzf2 : C2770feyxiexzfUjhhgtg.f8767Ujhhgtgfeyxiexzf) {
                    try {
                        for (C2767Ujhhgtgfeyxiexzf c2767Ujhhgtgfeyxiexzf2 : interfaceC0617Ujhhgtgfeyxiexzf2.mo1791Ujhhgtgfeyxiexzf(msgInfoBean2)) {
                            if (menuItem.getItemId() == c2767Ujhhgtgfeyxiexzf2.f8760Ujhhgtgfeyxiexzf) {
                                c2767Ujhhgtgfeyxiexzf2.f8763Ujhhgtgfeyxiexzf.mo1179Ujhhgtgfeyxiexzf(objM4938Ujhhgtgfeyxiexzf5, msgInfoBean2);
                            }
                        }
                    } catch (Exception e3) {
                        ArrayList arrayList6 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("onCreateMenuItems ");
                        sb3.append(interfaceC0617Ujhhgtgfeyxiexzf2 instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0617Ujhhgtgfeyxiexzf2).mo1479feyxiexzfUjhhgtg() : "LoadHook");
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb3, " Failed", e3, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg4 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr15 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg4.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.ui.chatting.viewitems");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf4 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf4.m1661feyxiexzfUjhhgtg("MicroMsg.ChattingItem", "context item select failed, null dataTag");
                c3452feyxiexzfUjhhgtg4.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf4;
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg5 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr16 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg5.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.ui.chatting.viewitems");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf5 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf5.m1661feyxiexzfUjhhgtg("MicroMsg.ChattingItem", "msg is null!");
                c3452feyxiexzfUjhhgtg5.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf5;
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf3 = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(View.OnLongClickListener.class);
                ConcurrentHashMap concurrentHashMap2 = AbstractC2842feyxiexzfUjhhgtg.f9028Ujhhgtgfeyxiexzf;
                zM4512Ujhhgtgfeyxiexzf = c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf3.mo2998Ujhhgtgfeyxiexzf().isAssignableFrom((Class) obj);
                break;
            case 28:
                C3433feyxiexzfUjhhgtg c3433feyxiexzfUjhhgtg = (C3433feyxiexzfUjhhgtg) obj;
                C2692Ujhhgtgfeyxiexzf c2692Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(29);
                c3433feyxiexzfUjhhgtg.getClass();
                C3426feyxiexzfUjhhgtg c3426feyxiexzfUjhhgtg = new C3426feyxiexzfUjhhgtg();
                c2692Ujhhgtgfeyxiexzf.invoke(c3426feyxiexzfUjhhgtg);
                List arrayList7 = c3433feyxiexzfUjhhgtg.f10699Ujhhgtgfeyxiexzf;
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                }
                c3433feyxiexzfUjhhgtg.f10699Ujhhgtgfeyxiexzf = arrayList7;
                arrayList7.add(c3426feyxiexzfUjhhgtg);
                C2771Ujhhgtgfeyxiexzf c2771Ujhhgtgfeyxiexzf = new C2771Ujhhgtgfeyxiexzf(null == true ? 1 : 0);
                C3426feyxiexzfUjhhgtg c3426feyxiexzfUjhhgtg2 = new C3426feyxiexzfUjhhgtg();
                c2771Ujhhgtgfeyxiexzf.invoke(c3426feyxiexzfUjhhgtg2);
                List arrayList8 = c3433feyxiexzfUjhhgtg.f10699Ujhhgtgfeyxiexzf;
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                }
                c3433feyxiexzfUjhhgtg.f10699Ujhhgtgfeyxiexzf = arrayList8;
                arrayList8.add(c3426feyxiexzfUjhhgtg2);
                return c1943Ujhhgtgfeyxiexzf;
            default:
                C3426feyxiexzfUjhhgtg c3426feyxiexzfUjhhgtg3 = (C3426feyxiexzfUjhhgtg) obj;
                String str6 = "convertView";
                c3426feyxiexzfUjhhgtg3.getClass();
                c3426feyxiexzfUjhhgtg3.f10689Ujhhgtgfeyxiexzf = new C1155feyxiexzfUjhhgtg(str6, 5, false);
                return c1943Ujhhgtgfeyxiexzf;
        }
        return Boolean.valueOf(zM4512Ujhhgtgfeyxiexzf);
    }

    public /* synthetic */ C2692Ujhhgtgfeyxiexzf(Context context) {
        this.f8589Ujhhgtgfeyxiexzf = 14;
    }
}
