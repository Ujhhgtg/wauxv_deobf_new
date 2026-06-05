package p000;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2320Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7588Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2320Ujhhgtgfeyxiexzf(int i) {
        this.f7588Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IllegalAccessException, JSONException, InvocationTargetException {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        Object c0919feyxiexzfUjhhgtg4;
        Object c0919feyxiexzfUjhhgtg5;
        Object c0919feyxiexzfUjhhgtg6;
        Object c0919feyxiexzfUjhhgtg7;
        int i = this.f7588Ujhhgtgfeyxiexzf;
        int i2 = 3;
        int i3 = 6;
        int iIntValue = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[2];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                Integer num = (Integer) c0919feyxiexzfUjhhgtg;
                iIntValue = num != null ? num.intValue() : 0;
                if (iIntValue == 0 || iIntValue == 1) {
                    c0578Ujhhgtgfeyxiexzf.m1853Ujhhgtgfeyxiexzf(null);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_anti_sns_delete, null, false);
                int i4 = R.id.moduleDialogEdtAntiSnsDeleteTip;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtAntiSnsDeleteTip);
                if (textInputEditText != null) {
                    i4 = R.id.moduleDialogInputAntiSnsDeleteTip;
                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputAntiSnsDeleteTip)) != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                        C0319Ujhhgtgfeyxiexzf c0319Ujhhgtgfeyxiexzf = new C0319Ujhhgtgfeyxiexzf(linearLayout, textInputEditText, 1);
                        textInputEditText.setText(C2327Ujhhgtgfeyxiexzf.f7599Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                        C2328Ujhhgtgfeyxiexzf.f7600Ujhhgtgfeyxiexzf.getClass();
                        c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C2328Ujhhgtgfeyxiexzf.f7602Ujhhgtgfeyxiexzf;
                        c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                        c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928896690703828362L, strArr), new C2977Ujhhgtgfeyxiexzf(2, c0319Ujhhgtgfeyxiexzf));
                        AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928819922458379658L, strArr).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i4)));
            case 2:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2320Ujhhgtgfeyxiexzf(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928216565452637578L, strArr2));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928216410833814922L, strArr2), MagicFactory.get(4928216380769043850L, strArr2));
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2320Ujhhgtgfeyxiexzf(i3);
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
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
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                String str = (String) (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg3);
                JSONObject jSONObject = new JSONObject(str != null ? str : "");
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(jSONObject.get(MagicFactory.get(4928455576087692682L, strArr3)), MagicFactory.get(4928455537432987018L, strArr3))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(MagicFactory.get(4928455601857496458L, strArr3));
                    jSONObject2.put(MagicFactory.get(4928455717821613450L, strArr3), MagicFactory.get(4928455670576973194L, strArr3));
                    jSONObject.put(MagicFactory.get(4928455666282005898L, strArr3), jSONObject2);
                    new C2501feyxiexzfUjhhgtg(1, 6, c0578Ujhhgtgfeyxiexzf2).m3786Ujhhgtgfeyxiexzf(jSONObject.toString());
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2320Ujhhgtgfeyxiexzf(7));
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1663feyxiexzfUjhhgtg(MagicFactory.get(4928455782246122890L, strArr4), MagicFactory.get(4928455816605861258L, strArr4));
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2320Ujhhgtgfeyxiexzf(10);
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1851Ujhhgtgfeyxiexzf();
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2320Ujhhgtgfeyxiexzf(11));
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928458904687347082L, strArr5), MagicFactory.get(4928459132320613770L, strArr5));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2320Ujhhgtgfeyxiexzf(13);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2320Ujhhgtgfeyxiexzf(15));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf3.getClass();
                new C2501feyxiexzfUjhhgtg(6, 6, c0578Ujhhgtgfeyxiexzf3).m3786Ujhhgtgfeyxiexzf(9999);
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928457556067616138L, strArr6), MagicFactory.get(4928457779405915530L, strArr6));
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf4.getClass();
                try {
                    c0919feyxiexzfUjhhgtg4 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg4 == null) {
                        c0919feyxiexzfUjhhgtg4 = null;
                    }
                } catch (Throwable th4) {
                    c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th4);
                }
                if (c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg4 = null;
                }
                String str2 = (String) c0919feyxiexzfUjhhgtg4;
                String str3 = str2 == null ? "" : str2;
                try {
                    c0919feyxiexzfUjhhgtg5 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg5 == null) {
                        c0919feyxiexzfUjhhgtg5 = null;
                    }
                } catch (Throwable th5) {
                    c0919feyxiexzfUjhhgtg5 = new C0919feyxiexzfUjhhgtg(th5);
                }
                String str4 = (String) (c0919feyxiexzfUjhhgtg5 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg5);
                String str5 = str4 != null ? str4 : "";
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (str3.equals(MagicFactory.get(4928372567254762890L, strArr7))) {
                    C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg = new C2501feyxiexzfUjhhgtg(1, 6, c0578Ujhhgtgfeyxiexzf4);
                    JSONObject jSONObject3 = new JSONObject(str5);
                    jSONObject3.put(MagicFactory.get(4928372627384305034L, strArr7), 60);
                    jSONObject3.put(MagicFactory.get(4928372588729599370L, strArr7), 1);
                    c2501feyxiexzfUjhhgtg.m3786Ujhhgtgfeyxiexzf(jSONObject3.toString());
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C2320Ujhhgtgfeyxiexzf(18);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C2320Ujhhgtgfeyxiexzf(19);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C2320Ujhhgtgfeyxiexzf(20));
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg2);
                Class<String> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : String.class);
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1662feyxiexzfUjhhgtg(0);
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928258226635408778L, strArr8), MagicFactory.get(4928258192275670410L, strArr8), MagicFactory.get(4928258166505866634L, strArr8), MagicFactory.get(4928258269585081738L, strArr8), MagicFactory.get(4928258235225343370L, strArr8), MagicFactory.get(4928258312534754698L, strArr8), MagicFactory.get(4928258389844166026L, strArr8), MagicFactory.get(4928258480038479242L, strArr8));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2320Ujhhgtgfeyxiexzf(22);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C2320Ujhhgtgfeyxiexzf(23));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928265498015040906L, strArr9), MagicFactory.get(4928265549554648458L, strArr9));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2320Ujhhgtgfeyxiexzf(25);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg3.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928260460018402698L, strArr10));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928261190162843018L, strArr10), MagicFactory.get(4928260275334808970L, strArr10));
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                View view = (View) obj;
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf(view, R.layout.module_dialog_auto_clean, null, false);
                int i5 = R.id.moduleDialogEdtAutoCleanCycle;
                TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtAutoCleanCycle);
                if (textInputEditText2 != null) {
                    i5 = R.id.moduleDialogInputAutoCleanCycle;
                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputAutoCleanCycle)) != null) {
                        i5 = R.id.moduleDialogRvAutoCleanConfig;
                        RecyclerView recyclerView = (RecyclerView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogRvAutoCleanConfig);
                        if (recyclerView != null) {
                            LinearLayout linearLayout2 = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf2;
                            C0319Ujhhgtgfeyxiexzf c0319Ujhhgtgfeyxiexzf2 = new C0319Ujhhgtgfeyxiexzf(linearLayout2, textInputEditText2, recyclerView);
                            textInputEditText2.setText(String.valueOf(C2552feyxiexzfUjhhgtg.f8279Ujhhgtgfeyxiexzf.m4620Ujhhgtgfeyxiexzf()));
                            view.getContext();
                            recyclerView.setLayoutManager(new GridLayoutManager());
                            C2823feyxiexzfUjhhgtg c2823feyxiexzfUjhhgtg = new C2823feyxiexzfUjhhgtg(AbstractC2832feyxiexzfUjhhgtg.m4157Ujhhgtgfeyxiexzf(), C2551feyxiexzfUjhhgtg.f8278Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf());
                            recyclerView.setAdapter(c2823feyxiexzfUjhhgtg);
                            C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                            RunnableC2555feyxiexzfUjhhgtg.f8282Ujhhgtgfeyxiexzf.getClass();
                            c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = RunnableC2555feyxiexzfUjhhgtg.f8284Ujhhgtgfeyxiexzf;
                            c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = linearLayout2;
                            c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928899684296033674L, strArr11), new C2550feyxiexzfUjhhgtg(c0319Ujhhgtgfeyxiexzf2, 0, c2823feyxiexzfUjhhgtg));
                            AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                            return c1943Ujhhgtgfeyxiexzf;
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928820059897333130L, strArr11).concat(viewM2416Ujhhgtgfeyxiexzf2.getResources().getResourceName(i5)));
            case 27:
                return Boolean.valueOf(C2551feyxiexzfUjhhgtg.f8278Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf().contains(((C2831feyxiexzfUjhhgtg) obj).f8998Ujhhgtgfeyxiexzf));
            case 28:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2556feyxiexzfUjhhgtg(iIntValue);
                return c1943Ujhhgtgfeyxiexzf;
            default:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf5 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf5.getClass();
                try {
                    c0919feyxiexzfUjhhgtg6 = c0578Ujhhgtgfeyxiexzf5.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg6 == null) {
                        c0919feyxiexzfUjhhgtg6 = null;
                    }
                } catch (Throwable th6) {
                    c0919feyxiexzfUjhhgtg6 = new C0919feyxiexzfUjhhgtg(th6);
                }
                if (c0919feyxiexzfUjhhgtg6 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg6 = null;
                }
                Boolean bool = (Boolean) c0919feyxiexzfUjhhgtg6;
                if (!(bool != null ? bool.booleanValue() : false)) {
                    try {
                        c0919feyxiexzfUjhhgtg7 = c0578Ujhhgtgfeyxiexzf5.m1848Ujhhgtgfeyxiexzf()[0];
                        if (c0919feyxiexzfUjhhgtg7 == null) {
                            c0919feyxiexzfUjhhgtg7 = null;
                        }
                    } catch (Throwable th7) {
                        c0919feyxiexzfUjhhgtg7 = new C0919feyxiexzfUjhhgtg(th7);
                    }
                    Object obj2 = c0919feyxiexzfUjhhgtg7 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg7;
                    int i6 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj2).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928353811132581258L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf);
                    String str6 = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf();
                    C3517Ujhhgtgfeyxiexzf.f10969Ujhhgtgfeyxiexzf.getClass();
                    Method methodM3154feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3518Ujhhgtgfeyxiexzf.f10970Ujhhgtgfeyxiexzf);
                    C1104feyxiexzfUjhhgtg.f4199Ujhhgtgfeyxiexzf.getClass();
                    methodM3154feyxiexzfUjhhgtg.invoke(C1104feyxiexzfUjhhgtg.m2574feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3522Ujhhgtgfeyxiexzf.f11005Ujhhgtgfeyxiexzf).getDeclaringClass()), str6);
                }
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
