package p000;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲇᛸᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1961 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ArrayList f6480;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final DialogXBaseRelativeLayout f6481;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final MaxRelativeLayout f6482;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final TextView f6483;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public InterfaceC2637 f6484;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final TextView f6485;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ViewGroup f6486;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final RelativeLayout f6487;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final EditText f6488;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final LinearLayout f6489;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final TextView f6490;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final View f6491;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final View f6492;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final TextView f6493;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final TextView f6494;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ C1962 f6495;

    public C1961(C1962 c1962, View view) {
        this.f6495 = c1962;
        if (view == null) {
            return;
        }
        c1962.getClass();
        c1962.f909 = new WeakReference(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f6481 = dialogXBaseRelativeLayout;
        this.f6482 = (MaxRelativeLayout) view.findViewById(R.id.bkg);
        TextView textView = (TextView) view.findViewById(R.id.txt_dialog_title);
        this.f6483 = textView;
        this.f6484 = (InterfaceC2637) view.findViewById(R.id.scrollView);
        TextView textView2 = (TextView) view.findViewById(R.id.txt_dialog_tip);
        this.f6485 = textView2;
        this.f6486 = (ViewGroup) view.findViewById(R.id.box_list);
        this.f6487 = (RelativeLayout) view.findViewById(R.id.box_custom);
        this.f6488 = (EditText) view.findViewById(R.id.txt_input);
        this.f6489 = (LinearLayout) view.findViewById(R.id.box_button);
        TextView textView3 = (TextView) view.findViewById(R.id.btn_selectOther);
        this.f6490 = textView3;
        this.f6491 = view.findViewById(R.id.space_other_button);
        this.f6492 = view.findViewWithTag("split");
        TextView textView4 = (TextView) view.findViewById(R.id.btn_selectNegative);
        this.f6493 = textView4;
        TextView textView5 = (TextView) view.findViewById(R.id.btn_selectPositive);
        this.f6494 = textView5;
        this.f6480 = AbstractC0027.m735(view);
        c1962.m753().setTranslationZ(0);
        AbstractC2205 abstractC2205 = AbstractC1034.f3778;
        TextPaint paint = textView.getPaint();
        int i = 1;
        paint.setFakeBoldText(true);
        textView4.getPaint().setFakeBoldText(true);
        textView5.getPaint().setFakeBoldText(true);
        textView3.getPaint().setFakeBoldText(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        dialogXBaseRelativeLayout.m763(0.0f);
        dialogXBaseRelativeLayout.m764(c1962.f6498);
        dialogXBaseRelativeLayout.f937 = new C0938(i, this);
        dialogXBaseRelativeLayout.f938 = new C1744(this);
        textView5.setOnClickListener(new ViewOnClickListenerC1959(this, 0));
        textView4.setOnClickListener(new ViewOnClickListenerC1959(this, i));
        textView3.setOnClickListener(new ViewOnClickListenerC1959(this, 2));
        c1962.f6511 = this;
        m3788();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3786(View view) {
        C1962 c1962 = this.f6495;
        c1962.getClass();
        if (view != null) {
            view.setEnabled(false);
        }
        if (c1962.m754() == null || c1962.f923) {
            return;
        }
        int i = 1;
        if (c1962.f6499 == null) {
            c1962.f6499 = new C0942(i, this);
        }
        C0942 c0942 = c1962.f6499;
        if (c0942 != null) {
            c1962.f923 = true;
            if (c0942 == null) {
                c1962.f6499 = new C0942(i, this);
            }
            c1962.f6499.m2436(c1962);
            RunnableC0141 runnableC0141 = new RunnableC0141(12, this);
            long jM3787 = m3787(null);
            if (jM3787 < 0) {
                return;
            }
            AbstractC2205 abstractC2205 = AbstractC1034.f3778;
            AbstractC0027.m738().postDelayed(runnableC0141, jM3787);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final long m3787(Animation animation) {
        if (animation == null) {
            MaxRelativeLayout maxRelativeLayout = this.f6482;
            if (maxRelativeLayout.getAnimation() != null) {
                animation = maxRelativeLayout.getAnimation();
            }
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = this.f6495.f920;
        return j != -1 ? j : duration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3788() {
        ?? r8;
        int color;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f6481;
        if (dialogXBaseRelativeLayout != null) {
            C1962 c1962 = this.f6495;
            Activity activityM754 = c1962.m754();
            AbstractC0027 abstractC0027 = c1962.f6498;
            AbstractC2205 abstractC2205 = c1962.f917;
            if (activityM754 == null) {
                return;
            }
            dialogXBaseRelativeLayout.f934 = c1962.f913;
            int[] iArr = c1962.f922;
            int i = 0;
            int i2 = iArr[0];
            int i3 = 1;
            int i4 = iArr[1];
            int i5 = 2;
            int i6 = iArr[2];
            int i7 = 3;
            int i8 = iArr[3];
            int[] iArr2 = dialogXBaseRelativeLayout.f949;
            iArr2[0] = i2;
            iArr2[1] = i4;
            iArr2[2] = i6;
            iArr2[3] = i8;
            AbstractC2205 abstractC2206 = AbstractC1034.f3778;
            MaxRelativeLayout maxRelativeLayout = this.f6482;
            maxRelativeLayout.getClass();
            int i9 = c1962.f921;
            if (i9 == 0) {
                i9 = 0;
            }
            if (i9 > 0) {
                maxRelativeLayout.f957 = i9;
            }
            maxRelativeLayout.setMinimumWidth(0);
            maxRelativeLayout.setMinimumHeight(0);
            View viewFindViewWithTag = dialogXBaseRelativeLayout.findViewWithTag("dialogx_editbox");
            boolean z = abstractC0027 instanceof C1643;
            EditText editText = this.f6488;
            if (z) {
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(0);
                }
                editText.setVisibility(0);
                if (editText != dialogXBaseRelativeLayout) {
                    dialogXBaseRelativeLayout.f945 = new WeakReference(editText);
                }
            } else {
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(8);
                }
                editText.setVisibility(8);
            }
            dialogXBaseRelativeLayout.setClickable(true);
            if (c1962.f6507 > -1.0f) {
                maxRelativeLayout.setOutlineProvider(new C0692(i3, this));
                maxRelativeLayout.setClipToOutline(true);
                ArrayList arrayList = this.f6480;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((View) it.next()).getClass();
                        throw new ClassCastException();
                    }
                }
            }
            CharSequence charSequence = c1962.f6501;
            if (charSequence == null) {
                charSequence = null;
            }
            AbstractC0027.m747(this.f6483, charSequence);
            AbstractC0027.m747(this.f6485, c1962.f6502);
            CharSequence charSequence2 = c1962.f6503;
            TextView textView = this.f6494;
            AbstractC0027.m747(textView, charSequence2);
            CharSequence charSequence3 = c1962.f6504;
            TextView textView2 = this.f6493;
            AbstractC0027.m747(textView2, charSequence3);
            CharSequence charSequence4 = c1962.f6505;
            TextView textView3 = this.f6490;
            AbstractC0027.m747(textView3, charSequence4);
            editText.setText(c1962.f6506);
            editText.setHint((CharSequence) null);
            View view = this.f6491;
            if (view != null) {
                if (c1962.f6505 == null) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
            LinearLayout linearLayout = this.f6489;
            if (linearLayout != null) {
                linearLayout.setVisibility(((textView2 == null || textView2.getVisibility() != 0) && (textView3 == null || textView3.getVisibility() != 0) && (textView == null || textView.getVisibility() != 0)) ? 8 : 0);
            }
            AbstractC0027.m743(c1962.f6503);
            AbstractC0027.m743(c1962.f6504);
            AbstractC0027.m743(c1962.f6505);
            View view2 = this.f6492;
            if (view2 != null) {
                c1962.m759();
                abstractC2205.getClass();
                if (AbstractC0027.m736() == null) {
                    AbstractC0027.m734("DialogX 未初始化(E7)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                    color = -16777216;
                } else {
                    color = c1962.m755().getColor(0);
                }
                view2.setBackgroundColor(color);
            }
            linearLayout.setOrientation(0);
            abstractC2205.mo3725();
            if (abstractC2205.mo3725().length != 0) {
                linearLayout.removeAllViews();
                int[] iArrMo3725 = abstractC2205.mo3725();
                int length = iArrMo3725.length;
                while (i < length) {
                    int i10 = iArrMo3725[i];
                    if (i10 == i3) {
                        linearLayout.addView(textView);
                        abstractC2205.mo3727();
                        textView.setBackgroundResource(abstractC2205.mo3727().mo3723(c1962.m759()));
                    } else if (i10 == i5) {
                        linearLayout.addView(textView2);
                        abstractC2205.mo3727();
                        textView2.setBackgroundResource(abstractC2205.mo3727().mo3722(c1962.m759()));
                    } else if (i10 == i7) {
                        linearLayout.addView(textView3);
                        abstractC2205.mo3727();
                        textView3.setBackgroundResource(abstractC2205.mo3727().mo3724(c1962.m759()));
                    } else if (i10 == 4) {
                        int i11 = i3;
                        if (linearLayout.getChildCount() >= i11 && linearLayout.getChildAt(linearLayout.getChildCount() - i11).getVisibility() != 8) {
                            Space space = new Space(c1962.m754());
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.weight = 1.0f;
                            linearLayout.addView(space, layoutParams);
                        }
                    } else if (i10 == 5 && linearLayout.getChildCount() >= i3 && linearLayout.getChildAt(linearLayout.getChildCount() - i3).getVisibility() != 8) {
                        View view3 = new View(c1962.m754());
                        Resources resourcesM755 = c1962.m755();
                        c1962.m759();
                        abstractC2205.getClass();
                        view3.setBackgroundColor(resourcesM755.getColor(0));
                        abstractC2205.getClass();
                        linearLayout.addView(view3, new LinearLayout.LayoutParams(1, -1));
                    }
                    i++;
                    i3 = 1;
                    i5 = 2;
                    i7 = 3;
                }
            }
            if (c1962.f6496) {
                if (c1962.mo3368()) {
                    dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC1959(this, 3));
                } else {
                    dialogXBaseRelativeLayout.setOnClickListener(null);
                }
                r8 = 0;
            } else {
                r8 = 0;
                dialogXBaseRelativeLayout.setClickable(false);
            }
            C2006 c2006 = c1962.f6497;
            RelativeLayout relativeLayout = this.f6487;
            if (c2006 == null || c2006.m3676() == null) {
                relativeLayout.setVisibility(8);
                return;
            }
            c1962.f6497.m3672(relativeLayout, abstractC0027);
            relativeLayout.setVisibility(r8);
            if (c1962.f6497.m3676() instanceof InterfaceC2637) {
                InterfaceC2637 interfaceC2637 = this.f6484;
                if (interfaceC2637 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC2637).setVerticalScrollBarEnabled(r8);
                }
                this.f6484 = (InterfaceC2637) c1962.f6497.m3676();
                return;
            }
            KeyEvent.Callback callbackFindViewWithTag = c1962.f6497.m3676().findViewWithTag("ScrollController");
            if (callbackFindViewWithTag instanceof InterfaceC2637) {
                InterfaceC2637 interfaceC2638 = this.f6484;
                if (interfaceC2638 instanceof DialogScrollView) {
                    ((DialogScrollView) interfaceC2638).setVerticalScrollBarEnabled(false);
                }
                this.f6484 = (InterfaceC2637) callbackFindViewWithTag;
            }
        }
    }
}
