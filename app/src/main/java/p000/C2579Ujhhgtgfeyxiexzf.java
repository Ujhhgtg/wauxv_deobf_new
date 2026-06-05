package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Ujhhgtgfeyxiexzf;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱUjhhgtgᛱ要点脸ᛴᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2579Ujhhgtgfeyxiexzf implements InterfaceC0441Ujhhgtgfeyxiexzf, InterfaceC3595feyxiexzfUjhhgtg, InterfaceC0075Ujhhgtgfeyxiexzf, EventListener.Factory {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ Object f8346Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2579Ujhhgtgfeyxiexzf(Object obj) {
        this.f8346Ujhhgtgfeyxiexzf = obj;
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f8346Ujhhgtgfeyxiexzf, call);
    }

    @Override // p000.InterfaceC3595feyxiexzfUjhhgtg
    public Object get() {
        return new C3609feyxiexzfUjhhgtg((Ujhhgtgfeyxiexzf) this.f8346Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m3831Ujhhgtgfeyxiexzf(com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf) {
        int i;
        Drawable.ConstantState constantState;
        Drawable.ConstantState constantState2;
        final C3677feyxiexzfUjhhgtg c3677feyxiexzfUjhhgtg = (C3677feyxiexzfUjhhgtg) this.f8346Ujhhgtgfeyxiexzf;
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = c3677feyxiexzfUjhhgtg.f11683Ujhhgtgfeyxiexzf;
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg2 = c3677feyxiexzfUjhhgtg.f11685Ujhhgtgfeyxiexzf;
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg3 = c3677feyxiexzfUjhhgtg.f11684Ujhhgtgfeyxiexzf;
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg4 = c3677feyxiexzfUjhhgtg.f11686Ujhhgtgfeyxiexzf;
        RelativeLayout relativeLayout = ((C0400Ujhhgtgfeyxiexzf) ujhhgtgfeyxiexzf).f2179feyxiexzfUjhhgtg.f2155Ujhhgtgfeyxiexzf;
        final int i2 = 0;
        relativeLayout.setVisibility(0);
        relativeLayout.addView(c3677feyxiexzfUjhhgtg.m5364Ujhhgtgfeyxiexzf(), new RelativeLayout.LayoutParams(-1, -2));
        c3677feyxiexzfUjhhgtg.m5364Ujhhgtgfeyxiexzf().removeViewAt(3);
        LinearLayout linearLayoutM5364Ujhhgtgfeyxiexzf = c3677feyxiexzfUjhhgtg.m5364Ujhhgtgfeyxiexzf();
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg5 = c3677feyxiexzfUjhhgtg.f11681Ujhhgtgfeyxiexzf;
        linearLayoutM5364Ujhhgtgfeyxiexzf.addView((LinearLayout) c2065feyxiexzfUjhhgtg5.getValue(), 3);
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg6 = c3677feyxiexzfUjhhgtg.f11682Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = (RecyclerView) c2065feyxiexzfUjhhgtg6.getValue();
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf();
        final int i3 = 1;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        C3662feyxiexzfUjhhgtg c3662feyxiexzfUjhhgtg = c3677feyxiexzfUjhhgtg.f11689Ujhhgtgfeyxiexzf;
        if (c3662feyxiexzfUjhhgtg.f3111Ujhhgtgfeyxiexzf.m2130Ujhhgtgfeyxiexzf()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        c3662feyxiexzfUjhhgtg.f3112Ujhhgtgfeyxiexzf = true;
        ((RecyclerView) c2065feyxiexzfUjhhgtg6.getValue()).setAdapter(c3677feyxiexzfUjhhgtg.f11689Ujhhgtgfeyxiexzf);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg = c3677feyxiexzfUjhhgtg.f11678Ujhhgtgfeyxiexzf;
        C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg2 = null;
        if (c3678feyxiexzfUjhhgtg == null) {
            MagicFactory.get(4928466184656913802L, strArr);
            c3678feyxiexzfUjhhgtg = null;
        }
        ((EditText) c2065feyxiexzfUjhhgtg.getValue()).setHint(c3678feyxiexzfUjhhgtg.f11695Ujhhgtgfeyxiexzf);
        ((EditText) c2065feyxiexzfUjhhgtg.getValue()).addTextChangedListener(new C2737Ujhhgtgfeyxiexzf(i3, c3677feyxiexzfUjhhgtg));
        C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg3 = c3677feyxiexzfUjhhgtg.f11678Ujhhgtgfeyxiexzf;
        if (c3678feyxiexzfUjhhgtg3 == null) {
            MagicFactory.get(4928466300621030794L, strArr);
            c3678feyxiexzfUjhhgtg3 = null;
        }
        ((Button) c2065feyxiexzfUjhhgtg3.getValue()).setText(c3678feyxiexzfUjhhgtg3.f11697Ujhhgtgfeyxiexzf);
        int i4 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg((Button) c2065feyxiexzfUjhhgtg2.getValue()).m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928466279146194314L, strArr);
        Class cls = Integer.TYPE;
        C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls)}, 1, c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf);
        C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg4 = c3677feyxiexzfUjhhgtg.f11678Ujhhgtgfeyxiexzf;
        if (c3678feyxiexzfUjhhgtg4 == null) {
            MagicFactory.get(4928465248354043274L, strArr);
            c3678feyxiexzfUjhhgtg4 = null;
        }
        c0393Ujhhgtgfeyxiexzf.m1649Ujhhgtgfeyxiexzf(Integer.valueOf(c3678feyxiexzfUjhhgtg4.f11696Ujhhgtgfeyxiexzf));
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg((Button) c2065feyxiexzfUjhhgtg3.getValue()).m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928465226879206794L, strArr);
        C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf2 = (C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls)}, 1, c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2);
        C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg5 = c3677feyxiexzfUjhhgtg.f11678Ujhhgtgfeyxiexzf;
        if (c3678feyxiexzfUjhhgtg5 == null) {
            MagicFactory.get(4928465295598683530L, strArr);
            c3678feyxiexzfUjhhgtg5 = null;
        }
        c0393Ujhhgtgfeyxiexzf2.m1649Ujhhgtgfeyxiexzf(Integer.valueOf(c3678feyxiexzfUjhhgtg5.f11698Ujhhgtgfeyxiexzf));
        C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg6 = c3677feyxiexzfUjhhgtg.f11678Ujhhgtgfeyxiexzf;
        if (c3678feyxiexzfUjhhgtg6 == null) {
            MagicFactory.get(4928465411562800522L, strArr);
            c3678feyxiexzfUjhhgtg6 = null;
        }
        ((Button) c2065feyxiexzfUjhhgtg3.getValue()).setOnClickListener(new ViewOnClickListenerC3674feyxiexzfUjhhgtg(c3678feyxiexzfUjhhgtg6.f11700Ujhhgtgfeyxiexzf, i2, c3677feyxiexzfUjhhgtg));
        C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg7 = c3677feyxiexzfUjhhgtg.f11678Ujhhgtgfeyxiexzf;
        if (c3678feyxiexzfUjhhgtg7 == null) {
            MagicFactory.get(4928465390087964042L, strArr);
            c3678feyxiexzfUjhhgtg7 = null;
        }
        ((Button) c2065feyxiexzfUjhhgtg2.getValue()).setText(c3678feyxiexzfUjhhgtg7.f11699Ujhhgtgfeyxiexzf);
        C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg8 = c3677feyxiexzfUjhhgtg.f11678Ujhhgtgfeyxiexzf;
        if (c3678feyxiexzfUjhhgtg8 == null) {
            MagicFactory.get(4928465368613127562L, strArr);
            c3678feyxiexzfUjhhgtg8 = null;
        }
        ((Button) c2065feyxiexzfUjhhgtg2.getValue()).setOnClickListener(new ViewOnClickListenerC3674feyxiexzfUjhhgtg(c3678feyxiexzfUjhhgtg8.f11701Ujhhgtgfeyxiexzf, i3, c3677feyxiexzfUjhhgtg));
        RadioGroup radioGroup = (RadioGroup) c2065feyxiexzfUjhhgtg4.getValue();
        int childCount = radioGroup.getChildCount();
        int i5 = 0;
        while (true) {
            i = R.id.rbAll;
            if (i5 >= childCount) {
                break;
            }
            View childAt = radioGroup.getChildAt(i5);
            if (childAt.getId() != R.id.rbAll) {
                childAt.setVisibility(8);
            }
            i5++;
        }
        C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg9 = c3677feyxiexzfUjhhgtg.f11678Ujhhgtgfeyxiexzf;
        if (c3678feyxiexzfUjhhgtg9 == null) {
            MagicFactory.get(4928465484577244554L, strArr);
            c3678feyxiexzfUjhhgtg9 = null;
        }
        for (String str : AbstractC2856feyxiexzfUjhhgtg.m4253feyxiexzfUjhhgtg(c3678feyxiexzfUjhhgtg9.f11693Ujhhgtgfeyxiexzf.keySet())) {
            RadioButton radioButton = (RadioButton) ((RadioGroup) c2065feyxiexzfUjhhgtg4.getValue()).findViewById(i);
            C2352Ujhhgtgfeyxiexzf c2352Ujhhgtgfeyxiexzf = new C2352Ujhhgtgfeyxiexzf(radioButton.getContext(), null);
            c2352Ujhhgtgfeyxiexzf.setTextColor(radioButton.getTextColors());
            c2352Ujhhgtgfeyxiexzf.setTextSize(radioButton.getTextSize() / c2352Ujhhgtgfeyxiexzf.getResources().getDisplayMetrics().scaledDensity);
            c2352Ujhhgtgfeyxiexzf.setButtonTintList(radioButton.getButtonTintList());
            c2352Ujhhgtgfeyxiexzf.setLayoutParams(radioButton.getLayoutParams());
            c2352Ujhhgtgfeyxiexzf.setPadding(c2352Ujhhgtgfeyxiexzf.getPaddingLeft(), c2352Ujhhgtgfeyxiexzf.getPaddingTop(), c2352Ujhhgtgfeyxiexzf.getPaddingRight(), c2352Ujhhgtgfeyxiexzf.getPaddingBottom());
            c2352Ujhhgtgfeyxiexzf.setGravity(radioButton.getGravity());
            Drawable buttonDrawable = radioButton.getButtonDrawable();
            c2352Ujhhgtgfeyxiexzf.setButtonDrawable((buttonDrawable == null || (constantState2 = buttonDrawable.getConstantState()) == null) ? null : constantState2.newDrawable());
            Drawable background = radioButton.getBackground();
            c2352Ujhhgtgfeyxiexzf.setBackground((background == null || (constantState = background.getConstantState()) == null) ? null : constantState.newDrawable());
            c2352Ujhhgtgfeyxiexzf.setText(str);
            ((RadioGroup) c2065feyxiexzfUjhhgtg4.getValue()).addView(c2352Ujhhgtgfeyxiexzf);
            i = R.id.rbAll;
        }
        C3662feyxiexzfUjhhgtg c3662feyxiexzfUjhhgtg2 = c3677feyxiexzfUjhhgtg.f11689Ujhhgtgfeyxiexzf;
        C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg10 = c3677feyxiexzfUjhhgtg.f11678Ujhhgtgfeyxiexzf;
        if (c3678feyxiexzfUjhhgtg10 == null) {
            MagicFactory.get(4928465463102408074L, strArr);
        } else {
            c3678feyxiexzfUjhhgtg2 = c3678feyxiexzfUjhhgtg10;
        }
        ArrayList arrayList = c3678feyxiexzfUjhhgtg2.f11692Ujhhgtgfeyxiexzf;
        if (!c3678feyxiexzfUjhhgtg2.f11691Ujhhgtgfeyxiexzf || arrayList.isEmpty()) {
            arrayList = c3678feyxiexzfUjhhgtg2.f11694Ujhhgtgfeyxiexzf;
        }
        C3662feyxiexzfUjhhgtg.m5358Ujhhgtgfeyxiexzf(c3662feyxiexzfUjhhgtg2, arrayList);
        c3677feyxiexzfUjhhgtg.m5367Ujhhgtgfeyxiexzf();
        c3677feyxiexzfUjhhgtg.m5365Ujhhgtgfeyxiexzf();
        ((CheckBox) c3677feyxiexzfUjhhgtg.f11687Ujhhgtgfeyxiexzf.getValue()).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                switch (i2) {
                    case 0:
                        if (compoundButton.isPressed()) {
                            C3677feyxiexzfUjhhgtg c3677feyxiexzfUjhhgtg2 = c3677feyxiexzfUjhhgtg;
                            List<C3663feyxiexzfUjhhgtg> list = c3677feyxiexzfUjhhgtg2.f11689Ujhhgtgfeyxiexzf.f11655Ujhhgtgfeyxiexzf;
                            ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
                            for (C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg : list) {
                                c3663feyxiexzfUjhhgtg.f11660Ujhhgtgfeyxiexzf = z;
                                arrayList2.add(c3663feyxiexzfUjhhgtg);
                            }
                            c3677feyxiexzfUjhhgtg2.f11689Ujhhgtgfeyxiexzf.m2137Ujhhgtgfeyxiexzf();
                        }
                        break;
                    default:
                        if (z) {
                            AbstractC0615Ujhhgtgfeyxiexzf.m1889Ujhhgtgfeyxiexzf(c3677feyxiexzfUjhhgtg, new C2925Ujhhgtgfeyxiexzf(4, compoundButton));
                        }
                        break;
                }
            }
        });
        RadioGroup radioGroup2 = (RadioGroup) c2065feyxiexzfUjhhgtg4.getValue();
        int childCount2 = radioGroup2.getChildCount();
        while (i2 < childCount2) {
            View childAt2 = radioGroup2.getChildAt(i2);
            if (childAt2 instanceof RadioButton) {
                ((RadioButton) childAt2).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        switch (i3) {
                            case 0:
                                if (compoundButton.isPressed()) {
                                    C3677feyxiexzfUjhhgtg c3677feyxiexzfUjhhgtg2 = c3677feyxiexzfUjhhgtg;
                                    List<C3663feyxiexzfUjhhgtg> list = c3677feyxiexzfUjhhgtg2.f11689Ujhhgtgfeyxiexzf.f11655Ujhhgtgfeyxiexzf;
                                    ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list, 10));
                                    for (C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg : list) {
                                        c3663feyxiexzfUjhhgtg.f11660Ujhhgtgfeyxiexzf = z;
                                        arrayList2.add(c3663feyxiexzfUjhhgtg);
                                    }
                                    c3677feyxiexzfUjhhgtg2.f11689Ujhhgtgfeyxiexzf.m2137Ujhhgtgfeyxiexzf();
                                }
                                break;
                            default:
                                if (z) {
                                    AbstractC0615Ujhhgtgfeyxiexzf.m1889Ujhhgtgfeyxiexzf(c3677feyxiexzfUjhhgtg, new C2925Ujhhgtgfeyxiexzf(4, compoundButton));
                                }
                                break;
                        }
                    }
                });
            }
            i2++;
        }
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        ((LinearLayout) c2065feyxiexzfUjhhgtg5.getValue()).getLayoutParams().height = C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf().getResources().getDisplayMetrics().heightPixels / 2;
    }

    @Override // p000.InterfaceC0075Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public void mo1115Ujhhgtgfeyxiexzf(View view, String str) {
        C1019feyxiexzfUjhhgtg c1019feyxiexzfUjhhgtg = (C1019feyxiexzfUjhhgtg) this.f8346Ujhhgtgfeyxiexzf;
        Uri uri = Uri.parse(str);
        Context context = c1019feyxiexzfUjhhgtg.f3986Ujhhgtgfeyxiexzf;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        Intent intent = new Intent(MagicFactory.get(4928464247626663306L, strArr), uri);
        intent.putExtra(MagicFactory.get(4928464269101499786L, strArr), c1019feyxiexzfUjhhgtg.f3986Ujhhgtgfeyxiexzf.getPackageName());
        context.startActivity(intent);
    }
}
